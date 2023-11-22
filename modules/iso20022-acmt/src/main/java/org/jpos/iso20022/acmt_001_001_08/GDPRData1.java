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

package org.jpos.iso20022.acmt_001_001_08;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GDPRData1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GDPRData1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CnsntTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}GDPRDataConsent1Choice"/>
 *         <element name="CnsntInd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}YesNoIndicator"/>
 *         <element name="CnsntDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}ISODate"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GDPRData1", propOrder = {
    "cnsntTp",
    "cnsntInd",
    "cnsntDt"
})
public class GDPRData1 {

    @XmlElement(name = "CnsntTp", required = true)
    protected GDPRDataConsent1Choice cnsntTp;
    @XmlElement(name = "CnsntInd")
    protected boolean cnsntInd;
    @XmlElement(name = "CnsntDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cnsntDt;

    /**
     * Gets the value of the cnsntTp property.
     * 
     * @return
     *     possible object is
     *     {@link GDPRDataConsent1Choice }
     *     
     */
    public GDPRDataConsent1Choice getCnsntTp() {
        return cnsntTp;
    }

    /**
     * Sets the value of the cnsntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDPRDataConsent1Choice }
     *     
     */
    public void setCnsntTp(GDPRDataConsent1Choice value) {
        this.cnsntTp = value;
    }

    /**
     * Gets the value of the cnsntInd property.
     * 
     */
    public boolean isCnsntInd() {
        return cnsntInd;
    }

    /**
     * Sets the value of the cnsntInd property.
     * 
     */
    public void setCnsntInd(boolean value) {
        this.cnsntInd = value;
    }

    /**
     * Gets the value of the cnsntDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCnsntDt() {
        return cnsntDt;
    }

    /**
     * Sets the value of the cnsntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCnsntDt(XMLGregorianCalendar value) {
        this.cnsntDt = value;
    }

}
