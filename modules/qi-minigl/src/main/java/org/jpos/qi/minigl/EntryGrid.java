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

package org.jpos.qi.minigl;

import com.vaadin.data.HasValue;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.UserError;
import com.vaadin.shared.Registration;
import com.vaadin.shared.ui.grid.HeightMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.renderers.HtmlRenderer;
import org.jpos.ee.BLException;
import org.jpos.gl.GLEntry;
import org.jpos.gl.GLTransaction;

import java.util.Collection;
import java.util.List;

import static org.jpos.qi.util.QIUtils.createAmountRenderer;
import static org.jpos.qi.util.QIUtils.getCaptionFromId;

/**
 * Created by jr on 8/1/17.
 */
public class EntryGrid extends Grid<GLEntry> implements HasValue<GLTransaction> {
    private boolean canEdit;
    private GLTransaction transaction;
    private boolean shouldReverse;

    public EntryGrid (String caption) {
        this (caption, false);
    }

    public EntryGrid(String caption, boolean canEdit) {
        super();
        this.canEdit = canEdit;
        if (caption != null)
            this.setCaption(caption);
        this.addStyleName("v-grid");
        this.addColumn(entry -> {
            String lbl = "<label>";
            lbl += entry.getAccount() != null && entry.getAccount().getCode() != null ?
                    entry.getAccount().getCode() : "";
            lbl += "</label>&nbsp;<label class='v-label-light'>";
            lbl += entry.getAccount() != null && entry.getAccount().getDescription() != null ?
                    entry.getAccount().getDescription() : "";
            lbl += "</label>";
            return lbl;
        }).setId("account")
                .setCaption(getCaptionFromId("account"))
                .setSortable(true)
                .setHidable(false)
                .setRenderer(new HtmlRenderer());
        this.addColumn(GLEntry::getLayer).setId("layer")
                .setCaption(getCaptionFromId("layer"))
                .setSortable(true)
                .setHidable(false);
        this.addColumn(entry -> {
                    String detail = entry.getTransaction() != null ? entry.getTransaction().getDetail() : "";
                    String entryDetail = entry.getDetail() != null ? entry.getDetail() : "";
                    if (entryDetail.length() > 0)
                        detail = (detail != null && detail.length() > 0) ? detail + ", " + entryDetail : entryDetail;
                    return detail;
                })
                .setId("detail")
                .setCaption(getCaptionFromId("detail"))
                .setSortable(true)
                .setHidable(false);
        this.addColumn(entry -> entry.isDebit() ? entry.getAmount() : null)
                .setId("debit")
                .setStyleGenerator(cellStyle -> "align-right")
                .setRenderer(createAmountRenderer())
                .setCaption(getCaptionFromId("debit"))
                .setSortable(true)
                .setHidable(false);
        this.addColumn(entry -> entry.isCredit() ? entry.getAmount() : null)
                .setId("credit")
                .setStyleGenerator(cellStyle -> "align-right")
                .setRenderer(createAmountRenderer())
                .setCaption(getCaptionFromId("credit"))
                .setSortable(true)
                .setHidable(false);
        this.addColumn(entry -> entry.getTags() != null ? entry.getTags().toString() : "")
                .setId("tags")
                .setCaption(getCaptionFromId("tags"))
                .setSortable(true)
                .setHidable(false);
        //also align right header of credit & debit
        this.getHeaderRow(0).getCell("credit").setStyleName("align-right");
        this.getHeaderRow(0).getCell("debit").setStyleName("align-right");
        if (canEdit) {
            this.addComponentColumn(entry -> buildDeleteButton(entry))
                    .setId("delete")
                    .setCaption(getCaptionFromId("delete"))
                    .setHidden(true)
                    .setSortable(false)
                    .setHidable(false)
                    .setStyleGenerator(cellStyle -> "align-right");
            this.getHeaderRow(0).getCell("delete").setStyleName("align-right");
        }
        this.setSizeFull();
        this.setHeightMode(HeightMode.ROW);
    }

    private Button buildDeleteButton (GLEntry entry) {
        Button button = new Button(VaadinIcons.TRASH);
        button.addStyleName("borderless");
        button.addClickListener(e -> {
            removeEntry(entry);
        });
        return button;
    }

    private void removeEntry (GLEntry entry) {
        transaction.getEntries().remove(entry);
        setValue(transaction);
        shouldReverse = true;
    }

    //TODO : Check that credits and debits close on each layer? Now checked by GLSession.
    public void validate () throws BLException {
        if (transaction.getEntries().size() == 0) {
            setComponentError(new UserError("Transaction has no entries"));
            throw new BLException("Transaction has no entries");
        }
    }

    @Override
    public void setValue(GLTransaction value) {
        if (value != null) {
            this.transaction = value;
            List<GLEntry> entryList = transaction.getEntries();
            this.setItems(entryList);
            if (transaction.getEntries().size() > 0)
                this.setHeightByRows(transaction.getEntries().size());
            else
                this.setHeightByRows(1);
        }
    }

    public void setItems(Collection<GLEntry> entries) {
        super.setItems(entries);
    }

    @Override
    public GLTransaction getValue() {
        return transaction;
    }

    @Override
    public void setReadOnly(boolean readOnly) {
        super.setReadOnly(readOnly);
        if (getColumn("delete") != null)
            getColumn("delete").setHidden(readOnly);
    }

    @Override
    public boolean isReadOnly() {
        return super.isReadOnly();
    }

    //won't be used
    @Override
    public Registration addValueChangeListener(ValueChangeListener<GLTransaction> listener) {
        return (Registration) () -> {
            //do nothing
        };
    }

    @Override
    public GLTransaction getEmptyValue() {
        return new GLTransaction();
    }

    @Override
    public void setRequiredIndicatorVisible(boolean requiredIndicatorVisible) { }

    @Override
    public boolean isRequiredIndicatorVisible() {
        return false;
    }
}
