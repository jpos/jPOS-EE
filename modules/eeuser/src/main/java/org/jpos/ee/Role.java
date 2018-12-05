/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2018 jPOS Software SRL
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
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Role extends Cloneable implements Serializable {
    private static final long serialVersionUID = 6235762883633501492L;
    private Long id;
    private String name;
    private Set<Permission> permissions;
    private Role parent;
    private Realm realm;

    public Role () {
        super();
        permissions    = new LinkedHashSet<>();
    }
    public Role(String name) {
        this();
        setName(name);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Realm getRealm() {
        return realm;
    }

    public void setRealm(Realm realm) {
        this.realm = realm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getParent() {
        return parent;
    }

    public void setParent(Role parent) {
        this.parent = parent;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public boolean hasPermission (String permName) {
        return permName != null && (permissions.contains(Permission.valueOf(permName)) || permName.equals("role." + name));
    }

    public void addPermission (String permName) {
        permissions.add (Permission.valueOf(permName));
    }

    public void removePermission (String permName) {
        permissions.remove (Permission.valueOf(permName));
    }

    public void removeAllPermissions () {
        permissions.clear ();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(id, role.id) &&
          Objects.equals(realm, role.realm) &&
          Objects.equals(name, role.name) &&
          Objects.equals(permissions, role.permissions) &&
          Objects.equals(parent, role.parent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, realm, name, permissions, parent);
    }

    @Override
    public String toString() {
        return "Role{" +
          "id=" + id +
          ", realm='" + realm + '\'' +
          ", name='" + name + '\'' +
          ", permissions=" + permissions +
          ", parent=" + parent +
          '}';
    }
}
