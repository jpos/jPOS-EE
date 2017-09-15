package org.jpos.qi.eeuser;

import com.vaadin.data.provider.ConfigurableFilterDataProvider;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.apache.commons.lang3.StringUtils;
import org.jpos.ee.BLException;
import org.jpos.ee.Consumer;
import org.jpos.ee.Role;
import org.jpos.ee.User;
import org.jpos.qi.ConfirmDialog;
import org.jpos.qi.QIEntityView;
import org.jpos.qi.QIHelper;
import org.jpos.util.QIUtils;


/**
 * Created by jr on 9/11/17.
 */
public class ConsumersView extends QIEntityView<Consumer> {

    public ConsumersView() {
        super(Consumer.class, "consumers");
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

    private HorizontalLayout createUserPanel() {
        HorizontalLayout hl = new HorizontalLayout();
        hl.setMargin(new MarginInfo(false,true,true,true));
        hl.setSpacing(true);
        ComboBox<User> box = createUserBox();
        box.setStyleName(ValoTheme.COMBOBOX_SMALL);
        box.addValueChangeListener(listener -> {
            ConfigurableFilterDataProvider wrapper = (ConfigurableFilterDataProvider) getGrid().getDataProvider();
            wrapper.setFilter(listener.getValue());
            wrapper.refreshAll();
        });
        hl.addComponent(box);
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
        g.addColumn(consumer -> consumer.getRolesAsString()).setId("roles");
        g.addColumn(Consumer::getStartDate).setId("startDate");
        g.addColumn(Consumer::getEndDate).setId("endDate");
        g.addColumn(consumer -> consumer.getUser().getNickAndId()).setId("user");
        g.addColumn(Consumer::isActive).setId("active");
        g.addColumn(Consumer::isDeleted).setId("deleted");
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
            return u.getId() != null ? u.getId() : "New";
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
        if ("user".equalsIgnoreCase(propertyId)) {
            ComboBox<User> box = createUserBox();
            formatField(propertyId,box).bind(propertyId);
            box.setEnabled(false);
            return box;
        }
        if ("startdate".equalsIgnoreCase(propertyId) || "endDate".equalsIgnoreCase(propertyId)) {
            return buildAndBindDateField(propertyId);
        }
        return null;
    }

    public void saveEntity () throws BLException {
        //todo: get secret
        getApp().addWindow(new ConfirmDialog(
                getApp().getMessage("secretTitle"),
                getApp().getMessage("secretDescription","el secreto"),
                confirm -> {
                    if (confirm) {
                        super.saveEntity();
                    }
                }));
    }

    @Override
    public boolean canEdit() {
        return true;
    }
    @Override
    public boolean canAdd() {return true;}
    public boolean canRemove() {return true;}
}
