/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2012 Alejandro P. Revilla
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

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

public class Role extends Cloneable {
    private long id;
    private String name;
    private Set<Permission> permissions;

    public Role () {
        super();
        permissions    = new LinkedHashSet<Permission>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public boolean hasPermission (String permName) {
        return permName != null && permissions.contains(new Permission(permName));
    }

    public void addPermission (String permName) {
        permissions.add (new Permission (permName));
    }

    public void removePermission (String permName) {
        permissions.remove (new Permission (permName));
    }

    public void removeAllPermissions () {
        permissions.clear ();
    }

    public String toString() {
        return new ToStringBuilder(this)
                .append("id", getId())
                .append("name", getName())
                .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof Role) ) return false;
        Role castOther = (Role) other;
        return new EqualsBuilder()
                .append(this.getId(), castOther.getId())
                .isEquals();
    }
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getId())
                .toHashCode();
    }
}
