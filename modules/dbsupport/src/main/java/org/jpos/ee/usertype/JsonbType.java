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

package org.jpos.ee.usertype;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.SerializationException;
import org.hibernate.usertype.UserType;

import java.io.IOException;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;

/**
 * {@code JsonbUserType} converts a Postgres JSONB data type to a Java object
 * and vice versa
 *
 * @author avolpe@fintech.works
 */
public class JsonbType implements UserType {

    private static ObjectMapper mapper =
            new ObjectMapper()
                    .enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)
                    .enable(SerializationFeature.WRITE_DATES_WITH_ZONE_ID)
                    .enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN)
                    .setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"))
                    .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                    .configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false)
                    .setSerializationInclusion(JsonInclude.Include.NON_NULL);

    @Override
    public int[] sqlTypes() {
        return new int[]{Types.JAVA_OBJECT};
    }

    @Override
    public Class<ObjectNode> returnedClass() {
        return ObjectNode.class;
    }

    @Override
    public boolean equals(final Object x, final Object y) {
        if (x == y) {
            return true;
        }
        if (x == null || y == null) {
            return false;
        }
        return x.equals(y);
    }

    @Override
    public int hashCode(final Object x) {
        if (x == null) {
            return 0;
        }

        return x.hashCode();
    }

    @Override
    public Object nullSafeGet(ResultSet rs,
                              String[] names,
                              SharedSessionContractImplementor session,
                              Object owner) throws SQLException {
        final String json = rs.getString(names[0]);
        if (json == null) {
            return null;
        }

        try {
            return mapper.readTree(json);
        } catch (IOException e) {
            throw new HibernateException("Can't convert json str to object", e);
        }
    }

    @Override
    public void nullSafeSet(PreparedStatement st, Object value, int index, SharedSessionContractImplementor session) throws SQLException {

        if (value == null) {
            st.setNull(index, Types.OTHER);
            return;
        }

        st.setObject(index, value.toString(), Types.OTHER);
    }

    @Override
    public Object deepCopy(final Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof ObjectNode) {
            return ((ObjectNode) value).deepCopy();
        }
        return null;
    }

    @Override
    public boolean isMutable() {
        return true;
    }

    @Override
    public Serializable disassemble(final Object value) {
        final Object deepCopy = deepCopy(value);

        if (!(deepCopy instanceof Serializable)) {
            throw new SerializationException(
                    String.format("deepCopy of %s is not serializable", value), null);
        }

        return (Serializable) deepCopy;
    }

    @Override
    public Object assemble(final Serializable cached, final Object owner) {
        return deepCopy(cached);
    }

    @Override
    public Object replace(final Object original, final Object target, final Object owner) {
        return deepCopy(original);
    }
}
