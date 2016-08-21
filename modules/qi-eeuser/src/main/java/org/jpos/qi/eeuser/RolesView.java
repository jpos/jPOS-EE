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

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.fieldgroup.FieldGroupFieldFactory;
import com.vaadin.ui.*;
import org.jpos.ee.*;
import org.jpos.qi.QIEntityView;
import org.jpos.qi.QIHelper;
import org.jpos.qi.components.QIFieldFactory;

import java.util.Set;

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
    public FieldGroupFieldFactory createFieldFactory() {
        return new QIFieldFactory() {
            @Override
            public <T extends Field> T createField(Class<?> dataType, Class<T> fieldType) {
                if (Set.class.equals(dataType)) {
                    OptionGroup f = new OptionGroup("Permissions");
                    f.setMultiSelect(true);
                    f.setNullSelectionAllowed(false);
                    for (SysConfig sys : ((RolesHelper)getHelper()).getPermissions()) {
                        Permission p = Permission.valueOf(sys.getId().substring(5));
                        f.addItem(p);
                        f.setItemCaption(p, sys.getValue());
                    }
                    f.setImmediate(true);
                    return (T) f;
                } else {
                    Field f = super.createField(dataType, fieldType);
                    return (T) f;
                }
            }
        };
    }

    //override to add validators
    @Override
    protected Layout addFields(FieldGroup fieldGroup) {
        Layout l = super.addFields(fieldGroup);
        Field name = fieldGroup.getField("name");
        name.setRequired(true);
        name.setRequiredError(getApp().getMessage("errorMessage.req", name.getCaption()));
        return l;
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

    @Override
    public String[] getVisibleColumns() {
        return new String[] { "name" };
    }
}
