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

import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.fieldgroup.FieldGroupFieldFactory;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.ui.Field;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Layout;
import com.vaadin.ui.renderers.HtmlRenderer;
import org.jpos.ee.Revision;
import org.jpos.ee.User;
import org.jpos.qi.QIEntityView;
import org.jpos.qi.QIHelper;
import org.jpos.qi.ReadOnlyField;
import org.jpos.qi.components.QIFieldFactory;


/**
 * Created by spr on 6/15/16.
 */
public class RevisionsView extends QIEntityView<Revision> {

    public RevisionsView() {
        super(Revision.class, "revision_history");
        setShowRevisionHistoryButton(false);
    }

    @Override
    public FieldGroupFieldFactory createFieldFactory() {
        return new QIFieldFactory() {
            @Override
            public <T extends Field> T createField(Class<?> dataType, Class<T> fieldType) {
                ReadOnlyField f = new ReadOnlyField();
                if (User.class.equals(dataType)) {
                    f.setConverter(((RevisionsHelper)getHelper()).getAuthorConverter(""));
                }
                return (T) f;
            }
        };
    }

    @Override
    public QIHelper createHelper() {
        return new RevisionsHelper();
    }

    @Override
    protected Layout addFields (FieldGroup fieldGroup) {
        Layout l = super.addFields(fieldGroup);
        ReadOnlyField ref = (ReadOnlyField) fieldGroup.getField("ref");
        ReadOnlyField author = (ReadOnlyField) fieldGroup.getField("author");
        Revision current = (Revision) ((BeanFieldGroup)fieldGroup).getItemDataSource().getBean();
        ref.setConverter(((RevisionsHelper)getHelper()).getRefConverter(String.valueOf(current.getId())));
        author.setConverter(((RevisionsHelper)getHelper()).getAuthorConverter(String.valueOf(current.getId())));
        return l;
    }

    @Override
    public Object getEntity(Object entity) {
        if (entity instanceof Revision) {
            Revision r = (Revision) entity;
            if (r.getId() != null) {
                return getHelper().getEntityByParam(String.valueOf(r.getId()));
            }
        }
        return null;
    }

    @Override
    public String getHeaderSpecificTitle(Object entity) {
        if (entity instanceof Revision) {
            Revision r = (Revision) entity;
            return r.getId() + " - " + r.getRef();
        } else {
            return null;
        }
    }

    @Override
    public void formatGrid (Grid grid) {
        super.formatGrid(grid);
        grid.getColumn("info").setRenderer(new HtmlRenderer("")).setMaximumWidth(1000);
        grid.getColumn("author").setConverter(((RevisionsHelper)getHelper()).getAuthorConverter("")).setRenderer(new HtmlRenderer(""));
        grid.getColumn("ref").setRenderer(new HtmlRenderer("")).setConverter(((RevisionsHelper)getHelper()).getRefConverter(""));
        grid.removeItemClickListener((ItemClickEvent.ItemClickListener) grid.getListeners(ItemClickEvent.class).iterator().next());
        grid.addItemClickListener(event -> {
            if (!"ref,author".contains(event.getPropertyId().toString())) {
                String url = getGeneralRoute() + "/" + event.getItemId();
                getApp().getNavigator().navigateTo(url);
            }
        });
    }
}
