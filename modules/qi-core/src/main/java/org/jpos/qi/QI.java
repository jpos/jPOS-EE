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

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.*;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.jdom2.DataConversionException;
import org.jdom2.Element;
import org.jpos.core.ConfigurationException;
import org.jpos.ee.DB;
import org.jpos.ee.User;
import org.jpos.ee.Visitor;
import org.jpos.ee.VisitorManager;
import org.jpos.iso.ISOUtil;
import org.jpos.q2.Q2;
import org.jpos.q2.qbean.QXmlConfig;
import org.jpos.qi.login.LoginView;
import org.jpos.util.Log;
import org.jpos.util.NameRegistrar;

import javax.servlet.http.Cookie;
import java.text.MessageFormat;
import java.util.*;

@Theme("jpos")
@Title("jPOS")
public class QI extends UI {
    private Locale locale;
    private ResourceBundle messages;
    private Log log;
    private Q2 q2;

    private static final String CONFIG_NAME = "QI";
    private static final long CONFIG_TIMEOUT = 5000L;
    private static ThreadLocal<DB> tldb = new ThreadLocal<>();

    private HashMap<String,ViewConfig> views;

    private Visitor visitor;
    private QILayout qiLayout;
    private Header header;
    private Sidebar sidebar;
    private LoginView loginView;

    public QI() {
        locale = Locale.getDefault();
        messages = ResourceBundle.getBundle("messages", locale);
        log = Log.getLog(Q2.LOGGER_NAME, "QI");
        qiLayout = new QILayout();
        views = new HashMap<>();
        try {
            q2 = (Q2) NameRegistrar.get("Q2");
        } catch (NameRegistrar.NotFoundException e) {
            throw new IllegalStateException ("Q2 not available");
        }
    }

    @Override
    protected void init(VaadinRequest request) {
        Element cfg = getXmlConfiguration();
        if (cfg != null) {
            setContent(qiLayout);
            setResponsive(true);
            addStyleName(ValoTheme.UI_WITH_MENU);
            init(request, cfg);

            try (DB db = new DB()) {
                db.open();
                db.beginTransaction();
                visitor = getVisitor(db);
                User user = getUser();
                if (user == null) {
                    user = visitor.getUser();
                    if (user != null) {
                        setUser(user);
                    }
                }
                if (user == null || !user.isActive())
                    createLoginView();
                else
                    createMainView();
                db.commit();
            }
        }
    }
    public String getMessage (String id, Object... obj) {
        MessageFormat mf = new MessageFormat (messages.getString (id));
        mf.setLocale(locale);
        return mf.format (obj);
    }
    public String getMessage (ErrorMessage em) {
        return messages.containsKey(em.getPropertyName()) ?
                messages.getString(em.getPropertyName()) :
                em.getDefaultMessage();
    }
    public String getMessage (ErrorMessage em, Object... obj) {
        String format = messages.containsKey(em.getPropertyName()) ?
                messages.getString(em.getPropertyName()) :
                em.getDefaultMessage();

        MessageFormat mf = new MessageFormat (format, locale);
        return mf.format (obj);
    }

    @SuppressWarnings("unused")
    private void init (VaadinRequest vr, Element cfg) {
        String title = cfg.getChildText("title");
        String theme = cfg.getChildText("theme");
        String localeName = cfg.getChildText("locale");
        String logger = cfg.getAttributeValue("logger");
        if (logger != null) {
            String realm = cfg.getAttributeValue("realm");
            log = Log.getLog(logger, realm != null ? realm : "QI");
        }
        if (title != null)
            getPage().setTitle(title);
        if (theme != null) {
            setTheme(theme);
        }
        if (localeName != null) {
            Locale l  = Locale.forLanguageTag(localeName);
            if (l.hashCode() == 0) {
                Notification.show(
                    getMessage(ErrorMessage.SYSERR_INVALID_LOCALE, localeName),
                    Notification.Type.ERROR_MESSAGE);
            } else {
                locale = l;
                messages = ResourceBundle.getBundle("messages", locale);
            }
        }
    }

    public Log getLog() {
        return log;
    }

    public void displayNotification (String message) {
        Notification n = new Notification(message,Notification.Type.TRAY_NOTIFICATION);
        n.setHtmlContentAllowed(true);
        n.show(Page.getCurrent());
    }
    public void displayNotificationMessage (String message) {
        Notification n = new Notification(getMessage(message),Notification.Type.TRAY_NOTIFICATION);
        n.setHtmlContentAllowed(true);
        n.show(Page.getCurrent());
    }

    public void displayError (String error, String detail, Object... obj) {
        Notification.show(
                getMessage(error),
                getMessage(detail, obj),
                Notification.Type.ERROR_MESSAGE
        );
    }

    public void login (User user, boolean rememberMe) {
        setUser(user);
        try (DB db = new DB()) {
            db.open();
            db.beginTransaction();
            db.session().refresh(user);
            db.session().refresh(visitor);
            if (rememberMe)
                visitor.setUser(user);
            String users = visitor.getProps().get("USERS");
            users = users == null ? "" : users;
            if (!users.contains(user.getNickAndId())) {
                if (users.length() > 0)
                    users = users + ",";
                visitor.getProps().put("USERS", users + user.getNickAndId());
            }
            user.setLastLogin(new Date());
            db.session().update(visitor);
            db.session().update(user);
            db.commit();
        }
        getLog().info(String.format(
                "LOGIN user=%s[id=%d], visitor='%s'%s",
                user.getNick(),
                user.getId(),
                ISOUtil.protect(visitor.getId()),
                rememberMe ? ", remember=yes" : ""));
        qiLayout.getContentLayout().removeComponent(loginView);
        createMainView();
        String fragment = UI.getCurrent().getPage().getUriFragment();
        if (fragment != null && !fragment.isEmpty() && fragment.startsWith("!"))
            navigateTo(fragment.substring(1));
    }


    void logout() {
        qiLayout.removeAllComponents();
        getSession().close();
        if (visitor.getUser() != null) {
            try (DB db = new DB()) {
                db.open();
                db.beginTransaction();
                db.session().refresh(visitor);
                visitor.setUser(null);
                db.session().update(visitor);
                db.commit();
            }
        }
        getUI().getPage().setLocation("/");
        // Invalidate underlying session instead if login info is stored there
        // VaadinService.getCurrentRequest().getWrappedSession().invalidate();
        // Redirect to avoid keeping the removed UI open in the browser
        //getUI().getPage().setLocation("http://jpos.org");
        // createLoginView();
    }

    public User getUser() {
        try {
            VaadinSession.getCurrent().getLockInstance().lock();
            return VaadinSession.getCurrent().getAttribute(User.class);
        } finally {
            VaadinSession.getCurrent().getLockInstance().unlock();
        }
    }

    public void setUser (User user) {
        // Store user in VaadinSession.
        if (user != null) {
            try {
                VaadinSession.getCurrent().getLockInstance().lock();
                if (VaadinSession.getCurrent().getAttribute(User.class) == null)
                    VaadinSession.getCurrent().setAttribute(User.class, user);
            } finally {
                VaadinSession.getCurrent().getLockInstance().unlock();
            }
        }
    }

    public static QI getQI() {
        return (QI) UI.getCurrent();
    }

    public static DB getDB() {
        DB db = tldb.get();
        if (db == null) {
            db = new DB();
            db.open();
            tldb.set(db);
        }
        return db;
    }

    static void closeDB() {
        DB db = tldb.get();
        if (db != null) {
            db.close();
            tldb.remove();
        }
    }

    void navigateTo(String navigationState) {
        getNavigator().navigateTo(navigationState);
    }

    Element getXmlConfiguration() {
        Element cfg = QXmlConfig.getConfiguration (CONFIG_NAME, CONFIG_TIMEOUT);
        if (cfg == null) {
            Notification.show(getMessage(ErrorMessage.SYSERR_CONFIG_NOT_FOUND), Notification.Type.ERROR_MESSAGE);
            return null;
        }
        return cfg;
    }

    Sidebar sidebar() {
        return sidebar;
    }

    private void createLoginView () {
        qiLayout.getContentLayout().addComponent(loginView = new LoginView());
    }

    private Visitor getVisitor(DB db) {
        VaadinRequest request = VaadinService.getCurrentRequest();
        Cookie[] cookies = request.getCookies();
        if (cookies == null)
            cookies = new Cookie[0];

        VisitorManager vmgr = new VisitorManager(db, cookies);
        Visitor v = vmgr.getVisitor(true);
        if (v != null) {
            vmgr.set (v, "IP", request.getRemoteAddr());
            vmgr.set (v,"HOST", request.getRemoteHost());
        }
        VaadinService.getCurrentResponse().addCookie(vmgr.getCookie());
        return v;
    }

    private void createMainView() {
        setNavigator(new QINavigator(this, qiLayout.getContentLayout()));
        if (qiLayout.getHeaderLayout() != null) {
            header = new Header(this);
            qiLayout.getHeaderLayout().addComponent(header);
        }
        sidebar = new Sidebar();
        if (sidebar.isEnabled()) {
            qiLayout.addMenu(sidebar);
            Page.getCurrent().addBrowserWindowResizeListener(
              (Page.BrowserWindowResizeListener) event -> {
                  if (sidebar != null && event.getWidth() < 1100)
                      sidebar.expandSidebar();
              });
        }
        if (getUser().isForcePasswordChange())
            navigateTo("/users/" + getUser().getId() + "/profile/password_change");
    }

    public Header getHeader() {
        return header;
    }

    public HashMap<String, ViewConfig> getViews() {
        return views;
    }

    public void setViews(HashMap<String, ViewConfig> views) {
        this.views = views;
    }

    void addView(String route, Element e) {
        ViewConfig vc = new ViewConfig();
        try {
            vc.setXmlElement(e);
            vc.setConfiguration(getQ2().getFactory().getConfiguration(e));
            this.views.put(route, vc);
        } catch (ConfigurationException | DataConversionException exc) {
            getLog().warn(exc);
        }
    }

    public ViewConfig getView(String route) {
        return views.get(route);
    }

    public Q2 getQ2() {
        return q2;
    }
}
