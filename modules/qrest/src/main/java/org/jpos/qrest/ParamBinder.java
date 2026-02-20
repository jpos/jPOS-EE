/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2026 jPOS Software SRL
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

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import org.jpos.transaction.Context;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.lang.reflect.RecordComponent;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Binds HTTP parameters from a {@link Context} to a Java record using JAX-RS annotations.
 *
 * <p>Supported annotations on record components:
 * <ul>
 *   <li>{@link QueryParam} &mdash; extracted from {@link Constants#QUERYPARAMS}</li>
 *   <li>{@link PathParam}  &mdash; extracted from {@link Constants#PATHPARAMS}</li>
 *   <li>{@link FormParam}  &mdash; extracted from {@link Constants#FORMPARAMS}</li>
 * </ul>
 *
 * <p>{@link DefaultValue} may be used on any annotated component to supply a fallback
 * when the parameter is absent from the context.
 *
 * <p>Supported target types: {@code String}, {@code int}/{@code Integer},
 * {@code long}/{@code Long}, {@code boolean}/{@code Boolean},
 * {@code short}/{@code Short}, and {@link BigDecimal}.
 */
public final class ParamBinder {

    private ParamBinder() { }

    private static final ConcurrentHashMap<Class<?>, RecordMeta> META_CACHE = new ConcurrentHashMap<>();

    public static <T extends Record> T bind(Context ctx, Class<T> type) {
        RecordMeta meta = META_CACHE.computeIfAbsent(type, RecordMeta::build);
        Object[] args = new Object[meta.components.length];
        for (int i = 0; i < meta.components.length; i++) {
            args[i] = resolve(ctx, meta.components[i]);
        }
        try {
            @SuppressWarnings("unchecked")
            T instance = (T) meta.constructor.newInstance(args);
            return instance;
        } catch (ReflectiveOperationException e) {
            throw new IllegalStateException("Failed to instantiate " + type.getName(), e);
        }
    }

    private static Object resolve(Context ctx, ComponentMeta comp) {
        if (comp.source == null)
            return defaultForType(comp.targetType);

        String raw = extractRaw(ctx, comp);
        if (raw == null)
            raw = comp.defaultValue;
        if (raw == null)
            return defaultForType(comp.targetType);
        return convert(raw, comp.targetType);
    }

    @SuppressWarnings("unchecked")
    private static String extractRaw(Context ctx, ComponentMeta comp) {
        switch (comp.source) {
            case QUERY: {
                Map<String, List<String>> qp = ctx.get(Constants.QUERYPARAMS);
                if (qp == null) return null;
                List<String> vals = qp.get(comp.paramName);
                return (vals != null && !vals.isEmpty()) ? vals.getFirst() : null;
            }
            case PATH: {
                Map<String, Object> pp = ctx.get(Constants.PATHPARAMS);
                if (pp == null) return null;
                Object val = pp.get(comp.paramName);
                return val != null ? val.toString() : null;
            }
            case FORM: {
                Map<String, List<String>> fp = ctx.get(Constants.FORMPARAMS);
                if (fp == null) return null;
                List<String> vals = fp.get(comp.paramName);
                return (vals != null && !vals.isEmpty()) ? vals.getFirst() : null;
            }
            default:
                return null;
        }
    }

    private static Object convert(String raw, Class<?> type) {
        if (type == String.class)          return raw;
        if (type == int.class    || type == Integer.class)   return Integer.parseInt(raw);
        if (type == long.class   || type == Long.class)      return Long.parseLong(raw);
        if (type == boolean.class|| type == Boolean.class)    return Boolean.parseBoolean(raw);
        if (type == short.class  || type == Short.class)      return Short.parseShort(raw);
        if (type == BigDecimal.class)                         return new BigDecimal(raw);
        throw new IllegalArgumentException("Unsupported parameter type: " + type.getName());
    }

    private static Object defaultForType(Class<?> type) {
        if (type == int.class)     return 0;
        if (type == long.class)    return 0L;
        if (type == boolean.class) return false;
        if (type == short.class)   return (short) 0;
        return null;
    }

    private enum Source { QUERY, PATH, FORM }

    private record ComponentMeta(Source source, String paramName, String defaultValue, Class<?> targetType) { }

    private record RecordMeta(Constructor<?> constructor, ComponentMeta[] components) {
        static RecordMeta build(Class<?> type) {
            RecordComponent[] rcs = type.getRecordComponents();
            Class<?>[] paramTypes = new Class<?>[rcs.length];
            for (int i = 0; i < rcs.length; i++) {
                paramTypes[i] = rcs[i].getType();
            }
            try {
                Constructor<?> ctor = type.getDeclaredConstructor(paramTypes);
                ctor.setAccessible(true);
                // JAX-RS annotations target PARAMETER/FIELD, not RECORD_COMPONENT,
                // so we read annotations from the canonical constructor parameters.
                Parameter[] params = ctor.getParameters();
                ComponentMeta[] components = new ComponentMeta[rcs.length];
                for (int i = 0; i < rcs.length; i++) {
                    components[i] = buildComponent(params[i]);
                }
                return new RecordMeta(ctor, components);
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("No canonical constructor found for " + type.getName(), e);
            }
        }

        private static ComponentMeta buildComponent(Parameter param) {
            Source source = null;
            String paramName = null;
            for (Annotation ann : param.getAnnotations()) {
                if (ann instanceof QueryParam qp) {
                    source = Source.QUERY;
                    paramName = qp.value();
                } else if (ann instanceof PathParam pp) {
                    source = Source.PATH;
                    paramName = pp.value();
                } else if (ann instanceof FormParam fp) {
                    source = Source.FORM;
                    paramName = fp.value();
                }
            }
            String defaultValue = null;
            DefaultValue dv = param.getAnnotation(DefaultValue.class);
            if (dv != null)
                defaultValue = dv.value();
            return new ComponentMeta(source, paramName, defaultValue, param.getType());
        }
    }
}
