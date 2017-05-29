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

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Window;
import com.vaadin.v7.shared.ui.label.ContentMode;
import com.vaadin.v7.ui.*;
import com.vaadin.ui.themes.ValoTheme;

/**
 * Created by spr on 5/18/16.
 */
public class InfoDialog extends Window implements Button.ClickListener{
    Button close = new Button(QI.getQI().getMessage("close"), this);

    public InfoDialog (String caption, String info) {
        super(caption);
        setWidth("350px");
        setModal(true);
        setResizable(false);
        close.setStyleName(ValoTheme.BUTTON_SMALL);

        VerticalLayout content = new VerticalLayout();
        content.setMargin(true);
        content.setSpacing(true);
        setContent(content);
        if (info != null) {
            Label l = new Label(info);
            l.setContentMode(ContentMode.HTML);
            content.addComponent(l);
        }
        HorizontalLayout hl = new HorizontalLayout();
        hl.setMargin(new MarginInfo(true, false, false, false));
        hl.setSpacing(true);
        hl.setWidth("100%");
        hl.addComponent(close);
        hl.setComponentAlignment(close, Alignment.BOTTOM_RIGHT);
        content.addComponent(hl);
    }

    @Override
    public void buttonClick(Button.ClickEvent event) {
        if (getParent() != null)
            close();
    }
}
