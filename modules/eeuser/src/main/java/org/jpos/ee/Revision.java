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

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;


public class Revision implements Serializable
{
    private Long id;
    private Date date;
    private String info;
    private String ref;
    private org.jpos.ee.User author;

    public Revision(Date date, String info, User author)
    {
        this.date = date;
        this.info = info;
        this.author = author;
    }

    public Revision(Date date, String info, String ref, User author)
    {
        this.date = date;
        this.info = info;
        this.ref = ref;
        this.author = author;
    }

    public Revision()
    {
        super();
    }

    public Long getId()
    {
        return this.id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Date getDate()
    {
        return this.date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public String getInfo()
    {
        return this.info;
    }

    public void setInfo(String info)
    {
        this.info = info;
    }

    public User getAuthor()
    {
        return this.author;
    }

    public void setAuthor(User author)
    {
        this.author = author;
    }

    public void setRef(String ref)
    {
        this.ref = ref;
    }

    public String getRef()
    {
        return ref;
    }

    public String toString()
    {
        return new ToStringBuilder(this)
                .append("id", getId())
                .append("ref", getRef())
                .toString();
    }
}
