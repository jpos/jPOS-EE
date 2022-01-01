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

import com.vaadin.server.UserError;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.ItemCaptionGenerator;
import com.vaadin.ui.themes.ValoTheme;
import org.jpos.ee.DB;
import org.jpos.ee.SysConfigManager;
import org.jpos.gl.GLSession;
import org.jpos.gl.Journal;
import org.jpos.qi.QI;

import java.util.Collections;
import java.util.List;

public class JournalsCombo extends ComboBox<Journal> {
    /**
     * Create and fill journals combo
     */
    public JournalsCombo (boolean required) {
        super(QI.getQI().getMessage("journal"));
        setItemCaptionGenerator((ItemCaptionGenerator<Journal>) item -> item != null ? item.getName() : "No Journals");
        setStyleName(ValoTheme.COMBOBOX_SMALL);
        setEmptySelectionAllowed(!required);
        List<Journal> journals = getJournals();
        if (journals != null && journals.size() > 0) {
            setItems(journals);
            String defJournalName= getDefaultJournalName();
            if (defJournalName != null) {
                Journal defJournal= journals.stream().filter(j ->
                        defJournalName.equals(j.getName())).findFirst().orElse(null);
                setSelectedItem(defJournal);
            }
        } else {
            setItems((Collections.EMPTY_LIST));
            setComponentError(new UserError(QI.getQI().getMessage("errorMessage.noJournal")));
        }
    }

    @Override
    public void setValue (Journal value) {
        if (!isEmpty()) {
            super.setValue(value);
        }
    }

    private List<Journal> getJournals () {
        try {
            return DB.exec(db -> {
                GLSession session = new GLSession(db);
                return session.getAllJournals();
            });
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
            return null;
        }
    }

    private String getDefaultJournalName() {
        try {
            return DB.exec(db -> {
                SysConfigManager syscMgr= new SysConfigManager(db);
                return  syscMgr.get(MiniGLConstants.DEFAULT_GL_JOURNAL.toString(), "jcard");
            });
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
            return null;
        }
    }
}
