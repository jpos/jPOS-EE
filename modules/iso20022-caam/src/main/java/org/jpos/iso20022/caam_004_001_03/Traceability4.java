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

package org.jpos.iso20022.caam_004_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Traceability4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Traceability4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RlayId" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}GenericIdentification77"/>
 *         <element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}Max35Text" minOccurs="0"/>
 *         <element name="TracDtTmIn" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}ISODateTime"/>
 *         <element name="TracDtTmOut" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}ISODateTime"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Traceability4", propOrder = {
    "rlayId",
    "seqNb",
    "tracDtTmIn",
    "tracDtTmOut"
})
public class Traceability4 {

    @XmlElement(name = "RlayId", required = true)
    protected GenericIdentification77 rlayId;
    @XmlElement(name = "SeqNb")
    protected String seqNb;
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
     *     {@link GenericIdentification77 }
     *     
     */
    public GenericIdentification77 getRlayId() {
        return rlayId;
    }

    /**
     * Sets the value of the rlayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification77 }
     *     
     */
    public void setRlayId(GenericIdentification77 value) {
        this.rlayId = value;
    }

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqNb(String value) {
        this.seqNb = value;
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
