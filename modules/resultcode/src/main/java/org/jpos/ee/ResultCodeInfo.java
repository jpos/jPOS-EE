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

package org.jpos.ee;

import java.io.Serializable;
import org.apache.commons.lang3.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class ResultCodeInfo implements Serializable {

    /** nullable persistent field */
    private String resultCode;

    /** nullable persistent field */
    private String resultInfo;

    /** nullable persistent field */
    private String extendedResultCode;

    /** full constructor */
    public ResultCodeInfo(String resultCode, String resultInfo, String extendedResultCode) {
        this.resultCode = resultCode;
        this.resultInfo = resultInfo;
        this.extendedResultCode = extendedResultCode;
    }

    /** default constructor */
    public ResultCodeInfo() {
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultInfo() {
        return this.resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    public String getExtendedResultCode() {
        return this.extendedResultCode;
    }

    public void setExtendedResultCode(String extendedResultCode) {
        this.extendedResultCode = extendedResultCode;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
