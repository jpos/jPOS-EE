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

package org.jpos.qi.eeuser;

import com.vaadin.data.Binder;
import com.vaadin.data.Validator;
import com.vaadin.data.validator.EmailValidator;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.*;
import com.vaadin.ui.Grid;
import com.vaadin.ui.themes.ValoTheme;
import org.apache.commons.lang3.StringUtils;
import org.jpos.ee.*;
import org.jpos.qi.*;
import org.jpos.util.PasswordGenerator;

import java.util.List;


public class UsersView extends QIEntityView<User> {

    private User selectedU;
    private Binder<String> passwordBinder;
    private PasswordField currentPasswordField;
    private PasswordField repeatPasswordField;
    private Panel passwordPanel;
    private Button changePassBtn;
    private Button resetPassBtn;
    private boolean forcePasswordChange;
    private boolean binderIsReadOnly;   //used while binder.isReadOnly not implemented by Vaadin

    public UsersView () {
        super(User.class, "users");
    }

    @Override
    public String getHeaderSpecificTitle(Object entity) {
        if (entity instanceof User) {
            User u = (User) entity;
            return u.getNick() != null ? u.getId() + " - " + u.getNick() : "New";
        } else {
            return null;
        }
    }

    @Override
    public Object getEntity(Object entity) {
        if(entity instanceof User) {
            User u = (User) entity;
            if(u.getId() != null) {
                return getHelper().getEntityByParam(String.valueOf(u.getId()));
            }
        }
        return null;
    }

    @Override
    public User createNewEntity() {
        return new User();
    }

    @Override
    public QIHelper createHelper() {
        return new UsersHelper();
    }

    @Override
    public void saveEntity() throws BLException {
        QI app = getApp();
        String generatedPassword = PasswordGenerator.generateRandomPassword();
        if (((UsersHelper) getHelper()).saveUser(getBinder(), generatedPassword)) {
            showGeneratedPassword(generatedPassword);
            app.displayNotification(app.getMessage("created", getEntityName().toUpperCase()));
            app.getNavigator().navigateTo(getGeneralRoute());
        }
    }

    @Override
    public void updateEntity() throws BLException
    {
        String current = "";
        String repeat = "";
        if (passwordBinder != null) {
            current = currentPasswordField != null ? currentPasswordField.getValue() : "";
            repeat = repeatPasswordField != null ? repeatPasswordField.getValue() : "";
        }
        if (((UsersHelper)getHelper()).updateUser(getBinder(), current, repeat)){
            getApp().displayNotification(getApp().getMessage("updated", getEntityName().toUpperCase()));
            if (getApp().getUser().equals(getBean())) {
                getApp().getUser().setName(getBean().getName());
                getApp().getHeader().refresh();
            }
        }
        else
            getApp().displayNotification(getApp().getMessage("notchanged"));
    }

    @Override
    public void showSpecificView (String parameter) {
        forcePasswordChange = parameter.contains("password_change");
        super.showSpecificView(parameter);
        if (forcePasswordChange && passwordBinder != null) {
            getEditBtn().click();
            passwordBinder.setReadOnly(false);
            binderIsReadOnly = false;
            changePassBtn.setEnabled(false);
            getCancelBtn().setEnabled(false);
            getApp().scrollIntoView(passwordPanel);
        }

    }

    protected Component buildAndBindCustomComponent(String propertyId) {
        if ("roles".equals(propertyId)) {
            CheckBoxGroup g = new CheckBoxGroup(StringUtils.capitalize(getCaptionFromId(propertyId)));
            g.setItems(((UsersHelper)getHelper()).getRoles());
            g.setItemCaptionGenerator((ItemCaptionGenerator<Role>) item -> StringUtils.capitalize(item.getName()));
            List<Validator> v = getValidators(propertyId);
            Binder.BindingBuilder builder = getBinder().forField(g);
            for (Validator val : v) {
                builder.withValidator(val);
            }
            builder.bind(propertyId);
            return g;
        }
        return null;
    }

    protected List<Validator> getValidators(String propertyId) {
        List<Validator> list = super.getValidators(propertyId);
        if ("email".equals(propertyId)) {
            list.add(new EmailValidator(getApp().getMessage("errorMessage.invalidEmail")) {
                @Override
                protected boolean isValid(String value) {
                    return value == null || value.isEmpty() || super.isValid(value);
                }
            });
        }
        if ("nick".equals(propertyId)) {
            list.add(((UsersHelper)getHelper()).getNickTakenValidator());
        }
        return list;
    }


    @Override
    public void setGridGetters() {
        Grid<User> g = getGrid();
        g.addColumn(User::getId).setId("id");
        g.addColumn(User::getName).setId("name");
        g.addColumn(User::getNick).setId("nick");
        g.addColumn(User::getEmail).setId("email");
        g.addColumn(User::isActive).setId("active");
        g.addColumn(User::isDeleted).setId("deleted");
        g.addColumn(User::isVerified).setId("verified");
        g.addColumn(User::getStartDate).setId("startDate");
        g.addColumn(User::getEndDate).setId("endDate");
        g.addColumn(User::isForcePasswordChange).setId("forcePasswordChange");
        g.addColumn(User::getLastLogin).setId("lastLogin");
        g.addColumn(User::getPasswordChanged).setId("passwordChanged");
        g.addColumn(User::getLoginAttempts).setId("loginAttempts");

    }

    private Button createChangePasswordButton () {
        Button b = new Button(getApp().getMessage("changePassword"));
        b.setIcon(VaadinIcons.LOCK);
        b.setStyleName(ValoTheme.BUTTON_LINK);
        b.addStyleName(ValoTheme.BUTTON_SMALL);
        b.setEnabled(false);
        b.addClickListener((Button.ClickListener) event -> {
            passwordPanel.setVisible(!passwordPanel.isVisible());
            passwordBinder.setReadOnly(!binderIsReadOnly);
            changePassBtn.setCaption(passwordPanel.isVisible() ?
                    getApp().getMessage("cancel") : getApp().getMessage("changePassword"));
        });
        return b;
    }

    private Button createResetPasswordButton () {
        Button b = new Button(getApp().getMessage("resetPassword"));
        b.setStyleName(ValoTheme.BUTTON_LINK);
        b.addStyleName(ValoTheme.BUTTON_SMALL);
        b.setEnabled(false);
        b.setIcon(VaadinIcons.REFRESH);
        b.addClickListener((Button.ClickListener) event -> resetPasswordClick());
        return b;
    }

    private void resetPasswordClick () {
        String generated = ((UsersHelper)getHelper()).resetUserPassword(getInstance());
        showGeneratedPassword(generated);
    }

    private void showGeneratedPassword (String generatedPassword) {
        String info = "<strong>" + generatedPassword + "</strong>";
        getApp().addWindow(new InfoDialog(getApp().getMessage("resetPasswordTitle"), info));
    }

    private Panel createPasswordPanel () {
        passwordPanel = new Panel(getApp().getMessage("changePassword"));
        passwordPanel.setIcon(VaadinIcons.LOCK);
        passwordPanel.addStyleName("color1");
        passwordPanel.addStyleName("margin-top-panel");

        VerticalLayout panelContent = new VerticalLayout();
        panelContent.setSizeFull();
        panelContent.setMargin(true);
        panelContent.setSpacing(true);

        FormLayout form = new FormLayout();
        form.setSizeFull();
        panelContent.addComponent(form);
        panelContent.setExpandRatio(form, 1f);

        passwordBinder = new Binder<>();
        passwordBinder.setReadOnly(true);
        binderIsReadOnly=true;
        if (selectedU.getId() != null) {
            currentPasswordField = new PasswordField(getApp().getMessage("passwordForm.currentPassword"));
            currentPasswordField.setWidth("80%");

            passwordBinder.forField(currentPasswordField)
                    .asRequired(getApp().getMessage("errorMessage.req", currentPasswordField.getCaption()))
                    .withValidator(((UsersHelper)getHelper()).getCurrentPasswordMatchValidator())
                    .bind(string->string,null);
            form.addComponent(currentPasswordField);
        }

        PasswordField newPasswordField = new PasswordField(getApp().getMessage("passwordForm.newPassword"));
        newPasswordField.setWidth("80%");
        passwordBinder.forField(newPasswordField)
                .asRequired(getApp().getMessage("errorMessage.req",newPasswordField.getCaption()))
                .withValidator(((UsersHelper)getHelper()).getNewPasswordNotUsedValidator())
                .bind(string->string,null);
        form.addComponent(newPasswordField);

        repeatPasswordField = new PasswordField(getApp().getMessage("passwordForm.confirmPassword"));
        repeatPasswordField.setWidth("80%");
        passwordBinder.forField(repeatPasswordField)
                .asRequired(getApp().getMessage("errorMessage.req", repeatPasswordField.getCaption()))
                .withValidator(((UsersHelper)getHelper()).getPasswordsMatchValidator(newPasswordField))
                .bind(string->string,null);
        form.addComponent(repeatPasswordField);
        passwordPanel.setVisible(forcePasswordChange);
        passwordPanel.setContent(panelContent);
        return passwordPanel;
    }

    private void hidePasswordPanel () {
        if (changePassBtn != null && passwordPanel != null) {
            changePassBtn.setCaption(getApp().getMessage("changePassword"));
            passwordPanel.setVisible(false);
            passwordBinder.setReadOnly(true);
            binderIsReadOnly = true;
        }
    }

    protected void cancelClick (Button.ClickEvent event, Layout formLayout) {
        super.cancelClick (event, formLayout);
        if (changePassBtn != null) {
            changePassBtn.setEnabled(false);
            hidePasswordPanel();
        }
        if (resetPassBtn != null)
            resetPassBtn.setEnabled(false);
    }

    protected boolean saveClick (Button.ClickEvent event, Layout formLayout) {
        if (passwordBinder != null && !binderIsReadOnly) {
            if (!passwordBinder.isValid()) {
                return false;
            }
        }
        if (super.saveClick (event, formLayout)) {
            if (resetPassBtn != null)
                resetPassBtn.setEnabled(false);
            if (changePassBtn != null) {
                passwordBinder.readBean("");
                changePassBtn.setEnabled(false);
                hidePasswordPanel();
            }
            return true;
        }
        return false;
    }

    @Override
    protected void editClick (Button.ClickEvent event, Layout formLayout) {
        super.editClick (event, formLayout);
        if (resetPassBtn != null)
            resetPassBtn.setEnabled(true);
        if (changePassBtn != null)
            changePassBtn.setEnabled(true);
    }

    @Override
    protected void addFields(Layout l) {
        super.addFields(l);
        selectedU = getBean();
        if (getBean().getId() != null && getBean().getId().equals(getApp().getUser().getId())) {
            changePassBtn = createChangePasswordButton();
            l.addComponents(changePassBtn, createPasswordPanel());
        }
        if (getBean().hasPermission("sysadmin") && !isNewView()) {
            resetPassBtn = createResetPasswordButton();
            l.addComponent(resetPassBtn);
        }
    }

    @Override
    public boolean canEdit() {
        return true;
    }

    @Override
    public boolean canAdd() {
        return true;
    }

    @Override
    public boolean canRemove() {
        return true;
    }

}
