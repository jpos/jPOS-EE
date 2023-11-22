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

package org.jpos.iso20022.auth_061_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Investment1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Investment1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="UscrdCshDpst" type="{urn:iso:std:iso:20022:tech:xsd:auth.061.001.01}Deposit1"/>
 *         <element name="CntrlBkDpst" type="{urn:iso:std:iso:20022:tech:xsd:auth.061.001.01}Deposit1"/>
 *         <element name="RpAgrmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.061.001.01}RepurchaseAgreement2"/>
 *         <element name="OthrInvstmts" type="{urn:iso:std:iso:20022:tech:xsd:auth.061.001.01}OtherInvestment1"/>
 *         <element name="OutrghtInvstmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.061.001.01}SecurityIdentificationAndAmount1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Investment1Choice", propOrder = {
    "uscrdCshDpst",
    "cntrlBkDpst",
    "rpAgrmt",
    "othrInvstmts",
    "outrghtInvstmt"
})
public class Investment1Choice {

    @XmlElement(name = "UscrdCshDpst")
    protected Deposit1 uscrdCshDpst;
    @XmlElement(name = "CntrlBkDpst")
    protected Deposit1 cntrlBkDpst;
    @XmlElement(name = "RpAgrmt")
    protected RepurchaseAgreement2 rpAgrmt;
    @XmlElement(name = "OthrInvstmts")
    protected OtherInvestment1 othrInvstmts;
    @XmlElement(name = "OutrghtInvstmt")
    protected SecurityIdentificationAndAmount1 outrghtInvstmt;

    /**
     * Gets the value of the uscrdCshDpst property.
     * 
     * @return
     *     possible object is
     *     {@link Deposit1 }
     *     
     */
    public Deposit1 getUscrdCshDpst() {
        return uscrdCshDpst;
    }

    /**
     * Sets the value of the uscrdCshDpst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Deposit1 }
     *     
     */
    public void setUscrdCshDpst(Deposit1 value) {
        this.uscrdCshDpst = value;
    }

    /**
     * Gets the value of the cntrlBkDpst property.
     * 
     * @return
     *     possible object is
     *     {@link Deposit1 }
     *     
     */
    public Deposit1 getCntrlBkDpst() {
        return cntrlBkDpst;
    }

    /**
     * Sets the value of the cntrlBkDpst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Deposit1 }
     *     
     */
    public void setCntrlBkDpst(Deposit1 value) {
        this.cntrlBkDpst = value;
    }

    /**
     * Gets the value of the rpAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link RepurchaseAgreement2 }
     *     
     */
    public RepurchaseAgreement2 getRpAgrmt() {
        return rpAgrmt;
    }

    /**
     * Sets the value of the rpAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepurchaseAgreement2 }
     *     
     */
    public void setRpAgrmt(RepurchaseAgreement2 value) {
        this.rpAgrmt = value;
    }

    /**
     * Gets the value of the othrInvstmts property.
     * 
     * @return
     *     possible object is
     *     {@link OtherInvestment1 }
     *     
     */
    public OtherInvestment1 getOthrInvstmts() {
        return othrInvstmts;
    }

    /**
     * Sets the value of the othrInvstmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherInvestment1 }
     *     
     */
    public void setOthrInvstmts(OtherInvestment1 value) {
        this.othrInvstmts = value;
    }

    /**
     * Gets the value of the outrghtInvstmt property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentificationAndAmount1 }
     *     
     */
    public SecurityIdentificationAndAmount1 getOutrghtInvstmt() {
        return outrghtInvstmt;
    }

    /**
     * Sets the value of the outrghtInvstmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentificationAndAmount1 }
     *     
     */
    public void setOutrghtInvstmt(SecurityIdentificationAndAmount1 value) {
        this.outrghtInvstmt = value;
    }

}
