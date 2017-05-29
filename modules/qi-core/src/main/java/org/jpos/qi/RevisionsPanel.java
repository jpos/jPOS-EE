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

package org.jpos.qi;


import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.*;
import org.jpos.ee.DB;
import org.jpos.ee.Revision;
import org.jpos.ee.RevisionManager;

import java.util.List;

public class RevisionsPanel extends Panel {
    private String ref;

    public RevisionsPanel (String ref, DB db) {
        this.ref = ref;
        QI app = (QI) UI.getCurrent();
        VerticalLayout main = new VerticalLayout();
        main.setSpacing(true);
        main.setMargin(true);
        setContent(main);
        RevisionManager revmgr = new RevisionManager (db);
        List<Revision> revisions = revmgr.getRevisionsByRef(ref);
        if (revisions != null && revisions.size() > 0) {
            for (Revision r : revisions)
                addRevision (r);
        } else {
            Label noHistoryLabel = new Label(app.getMessage("errorMessage.noRevision"));
            main.addComponent(noHistoryLabel);
        }
        setCaption(((QI) UI.getCurrent()).getMessage("revision.history"));
        addStyleName(revisions.size() > 0 ? "revision-history" : "invisible");
    }
    private void addRevision (Revision r) {
        Label author = new Label("<strong>" + r.getAuthor().getName() + "</strong>", ContentMode.HTML);
        Label date = new Label(r.getDate().toString());
        Label info = new Label(r.getInfo(), ContentMode.HTML);
        author.setWidth("60%");

        HorizontalLayout hl = new HorizontalLayout();
        hl.setHeight("30px");
        hl.setWidth("100%");
        hl.addComponent(author);
        hl.addComponent (date);

        Layout content = (Layout) getContent();
        content.addComponent(hl);
        content.addComponent(info);
        content.addComponent(new Label("<hr/>", ContentMode.HTML));
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
