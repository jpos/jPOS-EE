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
 * <p>Java class for JourneyInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="JourneyInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="JrnyTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}JourneyType1Code" minOccurs="0"/>
 *         <element name="JrnyData" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="DtAndTm" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}ISODateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyInformation1", propOrder = {
    "jrnyTp",
    "jrnyData",
    "dtAndTm"
})
public class JourneyInformation1 {

    @XmlElement(name = "JrnyTp")
    @XmlSchemaType(name = "string")
    protected JourneyType1Code jrnyTp;
    @XmlElement(name = "JrnyData")
    protected String jrnyData;
    @XmlElement(name = "DtAndTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtAndTm;

    /**
     * Gets the value of the jrnyTp property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyType1Code }
     *     
     */
    public JourneyType1Code getJrnyTp() {
        return jrnyTp;
    }

    /**
     * Sets the value of the jrnyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyType1Code }
     *     
     */
    public void setJrnyTp(JourneyType1Code value) {
        this.jrnyTp = value;
    }

    /**
     * Gets the value of the jrnyData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJrnyData() {
        return jrnyData;
    }

    /**
     * Sets the value of the jrnyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJrnyData(String value) {
        this.jrnyData = value;
    }

    /**
     * Gets the value of the dtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtAndTm() {
        return dtAndTm;
    }

    /**
     * Sets the value of the dtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtAndTm(XMLGregorianCalendar value) {
        this.dtAndTm = value;
    }

}
