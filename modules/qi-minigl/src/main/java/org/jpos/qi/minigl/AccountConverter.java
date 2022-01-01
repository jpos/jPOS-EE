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

package org.jpos.qi.minigl;

import com.vaadin.data.Converter;
import com.vaadin.data.Result;
import com.vaadin.data.ValueContext;
import org.jpos.ee.BLException;
import org.jpos.ee.DB;
import org.jpos.gl.Account;
import org.jpos.gl.CompositeAccount;
import org.jpos.gl.FinalAccount;
import org.jpos.gl.GLSession;
import org.jpos.qi.QI;


/**
 * Created by alcarraz on 15/09/15.
 */
public class AccountConverter implements Converter<String, Account> {

    private boolean createNew;
    private boolean createFinal;
    private boolean required;

    public AccountConverter() {
        //By default we allow to leave the field empty but if there is a value we require that an account exists
        this(false, false);
    }

    public AccountConverter (boolean required, boolean createNew) {
        //By default we allow to leave the field empty but if there is a value we require that an account exists
        this(required, createNew, true);
    }

    public AccountConverter (boolean required, boolean createNew, boolean createFinal) {
        super();
        this.required = required;
        this.createNew = createNew;
        this.createFinal = createFinal;
    }

    @Override
    public Result<Account> convertToModel(String value, ValueContext valueContext) {
        if (value != null && !value.isEmpty()) {
            try {
                Account acct = DB.exec(db -> {
                    GLSession session = new GLSession(db);
                    Account res = session.getAccount("jcard",value);
                    if (res == null && createNew) {
                        if (createFinal)
                            res = new FinalAccount();
                        else
                            res = new CompositeAccount();
                        res.setCode(value);
                    } else if (res == null) {
                        throw new BLException("Invalid Account Code");
                    }
                    return res;
                });
                return Result.ok(acct);
            } catch (Exception e) {
                return Result.error(e.getMessage());
            }
        }
        if (required)
            return Result.error(QI.getQI().getMessage("errorMessage.req", QI.getQI().getMessage("account")));
        else
            return Result.ok(null);
    }

    @Override
    public String convertToPresentation(Account value, ValueContext context) {
        return (value == null) ? "" : value.getCode();
    }
}
