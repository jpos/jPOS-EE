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
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Role extends Cloneable implements Serializable {
    private static final long serialVersionUID = -8259326520155524014L;
    private Long id;
    private Realm realm;
    private String name;
    private Set<Permission> permissions;
    private Role parent;

    public Role () {
        permissions = new LinkedHashSet<>();
    }
    public Role(String name) {
        this();
        setName(name);
    }
    public Role(Realm realm, String name) {
        this();
        this.realm = realm;
        setName(name);
    }

    public Role(Realm realm, String name, Set<Permission> permissions, Role parent) {
        this();
        this.realm = realm;
        this.name = name;
        this.permissions = permissions;
        this.parent = parent;
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
        boolean ignoreRealm = false;
        if (permName != null && permName.startsWith("*")) {
            ignoreRealm = true;
            permName = permName.substring(1);
        }
        return permName != null && (getActivePermissions(ignoreRealm).contains(Permission.valueOf(permName)));
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

    /**
     * get Fully Qualified Role Name
     * @return [realm:]role.name
     */
    private String getFQRN() {
        return getRealm () != null ? String.format("%s:role.%s", getRealm().getName(), getName()) :
          String.format("role.%s", getName());
    }

    public Set<Permission> getActivePermissions () {
        return getActivePermissions(false);
    }

    public Set<Permission> getActivePermissions (boolean ignoreRealm) {
        Set<Permission> perm = new LinkedHashSet<>();
        perm.add(Permission.valueOf(getFQRN()));
        if (ignoreRealm)
            perm.addAll(permissions);
        else
            perm.addAll(getActivePermissions(getRealm()));
        for (Role r = this; r.getParent() != null; ) {
            r = r.getParent();
            if (ignoreRealm)
                perm.addAll(r.getPermissions());
            else
                perm.addAll(r.getActivePermissions(getRealm()));
        }
        return perm;
    }

    private Set<Permission> getActivePermissions (Realm r) {
        return r != null ?
          permissions.stream().map(
            p -> Permission.valueOf(r.getName() + ":" + p.getName())
          ).collect(Collectors.toSet()) : permissions;
    }
}
