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

package org.jpos.ee.usertype;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.usertype.UserType;
import org.jpos.util.Tags;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Objects;

public class TagsType implements UserType<Tags> {

    @Override
    public int getSqlType() {
        return Types.VARCHAR;
    }

    @Override
    public Class<Tags> returnedClass() {
        return Tags.class;
    }

    @Override
    public boolean equals(Tags x, Tags y) {
        return Objects.equals(x, y);
    }

    @Override
    public int hashCode(Tags x) {
        return x.hashCode();
    }

    @Override
    public Tags nullSafeGet(ResultSet rs, int position, SharedSessionContractImplementor session, Object owner) throws SQLException {
        String tags = rs.getString(position);
        if (rs.wasNull())
            return null;
        return new Tags(tags);
    }

    @Override
    public void nullSafeSet(PreparedStatement st, Tags value, int index, SharedSessionContractImplementor session) throws SQLException {
        if (value==null) {
            st.setNull(index, Types.VARCHAR);
        } else {
            st.setString (index, value.toString());
        }
    }

    @Override
    public Tags deepCopy(Tags value) {
        return value != null ? new Tags(value.toString()) : new Tags();
    }

    @Override
    public boolean isMutable() {
        return true;
    }

    @Override
    public Serializable disassemble(Tags value) {
        return value.toString();
    }

    @Override
    public Tags assemble(Serializable cached, Object owner) {
        return null;
    }
}
