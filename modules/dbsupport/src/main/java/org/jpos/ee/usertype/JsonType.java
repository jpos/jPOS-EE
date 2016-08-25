package org.jpos.ee.usertype;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.usertype.UserType;

import java.io.IOException;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class JsonType implements UserType {

    private static int[] TYPES = { Types.VARCHAR };
    private static ObjectMapper mapper = new ObjectMapper();

    @Override
    public int[] sqlTypes() {
        return TYPES;
    }

    @Override
    public Class returnedClass() {
        return ObjectNode.class;
    }

    @Override
    public boolean equals(Object x, Object y) throws HibernateException {
        return (x == y) || ((x != null) && (y != null) && (x.equals(y)));
    }

    @Override
    public int hashCode(Object x) throws HibernateException {
        return x.hashCode();
    }

    /**
     * Retrieve an instance of the mapped class from a JDBC resultset. Implementors
     * should handle possibility of null values.
     *
     * @param rs      a JDBC result set
     * @param names   the column names
     * @param session
     * @param owner   the containing entity  @return Object
     * @throws HibernateException
     * @throws SQLException
     */
    @Override
    public Object nullSafeGet(ResultSet rs, String[] names, SharedSessionContractImplementor session, Object owner) throws HibernateException, SQLException {
        String json = rs.getString(names[0]);
        if (rs.wasNull())
            return null;
        try {
            return mapper.readTree(json);
        } catch (IOException e) {
            return new HibernateException("unable to read object",e);
        }
    }

    /**
     * Write an instance of the mapped class to a prepared statement. Implementors
     * should handle possibility of null values. A multi-column type should be written
     * to parameters starting from <tt>index</tt>.
     *
     * @param st      a JDBC prepared statement
     * @param value   the object to write
     * @param index   statement parameter index
     * @param session
     * @throws HibernateException
     * @throws SQLException
     */
    @Override
    public void nullSafeSet(PreparedStatement st, Object value, int index, SharedSessionContractImplementor session) throws HibernateException, SQLException {
        if (value==null) {
            st.setNull(index, Types.VARCHAR);
        } else {
            st.setString (index, value.toString());
        }
    }

    @Override
    public Object deepCopy(Object value) throws HibernateException {
        if (value == null)
            return null;
        return mapper.createObjectNode().putAll((ObjectNode) value);

    }

    @Override
    public boolean isMutable() {
        return true;
    }

    @Override
    public Serializable disassemble(Object value) throws HibernateException {
        return (Serializable) value;
    }

    @Override
    public Object assemble(Serializable cached, Object owner) throws HibernateException {
        return cached;
    }

    @Override
    public Object replace(Object original, Object target, Object owner) throws HibernateException {
        return this.deepCopy(original);
    }
}
