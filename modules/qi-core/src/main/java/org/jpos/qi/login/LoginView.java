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

package org.jpos.qi.login;

import com.vaadin.data.Binder;
import com.vaadin.data.validator.RegexpValidator;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.*;
import com.vaadin.event.ShortcutListener;
import com.vaadin.server.Page;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.event.ShortcutAction;
import com.vaadin.ui.themes.ValoTheme;
import org.jpos.ee.*;
import org.jpos.qi.QI;
import org.jpos.qi.QIResources;

import java.text.ParseException;
import java.util.*;

@SuppressWarnings("serial")
public class LoginView extends VerticalLayout {
    private QI app;
    private LoginHelper helper;
    private TextField username;
    private PasswordField password;
    private CheckBox rememberMe;
    private HorizontalLayout buttonsLayout;
    private Label errorLabel;
    private Button loginBtn;
    private Binder<String> binder;  //just used to add validators to fields


    public String USERNAME_PATTERN =  "^[\\w|#=@.-]{1,60}$";
    public String PASSWORD_PATTERN = "^[\\w|#=@!\\_.-]{1,64}$";

    public LoginView () {
        super();
        app = QI.getQI();
        helper = new LoginHelper();
        setSizeFull();
        addStyleName("login-view");
        createMainPanel(
                createTitle(),
                createForm(),
                createButtons(),
                createErrorLabel()
        );
    }

    public void login () {
        String u = username.getValue();
        String p = password.getValue();
        if (u.length() > 0 && p.length() == 0) {
            password.focus();
            return;
        }
        boolean failed = true;
        errorLabel.setValue("");


        try {
            if (binder.isValid()) {
                final User user = helper.getUserByNick(u, p);
                if (user != null && user.isActive() && ("admin".equals(user.getNick()) || user.hasPermission("login"))) {
                    helper.clearLoginAttempts(user);
                    clearErrorMessages();
                    buttonsLayout.removeAllComponents();
                    helper.checkPasswordAge(user);
                    loginOk(user, rememberMe.getValue());
                    failed = false;
                }
            } else {
                failed = true;
            }
        } catch (ParseException e) {
            app.displayNotification(e.getMessage());
        }
        if (failed) {
            username.focus();
            loginFailed(u, helper.getUserByNick(u));
        }

    }

    private void loginOk (User user, boolean rememberMe) {
        Collection<ShortcutListener> col = (Collection<ShortcutListener>) loginBtn.getListeners(ShortcutAction.class);
        for (ShortcutListener aCol : col) loginBtn.removeShortcutListener(aCol);
        app.login(user, rememberMe);
    }

    private void clearErrorMessages () {
        errorLabel.setValue("");
    }

    private void loginFailed (String nick, User user) {
        boolean userLocked = false;
        if (user != null) {
            int attempts = helper.addLoginAttempt(user);
            int maxLoginAttempts;
            try {
                maxLoginAttempts = helper.getMaxLoginAttempts();
            } catch (NumberFormatException exc) {
                app.displayError("errorMessage.invalidSysConfig",
                        "errorMessage.invalidSysConfigFormat", LoginConstants.MAX_LOGIN_ATTEMPTS.name()
                );
                maxLoginAttempts = 0;
            }
            if (maxLoginAttempts != 0 && attempts >= maxLoginAttempts) {
                helper.lockUser(user);
                userLocked = true;
            }
        }
        //Display message
        String descKey = userLocked ? "login.fail.maxAttempts" : "login.fail.desc";
        Notification notif = new Notification (
                app.getMessage("login.fail"),
                app.getMessage(descKey, nick),
                Notification.Type.ERROR_MESSAGE,
                true
        );
        notif.show(Page.getCurrent());
    }

    private VerticalLayout createMainPanel (Component... components) {
        VerticalLayout vl = new VerticalLayout();
        vl.setSizeUndefined();
        vl.addStyleName("login-panel");
        addComponent(vl);
        setComponentAlignment(vl, Alignment.MIDDLE_CENTER);

        for (Component c : components)
            vl.addComponent(c);
        return vl;
    }


    private HorizontalLayout createButtons () {
        buttonsLayout = new HorizontalLayout();
        buttonsLayout.setWidth("100%");
        buttonsLayout.setMargin(new MarginInfo(true, false, false, false));

        loginBtn = new Button (
                app.getMessage("login"),
                event -> {
                    login();
                }
        );
        loginBtn.addStyleName(ValoTheme.BUTTON_PRIMARY);
        loginBtn.addShortcutListener(
                new ShortcutListener("Sign In", ShortcutAction.KeyCode.ENTER, null) {
                    @Override
                    public void handleAction(Object sender, Object target) {
                        login();
                    }
                }
        );
        buttonsLayout.addComponent(loginBtn);
        buttonsLayout.setComponentAlignment(loginBtn, Alignment.MIDDLE_RIGHT);
        return buttonsLayout;
    }

    private Label createErrorLabel() {
        errorLabel = new Label("", ContentMode.HTML);
        errorLabel.addStyleName("error");
        errorLabel.setSizeUndefined();
        errorLabel.addStyleName("light");
        return errorLabel;
    }

    private HorizontalLayout createTitle () {
        HorizontalLayout labels = new HorizontalLayout();
        labels.setWidth("100%");
        labels.setMargin(new MarginInfo(false, false, true, false));
        labels.addStyleName("labels");

        Label title = new Label(app.getMessage("login.title"));
        title.setSizeUndefined();
        title.addStyleName(ValoTheme.LABEL_H4);
        title.addStyleName(ValoTheme.LABEL_COLORED);
        labels.addComponent(title);
        labels.setComponentAlignment(title, Alignment.BOTTOM_LEFT);

        Embedded logo = new Embedded("", QIResources.JPOS_LOGO);
        logo.setHeight("80px");
        labels.addComponent(logo);
        labels.setComponentAlignment(logo, Alignment.TOP_RIGHT);

        return labels;
    }

    private FormLayout createForm () {
        FormLayout formLayout = new FormLayout();
        formLayout.setMargin(false);
        formLayout.setSizeUndefined();

        binder = new Binder<>(String.class);
        username = new TextField (app.getMessage("login.username"));
        username.setMaxLength(60);


        binder.forField(username)
                .withValidator(new RegexpValidator(
                        app.getMessage("errorMessage.invalidField", username.getCaption())
                        ,USERNAME_PATTERN
                ))
                .bind(string -> string, null);
        binder.setBean("");
        username.focus();
        password = new PasswordField();
        password.setCaption(app.getMessage("login.password"));
        password.setMaxLength(64);

        binder.forField(password)
                .asRequired(app.getMessage("errorMessage.req", password.getCaption()))
                .withValidator(new RegexpValidator(
                        app.getMessage("errorMessage.invalidField", password.getCaption()),
                        PASSWORD_PATTERN)
                )
                .bind(string -> string, null);

        rememberMe = new CheckBox (app.getMessage("login.remember"));
        rememberMe.setDescription(app.getMessage("login.rememberDesc"));

        formLayout.addComponent(username);
        formLayout.addComponent(password);
        if (helper.isRememberEnabled())
            formLayout.addComponent (rememberMe);
        return formLayout;
    }
}
