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

import com.vaadin.ui.Grid;
import org.jpos.ee.SysLog;
import org.jpos.qi.QIEntityView;
import org.jpos.qi.QIHelper;

/**
 * Created by jr on 6/16/16.
 */
public class AuditLogView extends QIEntityView<SysLog> {

    public AuditLogView() {
        super(SysLog.class,"syslog");
    }
    @Override
    public QIHelper createHelper() {
        return new AuditLogHelper();
    }

    @Override
    public Object getEntity(Object entity) {
        if (entity instanceof SysLog) {
            SysLog s = (SysLog) entity;
            if (s.getId() != null)
                return getHelper().getEntityByParam(String.valueOf(((SysLog) entity).getId()));
        }
        return null;
    }

    @Override
    public String getHeaderSpecificTitle(Object entity) {
        if (entity instanceof SysLog) {
            SysLog s = (SysLog) entity;
            return s.getId() != 0 ? s.getId().toString() : "New";
        } else {
            return null;
        }
    }

    @Override
    public void formatGrid() {
        super.formatGrid();
        getGrid().getColumn("summary").setExpandRatio(3);
    }

    @Override
    public void setGridGetters() {
        Grid<SysLog> g = getGrid();
        g.addColumn(SysLog::getId).setId("id");
        g.addColumn(SysLog::getDate).setId("date");
        g.addColumn(SysLog::isDeleted).setId("deleted");
        g.addColumn(SysLog::getSource).setId("source");
        g.addColumn(SysLog::getType).setId("type");
        g.addColumn(SysLog::getSeverityAsString).setId("severity");
        g.addColumn(SysLog::getSummary).setId("summary");
        g.addColumn(SysLog::getDetail).setId("detail");
        g.addColumn(SysLog::getTrace).setId("trace");
    }

}
