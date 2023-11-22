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

package org.jpos.iso20022.secl_003_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentificationAndAccount102 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentificationAndAccount102">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PtyId" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}PartyIdentification33Choice"/>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="PrcgId" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="PrcgDt" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}DateAndDateTimeChoice" minOccurs="0"/>
 *         <element name="SubAcct" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}SubAccount4" minOccurs="0"/>
 *         <element name="CtctPrsn" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}ContactIdentification2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationAndAccount102", propOrder = {
    "ptyId",
    "acctId",
    "prcgId",
    "prcgDt",
    "subAcct",
    "ctctPrsn"
})
public class PartyIdentificationAndAccount102 {

    @XmlElement(name = "PtyId", required = true)
    protected PartyIdentification33Choice ptyId;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "PrcgId")
    protected String prcgId;
    @XmlElement(name = "PrcgDt")
    protected DateAndDateTimeChoice prcgDt;
    @XmlElement(name = "SubAcct")
    protected SubAccount4 subAcct;
    @XmlElement(name = "CtctPrsn")
    protected ContactIdentification2 ctctPrsn;

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public PartyIdentification33Choice getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public void setPtyId(PartyIdentification33Choice value) {
        this.ptyId = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
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
     * Gets the value of the prcgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getPrcgDt() {
        return prcgDt;
    }

    /**
     * Sets the value of the prcgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setPrcgDt(DateAndDateTimeChoice value) {
        this.prcgDt = value;
    }

    /**
     * Gets the value of the subAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccount4 }
     *     
     */
    public SubAccount4 getSubAcct() {
        return subAcct;
    }

    /**
     * Sets the value of the subAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccount4 }
     *     
     */
    public void setSubAcct(SubAccount4 value) {
        this.subAcct = value;
    }

    /**
     * Gets the value of the ctctPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link ContactIdentification2 }
     *     
     */
    public ContactIdentification2 getCtctPrsn() {
        return ctctPrsn;
    }

    /**
     * Sets the value of the ctctPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactIdentification2 }
     *     
     */
    public void setCtctPrsn(ContactIdentification2 value) {
        this.ctctPrsn = value;
    }

}
