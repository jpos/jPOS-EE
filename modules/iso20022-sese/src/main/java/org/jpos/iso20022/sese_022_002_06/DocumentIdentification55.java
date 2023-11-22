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

package org.jpos.iso20022.sese_022_002_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentIdentification55 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DocumentIdentification55">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.022.002.06}DocumentNumber6Choice" minOccurs="0"/>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:sese.022.002.06}Max35Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentIdentification55", propOrder = {
    "msgNb",
    "ref"
})
public class DocumentIdentification55 {

    @XmlElement(name = "MsgNb")
    protected DocumentNumber6Choice msgNb;
    @XmlElement(name = "Ref", required = true)
    protected String ref;

    /**
     * Gets the value of the msgNb property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNumber6Choice }
     *     
     */
    public DocumentNumber6Choice getMsgNb() {
        return msgNb;
    }

    /**
     * Sets the value of the msgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNumber6Choice }
     *     
     */
    public void setMsgNb(DocumentNumber6Choice value) {
        this.msgNb = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

}
