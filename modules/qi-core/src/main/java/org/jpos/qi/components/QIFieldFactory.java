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

package org.jpos.qi.components;

import com.vaadin.v7.data.fieldgroup.DefaultFieldGroupFieldFactory;
import com.vaadin.v7.ui.Field;
import com.vaadin.v7.ui.TextField;

import java.math.BigDecimal;

/**
 * Created by spr on 5/25/16.
 */
public class QIFieldFactory extends DefaultFieldGroupFieldFactory {

    public QIFieldFactory () {
        super();
    }

    @Override
    public <T extends Field> T createField(Class<?> dataType, Class<T> fieldType) {
        Field f;
        if (BigDecimal.class.equals(dataType)) {
             f = (Field) new BigDecimalField();
        } else {
            f = super.createField(dataType, fieldType);
        }
        if (f instanceof TextField) {
            TextField tf = (TextField) f;
            tf.setWidth("80%");
            tf.setNullRepresentation("");
            tf.setImmediate(true);
            return (T) tf;
        }
        return (T) f;
    }

}
