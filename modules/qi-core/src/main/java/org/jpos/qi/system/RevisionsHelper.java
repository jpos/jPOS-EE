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
import org.apache.commons.lang3.StringUtils;
import org.jpos.ee.*;
import org.jpos.qi.QIHelper;
import org.jpos.qi.QINavigator;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by spr on 6/15/16.
 */
public class RevisionsHelper extends QIHelper {

    protected RevisionsHelper () {
        super(Revision.class);
    }

    @Override
    public Stream getAll(int offset, int limit, Map<String, Boolean> orders) throws Exception {
        List<Revision> list = (List<Revision>) DB.exec(db -> {
            RevisionManager mgr = new RevisionManager(db);
            return mgr.getAll(offset,limit,orders);
        });
        return list.stream();
    }

    @Override
    public int getItemCount() throws Exception {
        return (int) DB.exec(db -> {
            RevisionManager mgr = new RevisionManager(db);
            return mgr.getItemCount();
        });
    }

    @Override
    public String getItemId(Object item) {
        return String.valueOf(((Revision)item).getId());
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
    public boolean updateEntity(Binder binder) throws BLException {
        return false;
    }

    protected String getLink(String ref, String currentRevision) {
        String[] data = ref.split("\\.");
        if (data.length >= 2) {
            String backRoute = "revision_history" + (!currentRevision.isEmpty() ? "." + currentRevision : "");
            String entity = data[0];
            String id = StringUtils.remove(ref,entity + ".");
            String route = ((QINavigator) getApp().getNavigator()).getRouteForEntity(entity);
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


//    protected Converter getRefConverter(String currentRevision) {
//        return new Converter<String, String>() {
//            @Override
//            public String convertToModel(String value, Class<? extends String> targetType, Locale locale) throws ConversionException {
//                if (value != null) {
//                    return value.split("<,>")[1];
//                }
//                return "";
//            }
//
//            @Override
//            public String convertToPresentation(String value, Class<? extends String> targetType, Locale locale) throws ConversionException {
//                return getLink(value,currentRevision);
//            }
//
//            @Override
//            public Class<String> getModelType() {
//                return String.class;
//            }
//
//            @Override
//            public Class<String> getPresentationType() {
//                return String.class;
//            }
//        };
//    }

//    protected Converter getAuthorConverter(String currentRevision) {
//        return new UserConverter() {
//            @Override
//            public String convertToPresentation(User value, Class<? extends String> targetType, Locale locale) throws ConversionException {
//                if (value == null)
//                    return null;
//                else {
//                    return getAuthorLink(value.getNickAndId(),currentRevision);
//                }
//            }
//        };
//    }
}
