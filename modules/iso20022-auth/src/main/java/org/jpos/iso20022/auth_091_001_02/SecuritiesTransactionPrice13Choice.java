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

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTransactionPrice13Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesTransactionPrice13Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="MntryVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}AmountAndDirection106"/>
 *         <element name="Pctg" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}PercentageRate"/>
 *         <element name="Dcml" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}BaseOneRate" minOccurs="0"/>
 *         <element name="BsisPtSprd" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}Number" minOccurs="0"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPrice13Choice", propOrder = {
    "mntryVal",
    "pctg",
    "dcml",
    "bsisPtSprd"
})
public class SecuritiesTransactionPrice13Choice {

    @XmlElement(name = "MntryVal")
    protected AmountAndDirection106 mntryVal;
    @XmlElement(name = "Pctg")
    protected BigDecimal pctg;
    @XmlElement(name = "Dcml")
    protected BigDecimal dcml;
    @XmlElement(name = "BsisPtSprd")
    protected BigDecimal bsisPtSprd;

    /**
     * Gets the value of the mntryVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection106 }
     *     
     */
    public AmountAndDirection106 getMntryVal() {
        return mntryVal;
    }

    /**
     * Sets the value of the mntryVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection106 }
     *     
     */
    public void setMntryVal(AmountAndDirection106 value) {
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
     * Gets the value of the bsisPtSprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBsisPtSprd() {
        return bsisPtSprd;
    }

    /**
     * Sets the value of the bsisPtSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBsisPtSprd(BigDecimal value) {
        this.bsisPtSprd = value;
    }

}
