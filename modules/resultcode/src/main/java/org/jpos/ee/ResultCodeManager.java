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

package org.jpos.ee;

import org.hibernate.HibernateException;
import org.hibernate.ObjectNotFoundException;
import org.jpos.util.LogEvent;
import org.jpos.util.Logger;

import java.util.List;

public class ResultCodeManager {
    DB db;

    public ResultCodeManager (DB db) {
        super();
        this.db = db;
    }
    public ResultCode get (long id) {
        try {
            return db.session().load (
                ResultCode.class, id
            );
        } catch (ObjectNotFoundException e) {
            LogEvent evt = db.getLog().createWarn ();
            evt.addMessage ("error loading unconfigured result code " + id);
            evt.addMessage (e);
            Logger.log (evt);
        } catch (HibernateException e) {
            db.getLog().warn (e);
        }
        return null;
    }
    public ResultCode get (String rc) {
        try {
            List<ResultCode> l = ResultCodeFinder.findByMnemonic (db.session(), rc);
            if (l.isEmpty()) {
                LogEvent evt = db.getLog().createWarn ();
                evt.addMessage (
                    "error loading unconfigured result code '" + rc + "'"
                );
                Logger.log (evt);
            } else {
                return l.get(0);
            }
        } catch (HibernateException e) {
            db.getLog().warn (e);
        }
        return null;
    }
    public ResultCode get (String rc, ResultCode defRc) {
        ResultCode resultCode = get (rc);
        return resultCode != null ? resultCode : defRc;
    }
    public ResultCodeInfo getInfo (ResultCode rc, String locale) {
        return rc.getLocales().get(locale);
    }
    public ResultCodeInfo getInfo (String rc, String locale) {
        ResultCode resultCode = get (rc);
        return (resultCode != null) ? getInfo (resultCode, locale) : null;
    }
}

