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

package org.jpos.cmf;

public enum CMFConstants {
    CMF_VERSION("106"),
    JPF_VERSION("113.2"),
    JPF_FIRSTNAME( "113.3"),
    JPF_MIDDLENAME("113.4"),
    JPF_LASTNAME("113.5"),
    JPF_LASTNAME2("113.6"),
    JPF_EMAIL("113.7"),
    JPF_STATUS("113.8"),
    JPF_HONORIFIC("113.9"),
    JPF_GENDER("113.10"),
    JPF_ADDR1("113.11"),
    JPF_ADDR2("113.12"),
    JPF_CITY("113.13"),
    JPF_STATE("113.14"),
    JPF_ZIPCODE("113.15"),
    JPF_COUNTRY("113.16"),
    JPF_PHONE("113.17"),
    JPF_NOTES("113.18"),
    JPF_DATES("113.19"),
    JPF_ALT_ID("113.20");

    private String value;

    CMFConstants(String value) {
        this.value = value;
    }
    public String value() {
        return value;
    }
}

