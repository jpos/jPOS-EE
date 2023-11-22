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

package org.jpos.iso20022.catm_005_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCard33 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentCard33">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrtctdCardData" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}ContentInformationType35" minOccurs="0"/>
 *         <element name="PrvtCardData" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max100KBinary" minOccurs="0"/>
 *         <element name="PlainCardData" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}PlainCardData15" minOccurs="0"/>
 *         <element name="PmtAcctRef" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max70Text" minOccurs="0"/>
 *         <element name="MskdPAN" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max30Text" minOccurs="0"/>
 *         <element name="IssrBIN" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max15NumericText" minOccurs="0"/>
 *         <element name="CardCtryCd" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max3Text" minOccurs="0"/>
 *         <element name="CardCcyCd" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Exact3AlphaNumericText" minOccurs="0"/>
 *         <element name="CardPdctPrfl" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max35Text" minOccurs="0"/>
 *         <element name="CardBrnd" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max35Text" minOccurs="0"/>
 *         <element name="CardPdctTp" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}CardProductType1Code" minOccurs="0"/>
 *         <element name="CardPdctSubTp" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max35Text" minOccurs="0"/>
 *         <element name="IntrnlCard" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AllwdPdct" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max70Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SvcOptn" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max35Text" minOccurs="0"/>
 *         <element name="AddtlCardData" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max70Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCard33", propOrder = {
    "prtctdCardData",
    "prvtCardData",
    "plainCardData",
    "pmtAcctRef",
    "mskdPAN",
    "issrBIN",
    "cardCtryCd",
    "cardCcyCd",
    "cardPdctPrfl",
    "cardBrnd",
    "cardPdctTp",
    "cardPdctSubTp",
    "intrnlCard",
    "allwdPdct",
    "svcOptn",
    "addtlCardData"
})
public class PaymentCard33 {

    @XmlElement(name = "PrtctdCardData")
    protected ContentInformationType35 prtctdCardData;
    @XmlElement(name = "PrvtCardData")
    protected byte[] prvtCardData;
    @XmlElement(name = "PlainCardData")
    protected PlainCardData15 plainCardData;
    @XmlElement(name = "PmtAcctRef")
    protected String pmtAcctRef;
    @XmlElement(name = "MskdPAN")
    protected String mskdPAN;
    @XmlElement(name = "IssrBIN")
    protected String issrBIN;
    @XmlElement(name = "CardCtryCd")
    protected String cardCtryCd;
    @XmlElement(name = "CardCcyCd")
    protected String cardCcyCd;
    @XmlElement(name = "CardPdctPrfl")
    protected String cardPdctPrfl;
    @XmlElement(name = "CardBrnd")
    protected String cardBrnd;
    @XmlElement(name = "CardPdctTp")
    @XmlSchemaType(name = "string")
    protected CardProductType1Code cardPdctTp;
    @XmlElement(name = "CardPdctSubTp")
    protected String cardPdctSubTp;
    @XmlElement(name = "IntrnlCard")
    protected Boolean intrnlCard;
    @XmlElement(name = "AllwdPdct")
    protected List<String> allwdPdct;
    @XmlElement(name = "SvcOptn")
    protected String svcOptn;
    @XmlElement(name = "AddtlCardData")
    protected String addtlCardData;

    /**
     * Gets the value of the prtctdCardData property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType35 }
     *     
     */
    public ContentInformationType35 getPrtctdCardData() {
        return prtctdCardData;
    }

    /**
     * Sets the value of the prtctdCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType35 }
     *     
     */
    public void setPrtctdCardData(ContentInformationType35 value) {
        this.prtctdCardData = value;
    }

    /**
     * Gets the value of the prvtCardData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPrvtCardData() {
        return prvtCardData;
    }

    /**
     * Sets the value of the prvtCardData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPrvtCardData(byte[] value) {
        this.prvtCardData = value;
    }

    /**
     * Gets the value of the plainCardData property.
     * 
     * @return
     *     possible object is
     *     {@link PlainCardData15 }
     *     
     */
    public PlainCardData15 getPlainCardData() {
        return plainCardData;
    }

    /**
     * Sets the value of the plainCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlainCardData15 }
     *     
     */
    public void setPlainCardData(PlainCardData15 value) {
        this.plainCardData = value;
    }

    /**
     * Gets the value of the pmtAcctRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtAcctRef() {
        return pmtAcctRef;
    }

    /**
     * Sets the value of the pmtAcctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtAcctRef(String value) {
        this.pmtAcctRef = value;
    }

    /**
     * Gets the value of the mskdPAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMskdPAN() {
        return mskdPAN;
    }

    /**
     * Sets the value of the mskdPAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMskdPAN(String value) {
        this.mskdPAN = value;
    }

    /**
     * Gets the value of the issrBIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrBIN() {
        return issrBIN;
    }

    /**
     * Sets the value of the issrBIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssrBIN(String value) {
        this.issrBIN = value;
    }

    /**
     * Gets the value of the cardCtryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCtryCd() {
        return cardCtryCd;
    }

    /**
     * Sets the value of the cardCtryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCtryCd(String value) {
        this.cardCtryCd = value;
    }

    /**
     * Gets the value of the cardCcyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCcyCd() {
        return cardCcyCd;
    }

    /**
     * Sets the value of the cardCcyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCcyCd(String value) {
        this.cardCcyCd = value;
    }

    /**
     * Gets the value of the cardPdctPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPdctPrfl() {
        return cardPdctPrfl;
    }

    /**
     * Sets the value of the cardPdctPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPdctPrfl(String value) {
        this.cardPdctPrfl = value;
    }

    /**
     * Gets the value of the cardBrnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBrnd() {
        return cardBrnd;
    }

    /**
     * Sets the value of the cardBrnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBrnd(String value) {
        this.cardBrnd = value;
    }

    /**
     * Gets the value of the cardPdctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardProductType1Code }
     *     
     */
    public CardProductType1Code getCardPdctTp() {
        return cardPdctTp;
    }

    /**
     * Sets the value of the cardPdctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardProductType1Code }
     *     
     */
    public void setCardPdctTp(CardProductType1Code value) {
        this.cardPdctTp = value;
    }

    /**
     * Gets the value of the cardPdctSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPdctSubTp() {
        return cardPdctSubTp;
    }

    /**
     * Sets the value of the cardPdctSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPdctSubTp(String value) {
        this.cardPdctSubTp = value;
    }

    /**
     * Gets the value of the intrnlCard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrnlCard() {
        return intrnlCard;
    }

    /**
     * Sets the value of the intrnlCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntrnlCard(Boolean value) {
        this.intrnlCard = value;
    }

    /**
     * Gets the value of the allwdPdct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the allwdPdct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdPdct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the allwdPdct property.
     */
    public List<String> getAllwdPdct() {
        if (allwdPdct == null) {
            allwdPdct = new ArrayList<>();
        }
        return this.allwdPdct;
    }

    /**
     * Gets the value of the svcOptn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcOptn() {
        return svcOptn;
    }

    /**
     * Sets the value of the svcOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcOptn(String value) {
        this.svcOptn = value;
    }

    /**
     * Gets the value of the addtlCardData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlCardData() {
        return addtlCardData;
    }

    /**
     * Sets the value of the addtlCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlCardData(String value) {
        this.addtlCardData = value;
    }

}
