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

package org.jpos.qi.sysconfig;

import com.vaadin.data.Converter;
import com.vaadin.data.Result;
import com.vaadin.data.ValueContext;
import org.jpos.ee.DB;
import org.jpos.ee.SysConfig;
import org.jpos.ee.SysConfigManager;
import org.jpos.qi.QI;

public class SysConfigConverter implements Converter<SysConfig, String> {
    private String prefix;
    private boolean useValue;

    public SysConfigConverter () {
        this(null, false);
    }

    public SysConfigConverter (String prefix) {
        this (prefix, false);
    }
    public SysConfigConverter (String prefix, boolean useValue) {
        super();
        this.prefix = prefix;
        this.useValue = useValue;
    }

    @Override
    public Result<String> convertToModel(SysConfig value, ValueContext context) {
        if (value == null)
            return Result.ok("");
        else {
            String id = prefix != null ? value.getId().substring(prefix.length()) : value.getId();
            String modelToSave = useValue ? value.getValue() : id;
            return Result.ok(modelToSave);
        }
    }

    @Override
    public SysConfig convertToPresentation(String value, ValueContext context) {
        if (value != null) {
            try {
                return DB.exec( (db) -> {
                    SysConfigManager mgr = new SysConfigManager(db, prefix);
                    return mgr.getObject(value);
                });
            } catch (Exception e) {
                QI.getQI().getLog().error(e);
            }
        }
        return null;
    }
}
