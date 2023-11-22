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

package org.jpos.iso20022.caad_009_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Credentials2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Credentials2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IdCd" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Identification3Code"/>
 *         <element name="OthrIdCd" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="IdVal" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max70Text"/>
 *         <element name="IdXpryDt" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}ISOYearMonth" minOccurs="0"/>
 *         <element name="AssgnrAuthrty" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Authority1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Credentials2", propOrder = {
    "idCd",
    "othrIdCd",
    "idVal",
    "idXpryDt",
    "assgnrAuthrty"
})
public class Credentials2 {

    @XmlElement(name = "IdCd", required = true)
    @XmlSchemaType(name = "string")
    protected Identification3Code idCd;
    @XmlElement(name = "OthrIdCd")
    protected String othrIdCd;
    @XmlElement(name = "IdVal", required = true)
    protected String idVal;
    @XmlElement(name = "IdXpryDt")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar idXpryDt;
    @XmlElement(name = "AssgnrAuthrty")
    protected Authority1 assgnrAuthrty;

    /**
     * Gets the value of the idCd property.
     * 
     * @return
     *     possible object is
     *     {@link Identification3Code }
     *     
     */
    public Identification3Code getIdCd() {
        return idCd;
    }

    /**
     * Sets the value of the idCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification3Code }
     *     
     */
    public void setIdCd(Identification3Code value) {
        this.idCd = value;
    }

    /**
     * Gets the value of the othrIdCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrIdCd() {
        return othrIdCd;
    }

    /**
     * Sets the value of the othrIdCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrIdCd(String value) {
        this.othrIdCd = value;
    }

    /**
     * Gets the value of the idVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdVal() {
        return idVal;
    }

    /**
     * Sets the value of the idVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdVal(String value) {
        this.idVal = value;
    }

    /**
     * Gets the value of the idXpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIdXpryDt() {
        return idXpryDt;
    }

    /**
     * Sets the value of the idXpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIdXpryDt(XMLGregorianCalendar value) {
        this.idXpryDt = value;
    }

    /**
     * Gets the value of the assgnrAuthrty property.
     * 
     * @return
     *     possible object is
     *     {@link Authority1 }
     *     
     */
    public Authority1 getAssgnrAuthrty() {
        return assgnrAuthrty;
    }

    /**
     * Sets the value of the assgnrAuthrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authority1 }
     *     
     */
    public void setAssgnrAuthrty(Authority1 value) {
        this.assgnrAuthrty = value;
    }

}
