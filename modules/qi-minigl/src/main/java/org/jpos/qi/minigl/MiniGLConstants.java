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

public enum MiniGLConstants
{
    // Some values from SysConfig pertaining to miniGL
    DEFAULT_GL_JOURNAL("GL_JOURNAL"),
    DEFAULT_GL_CHART("GL_CHART"),
    DEFAULT_GL_ISSUERS_ACCT("ISSUERS_ACCT");


    private final String name;

    MiniGLConstants() {
        this.name = name();
    }

    MiniGLConstants(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
