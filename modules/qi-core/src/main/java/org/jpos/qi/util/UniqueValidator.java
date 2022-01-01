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

package org.jpos.qi.util;

import com.vaadin.data.ValidationResult;
import com.vaadin.data.Validator;
import com.vaadin.data.ValueContext;
import org.jpos.ee.DB;
import org.jpos.ee.DBManager;
import org.jpos.qi.QIHelper;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class UniqueValidator<T, FieldType> implements Validator<FieldType> {
    protected QIHelper helper;
    Class<T> clazz;
    Method idGetter;
    Method fieldGetter;
    String field;
    String errorMessageCode;

    public UniqueValidator(QIHelper helper, Class<T> clazz, String field)
            throws IntrospectionException
    {
        this(helper, clazz, field, "errorMessage." + field + "AlreadyExists");
    }

    public UniqueValidator(QIHelper helper, Class<T> clazz, String field, String errorMessageCode)
            throws IntrospectionException
    {
        this(helper, clazz, field, errorMessageCode, "id");
    }

    public UniqueValidator(QIHelper helper, Class<T> clazz, String field, String errorMessageCode, String idField)
            throws IntrospectionException
    {
        this.helper = helper;
        this.clazz = clazz;
        this.field = field;
        this.errorMessageCode = errorMessageCode;
        for (PropertyDescriptor property : Introspector.getBeanInfo(clazz).getPropertyDescriptors()) {
            if (property.getName().equals(field)) fieldGetter = property.getReadMethod();
            else if (property.getName().equals(idField)) idGetter = property.getReadMethod();
        }
    }


    /**
     * Validates the given value. Returns a {@code ValidationResult} instance
     * representing the outcome of the validation.
     *
     * @param value   the input value to validate
     * @param context the value context for validation
     * @return the validation result
     */
    @Override
    public ValidationResult apply(FieldType value, ValueContext context) {
        @SuppressWarnings("unchecked")
        T originalEntity = (T) helper.getOriginalEntity();
        try {
            T found = DB.exec(db -> new DBManager<>(db, clazz).getItemByParam(field, value));
            if (found == null ||
                    originalEntity != null && idGetter.invoke(found).equals(idGetter.invoke(originalEntity)))
            {
                return ValidationResult.ok();
            } else {
                return ValidationResult.error(helper.getApp().getMessage(errorMessageCode, value));
            }
        } catch (Exception e) {
            helper.getApp().getLog().error(e);
            return ValidationResult.error(helper.getApp().getMessage(e.getClass().getName(), e.getMessage()));
        }

    }
}
