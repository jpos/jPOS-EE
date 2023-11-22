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

package org.jpos.iso20022.colr_019_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralParties10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralParties10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PtyA" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}PartyIdentificationAndAccount202"/>
 *         <element name="ClntPtyA" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}PartyIdentificationAndAccount202" minOccurs="0"/>
 *         <element name="PtyB" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}PartyIdentificationAndAccount203"/>
 *         <element name="ClntPtyB" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}PartyIdentificationAndAccount203" minOccurs="0"/>
 *         <element name="TrptyAgt" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}PartyIdentification136" minOccurs="0"/>
 *         <element name="CollAcct" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}SecuritiesAccount19" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralParties10", propOrder = {
    "ptyA",
    "clntPtyA",
    "ptyB",
    "clntPtyB",
    "trptyAgt",
    "collAcct"
})
public class CollateralParties10 {

    @XmlElement(name = "PtyA", required = true)
    protected PartyIdentificationAndAccount202 ptyA;
    @XmlElement(name = "ClntPtyA")
    protected PartyIdentificationAndAccount202 clntPtyA;
    @XmlElement(name = "PtyB", required = true)
    protected PartyIdentificationAndAccount203 ptyB;
    @XmlElement(name = "ClntPtyB")
    protected PartyIdentificationAndAccount203 clntPtyB;
    @XmlElement(name = "TrptyAgt")
    protected PartyIdentification136 trptyAgt;
    @XmlElement(name = "CollAcct")
    protected SecuritiesAccount19 collAcct;

    /**
     * Gets the value of the ptyA property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount202 }
     *     
     */
    public PartyIdentificationAndAccount202 getPtyA() {
        return ptyA;
    }

    /**
     * Sets the value of the ptyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount202 }
     *     
     */
    public void setPtyA(PartyIdentificationAndAccount202 value) {
        this.ptyA = value;
    }

    /**
     * Gets the value of the clntPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount202 }
     *     
     */
    public PartyIdentificationAndAccount202 getClntPtyA() {
        return clntPtyA;
    }

    /**
     * Sets the value of the clntPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount202 }
     *     
     */
    public void setClntPtyA(PartyIdentificationAndAccount202 value) {
        this.clntPtyA = value;
    }

    /**
     * Gets the value of the ptyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount203 }
     *     
     */
    public PartyIdentificationAndAccount203 getPtyB() {
        return ptyB;
    }

    /**
     * Sets the value of the ptyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount203 }
     *     
     */
    public void setPtyB(PartyIdentificationAndAccount203 value) {
        this.ptyB = value;
    }

    /**
     * Gets the value of the clntPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount203 }
     *     
     */
    public PartyIdentificationAndAccount203 getClntPtyB() {
        return clntPtyB;
    }

    /**
     * Sets the value of the clntPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount203 }
     *     
     */
    public void setClntPtyB(PartyIdentificationAndAccount203 value) {
        this.clntPtyB = value;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public void setTrptyAgt(PartyIdentification136 value) {
        this.trptyAgt = value;
    }

    /**
     * Gets the value of the collAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getCollAcct() {
        return collAcct;
    }

    /**
     * Sets the value of the collAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setCollAcct(SecuritiesAccount19 value) {
        this.collAcct = value;
    }

}
