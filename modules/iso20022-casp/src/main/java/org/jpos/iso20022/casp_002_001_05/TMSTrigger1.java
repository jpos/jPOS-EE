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

package org.jpos.iso20022.casp_002_001_05;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TMSTrigger1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TMSTrigger1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TMSCtctLvl" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}TMSContactLevel1Code"/>
 *         <element name="TMSId" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}Max35Text" minOccurs="0"/>
 *         <element name="TMSCtctDtTm" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}ISODateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMSTrigger1", propOrder = {
    "tmsCtctLvl",
    "tmsId",
    "tmsCtctDtTm"
})
public class TMSTrigger1 {

    @XmlElement(name = "TMSCtctLvl", required = true)
    @XmlSchemaType(name = "string")
    protected TMSContactLevel1Code tmsCtctLvl;
    @XmlElement(name = "TMSId")
    protected String tmsId;
    @XmlElement(name = "TMSCtctDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tmsCtctDtTm;

    /**
     * Gets the value of the tmsCtctLvl property.
     * 
     * @return
     *     possible object is
     *     {@link TMSContactLevel1Code }
     *     
     */
    public TMSContactLevel1Code getTMSCtctLvl() {
        return tmsCtctLvl;
    }

    /**
     * Sets the value of the tmsCtctLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSContactLevel1Code }
     *     
     */
    public void setTMSCtctLvl(TMSContactLevel1Code value) {
        this.tmsCtctLvl = value;
    }

    /**
     * Gets the value of the tmsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMSId() {
        return tmsId;
    }

    /**
     * Sets the value of the tmsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMSId(String value) {
        this.tmsId = value;
    }

    /**
     * Gets the value of the tmsCtctDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTMSCtctDtTm() {
        return tmsCtctDtTm;
    }

    /**
     * Sets the value of the tmsCtctDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTMSCtctDtTm(XMLGregorianCalendar value) {
        this.tmsCtctDtTm = value;
    }

}
