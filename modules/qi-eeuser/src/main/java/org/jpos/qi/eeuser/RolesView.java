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

package org.jpos.qi.eeuser;

import com.vaadin.data.Binder;
import com.vaadin.data.Validator;
import com.vaadin.ui.CheckBoxGroup;
import com.vaadin.ui.Component;
import com.vaadin.ui.Grid;
import com.vaadin.ui.ItemCaptionGenerator;
import org.jpos.ee.*;
import org.jpos.qi.QIEntityView;
import org.jpos.qi.QIHelper;

import java.util.ArrayList;
import java.util.List;


public class RolesView extends QIEntityView {

    public RolesView() {
        super(Role.class, "roles");
    }

    @Override
    public String getHeaderSpecificTitle(Object entity) {
        if (entity instanceof Role) {
            Role r = (Role) entity;
            return r.getName() != null ? r.getName() : "New";
        } else {
            return null;
        }
    }

    @Override
    public Object getEntity(Object entity) {
        if (entity instanceof Role) {
            Role r = (Role) entity;
            if (r.getId() != null)
                return getHelper().getEntityByParam(String.valueOf(((Role) entity).getId()));
        }
        return null;
    }

    @Override
    public Object createNewEntity() {
        return new Role();
    }

    @Override
    public QIHelper createHelper() {
        return new RolesHelper();
    }

    @Override
    protected Component buildAndBindCustomComponent(String propertyId) {
        List<Validator> validators = getValidators(propertyId);
        if ("permissions".equals(propertyId)) {
            CheckBoxGroup<Permission> f = new CheckBoxGroup("Permissions");
            SysConfig[] sysconfigs = ((RolesHelper)getHelper()).getPermissions();
            List<Permission> allPermissions = new ArrayList<>();
            //convert SysConfigs to Permissions
            for (SysConfig sys : sysconfigs) {
                Permission p = Permission.valueOf(sys.getId().substring(5));
                allPermissions.add(p);
            }
            f.setItems(allPermissions);
            f.setItemCaptionGenerator((ItemCaptionGenerator<Permission>) item -> sysconfigs[allPermissions.indexOf(item)].getValue());
            Binder.BindingBuilder builder = getBinder().forField(f);
            validators.forEach(builder::withValidator);
            builder.bind(propertyId);
            return f;
        }
        return null;
    }

    @Override
    public void setGridGetters() {
        Grid<Role> g = this.getGrid();
        g.addColumn(Role::getId).setId("id");
        g.addColumn(Role::getName).setId("name");
        g.addColumn(Role::getPermissions).setId("permissions");
    }

    @Override
    public boolean canEdit() {
        return true;
    }

    @Override
    public boolean canAdd() {
        return true;
    }

    @Override
    public boolean canRemove() {
        return true;
    }

}
