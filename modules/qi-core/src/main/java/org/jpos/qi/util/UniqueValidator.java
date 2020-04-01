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
