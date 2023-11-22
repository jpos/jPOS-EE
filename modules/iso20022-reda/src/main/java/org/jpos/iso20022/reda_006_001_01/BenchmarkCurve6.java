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

package org.jpos.iso20022.reda_006_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BenchmarkCurve6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BenchmarkCurve6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Sprd" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}DecimalNumber" minOccurs="0"/>
 *         <element name="BchmkId" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}SecurityIdentification39" minOccurs="0"/>
 *         <element name="BchmkPric" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Price8" minOccurs="0"/>
 *         <element name="BchmkCrvCcy" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="BchmkCrvNm" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}BenchmarkCurveName7Choice" minOccurs="0"/>
 *         <element name="BchmkCrvPt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Max256Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenchmarkCurve6", propOrder = {
    "sprd",
    "bchmkId",
    "bchmkPric",
    "bchmkCrvCcy",
    "bchmkCrvNm",
    "bchmkCrvPt"
})
public class BenchmarkCurve6 {

    @XmlElement(name = "Sprd")
    protected BigDecimal sprd;
    @XmlElement(name = "BchmkId")
    protected SecurityIdentification39 bchmkId;
    @XmlElement(name = "BchmkPric")
    protected Price8 bchmkPric;
    @XmlElement(name = "BchmkCrvCcy")
    protected String bchmkCrvCcy;
    @XmlElement(name = "BchmkCrvNm")
    protected BenchmarkCurveName7Choice bchmkCrvNm;
    @XmlElement(name = "BchmkCrvPt")
    protected String bchmkCrvPt;

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSprd(BigDecimal value) {
        this.sprd = value;
    }

    /**
     * Gets the value of the bchmkId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public SecurityIdentification39 getBchmkId() {
        return bchmkId;
    }

    /**
     * Sets the value of the bchmkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public void setBchmkId(SecurityIdentification39 value) {
        this.bchmkId = value;
    }

    /**
     * Gets the value of the bchmkPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price8 }
     *     
     */
    public Price8 getBchmkPric() {
        return bchmkPric;
    }

    /**
     * Sets the value of the bchmkPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price8 }
     *     
     */
    public void setBchmkPric(Price8 value) {
        this.bchmkPric = value;
    }

    /**
     * Gets the value of the bchmkCrvCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBchmkCrvCcy() {
        return bchmkCrvCcy;
    }

    /**
     * Sets the value of the bchmkCrvCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBchmkCrvCcy(String value) {
        this.bchmkCrvCcy = value;
    }

    /**
     * Gets the value of the bchmkCrvNm property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurveName7Choice }
     *     
     */
    public BenchmarkCurveName7Choice getBchmkCrvNm() {
        return bchmkCrvNm;
    }

    /**
     * Sets the value of the bchmkCrvNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurveName7Choice }
     *     
     */
    public void setBchmkCrvNm(BenchmarkCurveName7Choice value) {
        this.bchmkCrvNm = value;
    }

    /**
     * Gets the value of the bchmkCrvPt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBchmkCrvPt() {
        return bchmkCrvPt;
    }

    /**
     * Sets the value of the bchmkCrvPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBchmkCrvPt(String value) {
        this.bchmkCrvPt = value;
    }

}
