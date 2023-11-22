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

package org.jpos.iso20022.seev_037_002_14;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesOption97 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesOption97">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:seev.037.002.14}SecurityIdentification20"/>
 *         <element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.037.002.14}CreditDebitCode"/>
 *         <element name="PstngQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.037.002.14}Quantity54Choice"/>
 *         <element name="PstngDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.037.002.14}ISODate"/>
 *         <element name="OrgnlPstngDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.037.002.14}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesOption97", propOrder = {
    "finInstrmId",
    "cdtDbtInd",
    "pstngQty",
    "pstngDt",
    "orgnlPstngDt"
})
public class SecuritiesOption97 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification20 finInstrmId;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "PstngQty", required = true)
    protected Quantity54Choice pstngQty;
    @XmlElement(name = "PstngDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pstngDt;
    @XmlElement(name = "OrgnlPstngDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orgnlPstngDt;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public SecurityIdentification20 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification20 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public void setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
    }

    /**
     * Gets the value of the pstngQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity54Choice }
     *     
     */
    public Quantity54Choice getPstngQty() {
        return pstngQty;
    }

    /**
     * Sets the value of the pstngQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity54Choice }
     *     
     */
    public void setPstngQty(Quantity54Choice value) {
        this.pstngQty = value;
    }

    /**
     * Gets the value of the pstngDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPstngDt() {
        return pstngDt;
    }

    /**
     * Sets the value of the pstngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPstngDt(XMLGregorianCalendar value) {
        this.pstngDt = value;
    }

    /**
     * Gets the value of the orgnlPstngDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrgnlPstngDt() {
        return orgnlPstngDt;
    }

    /**
     * Sets the value of the orgnlPstngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrgnlPstngDt(XMLGregorianCalendar value) {
        this.orgnlPstngDt = value;
    }

}
