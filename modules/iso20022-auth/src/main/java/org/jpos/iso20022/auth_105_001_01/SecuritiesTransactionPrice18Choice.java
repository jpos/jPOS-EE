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

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTransactionPrice18Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesTransactionPrice18Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="MntryVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}AmountAndDirection107"/>
 *         <element name="Pctg" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}PercentageRate"/>
 *         <element name="Dcml" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}BaseOneRate"/>
 *         <element name="BsisPts" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}DecimalNumber"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPrice18Choice", propOrder = {
    "mntryVal",
    "pctg",
    "dcml",
    "bsisPts"
})
public class SecuritiesTransactionPrice18Choice {

    @XmlElement(name = "MntryVal")
    protected AmountAndDirection107 mntryVal;
    @XmlElement(name = "Pctg")
    protected BigDecimal pctg;
    @XmlElement(name = "Dcml")
    protected BigDecimal dcml;
    @XmlElement(name = "BsisPts")
    protected BigDecimal bsisPts;

    /**
     * Gets the value of the mntryVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection107 }
     *     
     */
    public AmountAndDirection107 getMntryVal() {
        return mntryVal;
    }

    /**
     * Sets the value of the mntryVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection107 }
     *     
     */
    public void setMntryVal(AmountAndDirection107 value) {
        this.mntryVal = value;
    }

    /**
     * Gets the value of the pctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctg() {
        return pctg;
    }

    /**
     * Sets the value of the pctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctg(BigDecimal value) {
        this.pctg = value;
    }

    /**
     * Gets the value of the dcml property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDcml() {
        return dcml;
    }

    /**
     * Sets the value of the dcml property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDcml(BigDecimal value) {
        this.dcml = value;
    }

    /**
     * Gets the value of the bsisPts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBsisPts() {
        return bsisPts;
    }

    /**
     * Sets the value of the bsisPts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBsisPts(BigDecimal value) {
        this.bsisPts = value;
    }

}
