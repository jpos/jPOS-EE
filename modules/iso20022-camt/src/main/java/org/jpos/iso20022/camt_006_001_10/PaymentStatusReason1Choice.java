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

package org.jpos.iso20022.camt_006_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentStatusReason1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentStatusReason1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Umtchd" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}UnmatchedStatusReason1Code"/>
 *         <element name="Canc" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}CancelledStatusReason1Code"/>
 *         <element name="Sspd" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}SuspendedStatusReason1Code"/>
 *         <element name="PdgFlngSttlm" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}PendingFailingSettlement1Code"/>
 *         <element name="PdgSttlm" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}PendingSettlement2Code"/>
 *         <element name="PrtryRjctn" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}ProprietaryStatusJustification2"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}Max35Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStatusReason1Choice", propOrder = {
    "umtchd",
    "canc",
    "sspd",
    "pdgFlngSttlm",
    "pdgSttlm",
    "prtryRjctn",
    "prtry"
})
public class PaymentStatusReason1Choice {

    @XmlElement(name = "Umtchd")
    @XmlSchemaType(name = "string")
    protected UnmatchedStatusReason1Code umtchd;
    @XmlElement(name = "Canc")
    @XmlSchemaType(name = "string")
    protected CancelledStatusReason1Code canc;
    @XmlElement(name = "Sspd")
    @XmlSchemaType(name = "string")
    protected SuspendedStatusReason1Code sspd;
    @XmlElement(name = "PdgFlngSttlm")
    @XmlSchemaType(name = "string")
    protected PendingFailingSettlement1Code pdgFlngSttlm;
    @XmlElement(name = "PdgSttlm")
    @XmlSchemaType(name = "string")
    protected PendingSettlement2Code pdgSttlm;
    @XmlElement(name = "PrtryRjctn")
    protected ProprietaryStatusJustification2 prtryRjctn;
    @XmlElement(name = "Prtry")
    protected String prtry;

    /**
     * Gets the value of the umtchd property.
     * 
     * @return
     *     possible object is
     *     {@link UnmatchedStatusReason1Code }
     *     
     */
    public UnmatchedStatusReason1Code getUmtchd() {
        return umtchd;
    }

    /**
     * Sets the value of the umtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnmatchedStatusReason1Code }
     *     
     */
    public void setUmtchd(UnmatchedStatusReason1Code value) {
        this.umtchd = value;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatusReason1Code }
     *     
     */
    public CancelledStatusReason1Code getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatusReason1Code }
     *     
     */
    public void setCanc(CancelledStatusReason1Code value) {
        this.canc = value;
    }

    /**
     * Gets the value of the sspd property.
     * 
     * @return
     *     possible object is
     *     {@link SuspendedStatusReason1Code }
     *     
     */
    public SuspendedStatusReason1Code getSspd() {
        return sspd;
    }

    /**
     * Sets the value of the sspd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuspendedStatusReason1Code }
     *     
     */
    public void setSspd(SuspendedStatusReason1Code value) {
        this.sspd = value;
    }

    /**
     * Gets the value of the pdgFlngSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link PendingFailingSettlement1Code }
     *     
     */
    public PendingFailingSettlement1Code getPdgFlngSttlm() {
        return pdgFlngSttlm;
    }

    /**
     * Sets the value of the pdgFlngSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingFailingSettlement1Code }
     *     
     */
    public void setPdgFlngSttlm(PendingFailingSettlement1Code value) {
        this.pdgFlngSttlm = value;
    }

    /**
     * Gets the value of the pdgSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link PendingSettlement2Code }
     *     
     */
    public PendingSettlement2Code getPdgSttlm() {
        return pdgSttlm;
    }

    /**
     * Sets the value of the pdgSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingSettlement2Code }
     *     
     */
    public void setPdgSttlm(PendingSettlement2Code value) {
        this.pdgSttlm = value;
    }

    /**
     * Gets the value of the prtryRjctn property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusJustification2 }
     *     
     */
    public ProprietaryStatusJustification2 getPrtryRjctn() {
        return prtryRjctn;
    }

    /**
     * Sets the value of the prtryRjctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusJustification2 }
     *     
     */
    public void setPrtryRjctn(ProprietaryStatusJustification2 value) {
        this.prtryRjctn = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtry(String value) {
        this.prtry = value;
    }

}
