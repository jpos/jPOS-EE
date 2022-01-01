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

package org.jpos.qi.system;

import com.vaadin.data.Binder;
import com.vaadin.data.Validator;
import com.vaadin.server.SerializableFunction;
import com.vaadin.shared.data.sort.SortDirection;
import com.vaadin.ui.Component;
import com.vaadin.ui.Grid;
import com.vaadin.ui.renderers.HtmlRenderer;
import org.jpos.ee.Revision;
import org.jpos.ee.User;
import org.jpos.qi.QIEntityView;
import org.jpos.qi.QIHelper;
import org.jpos.qi.util.ReadOnlyField;

import java.util.List;

import static org.jpos.qi.util.QIUtils.getCaptionFromId;


/**
 * Created by spr on 6/15/16.
 */
public class RevisionsView extends QIEntityView<Revision> {

    public RevisionsView() {
        super(Revision.class);
        setShowRevisionHistoryButton(false);
    }

    @Override
    public QIHelper createHelper() {
        return new RevisionsHelper();
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
    protected Component buildAndBindCustomComponent(String propertyId) {
        List<Validator> validators = getFieldFactory().getValidators(propertyId);
        ReadOnlyField field = new ReadOnlyField();
        field.setCaption(getCaptionFromId(propertyId));
        Binder binder = getBinder();
        Binder.BindingBuilder builder = binder.forField(field).withNullRepresentation("");
        if ("author".equals(propertyId)) {
             builder = builder.withConverter(userInput -> userInput,
                    (SerializableFunction<User,String>) toPresentation ->
                            ((RevisionsHelper)getHelper()).getAuthorLink(toPresentation.getNickAndId(), String.valueOf(getInstance().getId())));
        }
//        if ("ref".equals(propertyId)) {
//            builder = builder.withConverter(userInput -> userInput,
//                    (SerializableFunction<String,String>) toPresentation ->
//                            ((RevisionsHelper)getHelper()).getLink(toPresentation, String.valueOf(getInstance().getId())));
//        }
        validators.forEach(builder::withValidator);
        builder.bind(propertyId);
        return field;
    }

    @Override
    public void setGridGetters() {
        Grid<Revision> g = this.getGrid();
        g.addColumn(Revision::getId).setId("id");
        g.addColumn(Revision::getDate).setId("date");
        g.addColumn(Revision::getRef).setId("ref");
        //g.addColumn(revision ->
        //        ((RevisionsHelper)getHelper()).getLink(revision.getRef(),""), new HtmlRenderer("")).setId("ref");
        g.addColumn(revision ->
                        ((RevisionsHelper)getHelper()).getAuthorLink(revision.getAuthor().getNickAndId(),"")
                ,new HtmlRenderer("")).setId("author");
        g.addColumn(revision -> {
            String info = revision.getInfo();
            return info.length() > 40 ? info.substring(0, 40) + "..." : info;
        },new HtmlRenderer("")).setId("info");
    }

    @Override
    public void formatGrid() {
        super.formatGrid();
        getGrid().sort(getGrid().getColumn("date"), SortDirection.ASCENDING);
    }
}
