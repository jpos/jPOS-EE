/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2024 jPOS Software SRL
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

package org.jpos.ee;

import jakarta.persistence.Id;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.proxy.HibernateProxy;
import org.hibernate.proxy.LazyInitializer;
import org.jpos.q2.Q2;
import org.jpos.transaction.TxnId;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.time.Instant;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@SuppressWarnings("unused")
public class TxnIdGenerator implements IdentifierGenerator {
    private static final int nodeId;
    private static final ConcurrentMap<Class<?>, Class<?>> idFieldTypeCache = new ConcurrentHashMap<>();

    static {
        nodeId = Q2.getQ2().node();
    }
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) {
        Class<?> entityClass = getEntityClass(object);
        Class<?> idType = idFieldTypeCache.computeIfAbsent(entityClass, cls -> {
            // First try the direct "id" field approach
            try {
                Field idField = cls.getDeclaredField("id");
                idField.setAccessible(true);
                return idField.getType();
            } catch (NoSuchFieldException e) {
                // Look for fields with @Id annotation or in parent classes
                Field idField = findIdFieldInClassHierarchy(cls);
                if (idField != null) {
                    return idField.getType();
                }
                throw new RuntimeException("Failed to determine ID field type for entity: " + cls.getName(), e);
            }
        });
        TxnId txnId = TxnId.create(Instant.now(), nodeId, System.nanoTime());
        if (idType.equals(String.class)) {
            return txnId.toString();
        } else if (idType.equals(Long.class) || idType.equals(long.class)) {
            return txnId.id();
        } else {
            throw new UnsupportedOperationException("Unsupported ID type: " + idType);
        }
    }

    private Field findIdFieldInClassHierarchy(Class<?> cls) {
        // Look for annotated ID fields in current class
        for (Field field : cls.getDeclaredFields()) {
            if (field.isAnnotationPresent(Id.class)) {
                field.setAccessible(true);
                return field;
            }
        }
        // Look in parent classes
        Class<?> superClass = cls.getSuperclass();
        if (superClass != null && !superClass.equals(Object.class)) {
            try {
                Field idField = superClass.getDeclaredField("id");
                idField.setAccessible(true);
                return idField;
            } catch (NoSuchFieldException e) {
                // Recursively check parent class hierarchy
                return findIdFieldInClassHierarchy(superClass);
            }
        }
        return null;
    }

    private Class<?> getEntityClass(Object object) {
        if (object instanceof HibernateProxy) {
            LazyInitializer initializer = ((HibernateProxy) object).getHibernateLazyInitializer();
            return initializer.getPersistentClass();
        }
        return object.getClass();
    }
}
