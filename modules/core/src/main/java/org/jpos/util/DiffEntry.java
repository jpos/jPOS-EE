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

package org.jpos.util;

/**
 *
 * @author Andres Alcarraz
 */
public class DiffEntry {
    private String property;
    private Object value1;
    private Object value2;
    private BeanDiff beanDiff;

    public DiffEntry() {
        super();
    }
    public DiffEntry (BeanDiff beanDiff, String prop, 
            Object value1, Object value2) {
        super ();
        setBeanDiff(beanDiff);
        setProperty(prop);
        setValue1(value1);
        setValue2(value2);
    }
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append ('-');
        sb.append (getProperty());
        sb.append (':');
        sb.append (getValue1());
        sb.append (BeanDiff.LINESEP);
        sb.append ('+');
        sb.append (getProperty());
        sb.append (':');
        sb.append (getValue2());
        return sb.toString();
    }
    public String getProperty() {
        return property;
    }
    public void setProperty (String property) {
        this.property = property;
    }
    public Object getValue1 () {
        return value1;
    }
    public void setValue1 (Object value1) {
        this.value1 = value1;
    }
    public Object getValue2 () {
        return value2;
    }
    public void setValue2 (Object value2) {
        this.value2 = value2;
    }
    public BeanDiff getBeanDiff() {
        return beanDiff;
    }
    public void setBeanDiff (BeanDiff beanDiff) {
        this.beanDiff = beanDiff;
    }
}

