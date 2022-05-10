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

package org.jpos.rest;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jackson.JsonLoader;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import org.jdom2.Element;
import org.jpos.core.ConfigurationException;
import org.jpos.core.XmlConfigurable;
import org.jpos.ee.BLException;
import org.jpos.transaction.Context;
import org.jpos.transaction.TxnSupport;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
public class ValidateParams extends TxnSupport implements XmlConfigurable {
    Map<String,Pattern> mandatory;
    Map<String,Pattern> optional;
    Map<String,JsonSchema> mandatoryJson;
    Map<String,JsonSchema> optionalJson;

    @Override
    protected int doPrepare(long id, Context ctx) throws BLException {
        checkMandatory(ctx);
        checkOptional(ctx);
        checkMandatoryJson(ctx);
        checkOptionalJson(ctx);
        return PREPARED | NO_JOIN | READONLY;
    }

    @Override
    public void commit(long id, Serializable context) { }

    @Override
    public void abort(long id, Serializable context) { }


    @SuppressWarnings("unchecked")
    @Override
    public void setConfiguration(Element cfg) throws ConfigurationException{
        mandatory = new HashMap<>();
        mandatoryJson = new HashMap<>();
        Element m = cfg.getChild("mandatory");
        if (m != null) {
            for (Element e : (List<Element>) m.getChildren("param")) {
                if ("json-schema".equals(e.getAttributeValue("type"))) {
                    try {
                        String json = e.getValue();
                        JsonNode nodeSchema = JsonLoader.fromString(json);
                        JsonSchema schema = JsonSchemaFactory.byDefault().getJsonSchema(nodeSchema);
                        mandatoryJson.put(e.getAttributeValue("name"), schema);
                    } catch (Exception ex) {
                        //todo: change this
                        ex.printStackTrace();
                    }
                } else {
                    mandatory.put(e.getAttributeValue("name"), Pattern.compile(e.getValue()));
                }
            }
        }
        optional = new HashMap<>();
        optionalJson = new HashMap<>();
        Element o = cfg.getChild("optional");
        if (o != null) {
            for (Element e : (List<Element>) o.getChildren("param")) {
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
                } else {
                    optional.put(e.getAttributeValue("name"), Pattern.compile(e.getValue()));
                }
            }
        }
    }

    private void checkMandatory (Context ctx) throws BLException {
        for (Map.Entry<String,Pattern> entry : mandatory.entrySet()) {
            Object v = ctx.get(entry.getKey());
            String value = v != null ? v.toString() : null;
            assertNotNull (value, "Mandatory param " + entry.getKey().toLowerCase() + " not present");
            Pattern p = entry.getValue();
            Matcher m = p.matcher(value);
            assertTrue (m.matches(), "Invalid param " + entry.getKey().toLowerCase());
        }
    }

    private void checkOptional (Context ctx) throws BLException {
        for (Map.Entry<String,Pattern> entry : optional.entrySet()) {
            String value = ctx.getString(entry.getKey());
            if (value != null) {
                Pattern p = entry.getValue();
                Matcher m = p.matcher(value);
                assertTrue (m.matches(), "Invalid param " + entry.getKey().toLowerCase());
            }
        }
    }

    private void checkMandatoryJson (Context ctx) throws BLException {
        for (Map.Entry<String,JsonSchema> entry : mandatoryJson.entrySet()) {
            String value = ctx.getString(entry.getKey());
            ProcessingReport report;
            if (value != null) {
                try {
                    JsonSchema schema = entry.getValue();
                    JsonNode node = JsonLoader.fromString(value);
                    report = schema.validate(node);
                } catch(Exception ex) {
                    throw new BLException(ex.getMessage());
                }
                assertTrue(report.isSuccess(), report.toString());
            }
        }
    }

    private void checkOptionalJson (Context ctx) throws BLException {
        for (Map.Entry<String,JsonSchema> entry : optionalJson.entrySet()) {
            String value = ctx.getString(entry.getKey());
            ProcessingReport report;
            if (value != null) {
                try {
                    JsonSchema schema = entry.getValue();
                    JsonNode node = JsonLoader.fromString(value);
                    report = schema.validate(node);
                } catch(Exception ex) {
                    throw new BLException(ex.getMessage());
                }
                assertTrue(report.isSuccess(), report.toString());
            }
        }

    }
}
