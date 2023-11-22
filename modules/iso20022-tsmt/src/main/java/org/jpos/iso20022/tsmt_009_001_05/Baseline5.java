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

package org.jpos.iso20022.tsmt_009_001_05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Baseline5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Baseline5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SubmitrBaselnId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}DocumentIdentification1"/>
 *         <element name="SvcCd" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}TradeFinanceService2Code"/>
 *         <element name="PurchsOrdrRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}DocumentIdentification7"/>
 *         <element name="Buyr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}PartyIdentification26"/>
 *         <element name="Sellr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}PartyIdentification26"/>
 *         <element name="BuyrBk" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}BICIdentification1"/>
 *         <element name="SellrBk" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}BICIdentification1"/>
 *         <element name="BuyrSdSubmitgBk" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}BICIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SellrSdSubmitgBk" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}BICIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BllTo" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}PartyIdentification26" minOccurs="0"/>
 *         <element name="ShipTo" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}PartyIdentification26" minOccurs="0"/>
 *         <element name="Consgn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}PartyIdentification26" minOccurs="0"/>
 *         <element name="Goods" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}LineItem13"/>
 *         <element name="PmtTerms" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}PaymentTerms5" maxOccurs="unbounded"/>
 *         <element name="SttlmTerms" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}SettlementTerms3" minOccurs="0"/>
 *         <element name="PmtOblgtn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}PaymentObligation2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LatstMtchDt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}ISODate" minOccurs="0"/>
 *         <element name="ComrclDataSetReqrd" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}RequiredSubmission2"/>
 *         <element name="TrnsprtDataSetReqrd" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}RequiredSubmission2" minOccurs="0"/>
 *         <element name="InsrncDataSetReqrd" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}RequiredSubmission3" minOccurs="0"/>
 *         <element name="CertDataSetReqrd" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}RequiredSubmission4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OthrCertDataSetReqrd" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}RequiredSubmission6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InttToPayXpctd" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}YesNoIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Baseline5", propOrder = {
    "submitrBaselnId",
    "svcCd",
    "purchsOrdrRef",
    "buyr",
    "sellr",
    "buyrBk",
    "sellrBk",
    "buyrSdSubmitgBk",
    "sellrSdSubmitgBk",
    "bllTo",
    "shipTo",
    "consgn",
    "goods",
    "pmtTerms",
    "sttlmTerms",
    "pmtOblgtn",
    "latstMtchDt",
    "comrclDataSetReqrd",
    "trnsprtDataSetReqrd",
    "insrncDataSetReqrd",
    "certDataSetReqrd",
    "othrCertDataSetReqrd",
    "inttToPayXpctd"
})
public class Baseline5 {

    @XmlElement(name = "SubmitrBaselnId", required = true)
    protected DocumentIdentification1 submitrBaselnId;
    @XmlElement(name = "SvcCd", required = true)
    @XmlSchemaType(name = "string")
    protected TradeFinanceService2Code svcCd;
    @XmlElement(name = "PurchsOrdrRef", required = true)
    protected DocumentIdentification7 purchsOrdrRef;
    @XmlElement(name = "Buyr", required = true)
    protected PartyIdentification26 buyr;
    @XmlElement(name = "Sellr", required = true)
    protected PartyIdentification26 sellr;
    @XmlElement(name = "BuyrBk", required = true)
    protected BICIdentification1 buyrBk;
    @XmlElement(name = "SellrBk", required = true)
    protected BICIdentification1 sellrBk;
    @XmlElement(name = "BuyrSdSubmitgBk")
    protected List<BICIdentification1> buyrSdSubmitgBk;
    @XmlElement(name = "SellrSdSubmitgBk")
    protected List<BICIdentification1> sellrSdSubmitgBk;
    @XmlElement(name = "BllTo")
    protected PartyIdentification26 bllTo;
    @XmlElement(name = "ShipTo")
    protected PartyIdentification26 shipTo;
    @XmlElement(name = "Consgn")
    protected PartyIdentification26 consgn;
    @XmlElement(name = "Goods", required = true)
    protected LineItem13 goods;
    @XmlElement(name = "PmtTerms", required = true)
    protected List<PaymentTerms5> pmtTerms;
    @XmlElement(name = "SttlmTerms")
    protected SettlementTerms3 sttlmTerms;
    @XmlElement(name = "PmtOblgtn")
    protected List<PaymentObligation2> pmtOblgtn;
    @XmlElement(name = "LatstMtchDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar latstMtchDt;
    @XmlElement(name = "ComrclDataSetReqrd", required = true)
    protected RequiredSubmission2 comrclDataSetReqrd;
    @XmlElement(name = "TrnsprtDataSetReqrd")
    protected RequiredSubmission2 trnsprtDataSetReqrd;
    @XmlElement(name = "InsrncDataSetReqrd")
    protected RequiredSubmission3 insrncDataSetReqrd;
    @XmlElement(name = "CertDataSetReqrd")
    protected List<RequiredSubmission4> certDataSetReqrd;
    @XmlElement(name = "OthrCertDataSetReqrd")
    protected List<RequiredSubmission6> othrCertDataSetReqrd;
    @XmlElement(name = "InttToPayXpctd")
    protected boolean inttToPayXpctd;

    /**
     * Gets the value of the submitrBaselnId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification1 }
     *     
     */
    public DocumentIdentification1 getSubmitrBaselnId() {
        return submitrBaselnId;
    }

    /**
     * Sets the value of the submitrBaselnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification1 }
     *     
     */
    public void setSubmitrBaselnId(DocumentIdentification1 value) {
        this.submitrBaselnId = value;
    }

    /**
     * Gets the value of the svcCd property.
     * 
     * @return
     *     possible object is
     *     {@link TradeFinanceService2Code }
     *     
     */
    public TradeFinanceService2Code getSvcCd() {
        return svcCd;
    }

    /**
     * Sets the value of the svcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeFinanceService2Code }
     *     
     */
    public void setSvcCd(TradeFinanceService2Code value) {
        this.svcCd = value;
    }

    /**
     * Gets the value of the purchsOrdrRef property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public DocumentIdentification7 getPurchsOrdrRef() {
        return purchsOrdrRef;
    }

    /**
     * Sets the value of the purchsOrdrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public void setPurchsOrdrRef(DocumentIdentification7 value) {
        this.purchsOrdrRef = value;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setBuyr(PartyIdentification26 value) {
        this.buyr = value;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setSellr(PartyIdentification26 value) {
        this.sellr = value;
    }

    /**
     * Gets the value of the buyrBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getBuyrBk() {
        return buyrBk;
    }

    /**
     * Sets the value of the buyrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public void setBuyrBk(BICIdentification1 value) {
        this.buyrBk = value;
    }

    /**
     * Gets the value of the sellrBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getSellrBk() {
        return sellrBk;
    }

    /**
     * Sets the value of the sellrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public void setSellrBk(BICIdentification1 value) {
        this.sellrBk = value;
    }

    /**
     * Gets the value of the buyrSdSubmitgBk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the buyrSdSubmitgBk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyrSdSubmitgBk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     * @return
     *     The value of the buyrSdSubmitgBk property.
     */
    public List<BICIdentification1> getBuyrSdSubmitgBk() {
        if (buyrSdSubmitgBk == null) {
            buyrSdSubmitgBk = new ArrayList<>();
        }
        return this.buyrSdSubmitgBk;
    }

    /**
     * Gets the value of the sellrSdSubmitgBk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sellrSdSubmitgBk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellrSdSubmitgBk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     * @return
     *     The value of the sellrSdSubmitgBk property.
     */
    public List<BICIdentification1> getSellrSdSubmitgBk() {
        if (sellrSdSubmitgBk == null) {
            sellrSdSubmitgBk = new ArrayList<>();
        }
        return this.sellrSdSubmitgBk;
    }

    /**
     * Gets the value of the bllTo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getBllTo() {
        return bllTo;
    }

    /**
     * Sets the value of the bllTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setBllTo(PartyIdentification26 value) {
        this.bllTo = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setShipTo(PartyIdentification26 value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the consgn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getConsgn() {
        return consgn;
    }

    /**
     * Sets the value of the consgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setConsgn(PartyIdentification26 value) {
        this.consgn = value;
    }

    /**
     * Gets the value of the goods property.
     * 
     * @return
     *     possible object is
     *     {@link LineItem13 }
     *     
     */
    public LineItem13 getGoods() {
        return goods;
    }

    /**
     * Sets the value of the goods property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItem13 }
     *     
     */
    public void setGoods(LineItem13 value) {
        this.goods = value;
    }

    /**
     * Gets the value of the pmtTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTerms5 }
     * 
     * 
     * @return
     *     The value of the pmtTerms property.
     */
    public List<PaymentTerms5> getPmtTerms() {
        if (pmtTerms == null) {
            pmtTerms = new ArrayList<>();
        }
        return this.pmtTerms;
    }

    /**
     * Gets the value of the sttlmTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTerms3 }
     *     
     */
    public SettlementTerms3 getSttlmTerms() {
        return sttlmTerms;
    }

    /**
     * Sets the value of the sttlmTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTerms3 }
     *     
     */
    public void setSttlmTerms(SettlementTerms3 value) {
        this.sttlmTerms = value;
    }

    /**
     * Gets the value of the pmtOblgtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtOblgtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtOblgtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentObligation2 }
     * 
     * 
     * @return
     *     The value of the pmtOblgtn property.
     */
    public List<PaymentObligation2> getPmtOblgtn() {
        if (pmtOblgtn == null) {
            pmtOblgtn = new ArrayList<>();
        }
        return this.pmtOblgtn;
    }

    /**
     * Gets the value of the latstMtchDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatstMtchDt() {
        return latstMtchDt;
    }

    /**
     * Sets the value of the latstMtchDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatstMtchDt(XMLGregorianCalendar value) {
        this.latstMtchDt = value;
    }

    /**
     * Gets the value of the comrclDataSetReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredSubmission2 }
     *     
     */
    public RequiredSubmission2 getComrclDataSetReqrd() {
        return comrclDataSetReqrd;
    }

    /**
     * Sets the value of the comrclDataSetReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredSubmission2 }
     *     
     */
    public void setComrclDataSetReqrd(RequiredSubmission2 value) {
        this.comrclDataSetReqrd = value;
    }

    /**
     * Gets the value of the trnsprtDataSetReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredSubmission2 }
     *     
     */
    public RequiredSubmission2 getTrnsprtDataSetReqrd() {
        return trnsprtDataSetReqrd;
    }

    /**
     * Sets the value of the trnsprtDataSetReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredSubmission2 }
     *     
     */
    public void setTrnsprtDataSetReqrd(RequiredSubmission2 value) {
        this.trnsprtDataSetReqrd = value;
    }

    /**
     * Gets the value of the insrncDataSetReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredSubmission3 }
     *     
     */
    public RequiredSubmission3 getInsrncDataSetReqrd() {
        return insrncDataSetReqrd;
    }

    /**
     * Sets the value of the insrncDataSetReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredSubmission3 }
     *     
     */
    public void setInsrncDataSetReqrd(RequiredSubmission3 value) {
        this.insrncDataSetReqrd = value;
    }

    /**
     * Gets the value of the certDataSetReqrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the certDataSetReqrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertDataSetReqrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequiredSubmission4 }
     * 
     * 
     * @return
     *     The value of the certDataSetReqrd property.
     */
    public List<RequiredSubmission4> getCertDataSetReqrd() {
        if (certDataSetReqrd == null) {
            certDataSetReqrd = new ArrayList<>();
        }
        return this.certDataSetReqrd;
    }

    /**
     * Gets the value of the othrCertDataSetReqrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrCertDataSetReqrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrCertDataSetReqrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequiredSubmission6 }
     * 
     * 
     * @return
     *     The value of the othrCertDataSetReqrd property.
     */
    public List<RequiredSubmission6> getOthrCertDataSetReqrd() {
        if (othrCertDataSetReqrd == null) {
            othrCertDataSetReqrd = new ArrayList<>();
        }
        return this.othrCertDataSetReqrd;
    }

    /**
     * Gets the value of the inttToPayXpctd property.
     * 
     */
    public boolean isInttToPayXpctd() {
        return inttToPayXpctd;
    }

    /**
     * Sets the value of the inttToPayXpctd property.
     * 
     */
    public void setInttToPayXpctd(boolean value) {
        this.inttToPayXpctd = value;
    }

}
