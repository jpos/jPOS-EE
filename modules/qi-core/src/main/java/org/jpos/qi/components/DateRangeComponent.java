/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2017 jPOS Software SRL
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

package org.jpos.qi.components;

import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.datefield.Resolution;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.joda.time.DateTime;
import org.jpos.qi.QI;

/**
 * Created by spr on 10/22/15.
 */
public abstract class DateRangeComponent extends HorizontalLayout {

    private QI app;
    private DateField datePickerFrom;
    private DateField datePickerTo;
    private ComboBox dateRanges;
    private Button refreshBtn;

    public DateRangeComponent(String defaultRangeKey, boolean dateRangeEnabled) {
        app = (QI) UI.getCurrent();
        setSpacing(true);
        setSizeUndefined();
        datePickerFrom = createDatePicker(app.getMessage("from").toUpperCase());
        datePickerTo   = createDatePicker(app.getMessage("to").toUpperCase());
        addComponents(datePickerFrom, datePickerTo);
        if (dateRangeEnabled) {
            dateRanges = createDateRanges();
            dateRanges.setValue(app.getMessage(defaultRangeKey));
            addComponent(dateRanges);
        }
        refreshBtn = new Button(app.getMessage("refresh"));
        refreshBtn.setIcon(FontAwesome.REFRESH);
        refreshBtn.setStyleName(ValoTheme.BUTTON_SMALL);
        refreshBtn.setSizeUndefined();
        refreshBtn.addClickListener(createRefreshListener());
        addComponent(refreshBtn);
        setComponentAlignment(refreshBtn, Alignment.BOTTOM_CENTER);
    }

    protected abstract Button.ClickListener createRefreshListener();

    public DateRange getValue() {
        DateRange dr;
        if (dateRanges != null && dateRanges.getValue() != null)
            dr = new DateRange(dateRanges.getValue().toString());
        else if (datePickerFrom.getValue() != null || datePickerTo.getValue() != null) {
            dr = new DateRange();
            if (datePickerFrom.getValue() != null) {
                DateTime dt = new DateTime(datePickerFrom.getValue());
                dr.setStart(dt.millisOfDay().withMinimumValue().toDate());
            }
            if (datePickerTo.getValue() != null) {
                DateTime dt = new DateTime(datePickerTo.getValue());
                dr.setEnd(dt.millisOfDay().withMaximumValue().toDate());
            }
        } else {
            dr = new DateRange();
            dr.setStart(null);
            dr.setEnd(null);
        }
        return dr;
    }

    private DateField createDatePicker (String caption) {
        DateField field = new DateField();
        field.setCaption(caption);
        field.setStyleName(ValoTheme.DATEFIELD_SMALL);
        field.setResolution(Resolution.DAY);
        field.setImmediate(true);
        field.addValueChangeListener(event -> {
            if (event.getProperty().getValue() != null && dateRanges != null)
                dateRanges.setValue(null);
        });
        return field;
    }

    private ComboBox createDateRanges () {
        ComboBox combo = new ComboBox(app.getMessage("or").toUpperCase());
        combo.setStyleName(ValoTheme.COMBOBOX_SMALL);
        combo.setImmediate(true);
        combo.setNullSelectionAllowed(false);
        for (String range : DateRange.ranges)
            combo.addItem(app.getMessage(range));
        combo.addValueChangeListener(event -> {
            if (event.getProperty().getValue() != null) {
                datePickerFrom.setValue(null);
                datePickerTo.setValue(null);
            }
        });
        return combo;
    }
}
