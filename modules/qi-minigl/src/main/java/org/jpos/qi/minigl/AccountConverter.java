package org.jpos.qi.minigl;

import com.vaadin.data.Converter;
import com.vaadin.data.Result;
import com.vaadin.data.ValueContext;
import org.jpos.ee.BLException;
import org.jpos.ee.DB;
import org.jpos.gl.Account;
import org.jpos.gl.GLSession;


/**
 * Created by alcarraz on 15/09/15.
 */
public class AccountConverter implements Converter<String, Account> {

    @Override
    public Result<Account> convertToModel(String value, ValueContext valueContext) {
        if (value != null && !value.isEmpty()) {
            try {
                Account acct = (Account) DB.exec(db -> {
                    GLSession session = new GLSession(db);
                    Account res = session.getAccount("jcard",value);
                    if (res == null) {
                        throw new BLException("Invalid Account Code");
                    }
                    return res;
                });
                return Result.ok(acct);
            } catch (Exception e) {
                return Result.error(e.getMessage());
            }
        }
        return Result.ok(null);
    }

    @Override
    public String convertToPresentation(Account value, ValueContext context) {
        return (value == null) ? "" : value.getCode();
    }
}
