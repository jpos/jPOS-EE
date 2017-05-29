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

import com.vaadin.ui.*;

/**
 * @author spr
 * @since 9/11/14.
 */
public class QILayout extends VerticalLayout {
    CssLayout headerLayout = new CssLayout();
    CssLayout contentLayout = new CssLayout();
    CssLayout menuLayout = new CssLayout();

    public QILayout () {
        setSizeFull();
        setMargin(false);
        setSpacing(false);
        headerLayout.setWidth("100%");
        headerLayout.setPrimaryStyleName("header");
        HorizontalLayout center = new HorizontalLayout();
        center.setSizeFull();
        center.setSpacing(false);

        menuLayout.setPrimaryStyleName("valo-menu");

        contentLayout.setPrimaryStyleName("valo-content");
        contentLayout.addStyleName("v-scrollable");
        contentLayout.setSizeFull();
        center.addComponents(menuLayout, contentLayout);
        center.setExpandRatio (contentLayout, 1);
        addComponents(headerLayout, center);
        setExpandRatio(center, 1);
    }

    public void addMenu (Component menu) {
        menu.addStyleName("valo-menu-part");
        menuLayout.addComponent(menu);
    }

    public CssLayout getContentLayout() {
        return contentLayout;
    }

    public void setContentLayout(CssLayout contentLayout) {
        this.contentLayout = contentLayout;
    }

    public CssLayout getMenuLayout() {
        return menuLayout;
    }

    public void setMenuLayout(CssLayout menuLayout) {
        this.menuLayout = menuLayout;
    }

    public CssLayout getHeaderLayout() {
        return headerLayout;
    }

    public void setHeaderLayout(CssLayout headerLayout) {
        this.headerLayout = headerLayout;
    }
}
