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

package org.jpos.iso20022.sese_007_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentificationAndAccount194 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentificationAndAccount194">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}PartyIdentification123Choice"/>
 *         <element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}LEIIdentifier" minOccurs="0"/>
 *         <element name="AltrnId" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}AlternatePartyIdentification7" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}SecuritiesAccount19" minOccurs="0"/>
 *         <element name="PrcgDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="PrcgId" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}Max35Text" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}PartyTextInformation6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationAndAccount194", propOrder = {
    "id",
    "lei",
    "altrnId",
    "sfkpgAcct",
    "prcgDt",
    "prcgId",
    "addtlInf"
})
public class PartyIdentificationAndAccount194 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification123Choice id;
    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "AltrnId")
    protected AlternatePartyIdentification7 altrnId;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "PrcgDt")
    protected DateAndDateTime2Choice prcgDt;
    @XmlElement(name = "PrcgId")
    protected String prcgId;
    @XmlElement(name = "AddtlInf")
    protected PartyTextInformation6 addtlInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification123Choice }
     *     
     */
    public PartyIdentification123Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification123Choice }
     *     
     */
    public void setId(PartyIdentification123Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEI(String value) {
        this.lei = value;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePartyIdentification7 }
     *     
     */
    public AlternatePartyIdentification7 getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePartyIdentification7 }
     *     
     */
    public void setAltrnId(AlternatePartyIdentification7 value) {
        this.altrnId = value;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the prcgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getPrcgDt() {
        return prcgDt;
    }

    /**
     * Sets the value of the prcgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setPrcgDt(DateAndDateTime2Choice value) {
        this.prcgDt = value;
    }

    /**
     * Gets the value of the prcgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcgId() {
        return prcgId;
    }

    /**
     * Sets the value of the prcgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcgId(String value) {
        this.prcgId = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTextInformation6 }
     *     
     */
    public PartyTextInformation6 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTextInformation6 }
     *     
     */
    public void setAddtlInf(PartyTextInformation6 value) {
        this.addtlInf = value;
    }

}
