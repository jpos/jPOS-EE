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
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.themes.ValoTheme;
import org.jdom2.Element;

public class Header extends HorizontalLayout {
    private QI app;
    MenuBar.MenuItem userMenuItem;
    public Header(QI app) {
        super();
        this.app = app;
        setSizeFull();
        setPrimaryStyleName("valo-menuitems");

//        if (QIResources.JPOS_LOGO_TINY != null){
//            Link homeLink = createLogo();
//            addComponent(homeLink);
//            setComponentAlignment(homeLink, Alignment.TOP_LEFT);
//            setExpandRatio(homeLink, 0.1f);
//        }

//        Layout search = createSearch();

        MenuBar mb = createMenu();
        if (mb != null) {
            addComponent(mb);
            setComponentAlignment(mb, Alignment.BOTTOM_RIGHT);
            setExpandRatio(mb, 0f);
        }
    }

//    private Link createLogo () {
//        Link homeLink = new Link("",new ExternalResource(""));
//        homeLink.setIcon(QIResources.JPOS_LOGO_TINY);
//        homeLink.addStyleName("qi-client-logo");
//        return homeLink;
//    }

    private Layout createSearch () {
        CssLayout group = new CssLayout();
        group.addStyleName("search-layout");
        group.addStyleName("v-component-group");

        TextField searchField = new TextField();
        searchField.addStyleName("inline-icon");
        searchField.addStyleName("tiny");
        searchField.setIcon(FontAwesome.SEARCH);
        searchField.setWidth("400px");
        //TODO: vaadin8 incompatible methods
//        searchField.setImmediate(true);
//        searchField.addValidator(new RegexpValidator(
//            app.getMessage("errorMessage.invalidField", app.getMessage("search")),QIResources.ALPHANUMERIC_SYMBOLS_PATTERN)
//        );
//        searchField.setValidationVisible(false);
        group.addComponent(searchField);

        Button searchButton = new Button(app.getMessage("search"));
        searchButton.addClickListener(event -> {
            if (searchField.getValue() != null && !searchField.getValue().isEmpty() /*&& searchField.isValid()*/)
                app.getNavigator().navigateTo("/search/" + searchField.getValue());
            else
                app.displayNotification(app.getMessage("errorMessage.invalidField", app.getMessage("search")));
        });
        searchButton.addStyleName("tiny");

        group.addComponent(searchButton);
        return group;
    }

    @SuppressWarnings("unchecked")
    private MenuBar createMenu () {
        MenuBar mb = new MenuBar();
        mb.addStyleName(ValoTheme.MENUBAR_SMALL);
        mb.addStyleName(ValoTheme.MENUBAR_BORDERLESS);
        mb.setHtmlContentAllowed(true);
        Element cfg = app.getXmlConfiguration();
        if (cfg != null) {
            Element menubar = cfg.getChild("menubar");
            if (menubar != null) {
                for (Element e : menubar.getChildren()) {
                    addMenubarItem(mb, e);
                }
            }
        }
        userMenuItem = mb.addItem(app.getUser().getNick(), null);
        userMenuItem.setIcon(FontAwesome.USER);
        userMenuItem.addItem("Profile", selectedItem -> app.navigateTo("/profile"));
        userMenuItem.addItem("Log Out", selectedItem -> app.logout());
        return mb;
    }

    private void addMenubarItem (MenuBar mb, Element e) {
        if ("menu".equals(e.getName())) {
            String perm = e.getAttributeValue("perm");
            boolean allowed = perm == null || QI.getQI().getUser().hasPermission(perm);
            if (allowed) {
                MenuBar.MenuItem mi = mb.addItem(
                        e.getAttributeValue("name"),
                        selectedItem -> app.navigateTo("/" + e.getAttributeValue("action"))
                );
                decorate (mi, e);
                for (Element child : e.getChildren()) {
                    addMenuItem (mi, child);
                }
            }
        }
    }

    private void addMenuItem (MenuBar.MenuItem mb, Element e) {
        if ("menu".equals(e.getName())) {
            String perm = e.getAttributeValue("perm");
            boolean allowed = perm == null || QI.getQI().getUser().hasPermission(perm);
            if (allowed) {
                MenuBar.MenuItem mi = mb.addItem(
                        e.getAttributeValue("name"),
                        selectedItem -> app.navigateTo("/" + e.getAttributeValue("action"))
                );
                decorate (mi, e);
                for (Element child : e.getChildren()) {
                    addMenuItem (mi, child);
                }
            }
        } else if ("separator".equals(e.getName())) {
            mb.addSeparator();
        }
    }

    private void decorate (MenuBar.MenuItem mi, Element e) {
        String style = e.getAttributeValue("style");
        if (style != null)
            mi.setStyleName(e.getAttributeValue("style"));
        String iconName = e.getAttributeValue("icon");
        if (iconName != null) {
            try {
                mi.setIcon(FontAwesome.valueOf(iconName));
            } catch (IllegalArgumentException ex) {
                mi.setIcon(FontAwesome.EXCLAMATION_TRIANGLE);
                mi.setEnabled(false);
            }
        }
    }

    public void refresh() {
        userMenuItem.setText(app.getUser().getName());
    }
}
