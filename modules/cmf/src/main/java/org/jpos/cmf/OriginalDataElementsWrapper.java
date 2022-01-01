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

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.jpos.iso.ISODate;

import java.util.Date;
import java.util.Objects;

/**
 * Handles original data elements field content - DE-056
 */
public final class OriginalDataElementsWrapper {

    private static final int MAX_FIELD_LENGTH = 41;

    private String originalMTI;
    private int originalSTAN;
    private Date originalLocalDate;
    private String originalAcquiringInstCode;

    public OriginalDataElementsWrapper() { }

    public OriginalDataElementsWrapper(String fieldValue) {

        Objects.requireNonNull(fieldValue);

        if (fieldValue.length() > MAX_FIELD_LENGTH)
            throw new IllegalArgumentException("Invalid length");

        parse(fieldValue);
    }

    private void parse(String fieldValue) {

        try {

            setOriginalMTI(fieldValue.substring(0, 4));
            setOriginalSTAN(Integer.valueOf(fieldValue.substring(4, 16)));
            setOriginalLocalDate(DateUtils.parseDate(fieldValue.substring(16, 30), "yyyyMMddHHmmss"));
            setOriginalAcquiringInstCode(fieldValue.substring(30));
        }
        catch (Exception e) {

            throw new IllegalArgumentException(e);
        }
    }

    public String serialize() {

        StringBuilder r = new StringBuilder();

        if (StringUtils.isNotBlank(getOriginalMTI()))
            r.append(StringUtils.leftPad(getOriginalMTI(), 4, '0'));
        else
            r.append("0000");

        r.append(StringUtils.leftPad(Integer.toString(getOriginalSTAN()), 12, '0'));

        if (getOriginalLocalDate() != null)
            r.append(ISODate.formatDate(getOriginalLocalDate(), "yyyyMMddHHmmss"));
        else
            r.append(StringUtils.repeat('0', 14));

        if (StringUtils.isNotBlank(getOriginalAcquiringInstCode()))
            r.append(getOriginalAcquiringInstCode());

        return r.toString();
    }

    public String getOriginalMTI() {
        return originalMTI;
    }

    public void setOriginalMTI(String originalMTI) {

        if (StringUtils.isBlank(originalMTI))
            throw new NullPointerException("originalMTI cannot be null or empty");

        if (originalMTI.length() != 4)
            throw new IllegalArgumentException("originalMTI length is invalid");

        this.originalMTI = originalMTI;
    }

    public int getOriginalSTAN() {
        return originalSTAN;
    }

    public void setOriginalSTAN(int originalSTAN) {

        if (originalSTAN < 0)
            throw new IllegalArgumentException("originalSTAN must be a positive number");

        this.originalSTAN = originalSTAN;
    }

    public Date getOriginalLocalDate() {
        return originalLocalDate;
    }

    public void setOriginalLocalDate(Date originalLocalDate) {
        this.originalLocalDate = originalLocalDate;
    }

    public String getOriginalAcquiringInstCode() {
        return originalAcquiringInstCode;
    }

    public void setOriginalAcquiringInstCode(String originalAcquiringInstCode) {

        Objects.requireNonNull(originalAcquiringInstCode);

        if (originalAcquiringInstCode.length() > 11)
            throw new IllegalArgumentException("Invalid length");

        this.originalAcquiringInstCode = originalAcquiringInstCode;
    }
}
