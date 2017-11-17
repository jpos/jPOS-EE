package org.jpos.qi.minigl;

import com.vaadin.data.ValidationResult;
import com.vaadin.data.Validator;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.*;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.components.grid.FooterCell;
import com.vaadin.ui.components.grid.FooterRow;
import com.vaadin.ui.components.grid.HeaderCell;
import com.vaadin.ui.components.grid.HeaderRow;
import com.vaadin.ui.renderers.DateRenderer;
import com.vaadin.ui.themes.ValoTheme;
import org.jpos.ee.DB;
import org.jpos.gl.*;
import org.jpos.qi.components.DateRange;
import org.jpos.qi.components.DateRangeComponent;
import org.jpos.qi.QIEntityView;
import org.jpos.qi.QIHelper;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.jpos.util.QIUtils.createAmountRenderer;
import static org.jpos.util.QIUtils.getCaptionFromId;

public class AccountsView extends QIEntityView<Account> {

    private ComboBox<Journal> journals;
    private Object lastSelectedJournal;
    private DateRangeComponent dateRangeComponent;
    private CheckBoxGroup<Layer> layersCheckBox;
    private EntryGrid entryGrid;
    private Label rangeLabelTitle;
    private Account account;
    private List<Account> expandedItems;

    public AccountsView() {
        super(Account.class, "accounts");
        expandedItems = new ArrayList<>();
    }

    @Override
    public void showSpecificView (String parameter) {
        String[] params = parameter.split("/");
        if (params.length > 0 && "expand".equals(params[0])) {
            setGeneralView(true);
            showGeneralView();
            Account a = (Account) getEntityByParam(params[1]);
            expand(a);
        } else {
            super.showSpecificView(parameter);
        }
    }

    @Override
    public Grid createGrid() {
        TreeGrid<Account> tree = new TreeGrid();
        tree.setSizeFull();
        tree.setSelectionMode(Grid.SelectionMode.SINGLE);
        tree.addItemClickListener(event -> {
            //do nothing if it's root
            if (event.getItem().getRoot().getId() != event.getItem().getId()) {
                String url = getGeneralRoute() + "/" + getHelper().getItemId(event.getItem());
                getApp().getNavigator().navigateTo(url);
            }
        });
        tree.setItemCollapseAllowedProvider(account -> account.getParent() != null);
        tree.addExpandListener(listener -> {
            if (listener.getExpandedItem().getParent() != null)
                expandedItems.add(listener.getExpandedItem());
        });
        tree.addCollapseListener(listener -> expandedItems.remove(listener.getCollapsedItem()));
        return tree;
    }

    public void formatGrid() {
        setGridGetters();

        TreeGrid<Account> grid = (TreeGrid) getGrid();

        //Delete not visible columns
        //Use columnId as caption
        //Set sorting for every column.
        DecimalFormat nf = new DecimalFormat();
        nf.setGroupingUsed(false);

        grid.setStyleGenerator(styleGen -> {
          if (styleGen.isDebit()) {
              return "debit-color";
          } else {
              return "credit-color";
          }
        });

        Iterator<Grid.Column<Account, ?>> it = grid.getColumns().iterator();
        while (it.hasNext()) {
            Grid.Column c  = it.next();
            String columnId = c.getId();
            if (!Arrays.asList(getVisibleColumns()).contains(columnId)) {
                grid.removeColumn(columnId);
            } else {
                c.setCaption(getCaptionFromId(columnId))
                        .setSortProperty(columnId)
                        .setSortable(false)
                        .setHidable(false);
                c.setStyleGenerator(obj -> {
                    Object value = c.getValueProvider().apply(obj);
                    if (value instanceof BigDecimal) {
                        return "align-right";
                    }
                    return null;
                });
            }

        }
        //fix for when a manual resize is done, the last column takes the empty space.
        grid.addColumnResizeListener(event -> {
            int lastColumnIndex = grid.getColumns().size()-1;
            ((Grid.Column)grid.getColumns().get(lastColumnIndex)).setWidth(1500);
        });
        //expand root account
        Account a = (Account) getEntityByParam("5");
        grid.expand(a);
    }

    @Override
    protected HorizontalLayout createHeader(String title) {
        HorizontalLayout header = super.createHeader(title);
        if (isGeneralView()) {
            Label refDebit = new Label(FontAwesome.SQUARE.getHtml() + " DEBIT accounts");
            Label refCredit = new Label(FontAwesome.SQUARE.getHtml() + " CREDIT accounts");
            refDebit.setContentMode(ContentMode.HTML);
            refCredit.setContentMode(ContentMode.HTML);
            refDebit.setStyleName("debit-color");
            refCredit.setStyleName("credit-color");
            refDebit.addStyleName(ValoTheme.LABEL_SMALL);
            refCredit.addStyleName(ValoTheme.LABEL_SMALL);
            Button collapse = new Button(getApp().getMessage("collapseAll"), event -> {
                ((TreeGrid) getGrid()).collapse(expandedItems.toArray());

            });
            collapse.setStyleName(ValoTheme.BUTTON_LINK);
            collapse.addStyleName(ValoTheme.BUTTON_SMALL);
            HorizontalLayout l = new HorizontalLayout(refDebit, refCredit, collapse);
            l.setSpacing(true);
            l.setComponentAlignment(refDebit, Alignment.BOTTOM_CENTER);
            l.setComponentAlignment(refCredit, Alignment.BOTTOM_CENTER);
            l.setComponentAlignment(collapse, Alignment.BOTTOM_CENTER);
            header.addComponent(l);
            header.setComponentAlignment(l, Alignment.MIDDLE_RIGHT);
        }
        return header;
    }

    @Override
    public void setGridGetters() {
        TreeGrid<Account> grid = (TreeGrid<Account>) getGrid();
        grid.addColumn(account -> account.getCode() + ": " + account.getDescription()).setId("id");
        grid.addColumn(Account::getCode).setId("code");
        grid.addColumn(Account::getDescription).setId("description");
        grid.addColumn(Account::getCurrencyCode).setId("currencyCode");
        grid.addColumn(Account::getCreated).setId("created");
        grid.addColumn(Account::getExpiration).setId("expiration");
        grid.addColumn(account -> account.getTags() != null ? account.getTags().toString() : "").setId("tags");
        grid.addColumn(account -> account.getParent() != null ? account.getParent().getCode() : "").setId("parent");
    }

    @Override
    protected Component buildAndBindCustomComponent(String propertyId) {
        if ("created".equalsIgnoreCase(propertyId)){
            return buildAndBindDateField(propertyId);
        }
        if ("expiration".equalsIgnoreCase(propertyId)){
            return buildAndBindDateField(propertyId);
        }
        if ("parent".equalsIgnoreCase(propertyId)) {
            ComboBox<Account> parentCombo = new ComboBox<>(getCaptionFromId(propertyId));
            parentCombo.setDataProvider(((AccountsHelper)getHelper()).getParentDataProvider());
            parentCombo.setItemCaptionGenerator(parent -> parent.getCode() + " - " + parent.getDescription());
            formatField(propertyId,parentCombo).bind(propertyId);
            return parentCombo;
        }
        if ("type".equalsIgnoreCase(propertyId)) {
            ComboBox<Integer> typeCombo = new ComboBox<>(getCaptionFromId(propertyId));
            typeCombo.setItems(Account.CHART,Account.DEBIT,Account.CREDIT);
            typeCombo.setItemCaptionGenerator(type -> getApp().getMessage("account." + type).toUpperCase());
            formatField(propertyId,typeCombo)
                    .bind(propertyId);
            return typeCombo;
        }
        if ("entries".equalsIgnoreCase(propertyId)) {
            //todo: should bind?
            return createEntriesPanel();
        }
        return null;
    }

    @Override
    protected List<Validator> getValidators(String propertyId) {
        List<Validator> validators = super.getValidators(propertyId);
        if ("currencyCode".equalsIgnoreCase(propertyId)) {
            Validator<String> currencyCodeValidator = (Validator<String>) (value, context) -> {
                Account parentAccount = getInstance().getParent();
                if (parentAccount != null && parentAccount.getCurrencyCode() != null && !parentAccount.getCurrencyCode().equals(value)) {
                    return ValidationResult.error(getApp().getMessage("errorMessage.currencyCodeMismatch"));
                }
                return ValidationResult.ok();
            };
            validators.add(currencyCodeValidator);
        }
        return validators;
    }

    public void formatEntriesGrid () {
        String pattern = getApp().getMessage("datetime");
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        entryGrid.getColumn("account").setHidden(true);
        entryGrid.addColumn(glEntry -> glEntry.getTransaction().getTimestamp())
                .setId("timestamp")
                .setRenderer(new DateRenderer(dateFormat))
                .setCaption(getCaptionFromId("timestamp"))
                .setSortable(true)
                .setHidable(false);
        entryGrid.addColumn(GLEntry::getBalance)
                .setId("balance")
                .setRenderer(createAmountRenderer())
                .setStyleGenerator(cellStyle -> "align-right")
                .setCaption(getCaptionFromId("balance"))
                .setSortable(true)
                .setHidable(false);
        entryGrid.sort("timestamp");
        entryGrid.setColumnOrder("timestamp","detail","tags","layer","debit","credit","balance");
        entryGrid.setHeightByRows(10);

        //HEADER
        entryGrid.getDefaultHeaderRow().getCell("balance").setStyleName("align-right");
        HeaderRow initialBalanceHeader = entryGrid.appendHeaderRow();
        HeaderCell label = initialBalanceHeader.join("timestamp","detail","tags","layer","credit","debit");
        label.setText("Initial Balance");
        HeaderCell value = initialBalanceHeader.getCell("balance");
        value.setStyleName("amount-header");

        //FOOTER
        FooterRow footer = entryGrid.appendFooterRow();
        FooterCell totalCell = footer.join("timestamp","detail","tags","layer");
        totalCell.setHtml("<strong>TOTAL</strong>");
        FooterCell debitTotal = footer.getCell("debit");
        debitTotal.setStyleName("align-right");
        FooterCell creditTotal = footer.getCell("credit");
        creditTotal.setStyleName("align-right");
        FooterCell balanceTotal = footer.getCell("balance");
        balanceTotal.setStyleName("align-right");
    }

    private void updateHeaderAndFooter(AccountDetail detail) {
        entryGrid.getHeaderRow(1).getCell("balance").setText(detail.getInitialBalance().toString());
        entryGrid.getFooterRow(0).getCell("credit").setText(detail.getCredits().toString());
        entryGrid.getFooterRow(0).getCell("debit").setText(detail.getDebits().toString());
        entryGrid.getFooterRow(0).getCell("balance").setText(detail.getFinalBalance().toString());
    }

    @Override
    public QIHelper createHelper() {
        return new AccountsHelper();
    }

    @Override
    public Object getEntity(Object entity) {
        if (! (entity instanceof Account) ) return null;
        Account account = (Account)entity;
        AccountsHelper helper = (AccountsHelper) getHelper();
        return helper.getEntityByParam(String.valueOf(account.getId()));
    }

    @Override
    public String getHeaderSpecificTitle(Object entity) {
        if (!(entity instanceof Account)) return "";
        Account account = (Account) entity;
        if (account.getId() == 0) return getApp().getMessage("new");
        return account.getId() + " - " + account.getCode();
    }


    private void refreshDetails() {
        try {
            if (lastSelectedJournal != journals.getValue()){
                lastSelectedJournal = journals.getValue();
                updateLayers(journals.getValue());
            }
            DB.exec(db -> {
                GLSession session = new GLSession(db, "admin");
                DateRange range = dateRangeComponent.getValue();
                db.session().refresh(getInstance());
                short[] s = convertLayersToShortArray(layersCheckBox.getSelectedItems());
                AccountDetail detail = session.getAccountDetail(journals.getValue(), account, range.getStart(), range.getEnd(), s);
                rangeLabelTitle.setValue("Showing entries from: " + getApp().getMessage(dateRangeComponent.getValue().toString()));
                updateHeaderAndFooter(detail);
                this.entryGrid.setItems(detail.getEntries());
                return null;
            });
        } catch (Exception e) {
            getApp().getLog().error(e);
            getApp().displayNotification(getApp().getMessage("errorMessage.unexpected"));
        }
    }

    private ComboBox createJournalsCombo() {
        ComboBox<Journal> box = new ComboBox(getApp().getMessage("journal").toUpperCase());
        box.setItemCaptionGenerator(j -> j.getName());
        List<Journal> journals = ((AccountsHelper)getHelper()).getJournals();
        box.setItems(journals);
        box.setStyleName(ValoTheme.COMBOBOX_SMALL);
        box.setSelectedItem(journals.get(0));
        box.setEmptySelectionAllowed(false);
        return box;
    }

    private short[] convertLayersToShortArray(Set<Layer> layers) {
        short[] shorts = new short[layers.size()];
        int index = 0;
        for (Layer l : layers) {
            shorts[index] = l.getId();
            index++;
        }
        return shorts;
    }

    private Panel createEntriesPanel() {
        Panel entriesPanel = new Panel(getCaptionFromId("entries"));
        entriesPanel.setIcon(VaadinIcons.EXCHANGE);
        entriesPanel.addStyleName("color1");
        entriesPanel.addStyleName("margin-top-panel");

        VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        layout.setSpacing(true);
        Panel filterPanel = new Panel();
        filterPanel.addStyleName("v-panel-well");

        journals = createJournalsCombo();

        rangeLabelTitle = new Label();
        rangeLabelTitle.addStyleName(ValoTheme.LABEL_BOLD);
        dateRangeComponent = new DateRangeComponent(DateRange.ALL_TIME, true) {
            @Override
            protected Button.ClickListener createRefreshListener() {
                return event -> {
                    refreshDetails();
                };
            }
        };
        VerticalLayout detailsLayout = new VerticalLayout();

        entryGrid = new EntryGrid(null,false);
        formatEntriesGrid();
        detailsLayout.addComponent(entryGrid);
        detailsLayout.setMargin(false);

        HorizontalLayout layersLayout = new HorizontalLayout();
        layersLayout.setSizeFull();
        layersLayout.setSpacing(true);

        layersCheckBox = new CheckBoxGroup<>(getCaptionFromId("layers").toUpperCase());
        layersCheckBox.setItemCaptionGenerator(item -> item.getId() + " - " + item.getName());
        layersCheckBox.addValueChangeListener(listener -> refreshDetails());

        layersLayout.addComponentsAndExpand(layersCheckBox);
        VerticalLayout vbar = new VerticalLayout(journals,dateRangeComponent,layersLayout);
        vbar.setSpacing(true);
        vbar.setMargin(true);
        filterPanel.setContent(vbar);
        layout.addComponents(rangeLabelTitle,detailsLayout,filterPanel);
        entriesPanel.setContent(layout);
        refreshDetails();
        return entriesPanel;

    }

    private void updateLayers(Journal j) {
        List<Layer> items = ((AccountsHelper)getHelper()).getLayers(j);
        if (items != null) {
            Collections.sort(items);
            layersCheckBox.setItems(items);
            //select all items
            layersCheckBox.select(items.toArray(new Layer[items.size()]));
        }
    }

    private void expand(Account a) {
        TreeGrid tree = (TreeGrid) getGrid();
        if (a.getParent() != null) {
            expand(a.getParent());
        }
        tree.expand(a);
    }

    @Override
    public Layout createForm (final Object entity, String[] params, boolean isNew) {
        account = (Account) entity;
        return super.createForm(entity, params, isNew);
    }

    @Override
    public String getGeneralRoute () {
        return "/accounts".equals(super.getGeneralRoute()) && !isGeneralView() && account != null ?
                    super.getGeneralRoute() + "/expand/" + account.getId() : super.getGeneralRoute();
    }

    @Override
    public boolean canEdit() {
        return true;
    }
}
