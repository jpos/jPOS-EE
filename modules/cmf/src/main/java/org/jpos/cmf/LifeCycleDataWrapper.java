/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2025 jPOS Software SRL
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

import java.util.Objects;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOUtil;

/**
 * A wrapper class to handle the parsing and serialization of CMF
 * Data Element 21, which represents Life Cycle Data.
 * <p>
 * This data element is a fixed-length field (22 characters) and comprises
 * several sub-elements:
 * <ul>
 * <li>Life Cycle Indicator (1 character)</li>
 * <li>Trace (15 characters)</li>
 * <li>Sequence (2 characters)</li>
 * <li>Token (4 characters)</li>
 * </ul>
 *
 * The class provides methods to construct an object from a raw string or
 * populate it field by field, and to serialize the object back into the
 * 22-character string format expected by CMF.
 * </p>
 */
public class LifeCycleDataWrapper {

    private String indicator = "";
    private String trace = "";
    private String sequence = "";
    private String token = "";

    public LifeCycleDataWrapper() {
    }

    /**
     * Constructs a {@code LifeCycleDataWrapper} instance by parsing a raw
     * 22-character string. The raw string is expected to conform to the
     * CMF Data Element 21 format:
     * <ul>
     * <li>Characters 0-0: Life Cycle Indicator</li>
     * <li>Characters 1-15: Trace</li>
     * <li>Characters 16-17: Sequence</li>
     * <li>Characters 18-21: Token</li>
     * </ul>
     *
     * @param raw The 22-character raw string representing the Life Cycle Data.
     * @throws NullPointerException     If the raw data string is null.
     * @throws IllegalArgumentException If the raw data string's length is not exactly 22.
     */
    public LifeCycleDataWrapper(String raw) {

        Objects.requireNonNull(raw, "Raw data cannot be null.");

        if (raw.length() != 22)
            throw new IllegalArgumentException(
                    String.format("Raw data length is invalid (expected=22, actual=%d)", 
                        raw.length()));

        setIndicator(raw.substring(0, 1));
        setTrace(raw.substring(1, 16));
        setSequence(raw.substring(16, 18));
        setToken(raw.substring(18));
    }

    public String getIndicator() {
        return indicator;
    }

    public void setIndicator(String indicator) {
        if (Objects.requireNonNull(indicator, "Life cycle indicator cannot be null.").length() != 1)
            throw new IllegalArgumentException(
                    String.format("Life cycle indicator length is invalid (expected=1, actual=%d).", 
                        indicator.length()));
        this.indicator = indicator;
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        if (Objects.requireNonNull(trace, "Trace cannot be null.").length() > 15)
            throw new IllegalArgumentException(
                    String.format("Trace length is invalid (max=15, actual=%d).", 
                        trace.length()));
        this.trace = trace;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        if (Objects.requireNonNull(sequence, "Sequence number cannot be null.").length() > 2)
            throw new IllegalArgumentException(
                    String.format("Sequence number length is invalid (max=2, actual=%d).", 
                        sequence.length()));
        this.sequence = sequence;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        if (Objects.requireNonNull(token, "Token cannot be null.").length() > 4)
            throw new IllegalArgumentException(
                    String.format("Token length is invalid (max=4, actual=%d).", 
                        token.length()));
        this.token = token;
    }

    /**
     * Serializes the current {@code LifeCycleDataWrapper} object into its
     * 22-character CMF Data Element 21 string representation.
     * <p>
     * The fields are padded as follows:
     * <ul>
     * <li>Indicator: Right-padded with spaces to 1 character.</li>
     * <li>Trace: Right-padded with spaces to 15 characters.</li>
     * <li>Sequence: Zero-padded to 2 characters.</li>
     * <li>Token: Zero-padded to 4 characters.</li>
     * </ul>
     * </p>
     *
     * @return A 22-character string formatted as per CMF Data Element 21.
     * @throws ISOException
     */
    public String serialize() throws ISOException {

        StringBuilder sb = new StringBuilder();

        sb.append(ISOUtil.padright(getIndicator(), 1, ' '));
        sb.append(ISOUtil.padright(getTrace(), 15, ' '));
        sb.append(ISOUtil.zeropad(getSequence(), 2));
        sb.append(ISOUtil.zeropad(getToken(), 4));

        return sb.toString();
    }
}
