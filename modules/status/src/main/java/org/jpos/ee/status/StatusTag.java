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

package org.jpos.ee.status;

public class StatusTag {
    private long id;
    private String tag;
    private Status status;

    public StatusTag () {
        super ();
    }
    public StatusTag (String tag) {
        super ();
        setTag(tag);
    }
    /**
     * internal id 
     */
    public void setId (long id) {
        this.id = id;
    }
    /**
     * @return internal Id
     */
    public long getId() {
        return id;
    }
    public void setTag (String tag) {
        this.tag = tag;
    }
    public String getTag () {
        return tag;
    }
    public void setStatus (Status status) {
        this.status = status;
    }
    public Status getStatus () {
        return status;
    }
    public boolean equals (Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj instanceof StatusTag) {
            return getId() == ((StatusTag)obj).getId();
	}
	return false;
    }
    public String toString () {
        return new Long(getId()).toString();
    }
}

