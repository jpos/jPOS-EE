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

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import java.util.Iterator;
import org.apache.commons.lang3.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Status extends org.jpos.ee.status.StatusBase implements Serializable {

    /** identifier field */
    private String id;

    /** nullable persistent field */
    private String name;

    /** nullable persistent field */
    private String state;

    /** nullable persistent field */
    private String detail;

    /** nullable persistent field */
    private String groupName;

    /** nullable persistent field */
    private Date lastTick;

    /** nullable persistent field */
    private long timeout;

    /** nullable persistent field */
    private String timeoutState;

    /** nullable persistent field */
    private String command;

    /** nullable persistent field */
    private String validCommands;

    /** nullable persistent field */
    private boolean expired;

    /** nullable persistent field */
    private int maxEvents;

    /** persistent field */
    private Set events;

    /** persistent field */
    private Set revisions;

    private Set tags;

    /** default constructor */
    public Status() {
    }

    /** minimal constructor */
    public Status(String id, Set events, Set revisions) {
        this.id = id;
        this.events = events;
        this.revisions = revisions;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Date getLastTick() {
        return this.lastTick;
    }

    public void setLastTick(Date lastTick) {
        this.lastTick = lastTick;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public String getTimeoutState() {
        return this.timeoutState;
    }

    public void setTimeoutState(String timeoutState) {
        this.timeoutState = timeoutState;
    }

    public String getCommand() {
        return this.command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getValidCommands() {
        return this.validCommands;
    }

    public void setValidCommands(String validCommands) {
        this.validCommands = validCommands;
    }

    public boolean isExpired() {
        return this.expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public int getMaxEvents() {
        return this.maxEvents;
    }

    public void setMaxEvents(int maxEvents) {
        this.maxEvents = maxEvents;
    }

    public Set getEvents() {
        return this.events;
    }

    public void setEvents(Set events) {
        this.events = events;
    }

    public Set getRevisions() {
        return this.revisions;
    }

    public void setTags (Set tags) {
        this.tags = tags;
    }
    public Set getTags () {
        return this.tags;
    }
    public String getTagsAsString () {
        StringBuffer sb = new StringBuffer();
        Iterator it = getTags().iterator();
        while (it.hasNext()) {
            if (sb.length()>0) {
                sb.append(" ");
            }   
            sb.append(((StatusTag)it.next()).getTag());
        }   
        return sb.toString();
    }
    public void setRevisions(Set revisions) {
        this.revisions = revisions;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .toString();
    }

}
