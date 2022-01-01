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

import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

public abstract class LinkField extends CustomField<Object> {
    private Button link;
    private String url;

    public LinkField (String url) {
        link = new Button();
        link.setStyleName(ValoTheme.BUTTON_LINK);
        this.url = url;
    }

    @Override
    protected Component initContent() {
        VerticalLayout vl = new VerticalLayout(link);
        vl.setMargin(false);
        vl.setSpacing(false);
        return vl;
    }

    @Override
    protected abstract void doSetValue(Object value);

    @Override
    public Object getValue() {
        return link.getCaption();
    }

    public Button getLink() {
        return link;
    }

    public void setLink(Button link) {
        this.link = link;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
