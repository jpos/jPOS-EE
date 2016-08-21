/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2016 Alejandro P. Revilla
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

import com.vaadin.data.Container;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.converter.Converter;
import org.jpos.ee.BLException;
import org.jpos.ee.DB;
import org.jpos.ee.Revision;
import org.jpos.ee.User;
import org.jpos.qi.EntityContainer;
import org.jpos.qi.QIHelper;
import org.jpos.qi.QINavigator;
import org.jpos.util.UserConverter;

import java.util.*;

/**
 * Created by spr on 6/15/16.
 */
public class RevisionsHelper extends QIHelper {

    protected RevisionsHelper () {
        super(Revision.class);
    }

    @Override
    public Container createContainer() {
        Map<String, Class> properties = new LinkedHashMap<>();
        properties.put("id", Integer.class);
        properties.put("date", Date.class);
        properties.put("info", String.class);
        properties.put("ref", String.class);
        properties.put("author", User.class);

        List sortable = Arrays.asList("id", "date", "info", "ref", "author");
        EntityContainer container = new EntityContainer<>(Revision.class, properties, sortable);
        container.setNormalOrder(false);
        return container;
    }

    // Need eager mode to fetch User (author).
    @Override
    public Object getEntityByParam(String param)  {
        //most id are longs, if id is of other type this method must be overriden
        try {
            return  DB.exec(db -> {
                db.session().enableFetchProfile("eager");
                return db.session().get(clazz, new Long(param));
            });
        } catch (Exception e) {
            getApp().getLog().error(e);
            return null;
        }
    }

    @Override
    public boolean updateEntity(BeanFieldGroup fieldGroup) throws FieldGroup.CommitException, BLException, CloneNotSupportedException {
        return false;
    }

    protected String getLink(String ref, String currentRevision) {
        String[] data = ref.split("\\.");
        if (data.length == 2) {
            String backRoute = "revision_history" + (!currentRevision.isEmpty() ? "." + currentRevision : "");
            String id = data[1];
            String route = ((QINavigator) getApp().getNavigator()).getRouteForEntity(data[0]);
            if (route != null)
                return "<a href=\"#!/" + route + "/" + id + "?back=" +  backRoute +"\">" + ref + "</a>";
        }
        return ref;
    }

    protected String getAuthorLink(String nickAndId, String currentRevision) {
        String[] data = nickAndId.split("\\(|\\)");
        String backRoute = "revision_history" + (!currentRevision.isEmpty() ? "." + currentRevision : "");
        return "<a href=\"#!/users/" + data[1] + "?back="+ backRoute +"\">" + nickAndId + "</a>";
    }


    protected Converter getRefConverter(String currentRevision) {
        return new Converter<String, String>() {
            @Override
            public String convertToModel(String value, Class<? extends String> targetType, Locale locale) throws ConversionException {
                if (value != null) {
                    return value.split("<,>")[1];
                }
                return "";
            }

            @Override
            public String convertToPresentation(String value, Class<? extends String> targetType, Locale locale) throws ConversionException {
                return getLink(value,currentRevision);
            }

            @Override
            public Class<String> getModelType() {
                return String.class;
            }

            @Override
            public Class<String> getPresentationType() {
                return String.class;
            }
        };
    }

    protected Converter getAuthorConverter(String currentRevision) {
        return new UserConverter() {
            @Override
            public String convertToPresentation(User value, Class<? extends String> targetType, Locale locale) throws ConversionException {
                if (value == null)
                    return null;
                else {
                    return getAuthorLink(value.getNickAndId(),currentRevision);
                }
            }
        };
    }
}
