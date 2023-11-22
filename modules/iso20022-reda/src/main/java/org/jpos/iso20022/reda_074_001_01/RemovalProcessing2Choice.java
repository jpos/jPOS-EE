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

package org.jpos.iso20022.reda_074_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemovalProcessing2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RemovalProcessing2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}SecurityIdentification19"/>
 *         <element name="IndxId" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}GenericIdentification37"/>
 *         <element name="IssrCtry" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}CountryCode"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemovalProcessing2Choice", propOrder = {
    "finInstrmId",
    "indxId",
    "issrCtry"
})
public class RemovalProcessing2Choice {

    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "IndxId")
    protected GenericIdentification37 indxId;
    @XmlElement(name = "IssrCtry")
    protected String issrCtry;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the indxId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification37 }
     *     
     */
    public GenericIdentification37 getIndxId() {
        return indxId;
    }

    /**
     * Sets the value of the indxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification37 }
     *     
     */
    public void setIndxId(GenericIdentification37 value) {
        this.indxId = value;
    }

    /**
     * Gets the value of the issrCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrCtry() {
        return issrCtry;
    }

    /**
     * Sets the value of the issrCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssrCtry(String value) {
        this.issrCtry = value;
    }

}
