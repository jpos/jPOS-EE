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

import java.util.*;
import java.io.Serializable;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;

@SuppressWarnings("unused")
public class Consumer extends Cloneable implements Serializable, SoftDelete {
    private String id;
    private User user;
    private String hash;
    private boolean deleted;
    private boolean active;
    private Date startDate;
    private Date endDate;
    private Set<Role> roles;
    private Map<String,String> props;

    public Consumer() {
        super();
        roles = new LinkedHashSet<Role> ();
        props = new LinkedHashMap<String,String>();
    }
    public String getId() {
        return id;
    }
    public void setId (String id) {
        this.id = id;
    }

    public void setDeleted (boolean deleted) {
        this.deleted = deleted;
    }
    public boolean isDeleted() {
        return deleted;
    }
    public void setActive (boolean active) {
        this.active = active;
    }
    public boolean isActive() {
        return active;
    }    
    public void setRoles (Set<Role> roles) {
        this.roles = roles;
    }
    public Set<Role> getRoles () {
        return roles;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean hasPermission (String permName) {
        if (permName != null) {
            for (Role r : roles) {
                if (r.hasPermission(permName))
                    return true;
            }
        }
        return false;
    }
    public boolean hasAnyPermission (String[] permNames) {
        if (permNames != null) {
            for (String p : permNames) {
                for (Role r : roles) {
                    if (r.hasPermission(p))
                        return true;
                }
            }
        }
        return false;
    }
    public boolean hasAllPermissions (String[] permNames) {
        if (permNames != null) {
            for (String p : permNames) {
                boolean hasPerm = false;
                for (Role r : roles) {
                    if (r.hasPermission(p))
                        hasPerm = true;
                }
                if (!hasPerm)
                    return false;
            }
            return true;
        }
        return false;
    }
    public void addRole (Role role) {
        roles.add(role);
    }
    public void removeRole (Role role) {
        roles.remove(role);
    }
    public void removeAllRoles () {
        roles.clear ();
    }
    public String getRolesAsString () {
        StringBuilder sb = new StringBuilder();
        for (Role r : roles) {
            if (sb.length() > 0)
                sb.append (", ");
            sb.append (r.getName());
        }
        return sb.toString();
    }
    public void setProps (Map<String,String> props) {
        this.props = props;
    }
    public Map<String,String> getProps () {
        return (props = props == null ? new HashMap<String,String> () : props);
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
    public boolean hasProperty (String prop) {
        return getProps().get(prop) != null;
    }
    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof Consumer) ) return false;
        Consumer castOther = (Consumer) other;
        return new EqualsBuilder()
            .append(this.getId(), castOther.getId())
            .isEquals();
    }
    public int hashCode() {
        return new HashCodeBuilder()
            .append(getClass().getName())
            .append(getId())
            .toHashCode();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
