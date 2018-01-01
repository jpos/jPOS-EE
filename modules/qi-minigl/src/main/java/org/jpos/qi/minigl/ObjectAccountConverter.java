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

package org.jpos.qi.minigl;

import com.vaadin.v7.data.util.converter.Converter;
import org.jpos.ee.DB;
import org.jpos.gl.Account;
import org.jpos.qi.QI;

import java.util.Locale;

/**
 * Created by alcarraz on 22/09/15.
 */
public class ObjectAccountConverter implements Converter<Object, Account> {

    public ObjectAccountConverter(){

    }
    @Override
    public Account convertToModel(Object value, Class<? extends Account> targetType, Locale locale) throws ConversionException {
        if (value == null) return null;
        try {
            return (Account) DB.exec(db -> {
                Account account = db.session().get(Account.class, (long)value);
                return account;
            });
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
            return null;
        }
    }

    @Override
    public Object convertToPresentation(Account value, Class<? extends Object> targetType, Locale locale) throws ConversionException {
        return value != null ? value.getId() : null;
    }

    @Override
    public Class<Account> getModelType() {
        return Account.class;
    }

    @Override
    public Class<Object> getPresentationType() {
        return Object.class;
    }
}
