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

package org.jpos.qi.util;

import com.vaadin.ui.renderers.DateRenderer;
import com.vaadin.ui.renderers.NumberRenderer;
import com.vaadin.ui.renderers.Renderer;
import org.apache.commons.lang3.StringUtils;
import org.jpos.qi.QI;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public class QIUtils {

    public static String getCaptionFromId(String id) {
        //try to get caption from messages file
        String fieldPrefix="field.";
        String columnPrefix="column.";
        String caption = QI.getQI().getMessage(id);
        if (caption.equals(id)) {
            //try to get caption without prefix
            id = id.startsWith(fieldPrefix) ? id.substring(fieldPrefix.length()) : (id.startsWith(columnPrefix) ? id.substring(columnPrefix.length()) : id);
            caption = QI.getQI().getMessage(id);
            if (caption.equals(id)) {
                //parse existing id to a readable format
                return StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(id), ' ');
            }
        }
        return caption;
    }

    public static Renderer createAmountRenderer () {
        NumberFormat amountFormat = NumberFormat.getInstance();
        amountFormat.setGroupingUsed(true);
        amountFormat.setMinimumFractionDigits(2);
        return new NumberRenderer(amountFormat);
    }

    public static Renderer createTimestampRenderer () {
        DateFormat dateFormat     = new SimpleDateFormat(QI.getQI().getMessage("timestampformat"));
        return new DateRenderer(dateFormat);
    }

    public static Renderer createDateRenderer () {
        DateFormat dateFormat     = new SimpleDateFormat(QI.getQI().getMessage("dateformat"));
        return new DateRenderer(dateFormat);
    }
}
