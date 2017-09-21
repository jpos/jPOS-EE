package org.jpos.qi.minigl;

import com.vaadin.data.Binder;
import com.vaadin.data.provider.ConfigurableFilterDataProvider;
import com.vaadin.data.provider.GridSortOrder;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.jpos.ee.BLException;
import org.jpos.gl.*;
import org.jpos.qi.*;
import org.jpos.qi.components.DateRange;
import org.jpos.qi.components.DateRangeComponent;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import static org.jpos.util.QIUtils.getCaptionFromId;

public class TransactionsView extends QIEntityView<GLTransaction> {
    private static final String VIEW_NAME = "transactions";
    /**
     * combo to select the journal
     */
    ComboBox<Journal> journals;
    /**
     * field to select transactions in a certain date range
     */
    DateRangeComponent dateRangeComponent = new DateRangeComponent(DateRange.ALL_TIME, true) {
        @Override
        protected Button.ClickListener createRefreshListener() {
            return event -> refreshGrid();
        }
    };

    private SimpleDateFormat postDateFormat = new SimpleDateFormat(getApp().getMessage("dateformat"));
    private EntryGrid entryGrid;
    private NewEntryForm newEntryForm;
    private boolean editMode;
    private boolean shouldReverse;
    private List<Object> addedEntriesIds;

    public TransactionsView() {
        super(GLTransaction.class, VIEW_NAME);
        addedEntriesIds = new ArrayList<>();
    }

    @Override
    public void showGeneralView() {
        super.showGeneralView();
        editMode = false;
        shouldReverse = false;
        getGrid().setSortOrder(GridSortOrder.asc(getGrid().getColumn("id")));
    }

    @Override
    protected HorizontalLayout createHeader (String title) {
        HorizontalLayout header;
        if (isGeneralView()) {
            VerticalLayout main = new VerticalLayout();
            main.setMargin(false);
            HorizontalLayout hl = super.createHeader(title);
            main.addComponent(hl);
            main.addComponent(createFilters());
            header = new HorizontalLayout(main);
        } else {
            header = super.createHeader(title);
        }
        header.setWidth("100%");
        return header;
    }

    @Override
    public void setGridGetters() {
        Grid<GLTransaction> grid = getGrid();
        grid.addColumn(GLTransaction::getId).setId("id");
        grid.addColumn(GLTransaction::getDetail).setId("detail");
        grid.addColumn(glTransaction -> glTransaction.getJournal().getName()).setId("journal");
        grid.addColumn(glTransaction -> postDateFormat.format(glTransaction.getPostDate())).setId("postDate");
        grid.addColumn(glTransaction -> glTransaction.getTags() != null ? glTransaction.getTags().toString() : "").setId("tags");
        grid.addColumn(GLTransaction::getTimestamp).setId("timestamp");
    }

    private HorizontalLayout createFilters() {
        HorizontalLayout controls = new HorizontalLayout();
        controls.setWidth("100%");
        journals = createJournalsCombo();
        controls.addComponents(journals, dateRangeComponent);
        controls.setComponentAlignment(dateRangeComponent, Alignment.MIDDLE_LEFT);
        controls.setComponentAlignment(journals, Alignment.MIDDLE_RIGHT);
        controls.setExpandRatio(journals, 0f);
        controls.setExpandRatio(dateRangeComponent, 1f);
        controls.setMargin(new MarginInfo(false,true,true,true));
        controls.setSpacing(true);
        return controls;
    }

    protected Component buildAndBindCustomComponent(String propertyId) {
        switch (propertyId) {
            case ("tags"): {
                TextField field = new TextField(getCaptionFromId(propertyId));
                Binder.BindingBuilder<GLTransaction, String> builder = formatField(propertyId, field);
                builder.withNullRepresentation("").withConverter(new StringToTagConverter()).bind(propertyId);
                return field;
            }
            case ("postDate"): {
                return buildAndBindDateField(propertyId);
            }
            case ("journal"): {
                ComboBox<Journal> field = createJournalsCombo();
                field.setCaption(getCaptionFromId(propertyId));
                formatField(propertyId, field).bind(propertyId);
                return field;
            }
            case ("entries"): {
                Panel entriesPanel = new Panel(getCaptionFromId(propertyId));
                entriesPanel.setIcon(VaadinIcons.EXCHANGE);
                entriesPanel.addStyleName("color1");
                entriesPanel.addStyleName("margin-top-panel");

                VerticalLayout vl = new VerticalLayout();
                entryGrid = new EntryGrid(null, canEdit());
                getBinder().forField(entryGrid)
                        .bind(glTransaction -> this.getInstance(), null);
                if (getInstance() != null && getInstance().getJournal() != null) {
                    newEntryForm = new NewEntryForm(getInstance(), (TransactionsHelper) getHelper(), entryGrid);
                    vl.addComponents(entryGrid, newEntryForm);
                }
                entriesPanel.setContent(vl);
                return entriesPanel;
            }
        }
        return null;
    }

    /**
     * Create and fill journals combo
     * @return the combo
     */
    private ComboBox createJournalsCombo() {
        ComboBox<Journal> box = new ComboBox(getApp().getMessage("journal").toUpperCase());
        box.setItemCaptionGenerator(Journal::getName);
        List<Journal> journals = ((TransactionsHelper)getHelper()).getJournals();
        ((TransactionsHelper)getHelper()).setDefaultJournalId(journals.get(0).getId());
        box.setItems(journals);
        box.setStyleName(ValoTheme.COMBOBOX_SMALL);
        box.setSelectedItem(journals.get(0));
        box.setEmptySelectionAllowed(false);
        return box;
    }

    /**
     * Refreshes the grid when a search parameter changes
     */
    private void refreshGrid() {
        DateRange range = dateRangeComponent.getValue();
        Journal selectedJournal = journals.getValue();
        ((TransactionsHelper) getHelper()).setDefaultJournalId(selectedJournal.getId());
        ConfigurableFilterDataProvider wrapper = (ConfigurableFilterDataProvider) getGrid().getDataProvider();
        wrapper.setFilter(range);
        wrapper.refreshAll();
    }

    @Override
    public QIHelper createHelper() {
        return new TransactionsHelper();
    }

    @Override
    public void updateEntity () throws BLException {
        shouldReverse = shouldReverse || newEntryForm.isShouldReverse(); // TODO : Check another way to check if should reverse.
        TransactionsHelper helper = (TransactionsHelper) getHelper();
        if (helper.updateEntity(getBinder(), entryGrid, shouldReverse))
            getApp().displayNotification(getApp().getMessage("updated", getEntityName().toUpperCase()));
        else
            getApp().displayNotification(getApp().getMessage("notchanged"));
    }

    @Override
    public Object getEntity(Object entity) {
        if(entity instanceof GLTransaction) {
            GLTransaction transaction = (GLTransaction) entity;
            return getHelper().getEntityByParam(String.valueOf(transaction.getId()));
        }
        return null;
    }

    @Override
    public String getHeaderSpecificTitle(Object entity) {
        GLTransaction transaction = (GLTransaction)entity;
        return transaction.getId() != 0 ? String.valueOf(transaction.getId()) : "New";
    }

    @Override
    public boolean isShowRevisionHistoryButton() {
        return true;
    }

    @Override
    public boolean canEdit() {
        return true;
    }

    @Override
    public boolean canAdd() { return true; }

    @Override
    public boolean canRemove() {
        return false;
    }

    @Override
    public void saveEntity() throws BLException {
        if (((TransactionsHelper)getHelper()).saveEntity(getBinder(), entryGrid)) {
            getApp().displayNotification(getApp().getMessage("created", getEntityName().toUpperCase()));
            getApp().getNavigator().navigateTo(getGeneralRoute());
        }
    }

    @Override
    protected void editClick(Button.ClickEvent event, Layout formLayout) {
        super.editClick(event,formLayout);
        setReadOnly(false);
    }

    @Override
    protected boolean saveClick(Button.ClickEvent event, Layout formLayout) {
        try {
            entryGrid.validate();
        } catch (BLException e) {
            getApp().displayNotification(e.getDetailedMessage());
            return false;
        }
        if (newEntryForm.isShouldReverse()) {
            getApp().addWindow(new ConfirmDialog(
                    getApp().getMessage("confirmTitle"),
                    getApp().getMessage("reverseAndPostConfirmation"),
                    confirm -> {
                        if (confirm && super.saveClick(event, formLayout)) {
                            setReadOnly(true);
                        }
                    }));
            return true;
        } else {
            if(super.saveClick(event, formLayout)) {
                setReadOnly(true);
                return true;
            }
            return false;
        }
    }

    @Override
    protected void cancelClick(Button.ClickEvent event, Layout formLayout) {
        super.cancelClick(event, formLayout);
        entryGrid.setValue(getInstance());
        try {
            newEntryForm.setTransaction(getInstance().clone());
        } catch (CloneNotSupportedException e) {
            // Log error and ignore. Clone should be supported for a GLTransaction.
            QI.getQI().getLog().error(e);
        }
        setReadOnly(true);
    }

    public void setReadOnly (boolean readOnly) {
        newEntryForm.setReadOnly(readOnly);
        entryGrid.setReadOnly(readOnly);
        if (readOnly) {
            shouldReverse=false;
        }
    }
}
