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

package org.jpos.ee;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;

@SuppressWarnings("unused")
public class Visitor implements Serializable {
    private String id;
    private Date lastUpdate;
    private User user;
    private Map<String,String> props;

    public Visitor(String id, Date lastUpdate, User user, Map<String,String> props) {
        this.id = id;
        this.lastUpdate = lastUpdate;
        this.user = user;
        this.props = props;
    }

    public Visitor() {
        super();
    }

    public Visitor(String id, Map<String,String> props) {
        this.id = id;
        this.props = props;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Map<String,String> getProps() {
        return this.props;
    }

    public void setProps(Map<String,String> props) {
        this.props = props;
    }
    public void set (String prop, String value) {
        getProps().put (prop, value);
    }
    public String get (String prop) {
        return getProps().get (prop);
    }
    public String get (String prop, String defValue) {
        String value = getProps().get (prop);
        return value == null ? defValue : value;
    }
    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .append("user", getUser())
            .toString();
    }
    public void touch() {
        setLastUpdate (new Date());
    }
}
