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

import com.vaadin.server.ExternalResource;
import com.vaadin.server.Resource;
import com.vaadin.server.ThemeResource;
import com.vaadin.server.FontAwesome;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QIResources {
    public static final Resource JPOS_LOGO =
            new ExternalResource("http://jpos.org/img/jpos.png");
    public static final Resource JPOS_LOGO_TINY  =
            new ThemeResource ("img/jpos-horizontal-colors-tiny.png");
    public static final Resource CLIENT_LOGO  = null;

    static List<FontAwesome> ICONS = Collections.unmodifiableList(Arrays.asList(FontAwesome.values()));

    public static String ALPHANUMERIC_SYMBOLS_PATTERN = "^[\\w|#=@.-]{1,128}$";
}
