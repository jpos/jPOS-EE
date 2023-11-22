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

package org.jpos.iso20022.setr_016_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelledReason12Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CancelledReason12Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}CancelledStatusReason2Code"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}GenericIdentification1"/>
 *         <element name="NoSpcfdRsn" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}NoReasonCode"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelledReason12Choice", propOrder = {
    "cd",
    "prtry",
    "noSpcfdRsn"
})
public class CancelledReason12Choice {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected CancelledStatusReason2Code cd;
    @XmlElement(name = "Prtry")
    protected GenericIdentification1 prtry;
    @XmlElement(name = "NoSpcfdRsn")
    @XmlSchemaType(name = "string")
    protected NoReasonCode noSpcfdRsn;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatusReason2Code }
     *     
     */
    public CancelledStatusReason2Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatusReason2Code }
     *     
     */
    public void setCd(CancelledStatusReason2Code value) {
        this.cd = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public void setPrtry(GenericIdentification1 value) {
        this.prtry = value;
    }

    /**
     * Gets the value of the noSpcfdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getNoSpcfdRsn() {
        return noSpcfdRsn;
    }

    /**
     * Sets the value of the noSpcfdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public void setNoSpcfdRsn(NoReasonCode value) {
        this.noSpcfdRsn = value;
    }

}
