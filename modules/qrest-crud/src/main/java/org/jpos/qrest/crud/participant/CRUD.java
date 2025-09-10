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

package org.jpos.qrest.crud.participant;

import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.ee.BLException;
import org.jpos.ee.DB;
import org.jpos.ee.RevisionManager;
import org.jpos.ee.User;
import org.jpos.ee.support.BeanDiff;
import org.jpos.iso.ISOUtil;
import org.jpos.qrest.*;
import org.jpos.qrest.crud.Count;
import org.jpos.qrest.crud.RestErrorResponse;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionParticipant;
import org.jpos.transaction.TxnSupport;
import org.jpos.util.Caller;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Order;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import java.io.Serializable;
import java.lang.reflect.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

// Use the Hibernate 6 query API
import org.hibernate.query.Query;

import javax.annotation.Nullable;
import javax.validation.*;

import static org.jpos.qrest.Constants.*;


/**
 * Abstract base class for implementing RESTful CRUD operations
 * in a jPOS QREST transaction context.
 * <p>
 * This generic participant handles standard HTTP methods—`GET`, `POST`, `PUT`, and `DELETE`—
 * against JPA-managed entities (`T`), optionally supporting distinct input (`I`) and output (`O`)
 * Data Transfer Objects (DTOs).
 * </p>
 *
 * <h2>Supported Features</h2>
 * <ul>
 *   <li>Dynamic ID resolution and type conversion based on configuration.</li>
 *   <li>Automatic JSON-to-DTO-to-Entity conversion with validation.</li>
 *   <li>Hibernate Criteria and pagination support for `GET` queries.</li>
 *   <li>Customizable hooks for filtering, ordering, and access control (`canPost`, `canPut`, `canDelete`).</li>
 *   <li>Pluggable DTO serialization/deserialization via {@code fromDTO} / {@code toDTO} methods.</li>
 * </ul>
 *
 * <h2>Generic Parameters</h2>
 * <ul>
 *   <li><code>T</code> — ORM Entity class (e.g., JPA/Hibernate).</li>
 *   <li><code>I</code> — Input DTO class (used for deserializing requests).</li>
 *   <li><code>O</code> — Output DTO class (used for serializing responses).</li>
 * </ul>
 *
 * <h2>Usage</h2>
 * Subclasses must declare the type parameters and register appropriate configuration properties,
 * particularly the ID field name (e.g., <code>&lt;property name="id" value="Id"/&gt;</code>).
 *
 * <p>
 * Example subclass:
 * <pre>{@code
 * public class UserCRUD extends CRUD<User, UserDTO, UserDTO> { }
 * }</pre>
 * </p>
 *
 * <p>
 * This class is intended to be used as a {@code TransactionParticipant} in Q2-based
 * transactional workflows and assumes integration with a Hibernate-backed {@code DB}
 * and a JSON mapper (typically Jackson).
 * </p>
 *
 * @param <T> ORM Entity class.
 * @param <I> DTO class for input (usually for POST/PUT).
 * @param <O> DTO class for output (usually for GET responses).
 *
 * @author jPOS
 * @since 3.0.1
 */

@SuppressWarnings("rawtypes")
public abstract class CRUD<T, I, O> implements TransactionParticipant, Configurable {

    protected static final String TEMP_RESPONSE = "TEMP_RESPONSE";
    protected static final String PERSISTED_ENTITY = "PERSISTED_ENTITY";
    protected static final String USER = "USER";
    private String idType;
    private Class idClass;
    private String getIdMethodName;
    private String setIdMethodName;
    private Class<T> managedORMClass;
    private Class<I> managedDTOInputClass;
    private Class<O> managedDTOOutputClass;

    /**
     * Prepares this transaction participant for the requested HTTP method.
     *
     * @param id the transaction id.
     * @param context the transaction context.
     * @return a combination of status flags indicating the outcome.
     */
    @Override
    public int prepare(long id, Serializable context) {
        Context ctx = (Context) context;
        try {
            switch ((String) ctx.get(METHOD)) {
                case "POST":
                    return prepareForPost(id, ctx);
                case "PUT":
                    return prepareForPut(id, ctx);
                case "GET":
                    return prepareForGet(id, ctx);
                case "DELETE":
                    return prepareForDelete(id, ctx);
            }
        } catch (Exception e) {
            ctx.log(e);
            return ABORTED | READONLY;
        }
        return PREPARED | READONLY;
    }

    /**
     * Gets the managed ORM entity class.
     *
     * @return the managed ORM class.
     */
    protected Class<T> getManagedORMClass() {
        return managedORMClass;
    }

    /**
     * Gets the managed DTO input class.
     *
     * @return the managed DTO input class.
     */
    protected Class<I> getManagedDTOInputClass() {
        return managedDTOInputClass;
    }

    /**
     * Gets the managed DTO output class.
     *
     * @return the managed DTO output class.
     */
    protected Class<O> getManagedDTOOutputClass() {
        return managedDTOOutputClass;
    }

    /**
     * Commits the transaction by moving any temporary response into the final response.
     *
     * @param id the transaction id.
     * @param context the transaction context.
     */
    @Override
    public void commit(long id, Serializable context) {
        Context ctx = (Context) context;
        Object resp = ctx.get(TEMP_RESPONSE);
        if (resp != null) {
            ctx.move(TEMP_RESPONSE, RESPONSE);
        } else {
            ctx.put(RESPONSE,
              new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.INTERNAL_SERVER_ERROR));
        }
    }

    /**
     * Aborts the transaction and restores the previous response if available.
     *
     * @param id the transaction id.
     * @param context the transaction context.
     */
    @Override
    public void abort(long id, Serializable context) {
        Context ctx = (Context) context;
        Object resp = ctx.get(TEMP_RESPONSE);
        if (resp != null) {
            ctx.remove(TEMP_RESPONSE);
            ctx.put(RESPONSE, resp);
        } else {
            ctx.put(RESPONSE, new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.BAD_REQUEST));
        }
    }

    /**
     * Sets the configuration for this CRUD participant. It initializes the managed classes and ID methods.
     *
     * @param cfg the configuration.
     * @throws ConfigurationException if the configuration is invalid.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void setConfiguration(Configuration cfg) throws ConfigurationException {
        try {
            Type[] typeArgs = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments();
            if (typeArgs.length < 1)
                throw new ConfigurationException("Class " + getClass().getSimpleName() + " do not define managed type");

            managedORMClass = (Class<T>) Class.forName(typeArgs[0].toString().substring(6));
            if (typeArgs.length > 1) {
                managedDTOInputClass = (Class<I>) Class.forName(typeArgs[1].toString().substring(6));
                managedDTOOutputClass = (Class<O>) Class.forName(typeArgs[2].toString().substring(6));
            } else {
                managedDTOInputClass = (Class<I>) Class.forName(typeArgs[0].toString().substring(6));
                managedDTOOutputClass = (Class<O>) Class.forName(typeArgs[0].toString().substring(6));
            }

            getIdMethodName = "get" + cfg.get("id", "Id");
            setIdMethodName = "set" + cfg.get("id", "Id");
            idType = getManagedORMClass().getMethod(getIdMethodName).getGenericReturnType().getTypeName();
            idClass = getIdClass();
        } catch (NoSuchMethodException | ClassNotFoundException e) {
            throw new ConfigurationException(e);
        }
    }

    /**
     * Determines if the entity can be deleted.
     *
     * @param ctx the transaction context.
     * @param obj the entity to check.
     * @return true if deletion is allowed; false otherwise.
     */
    protected boolean canDelete(Context ctx, T obj) {
        return true;
    }

    /**
     * Determines if the entity can be created (POST).
     *
     * @param ctx the transaction context.
     * @param entity the entity to check.
     * @return true if creation is allowed; false otherwise.
     */
    protected boolean canPost(Context ctx, T entity) {
        DB db = ctx.get(TxnSupport.DB);
        try {
            Object persistedEntity = db.session().get(entity.getClass(), getId(entity));
            if (persistedEntity != null) {
                ctx.put(TEMP_RESPONSE, new Response(HttpResponseStatus.CONFLICT, new RestErrorResponse("duplicate.id")));
                return false;
            }
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            ctx.log(e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * Determines if the entity can be updated (PUT).
     *
     * @param ctx the transaction context.
     * @param entity the entity to check.
     * @return true if the entity exists and can be updated; false otherwise.
     */
    protected boolean canPut(Context ctx, T entity) {
        DB db = ctx.get(TxnSupport.DB);
        Object persistedEntity;
        try {
            persistedEntity = db.session().get(entity.getClass(), getId(entity));
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            ctx.log(e.getMessage());
            return false;
        }
        return persistedEntity != null;
    }

    /**
     * Converts a String id to its appropriate Serializable type.
     *
     * @param id the id string.
     * @return the converted id.
     */
    protected Serializable getId(String id) {
        if (id != null) {
            switch (idType) {
                case "int":
                case "java.lang.Integer":
                    return Integer.valueOf(id);
                case "long":
                case "java.lang.Long":
                    return Long.valueOf(id);
            }
        }
        return id;
    }

    /**
     * Gets the Java class corresponding to the ID type.
     *
     * @return the ID class.
     */
    protected Class getIdClass() {
        return switch (idType) {
            case "int" -> int.class;
            case "java.lang.Integer" -> Integer.class;
            case "long" -> long.class;
            case "java.lang.Long" -> Long.class;
            default -> String.class;
        };
    }

    /**
     * Retrieves and validates the entity from the JSON request in the context.
     *
     * @param ctx the transaction context.
     * @return the validated entity or null if validation fails.
     */
    protected @Nullable T getAndValidateEntity(Context ctx) {
        T entity = null;
        try {
            String jsonRequest = ctx.get(JSON_REQUEST.name());
            entity = fromDTO(ctx, Converter.getMapper().readValue(jsonRequest, getManagedDTOInputClass()));
            if (!isValidId(entity, ctx)) {
                ctx.put(TEMP_RESPONSE, new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.BAD_REQUEST));
                return null;
            }
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            Validator validator = factory.getValidator();
            Set<ConstraintViolation<Object>> violations = validator.validate(entity);
            if (!violations.isEmpty()) {
                for (ConstraintViolation<Object> violation : violations) {
                    ctx.log("Validation error: " + violation.getMessage());
                }
                ctx.put(TEMP_RESPONSE, new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.BAD_REQUEST));
                return null;
            }
            ctx.remove(JSON_REQUEST.name()); // unclutter context
        } catch (QRestException e) {
            ctx.log(e.getMessage() + " (" + Caller.info(0) + ")");
            ctx.put(TEMP_RESPONSE, e.getResponse());
        } catch (Exception e) {
            ctx.log(e.getMessage() + " (" + Caller.info(0) + ")");
            ctx.put(TEMP_RESPONSE, new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.BAD_REQUEST));
        }
        return entity;
    }

    /**
     * Validates that the ID in the path parameters (if provided) matches the entity's ID.
     *
     * @param entity the entity.
     * @param ctx the transaction context.
     * @return true if valid; false otherwise.
     * @throws InvocationTargetException if the getter invocation fails.
     * @throws NoSuchMethodException if the getter method does not exist.
     * @throws IllegalAccessException if the getter method is inaccessible.
     */
    protected boolean isValidId(T entity, Context ctx) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        Map<String, String> params = ctx.get(PATHPARAMS);
        String idParam = params.get("id");
        if (idParam != null) {
            if (getId(entity) != null && !idParam.equals(getId(entity).toString()))
                return false;
            setId(entity, getId(idParam));
        }
        return true;
    }

    /** Per-CRUD override (optional). Default: empty. */
    protected Map<String, String> constraintMessageMap() {
        return Collections.emptyMap();
    }

    protected Response conflictFromConstraint(Throwable t) {
        org.hibernate.exception.ConstraintViolationException cve = unwrapConstraintViolation(t);
        String key = "duplicate"; // generic fallback
        if (cve != null) {
            String name = cve.getConstraintName();
            if (name != null) {
                // strip schema prefix and normalize
                int dot = name.lastIndexOf('.');
                if (dot >= 0 && dot + 1 < name.length()) name = name.substring(dot + 1);
                String norm = name.toLowerCase(java.util.Locale.ROOT).trim();

                String mapped = constraintMessageMap().get(norm);
                if (mapped != null) {
                    key = mapped;
                } else {
                    // light heuristics
                    if (norm.contains("name")) key = "duplicate.name";
                    else if (norm.contains("code")) key = "duplicate.code";
                }
            }
        }
        return new Response(io.netty.handler.codec.http.HttpResponseStatus.CONFLICT, MessageBody.of(key));
    }
    
    protected org.hibernate.exception.ConstraintViolationException unwrapConstraintViolation(Throwable t) {
        for (Throwable cur = t; cur != null; cur = cur.getCause()) {
            if (cur instanceof org.hibernate.exception.ConstraintViolationException c) return c;
        }
        return null;
    }

    /**
     * Prepares a POST (create) operation.
     *
     * @param id the transaction id.
     * @param ctx the transaction context.
     * @return a combination of status flags indicating the outcome.
     * @throws InvocationTargetException if a reflective method invocation fails.
     * @throws NoSuchMethodException if the expected method is not found.
     * @throws IllegalAccessException if the method cannot be accessed.
     */
    protected int prepareForPost(long id, Context ctx) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        DB db = ctx.get(TxnSupport.DB);
        User author = ctx.get(USER);
        T request = getAndValidateEntity(ctx);
        if (request != null && canPost(ctx, request)) {
            try {
                boolean hasId = getId(request) != null;
                ctx.log("HasID before persist: " + hasId + " '" + getId(request) + "'");
                db.session().persist(request);
                db.session().flush();
                revisionCreated(db,author,request.getClass().getSimpleName(),getRevisionRef(request));
                ctx.put(PERSISTED_ENTITY, request);
                ctx.put(TEMP_RESPONSE, new Response(HttpResponseStatus.CREATED, toDTO(ctx, request)));
                return PREPARED | READONLY;
            } catch (org.hibernate.exception.ConstraintViolationException hce) {
                ctx.put(TEMP_RESPONSE, conflictFromConstraint(hce));
                return ABORTED | READONLY;
            } catch (jakarta.persistence.PersistenceException pe) {
                org.hibernate.exception.ConstraintViolationException hce = unwrapConstraintViolation(pe);
                if (hce != null) {
                    ctx.put(TEMP_RESPONSE, conflictFromConstraint(hce));
                    return ABORTED | READONLY;
                }
                ctx.put(TEMP_RESPONSE,
                  new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.BAD_REQUEST));
                return ABORTED | READONLY;
            } catch (RuntimeException re) {
                ctx.put(TEMP_RESPONSE,
                  new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.INTERNAL_SERVER_ERROR));
                return ABORTED | READONLY;
            }
        }
        if (ctx.get(TEMP_RESPONSE) == null)
            ctx.put(TEMP_RESPONSE,
              new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.METHOD_NOT_ALLOWED));
        return ABORTED | READONLY;
    }

    /**
     * Prepares a PUT (update) operation.
     *
     * @param id the transaction id.
     * @param ctx the transaction context.
     * @return a combination of status flags indicating the outcome.
     * @throws InvocationTargetException if a reflective method invocation fails.
     * @throws NoSuchMethodException if the expected method is not found.
     * @throws IllegalAccessException if the method cannot be accessed.
     */
    protected int prepareForPut(long id, Context ctx) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        DB db = ctx.get(TxnSupport.DB);
        User author = ctx.get(USER);
        T request = getAndValidateEntity(ctx);
        if (request == null) {
            ctx.put(TEMP_RESPONSE,
              new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.METHOD_NOT_ALLOWED));
            return ABORTED | READONLY;
        }
        Serializable objId = getId(request);
        T oldObj = (objId == null) ? null : getById(ctx, getManagedORMClass(), objId);
        if (oldObj == null) {
            ctx.put(TEMP_RESPONSE, new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.NOT_FOUND));
            return ABORTED | READONLY;
        }
        if (!canPut(ctx, request)) {
            if (ctx.get(TEMP_RESPONSE) == null)
                ctx.put(TEMP_RESPONSE, new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.CONFLICT));
            return ABORTED | READONLY;
        }
        try {
            List<String> propertyNames = new ArrayList<>();
            for (Field field : request.getClass().getDeclaredFields())
                propertyNames.add(field.getName());
            revisionChanged(db,author, request.getClass().getSimpleName(), getRevisionRef(request), oldObj, request,
              propertyNames.toArray(String[]::new));
            db.session().merge(request);
            db.session().flush();
            ctx.put(TEMP_RESPONSE, new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK));
            return PREPARED | READONLY;
        } catch (org.hibernate.exception.ConstraintViolationException hce) {
            ctx.put(TEMP_RESPONSE, conflictFromConstraint(hce));
            return ABORTED | READONLY;
        } catch (jakarta.persistence.PersistenceException pe) {
            org.hibernate.exception.ConstraintViolationException hce = unwrapConstraintViolation(pe);
            if (hce != null) {
                ctx.put(TEMP_RESPONSE, conflictFromConstraint(hce));
                return ABORTED | READONLY;
            }
            ctx.put(TEMP_RESPONSE, new DefaultFullHttpResponse(
              HttpVersion.HTTP_1_1, HttpResponseStatus.BAD_REQUEST));
            return ABORTED | READONLY;
        } catch (RuntimeException re) {
            ctx.put(TEMP_RESPONSE, new DefaultFullHttpResponse(
              HttpVersion.HTTP_1_1, HttpResponseStatus.INTERNAL_SERVER_ERROR));
            return ABORTED | READONLY;
        }
    }

    /**
     * Builds a CriteriaQuery based on the current context.
     *
     * @param ctx the transaction context.
     * @return a typed CriteriaQuery.
     * @throws BLException if query criteria cannot be built.
     */
    protected CriteriaQuery<T> getCriteriaQuery(Context ctx) throws BLException {
        DB db = ctx.get(TxnSupport.DB);
        CriteriaBuilder cb = db.session().getCriteriaBuilder();
        CriteriaQuery<T> query = cb.createQuery(getManagedORMClass());
        Root<T> root = query.from(getManagedORMClass());
        List<Predicate> predicates = createPredicates(ctx, cb, root);
        if (!predicates.isEmpty()) {
            query.where(cb.and(predicates.toArray(new Predicate[0])));
        }
        List<Order> orders = orderBy(cb, root);
        if (!orders.isEmpty()) {
            query.orderBy(orders);
        }
        return query;
    }

    /**
     * Provides a default ordering (ascending by "id").
     *
     * @param builder the criteria builder.
     * @param root the query root.
     * @return a list of ordering clauses.
     */
    protected List<Order> orderBy(CriteriaBuilder builder, Root<T> root) {
        List<Order> orders = new ArrayList<>();
        orders.add(builder.asc(root.get("id")));
        return orders;
    }

    /**
     * Builds a Hibernate Query based on the criteria defined in the context.
     *
     * @param ctx the transaction context.
     * @return a typed Query.
     * @throws BLException if the query cannot be built.
     */
    protected Query<T> buildQuery(Context ctx) throws BLException {
        DB db = ctx.get(TxnSupport.DB);
        CriteriaQuery<T> criteriaQuery = getCriteriaQuery(ctx);
        return db.session().createQuery(criteriaQuery);
    }

    /**
     * Creates a list of predicates based on the current context.
     * <p>
     * Default implementation returns an empty list.
     * </p>
     *
     * @param ctx the transaction context.
     * @param builder the criteria builder.
     * @param root the query root.
     * @return a list of predicates.
     * @throws BLException if predicate creation fails.
     */
    protected List<Predicate> createPredicates(Context ctx, CriteriaBuilder builder, Root<T> root) throws BLException {
        // Default implementation: No filters
        return new ArrayList<>();
    }

    /**
     * Prepares a GET (read) operation.
     *
     * @param id the transaction id.
     * @param ctx the transaction context.
     * @return a combination of status flags indicating the outcome.
     * @throws BLException if query execution fails.
     */
    @SuppressWarnings("unchecked")
    protected int prepareForGet(long id, Context ctx) throws BLException {
        DB db = ctx.get(TxnSupport.DB);
        Map<String, String> params = ctx.get(PATHPARAMS);
        String idParam = params.get("id");
        if (idParam == null || idParam.isEmpty()) {
            // get all
            AtomicInteger offset = new AtomicInteger(0);
            AtomicInteger limit = new AtomicInteger(100);
            Map<String, List<String>> queryParams = ctx.get(QUERYPARAMS);
            if (queryParams != null) {
                Optional.ofNullable(queryParams.get("limit")).ifPresent(o -> {
                    limit.set(Integer.parseInt(o.getFirst()));
                    ctx.put("limit", limit.intValue());
                });
                Optional.ofNullable(queryParams.get("offset")).ifPresent(o -> {
                    offset.set(Integer.parseInt(o.getFirst()));
                    ctx.put("offset", offset.intValue());
                });
            }
            ctx.put("size", getCount(ctx));
            Query<T> criteria = buildQuery(ctx)
              .setReadOnly(true)
              .setFirstResult(offset.get())
              .setMaxResults(limit.get());
            ctx.put(TEMP_RESPONSE, new Response(HttpResponseStatus.OK, toListDTO(ctx, toDTO(ctx, criteria.getResultList()))));
            return PREPARED | READONLY;
        } else if ("count".equalsIgnoreCase(idParam)) {
            Count count = new Count(getCount(ctx));
            ctx.put(TEMP_RESPONSE, new Response(HttpResponseStatus.OK, count));
            return PREPARED | READONLY;
        } else {
            Serializable key = null;
            T persistedEntity = null;
            try {
                key = getId(idParam);
            } catch (NumberFormatException ignored) { }
            if (key != null)
                persistedEntity = getById(ctx, getManagedORMClass(), key);
            if (persistedEntity != null) {
                db.session().evict(persistedEntity);
                ctx.put(TEMP_RESPONSE, new Response(HttpResponseStatus.OK, toDTO(ctx, persistedEntity)));
                return PREPARED | READONLY;
            } else {
                ctx.put(TEMP_RESPONSE,
                  new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.NOT_FOUND));
            }
        }
        return ABORTED | READONLY;
    }

    /**
     * Prepares a DELETE operation.
     *
     * @param id the transaction id.
     * @param ctx the transaction context.
     * @return a combination of status flags indicating the outcome.
     */
    protected int prepareForDelete(long id, Context ctx) {
        DB db = ctx.get(TxnSupport.DB);
        User author = ctx.get(USER);
        Map<String, String> params = ctx.get(PATHPARAMS);
        T persistedEntity = getById(ctx, getManagedORMClass(), getId(params.get("id")));
        if (persistedEntity != null) {
            if (canDelete(ctx, persistedEntity)) {
                db.session().remove(persistedEntity);
                try {
                    db.session().flush();
                    revisionRemoved(db, author, persistedEntity.getClass().getSimpleName(), getRevisionRef(persistedEntity));
                    ctx.put(TEMP_RESPONSE,
                      new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.NO_CONTENT));
                    return PREPARED | READONLY;
                } catch (Exception e) {
                    ctx.log(e.getMessage());
                    ctx.put(TEMP_RESPONSE,
                      new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.METHOD_NOT_ALLOWED));
                }
            } else {
                ctx.put(TEMP_RESPONSE,
                  new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.METHOD_NOT_ALLOWED));
            }
        } else {
            ctx.put(TEMP_RESPONSE,
              new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.NOT_FOUND));
        }
        return ABORTED | READONLY;
    }

    /**
     * Converts a DTO input to the ORM entity.
     *
     * @param ctx the transaction context.
     * @param dto the DTO input.
     * @return the ORM entity.
     * @throws QRestException if the conversion fails.
     */
    @SuppressWarnings("unchecked")
    protected T fromDTO(Context ctx, I dto) throws QRestException {
        return (T) dto;
    }

    /**
     * Converts an ORM entity to its DTO representation.
     *
     * @param ctx the transaction context.
     * @param entity the ORM entity.
     * @return the DTO representation.
     */
    @SuppressWarnings("unchecked")
    protected O toDTO(Context ctx, T entity) {
        return (O) entity;
    }

    /**
     * Converts a list of ORM entities to their DTO representations.
     *
     * @param ctx the transaction context.
     * @param entities the list of ORM entities.
     * @return the list of DTO representations.
     */
    @SuppressWarnings("unchecked")
    protected List<O> toDTO(Context ctx, List<T> entities) {
        return (List<O>) entities;
    }

    /**
     * Wraps a list of DTO representations into a ListDTO object including pagination info.
     *
     * @param ctx the transaction context.
     * @param entities the list of DTO representations.
     * @return the ListDTO.
     */
    protected ListDTO toListDTO(Context ctx, List<O> entities) {
        ListDTO dto = new ListDTO();
        dto.setData(entities);
        dto.setLimit(ctx.get("limit"));
        dto.setOffset(ctx.get("offset"));
        dto.setTotal(((Long) ctx.get("size")).intValue());
        return dto;
    }

    /**
     * Processes a query parameter by applying the given predicate function if the parameter is present.
     *
     * @param paramName the name of the query parameter.
     * @param predicateFunction a function that creates a Predicate from a String.
     * @param queryParams the map of query parameters.
     * @param predicates the list to which the predicate should be added.
     */
    protected void processQueryParam(String paramName, Function<String, Predicate> predicateFunction, Map<String, List<String>> queryParams, ArrayList<Predicate> predicates) {
        Optional.ofNullable(queryParams.get(paramName)).ifPresent(o -> {
            predicates.add(predicateFunction.apply(o.getFirst()));
        });
    }

    /**
     * Processes a query parameter representing a date by applying the given predicate function.
     *
     * @param paramName the name of the query parameter.
     * @param predicateFunction a function that creates a Predicate from a Date.
     * @param queryParams the map of query parameters.
     * @param predicates the list to which the predicate should be added.
     * @param format the expected date format.
     * @throws BLException if the date cannot be parsed.
     */
    protected void processQueryParamWithDateFormat(String paramName, Function<Date, Predicate> predicateFunction,
                                                   Map<String, List<String>> queryParams, ArrayList<Predicate> predicates, SimpleDateFormat format) throws BLException {
        List<String> o = queryParams.get(paramName);
        if (o != null) {
            try {
                predicates.add(predicateFunction.apply(format.parse(o.getFirst())));
            } catch (java.text.ParseException e) {
                throw new BLException("invalid.dateformat");
            }
        }
    }

    /**
     * Processes a query parameter that contains an array value.
     *
     * @param paramName the name of the query parameter.
     * @param predicateFunction a function that creates a {@code jakarta.persistence.criteria.Predicate} from a {@code String[]} array.
     * @param queryParams the map of query parameters.
     * @param predicates the list to which the predicate should be added.
     */
    protected void processQueryParamWithArray (String paramName, Function<String[], Predicate> predicateFunction,
      Map<String, List<String>> queryParams, List<Predicate> predicates) {
        if (queryParams == null || !queryParams.containsKey(paramName))
            return;
        List<String> raw = queryParams.get(paramName);
        List<String> tokens = new ArrayList<>();
        if (raw == null || raw.isEmpty()) {
            // ?param  or parser returned no entries → treat as one empty token
            tokens.add("");
        } else {
            for (String s : raw) {
                // split with -1 to KEEP empty elements (leading/trailing commas)
                String[] parts = (s == null ? "" : s).split(",", -1);
                Collections.addAll(tokens, parts);
            }
            // If all formatted to empties, keep one empty so callers can interpret "NULL"
            boolean anyNonEmpty = tokens.stream().anyMatch(t -> t != null && !t.isEmpty());
            if (!anyNonEmpty) {
                tokens.clear();
                tokens.add("");
            }
        }
        predicates.add(predicateFunction.apply(tokens.toArray(String[]::new)));
    }

    /**
     * Processes a query parameter that contains a Base64-encoded value.
     *
     * @param paramName the name of the query parameter.
     * @param predicateFunction a function that creates a Predicate from a byte array.
     * @param queryParams the map of query parameters.
     * @param predicates the list to which the predicate should be added.
     */
    protected void processQueryParamWithBase64(String paramName, Function<byte[], Predicate> predicateFunction, Map<String, List<String>> queryParams, ArrayList<Predicate> predicates) {
        Optional.ofNullable(queryParams.get(paramName)).ifPresent(o -> {
            byte[] value = Base64.getDecoder().decode(o.getFirst());
            predicates.add(predicateFunction.apply(value));
        });
    }

    /**
     * Creates a new revision entry indicating that an entity has been created.
     *
     * @param db the database context in which to record the revision
     * @param author the user who performed the creation
     * @param entityName the name of the entity that was created
     * @param ref the unique reference or identifier of the created entity
     */
    protected void revisionCreated(DB db, User author, String entityName, String ref) {
        RevisionManager mgr = new RevisionManager(db);
        mgr.createRevision(author,entityName + "." + ref , entityName + " created");
    }

    /**
     * Creates a revision entry indicating that an entity has been modified,
     * including a description of what changed.
     *
     * @param db the database context in which to record the revision
     * @param author the user who performed the modification
     * @param entityName the name of the entity that was changed
     * @param ref the unique reference or identifier of the modified entity
     * @param oldObj the original state of the entity before the change
     * @param newObj the new state of the entity after the change
     * @param props the names of the properties to include in the diff
     */
    protected void revisionChanged(DB db, User author, String entityName, String ref, Object oldObj, Object newObj, String... props) {
        BeanDiff diff = new BeanDiff(oldObj,newObj, props);
        RevisionManager mgr = new RevisionManager(db);
        mgr.createRevision(author,entityName + "." + ref, diff.toString());
    }

    /**
     * Creates a new revision entry indicating that an entity has been deleted.
     *
     * @param db the database context in which to record the revision
     * @param author the user who performed the deletion
     * @param entityName the name of the entity that was deleted
     * @param ref the unique reference or identifier of the deleted entity
     */
    protected void revisionRemoved (DB db, User author, String entityName, String ref) {
        RevisionManager mgr = new RevisionManager(db);
        mgr.createRevision(author,entityName + "." + ref, entityName + " deleted");
    }

    /**
     * Returns a string representation of the entity's revision reference.
     * <p>
     * By default, this uses the entity's ID as the revision reference.
     * Subclasses may override this method to provide a more meaningful or
     * composite reference for revision tracking.
     *
     * @param entity the entity instance whose revision reference is needed
     * @return a string representing the revision reference (typically the entity's ID)
     */
    protected String getRevisionRef(T entity) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return getId(entity).toString();
    }

    /**
     * Creates a predicate function based on the given parameter name.
     *
     * @param paramName the parameter name, possibly containing an operator suffix.
     * @param builder the criteria builder.
     * @param from the query root.
     * @return a function that produces a predicate for the given values.
     */
    private Function createPredicateFunction(String paramName, CriteriaBuilder builder, Root from) {
        String[] param = paramName.split("_");
        if (param.length > 1) {
            switch (param[1]) {
                case "ne":
                    return (values) -> from.get(param[0]).in(values).not();
                default:
                    break;
            }
        }
        return (values) -> from.get(param[0]).in(values);
    }

    /**
     * Retrieves the ID from the given object using reflection.
     *
     * @param obj the object.
     * @return the ID as a Serializable.
     * @throws NoSuchMethodException if the ID getter is not found.
     * @throws InvocationTargetException if the getter invocation fails.
     * @throws IllegalAccessException if the getter method is inaccessible.
     */
    protected Serializable getId(Object obj) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = obj.getClass().getMethod(getIdMethodName);
        Object id = method.invoke(obj, (Object[]) null);
        if (id instanceof Number && ((long) id) == 0L)
            id = null;
        return (Serializable) id;
    }

    /**
     * Sets the ID of the given object using reflection.
     *
     * @param obj the object.
     * @param id the new ID value.
     * @throws NoSuchMethodException if the ID setter is not found.
     * @throws InvocationTargetException if the setter invocation fails.
     * @throws IllegalAccessException if the setter method is inaccessible.
     */
    protected void setId(Object obj, Object id) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = obj.getClass().getMethod(setIdMethodName, idClass);
        method.invoke(obj, id);
    }

    /**
     * Retrieves an entity by its ID.
     *
     * @param ctx the transaction context.
     * @param clazz the entity class.
     * @param id the entity ID.
     * @return the entity if found; null otherwise.
     */
    protected T getById(Context ctx, Class<T> clazz, Serializable id) {
        DB db = ctx.get(TxnSupport.DB);
        T entity = db.session().get(clazz, id);
        if (entity == null) {
            ctx.log(String.format("Entity of type %s with ID %s not found", clazz.getSimpleName(), id));
        }
        return entity;
    }

    /**
     * Retrieves the count of entities.
     *
     * @param ctx the transaction context.
     * @return the total number of entities.
     * @throws BLException if the count query fails.
     */
    private Long getCount(Context ctx) throws BLException {
        DB db = ctx.get(TxnSupport.DB);
        CriteriaBuilder cb = db.session().getCriteriaBuilder();
        CriteriaQuery<Long> countCQ = cb.createQuery(Long.class);
        Root<T> root = countCQ.from(getManagedORMClass());
        // apply same predicates
        List<Predicate> predicates = createPredicates(ctx, cb, root);
        if (!predicates.isEmpty()) {
            countCQ.where(cb.and(predicates.toArray(new Predicate[0])));
        }
        countCQ.select(cb.count(root));
        return db.session()
                .createQuery(countCQ)
                .getSingleResult();
    }

    // Tiny payload DTO
    public static final class MessageBody {
        private final String message;
        private MessageBody(String message) { this.message = message; }
        public String getMessage() { return message; }
        public static MessageBody of(String key) { return new MessageBody(key); }
    }
}
