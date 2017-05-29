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

package org.jpos.qi;

import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomField;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class ReadOnlyField extends CustomField<Object> {
    private Label label;

    public ReadOnlyField() {
        super();
        label = new Label();
        label.setContentMode(ContentMode.HTML);
        label.setWidth(null);
    }

    @Override
    protected void doSetValue(Object value) {
        if (value != null)
            label.setValue(String.valueOf(value));
    }

    @Override
    protected Component initContent() {
        return new VerticalLayout(label);
    }

    @Override
    public String getValue() {
        return label.getValue();
    }
}
