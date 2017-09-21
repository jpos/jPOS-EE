package org.jpos.qi.minigl;

import com.vaadin.data.Binder;
import com.vaadin.data.BindingValidationStatus;
import com.vaadin.data.ValidationResult;
import com.vaadin.data.Validator;
import com.vaadin.data.converter.StringToBigDecimalConverter;
import com.vaadin.data.validator.BigDecimalRangeValidator;
import com.vaadin.data.validator.RegexpValidator;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.apache.commons.lang3.StringUtils;
import org.jpos.gl.*;
import org.jpos.qi.QI;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewEntryForm extends HorizontalLayout {
    private final static String TEXT_REGEX = "^[\\w\\s.,\\-\\']*$";
    private TransactionsHelper helper;
    private Journal journal;
    private GLTransaction transaction;
    private QI app;
    private EntryGrid entryGrid;
    private Button addEntryBtn;
    private Binder<GLEntry> binder;
    private boolean shouldReverse;

    public NewEntryForm (GLTransaction transaction, TransactionsHelper helper, EntryGrid entryGrid) {
        super();
        try {
            this.transaction = transaction.clone();
        } catch (CloneNotSupportedException e) {
            // Log error and ignore. Clone should be supported.
            QI.getQI().getLog().error(e);
        }
        this.journal = transaction.getJournal();
        this.helper = helper;
        this.app = QI.getQI();
        this.entryGrid = entryGrid;
        setStyleName(ValoTheme.LAYOUT_HORIZONTAL_WRAPPING);
        setSpacing(true);
        setWidthUndefined();
        GLEntry entry = new GLEntry();
        binder = new Binder (GLEntry.class);
        createAndBindFields(binder);
        binder.setBean(entry);
        binder.setReadOnly(true);
        addEntryBtn = new Button(app.getMessage("addEntry"));
        addEntryBtn.addClickListener(addEntryClickListener(binder));
        addEntryBtn.setEnabled(false);
        addEntryBtn.setStyleName(ValoTheme.BUTTON_FRIENDLY);
        addComponent(addEntryBtn);
        setComponentAlignment(addEntryBtn, Alignment.BOTTOM_CENTER);
    }

    private void createAndBindFields (Binder binder) {
        TextField accountCode = createTextField("accountCode");
        ComboBox layer = createLayersSelector();
        TextField detail = createTextField("detail");
        TextField tags = createTextField("tags");
        TextField amount = createTextField("amount");
        RadioButtonGroup credit = createCreditOrDebit();
        binder.forField(accountCode)
                .withNullRepresentation("")
                .withConverter(new AccountConverter())
                .withValidator((Validator<Account>) (value, context) -> {
                    if (value!=null && !(value instanceof FinalAccount))
                        return ValidationResult.error(app.getMessage("errorMessage.accountNotFinal"));
                    else if (value == null)
                        return ValidationResult.error(app.getMessage("errorMessage.req", StringUtils.capitalize(accountCode.getCaption())));
                    return ValidationResult.ok();
                })
                .asRequired(app.getMessage("errorMessage.req", StringUtils.capitalize(layer.getCaption())))
                .bind("account");
        binder.forField(layer)
                .withConverter(new ShortToLayerConverter(journal))
                .asRequired(app.getMessage("errorMessage.req", StringUtils.capitalize(layer.getCaption())))
                .bind("layer");
        binder.forField(detail)
                .withValidator(new StringLengthValidator(app.getMessage("errorMessage.invalidField", detail.getCaption()), 0, 255))
                .withValidator(new RegexpValidator(app.getMessage("errorMessage.invalidField", detail.getCaption()), TEXT_REGEX))
                .bind("detail");
        binder.forField(tags)
                .withValidator(new StringLengthValidator(app.getMessage("errorMessage.invalidField", tags.getCaption()), 0, 255))
                .withValidator(new RegexpValidator(app.getMessage("errorMessage.invalidField", tags.getCaption()), TEXT_REGEX))
                .withConverter(new StringToTagConverter())
                .bind("tags");
        binder.forField(amount)
                .asRequired(app.getMessage("errorMessage.req", StringUtils.capitalize(amount.getCaption())))
                .withConverter(new StringToBigDecimalConverter(app.getMessage("errorMessage.invalidAmount")))
                .withValidator(new BigDecimalRangeValidator(app.getMessage("errorMessage.invalidAmount"), new BigDecimal("1"), new BigDecimal("99999999999999")))
                .withNullRepresentation(BigDecimal.ZERO)
                .bind("amount");
        binder.bind(credit, "credit");
        addComponent(accountCode);
        addComponent(layer);
        addComponent(detail);
        addComponent(tags);
        addComponent(amount);
        addComponent(credit);
        setComponentAlignment(credit, Alignment.BOTTOM_CENTER);
    }

    private TextField createTextField (String captionId) {
        TextField f = new TextField(app.getMessage(captionId));
        f.setWidth("150");
        return f;
    }

    private RadioButtonGroup createCreditOrDebit () {
        RadioButtonGroup<Boolean> radio = new RadioButtonGroup<>();
        radio.setItems(Boolean.FALSE, Boolean.TRUE);
        radio.addStyleName(ValoTheme.OPTIONGROUP_HORIZONTAL);
        ItemCaptionGenerator itemCaptionGenerator = (ItemCaptionGenerator) item -> Boolean.TRUE.equals(item) ?
                app.getMessage("credit") : app.getMessage("debit");
        radio.setItemCaptionGenerator(itemCaptionGenerator);
        return radio;
    }

    private ComboBox createLayersSelector () {
        ComboBox<Layer> box = new ComboBox(app.getMessage("layer"));
        box.setItemCaptionGenerator(l -> l.getId() + " - " + l.getName());
        List layers = helper.getLayers(journal);
        if (layers != null) {
            Collections.sort(layers);
            box.setItems(layers);
            if (layers.size() > 0) {
                box.setValue((Layer) layers.get(0));
            }
        }
        box.setEmptySelectionAllowed(false);
        return box;
    }

    private Button.ClickListener addEntryClickListener(Binder binder) {
        return event -> {
            if (binder.validate().isOk()) {
                if (binder.writeBeanIfValid(binder.getBean())) {
                    GLEntry entry = (GLEntry) binder.getBean();
                    int count = 0;
                    List<GLEntry> newEntriesList = new ArrayList<>();
                    for (GLEntry e : transaction.getEntries()) {
                        e.setId(count);
                        newEntriesList.add(e);
                        count++;
                    }
                    if (entry.isCredit()) {
                        GLCredit credit = new GLCredit();
                        credit.setAccount(entry.getAccount());
                        credit.setAmount(entry.getAmount());
                        credit.setLayer(entry.getLayer());
                        credit.setDetail(entry.getDetail());
                        credit.setTags(entry.getTags());
                        credit.setTransaction(entry.getTransaction());
                        credit.setId(count);
                        newEntriesList.add(credit);
                    } else if (entry.isDebit()) {
                        GLDebit debit = new GLDebit();
                        debit.setAccount(entry.getAccount());
                        debit.setAmount(entry.getAmount());
                        debit.setLayer(entry.getLayer());
                        debit.setDetail(entry.getDetail());
                        debit.setTags(entry.getTags());
                        debit.setTransaction(entry.getTransaction());
                        debit.setId(count);
                        newEntriesList.add(debit);
                    }
                    transaction.setEntries(newEntriesList);
                    entryGrid.setValue(transaction);
                    clearFields();
                    shouldReverse = true;
                    entryGrid.setComponentError(null);
                }
            } else {
                BindingValidationStatus<?> result = (BindingValidationStatus<?>) binder.validate().getFieldValidationErrors().get(0);
                app.displayNotification(result.getResult().get().getErrorMessage());
            }
        };
    }

    private void clearFields () {
        binder.setBean(new GLEntry());
    }

    public void setReadOnly (boolean readOnly) {
        binder.setReadOnly(readOnly);
        addEntryBtn.setEnabled(!readOnly);
        if (readOnly)
            clearFields();
    }

    public Button getAddEntryBtn() {
        return addEntryBtn;
    }

    public void setAddEntryBtn(Button addEntryBtn) {
        this.addEntryBtn = addEntryBtn;
    }

    public GLTransaction getTransaction() {
        return transaction;
    }

    public void setTransaction(GLTransaction transaction) {
        this.transaction = transaction;
    }

    public boolean isShouldReverse() {
        return shouldReverse;
    }

    public void setShouldReverse(boolean shouldReverse) {
        this.shouldReverse = shouldReverse;
    }
}
