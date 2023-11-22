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

package org.jpos.iso20022.auth_091_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationCategory3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReconciliationCategory3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptgTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}TradeRepositoryReportingType1Code"/>
 *         <element name="Pairg" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}PairingStatus1Code"/>
 *         <element name="Rcncltn" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}ReconciliationStatus1Code"/>
 *         <element name="ValtnRcncltn" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}ReconciliationStatus2Code"/>
 *         <element name="Rvvd" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}YesNoIndicator"/>
 *         <element name="FrthrMod" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}YesNoIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationCategory3", propOrder = {
    "rptgTp",
    "pairg",
    "rcncltn",
    "valtnRcncltn",
    "rvvd",
    "frthrMod"
})
public class ReconciliationCategory3 {

    @XmlElement(name = "RptgTp", required = true)
    @XmlSchemaType(name = "string")
    protected TradeRepositoryReportingType1Code rptgTp;
    @XmlElement(name = "Pairg", required = true)
    @XmlSchemaType(name = "string")
    protected PairingStatus1Code pairg;
    @XmlElement(name = "Rcncltn", required = true)
    @XmlSchemaType(name = "string")
    protected ReconciliationStatus1Code rcncltn;
    @XmlElement(name = "ValtnRcncltn", required = true)
    @XmlSchemaType(name = "string")
    protected ReconciliationStatus2Code valtnRcncltn;
    @XmlElement(name = "Rvvd")
    protected boolean rvvd;
    @XmlElement(name = "FrthrMod")
    protected boolean frthrMod;

    /**
     * Gets the value of the rptgTp property.
     * 
     * @return
     *     possible object is
     *     {@link TradeRepositoryReportingType1Code }
     *     
     */
    public TradeRepositoryReportingType1Code getRptgTp() {
        return rptgTp;
    }

    /**
     * Sets the value of the rptgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeRepositoryReportingType1Code }
     *     
     */
    public void setRptgTp(TradeRepositoryReportingType1Code value) {
        this.rptgTp = value;
    }

    /**
     * Gets the value of the pairg property.
     * 
     * @return
     *     possible object is
     *     {@link PairingStatus1Code }
     *     
     */
    public PairingStatus1Code getPairg() {
        return pairg;
    }

    /**
     * Sets the value of the pairg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PairingStatus1Code }
     *     
     */
    public void setPairg(PairingStatus1Code value) {
        this.pairg = value;
    }

    /**
     * Gets the value of the rcncltn property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationStatus1Code }
     *     
     */
    public ReconciliationStatus1Code getRcncltn() {
        return rcncltn;
    }

    /**
     * Sets the value of the rcncltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationStatus1Code }
     *     
     */
    public void setRcncltn(ReconciliationStatus1Code value) {
        this.rcncltn = value;
    }

    /**
     * Gets the value of the valtnRcncltn property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationStatus2Code }
     *     
     */
    public ReconciliationStatus2Code getValtnRcncltn() {
        return valtnRcncltn;
    }

    /**
     * Sets the value of the valtnRcncltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationStatus2Code }
     *     
     */
    public void setValtnRcncltn(ReconciliationStatus2Code value) {
        this.valtnRcncltn = value;
    }

    /**
     * Gets the value of the rvvd property.
     * 
     */
    public boolean isRvvd() {
        return rvvd;
    }

    /**
     * Sets the value of the rvvd property.
     * 
     */
    public void setRvvd(boolean value) {
        this.rvvd = value;
    }

    /**
     * Gets the value of the frthrMod property.
     * 
     */
    public boolean isFrthrMod() {
        return frthrMod;
    }

    /**
     * Sets the value of the frthrMod property.
     * 
     */
    public void setFrthrMod(boolean value) {
        this.frthrMod = value;
    }

}
