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

package org.jpos.iso20022.seev_042_002_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionBalance47 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionBalance47">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlElgblBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}Quantity80Choice"/>
 *         <element name="UinstdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}BalanceFormat14Choice"/>
 *         <element name="TtlInstdBalDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}InstructedBalance17"/>
 *         <element name="BlckdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}SignedQuantityFormat13" minOccurs="0"/>
 *         <element name="BrrwdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}SignedQuantityFormat13" minOccurs="0"/>
 *         <element name="CollInBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}SignedQuantityFormat13" minOccurs="0"/>
 *         <element name="CollOutBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}SignedQuantityFormat13" minOccurs="0"/>
 *         <element name="OnLnBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}SignedQuantityFormat13" minOccurs="0"/>
 *         <element name="OutForRegnBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}SignedQuantityFormat13" minOccurs="0"/>
 *         <element name="SttlmPosBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}SignedQuantityFormat13" minOccurs="0"/>
 *         <element name="StrtPosBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}SignedQuantityFormat13" minOccurs="0"/>
 *         <element name="TradDtPosBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}SignedQuantityFormat13" minOccurs="0"/>
 *         <element name="InTrnsShipmntBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}SignedQuantityFormat13" minOccurs="0"/>
 *         <element name="RegdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}SignedQuantityFormat13" minOccurs="0"/>
 *         <element name="OblgtdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}SignedQuantityFormat13" minOccurs="0"/>
 *         <element name="PdgDlvryBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}PendingBalance8" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PdgRctBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}PendingBalance8" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionBalance47", propOrder = {
    "ttlElgblBal",
    "uinstdBal",
    "ttlInstdBalDtls",
    "blckdBal",
    "brrwdBal",
    "collInBal",
    "collOutBal",
    "onLnBal",
    "outForRegnBal",
    "sttlmPosBal",
    "strtPosBal",
    "tradDtPosBal",
    "inTrnsShipmntBal",
    "regdBal",
    "oblgtdBal",
    "pdgDlvryBal",
    "pdgRctBal"
})
public class CorporateActionBalance47 {

    @XmlElement(name = "TtlElgblBal", required = true)
    protected Quantity80Choice ttlElgblBal;
    @XmlElement(name = "UinstdBal", required = true)
    protected BalanceFormat14Choice uinstdBal;
    @XmlElement(name = "TtlInstdBalDtls", required = true)
    protected InstructedBalance17 ttlInstdBalDtls;
    @XmlElement(name = "BlckdBal")
    protected SignedQuantityFormat13 blckdBal;
    @XmlElement(name = "BrrwdBal")
    protected SignedQuantityFormat13 brrwdBal;
    @XmlElement(name = "CollInBal")
    protected SignedQuantityFormat13 collInBal;
    @XmlElement(name = "CollOutBal")
    protected SignedQuantityFormat13 collOutBal;
    @XmlElement(name = "OnLnBal")
    protected SignedQuantityFormat13 onLnBal;
    @XmlElement(name = "OutForRegnBal")
    protected SignedQuantityFormat13 outForRegnBal;
    @XmlElement(name = "SttlmPosBal")
    protected SignedQuantityFormat13 sttlmPosBal;
    @XmlElement(name = "StrtPosBal")
    protected SignedQuantityFormat13 strtPosBal;
    @XmlElement(name = "TradDtPosBal")
    protected SignedQuantityFormat13 tradDtPosBal;
    @XmlElement(name = "InTrnsShipmntBal")
    protected SignedQuantityFormat13 inTrnsShipmntBal;
    @XmlElement(name = "RegdBal")
    protected SignedQuantityFormat13 regdBal;
    @XmlElement(name = "OblgtdBal")
    protected SignedQuantityFormat13 oblgtdBal;
    @XmlElement(name = "PdgDlvryBal")
    protected List<PendingBalance8> pdgDlvryBal;
    @XmlElement(name = "PdgRctBal")
    protected List<PendingBalance8> pdgRctBal;

    /**
     * Gets the value of the ttlElgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity80Choice }
     *     
     */
    public Quantity80Choice getTtlElgblBal() {
        return ttlElgblBal;
    }

    /**
     * Sets the value of the ttlElgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity80Choice }
     *     
     */
    public void setTtlElgblBal(Quantity80Choice value) {
        this.ttlElgblBal = value;
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
     * Gets the value of the ttlInstdBalDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InstructedBalance17 }
     *     
     */
    public InstructedBalance17 getTtlInstdBalDtls() {
        return ttlInstdBalDtls;
    }

    /**
     * Sets the value of the ttlInstdBalDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructedBalance17 }
     *     
     */
    public void setTtlInstdBalDtls(InstructedBalance17 value) {
        this.ttlInstdBalDtls = value;
    }

    /**
     * Gets the value of the blckdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getBlckdBal() {
        return blckdBal;
    }

    /**
     * Sets the value of the blckdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public void setBlckdBal(SignedQuantityFormat13 value) {
        this.blckdBal = value;
    }

    /**
     * Gets the value of the brrwdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getBrrwdBal() {
        return brrwdBal;
    }

    /**
     * Sets the value of the brrwdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public void setBrrwdBal(SignedQuantityFormat13 value) {
        this.brrwdBal = value;
    }

    /**
     * Gets the value of the collInBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getCollInBal() {
        return collInBal;
    }

    /**
     * Sets the value of the collInBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public void setCollInBal(SignedQuantityFormat13 value) {
        this.collInBal = value;
    }

    /**
     * Gets the value of the collOutBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getCollOutBal() {
        return collOutBal;
    }

    /**
     * Sets the value of the collOutBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public void setCollOutBal(SignedQuantityFormat13 value) {
        this.collOutBal = value;
    }

    /**
     * Gets the value of the onLnBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getOnLnBal() {
        return onLnBal;
    }

    /**
     * Sets the value of the onLnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public void setOnLnBal(SignedQuantityFormat13 value) {
        this.onLnBal = value;
    }

    /**
     * Gets the value of the outForRegnBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getOutForRegnBal() {
        return outForRegnBal;
    }

    /**
     * Sets the value of the outForRegnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public void setOutForRegnBal(SignedQuantityFormat13 value) {
        this.outForRegnBal = value;
    }

    /**
     * Gets the value of the sttlmPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getSttlmPosBal() {
        return sttlmPosBal;
    }

    /**
     * Sets the value of the sttlmPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public void setSttlmPosBal(SignedQuantityFormat13 value) {
        this.sttlmPosBal = value;
    }

    /**
     * Gets the value of the strtPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getStrtPosBal() {
        return strtPosBal;
    }

    /**
     * Sets the value of the strtPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public void setStrtPosBal(SignedQuantityFormat13 value) {
        this.strtPosBal = value;
    }

    /**
     * Gets the value of the tradDtPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getTradDtPosBal() {
        return tradDtPosBal;
    }

    /**
     * Sets the value of the tradDtPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public void setTradDtPosBal(SignedQuantityFormat13 value) {
        this.tradDtPosBal = value;
    }

    /**
     * Gets the value of the inTrnsShipmntBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getInTrnsShipmntBal() {
        return inTrnsShipmntBal;
    }

    /**
     * Sets the value of the inTrnsShipmntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public void setInTrnsShipmntBal(SignedQuantityFormat13 value) {
        this.inTrnsShipmntBal = value;
    }

    /**
     * Gets the value of the regdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getRegdBal() {
        return regdBal;
    }

    /**
     * Sets the value of the regdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public void setRegdBal(SignedQuantityFormat13 value) {
        this.regdBal = value;
    }

    /**
     * Gets the value of the oblgtdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getOblgtdBal() {
        return oblgtdBal;
    }

    /**
     * Sets the value of the oblgtdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public void setOblgtdBal(SignedQuantityFormat13 value) {
        this.oblgtdBal = value;
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
     * {@link PendingBalance8 }
     * 
     * 
     * @return
     *     The value of the pdgDlvryBal property.
     */
    public List<PendingBalance8> getPdgDlvryBal() {
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
     * {@link PendingBalance8 }
     * 
     * 
     * @return
     *     The value of the pdgRctBal property.
     */
    public List<PendingBalance8> getPdgRctBal() {
        if (pdgRctBal == null) {
            pdgRctBal = new ArrayList<>();
        }
        return this.pdgRctBal;
    }

}
