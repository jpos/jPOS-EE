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

package org.jpos.iso20022.colr_004_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralBalance1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralBalance1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="TtlColl" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}ActiveCurrencyAndAmount"/>
 *         <element name="CollDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}Collateral1"/>
 *         <element name="SgrtdIndpdntAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}MarginCollateral1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralBalance1Choice", propOrder = {
    "ttlColl",
    "collDtls",
    "sgrtdIndpdntAmt"
})
public class CollateralBalance1Choice {

    @XmlElement(name = "TtlColl")
    protected ActiveCurrencyAndAmount ttlColl;
    @XmlElement(name = "CollDtls")
    protected Collateral1 collDtls;
    @XmlElement(name = "SgrtdIndpdntAmt")
    protected MarginCollateral1 sgrtdIndpdntAmt;

    /**
     * Gets the value of the ttlColl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlColl() {
        return ttlColl;
    }

    /**
     * Sets the value of the ttlColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlColl(ActiveCurrencyAndAmount value) {
        this.ttlColl = value;
    }

    /**
     * Gets the value of the collDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral1 }
     *     
     */
    public Collateral1 getCollDtls() {
        return collDtls;
    }

    /**
     * Sets the value of the collDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral1 }
     *     
     */
    public void setCollDtls(Collateral1 value) {
        this.collDtls = value;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCollateral1 }
     *     
     */
    public MarginCollateral1 getSgrtdIndpdntAmt() {
        return sgrtdIndpdntAmt;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCollateral1 }
     *     
     */
    public void setSgrtdIndpdntAmt(MarginCollateral1 value) {
        this.sgrtdIndpdntAmt = value;
    }

}
