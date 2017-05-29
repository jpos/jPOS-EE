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

package org.jpos.qi.system;

import com.vaadin.data.Binder;
import org.jpos.ee.BLException;
import org.jpos.ee.DB;
import org.jpos.ee.SysLog;
import org.jpos.ee.SysLogManager;
import org.jpos.qi.QIHelper;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by jr on 6/16/16.
 */
public class AuditLogHelper extends QIHelper {

    protected AuditLogHelper() {
        super(SysLog.class);
    }

    @Override
    public Stream getAll(int offset, int limit, Map<String, Boolean> orders) throws Exception {
        List<SysLog> list = (List<SysLog>) DB.exec(db -> {
            SysLogManager mgr = new SysLogManager(db);
            return mgr.getAll(offset,limit,orders);
        });
        return list.stream();
    }

    @Override
    public int getItemCount() throws Exception {
        return (int) DB.exec(db -> {
            SysLogManager mgr = new SysLogManager(db);
            return mgr.getItemCount();
        });
    }

    @Override
    public String getItemId(Object item) {
        return String.valueOf(((SysLog)item).getId());
    }

    @Override
    public boolean updateEntity(Binder binder) throws BLException {
        return false;
    }
}
