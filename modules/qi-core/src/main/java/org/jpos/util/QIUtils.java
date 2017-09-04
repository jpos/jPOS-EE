package org.jpos.util;

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
}
