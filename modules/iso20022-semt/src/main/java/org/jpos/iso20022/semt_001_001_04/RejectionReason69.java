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

package org.jpos.iso20022.semt_001_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason69 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RejectionReason69">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Rsn" type="{urn:swift:xsd:semt.001.001.04}MessageRejectedReason2Code"/>
 *         <element name="AddtlInf" type="{urn:swift:xsd:semt.001.001.04}Max350Text" minOccurs="0"/>
 *         <element name="LkdMsg" type="{urn:swift:xsd:semt.001.001.04}LinkedMessage6Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectionReason69", propOrder = {
    "rsn",
    "addtlInf",
    "lkdMsg"
})
public class RejectionReason69 {

    @XmlElement(name = "Rsn", required = true)
    @XmlSchemaType(name = "string")
    protected MessageRejectedReason2Code rsn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "LkdMsg")
    protected LinkedMessage6Choice lkdMsg;

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link MessageRejectedReason2Code }
     *     
     */
    public MessageRejectedReason2Code getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageRejectedReason2Code }
     *     
     */
    public void setRsn(MessageRejectedReason2Code value) {
        this.rsn = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

    /**
     * Gets the value of the lkdMsg property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedMessage6Choice }
     *     
     */
    public LinkedMessage6Choice getLkdMsg() {
        return lkdMsg;
    }

    /**
     * Sets the value of the lkdMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedMessage6Choice }
     *     
     */
    public void setLkdMsg(LinkedMessage6Choice value) {
        this.lkdMsg = value;
    }

}
