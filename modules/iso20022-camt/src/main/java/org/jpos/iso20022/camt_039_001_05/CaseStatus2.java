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

package org.jpos.iso20022.camt_039_001_05;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseStatus2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CaseStatus2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.039.001.05}ISODateTime"/>
 *         <element name="CaseSts" type="{urn:iso:std:iso:20022:tech:xsd:camt.039.001.05}CaseStatus2Code"/>
 *         <element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.039.001.05}Max140Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseStatus2", propOrder = {
    "dtTm",
    "caseSts",
    "rsn"
})
public class CaseStatus2 {

    @XmlElement(name = "DtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtTm;
    @XmlElement(name = "CaseSts", required = true)
    @XmlSchemaType(name = "string")
    protected CaseStatus2Code caseSts;
    @XmlElement(name = "Rsn")
    protected String rsn;

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtTm(XMLGregorianCalendar value) {
        this.dtTm = value;
    }

    /**
     * Gets the value of the caseSts property.
     * 
     * @return
     *     possible object is
     *     {@link CaseStatus2Code }
     *     
     */
    public CaseStatus2Code getCaseSts() {
        return caseSts;
    }

    /**
     * Sets the value of the caseSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseStatus2Code }
     *     
     */
    public void setCaseSts(CaseStatus2Code value) {
        this.caseSts = value;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsn(String value) {
        this.rsn = value;
    }

}
