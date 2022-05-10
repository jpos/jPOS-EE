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

package org.jpos.qi.components;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.shared.ui.datefield.DateResolution;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.jpos.qi.QI;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

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
        datePickerFrom = createDatePicker(null);
        datePickerTo   = createDatePicker(null);
        if (dateRangeEnabled) {
            dateRanges = createDateRanges();
            dateRanges.setValue(defaultRangeKey);
            Label separator = new Label(app.getMessage("or"));
            addComponents(dateRanges, separator);
            setComponentAlignment(separator, Alignment.BOTTOM_LEFT);
        }
        Label separator = new Label("-");
        addComponents(datePickerFrom, separator, datePickerTo);
        setComponentAlignment(separator, Alignment.BOTTOM_LEFT);
        refreshBtn = new Button(app.getMessage("refresh"));
        refreshBtn.setIcon(VaadinIcons.REFRESH);
        refreshBtn.setStyleName(ValoTheme.BUTTON_TINY);
        refreshBtn.addStyleName(ValoTheme.BUTTON_PRIMARY);
        refreshBtn.setSizeUndefined();
        refreshBtn.addClickListener(createRefreshListener());
        addComponent(refreshBtn);
        setComponentAlignment(refreshBtn, Alignment.BOTTOM_CENTER);
    }

    protected abstract Button.ClickListener createRefreshListener();

    public DateRange getValue() {
        DateRange dr;
        if (dateRanges != null && dateRanges.getValue() != null) {
            dr = new DateRange((String)dateRanges.getValue());
        } else if (datePickerFrom.getValue() != null || datePickerTo.getValue() != null) {
            dr = new DateRange();
            if (datePickerFrom.getValue() != null) {
                Date startDate = Date.from(datePickerFrom.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
                dr.setStart(startDate);
            }
            if (datePickerTo.getValue() != null) {
                LocalDateTime endOfDay = LocalDateTime.of(datePickerTo.getValue(), LocalTime.MAX);
                Date endDate = Date.from(endOfDay.atZone(ZoneId.systemDefault()).toInstant());
                dr.setEnd(endDate);
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
        field.setWidth("130px");
        field.setStyleName(ValoTheme.DATEFIELD_TINY);
        field.setDateFormat(app.getMessage("daterange.format"));
        field.setResolution(DateResolution.DAY);
        field.addValueChangeListener(event -> {
            if (event.getValue() != null && dateRanges != null)
                dateRanges.setValue(null);
        });
        return field;
    }

    private ComboBox createDateRanges () {
        ComboBox combo = new ComboBox();
        combo.setStyleName(ValoTheme.COMBOBOX_TINY);
        combo.setEmptySelectionAllowed(false);
        combo.setItems(DateRange.ranges);
        combo.setItemCaptionGenerator(range -> app.getMessage((String)range));
        combo.addValueChangeListener(event -> {
            if (event.getValue() != null) {
                datePickerFrom.setValue(null);
                datePickerTo.setValue(null);
                if (refreshBtn != null)
                    refreshBtn.click();
            }
        });
        return combo;
    }

    public QI getApp() {
        return app;
    }

    public void setApp(QI app) {
        this.app = app;
    }

    public DateField getDatePickerFrom() {
        return datePickerFrom;
    }

    public void setDatePickerFrom(DateField datePickerFrom) {
        this.datePickerFrom = datePickerFrom;
    }

    public DateField getDatePickerTo() {
        return datePickerTo;
    }

    public void setDatePickerTo(DateField datePickerTo) {
        this.datePickerTo = datePickerTo;
    }

    public ComboBox getDateRanges() {
        return dateRanges;
    }

    public void setDateRanges(ComboBox dateRanges) {
        this.dateRanges = dateRanges;
    }

    public Button getRefreshBtn() {
        return refreshBtn;
    }

    public void setRefreshBtn(Button refreshBtn) {
        this.refreshBtn = refreshBtn;
    }
}
