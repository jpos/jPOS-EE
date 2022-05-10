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
import org.jpos.ee.DB;
import org.jpos.gl.GLSession;
import org.jpos.gl.Journal;
import org.jpos.qi.QI;

public class JournalConverter implements Converter<String, Journal> {
    @Override
    public Result<Journal> convertToModel(String value, ValueContext context) {
        try {
            Journal j = DB.exec(db -> {
                GLSession gl = new GLSession(db);
                return gl.getJournal(value);
            });
            return Result.ok(j);
        } catch (Exception e) {
            QI.getQI().getLog().error(e.getMessage());
            return Result.error(e.getMessage());
        }
    }

    @Override
    public String convertToPresentation(Journal value, ValueContext context) {
        return value != null? value.getName() : null;
    }
}
