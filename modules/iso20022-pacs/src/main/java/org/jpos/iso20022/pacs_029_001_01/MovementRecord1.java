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

package org.jpos.iso20022.pacs_029_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MovementRecord1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MovementRecord1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.01}Max35Text"/>
 *         <element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.01}Number" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.01}AmountAndDirection5"/>
 *         <element name="SttlmAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.01}PartyIdentification135" minOccurs="0"/>
 *         <element name="SttlmAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.01}CashAccount40" minOccurs="0"/>
 *         <element name="Ptcpt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.01}PartyIdentification135" minOccurs="0"/>
 *         <element name="PtcptAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.01}CashAccount40" minOccurs="0"/>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.01}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovementRecord1", propOrder = {
    "id",
    "seqNb",
    "amt",
    "sttlmAgt",
    "sttlmAgtAcct",
    "ptcpt",
    "ptcptAcct",
    "ref"
})
public class MovementRecord1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "SeqNb")
    protected BigDecimal seqNb;
    @XmlElement(name = "Amt", required = true)
    protected AmountAndDirection5 amt;
    @XmlElement(name = "SttlmAgt")
    protected PartyIdentification135 sttlmAgt;
    @XmlElement(name = "SttlmAgtAcct")
    protected CashAccount40 sttlmAgtAcct;
    @XmlElement(name = "Ptcpt")
    protected PartyIdentification135 ptcpt;
    @XmlElement(name = "PtcptAcct")
    protected CashAccount40 ptcptAcct;
    @XmlElement(name = "Ref")
    protected String ref;

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
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeqNb(BigDecimal value) {
        this.seqNb = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public void setAmt(AmountAndDirection5 value) {
        this.amt = value;
    }

    /**
     * Gets the value of the sttlmAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getSttlmAgt() {
        return sttlmAgt;
    }

    /**
     * Sets the value of the sttlmAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setSttlmAgt(PartyIdentification135 value) {
        this.sttlmAgt = value;
    }

    /**
     * Gets the value of the sttlmAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getSttlmAgtAcct() {
        return sttlmAgtAcct;
    }

    /**
     * Sets the value of the sttlmAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setSttlmAgtAcct(CashAccount40 value) {
        this.sttlmAgtAcct = value;
    }

    /**
     * Gets the value of the ptcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getPtcpt() {
        return ptcpt;
    }

    /**
     * Sets the value of the ptcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setPtcpt(PartyIdentification135 value) {
        this.ptcpt = value;
    }

    /**
     * Gets the value of the ptcptAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getPtcptAcct() {
        return ptcptAcct;
    }

    /**
     * Sets the value of the ptcptAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setPtcptAcct(CashAccount40 value) {
        this.ptcptAcct = value;
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
