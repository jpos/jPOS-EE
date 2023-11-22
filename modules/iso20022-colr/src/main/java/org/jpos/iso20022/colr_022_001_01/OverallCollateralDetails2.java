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

package org.jpos.iso20022.colr_022_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverallCollateralDetails2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OverallCollateralDetails2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ValtnAmts" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}CollateralAmount15"/>
 *         <element name="MrgnRate" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="GblCollSts" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}CollateralStatus1Code" minOccurs="0"/>
 *         <element name="ValtnDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}DateAndDateTime2Choice"/>
 *         <element name="CollAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverallCollateralDetails2", propOrder = {
    "valtnAmts",
    "mrgnRate",
    "gblCollSts",
    "valtnDt",
    "collAddtlDtls"
})
public class OverallCollateralDetails2 {

    @XmlElement(name = "ValtnAmts", required = true)
    protected CollateralAmount15 valtnAmts;
    @XmlElement(name = "MrgnRate")
    protected BigDecimal mrgnRate;
    @XmlElement(name = "GblCollSts")
    @XmlSchemaType(name = "string")
    protected CollateralStatus1Code gblCollSts;
    @XmlElement(name = "ValtnDt", required = true)
    protected DateAndDateTime2Choice valtnDt;
    @XmlElement(name = "CollAddtlDtls")
    protected String collAddtlDtls;

    /**
     * Gets the value of the valtnAmts property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAmount15 }
     *     
     */
    public CollateralAmount15 getValtnAmts() {
        return valtnAmts;
    }

    /**
     * Sets the value of the valtnAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAmount15 }
     *     
     */
    public void setValtnAmts(CollateralAmount15 value) {
        this.valtnAmts = value;
    }

    /**
     * Gets the value of the mrgnRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMrgnRate() {
        return mrgnRate;
    }

    /**
     * Sets the value of the mrgnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMrgnRate(BigDecimal value) {
        this.mrgnRate = value;
    }

    /**
     * Gets the value of the gblCollSts property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralStatus1Code }
     *     
     */
    public CollateralStatus1Code getGblCollSts() {
        return gblCollSts;
    }

    /**
     * Sets the value of the gblCollSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralStatus1Code }
     *     
     */
    public void setGblCollSts(CollateralStatus1Code value) {
        this.gblCollSts = value;
    }

    /**
     * Gets the value of the valtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getValtnDt() {
        return valtnDt;
    }

    /**
     * Sets the value of the valtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setValtnDt(DateAndDateTime2Choice value) {
        this.valtnDt = value;
    }

    /**
     * Gets the value of the collAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollAddtlDtls() {
        return collAddtlDtls;
    }

    /**
     * Sets the value of the collAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollAddtlDtls(String value) {
        this.collAddtlDtls = value;
    }

}
