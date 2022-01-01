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

package org.jpos.qrest;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jackson.JsonLoader;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import org.jdom2.Element;
import org.jpos.core.ConfigurationException;
import org.jpos.core.XmlConfigurable;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionParticipant;
import org.jpos.util.Caller;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Validate mandatory and optional parameters. Support JsonSchema.
 *
 * @author jr@jpos.org
 *
 * Sample usage:
 *
 *    &lt;participant class="org.jpos.rest.ValidateParams" logger="Q2" realm="validate-params"&gt;
 *      &lt;mandatory&gt;
 *        &lt;param name="version"&gt;"^1\.0$"&lt;/param&gt;
 *        &lt;param name="consumer"&gt;"^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$&lt;/param&gt;
 *      &lt;/mandatory&gt;
 *    &lt;/participant&gt;
 *
 *
 *    &lt;participant class="org.jpos.rest.ValidateParams" logger="Q2" realm="validate-params"&gt;
 *        &lt;mandatory&gt;
 *            &lt;param name="JSON_REQUEST" type="json-schema"&gt;
 *                {
 *                    "$schema": "http://json-schema.org/draft-04/schema#",
 *                    "title": "SysConfig",
 *                    "description": "A SysConfig to post",
 *                    "type": "object",
 *                    "properties": {
 *                        "id": {
 *                            "type": "string"
 *                        },
 *                        "value": {
 *                            "type": "string"
 *                        },
 *                        "readPerm": {
 *                            "type" : "string"
 *                        },
 *                        "writePerm": {
 *                            "type": "string"
 *                        }
 *                    },
 *                    "additionalProperties" : false,
 *                    "required": [ "id","value","readPerm","writePerm"]
 *                }
 *            &lt;/param&gt;
 *        &lt;/mandatory&gt;
 *    &lt;/participant&gt;
 *
 */

@SuppressWarnings("unused")
public class ValidateParams implements TransactionParticipant, XmlConfigurable {
    private Map<String,Pattern> mandatoryPathParams;
    private Map<String,Pattern> mandatoryQueryParams;
    private Map<String,Pattern> optionalQueryParams;
    private Map<String,JsonSchema> mandatoryJson;
    private Map<String,JsonSchema> optionalJson;

    @Override
    public int prepare(long id, Serializable context) {
        Context ctx = (Context) context;
        if (!checkMandatoryPathParams(ctx) ||
            !checkMandatoryQueryParams(ctx) ||
            !checkOptionalQueryParams(ctx) ||
            !checkMandatoryJson(ctx) ||
            !checkOptionalJson(ctx))
            return ABORTED | NO_JOIN | READONLY;
        return PREPARED | NO_JOIN | READONLY;
    }

    @Override
    public void commit(long id, Serializable context) { }

    @Override
    public void abort(long id, Serializable context) { }


    @SuppressWarnings("unchecked")
    @Override
    public void setConfiguration(Element cfg) throws ConfigurationException{
        mandatoryPathParams = new HashMap<>();
        mandatoryQueryParams = new HashMap<>();
        mandatoryJson = new HashMap<>();
        Element m = cfg.getChild("mandatory");
        if (m != null) {
            for (Element e : m.getChildren("param")) {
                if ("json-schema".equals(e.getAttributeValue("type"))) {
                    try {
                        String json = e.getValue();
                        JsonNode nodeSchema = JsonLoader.fromString(json);
                        JsonSchema schema = JsonSchemaFactory.byDefault().getJsonSchema(nodeSchema);
                        mandatoryJson.put(e.getAttributeValue("name"), schema);
                    } catch (Exception ex) {
                         throw new ConfigurationException(ex);
                    }
                } else if ("path".equals(e.getAttributeValue("type"))){
                    mandatoryPathParams.put(e.getAttributeValue("name"), Pattern.compile(e.getValue()));
                } else if ("query".equals(e.getAttributeValue("type"))) {
                    mandatoryQueryParams.put(e.getAttributeValue("name"), Pattern.compile(e.getValue()));
                } else {
                    throw new ConfigurationException("Misconfigured param: " +
                            e.getAttributeValue("name") + ". Type missing.");
                }
            }
        }
        optionalQueryParams = new HashMap<>();
        optionalJson = new HashMap<>();
        Element o = cfg.getChild("optional");
        if (o != null) {
            for (Element e : o.getChildren("param")) {
                if ("json-schema".equals(e.getAttributeValue("type"))) {
                    String json = e.getValue();
                    JsonNode nodeSchema;
                    try {
                        nodeSchema = JsonLoader.fromString(json);
                        JsonSchema schema = JsonSchemaFactory.byDefault().getJsonSchema(nodeSchema);
                        optionalJson.put(e.getAttributeValue("name"), schema);
                    } catch (IOException | ProcessingException ex) {
                        throw new ConfigurationException(ex);
                    }
                } else if ("path".equals(e.getAttributeValue("type"))){
                    throw new ConfigurationException("Misconfigured param: " +
                            e.getAttributeValue("name") + ". Path param cannot be optional.");
                } else {
                    optionalQueryParams.put(e.getAttributeValue("name"), Pattern.compile(e.getValue()));
                }
            }
        }
    }

    private boolean validParam(Context ctx, Map.Entry<String, Pattern> entry, String value) {
        Pattern p = entry.getValue();
        Matcher m = p.matcher(value);
        if (!m.matches()) {
            ctx.getResult().fail(ResultCode.BAD_REQUEST, Caller.info(), "Invalid param " + entry.getKey().toLowerCase());
            return false;
        }
        return true;
    }

    private boolean checkMandatoryPathParams (Context ctx) {
        Map<String,Object> pathParams = ctx.get(Constants.PATHPARAMS);
        for (Map.Entry<String,Pattern> entry : mandatoryPathParams.entrySet()) {
            Object v = pathParams.get(entry.getKey());
            String value = v != null ? v.toString() : null;
            if (value == null) {
                ctx.getResult().fail(ResultCode.BAD_REQUEST, Caller.info(), "Mandatory param " + entry.getKey().toLowerCase() + " not present");
                return false;
            }
            return validParam(ctx, entry, value);
        }
        return true;
    }

    private boolean checkMandatoryQueryParams (Context ctx) {
        Map<String,Object> queryParams = ctx.get(Constants.QUERYPARAMS);
        for (Map.Entry<String,Pattern> entry : mandatoryQueryParams.entrySet()) {
            Object v = queryParams.get(entry.getKey());
            String value = v != null ? v.toString() : null;
            if (value == null) {
                ctx.getResult().fail(ResultCode.BAD_REQUEST, Caller.info(), "Mandatory param " + entry.getKey().toLowerCase() + " not present");
                return false;
            }
            return validParam(ctx, entry, value);
        }
        return true;
    }

    private boolean checkOptionalQueryParams (Context ctx) {
        Map<String,Object> queryParams = ctx.get(Constants.QUERYPARAMS);
        for (Map.Entry<String,Pattern> entry : optionalQueryParams.entrySet()) {
            String value = (String) queryParams.get(entry.getKey());
            if (value != null) {
                return validParam(ctx, entry, value);
            }
        }
        return true;
    }

    private boolean checkMandatoryJson (Context ctx) {
        ctx.log ("Mandatory JSON: " + mandatoryJson);
        for (Map.Entry<String,JsonSchema> entry : mandatoryJson.entrySet()) {
            String value = ctx.getString(entry.getKey());
            ProcessingReport report;
            ctx.log ("Checking " + entry.getKey() + " value=" + value);
            if (value != null) {
                try {
                    JsonSchema schema = entry.getValue();
                    JsonNode node = JsonLoader.fromString(value);
                    report = schema.validate(node);
                } catch(Exception ex) {
                    ctx.getResult().fail(ResultCode.BAD_REQUEST, Caller.info(), ex.toString());
                    return false;
                }
                if (!report.isSuccess()) {
                    ctx.getResult().fail(ResultCode.BAD_REQUEST, Caller.info(), report.toString());
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkOptionalJson (Context ctx) {
        for (Map.Entry<String,JsonSchema> entry : optionalJson.entrySet()) {
            String value = ctx.getString(entry.getKey());
            ProcessingReport report;
            if (value != null) {
                try {
                    JsonSchema schema = entry.getValue();
                    JsonNode node = JsonLoader.fromString(value);
                    report = schema.validate(node);
                } catch(Exception ex) {
                    ctx.getResult().fail(ResultCode.BAD_REQUEST, Caller.info(), ex.toString());
                    return false;
                }
                if (!report.isSuccess()) {
                    ctx.getResult().fail(ResultCode.BAD_REQUEST, Caller.info(), report.toString());
                    return false;
                }
            }
        }
        return true;
    }
}
