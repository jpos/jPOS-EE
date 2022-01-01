/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2021 jPOS Software SRL
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.elasticsearch;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;

import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.core.TimeValue;
import org.elasticsearch.xcontent.XContentBuilder;
import org.elasticsearch.xcontent.XContentFactory;
import org.elasticsearch.xcontent.XContentType;

import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.q2.QBeanSupport;
import org.jpos.space.Space;
import org.jpos.space.SpaceFactory;
import org.jpos.util.NameRegistrar;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;
import java.util.UUID;

public class ElasticSearchService extends QBeanSupport implements Runnable {
    private RestHighLevelClient client;
    private String queue;
    private Space sp;
    private String indexname;

    public RestHighLevelClient getClient() {
        return client;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void run() {
        boolean stopping = false;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        while (running() && !stopping) {
            try {
                BulkRequest br = new BulkRequest();
                Object obj = sp.rd (queue);
                while ((obj = sp.inp (queue)) != null) {
                    SimpleDateFormat sdfat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
                    SimpleDateFormat sdfatufc = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                    sdfatufc.setTimeZone(TimeZone.getTimeZone("UTC"));

                    if (obj instanceof JSONObject) {
                        JSONObject jsonObject = (JSONObject) obj;
                        JSONObject jsonLog = jsonObject.getJSONObject("log");
                        String direction = jsonLog.keySet().stream().filter(item->item.matches("receive|send")).findAny().orElse("");
                        if(!jsonLog.isNull("lifespan")) {
                            jsonLog.put("lifespan-int", Integer.valueOf(jsonLog.get("lifespan").toString().replaceAll("ms", "")));
                        }

                        if(!jsonLog.isNull("at")) {
                            jsonObject.put("time-utc", sdfatufc.format(sdfat.parse(jsonLog.get("at").toString())));
                        }

                        if(direction!="") {
                            JSONObject receiveLog = jsonLog.getJSONObject(direction);
                            if(!receiveLog.isNull("isomsg")) {
                                jsonLog.put("direction", direction);
                                JSONObject isomsgLog = receiveLog.getJSONObject("isomsg");
                                JSONArray fieldLog = isomsgLog.getJSONArray("field");
                                for (int i = 0; i < fieldLog.length(); i++) {
                                    jsonLog.put("field" + fieldLog.getJSONObject(i).get("id"), fieldLog.getJSONObject(i).get("value"));
                                }
                                jsonLog.remove(direction);
                                jsonObject.put("action", direction + " message");
                            }
                        } else {
                            jsonObject.put("action", "logging");
                        }


                        IndexRequest req = new IndexRequest( indexname+"-"+sdf.format(new Date()))
                                .id(UUID.randomUUID().toString())
                                .source(jsonObject.toString(), XContentType.JSON)
                                .timeout(TimeValue.timeValueSeconds(5));

                        br.add(req);
                    } else {
                        stopping = true;
                        break;
                    }
                }
                if (br.estimatedSizeInBytes() > 0) {
                    BulkResponse bulkResponse = client.bulk(br, RequestOptions.DEFAULT);
                    if(bulkResponse.hasFailures()) {
                        getLog().warn (bulkResponse.buildFailureMessage());
                    }
                }
            } catch (IOException | ParseException e) {
                getLog().warn (e);
            }
        }
    }

    @Override
    protected void initService() {
//        String[] urls = cfg.getAll("url");
//        HttpHost[] hosts = new HttpHost[urls.length];
//        for (int i=0; i<hosts.length; i++) {
//            hosts[i] = HttpHost.create(urls[i]);
//        }

        HttpHost[] hosts = Arrays.stream(cfg.getAll("url")).map(HttpHost::create).toArray(HttpHost[]::new);
        RestClientBuilder builder = RestClient.builder(hosts);

        String user = cfg.get("user", null);
        String password = cfg.get("password", null);

        if (user != null && password !=null) {
            CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
            credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(user, password));
            builder.setHttpClientConfigCallback(httpClientBuilder -> httpClientBuilder
                    .setDefaultCredentialsProvider(credentialsProvider));
        }
        client = new RestHighLevelClient(builder);
        NameRegistrar.register(getName(), this);
    }

    @Override
    protected void startService() {
        if (queue != null)
            new Thread(this, getName()).start();
        try {
            index("start");
        } catch (Exception e) {
            getLog().warn(e);
        }
    }

    @Override
    protected void stopService() {
        try {
            if (queue != null)
                sp.out (queue, Boolean.FALSE);

            index("stop");
            client.close();
        } catch (IOException e) {
            getLog().warn(e);
        }
    }

    @Override
    protected void destroyService() {
        NameRegistrar.unregister(getName());
    }

    @Override
    public void setConfiguration (Configuration cfg) throws ConfigurationException {
        super.setConfiguration(cfg);
        queue = cfg.get("queue", null);
        this.indexname = cfg.get("index-name", "jpos");
        if (queue != null) {
            sp = SpaceFactory.getSpace(cfg.get("space"));
        }
    }

    private void index(String action) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        XContentBuilder builder = XContentFactory.jsonBuilder();
        builder.startObject();
        {
            builder.field("instance", getServer().getInstanceId().toString());
            builder.timeField("time", new Date());
            builder.field("action", action);
        }

        builder.endObject();
        IndexRequest req = new IndexRequest(this.indexname +"-"+sdf.format(new Date()))
                .id(UUID.randomUUID().toString())
                .source(builder)
                .timeout(TimeValue.timeValueSeconds(5)
                );
        client.index(req, RequestOptions.DEFAULT);
    }
}
