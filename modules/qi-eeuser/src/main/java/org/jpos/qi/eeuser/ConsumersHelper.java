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

package org.jpos.qi.eeuser;

import com.vaadin.data.Binder;
import com.vaadin.data.provider.CallbackDataProvider;
import com.vaadin.data.provider.ConfigurableFilterDataProvider;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.QuerySortOrder;
import com.vaadin.shared.data.sort.SortDirection;
import org.jpos.ee.*;
import org.jpos.qi.QIHelper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Stream;

/**
 * Created by jr on 9/11/17.
 */
public class ConsumersHelper extends QIHelper {

    protected ConsumersHelper(Class clazz) {
        super(clazz);
    }

    @Override
    public Object createNewEntity() {
        try {
            Consumer c = (Consumer) clazz.newInstance();
            c.setId(UUID.randomUUID().toString());
            return c;
        } catch (InstantiationException|IllegalAccessException e) {
            getApp().getLog().error("error instantiating entity", e);
            return null;
        }
    }

    @Override
    public boolean updateEntity(Binder binder) throws BLException {
        try {
            return DB.execWithTransaction((db) -> {
                Consumer oldConsumer = (Consumer) ((Consumer) getOriginalEntity()).clone();
                binder.writeBean(getOriginalEntity());
                Consumer newConsumer = (Consumer) getOriginalEntity();
                db.session().merge(newConsumer);
                return addRevisionUpdated(db, getEntityName(),
                        String.valueOf(newConsumer.getId()),
                        oldConsumer,
                        newConsumer,
                        new String[]{"active","roles","startDate","endDate"});
            });
        } catch (Exception e) {
            getApp().getLog().error(e);
            return false;
        }
    }

    //not used
    @Override
    public Stream getAll(int offset, int limit, Map<String, Boolean> orders) throws Exception {
        return null;
    }

    //not used
    @Override
    public int getItemCount() throws Exception {
        return 0;
    }

    public Stream getAll(int offset, int limit, Map<String, Boolean> orders, User user) throws Exception {
        return (DB.exec(db -> {
            ConsumerManager mgr = new ConsumerManager(db,user);
            return mgr.getAll(offset,limit,orders);
        })).stream();
    }

    public int getItemCount(User user) throws Exception {
        return DB.exec(db -> {
            ConsumerManager mgr = new ConsumerManager(db,user);
            return mgr.getItemCount();
        });
    }

    @Override
    public String getItemId(Object item) {
        return ((Consumer)item).getId();
    }

    @Override
    public Object getEntityByParam(String param)  {
        try {
            return  DB.exec(db -> {
                db.session().enableFetchProfile("eager");
                return db.session().get(clazz, param);
            });
        } catch (Exception e) {
            getApp().getLog().error(e);
            return null;
        }
    }

    //Overridden to call custom getAll that includes dateRange filter,
    // and to include the ConfigurableFilterDataProvider wrapper
    @Override
    public DataProvider getDataProvider() {
        Map<String,Boolean> orders = new HashMap<>();
        DataProvider dataProvider = DataProvider.fromCallbacks(
                (CallbackDataProvider.FetchCallback) query -> {
                    int offset = query.getOffset();
                    int limit = query.getLimit();
                    for (Object o : query.getSortOrders()) {
                        QuerySortOrder order = (QuerySortOrder) o;
                        orders.put(order.getSorted(), order.getDirection() == SortDirection.DESCENDING);
                    }
                    User user = (User) query.getFilter().orElse(null);
                    try {
                        return getAll(offset,limit,orders,user);
                    } catch (Exception e) {
                        getApp().getLog().error(e);
                        return null;
                    }
                },
                (CallbackDataProvider.CountCallback) query -> {
                    User user = (User) query.getFilter().orElse(null);
                    try {
                        return getItemCount(user);
                    } catch (Exception e) {
                        getApp().getLog().error(e);
                        return 0;
                    }
                });
        return (ConfigurableFilterDataProvider<Consumer,Void,User>) dataProvider.withConfigurableFilter();
    }

    public List<Role> getRoles() {
        try {
            return DB.exec(db-> {
                RoleManager mgr = new RoleManager(db);
                return mgr.getAll();
            });
        } catch (Exception e) {
            getApp().getLog().error(e);
            return null;
        }
    }
}
