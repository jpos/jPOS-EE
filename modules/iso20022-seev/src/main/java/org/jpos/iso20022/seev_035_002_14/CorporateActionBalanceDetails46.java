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

package org.jpos.iso20022.seev_035_002_14;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionBalanceDetails46 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionBalanceDetails46">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlElgblBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}TotalEligibleBalanceFormat11" minOccurs="0"/>
 *         <element name="BlckdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="BrrwdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="CollInBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="CollOutBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="OnLnBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="PdgDlvryBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}BalanceFormat16Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PdgRctBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}BalanceFormat16Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OutForRegnBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="SttlmPosBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}BalanceFormat16Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="StrtPosBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="TradDtPosBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="InTrnsShipmntBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="RegdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="OblgtdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="UinstdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="InstdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="AfctdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="UafctdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}BalanceFormat14Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionBalanceDetails46", propOrder = {
    "ttlElgblBal",
    "blckdBal",
    "brrwdBal",
    "collInBal",
    "collOutBal",
    "onLnBal",
    "pdgDlvryBal",
    "pdgRctBal",
    "outForRegnBal",
    "sttlmPosBal",
    "strtPosBal",
    "tradDtPosBal",
    "inTrnsShipmntBal",
    "regdBal",
    "oblgtdBal",
    "uinstdBal",
    "instdBal",
    "afctdBal",
    "uafctdBal"
})
public class CorporateActionBalanceDetails46 {

    @XmlElement(name = "TtlElgblBal")
    protected TotalEligibleBalanceFormat11 ttlElgblBal;
    @XmlElement(name = "BlckdBal")
    protected BalanceFormat14Choice blckdBal;
    @XmlElement(name = "BrrwdBal")
    protected BalanceFormat14Choice brrwdBal;
    @XmlElement(name = "CollInBal")
    protected BalanceFormat14Choice collInBal;
    @XmlElement(name = "CollOutBal")
    protected BalanceFormat14Choice collOutBal;
    @XmlElement(name = "OnLnBal")
    protected BalanceFormat14Choice onLnBal;
    @XmlElement(name = "PdgDlvryBal")
    protected List<BalanceFormat16Choice> pdgDlvryBal;
    @XmlElement(name = "PdgRctBal")
    protected List<BalanceFormat16Choice> pdgRctBal;
    @XmlElement(name = "OutForRegnBal")
    protected BalanceFormat14Choice outForRegnBal;
    @XmlElement(name = "SttlmPosBal")
    protected List<BalanceFormat16Choice> sttlmPosBal;
    @XmlElement(name = "StrtPosBal")
    protected BalanceFormat14Choice strtPosBal;
    @XmlElement(name = "TradDtPosBal")
    protected BalanceFormat14Choice tradDtPosBal;
    @XmlElement(name = "InTrnsShipmntBal")
    protected BalanceFormat14Choice inTrnsShipmntBal;
    @XmlElement(name = "RegdBal")
    protected BalanceFormat14Choice regdBal;
    @XmlElement(name = "OblgtdBal")
    protected BalanceFormat14Choice oblgtdBal;
    @XmlElement(name = "UinstdBal")
    protected BalanceFormat14Choice uinstdBal;
    @XmlElement(name = "InstdBal")
    protected BalanceFormat14Choice instdBal;
    @XmlElement(name = "AfctdBal")
    protected BalanceFormat14Choice afctdBal;
    @XmlElement(name = "UafctdBal")
    protected BalanceFormat14Choice uafctdBal;

    /**
     * Gets the value of the ttlElgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link TotalEligibleBalanceFormat11 }
     *     
     */
    public TotalEligibleBalanceFormat11 getTtlElgblBal() {
        return ttlElgblBal;
    }

    /**
     * Sets the value of the ttlElgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalEligibleBalanceFormat11 }
     *     
     */
    public void setTtlElgblBal(TotalEligibleBalanceFormat11 value) {
        this.ttlElgblBal = value;
    }

    /**
     * Gets the value of the blckdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public BalanceFormat14Choice getBlckdBal() {
        return blckdBal;
    }

    /**
     * Sets the value of the blckdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public void setBlckdBal(BalanceFormat14Choice value) {
        this.blckdBal = value;
    }

    /**
     * Gets the value of the brrwdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public BalanceFormat14Choice getBrrwdBal() {
        return brrwdBal;
    }

    /**
     * Sets the value of the brrwdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public void setBrrwdBal(BalanceFormat14Choice value) {
        this.brrwdBal = value;
    }

    /**
     * Gets the value of the collInBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public BalanceFormat14Choice getCollInBal() {
        return collInBal;
    }

    /**
     * Sets the value of the collInBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public void setCollInBal(BalanceFormat14Choice value) {
        this.collInBal = value;
    }

    /**
     * Gets the value of the collOutBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public BalanceFormat14Choice getCollOutBal() {
        return collOutBal;
    }

    /**
     * Sets the value of the collOutBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public void setCollOutBal(BalanceFormat14Choice value) {
        this.collOutBal = value;
    }

    /**
     * Gets the value of the onLnBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public BalanceFormat14Choice getOnLnBal() {
        return onLnBal;
    }

    /**
     * Sets the value of the onLnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public void setOnLnBal(BalanceFormat14Choice value) {
        this.onLnBal = value;
    }

    /**
     * Gets the value of the pdgDlvryBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pdgDlvryBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdgDlvryBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceFormat16Choice }
     * 
     * 
     * @return
     *     The value of the pdgDlvryBal property.
     */
    public List<BalanceFormat16Choice> getPdgDlvryBal() {
        if (pdgDlvryBal == null) {
            pdgDlvryBal = new ArrayList<>();
        }
        return this.pdgDlvryBal;
    }

    /**
     * Gets the value of the pdgRctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pdgRctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdgRctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceFormat16Choice }
     * 
     * 
     * @return
     *     The value of the pdgRctBal property.
     */
    public List<BalanceFormat16Choice> getPdgRctBal() {
        if (pdgRctBal == null) {
            pdgRctBal = new ArrayList<>();
        }
        return this.pdgRctBal;
    }

    /**
     * Gets the value of the outForRegnBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public BalanceFormat14Choice getOutForRegnBal() {
        return outForRegnBal;
    }

    /**
     * Sets the value of the outForRegnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public void setOutForRegnBal(BalanceFormat14Choice value) {
        this.outForRegnBal = value;
    }

    /**
     * Gets the value of the sttlmPosBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmPosBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmPosBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceFormat16Choice }
     * 
     * 
     * @return
     *     The value of the sttlmPosBal property.
     */
    public List<BalanceFormat16Choice> getSttlmPosBal() {
        if (sttlmPosBal == null) {
            sttlmPosBal = new ArrayList<>();
        }
        return this.sttlmPosBal;
    }

    /**
     * Gets the value of the strtPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public BalanceFormat14Choice getStrtPosBal() {
        return strtPosBal;
    }

    /**
     * Sets the value of the strtPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public void setStrtPosBal(BalanceFormat14Choice value) {
        this.strtPosBal = value;
    }

    /**
     * Gets the value of the tradDtPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public BalanceFormat14Choice getTradDtPosBal() {
        return tradDtPosBal;
    }

    /**
     * Sets the value of the tradDtPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public void setTradDtPosBal(BalanceFormat14Choice value) {
        this.tradDtPosBal = value;
    }

    /**
     * Gets the value of the inTrnsShipmntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public BalanceFormat14Choice getInTrnsShipmntBal() {
        return inTrnsShipmntBal;
    }

    /**
     * Sets the value of the inTrnsShipmntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public void setInTrnsShipmntBal(BalanceFormat14Choice value) {
        this.inTrnsShipmntBal = value;
    }

    /**
     * Gets the value of the regdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public BalanceFormat14Choice getRegdBal() {
        return regdBal;
    }

    /**
     * Sets the value of the regdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public void setRegdBal(BalanceFormat14Choice value) {
        this.regdBal = value;
    }

    /**
     * Gets the value of the oblgtdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public BalanceFormat14Choice getOblgtdBal() {
        return oblgtdBal;
    }

    /**
     * Sets the value of the oblgtdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public void setOblgtdBal(BalanceFormat14Choice value) {
        this.oblgtdBal = value;
    }

    /**
     * Gets the value of the uinstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public BalanceFormat14Choice getUinstdBal() {
        return uinstdBal;
    }

    /**
     * Sets the value of the uinstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public void setUinstdBal(BalanceFormat14Choice value) {
        this.uinstdBal = value;
    }

    /**
     * Gets the value of the instdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public BalanceFormat14Choice getInstdBal() {
        return instdBal;
    }

    /**
     * Sets the value of the instdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public void setInstdBal(BalanceFormat14Choice value) {
        this.instdBal = value;
    }

    /**
     * Gets the value of the afctdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public BalanceFormat14Choice getAfctdBal() {
        return afctdBal;
    }

    /**
     * Sets the value of the afctdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public void setAfctdBal(BalanceFormat14Choice value) {
        this.afctdBal = value;
    }

    /**
     * Gets the value of the uafctdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public BalanceFormat14Choice getUafctdBal() {
        return uafctdBal;
    }

    /**
     * Sets the value of the uafctdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public void setUafctdBal(BalanceFormat14Choice value) {
        this.uafctdBal = value;
    }

}
