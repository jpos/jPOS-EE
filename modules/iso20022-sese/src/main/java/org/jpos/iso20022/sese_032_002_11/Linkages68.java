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

package org.jpos.iso20022.sese_032_002_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Linkages68 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Linkages68">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrcgPos" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.002.11}ProcessingPosition10Choice" minOccurs="0"/>
 *         <element name="MsgNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.002.11}DocumentNumber6Choice" minOccurs="0"/>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.002.11}References78Choice"/>
 *         <element name="LkdQty" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.002.11}PairedOrTurnedQuantity6Choice" minOccurs="0"/>
 *         <element name="RefOwnr" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.002.11}PartyIdentification136Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Linkages68", propOrder = {
    "prcgPos",
    "msgNb",
    "ref",
    "lkdQty",
    "refOwnr"
})
public class Linkages68 {

    @XmlElement(name = "PrcgPos")
    protected ProcessingPosition10Choice prcgPos;
    @XmlElement(name = "MsgNb")
    protected DocumentNumber6Choice msgNb;
    @XmlElement(name = "Ref", required = true)
    protected References78Choice ref;
    @XmlElement(name = "LkdQty")
    protected PairedOrTurnedQuantity6Choice lkdQty;
    @XmlElement(name = "RefOwnr")
    protected PartyIdentification136Choice refOwnr;

    /**
     * Gets the value of the prcgPos property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition10Choice }
     *     
     */
    public ProcessingPosition10Choice getPrcgPos() {
        return prcgPos;
    }

    /**
     * Sets the value of the prcgPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition10Choice }
     *     
     */
    public void setPrcgPos(ProcessingPosition10Choice value) {
        this.prcgPos = value;
    }

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
     *     {@link References78Choice }
     *     
     */
    public References78Choice getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References78Choice }
     *     
     */
    public void setRef(References78Choice value) {
        this.ref = value;
    }

    /**
     * Gets the value of the lkdQty property.
     * 
     * @return
     *     possible object is
     *     {@link PairedOrTurnedQuantity6Choice }
     *     
     */
    public PairedOrTurnedQuantity6Choice getLkdQty() {
        return lkdQty;
    }

    /**
     * Sets the value of the lkdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PairedOrTurnedQuantity6Choice }
     *     
     */
    public void setLkdQty(PairedOrTurnedQuantity6Choice value) {
        this.lkdQty = value;
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
