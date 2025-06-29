/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2025 jPOS Software SRL
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

import com.fasterxml.jackson.core.JsonProcessingException;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.util.CharsetUtil;
import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.core.annotation.Config;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionParticipant;

import javax.annotation.Nullable;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.io.Serializable;
import java.util.Set;

import static org.jpos.qrest.Constants.*;

/**
 * QREST transaction participant that extracts and validates a JSON object from the incoming HTTP request body.
 *
 * <p>
 * This participant reads the request payload (assumed to be JSON), deserializes it into a configured Java class,
 * validates it using Jakarta Bean Validation (JSR 380), and stores the resulting object in the transaction
 * {@link Context} under a configurable key.
 * </p>
 *
 * <h2>Configuration Parameters</h2>
 * <ul>
 *   <li><strong>class</strong> — Fully qualified class name of the object to deserialize (e.g., <code>com.example.dto.UserDTO</code>).</li>
 *   <li><strong>context-name</strong> — The key under which the resulting object will be stored in the {@link Context}.</li>
 * </ul>
 *
 * <h2>Behavior</h2>
 * <ul>
 *   <li>Reads the raw HTTP request body from the {@code REQUEST} context key.</li>
 *   <li>Deserializes the content into the configured target class using the shared {@link Converter#getMapper()}.</li>
 *   <li>Performs bean validation on the resulting object.</li>
 *   <li>If validation passes, stores the object in the context and returns {@code PREPARED | READONLY | NO_JOIN}.</li>
 *   <li>If validation fails or deserialization fails, logs the issue and returns {@code FAIL}.</li>
 * </ul>
 *
 * <p>
 * This is commonly used in REST workflows to extract and validate DTOs prior to persistence or processing.
 * </p>
 *
 * <h2>Example Q2 Configuration</h2>
 * <pre>{@code
 * <participant class="org.jpos.qrest.ExtractJSONObject">
 *   <property name="class" value="com.example.dto.CustomerDTO"/>
 *   <property name="context-name" value="customer"/>
 * </participant>
 * }</pre>
 *
 * @author jPOS
 * @since 3.0.1
 */

public class  ExtractJSONObject implements TransactionParticipant, Configurable {
    @SuppressWarnings("rawtypes")
    private Class clazz;
    @Config("class")
    private String className;

    @Config("context-name")
    private String contextName;

    @Override
    public int prepare(long id, Serializable context) {
        Context ctx = (Context) context;
        Object obj = getObject(ctx);
        ctx.put (contextName, obj);
        return obj != null ? (PREPARED | READONLY | NO_JOIN) : FAIL;
    }

    @Override
    public void setConfiguration (Configuration cfg) throws ConfigurationException {
        try {
            clazz = Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new ConfigurationException(e);
        }
    }

    @SuppressWarnings("unchecked")
    private @Nullable Object getObject(Context ctx) {
        Object obj = null;
        try {
            FullHttpRequest request = ctx.get(REQUEST);
            String jsonRequest = request.content().toString(CharsetUtil.UTF_8);
            obj = Converter.getMapper().readValue(jsonRequest, clazz);
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            Validator validator = factory.getValidator();
            Set<ConstraintViolation<Object>> violations = validator.validate(obj);
            if (!violations.isEmpty()) {
                for (ConstraintViolation<Object> violation : violations) {
                    ctx.log("Validation error: " + violation.getMessage());
                }
                ctx.put(RESPONSE, new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.BAD_REQUEST));
                return null;
            }
            ctx.remove(JSON_REQUEST.name()); // unclutter context
        } catch (JsonProcessingException e) {
            ctx.log (e);
        }
        return obj;
    }
}
