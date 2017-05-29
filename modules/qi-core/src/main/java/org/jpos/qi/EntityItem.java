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

import com.vaadin.v7.data.Item;
import com.vaadin.v7.data.Property;
import com.vaadin.v7.data.util.MethodProperty;

import java.util.Collection;
import java.util.Map;

public class EntityItem<T> implements Item {
    protected T entity;
    Map<String, Class> properties;

    public EntityItem(T entity, Map<String, Class> properties) {
        this.entity = entity;
        this.properties = properties;
    }

    public Property getItemProperty(Object attribute) {
        return new MethodProperty(entity, attribute.toString());
    }

    public Collection<?> getItemPropertyIds() {
        return properties.keySet();
    }

    public boolean addItemProperty(Object o, Property property) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();  // TODO implement
    }

    public boolean removeItemProperty(Object o) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();  // TODO implement
    }

    public T getEntity() {
        return entity;
    }
    public void setEntity (T entity) {
        this.entity = entity;
    }
    public String toString () {
        return "EntityItem:" + entity.toString();
    }
}
