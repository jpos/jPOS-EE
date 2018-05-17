/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2018 jPOS Software SRL
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
import org.jpos.util.Log;
import org.jpos.util.LogSource;
import org.jpos.util.Logger;

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
public class ValidateParams implements TransactionParticipant, XmlConfigurable, LogSource {
    private Map<String,Pattern> mandatory;
    private Map<String,Pattern> optional;
    private Map<String,JsonSchema> mandatoryJson;
    private Map<String,JsonSchema> optionalJson;

    private Log log;

    @Override
    public int prepare(long id, Serializable context) {
        Context ctx = (Context) context;

        checkMandatory(ctx);
        checkOptional(ctx);
        checkMandatoryJson(ctx);
        checkOptionalJson(ctx);
        return (ctx.getResult().hasFailures() ? ABORTED : PREPARED) | READONLY | NO_JOIN;
    }
    

    @SuppressWarnings("unchecked")
    @Override
    public void setConfiguration(Element cfg) throws ConfigurationException{
        mandatory = new HashMap<>();
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
                        throw new ConfigurationException (ex);
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
                } else {
                    optional.put(e.getAttributeValue("name"), Pattern.compile(e.getValue()));
                }
            }
        }
    }

    @Override
    public void setLogger(Logger logger, String realm) {
        this.log = new Log(logger, realm);
    }

    @Override
    public String getRealm() {
        return log.getRealm();
    }

    @Override
    public Logger getLogger() {
        return log.getLogger();
    }

    private void checkMandatory (Context ctx) {
        for (Map.Entry<String,Pattern> entry : mandatory.entrySet()) {
            Object v = ctx.get(entry.getKey());
            String value = v != null ? v.toString() : null;
            if (value == null) {
                ctx.getResult().fail(
                  ResultCode.MANDATORY_PARAM_NOT_PRESENT, Caller.info(), "Mandatory param '%s' not present", entry.getKey()
                );
                return;
            }
            Pattern p = entry.getValue();
            Matcher m = p.matcher(value);
            if (!m.matches()) {
                ctx.getResult().fail(
                  ResultCode.INVALID_PARAM, Caller.info(), "Invalid param '%s'", entry.getKey()
                );
                return;
            }
        }
    }

    private void checkOptional (Context ctx) {
        for (Map.Entry<String,Pattern> entry : optional.entrySet()) {
            String value = ctx.getString(entry.getKey());
            if (value != null) {
                Pattern p = entry.getValue();
                Matcher m = p.matcher(value);
                if (!m.matches()) {
                    ctx.getResult().fail(
                      ResultCode.INVALID_OPTIONAL_PARAM, Caller.info(), "Invalid optional param '%s'", entry.getKey()
                    );
                    return;
                }
            }
        }
    }

    private void checkMandatoryJson (Context ctx) {
        int errors = 0;
        for (Map.Entry<String,JsonSchema> entry : mandatoryJson.entrySet()) {
            String value = ctx.getString(entry.getKey());
            ProcessingReport report;
            if (value != null) {
                try {
                    JsonSchema schema = entry.getValue();
                    JsonNode node = JsonLoader.fromString(value);
                    report = schema.validate(node);
                    if (!report.isSuccess()) {
                        ctx.getResult().fail(
                          ResultCode.INVALID_MANDATORY_JSON, Caller.info(), "Invalid mandatory JSON '%s'", entry.getKey()
                        );
                        ctx.log(report);
                    }
                } catch(Exception ex) {
                    ctx.getResult().fail(
                      ResultCode.INVALID_MANDATORY_JSON, Caller.info(), "Invalid mandatory JSON param '%s' - %s", entry.getKey(), ex.getMessage()
                    );
                }
            } else {
                ctx.getResult().fail(
                  ResultCode.MANDATORY_JSON_NOT_PRESENT, Caller.info(), "Mandatory JSON '%s' not present", entry.getKey()
                );

            }
        }
    }

    private void checkOptionalJson (Context ctx) {
        for (Map.Entry<String,JsonSchema> entry : optionalJson.entrySet()) {
            String value = ctx.getString(entry.getKey());
            ProcessingReport report;
            if (value != null) {
                try {
                    JsonSchema schema = entry.getValue();
                    JsonNode node = JsonLoader.fromString(value);
                    report = schema.validate(node);
                    if (!report.isSuccess()) {
                        ctx.getResult().fail(
                          ResultCode.INVALID_OPTIONAL_JSON, Caller.info(), "Invalid mandatory JSON '%s'", entry.getKey()
                        );
                    }
                } catch(Exception ex) {
                    ctx.getResult().fail(
                      ResultCode.INVALID_OPTIONAL_JSON, Caller.info(), "Mandatory JSON '%s' not present", entry.getKey()
                    );
                }
            }
        }
    }
}
