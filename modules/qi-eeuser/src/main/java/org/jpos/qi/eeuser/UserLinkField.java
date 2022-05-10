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

import com.vaadin.ui.Button;
import org.jpos.ee.User;
import org.jpos.qi.QI;
import org.jpos.qi.util.LinkField;

public class UserLinkField extends LinkField {

    public UserLinkField(String url) {
        super(url);
    }

    @Override
    protected void doSetValue(Object value) {
        if (value != null && value instanceof User) {
            getLink().setCaption(((User) value).getNickAndId());
            getLink().addClickListener((Button.ClickListener) event -> QI.getQI().getNavigator().navigateTo("/" + getUrl() + "/" + ((User) value).getId()));
        }
    }
}
