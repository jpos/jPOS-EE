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

package org.jpos.qi.views;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.*;
import org.jdom2.Element;
import org.jpos.core.Configurable;
import org.jpos.core.ConfigurationException;
import org.jpos.core.XmlConfigurable;
import org.jpos.q2.QFactory;
import org.jpos.qi.QI;
import org.jpos.qi.QINavigator;

public class TabView extends CssLayout implements View, XmlConfigurable, TabSheet.SelectedTabChangeListener {
    private TabSheet tabs;
    private String route;

    public TabView () {
        setWidth("100%");
        tabs = new TabSheet();
        tabs.addSelectedTabChangeListener(this);
        addComponent(tabs);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        for (Component c : tabs) {
            if (c instanceof View) {
                ((View) c).enter(event);
            }
        }
        if (event.getParameters() != null && !event.getParameters().isEmpty()) {
            try {
                tabs.setSelectedTab(Integer.parseInt(event.getParameters()));
            } catch (NumberFormatException ignored) {
                // ignore wrong fragment - keep default selected tab
            }
        }
    }

    @Override
    public void setConfiguration(Element cfg) throws ConfigurationException {
        QFactory qfactory = QI.getQI().getQ2().getFactory();
        QINavigator navigator = (QINavigator) QI.getQI().getNavigator();
        route = cfg.getAttributeValue("route");
        int i=0;
        for (Element e : cfg.getChildren("view")) {
            String clazz = e.getAttributeValue("class");
            String perm = e.getAttributeValue("perm", "-");
            String caption = e.getAttributeValue("caption");
            try {
                Class c = Class.forName(clazz);
                if (Component.class.isAssignableFrom(c)) {
                    Component component = (Component) c.newInstance();
                    if (component instanceof Configurable) {
                        ((Configurable)component).setConfiguration(qfactory.getConfiguration(e));
                    }
                    if (component instanceof XmlConfigurable) {
                        ((XmlConfigurable)component).setConfiguration(e);
                    }
                    if (navigator.hasAccessToRoute(perm))
                        tabs.addTab (component, caption).setId(Integer.toString(i++));
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                QI.getQI().getLog().error(ex);
            }
        }
    }

    @Override
    public void selectedTabChange(TabSheet.SelectedTabChangeEvent event) {
        Component selected = tabs.getSelectedTab();
        TabSheet.Tab t = tabs.getTab(selected);
//        if (selectedTab != null && t.getId() != null && t != selectedTab) {
//            selectedTab = t;
//            // Page page = Page.getCurrent();
//            // page.setUriFragment(route + "/3");
//            System.out.println("navigate to /" + route + "/" + t.getId());
//            QI.getQI().getNavigator().navigateTo("/" + route + "/" + t.getId());
//        }
//        selectedTab = t;
    }
}
