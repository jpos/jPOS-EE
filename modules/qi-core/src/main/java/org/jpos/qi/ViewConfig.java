/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2016 Alejandro P. Revilla
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

package org.jpos.qi;

import org.jdom2.DataConversionException;
import org.jdom2.Element;
import org.jpos.core.Configuration;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by jr and spr on 3/4/16.
 */
public class ViewConfig {

    private Element xmlElement;

    private Configuration configuration;

    private LinkedHashMap<String,FieldConfig> fields;

    private LinkedHashMap<String, String> columns;

    private List<String> readOnlyFields;

    public ViewConfig () {
        fields = new LinkedHashMap<>();
        columns = new LinkedHashMap<>();
        readOnlyFields = new ArrayList<>();
    }

    public void addField(String field, String perm, String regex, int length) {
        if (perm == null || perm.isEmpty() || QI.getQI().getUser().hasPermission(perm))
            fields.put(field, new FieldConfig(perm, regex, length));
    }

    public void addColumn(String column, String perm) {
        if (perm == null || perm.isEmpty() || QI.getQI().getUser().hasPermission(perm))
            columns.put(column,perm);
    }

    public void addReadOnly(String name) {
        readOnlyFields.add(name);
    }

    public LinkedHashMap<String, FieldConfig> getFields () {
        return fields;
    }

    public String[] getVisibleFields() {
        return fields.keySet().toArray(new String[]{});
    }

    public String[] getVisibleColumns() {
        return columns.keySet().toArray(new String[]{});
    }

    public String[] getReadOnlyFields() {
        return readOnlyFields.toArray(new String[]{});
    }

    public Element getXmlElement() {
        return xmlElement;
    }

    public void setXmlElement(Element e) throws DataConversionException {
        xmlElement = e;
        for (Element f : e.getChildren("attribute")) {
            String name = f.getAttributeValue("name");
            String perm = f.getAttributeValue("perm");
            String regex = f.getAttributeValue("regex");
            int length = f.getAttribute("length") != null ? f.getAttribute("length").getIntValue() : 0;

            boolean addField = f.getAttribute("field") == null || f.getAttribute("field").getBooleanValue();
            boolean addColumn = f.getAttribute("column") == null || f.getAttribute("column").getBooleanValue();
            boolean isReadOnly = f.getAttribute("read-only") != null && f.getAttribute("read-only").getBooleanValue();
            if (addField) {
                addField(name, perm, regex, length);
            }
            if (addColumn) {
                addColumn(name, perm);
            }
            if (isReadOnly) {
                addReadOnly(name);
            }
        }
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    class FieldConfig {
        private String perm;
        private String regex;
        private int length;

        FieldConfig(String perm, String regex, int length) {
            this.perm = perm;
            this.regex = regex;
            this.length = length;
        }

        public String getPerm() {
            return perm;
        }

        public void setPerm(String perm) {
            this.perm = perm;
        }

        public String getRegex() {
            return regex;
        }

        public void setRegex(String regex) {
            this.regex = regex;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }
    }
}
