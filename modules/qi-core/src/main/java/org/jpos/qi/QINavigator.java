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

import com.vaadin.data.ValidationResult;
import com.vaadin.data.Validator;
import com.vaadin.data.validator.RegexpValidator;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewProvider;
import com.vaadin.ui.Layout;
import org.jdom2.Element;
import org.jpos.core.Configurable;
import org.jpos.core.ConfigurationException;
import org.jpos.core.XmlConfigurable;
import org.jpos.q2.QFactory;
import org.jpos.qi.views.DefaultView;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QINavigator extends Navigator {
    private static String URL_PATTERN_STRING = "^[\\w\\s.\\-\\/\\?\\=]{0,255}$";
    private static Pattern ROUTE_PATTERN = Pattern.compile("^\\/(\\w+)\\/*.*");
    public Validator validator;
    QI app;
    Map<String,String> perms = new HashMap<>();
    Map<String,String> routes = new HashMap<>();
    private QFactory qfactory;

    public QINavigator(QI app, Layout layout) {
        super(app, layout);
        this.app = app;
        validator = new RegexpValidator("Invalid URL",URL_PATTERN_STRING);
        qfactory = app.getQ2().getFactory();
        initNavigator();
    }

    @SuppressWarnings("unchecked")
    private void initNavigator() {
        for (Element e : app.getXmlConfiguration().getChildren("view")) {
            String route = e.getAttributeValue("route");
            String clazz = e.getAttributeValue("class");
            String perm = e.getAttributeValue("perm", "-");
            try {
                Class c = Class.forName(clazz);
                if (View.class.isAssignableFrom(c)) {
                    removeView("/" + route);
                    addProvider (new QIViewProvider ("/" + route, c, e));
                } else {
                    addView ("/" + route, DefaultView.class);
                }
                perms.put(route, perm);
                e.getChildren("property").stream().filter(p -> "entityName".equals(p.getAttributeValue("name"))).forEach(
                        p -> {
                            if (routes.get(p.getAttributeValue("value")) == null ) {
                                routes.put(p.getAttributeValue("value"), route);
                            }
                        });
            } catch (ClassNotFoundException ex) {
                app.getLog().error(ex);
            }
            app.addView(route, e);
        }
    }

    @Override
    public void navigateTo(String navigationState) {
        if (app.getUser().isForcePasswordChange()) {
            super.navigateTo("/users/" + app.getUser().getId() + "/profile/password_change");
            return;
        }
        if (navigationState == null || "".equals(navigationState)) {
            super.navigateTo("/home");
        } else {
            ValidationResult result = validator.apply(navigationState, app.getValueContext());
            if (!result.isError()) {
                try {
                    Matcher m = ROUTE_PATTERN.matcher(navigationState);
                    boolean allowed = false;
                    if (m.matches()) {
                        String route = m.group(1);
                        allowed = hasAccessToRoute(route);
                    }
                    if (!allowed) {
                        navigationState = "/home";
                    }
                    super.navigateTo(navigationState);
                    if (app.sidebar() != null) {
                        app.sidebar().markAsSelected(navigationState.substring(1).split("/,\\?")[0]);
                    }
                } catch( IllegalArgumentException e) {
                    QI.getQI().displayNotification(e.getMessage());
                    super.navigateTo("/home");
                }
            } else {
                QI.getQI().displayNotification(result.getErrorMessage());
                super.navigateTo("/home");
            }
        }
    }

    public boolean hasAccessToRoute (String route) {
        String required = perms.get(route);
        required = "*".equals(required) ? null : required;
        return required == null || QI.getQI().getUser().hasPermission(required);
    }

    public String getRouteForEntity(String entityName) {
        return routes.get(entityName);
    }

    public class QIViewProvider implements ViewProvider {
        private final String viewName;
        private final Class<? extends View> viewClass;
        private final Element config;

        public QIViewProvider(String viewName, Class<? extends View> viewClass, Element config) {
            if (null == viewName || null == viewClass) {
                throw new IllegalArgumentException("View name and class should not be null");
            }
            this.viewName = viewName;
            this.viewClass = viewClass;
            this.config = config;
        }

        @Override
        public String getViewName(String navigationState) {
            if (null == navigationState) {
                return null;
            }
            if (navigationState.equals(viewName)
                    || navigationState.startsWith(viewName + "/")) {
                return viewName;
            }
            return null;
        }

        @Override
        public View getView(String viewName) {
            if (this.viewName.equals(viewName)) {
                try {
                    View view = viewClass.newInstance();
                    if (view instanceof Configurable) {
                        ((Configurable)view).setConfiguration(qfactory.getConfiguration(config));
                    }
                    if (view instanceof XmlConfigurable) {
                        ((XmlConfigurable)view).setConfiguration(config);
                    }
                    String sidebar = config.getAttributeValue("sidebar");
                    if (sidebar != null) {
                        QI.getQI().sidebar().switchTo(sidebar);
                    }
                    return view;
                } catch (ConfigurationException | InstantiationException | IllegalAccessException e) {
                    app.getLog().warn(e);
                }
            }
            return null;
        }
    }
}
