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

package org.jpos.iso20022.acmt_001_001_08;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCard29 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentCard29">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}CardType1Code"/>
 *         <element name="Nb" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max35Text"/>
 *         <element name="HldrNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max35Text"/>
 *         <element name="StartDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}ISOYearMonth" minOccurs="0"/>
 *         <element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}ISOYearMonth"/>
 *         <element name="CardIssrNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max35Text" minOccurs="0"/>
 *         <element name="CardIssrId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}PartyIdentification125Choice" minOccurs="0"/>
 *         <element name="SctyCd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max35Text" minOccurs="0"/>
 *         <element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max3Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCard29", propOrder = {
    "tp",
    "nb",
    "hldrNm",
    "startDt",
    "xpryDt",
    "cardIssrNm",
    "cardIssrId",
    "sctyCd",
    "seqNb"
})
public class PaymentCard29 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected CardType1Code tp;
    @XmlElement(name = "Nb", required = true)
    protected String nb;
    @XmlElement(name = "HldrNm", required = true)
    protected String hldrNm;
    @XmlElement(name = "StartDt")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "XpryDt", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar xpryDt;
    @XmlElement(name = "CardIssrNm")
    protected String cardIssrNm;
    @XmlElement(name = "CardIssrId")
    protected PartyIdentification125Choice cardIssrId;
    @XmlElement(name = "SctyCd")
    protected String sctyCd;
    @XmlElement(name = "SeqNb")
    protected String seqNb;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CardType1Code }
     *     
     */
    public CardType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardType1Code }
     *     
     */
    public void setTp(CardType1Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the nb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNb() {
        return nb;
    }

    /**
     * Sets the value of the nb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNb(String value) {
        this.nb = value;
    }

    /**
     * Gets the value of the hldrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHldrNm() {
        return hldrNm;
    }

    /**
     * Sets the value of the hldrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHldrNm(String value) {
        this.hldrNm = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpryDt(XMLGregorianCalendar value) {
        this.xpryDt = value;
    }

    /**
     * Gets the value of the cardIssrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssrNm() {
        return cardIssrNm;
    }

    /**
     * Sets the value of the cardIssrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssrNm(String value) {
        this.cardIssrNm = value;
    }

    /**
     * Gets the value of the cardIssrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getCardIssrId() {
        return cardIssrId;
    }

    /**
     * Sets the value of the cardIssrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public void setCardIssrId(PartyIdentification125Choice value) {
        this.cardIssrId = value;
    }

    /**
     * Gets the value of the sctyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctyCd() {
        return sctyCd;
    }

    /**
     * Sets the value of the sctyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctyCd(String value) {
        this.sctyCd = value;
    }

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqNb(String value) {
        this.seqNb = value;
    }

}
