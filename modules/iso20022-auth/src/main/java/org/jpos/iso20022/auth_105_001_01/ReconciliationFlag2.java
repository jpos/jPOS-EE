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

package org.jpos.iso20022.auth_105_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationFlag2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReconciliationFlag2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}TradeRepositoryReportingType1Code" minOccurs="0"/>
 *         <element name="BothCtrPtiesRptg" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="PairdSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="LnRcncltnSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="CollRcncltnSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="ModSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationFlag2", propOrder = {
    "rptTp",
    "bothCtrPtiesRptg",
    "pairdSts",
    "lnRcncltnSts",
    "collRcncltnSts",
    "modSts"
})
public class ReconciliationFlag2 {

    @XmlElement(name = "RptTp")
    @XmlSchemaType(name = "string")
    protected TradeRepositoryReportingType1Code rptTp;
    @XmlElement(name = "BothCtrPtiesRptg")
    protected Boolean bothCtrPtiesRptg;
    @XmlElement(name = "PairdSts")
    protected Boolean pairdSts;
    @XmlElement(name = "LnRcncltnSts")
    protected Boolean lnRcncltnSts;
    @XmlElement(name = "CollRcncltnSts")
    protected Boolean collRcncltnSts;
    @XmlElement(name = "ModSts")
    protected Boolean modSts;

    /**
     * Gets the value of the rptTp property.
     * 
     * @return
     *     possible object is
     *     {@link TradeRepositoryReportingType1Code }
     *     
     */
    public TradeRepositoryReportingType1Code getRptTp() {
        return rptTp;
    }

    /**
     * Sets the value of the rptTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeRepositoryReportingType1Code }
     *     
     */
    public void setRptTp(TradeRepositoryReportingType1Code value) {
        this.rptTp = value;
    }

    /**
     * Gets the value of the bothCtrPtiesRptg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBothCtrPtiesRptg() {
        return bothCtrPtiesRptg;
    }

    /**
     * Sets the value of the bothCtrPtiesRptg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBothCtrPtiesRptg(Boolean value) {
        this.bothCtrPtiesRptg = value;
    }

    /**
     * Gets the value of the pairdSts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPairdSts() {
        return pairdSts;
    }

    /**
     * Sets the value of the pairdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPairdSts(Boolean value) {
        this.pairdSts = value;
    }

    /**
     * Gets the value of the lnRcncltnSts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLnRcncltnSts() {
        return lnRcncltnSts;
    }

    /**
     * Sets the value of the lnRcncltnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLnRcncltnSts(Boolean value) {
        this.lnRcncltnSts = value;
    }

    /**
     * Gets the value of the collRcncltnSts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollRcncltnSts() {
        return collRcncltnSts;
    }

    /**
     * Sets the value of the collRcncltnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollRcncltnSts(Boolean value) {
        this.collRcncltnSts = value;
    }

    /**
     * Gets the value of the modSts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModSts() {
        return modSts;
    }

    /**
     * Sets the value of the modSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModSts(Boolean value) {
        this.modSts = value;
    }

}
