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

package org.jpos.qi;

import com.vaadin.data.Binder;
import com.vaadin.data.Validator;
import com.vaadin.data.provider.CallbackDataProvider;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.QuerySortOrder;
import com.vaadin.shared.data.sort.SortDirection;
import com.vaadin.ui.UI;
import org.jpos.core.Configuration;
import org.jpos.ee.*;
import org.jpos.ee.Cloneable;
import org.jpos.util.BeanDiff;

import java.util.*;
import java.util.stream.Stream;

public abstract class QIHelper {

    private User user;
    private QI app;
    private String entityName;
    protected Class clazz;
    private Configuration cfg;
    private Object originalEntity;
    private Map<String, List<Validator>> validators = new HashMap<>();


    protected QIHelper(Class clazz) {
        app = (QI) UI.getCurrent();
        user = app.getUser();
        this.clazz = clazz;
    }

    //Must be executed inside a DB.execWithTransaction
    public void addRevisionCreated (DB db, String entity, String id) {
        RevisionManager revMgr = new RevisionManager(db);
        User author = getUser();
        String info = getApp().getMessage("created", entity);
        revMgr.createRevision(author, entity.toLowerCase() + "." + id, info);
    }

    //Must be executed inside a DB.execWithTransaction
    public void addRevisionRemoved (DB db, String entity, String id) {
        RevisionManager revMgr = new RevisionManager(db);
        User author = getUser();
        String info = getApp().getMessage("removed", entity);
        revMgr.createRevision(author, entity.toLowerCase() + "." + id, info);
    }

    public boolean addRevisionUpdated (DB db, String entity, String id, Object oldItem, Object newItem,
                                       String[] itemProps)
    {
        return this.addRevisionUpdated(db, entity, id, oldItem, newItem, itemProps, null);
    }
    //Must be executed inside a DB.execWithTransaction
    public boolean addRevisionUpdated (DB db, String entity, String id, Object oldItem, Object newItem,
                                       String[] itemProps, String extraInfo)
    {
        StringBuilder revInfo = new StringBuilder();
        BeanDiff bd = new BeanDiff (oldItem, newItem, itemProps);
        revInfo.append(bd.toString());
        if (revInfo.length() > 0) {
            User author = getUser();
            StringJoiner info = new StringJoiner(BeanDiff.LINESEP);
            if (extraInfo != null && !extraInfo.isEmpty())
                info.add(extraInfo);
            info.add(revInfo.length() < 1000 ? revInfo.toString() : revInfo.substring(0, 990) + "...");
            RevisionManager revMgr = new RevisionManager(db);
            revMgr.createRevision (author, entity.toLowerCase() + "." + id, info.toString());
            return true;
        } else {
            return false;
        }
    }

    public RevisionsPanel createAndLoadRevisionHistoryPanel (String ref) throws Exception {
        return DB.exec(db -> new RevisionsPanel(ref, db));
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public QI getApp() {
        return app;
    }

    public void setApp(QI app) {
        this.app = app;
    }

    public boolean removeEntity() throws BLException {
        Object entity = getOriginalEntity();
        try {
            return DB.execWithTransaction(db -> {
                db.session().delete(entity);
                addRevisionRemoved(db, getEntityName(), getItemId(entity));
                return true;
            });
        } catch (Exception e) {
            throw new BLException(e.getMessage());
        }
    }

    public boolean saveEntity(Binder binder) throws BLException {
        try {
            return DB.execWithTransaction(db -> {
                if (binder.writeBeanIfValid(getOriginalEntity())) {
                    db.save(getOriginalEntity());
                    addRevisionCreated(db, getEntityName(), getItemId(getOriginalEntity()));
                    return true;
                }
                return false;
            });
        } catch (Exception e) {
            getApp().getLog().error(e);
            getApp().displayNotification(getApp().getMessage("errorMessage.unexpected"));
            return false;
        }
    }

    public Object getEntityByParam(String param)  {
        //most id are longs, if id is of other type this method must be overridden
        try {
            return  DB.exec(db -> db.session().get(clazz, Long.parseLong(param)));
        } catch (Exception e) {
            getApp().getLog().error(e);
            return null;
        }
    }

    public String getEntityName() {
        if (entityName == null || entityName.isEmpty()) {
            String name = cfg != null ? cfg.get("entityName", null) : null;
            if (name == null || name.isEmpty()) {
                QI.getQI().displayError("view.config.error", "view.config.error.detail");
            }
            this.entityName = name;
        }
        return entityName;
    }


    public Object createNewEntity() {
        try {
            return clazz.newInstance();
        } catch (InstantiationException|IllegalAccessException e) {
            getApp().getLog().error("error instantiating entity", e);
            return null;
        }
    }

    public abstract boolean updateEntity(Binder binder) throws
            BLException;

    @SuppressWarnings("unchecked")
    public DataProvider getDataProvider() {
        DataProvider dataProvider = DataProvider.fromCallbacks(
                (CallbackDataProvider.FetchCallback) query -> {
                    int offset = query.getOffset();
                    int limit = query.getLimit();
                    Iterator it = query.getSortOrders().iterator();
                    Map<String,Boolean> orders = new LinkedHashMap<>();
                    while (it.hasNext()) {
                        QuerySortOrder order = (QuerySortOrder) it.next();
                        orders.put(order.getSorted(),order.getDirection() == SortDirection.DESCENDING);
                    }
                    try {
                        return getAll(offset,limit,orders);
                    } catch (Exception e) {
                        getApp().getLog().error(e);
                        return null;
                    }
                },
                (CallbackDataProvider.CountCallback) query -> {
                    try {
                        return getItemCount();
                    } catch (Exception e) {
                        getApp().getLog().error(e);
                        return 0;
                    }
                });
        return dataProvider;
    }

    public DataProvider getSysConfigsDataProvider (String prefix) {
        Map<String,Boolean> orders = new HashMap<>();
        return DataProvider.fromCallbacks(
                (CallbackDataProvider.FetchCallback) query -> {
                    int offset = query.getOffset();
                    int limit = query.getLimit();
                    Iterator it = query.getSortOrders().iterator();
                    while (it.hasNext()) {
                        QuerySortOrder order = (QuerySortOrder) it.next();
                        orders.put(order.getSorted(),order.getDirection() == SortDirection.DESCENDING);
                    }
                    try {
                        return getSysConfigs(offset,limit,orders, prefix);
                    } catch (Exception e) {
                        getApp().getLog().error(e);
                        return null;
                    }
                },
                (CallbackDataProvider.CountCallback<SysConfig, Void>) query -> {
                    try {
                        return getSysConfigsCount(prefix);
                    } catch (Exception e) {
                        getApp().getLog().error(e);
                        return 0;
                    }
                });
    }

    public Collection<SysConfig> getSysConfigsByValue (String prefix) {
        try {
            return DB.exec(db -> {
                SysConfigManager mgr = new SysConfigManager(db, prefix);
                return mgr.getAllByValue();
            });
        } catch (Exception e) {
            getApp().getLog().createError(e.getMessage());
            return null;
        }
    }

    private Stream getSysConfigs (int offset,int limit,Map<String,Boolean> orders, String prefix) throws Exception {
        return ((List) DB.exec(db -> {
            SysConfigManager mgr = new SysConfigManager(db, prefix);
            return mgr.getAll(offset,limit,orders);
        })).stream();
    }

    private int getSysConfigsCount (String prefix) throws Exception {
        return DB.exec(db -> {
            SysConfigManager mgr = new SysConfigManager(db, prefix);
            return mgr.getItemCount();
        });
    }

    public Stream getAll(int offset, int limit, Map<String, Boolean> orders) throws Exception {
        List items = DB.exec(db -> {
            DBManager mgr = new DBManager(db, clazz);
            return mgr.getAll(offset,limit,orders);
        });
        return items.stream();
    }

    public int getItemCount() throws Exception {
        return DB.exec(db -> {
            DBManager mgr = new DBManager(db, clazz);
            return mgr.getItemCount();
        });
    }

    public abstract String getItemId(Object item);

    protected Configuration getConfiguration() { return cfg; }

    public void setConfiguration (Configuration cfg) {
        this.cfg = cfg;
    }

    public Object getOriginalEntity() {
        return originalEntity;
    }

    public void setOriginalEntity(Object originalEntity) {
        this.originalEntity = originalEntity;
    }


    public void addValidators(String key, Validator ... validators){
        List<Validator> v = this.validators.computeIfAbsent(key, k -> new LinkedList<>());
        for (Validator validator: validators) v.add(validator);
    }

    public List<Validator> getValidators(String key) {
        return validators.getOrDefault(key, Collections.emptyList());
    }

    public Map<String, List<Validator>> getValidators() {
        return validators;
    }
}
