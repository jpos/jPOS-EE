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

import com.vaadin.data.*;
import com.vaadin.data.converter.StringToBigDecimalConverter;
import com.vaadin.data.converter.StringToLongConverter;
import com.vaadin.data.validator.RegexpValidator;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.*;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.renderers.DateRenderer;
import com.vaadin.ui.renderers.NumberRenderer;
import com.vaadin.ui.renderers.Renderer;
import com.vaadin.ui.themes.ValoTheme;
import com.vaadin.shared.ui.ContentMode;

import com.vaadin.event.ShortcutAction;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.shared.ui.MarginInfo;

import org.apache.commons.lang3.StringUtils;
import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.ee.BLException;
import org.jpos.ee.DB;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public abstract class QIEntityView<T> extends VerticalLayout implements View, Configurable {
    private QI app;
    private Class<T> clazz;
    private boolean generalView;
    private String title;
    private String generalRoute;
    private String[] visibleColumns;
    private String[] visibleFields;
    private String[] readOnlyFields;
    private Grid grid;
    private RevisionsPanel revisionsPanel;
    private QIHelper helper;
    private boolean showRevisionHistoryButton;
    private Button editBtn;
    private Button removeBtn;
    private Button saveBtn;
    private Button cancelBtn;
    private Binder<T> binder;
    private Label errorLabel;
    private boolean newView;
    private Configuration cfg;
    private ViewConfig viewConfig;
    private T bean;


    private static DateFormat dateFormat;

    public QIEntityView(Class<T> clazz, String name) {
        super();
        app = (QI) UI.getCurrent();
        this.clazz = clazz;
        this.title = "<strong>" + app.getMessage(name) + "</strong>";
        generalRoute = "/" + name;
        viewConfig = app.getView(name);
        this.visibleColumns = viewConfig.getVisibleColumns();
        this.visibleFields = viewConfig.getVisibleFields();
        this.readOnlyFields = viewConfig.getReadOnlyFields();
        setSizeFull();
        setMargin(new MarginInfo(false, false, false, false));
        setSpacing(false);
        showRevisionHistoryButton=true;
    }


    @Override
    public void enter (ViewChangeListener.ViewChangeEvent event) {
        helper = createHelper();
        helper.setConfiguration(cfg);
        if (event.getParameters() == null || event.getParameters().isEmpty()) {
            generalView = true;
            showGeneralView();
        } else {
            generalView = false;
            showSpecificView (event.getParameters());
        }
    }

    @Override
    public void attach() {
        super.attach();
    }

    public void showGeneralView () {
        Layout header = createHeader(title);
        addComponent(header);
        grid = createGrid();
        grid.setDataProvider(getHelper().getDataProvider());
        formatGrid();
        addComponent(grid);
        setExpandRatio(grid, 1);
    }

    public void showSpecificView (final String parameter) {
        Object o = null;
        String[] params = parameter.split("/|\\?");
        if (params.length > 0) {
            if ("new".equals(params[0]) && canAdd()) {
                o =  createNewEntity();
                newView = true;
            } else {
                o = getEntityByParam(params[0]);
            }
            if (parameter.contains("?")) {
                //Has query params.
                String[] queryParams= params[params.length-1].split(",");
                for (String queryParam : queryParams) {
                    String[] keyValue = queryParam.split("=");
                    if (keyValue.length > 0  && "back".equals(keyValue[0])) {
                        setGeneralRoute("/"+keyValue[1].replace(".","/"));
                    }
                }
            }
        }
        if (o == null) {
            getApp().getNavigator().navigateTo("");
            getApp().displayNotification(getApp().getMessage(
                    "errorMessage.notExists", "<strong>" + getEntityName().toUpperCase() + "</strong>: " + params[0]));
            return;
        }
        Layout header = createHeader(title + ": " + getHeaderSpecificTitle(o));
        addComponent(header);
        Panel panel = new Panel();
        panel.setSizeFull();
        addComponent(panel);
        final Layout formLayout = createForm(o, params, "new".equals(params[0]));
        panel.setContent(formLayout);
        setExpandRatio(panel, 1);
        if (!"new".equals(params[0]) && isShowRevisionHistoryButton()) {
            final Button showRevision = new Button(getApp().getMessage("showRevisionHistory"));
            showRevision.setStyleName(ValoTheme.BUTTON_LINK);
            showRevision.addClickListener(event -> {
                if (getApp().getMessage("showRevisionHistory").equals(event.getButton().getCaption())) {
                    event.getButton().setCaption(getApp().getMessage("hideRevisionHistory"));
                    loadRevisionHistory(formLayout, getEntityName().toLowerCase() + "." + params[0]);
                } else {
                    event.getButton().setCaption(getApp().getMessage("showRevisionHistory"));
                    formLayout.removeComponent(revisionsPanel);
                }
            });
            formLayout.addComponent(showRevision);
        }
    }

    protected HorizontalLayout createHeader (String title) {
        HorizontalLayout header = new HorizontalLayout();
        header.setWidth("100%");
        header.setSpacing(false);
        header.setMargin(new MarginInfo(false, true, false, true));
        Label lbl = new Label(title);
        lbl.addStyleName("h2");
        lbl.setSizeUndefined();
        lbl.setContentMode(ContentMode.HTML);
        header.addComponent(lbl);
        header.setComponentAlignment(lbl, Alignment.MIDDLE_LEFT);
        if (isGeneralView() && canAdd()) {
            Button addBtn = new Button(getApp().getMessage("add"));
            addBtn.addStyleName("borderless-colored");
            addBtn.setIcon(VaadinIcons.PLUS);
            addBtn.addClickListener(event -> getApp().getNavigator().navigateTo(generalRoute + "/new"));
            header.addComponent(addBtn);
            header.setComponentAlignment(addBtn, Alignment.BOTTOM_RIGHT);
        }
        return header;
    }

    public Grid createGrid() {
        Grid g = new Grid();
        g.setSizeFull();
        g.setSelectionMode(Grid.SelectionMode.SINGLE);
        g.setColumnReorderingAllowed(true);
        g.addItemClickListener(event -> {
            String url = generalRoute + "/" + getHelper().getItemId(event.getItem());
            getApp().getNavigator().navigateTo(url);
        });
        return g;
    }


    public void formatGrid() {
        setGridGetters();

        //Delete not visible columns
        //Use columnId as caption
        //Set sorting for every column.
        DecimalFormat nf = new DecimalFormat();
        nf.setGroupingUsed(false);

        Iterator<Grid.Column> it = grid.getColumns().iterator();
        while (it.hasNext()) {
            Grid.Column c  = it.next();
            String columnId = c.getId();
            if (!Arrays.asList(getVisibleColumns()).contains(columnId)) {
                grid.removeColumn(columnId);
            } else {
                c.setCaption(getCaptionFromId(columnId))
                        .setSortProperty(columnId)
                        .setSortable(true)
                        .setHidable(true);

                ViewConfig.FieldConfig config = viewConfig.getFields().get(c.getId());
                if (config != null) {
                    if (config.getExpandRatio() != -1)
                        c.setExpandRatio(config.getExpandRatio());
                }
                c.setStyleGenerator(obj -> {
                    Object value = c.getValueProvider().apply(obj);
                    if (value instanceof BigDecimal) {
                        return "align-right";
                    } else if (c.getId().equals("id") && !(value instanceof String)) {
                        c.setRenderer(new NumberRenderer(nf));
                    }
                    return null;
                });
                if ("id".equals(c.getId())) {
                    c.setExpandRatio(0);
//                } else if (isBooleanColumn(c)) {
//                    c.setExpandRatio(0);
//                    c.setConverter(new StringToBooleanConverter("✔", "✘"));
                } else {
                    c.setExpandRatio(1);
                }
            }

        }
        //fix for when a manual resize is done, the last column takes the empty space.
        grid.addColumnResizeListener(event -> {
            int lastColumnIndex = grid.getColumns().size()-1;
            ((Grid.Column)grid.getColumns().get(lastColumnIndex)).setWidth(1500);
        });
        grid.setSizeFull();
    }


    public abstract void setGridGetters();

    public Layout createForm (final Object entity, String[] params, boolean isNew) {
        VerticalLayout profileLayout = new VerticalLayout();
        profileLayout.setMargin(true);
        profileLayout.setSpacing(true);

        //Add Back Button
        if (params.length <= 1 || !"profile".equals(params[1])) {
            Button back = new Button(getApp().getMessage("back"));
            back.addStyleName("borderless-colored");
            back.setIcon(VaadinIcons.ARROW_LEFT);
            back.addClickListener(event -> app.getNavigator().navigateTo(getGeneralRoute()));
            profileLayout.addComponent(back);
            profileLayout.setComponentAlignment(back, Alignment.MIDDLE_LEFT);
        }

        binder = new Binder<T>(clazz)
        {
            @Override
            public void setReadOnly (boolean readOnly) {
                super.setReadOnly(readOnly);
                if (readOnlyFields != null) {
                    for (String fieldId : readOnlyFields) {
                        if (binder.getBinding(fieldId).isPresent()) {
                            HasValue field = binder.getBinding(fieldId).get().getField();
                            if (field != null && !field.isEmpty()) {
                                field.setReadOnly(true);
                                binder.bind(field, fieldId);
                            }
                        }

                    }
                }
            }
        };
        bean = (T) entity;
        final Layout formLayout = createLayout();
        getHelper().setOriginalEntity(bean);
        binder.readBean((T)entity);
        binder.setReadOnly(true);
        profileLayout.addComponent(formLayout);

        HorizontalLayout footer = new HorizontalLayout();
        footer.addStyleName("footer");
        footer.setMargin(new MarginInfo(true, false, false, false));
        footer.setSpacing(true);
        formLayout.addComponent(footer);

        //Add Save, Remove & Cancel Buttons
        editBtn = new Button(app.getMessage("edit"));
        removeBtn = new Button(app.getMessage("remove"));
        saveBtn = new Button(app.getMessage("save"));
        cancelBtn = new Button(app.getMessage("cancel"));

        editBtn.addClickListener(event -> editClick(event, formLayout));
        editBtn.addStyleName("icon-edit");

        saveBtn.addClickListener(event -> saveClick(event, formLayout));
        saveBtn.setVisible(false);
        saveBtn.setStyleName("icon-ok");
        saveBtn.setClickShortcut(ShortcutAction.KeyCode.ENTER);

        removeBtn.addClickListener(event -> app.addWindow(new ConfirmDialog(
                        app.getMessage("confirmTitle"),
                        app.getMessage("removeConfirmationMessage"),
                        confirm -> {
                            if (confirm) {
                                removeEntity();
                            }
                        }
        )
        ));
        removeBtn.addStyleName("icon-trash");

        cancelBtn.addClickListener(event -> {
            if (isNew) {
                app.getNavigator().navigateTo(getGeneralRoute());
            } else {
                cancelClick(event, formLayout);
            }
        });

        cancelBtn.setClickShortcut(ShortcutAction.KeyCode.ESCAPE);
        cancelBtn.setVisible(false);
        cancelBtn.addStyleName("icon-cancel");

        if (canEdit()) {
            footer.addComponent(editBtn);
            footer.addComponent(saveBtn);
            footer.addComponent(cancelBtn);
            footer.setComponentAlignment(editBtn, Alignment.MIDDLE_RIGHT);
            footer.setComponentAlignment(saveBtn, Alignment.MIDDLE_RIGHT);
            footer.setComponentAlignment(cancelBtn, Alignment.MIDDLE_RIGHT);
        }
        if (canRemove()) {
            footer.addComponent(removeBtn);
            footer.setComponentAlignment(removeBtn, Alignment.MIDDLE_RIGHT);
        }
        if (isNew) {
            editBtn.click();
        }
        errorLabel = new Label();
        errorLabel.setVisible(false);
        errorLabel.setStyleName(ValoTheme.LABEL_FAILURE);
        profileLayout.addComponent(errorLabel);
        return profileLayout;
    }
    protected void cancelClick(Button.ClickEvent event, Layout formLayout) {
        binder.readBean(bean); //this discards the changes
        binder.setReadOnly(true);
        event.getButton().setVisible(false);
        saveBtn.setVisible(false);
        editBtn.setVisible(true);
        removeBtn.setVisible(true);
        errorLabel.setVisible(false);
        errorLabel.setValue(null);
        formLayout.addStyleName(ValoTheme.FORMLAYOUT_LIGHT);
    }

    protected boolean saveClick(Button.ClickEvent event, Layout formLayout) {
        if (binder.validate().isOk()) {
            if (getEntity(bean) == null) {
                try {
                    saveEntity();
                } catch (BLException e) {
                    e.printStackTrace();
                    getApp().displayNotification(e.getDetailedMessage());
                    return false;
                }
            } else {
                try {
                    updateEntity();
                } catch (BLException e) {
                    e.printStackTrace();
                    getApp().displayNotification(e.getDetailedMessage());
                    return false;
                }
            }
            binder.setReadOnly(true);
            formLayout.addStyleName(ValoTheme.FORMLAYOUT_LIGHT);
            event.getButton().setVisible(false);
            cancelBtn.setVisible(false);
            editBtn.setVisible(true);
            removeBtn.setVisible(true);
            errorLabel.setValue(null);
            errorLabel.setVisible(false);
            if (revisionsPanel != null && revisionsPanel.getParent() != null) {
                Layout parent = (Layout) revisionsPanel.getParent();
                parent.removeComponent(revisionsPanel);
                loadRevisionHistory(parent, revisionsPanel.getRef());
            }
            return true;
        } else {
            BindingValidationStatus<?> result = binder.validate().getFieldValidationErrors().get(0);
            getApp().displayNotification(result.getResult().get().getErrorMessage());
            return false;
        }
    }

    protected void editClick(Button.ClickEvent event, Layout formLayout) {
        binder.setReadOnly(false);
        event.getButton().setVisible(false);
        removeBtn.setVisible(false);
        saveBtn.setVisible(true);
        cancelBtn.setVisible(true);
        formLayout.removeStyleName(ValoTheme.FORMLAYOUT_LIGHT);
    }

    protected Layout createLayout() {
        FormLayout layout = new FormLayout();
        layout.addStyleName(ValoTheme.FORMLAYOUT_LIGHT);
        layout.addStyleName("qi-form");
        layout.setMargin(new MarginInfo(false));
        addFields(layout);
        return layout;
    }

    protected void addFields(Layout l) {
        Object o = bean;
        for (String id : getVisibleFields()) {
            //Check if there's a custom builder
            Component field = buildAndBindCustomComponent(id);
            if (field == null) {
                //if it wasn't built yet, build it now.
                try {
                    Class dataType = o.getClass().getDeclaredField(id).getType();
                    if (dataType.equals(Date.class)) {
                        l.addComponent(buildAndBindDateField(id));
                    } else if (dataType.equals(BigDecimal.class)) {
                        l.addComponent(buildAndBindBigDecimalField(id));
                    } else if (dataType.equals(Long.class)) {
                        l.addComponent(buildAndBindLongField(id));
                    } else if (dataType.equals(boolean.class)) {
                        l.addComponent(buildAndBindBooleanField(id));
                    } else {
                        l.addComponent(buildAndBindTextField(id));
                    }
                } catch (NoSuchFieldException e) {
                    getApp().getLog().error(e);
                }
            } else {
                l.addComponent(field);
            }
        }
    }

    //Override on specific views to create a custom field for a certain property, or to add validators.
    // Do not forget to getValidators and add them.
    protected Component buildAndBindCustomComponent(String propertyId) {
        return null;
    }

    //Reads regex and length from 00_qi.xml
    //Override to add more customValidators
    protected List<Validator> getValidators(String propertyId) {
        List<Validator> validators = new ArrayList<>();
        ViewConfig.FieldConfig config = viewConfig.getFields().get(propertyId);
        if (config != null) {
            String regex = config.getRegex();
            int length = config.getLength();
            String[] options = config.getOptions();
            if (options != null) {
                //Change the field to a Combo loaded with the options
                ComboBox combo = new ComboBox(getCaptionFromId(propertyId),Arrays.asList(options));
                getBinder().bind(combo,propertyId);
                return null;
            }
            if (regex != null) {
                validators.add(new RegexpValidator(getApp().getMessage("errorMessage.invalidField", propertyId),regex));
            }
            if (length > 0) {
                validators.add(new StringLengthValidator(getApp().getMessage("errorMessage.invalidField", propertyId),0,length));
            }
        }
        return validators;
    }

    protected boolean isRequired(String propertyId) {
        return viewConfig.getFields().get(propertyId).isRequired();
    }

    protected TextField buildAndBindLongField(String id) {
        TextField field = new TextField(getCaptionFromId(id));
        Binder.BindingBuilder builder = formatField(id,field);
        builder.withConverter(new StringToLongConverter(getApp().getMessage("errorMessage.NaN",id)));
        builder.bind(id);
        return field;
    }

    protected CheckBox buildAndBindBooleanField(String id) {
        CheckBox box = new CheckBox(StringUtils.capitalize(getCaptionFromId(id)),false);
        Binder.BindingBuilder builder = formatField(id,box);
        builder.bind(id);
        return box;
    }

    protected TextField buildAndBindTextField(String id) {
        TextField field = new TextField(getCaptionFromId(id));
        Binder.BindingBuilder builder = formatField(id,field);
        builder.bind(id);
        return field;
    }

    protected DateField buildAndBindDateField(String id) {
        DateField field = new DateField(getCaptionFromId(id));
        Binder.BindingBuilder builder = formatField(id, field);
        builder.bind(id);
        return field;
    }

    protected TextField buildAndBindBigDecimalField(String id) {
        TextField field = new TextField(getCaptionFromId(id));
        Binder.BindingBuilder builder = formatField(id,field);
        builder.withConverter(new StringToBigDecimalConverter(getApp().getMessage("errorMessage.NaN",id)));
        builder.bind(id);
        return field;
    }

    protected Binder.BindingBuilder formatField(String id, HasValue field) {
        List<Validator> v = getValidators(id);
        Binder.BindingBuilder builder = getBinder().forField(field);
        for (Validator val : v) {
            builder.withValidator(val);
        }
        if (isRequired(id)) {
            builder.asRequired(getApp().getMessage("errorMessage.req",StringUtils.capitalize(getCaptionFromId(id))));
        }
        return builder;
    }

    protected String getCaptionFromId(String id) {
        return StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(id),' ');
    }

    private void loadRevisionHistory (Layout formLayout, String ref) {
        DB db = new DB();
        db.open();
        revisionsPanel = new RevisionsPanel(ref, db);
        formLayout.addComponent(revisionsPanel);
        db.close();
    }

    private DateFormat getDateFormat () {
        if (dateFormat == null) {
            String pattern = getApp().getMessage("datetime");
            dateFormat = new SimpleDateFormat(pattern);
        }
        return dateFormat;
    }

    public Renderer createAmountRenderer () {
        NumberFormat amountFormat = NumberFormat.getInstance();
        amountFormat.setGroupingUsed(true);
        amountFormat.setMinimumFractionDigits(2);
        return new NumberRenderer(amountFormat);
    }

    public Renderer createTimestampRenderer () {
        DateFormat dateFormat     = new SimpleDateFormat(getApp().getMessage("timestampformat"));
        return new DateRenderer(dateFormat);
    }

    public Object createNewEntity (){
        return getHelper().createNewEntity();
    }
    public abstract QIHelper createHelper ();

    public void removeEntity () throws BLException {
        if (getHelper().removeEntity()) {
            getApp().getNavigator().navigateTo(getGeneralRoute());
            getApp().displayNotification(getApp().getMessage("removed", getEntityName().toUpperCase()));
        }
    }

    public void saveEntity () throws BLException {
        if (getHelper().saveEntity(getBinder())) {
            app.displayNotification(app.getMessage("created", getEntityName().toUpperCase()));
            app.getNavigator().navigateTo(getGeneralRoute());
        }
    }

    public Object getEntityByParam (String param)  {
        return getHelper().getEntityByParam(param);
    }

    public final String getEntityName () {
        return getHelper().getEntityName();
    }

    public void updateEntity () throws BLException {
        if (getHelper().updateEntity(getBinder()))
            getApp().displayNotification(getApp().getMessage("updated", getEntityName().toUpperCase()));
        else
            getApp().displayNotification(getApp().getMessage("notchanged"));
    }

    public abstract Object getEntity (Object entity);
    public abstract String getHeaderSpecificTitle (Object entity);

    public boolean canEdit() {
        return false;
    }

    public boolean canAdd() {
        return false;
    }

    public boolean canRemove() {
        return false;
    }

    public QI getApp() {
        return app;
    }

    public void setApp(QI app) {
        this.app = app;
    }

    public String getGeneralRoute() {
        return generalRoute;
    }

    public void setGeneralRoute(String generalRoute) {
        this.generalRoute = generalRoute;
    }

    public boolean isGeneralView() {
        return generalView;
    }

    public void setGeneralView(boolean generalView) {
        this.generalView = generalView;
    }

    public String getTitle () {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public String[] getVisibleColumns() {
        return visibleColumns;
    }

    public void setVisibleColumns(String[] visibleColumns) {
        this.visibleColumns = visibleColumns;
    }

    public String[] getVisibleFields() {
        return visibleFields;
    }

    public void setVisibleFields(String[] visibleFields) {
        this.visibleFields = visibleFields;
    }

    public String[] getReadOnlyFields() {
        return readOnlyFields;
    }

    public void setReadOnlyFields(String[] readOnlyFields) {
        this.readOnlyFields = readOnlyFields;
    }

    public QIHelper getHelper() {
        return helper;
    }

    public void setHelper(QIHelper helper) {
        this.helper = helper;
    }

    public Label getErrorLabel() {
        return errorLabel;
    }

    public void setErrorLabel(Label errorLabel) {
        this.errorLabel = errorLabel;
    }

    public boolean isShowRevisionHistoryButton() {
        return showRevisionHistoryButton;
    }

    public void setShowRevisionHistoryButton(boolean showRevisionHistoryButton) {
        this.showRevisionHistoryButton = showRevisionHistoryButton;
    }

    public Button getEditBtn() {
        return editBtn;
    }

    public void setEditBtn(Button editBtn) {
        this.editBtn = editBtn;
    }

    public Button getRemoveBtn() {
        return removeBtn;
    }

    public void setRemoveBtn(Button removeBtn) {
        this.removeBtn = removeBtn;
    }

    public Button getSaveBtn() {
        return saveBtn;
    }

    public void setSaveBtn(Button saveBtn) {
        this.saveBtn = saveBtn;
    }

    public Button getCancelBtn() {
        return cancelBtn;
    }

    public void setCancelBtn(Button cancelBtn) {
        this.cancelBtn = cancelBtn;
    }


    public T getInstance() {
        return bean;
    }

    public Binder<T> getBinder() {
        return this.binder;
    }

    public boolean isNewView() {
        return newView;
    }

    public void setNewView(boolean newView) {
        this.newView = newView;
    }

    public void setConfiguration (Configuration cfg) {
        this.cfg = cfg;
    }

    public Configuration getConfiguration() {
        return cfg;
    }

    public ViewConfig getViewConfig() {
        return viewConfig;
    }

    public void setViewConfig(ViewConfig viewConfig) {
        this.viewConfig = viewConfig;
    }

    public T getBean() {
        return bean;
    }

    public void setBean(T bean) {
        this.bean = bean;
    }
}
