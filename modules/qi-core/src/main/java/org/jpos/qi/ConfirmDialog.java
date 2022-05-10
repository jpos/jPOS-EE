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

package org.jpos.qi;

import com.vaadin.shared.ui.ContentMode;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.jpos.ee.BLException;

public class ConfirmDialog extends Window implements Button.ClickListener {
    Callback callback;
    Button yes = new Button(QI.getQI().getMessage("confirm"), this);
    Button no = new Button(QI.getQI().getMessage("cancel"), this);

    public ConfirmDialog(String caption, String question, Callback callback) {
        this(caption,question,QI.getQI().getMessage("confirm"),QI.getQI().getMessage("cancel"),callback);
    }

    public ConfirmDialog(String caption, String question, String confirm, String cancel, Callback callback) {
        super(caption);
        setModal(true);
        setResizable(false);

        VerticalLayout content = new VerticalLayout();
        content.setMargin(true);
        content.setSpacing(true);
        setContent(content);

        this.yes.setCaption(confirm);
        this.yes.addStyleName(ValoTheme.BUTTON_PRIMARY);
        this.no.setCaption(cancel);
        this.callback = callback;

        // HTML is safe to assume and allows for line breaks and other stuff
        // We can always escape HTML special chars
        Label questionLabel = new Label(question, ContentMode.HTML);
        questionLabel.setCaptionAsHtml(true);
        if (question != null) {
            content.addComponent(questionLabel);
        }
        HorizontalLayout hl = new HorizontalLayout();
        hl.setMargin(new MarginInfo(true, false, false, false));
        hl.setSpacing(true);
        hl.setWidth("100%");
        hl.addComponent(yes);
        hl.setComponentAlignment(yes, Alignment.MIDDLE_CENTER);
        hl.addComponent(no);
        hl.setComponentAlignment(no, Alignment.MIDDLE_CENTER);
        content.addComponent(hl);
    }

    @Override
    public void buttonClick(Button.ClickEvent event) {
        if (getParent() != null)
            close();
        try {
            callback.onDialogResult(event.getSource() == yes);
        } catch (BLException e) {
            QI.getQI().getLog().error(e);
        }

    }

    public interface Callback{
         void onDialogResult(boolean resultIsYes) throws BLException;
    }
}
