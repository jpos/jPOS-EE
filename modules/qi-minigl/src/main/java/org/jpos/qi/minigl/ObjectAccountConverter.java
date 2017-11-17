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
