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

package org.jpos.iso20022.auth_033_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquityDerivative3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EquityDerivative3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Bskt" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}UnderlyingEquityType3Code"/>
 *         <element name="Indx" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}UnderlyingEquityType4Code"/>
 *         <element name="SnglNm" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}UnderlyingEquityType5Code"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}UnderlyingEquityType6Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquityDerivative3Choice", propOrder = {
    "bskt",
    "indx",
    "snglNm",
    "othr"
})
public class EquityDerivative3Choice {

    @XmlElement(name = "Bskt")
    @XmlSchemaType(name = "string")
    protected UnderlyingEquityType3Code bskt;
    @XmlElement(name = "Indx")
    @XmlSchemaType(name = "string")
    protected UnderlyingEquityType4Code indx;
    @XmlElement(name = "SnglNm")
    @XmlSchemaType(name = "string")
    protected UnderlyingEquityType5Code snglNm;
    @XmlElement(name = "Othr")
    @XmlSchemaType(name = "string")
    protected UnderlyingEquityType6Code othr;

    /**
     * Gets the value of the bskt property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingEquityType3Code }
     *     
     */
    public UnderlyingEquityType3Code getBskt() {
        return bskt;
    }

    /**
     * Sets the value of the bskt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingEquityType3Code }
     *     
     */
    public void setBskt(UnderlyingEquityType3Code value) {
        this.bskt = value;
    }

    /**
     * Gets the value of the indx property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingEquityType4Code }
     *     
     */
    public UnderlyingEquityType4Code getIndx() {
        return indx;
    }

    /**
     * Sets the value of the indx property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingEquityType4Code }
     *     
     */
    public void setIndx(UnderlyingEquityType4Code value) {
        this.indx = value;
    }

    /**
     * Gets the value of the snglNm property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingEquityType5Code }
     *     
     */
    public UnderlyingEquityType5Code getSnglNm() {
        return snglNm;
    }

    /**
     * Sets the value of the snglNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingEquityType5Code }
     *     
     */
    public void setSnglNm(UnderlyingEquityType5Code value) {
        this.snglNm = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingEquityType6Code }
     *     
     */
    public UnderlyingEquityType6Code getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingEquityType6Code }
     *     
     */
    public void setOthr(UnderlyingEquityType6Code value) {
        this.othr = value;
    }

}
