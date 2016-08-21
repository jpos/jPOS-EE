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

package org.jpos.qi.sysconfig;

import com.vaadin.data.Container;
import com.vaadin.data.Item;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.fieldgroup.FieldGroupFieldFactory;
import com.vaadin.data.util.GeneratedPropertyContainer;
import com.vaadin.data.util.PropertyValueGenerator;
import com.vaadin.ui.Field;
import com.vaadin.ui.Layout;
import com.vaadin.ui.TextField;
import org.jpos.ee.BLException;
import org.jpos.ee.SysConfig;
import org.jpos.qi.EntityContainer;
import org.jpos.qi.QIEntityView;
import org.jpos.qi.QIHelper;
import org.jpos.qi.components.QIFieldFactory;

public class SysConfigView extends QIEntityView {
//    private static String ENTITY_NAME = "sysconfig";
    private String prefix;

    public SysConfigView (String name, String prefix) {
        super(SysConfig.class, name);
        this.prefix = prefix;
    }

    // QINavigator uses this constructor.
        @SuppressWarnings("unused")
    public SysConfigView () {
        this("sysconfig", "sys.");
    }

    @Override
    public String getHeaderSpecificTitle(Object entity) {
        if (entity instanceof SysConfig) {
            SysConfig s = (SysConfig) entity;
            return s.getId() != null ? s.getId() : "New";
        } else {
            return null;
        }
    }

    @Override
    public Object getEntityByParam(String param) {
        ((SysConfigHelper)getHelper()).getSysConfig(param);
        return ((SysConfigHelper)getHelper()).getSysConfig(param);
    }

    @Override
    public Object getEntity(Object entity) {
        return entity instanceof SysConfig ?
                ((SysConfigHelper)getHelper()).getSysConfig(String.valueOf(((SysConfig) entity).getId())) : null;
    }

    @Override
    public Object createNewEntity() {
        return new SysConfig();
    }

    @Override
    public QIHelper createHelper() {
        return new SysConfigHelper(getPrefix());
    }

    @Override
    public void updateEntity(BeanFieldGroup fieldGroup) throws FieldGroup.CommitException, CloneNotSupportedException, BLException {
        String idValue = (String) fieldGroup.getField("id").getValue();
        idValue = addPrefix(idValue);
        TextField idField = (TextField)fieldGroup.getField("id");
        idField.setReadOnly(false);
        idField.setValue(idValue);
        idField.setReadOnly(true);
        if (getHelper().updateEntity(fieldGroup))
            getApp().displayNotification(getApp().getMessage("updated", getEntityName().toUpperCase()));
        else
            getApp().displayNotification(getApp().getMessage("notchanged"));
        idField.setReadOnly(false);
        idField.setValue(removePrefix(idValue));
        idField.setReadOnly(true);
    }

    @Override
    public Container createContainer() {
        EntityContainer<SysConfig> cont = (EntityContainer<SysConfig>) getHelper().createContainer();
        GeneratedPropertyContainer gpContainer = new GeneratedPropertyContainer(cont);
        gpContainer.addGeneratedProperty("id", new PropertyValueGenerator<String>() {
            @Override
            public String getValue(Item item, Object itemId, Object propertyId) {
                String id = (String) item.getItemProperty("id").getValue();
                return removePrefix(id);
            }

            @Override
            public Class<String> getType() {
                return String.class;
            }
        });
        return gpContainer;
    }

    @Override
    public FieldGroupFieldFactory createFieldFactory() {
        return new QIFieldFactory() {
            @Override
            public <T extends Field> T createField(Class<?> dataType, Class<T> fieldType) {
                Field f = super.createField(dataType, fieldType);
                return (T) f;
            }
        };
    }

    @Override
    protected Layout addFields(FieldGroup fieldGroup) {
        Layout l = super.addFields(fieldGroup);
        Field id = (Field) fieldGroup.getField("id");
        id.setRequired(true);
        id.setRequiredError(getApp().getMessage("errorMessage.req", id.getCaption()));
        String idValue = (String) fieldGroup.getItemDataSource().getItemProperty("id").getValue();
        //Hide prefix
        if (idValue != null) { //Means it is not a new sysconfig entry
            id.setReadOnly(false);
            idValue = prefix != null ? idValue.substring(prefix.length()) : idValue;
            id.setValue(idValue);
            id.setReadOnly(true);
        }
        return l;
    }

    private String removePrefix (String value) {
        return prefix != null ? value.substring(prefix.length()) : value;
    }

    private String addPrefix (String value) {
        return value.startsWith(prefix) ? value : prefix + value;
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

    public String getPrefix() {
        return prefix;
    }
}
