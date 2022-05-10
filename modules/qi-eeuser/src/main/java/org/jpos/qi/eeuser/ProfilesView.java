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

import com.vaadin.navigator.ViewChangeListener;
import org.jpos.qi.QI;

/**
 * Created by spr on 5/20/16.
 */
public class ProfilesView extends UsersView {

    public ProfilesView() {
        super();
        setTitle("<strong>" + getApp().getMessage("profile") + "</strong>");
        setShowRevisionHistoryButton(false);
    }

    @Override
    public void enter (ViewChangeListener.ViewChangeEvent event) {
        setHelper(createHelper());
        getHelper().setConfiguration(getConfiguration());
        showSpecificView(getGeneralRoute() + "/" + QI.getQI().getUser().getId());
    }

    @Override
    public Object getEntityByParam(String param) {
        return super.getEntityByParam(String.valueOf(QI.getQI().getUser().getId()));
    }

    @Override
    public String getHeaderSpecificTitle(Object entity) {
        return QI.getQI().getUser().getNick();
    }
}
