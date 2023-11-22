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

package org.jpos.iso20022.auth_100_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementFailsDailyTransactionType3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementFailsDailyTransactionType3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctiesBuyOrSell" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementFailsDailyCSD1Choice"/>
 *         <element name="CollMgmtOpr" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementFailsDailyCSD1Choice"/>
 *         <element name="SctiesLndgOrBrrwg" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementFailsDailyCSD1Choice"/>
 *         <element name="RpAgrmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementFailsDailyCSD1Choice"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementFailsDailyCSD1Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsDailyTransactionType3", propOrder = {
    "sctiesBuyOrSell",
    "collMgmtOpr",
    "sctiesLndgOrBrrwg",
    "rpAgrmt",
    "othr"
})
public class SettlementFailsDailyTransactionType3 {

    @XmlElement(name = "SctiesBuyOrSell", required = true)
    protected SettlementFailsDailyCSD1Choice sctiesBuyOrSell;
    @XmlElement(name = "CollMgmtOpr", required = true)
    protected SettlementFailsDailyCSD1Choice collMgmtOpr;
    @XmlElement(name = "SctiesLndgOrBrrwg", required = true)
    protected SettlementFailsDailyCSD1Choice sctiesLndgOrBrrwg;
    @XmlElement(name = "RpAgrmt", required = true)
    protected SettlementFailsDailyCSD1Choice rpAgrmt;
    @XmlElement(name = "Othr", required = true)
    protected SettlementFailsDailyCSD1Choice othr;

    /**
     * Gets the value of the sctiesBuyOrSell property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDailyCSD1Choice }
     *     
     */
    public SettlementFailsDailyCSD1Choice getSctiesBuyOrSell() {
        return sctiesBuyOrSell;
    }

    /**
     * Sets the value of the sctiesBuyOrSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDailyCSD1Choice }
     *     
     */
    public void setSctiesBuyOrSell(SettlementFailsDailyCSD1Choice value) {
        this.sctiesBuyOrSell = value;
    }

    /**
     * Gets the value of the collMgmtOpr property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDailyCSD1Choice }
     *     
     */
    public SettlementFailsDailyCSD1Choice getCollMgmtOpr() {
        return collMgmtOpr;
    }

    /**
     * Sets the value of the collMgmtOpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDailyCSD1Choice }
     *     
     */
    public void setCollMgmtOpr(SettlementFailsDailyCSD1Choice value) {
        this.collMgmtOpr = value;
    }

    /**
     * Gets the value of the sctiesLndgOrBrrwg property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDailyCSD1Choice }
     *     
     */
    public SettlementFailsDailyCSD1Choice getSctiesLndgOrBrrwg() {
        return sctiesLndgOrBrrwg;
    }

    /**
     * Sets the value of the sctiesLndgOrBrrwg property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDailyCSD1Choice }
     *     
     */
    public void setSctiesLndgOrBrrwg(SettlementFailsDailyCSD1Choice value) {
        this.sctiesLndgOrBrrwg = value;
    }

    /**
     * Gets the value of the rpAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDailyCSD1Choice }
     *     
     */
    public SettlementFailsDailyCSD1Choice getRpAgrmt() {
        return rpAgrmt;
    }

    /**
     * Sets the value of the rpAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDailyCSD1Choice }
     *     
     */
    public void setRpAgrmt(SettlementFailsDailyCSD1Choice value) {
        this.rpAgrmt = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDailyCSD1Choice }
     *     
     */
    public SettlementFailsDailyCSD1Choice getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDailyCSD1Choice }
     *     
     */
    public void setOthr(SettlementFailsDailyCSD1Choice value) {
        this.othr = value;
    }

}
