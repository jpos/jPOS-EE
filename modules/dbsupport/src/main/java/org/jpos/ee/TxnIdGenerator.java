package org.jpos.ee;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
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
        Class<?> entityClass = object.getClass();
        Class<?> idType = idFieldTypeCache.computeIfAbsent(entityClass, cls -> {
            try {
                Field idField = cls.getDeclaredField("id");
                idField.setAccessible(true); // Access private fields if necessary
                return idField.getType();
            } catch (NoSuchFieldException e) {
                throw new RuntimeException("Failed to determine ID field type for entity: " + cls.getName(), e);
            }
        });
        TxnId txnId = TxnId.create(Instant.now(), nodeId, System.nanoTime());
        if (idType.equals(String.class)) {
            return txnId.toString();
        } else if (idType.equals(Long.class)) {
            return txnId.id();
        } else {
            throw new UnsupportedOperationException("Unsupported ID type: " + idType);
        }
    }
}
