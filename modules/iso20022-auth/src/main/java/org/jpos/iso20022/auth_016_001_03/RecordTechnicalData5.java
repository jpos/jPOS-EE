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

package org.jpos.iso20022.auth_016_001_03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordTechnicalData5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RecordTechnicalData5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RctDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}ISODateTime"/>
 *         <element name="XchgRsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}ExternalAuthorityExchangeReason1Code" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordTechnicalData5", propOrder = {
    "rctDtTm",
    "xchgRsn"
})
public class RecordTechnicalData5 {

    @XmlElement(name = "RctDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rctDtTm;
    @XmlElement(name = "XchgRsn", required = true)
    protected List<String> xchgRsn;

    /**
     * Gets the value of the rctDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRctDtTm() {
        return rctDtTm;
    }

    /**
     * Sets the value of the rctDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRctDtTm(XMLGregorianCalendar value) {
        this.rctDtTm = value;
    }

    /**
     * Gets the value of the xchgRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xchgRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXchgRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the xchgRsn property.
     */
    public List<String> getXchgRsn() {
        if (xchgRsn == null) {
            xchgRsn = new ArrayList<>();
        }
        return this.xchgRsn;
    }

}
