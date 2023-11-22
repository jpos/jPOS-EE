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

package org.jpos.iso20022.catm_001_001_12;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Traceability8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Traceability8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RlayId" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}GenericIdentification177"/>
 *         <element name="PrtcolNm" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}Max35Text" minOccurs="0"/>
 *         <element name="PrtcolVrsn" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}Max6Text" minOccurs="0"/>
 *         <element name="TracDtTmIn" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}ISODateTime"/>
 *         <element name="TracDtTmOut" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}ISODateTime"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Traceability8", propOrder = {
    "rlayId",
    "prtcolNm",
    "prtcolVrsn",
    "tracDtTmIn",
    "tracDtTmOut"
})
public class Traceability8 {

    @XmlElement(name = "RlayId", required = true)
    protected GenericIdentification177 rlayId;
    @XmlElement(name = "PrtcolNm")
    protected String prtcolNm;
    @XmlElement(name = "PrtcolVrsn")
    protected String prtcolVrsn;
    @XmlElement(name = "TracDtTmIn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tracDtTmIn;
    @XmlElement(name = "TracDtTmOut", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tracDtTmOut;

    /**
     * Gets the value of the rlayId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification177 }
     *     
     */
    public GenericIdentification177 getRlayId() {
        return rlayId;
    }

    /**
     * Sets the value of the rlayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification177 }
     *     
     */
    public void setRlayId(GenericIdentification177 value) {
        this.rlayId = value;
    }

    /**
     * Gets the value of the prtcolNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtcolNm() {
        return prtcolNm;
    }

    /**
     * Sets the value of the prtcolNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtcolNm(String value) {
        this.prtcolNm = value;
    }

    /**
     * Gets the value of the prtcolVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtcolVrsn() {
        return prtcolVrsn;
    }

    /**
     * Sets the value of the prtcolVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtcolVrsn(String value) {
        this.prtcolVrsn = value;
    }

    /**
     * Gets the value of the tracDtTmIn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTracDtTmIn() {
        return tracDtTmIn;
    }

    /**
     * Sets the value of the tracDtTmIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTracDtTmIn(XMLGregorianCalendar value) {
        this.tracDtTmIn = value;
    }

    /**
     * Gets the value of the tracDtTmOut property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTracDtTmOut() {
        return tracDtTmOut;
    }

    /**
     * Sets the value of the tracDtTmOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTracDtTmOut(XMLGregorianCalendar value) {
        this.tracDtTmOut = value;
    }

}
