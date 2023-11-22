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

package org.jpos.iso20022.auth_012_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralValuation7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralValuation7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PoolSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.012.001.02}CollateralPool1Code"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:auth.012.001.02}CFIOct2015Identifier"/>
 *         <element name="Sctr" type="{urn:iso:std:iso:20022:tech:xsd:auth.012.001.02}SNA2008SectorIdentifier"/>
 *         <element name="NmnlAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.012.001.02}ActiveCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValuation7", propOrder = {
    "poolSts",
    "tp",
    "sctr",
    "nmnlAmt"
})
public class CollateralValuation7 {

    @XmlElement(name = "PoolSts", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralPool1Code poolSts;
    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "Sctr", required = true)
    protected String sctr;
    @XmlElement(name = "NmnlAmt")
    protected ActiveCurrencyAndAmount nmnlAmt;

    /**
     * Gets the value of the poolSts property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralPool1Code }
     *     
     */
    public CollateralPool1Code getPoolSts() {
        return poolSts;
    }

    /**
     * Sets the value of the poolSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralPool1Code }
     *     
     */
    public void setPoolSts(CollateralPool1Code value) {
        this.poolSts = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * Gets the value of the sctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctr() {
        return sctr;
    }

    /**
     * Sets the value of the sctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctr(String value) {
        this.sctr = value;
    }

    /**
     * Gets the value of the nmnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNmnlAmt() {
        return nmnlAmt;
    }

    /**
     * Sets the value of the nmnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setNmnlAmt(ActiveCurrencyAndAmount value) {
        this.nmnlAmt = value;
    }

}
