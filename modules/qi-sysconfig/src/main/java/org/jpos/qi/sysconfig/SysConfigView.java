/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2019 jPOS Software SRL
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

import com.vaadin.data.Binder;
import com.vaadin.data.Validator;
import com.vaadin.ui.*;
import org.apache.commons.lang3.StringUtils;
import org.jpos.core.Configuration;
import org.jpos.ee.BLException;
import org.jpos.ee.SysConfig;
import org.jpos.qi.QI;
import org.jpos.qi.QIEntityView;
import org.jpos.qi.QIHelper;
import org.jpos.qi.ViewConfig;

import java.util.List;

import static org.jpos.util.QIUtils.getCaptionFromId;

public class SysConfigView extends QIEntityView<SysConfig> {
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
            return s.getId() != null ? s.getId() : getApp().getMessage("new");
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
    public void updateEntity() throws BLException {
        SysConfig entity = getInstance();
        entity.setId(((SysConfigHelper)getHelper()).addPrefix(entity.getId()));
        if (getHelper().updateEntity(getBinder()))
            getApp().displayNotification(getApp().getMessage("updated", getEntityName().toUpperCase()));
        else
            getApp().displayNotification(getApp().getMessage("notchanged"));
    }

    @Override
    protected Component buildAndBindCustomComponent(String propertyId) {
        if ("id".equals(propertyId)) {
            TextField id = new TextField(getCaptionFromId(propertyId));
            List<Validator> validators = getFieldFactory().getValidators(propertyId);
            Binder<SysConfig> binder = getBinder();
            Binder.BindingBuilder builder = binder.forField(id)
                .asRequired(getApp().getMessage("errorMessage.req", StringUtils.capitalize(getCaptionFromId(propertyId))))
                .withNullRepresentation("")
                .withConverter(userInputValue -> userInputValue
                                , toPresentation -> removePrefix(toPresentation));
            validators.forEach(builder::withValidator);
            builder.bind(propertyId);
            ViewConfig.FieldConfig config = getViewConfig().getFields().get(propertyId);
            String width = config != null ? config.getWidth() : null;
            id.setWidth(width);
            return id;
        }
        return null;
    }

    @Override
    public void setGridGetters() {
        Grid<SysConfig> g = this.getGrid();
        g.addColumn(sysconfig -> removePrefix(sysconfig.getId())).setId("id");
        g.addColumn(SysConfig::getValue).setId("value");
    }

    private String removePrefix (String value) {
        if (value != null && !value.isEmpty())
            return prefix != null ? value.substring(prefix.length()) : value;
        return value;
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

    @Override
    public void setConfiguration (Configuration cfg) {
        super.setConfiguration(cfg);
        this.prefix = cfg.get("prefix", prefix);
        String title = cfg.get("title", null);
        if (title != null)
            setTitle("<strong>" + title + "</strong>");
        String name = cfg.get("name", null);
        if (name != null) {
            setGeneralRoute("/" + name);
        }
    }
}
