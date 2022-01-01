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

import com.vaadin.data.provider.DataProvider;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.ItemCaptionGenerator;
import org.jpos.ee.DB;
import org.jpos.ee.SysConfig;
import org.jpos.ee.SysConfigManager;

import java.util.Collection;
import java.util.List;

public class SysConfigComboBox extends ComboBox {
    public SysConfigComboBox (String caption, DataProvider dataProvider) {
        super(caption);
        setDataProvider(dataProvider);
        setItemCaptionGenerator((ItemCaptionGenerator<SysConfig>) SysConfig::getValue);
        setEmptySelectionAllowed(false);
    }


    public SysConfigComboBox (String caption, Collection<SysConfig> items) {
        super(caption);
        setItems(items);
        setItemCaptionGenerator((ItemCaptionGenerator<SysConfig>) SysConfig::getValue);
        setEmptySelectionAllowed(false);
    }

    public SysConfigComboBox (String caption, String prefix) throws Exception {
        this(caption, prefix, false);
    }

    public SysConfigComboBox (String caption, String prefix, boolean includeId) throws Exception {
        super(caption);
        List items = DB.exec(db -> {
            SysConfigManager mgr = new SysConfigManager(db, prefix);
            return mgr.getAllByValue();
        });
        setItems(items);
        setItemCaptionGenerator((ItemCaptionGenerator<SysConfig>) item -> {
            if (includeId)
                return stripPrefixFromId(prefix, item.getId()) + " - " + item.getValue();
            else
                return item.getValue();
        });
        setEmptySelectionAllowed(false);
    }

    private String stripPrefixFromId (String prefix, String id) {
        return prefix != null ? id.substring(prefix.length()) : id;
    }
}
