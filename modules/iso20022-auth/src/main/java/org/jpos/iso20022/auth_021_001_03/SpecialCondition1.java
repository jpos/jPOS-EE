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

package org.jpos.iso20022.auth_021_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialCondition1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SpecialCondition1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IncmgAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.021.001.03}ActiveCurrencyAndAmount"/>
 *         <element name="OutgngAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.021.001.03}ActiveCurrencyAndAmount"/>
 *         <element name="IncmgAmtToOthrAcct" type="{urn:iso:std:iso:20022:tech:xsd:auth.021.001.03}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="PmtFrOthrAcct" type="{urn:iso:std:iso:20022:tech:xsd:auth.021.001.03}ActiveCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialCondition1", propOrder = {
    "incmgAmt",
    "outgngAmt",
    "incmgAmtToOthrAcct",
    "pmtFrOthrAcct"
})
public class SpecialCondition1 {

    @XmlElement(name = "IncmgAmt", required = true)
    protected ActiveCurrencyAndAmount incmgAmt;
    @XmlElement(name = "OutgngAmt", required = true)
    protected ActiveCurrencyAndAmount outgngAmt;
    @XmlElement(name = "IncmgAmtToOthrAcct")
    protected ActiveCurrencyAndAmount incmgAmtToOthrAcct;
    @XmlElement(name = "PmtFrOthrAcct")
    protected ActiveCurrencyAndAmount pmtFrOthrAcct;

    /**
     * Gets the value of the incmgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIncmgAmt() {
        return incmgAmt;
    }

    /**
     * Sets the value of the incmgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setIncmgAmt(ActiveCurrencyAndAmount value) {
        this.incmgAmt = value;
    }

    /**
     * Gets the value of the outgngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOutgngAmt() {
        return outgngAmt;
    }

    /**
     * Sets the value of the outgngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setOutgngAmt(ActiveCurrencyAndAmount value) {
        this.outgngAmt = value;
    }

    /**
     * Gets the value of the incmgAmtToOthrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIncmgAmtToOthrAcct() {
        return incmgAmtToOthrAcct;
    }

    /**
     * Sets the value of the incmgAmtToOthrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setIncmgAmtToOthrAcct(ActiveCurrencyAndAmount value) {
        this.incmgAmtToOthrAcct = value;
    }

    /**
     * Gets the value of the pmtFrOthrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPmtFrOthrAcct() {
        return pmtFrOthrAcct;
    }

    /**
     * Sets the value of the pmtFrOthrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setPmtFrOthrAcct(ActiveCurrencyAndAmount value) {
        this.pmtFrOthrAcct = value;
    }

}
