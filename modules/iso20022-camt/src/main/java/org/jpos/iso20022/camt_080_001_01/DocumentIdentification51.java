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

package org.jpos.iso20022.camt_080_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentIdentification51 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DocumentIdentification51">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.080.001.01}Max35Text"/>
 *         <element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.080.001.01}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="CpyDplct" type="{urn:iso:std:iso:20022:tech:xsd:camt.080.001.01}CopyDuplicate1Code" minOccurs="0"/>
 *         <element name="MsgOrgtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.080.001.01}PartyIdentification136" minOccurs="0"/>
 *         <element name="MsgRcpt" type="{urn:iso:std:iso:20022:tech:xsd:camt.080.001.01}PartyIdentification136" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentIdentification51", propOrder = {
    "id",
    "creDtTm",
    "cpyDplct",
    "msgOrgtr",
    "msgRcpt"
})
public class DocumentIdentification51 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "CreDtTm")
    protected DateAndDateTime2Choice creDtTm;
    @XmlElement(name = "CpyDplct")
    @XmlSchemaType(name = "string")
    protected CopyDuplicate1Code cpyDplct;
    @XmlElement(name = "MsgOrgtr")
    protected PartyIdentification136 msgOrgtr;
    @XmlElement(name = "MsgRcpt")
    protected PartyIdentification136 msgRcpt;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setCreDtTm(DateAndDateTime2Choice value) {
        this.creDtTm = value;
    }

    /**
     * Gets the value of the cpyDplct property.
     * 
     * @return
     *     possible object is
     *     {@link CopyDuplicate1Code }
     *     
     */
    public CopyDuplicate1Code getCpyDplct() {
        return cpyDplct;
    }

    /**
     * Sets the value of the cpyDplct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyDuplicate1Code }
     *     
     */
    public void setCpyDplct(CopyDuplicate1Code value) {
        this.cpyDplct = value;
    }

    /**
     * Gets the value of the msgOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getMsgOrgtr() {
        return msgOrgtr;
    }

    /**
     * Sets the value of the msgOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public void setMsgOrgtr(PartyIdentification136 value) {
        this.msgOrgtr = value;
    }

    /**
     * Gets the value of the msgRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getMsgRcpt() {
        return msgRcpt;
    }

    /**
     * Sets the value of the msgRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public void setMsgRcpt(PartyIdentification136 value) {
        this.msgRcpt = value;
    }

}
