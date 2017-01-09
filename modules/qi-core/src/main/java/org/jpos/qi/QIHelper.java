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

import com.vaadin.data.Container;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.UI;
import org.jpos.core.Configuration;
import org.jpos.ee.BLException;
import org.jpos.ee.DB;
import org.jpos.ee.RevisionManager;
import org.jpos.ee.User;
import org.jpos.util.BeanDiff;

public abstract class QIHelper {

    private User user;
    private QI app;
    private String entityName;
    protected Class clazz;
    private Configuration cfg;

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

    //Must be executed inside a DB.execWithTransaction
    public boolean addRevisionUpdated (DB db, String entity, String id, Object oldItem, Object newItem, String[] itemProps) {
        StringBuilder revInfo = new StringBuilder();
        BeanDiff bd = new BeanDiff (oldItem, newItem, itemProps);
        revInfo.append(bd.toString());
        if (revInfo.length() > 0) {
            User author = getUser();
            String info = revInfo.length() < 1000 ? revInfo.toString() : revInfo.toString().substring(0, 990) + "...";
            RevisionManager revMgr = new RevisionManager(db);
            revMgr.createRevision (author, entity.toLowerCase() + "." + id, info);
            return true;
        } else {
            return false;
        }
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

    public boolean removeEntity(BeanFieldGroup fieldGroup) throws BLException {
        BeanItem item = fieldGroup.getItemDataSource();
        Object t = item.getBean();
        if ( t!=null ) {
            try {
                DB.execWithTransaction(db -> {
                    db.session().delete(t);
                    addRevisionRemoved(db, getEntityName(), String.valueOf(item.getItemProperty("id").getValue()));
                    return null;
                });
            } catch (Exception e) {
                throw new BLException(e.getMessage());
            }
            return true;
        }
        return false;
    }

    public boolean saveEntity(BeanFieldGroup fieldGroup) throws FieldGroup.CommitException, BLException {
        fieldGroup.commit();
        BeanItem item = fieldGroup.getItemDataSource();
        try {
            return (boolean) DB.execWithTransaction(db -> {
                db.save(item.getBean());
                addRevisionCreated(db, getEntityName(), String.valueOf(item.getItemProperty("id")));
                return true;
            });
        } catch (Exception e) {
            throw new BLException(e.getMessage());
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
            String name = cfg.get("entityName");
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

    public abstract boolean updateEntity(BeanFieldGroup fieldGroup) throws FieldGroup.CommitException,
            BLException, CloneNotSupportedException;

    public abstract Container createContainer();

    protected Configuration getConfiguration() { return cfg; }

    public void setConfiguration (Configuration cfg) {
        this.cfg = cfg;
    }
}
