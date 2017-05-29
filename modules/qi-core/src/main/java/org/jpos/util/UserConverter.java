/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2017 jPOS Software SRL
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

package org.jpos.util;

import com.vaadin.v7.data.util.converter.Converter;
import org.jpos.ee.DB;
import org.jpos.ee.User;
import org.jpos.ee.UserManager;

import java.util.Locale;

public class UserConverter implements Converter<String,User> {

    @Override
    public User convertToModel (String value, Class<? extends User> targetType, Locale locale) throws ConversionException {
        if (value == null)
            return null;
        else {
            String[] nickAndId = value.split("\\(");
            if (nickAndId.length > 0) {
                String nick = nickAndId[0];
                try {
                    DB.exec( (db) -> {
                        UserManager mgr = new UserManager(db);
                        User u = mgr.getUserByNick(nick);
                        return u;
                    });
                } catch (Exception e) {
                    throw new ConversionException("Cannot convert from String to User " + e.getMessage());
                }
            }
            throw new ConversionException("Cannot convert from String to User");
        }
    }

    @Override
    public String convertToPresentation(User value, Class<? extends String> targetType, Locale locale) throws ConversionException {
        if (value == null)
            return null;
        else {
            return value.getNickAndId();
        }

    }

    @Override
    public Class<User> getModelType() {
        return User.class;
    }

    @Override
    public Class<String> getPresentationType() {
        return String.class;
    }
}
