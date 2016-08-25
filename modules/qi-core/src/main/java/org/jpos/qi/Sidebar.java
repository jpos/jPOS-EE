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

import com.vaadin.server.FontAwesome;
import com.vaadin.server.Page;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.jdom2.Element;

import java.util.LinkedHashMap;
import java.util.Map;

public class Sidebar extends CssLayout {
    private static final String STYLE_VISIBLE = "valo-menu-visible";
    private Map<String, Button> options;
    private Layout menuItems;
    private QI app;
    private boolean enabled = false;
    private String currentSidebarId;

    Sidebar() {
        super();
        app = QI.getQI();
        addComponent(createToggleButton());
        switchTo (null);
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public void switchTo (String id) {
        Element cfg = app.getXmlConfiguration();
        if (cfg != null && cfg.getChildren("sidebar").size() > 0) {
            enabled = true;
            setWidth(null);
            setHeight("100%");
            setPrimaryStyleName("valo-menu");
            loadSideBarOptions(id);
        }
    }


    @SuppressWarnings("unchecked")
    private void loadSideBarOptions (String id) {
        if (id != null && id.equals(currentSidebarId))
            return;

        options = new LinkedHashMap<>();
        if (menuItems != null)
            removeComponent(menuItems);

        currentSidebarId = id;
        menuItems = new CssLayout();
        menuItems.setPrimaryStyleName("valo-menuitems");

        Element cfg = app.getXmlConfiguration();
        for (Element sb : cfg.getChildren("sidebar")) {
            String eid = sb.getAttributeValue("id");
            if (id == eid || (eid != null && eid.equals(id))) {
                for (Element e : sb.getChildren()) {
                    if ("section".equals(e.getName())) {
                        Label l = new Label(e.getAttributeValue("name"));
                        l.setStyleName(ValoTheme.MENU_SUBTITLE);
                        l.setSizeUndefined();
                        menuItems.addComponent(l);
                    } else if ("option".equals (e.getName())) {
                        if (((QINavigator)QI.getQI().getNavigator()).hasAccessToRoute(e.getAttributeValue("action"))) {
                            Button b = new Button(e.getAttributeValue("name"));
                            b.setPrimaryStyleName(ValoTheme.MENU_ITEM);
                            String iconName = e.getAttributeValue("icon");
                            if (iconName != null) {
                                try {
                                    b.setIcon(FontAwesome.valueOf(iconName));
                                } catch (IllegalArgumentException ex) {
                                    b.setIcon(FontAwesome.EXCLAMATION_TRIANGLE);
                                    b.setEnabled(false);
                                }
                            }
                            String action = e.getAttributeValue("action");
                            options.put(action, b);
                            if (action != null)
                                b.addClickListener((Button.ClickListener) event -> app.getNavigator().navigateTo("/" + action));
                            menuItems.addComponent(b);
                        }
                    }
                }
                addComponent(menuItems);
            }
        }
    }

    public void expandSidebar () {
        menuItems.setVisible(true);
    }

    public void markAsSelected (String option) {
        removeSelected();
        if (options.containsKey(option))
            options.get(option).setStyleName("selected");
    }

    private void removeSelected () {
        for (String option : options.keySet())
            options.get(option).removeStyleName("selected");
    }

    private Component createToggleButton() {
        Button valoMenuToggleButton = new Button("", (Button.ClickListener) event -> {
            if (Page.getCurrent().getBrowserWindowWidth() > 1100) {
                boolean expand = !menuItems.isVisible();
                menuItems.setVisible(expand ? true : false);
            } else {
                if (getStyleName().contains(STYLE_VISIBLE))
                    removeStyleName(STYLE_VISIBLE);
                else
                    addStyleName(STYLE_VISIBLE);
            }
        });
        valoMenuToggleButton.setIcon(FontAwesome.LIST);
        valoMenuToggleButton.addStyleName("valo-menu-toggle");
        valoMenuToggleButton.addStyleName(ValoTheme.BUTTON_BORDERLESS);
        valoMenuToggleButton.addStyleName(ValoTheme.BUTTON_SMALL);
        return valoMenuToggleButton;
    }

    public Map<String, Button> getOptions() {
        return options;
    }
}
