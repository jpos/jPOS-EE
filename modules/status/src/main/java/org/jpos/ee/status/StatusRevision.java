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

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.jpos.ee.Revision;

import java.io.Serializable;
import java.util.Date;


/** @author Hibernate CodeGenerator */
public class StatusRevision extends Revision implements Serializable {

    /** nullable persistent field */
    private Status status;

    /** full constructor */
    public StatusRevision(Date date, String info, org.jpos.ee.User author, Status status) {
        super(date, info, author);
        this.status = status;
    }

    /** default constructor */
    public StatusRevision() {
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .toString();
    }

}
