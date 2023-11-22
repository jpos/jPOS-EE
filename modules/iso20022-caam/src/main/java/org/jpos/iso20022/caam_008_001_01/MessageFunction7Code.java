/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2023 jPOS Software SRL
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

package org.jpos.iso20022.caam_008_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageFunction7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BALN"/>
 *     <enumeration value="CMPA"/>
 *     <enumeration value="CMPD"/>
 *     <enumeration value="ACMD"/>
 *     <enumeration value="DVCC"/>
 *     <enumeration value="DIAQ"/>
 *     <enumeration value="DIAP"/>
 *     <enumeration value="GSTS"/>
 *     <enumeration value="INQQ"/>
 *     <enumeration value="INQP"/>
 *     <enumeration value="KYAQ"/>
 *     <enumeration value="KYAP"/>
 *     <enumeration value="PINQ"/>
 *     <enumeration value="PINP"/>
 *     <enumeration value="RJAQ"/>
 *     <enumeration value="RJAP"/>
 *     <enumeration value="WITV"/>
 *     <enumeration value="WITK"/>
 *     <enumeration value="WITQ"/>
 *     <enumeration value="WITP"/>
 *     <enumeration value="INQC"/>
 *     <enumeration value="H2AP"/>
 *     <enumeration value="H2AQ"/>
 *     <enumeration value="TMOP"/>
 *     <enumeration value="CSEC"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="SKSC"/>
 *     <enumeration value="SSTS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MessageFunction7Code")
@XmlEnum
public enum MessageFunction7Code {


    /**
     * Provide the ATM counters resettting those that are applicable.
     * 
     */
    BALN("BALN"),

    /**
     * Acknowledgement of a completion advice.
     * 
     */
    CMPA("CMPA"),

    /**
     * Advice of an ATM transaction completion.
     * 
     */
    CMPD("CMPD"),

    /**
     * Global ATM commands.
     * 
     */
    ACMD("ACMD"),

    /**
     * Maintenance commands to perform.
     * 
     */
    DVCC("DVCC"),

    /**
     * Request for a diagnostic.
     * 
     */
    DIAQ("DIAQ"),

    /**
     * Response to a diagnostic request.
     * 
     */
    DIAP("DIAP"),

    /**
     * Global status of the ATM.
     * 
     */
    GSTS("GSTS"),

    /**
     * Request for an inquiry.
     * 
     */
    INQQ("INQQ"),

    /**
     * Response to an inquiry request.
     * 
     */
    INQP("INQP"),

    /**
     * Request for a key download.
     * 
     */
    KYAQ("KYAQ"),

    /**
     * Response to a key download.
     * 
     */
    KYAP("KYAP"),

    /**
     * Request for a cardholder PIN management.
     * 
     */
    PINQ("PINQ"),

    /**
     * Response to a cardholder PIN management request.
     * 
     */
    PINP("PINP"),

    /**
     * Rejected request message.
     * 
     */
    RJAQ("RJAQ"),

    /**
     * Rejected response message.
     * 
     */
    RJAP("RJAP"),

    /**
     * Response of a withdrawal transaction.
     * 
     */
    WITV("WITV"),

    /**
     * Acknowledgement of a withdrawal transaction advice.
     * 
     */
    WITK("WITK"),

    /**
     * Request for a withdrawal transaction.
     * 
     */
    WITQ("WITQ"),

    /**
     * Response to a withdrawal transaction request.
     * 
     */
    WITP("WITP"),

    /**
     * Current value of counters, no reinitialisation of the counters.
     * 
     */
    INQC("INQC"),

    /**
     * Acknowledgement of a request from a host to an ATM for contacting.
     * 
     */
    @XmlEnumValue("H2AP")
    H_2_AP("H2AP"),

    /**
     * Request from a host to an ATM to be contacted by this ATM.
     * 
     */
    @XmlEnumValue("H2AQ")
    H_2_AQ("H2AQ"),

    /**
     * Logical or physical operation on the ATM.
     * 
     */
    TMOP("TMOP"),

    /**
     * Security Commands.
     * 
     */
    CSEC("CSEC"),

    /**
     * Security detailed report.
     * 
     */
    DSEC("DSEC"),

    /**
     * Result of the key download with the status of the downloaded keys including key check values.
     * 
     */
    SKSC("SKSC"),

    /**
     * Status of cryptographic keys.
     * 
     */
    SSTS("SSTS");
    private final String value;

    MessageFunction7Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageFunction7Code fromValue(String v) {
        for (MessageFunction7Code c: MessageFunction7Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
