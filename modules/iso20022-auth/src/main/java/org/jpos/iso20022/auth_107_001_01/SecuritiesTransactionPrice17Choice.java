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

package org.jpos.iso20022.auth_107_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTransactionPrice17Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesTransactionPrice17Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="MntryVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}AmountAndDirection106"/>
 *         <element name="Unit" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}LongFraction19DecimalNumber"/>
 *         <element name="Pctg" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}PercentageRate"/>
 *         <element name="Yld" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}PercentageRate"/>
 *         <element name="Dcml" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}BaseOneRate"/>
 *         <element name="PdgPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}PriceStatus1Code"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}SecuritiesTransactionPrice5"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPrice17Choice", propOrder = {
    "mntryVal",
    "unit",
    "pctg",
    "yld",
    "dcml",
    "pdgPric",
    "othr"
})
public class SecuritiesTransactionPrice17Choice {

    @XmlElement(name = "MntryVal")
    protected AmountAndDirection106 mntryVal;
    @XmlElement(name = "Unit")
    protected BigDecimal unit;
    @XmlElement(name = "Pctg")
    protected BigDecimal pctg;
    @XmlElement(name = "Yld")
    protected BigDecimal yld;
    @XmlElement(name = "Dcml")
    protected BigDecimal dcml;
    @XmlElement(name = "PdgPric")
    @XmlSchemaType(name = "string")
    protected PriceStatus1Code pdgPric;
    @XmlElement(name = "Othr")
    protected SecuritiesTransactionPrice5 othr;

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
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnit(BigDecimal value) {
        this.unit = value;
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
     * Gets the value of the yld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYld() {
        return yld;
    }

    /**
     * Sets the value of the yld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYld(BigDecimal value) {
        this.yld = value;
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
     * Gets the value of the pdgPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceStatus1Code }
     *     
     */
    public PriceStatus1Code getPdgPric() {
        return pdgPric;
    }

    /**
     * Sets the value of the pdgPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceStatus1Code }
     *     
     */
    public void setPdgPric(PriceStatus1Code value) {
        this.pdgPric = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice5 }
     *     
     */
    public SecuritiesTransactionPrice5 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice5 }
     *     
     */
    public void setOthr(SecuritiesTransactionPrice5 value) {
        this.othr = value;
    }

}
