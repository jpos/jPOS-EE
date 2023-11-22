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

package org.jpos.iso20022.secl_010_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentificationAndAccount31 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentificationAndAccount31">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}PartyIdentification33Choice"/>
 *         <element name="AltrnId" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}AlternatePartyIdentification4" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}PartyTextInformation1" minOccurs="0"/>
 *         <element name="ClrAcct" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}SecuritiesAccount18" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationAndAccount31", propOrder = {
    "id",
    "altrnId",
    "addtlInf",
    "clrAcct"
})
public class PartyIdentificationAndAccount31 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification33Choice id;
    @XmlElement(name = "AltrnId")
    protected AlternatePartyIdentification4 altrnId;
    @XmlElement(name = "AddtlInf")
    protected PartyTextInformation1 addtlInf;
    @XmlElement(name = "ClrAcct")
    protected SecuritiesAccount18 clrAcct;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public PartyIdentification33Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public void setId(PartyIdentification33Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePartyIdentification4 }
     *     
     */
    public AlternatePartyIdentification4 getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePartyIdentification4 }
     *     
     */
    public void setAltrnId(AlternatePartyIdentification4 value) {
        this.altrnId = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTextInformation1 }
     *     
     */
    public PartyTextInformation1 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTextInformation1 }
     *     
     */
    public void setAddtlInf(PartyTextInformation1 value) {
        this.addtlInf = value;
    }

    /**
     * Gets the value of the clrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public SecuritiesAccount18 getClrAcct() {
        return clrAcct;
    }

    /**
     * Sets the value of the clrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public void setClrAcct(SecuritiesAccount18 value) {
        this.clrAcct = value;
    }

}
