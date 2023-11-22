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

package org.jpos.iso20022.tsmt_004_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UTCOffset1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UTCOffset1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Sgn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.004.001.02}PlusOrMinusIndicator"/>
 *         <element name="NbOfHrs" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.004.001.02}ISOTime"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UTCOffset1", propOrder = {
    "sgn",
    "nbOfHrs"
})
public class UTCOffset1 {

    @XmlElement(name = "Sgn")
    protected boolean sgn;
    @XmlElement(name = "NbOfHrs", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar nbOfHrs;

    /**
     * Gets the value of the sgn property.
     * 
     */
    public boolean isSgn() {
        return sgn;
    }

    /**
     * Sets the value of the sgn property.
     * 
     */
    public void setSgn(boolean value) {
        this.sgn = value;
    }

    /**
     * Gets the value of the nbOfHrs property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNbOfHrs() {
        return nbOfHrs;
    }

    /**
     * Sets the value of the nbOfHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNbOfHrs(XMLGregorianCalendar value) {
        this.nbOfHrs = value;
    }

}
