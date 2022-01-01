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

package org.jpos.qi.system;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.jpos.qi.QI;
import org.jpos.qi.views.DefaultView;

/**
 * Created by jr on 12/14/17.
 */
public class EmptyView extends DefaultView implements ViewDisplay  {

    public EmptyView(boolean canAdd) {
        Label emptyLabel = new Label(QI.getQI().getMessage("noItems"));
        emptyLabel.addStyleName(ValoTheme.LABEL_H2);
        addComponents(emptyLabel);
        setComponentAlignment(emptyLabel, Alignment.TOP_CENTER);
        setExpandRatio(emptyLabel,0);
        if (canAdd) {
            Button addNew = new Button(QI.getQI().getMessage("add"));
            addNew.setIcon(VaadinIcons.PLUS);
            String actualRoute = QI.getQI().getNavigator().getState();
            addNew.addClickListener(listener -> QI.getQI().getNavigator().navigateTo(actualRoute + "/new"));
            addNew.addStyleName(ValoTheme.BUTTON_LARGE);
            addNew.addStyleName(ValoTheme.BUTTON_FRIENDLY);
            addComponent(addNew);
            setComponentAlignment(addNew,Alignment.TOP_CENTER);
            setExpandRatio(addNew,1);
        }

    }


    @Override
    public void showView(View view) {

    }
}
