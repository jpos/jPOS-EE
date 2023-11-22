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

package org.jpos.iso20022.auth_090_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarginCollateralReport4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MarginCollateralReport4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CollPrtflCd" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}CollateralPortfolioCode5Choice"/>
 *         <element name="CollstnCtgy" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}CollateralisationType3Code"/>
 *         <element name="TmStmp" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ISODateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginCollateralReport4", propOrder = {
    "collPrtflCd",
    "collstnCtgy",
    "tmStmp"
})
public class MarginCollateralReport4 {

    @XmlElement(name = "CollPrtflCd", required = true)
    protected CollateralPortfolioCode5Choice collPrtflCd;
    @XmlElement(name = "CollstnCtgy", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralisationType3Code collstnCtgy;
    @XmlElement(name = "TmStmp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tmStmp;

    /**
     * Gets the value of the collPrtflCd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralPortfolioCode5Choice }
     *     
     */
    public CollateralPortfolioCode5Choice getCollPrtflCd() {
        return collPrtflCd;
    }

    /**
     * Sets the value of the collPrtflCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralPortfolioCode5Choice }
     *     
     */
    public void setCollPrtflCd(CollateralPortfolioCode5Choice value) {
        this.collPrtflCd = value;
    }

    /**
     * Gets the value of the collstnCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralisationType3Code }
     *     
     */
    public CollateralisationType3Code getCollstnCtgy() {
        return collstnCtgy;
    }

    /**
     * Sets the value of the collstnCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralisationType3Code }
     *     
     */
    public void setCollstnCtgy(CollateralisationType3Code value) {
        this.collstnCtgy = value;
    }

    /**
     * Gets the value of the tmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTmStmp() {
        return tmStmp;
    }

    /**
     * Sets the value of the tmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTmStmp(XMLGregorianCalendar value) {
        this.tmStmp = value;
    }

}
