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

package org.jpos.qi.eeuser;

import com.vaadin.data.Container;
import com.vaadin.data.Validator;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.jpos.ee.*;
import org.jpos.qi.EntityContainer;
import org.jpos.qi.QIHelper;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RolesHelper extends QIHelper {
    protected RolesHelper() {
        super(Role.class);
    }

    public Container createContainer() {
        Map<String, Class> properties = new LinkedHashMap<String, Class>();
        properties.put("id", Integer.class);
        properties.put("name", String.class);
        List sortable = Arrays.asList("id", "name");
        return new EntityContainer(Role.class, properties, sortable);
    }

    @Override
    public boolean updateEntity (BeanFieldGroup fieldGroup) throws
            BLException, FieldGroup.CommitException, CloneNotSupportedException {
        BeanItem<Role> old = fieldGroup.getItemDataSource();
        Object oldRole = old.getBean().clone();
        fieldGroup.commit();
        BeanItem<Role> item = fieldGroup.getItemDataSource();
        Role r = item.getBean();
        try {
            return (boolean) DB.execWithTransaction( (db) -> {
                db.session().merge(r);
                return addRevisionUpdated(db, getEntityName(),
                        String.valueOf(r.getId()),
                        oldRole,
                        r,
                        new String[]{"id", "name", "permissions"});
            });
        } catch (Exception e) {
            throw new BLException(e.getMessage());
        }
    }

    public SysConfig[] getPermissions () {
        try {
            return (SysConfig[]) DB.exec( (db) -> {
                SysConfigManager mgr = new SysConfigManager(db, "perm.");
                return mgr.getAll();
            });
        } catch (Exception e) {
            getApp().getLog().error(e);
            return null;
        }
    }

    public Role getRoleByName(String name) {
        try {
            return (Role) DB.exec((db) ->{
                Criteria crit = db.session().createCriteria(Role.class);
                crit = crit.add(Restrictions.eq("name", name));
                return crit.uniqueResult();
            });
        } catch (Exception e) {
            getApp().getLog().error(e);
            return null;
        }
    }

    public Validator getNameTakenValidator(final Role selectedR) {
        Validator nameTaken = new Validator() {
            public boolean isValid(Object value) {
                String oldName = selectedR.getName();
                if (oldName!= null)
                    return getRoleByName((String) value) == null || oldName.trim().equals(((String) value).trim());
                else
                    return getRoleByName((String) value) == null;
            }
            public void validate(Object value) throws InvalidValueException {
                if (!isValid(value)) {
                    throw new Validator.InvalidValueException(getApp().getMessage("errorMessage.fieldTaken",value));

                }
            }
        };
        return nameTaken;
    }
}
