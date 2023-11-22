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

package org.jpos.iso20022.sese_031_002_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Linkages66 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Linkages66">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrcgPos" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}ProcessingPosition18Choice" minOccurs="0"/>
 *         <element name="MsgNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}DocumentNumber16Choice" minOccurs="0"/>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}References76Choice"/>
 *         <element name="RefOwnr" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}PartyIdentification136Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Linkages66", propOrder = {
    "prcgPos",
    "msgNb",
    "ref",
    "refOwnr"
})
public class Linkages66 {

    @XmlElement(name = "PrcgPos")
    protected ProcessingPosition18Choice prcgPos;
    @XmlElement(name = "MsgNb")
    protected DocumentNumber16Choice msgNb;
    @XmlElement(name = "Ref", required = true)
    protected References76Choice ref;
    @XmlElement(name = "RefOwnr")
    protected PartyIdentification136Choice refOwnr;

    /**
     * Gets the value of the prcgPos property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition18Choice }
     *     
     */
    public ProcessingPosition18Choice getPrcgPos() {
        return prcgPos;
    }

    /**
     * Sets the value of the prcgPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition18Choice }
     *     
     */
    public void setPrcgPos(ProcessingPosition18Choice value) {
        this.prcgPos = value;
    }

    /**
     * Gets the value of the msgNb property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNumber16Choice }
     *     
     */
    public DocumentNumber16Choice getMsgNb() {
        return msgNb;
    }

    /**
     * Sets the value of the msgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNumber16Choice }
     *     
     */
    public void setMsgNb(DocumentNumber16Choice value) {
        this.msgNb = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References76Choice }
     *     
     */
    public References76Choice getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References76Choice }
     *     
     */
    public void setRef(References76Choice value) {
        this.ref = value;
    }

    /**
     * Gets the value of the refOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136Choice }
     *     
     */
    public PartyIdentification136Choice getRefOwnr() {
        return refOwnr;
    }

    /**
     * Sets the value of the refOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136Choice }
     *     
     */
    public void setRefOwnr(PartyIdentification136Choice value) {
        this.refOwnr = value;
    }

}
