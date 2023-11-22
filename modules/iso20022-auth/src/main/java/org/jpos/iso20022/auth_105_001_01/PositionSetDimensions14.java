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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionSetDimensions14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PositionSetDimensions14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrPtyData" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}CounterpartyData86" minOccurs="0"/>
 *         <element name="LnData" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}LoanData134" minOccurs="0"/>
 *         <element name="CollData" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}CollateralData33" minOccurs="0"/>
 *         <element name="OtlrsIncl" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetDimensions14", propOrder = {
    "ctrPtyData",
    "lnData",
    "collData",
    "otlrsIncl"
})
public class PositionSetDimensions14 {

    @XmlElement(name = "CtrPtyData")
    protected CounterpartyData86 ctrPtyData;
    @XmlElement(name = "LnData")
    protected LoanData134 lnData;
    @XmlElement(name = "CollData")
    protected CollateralData33 collData;
    @XmlElement(name = "OtlrsIncl")
    protected Boolean otlrsIncl;

    /**
     * Gets the value of the ctrPtyData property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyData86 }
     *     
     */
    public CounterpartyData86 getCtrPtyData() {
        return ctrPtyData;
    }

    /**
     * Sets the value of the ctrPtyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyData86 }
     *     
     */
    public void setCtrPtyData(CounterpartyData86 value) {
        this.ctrPtyData = value;
    }

    /**
     * Gets the value of the lnData property.
     * 
     * @return
     *     possible object is
     *     {@link LoanData134 }
     *     
     */
    public LoanData134 getLnData() {
        return lnData;
    }

    /**
     * Sets the value of the lnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanData134 }
     *     
     */
    public void setLnData(LoanData134 value) {
        this.lnData = value;
    }

    /**
     * Gets the value of the collData property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralData33 }
     *     
     */
    public CollateralData33 getCollData() {
        return collData;
    }

    /**
     * Sets the value of the collData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralData33 }
     *     
     */
    public void setCollData(CollateralData33 value) {
        this.collData = value;
    }

    /**
     * Gets the value of the otlrsIncl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOtlrsIncl() {
        return otlrsIncl;
    }

    /**
     * Sets the value of the otlrsIncl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtlrsIncl(Boolean value) {
        this.otlrsIncl = value;
    }

}
