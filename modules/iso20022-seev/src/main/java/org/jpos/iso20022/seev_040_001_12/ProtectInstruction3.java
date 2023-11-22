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

package org.jpos.iso20022.seev_040_001_12;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtectInstruction3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProtectInstruction3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.040.001.12}ProtectTransactionType3Code"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:seev.040.001.12}Max15Text" minOccurs="0"/>
 *         <element name="PrtctDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.040.001.12}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectInstruction3", propOrder = {
    "txTp",
    "txId",
    "prtctDt"
})
public class ProtectInstruction3 {

    @XmlElement(name = "TxTp", required = true)
    @XmlSchemaType(name = "string")
    protected ProtectTransactionType3Code txTp;
    @XmlElement(name = "TxId")
    protected String txId;
    @XmlElement(name = "PrtctDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prtctDt;

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectTransactionType3Code }
     *     
     */
    public ProtectTransactionType3Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectTransactionType3Code }
     *     
     */
    public void setTxTp(ProtectTransactionType3Code value) {
        this.txTp = value;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
    }

    /**
     * Gets the value of the prtctDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrtctDt() {
        return prtctDt;
    }

    /**
     * Sets the value of the prtctDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrtctDt(XMLGregorianCalendar value) {
        this.prtctDt = value;
    }

}
