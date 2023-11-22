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

package org.jpos.iso20022.seev_042_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionBalance46 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionBalance46">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlElgblBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}Quantity49Choice"/>
 *         <element name="UinstdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}BalanceFormat11Choice"/>
 *         <element name="TtlInstdBalDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}InstructedBalance16"/>
 *         <element name="BlckdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="BrrwdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="CollInBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="CollOutBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="OnLnBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="OutForRegnBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="SttlmPosBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="StrtPosBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="TradDtPosBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="InTrnsShipmntBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="RegdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="OblgtdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="PdgDlvryBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}PendingBalance7" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PdgRctBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}PendingBalance7" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionBalance46", propOrder = {
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
public class CorporateActionBalance46 {

    @XmlElement(name = "TtlElgblBal", required = true)
    protected Quantity49Choice ttlElgblBal;
    @XmlElement(name = "UinstdBal", required = true)
    protected BalanceFormat11Choice uinstdBal;
    @XmlElement(name = "TtlInstdBalDtls", required = true)
    protected InstructedBalance16 ttlInstdBalDtls;
    @XmlElement(name = "BlckdBal")
    protected SignedQuantityFormat10 blckdBal;
    @XmlElement(name = "BrrwdBal")
    protected SignedQuantityFormat10 brrwdBal;
    @XmlElement(name = "CollInBal")
    protected SignedQuantityFormat10 collInBal;
    @XmlElement(name = "CollOutBal")
    protected SignedQuantityFormat10 collOutBal;
    @XmlElement(name = "OnLnBal")
    protected SignedQuantityFormat10 onLnBal;
    @XmlElement(name = "OutForRegnBal")
    protected SignedQuantityFormat10 outForRegnBal;
    @XmlElement(name = "SttlmPosBal")
    protected SignedQuantityFormat10 sttlmPosBal;
    @XmlElement(name = "StrtPosBal")
    protected SignedQuantityFormat10 strtPosBal;
    @XmlElement(name = "TradDtPosBal")
    protected SignedQuantityFormat10 tradDtPosBal;
    @XmlElement(name = "InTrnsShipmntBal")
    protected SignedQuantityFormat10 inTrnsShipmntBal;
    @XmlElement(name = "RegdBal")
    protected SignedQuantityFormat10 regdBal;
    @XmlElement(name = "OblgtdBal")
    protected SignedQuantityFormat10 oblgtdBal;
    @XmlElement(name = "PdgDlvryBal")
    protected List<PendingBalance7> pdgDlvryBal;
    @XmlElement(name = "PdgRctBal")
    protected List<PendingBalance7> pdgRctBal;

    /**
     * Gets the value of the ttlElgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity49Choice }
     *     
     */
    public Quantity49Choice getTtlElgblBal() {
        return ttlElgblBal;
    }

    /**
     * Sets the value of the ttlElgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity49Choice }
     *     
     */
    public void setTtlElgblBal(Quantity49Choice value) {
        this.ttlElgblBal = value;
    }

    /**
     * Gets the value of the uinstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat11Choice }
     *     
     */
    public BalanceFormat11Choice getUinstdBal() {
        return uinstdBal;
    }

    /**
     * Sets the value of the uinstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat11Choice }
     *     
     */
    public void setUinstdBal(BalanceFormat11Choice value) {
        this.uinstdBal = value;
    }

    /**
     * Gets the value of the ttlInstdBalDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InstructedBalance16 }
     *     
     */
    public InstructedBalance16 getTtlInstdBalDtls() {
        return ttlInstdBalDtls;
    }

    /**
     * Sets the value of the ttlInstdBalDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructedBalance16 }
     *     
     */
    public void setTtlInstdBalDtls(InstructedBalance16 value) {
        this.ttlInstdBalDtls = value;
    }

    /**
     * Gets the value of the blckdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getBlckdBal() {
        return blckdBal;
    }

    /**
     * Sets the value of the blckdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setBlckdBal(SignedQuantityFormat10 value) {
        this.blckdBal = value;
    }

    /**
     * Gets the value of the brrwdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getBrrwdBal() {
        return brrwdBal;
    }

    /**
     * Sets the value of the brrwdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setBrrwdBal(SignedQuantityFormat10 value) {
        this.brrwdBal = value;
    }

    /**
     * Gets the value of the collInBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getCollInBal() {
        return collInBal;
    }

    /**
     * Sets the value of the collInBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setCollInBal(SignedQuantityFormat10 value) {
        this.collInBal = value;
    }

    /**
     * Gets the value of the collOutBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getCollOutBal() {
        return collOutBal;
    }

    /**
     * Sets the value of the collOutBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setCollOutBal(SignedQuantityFormat10 value) {
        this.collOutBal = value;
    }

    /**
     * Gets the value of the onLnBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getOnLnBal() {
        return onLnBal;
    }

    /**
     * Sets the value of the onLnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setOnLnBal(SignedQuantityFormat10 value) {
        this.onLnBal = value;
    }

    /**
     * Gets the value of the outForRegnBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getOutForRegnBal() {
        return outForRegnBal;
    }

    /**
     * Sets the value of the outForRegnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setOutForRegnBal(SignedQuantityFormat10 value) {
        this.outForRegnBal = value;
    }

    /**
     * Gets the value of the sttlmPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getSttlmPosBal() {
        return sttlmPosBal;
    }

    /**
     * Sets the value of the sttlmPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setSttlmPosBal(SignedQuantityFormat10 value) {
        this.sttlmPosBal = value;
    }

    /**
     * Gets the value of the strtPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getStrtPosBal() {
        return strtPosBal;
    }

    /**
     * Sets the value of the strtPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setStrtPosBal(SignedQuantityFormat10 value) {
        this.strtPosBal = value;
    }

    /**
     * Gets the value of the tradDtPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getTradDtPosBal() {
        return tradDtPosBal;
    }

    /**
     * Sets the value of the tradDtPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setTradDtPosBal(SignedQuantityFormat10 value) {
        this.tradDtPosBal = value;
    }

    /**
     * Gets the value of the inTrnsShipmntBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getInTrnsShipmntBal() {
        return inTrnsShipmntBal;
    }

    /**
     * Sets the value of the inTrnsShipmntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setInTrnsShipmntBal(SignedQuantityFormat10 value) {
        this.inTrnsShipmntBal = value;
    }

    /**
     * Gets the value of the regdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getRegdBal() {
        return regdBal;
    }

    /**
     * Sets the value of the regdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setRegdBal(SignedQuantityFormat10 value) {
        this.regdBal = value;
    }

    /**
     * Gets the value of the oblgtdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getOblgtdBal() {
        return oblgtdBal;
    }

    /**
     * Sets the value of the oblgtdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setOblgtdBal(SignedQuantityFormat10 value) {
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
     * {@link PendingBalance7 }
     * 
     * 
     * @return
     *     The value of the pdgDlvryBal property.
     */
    public List<PendingBalance7> getPdgDlvryBal() {
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
     * {@link PendingBalance7 }
     * 
     * 
     * @return
     *     The value of the pdgRctBal property.
     */
    public List<PendingBalance7> getPdgRctBal() {
        if (pdgRctBal == null) {
            pdgRctBal = new ArrayList<>();
        }
        return this.pdgRctBal;
    }

}
