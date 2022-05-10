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

package org.jpos.qi.eeuser;

import com.vaadin.data.provider.ConfigurableFilterDataProvider;
import com.vaadin.data.provider.Query;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.*;
import com.vaadin.ui.renderers.HtmlRenderer;
import com.vaadin.ui.themes.ValoTheme;
import org.apache.commons.lang3.StringUtils;
import org.bouncycastle.util.encoders.Base64;
import org.jpos.crypto.CryptoService;
import org.jpos.ee.*;
import org.jpos.qi.ConfirmDialog;
import org.jpos.qi.QIEntityView;
import org.jpos.qi.QIHelper;
import org.jpos.util.NameRegistrar;
import org.jpos.qi.util.QIUtils;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

import static org.jpos.qi.util.QIUtils.getCaptionFromId;


/**
 * Created by jr on 9/11/17.
 */
public class ConsumersView extends QIEntityView<Consumer> {

    private static final String HASH_ALGORITHM = "HmacSHA256";
    private ComboBox<User> userComboBox;
    private User selectedUser;

    public ConsumersView() {
        super(Consumer.class);
    }

    @Override
    protected HorizontalLayout createHeader (String title) {
        HorizontalLayout header;
        if (isGeneralView()) {
            VerticalLayout main = new VerticalLayout();
            main.setMargin(false);
            HorizontalLayout hl = super.createHeader(title);
            main.addComponent(hl);
            main.addComponent(createUserPanel());
            header = new HorizontalLayout(main);
        } else {
            header = super.createHeader(title);
        }
        header.setWidth("100%");
        return header;
    }

    @Override
    public void showSpecificView (final String parameter) {
        String[] params = parameter.split("\\?user=");
        if (params.length > 1) {
            String userId = params[1];
            try {
                this.selectedUser = DB.exec(db -> {
                    UserManager mgr = new UserManager(db);
                    return mgr.getItemByParam("id",userId,false);
                });
            } catch (Exception e) {
                getApp().getLog().error(e);
            }
            super.showSpecificView(parameter);
        } else if (parameter.contains("new")){
            getApp().displayError(getApp().getMessage("errorMessage.invalidUser"),
                    getApp().getMessage("errorMessage.mustSelectUser"));
            getApp().getNavigator().navigateTo(getGeneralRoute());
        } else {
            super.showSpecificView(parameter);
        }
    }

    @Override
    protected void navigateToNewRoute() {
        getApp().getNavigator().navigateTo(getGeneralRoute() + "/new?user=" + this.selectedUser.getId());
    }

    private HorizontalLayout createUserPanel() {
        HorizontalLayout hl = new HorizontalLayout();
        hl.setMargin(new MarginInfo(false,true,true,true));
        hl.setSpacing(true);
        userComboBox = createUserBox();
        userComboBox.setStyleName(ValoTheme.COMBOBOX_SMALL);
        userComboBox.addValueChangeListener(listener -> {
            ConfigurableFilterDataProvider wrapper = (ConfigurableFilterDataProvider) getGrid().getDataProvider();
            wrapper.setFilter(listener.getValue());
            this.selectedUser = listener.getValue();
            wrapper.refreshAll();
        });
        hl.addComponent(userComboBox);
        return hl;
    }

    private ComboBox<User> createUserBox() {
        ComboBox<User> box = new ComboBox(QIUtils.getCaptionFromId("user"));
        box.setItemCaptionGenerator(User::getNickAndId);
        UsersHelper usersHelper = new UsersHelper();
        box.setDataProvider(usersHelper.getDataProvider());
        box.setEmptySelectionAllowed(false);
        return box;
    }

    @Override
    public void setGridGetters() {
        Grid<Consumer> g = getGrid();
        g.addColumn(Consumer::getId).setId("id");
        g.addColumn(Consumer::getRolesAsString).setId("roles");
        g.addColumn(Consumer::getStartDate).setId("startDate");
        g.addColumn(Consumer::getEndDate).setId("endDate");
        g.addColumn(consumer -> consumer.getUser().getNickAndId()).setId("user");
        g.addColumn(consumer -> {
            String active = VaadinIcons.CHECK.getHtml();
            String inActive = VaadinIcons.CLOSE.getHtml();
            return consumer.isActive() ? active : inActive;
        }).setId("active").setRenderer(new HtmlRenderer());
        g.addColumn(Consumer::isDeleted).setId("deleted");
        //select first item on user combobox
        userComboBox.setValue(userComboBox.getDataProvider().fetch(new Query<>()).findFirst().orElse(null));
    }

    @Override
    public QIHelper createHelper() {
        return new ConsumersHelper(Consumer.class);
    }

    @Override
    public Object getEntity(Object entity) {
        if(entity instanceof Consumer) {
            Consumer u = (Consumer) entity;
            if(u.getId() != null) {
                return getHelper().getEntityByParam(String.valueOf(u.getId()));
            }
        }
        return null;
    }

    @Override
    public String getHeaderSpecificTitle(Object entity) {
        if (entity instanceof Consumer) {
            Consumer u = (Consumer) entity;
            return u.getId() != null ? u.getId() : getApp().getMessage("new");
        } else {
            return null;
        }
    }

    protected Component buildAndBindCustomComponent(String propertyId) {
        if ("roles".equalsIgnoreCase(propertyId)) {
            CheckBoxGroup<Role> checkBoxGroup = new CheckBoxGroup<>(QIUtils.getCaptionFromId(propertyId));
            checkBoxGroup.setItems(((ConsumersHelper)getHelper()).getRoles());
            checkBoxGroup.setItemCaptionGenerator(role -> StringUtils.capitalize(role.getName()));
            formatField(propertyId,checkBoxGroup).bind(propertyId);
            return checkBoxGroup;
        }
        if ("startdate".equalsIgnoreCase(propertyId) || "endDate".equalsIgnoreCase(propertyId)) {
            return getFieldFactory().buildAndBindDateField(propertyId);
        }
        if ("user".equalsIgnoreCase(propertyId) && getFieldFactory().isLinkField(propertyId)) {
            String url = getViewConfig().getFields().get(propertyId).getLink();
            UserLinkField field = new UserLinkField (url);
            field.setCaption(getCaptionFromId("field." + propertyId));
            formatField(propertyId, field).bind(propertyId);
            return field;
        }
        return null;
    }

    public void saveEntity () {
        Consumer c = getInstance();
        if (getBinder().writeBeanIfValid(c)) {
            c.setUser(this.selectedUser);
            String sk = "?";
            try{
                sk = Base64.toBase64String(generateKey().getEncoded());
                c.setHash(HashVersion.ONE.hash(Long.toString(c.getUser().getId(),16), sk, HashVersion.ONE.getSalt()));
            } catch (Exception e) {
                getApp().getLog().error(e);
            }
            getApp().addWindow(new ConfirmDialog(
                getApp().getMessage("secretTitle"),
                getApp().getMessage("secretDescription", sk),
                getApp().getMessage("secretConfirm"),
                getApp().getMessage("cancel"),
                confirm -> {
                    if (confirm) {
                        super.saveEntity();
                    }
            }));
        }
    }

    private CryptoService getCryptoService() throws NameRegistrar.NotFoundException {
       return (CryptoService) NameRegistrar.get("crypto-service");
    }

    private SecretKey generateKey () throws NoSuchAlgorithmException {
        KeyGenerator gen = KeyGenerator.getInstance(HASH_ALGORITHM);
        return gen.generateKey();
    }
}
