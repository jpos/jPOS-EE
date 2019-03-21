package org.jpos.qi.minigl;

import com.vaadin.data.ValidationResult;
import com.vaadin.data.Validator;
import com.vaadin.data.ValueContext;
import com.vaadin.shared.ui.ErrorLevel;
import org.jpos.ee.DB;
import org.jpos.gl.Account;
import org.jpos.qi.QI;

public class AccountValidator implements Validator<Account> {
    private QI app;
    private Class clazz;

    public AccountValidator (QI app, Class clazz) {
        super();
        this.app = app;
        this.clazz = clazz;
    }

    @Override
    public ValidationResult apply (Account value, ValueContext context) {
        Account acct = null;
        if (!context.getHasValue().isPresent())
            return ValidationResult.ok();
        boolean isReadOnly = context.getHasValue().get().isReadOnly();
        if (isReadOnly)
            return ValidationResult.ok();
        if (value != null) {
            try {
                acct = DB.exec(db -> db.session().get(Account.class, value.getId()));
            } catch (Exception e) {
                app.getLog().createError(e.getMessage());
            }
        }
        if (acct == null)
            return ValidationResult.create(app.getMessage("errorMessage.willCreateAccountAndReceivables"),
                    ErrorLevel.INFO);
        else if (clazz.isInstance(value))
            return ValidationResult.create(app.getMessage("errorMessage.accountExists"), ErrorLevel.INFO);
        return ValidationResult.ok();

    }
}
