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

package org.jpos.iso20022.seev_033_002_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionBalanceDetails44 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionBalanceDetails44">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlElgblBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}Quantity80Choice" minOccurs="0"/>
 *         <element name="BlckdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="BrrwdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="CollInBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="CollOutBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="OnLnBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="PdgDlvryBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}BalanceFormat14Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PdgRctBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}BalanceFormat14Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OutForRegnBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="SttlmPosBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="StrtPosBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="TradDtPosBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="InTrnsShipmntBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="RegdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}BalanceFormat14Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionBalanceDetails44", propOrder = {
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
    "regdBal"
})
public class CorporateActionBalanceDetails44 {

    @XmlElement(name = "TtlElgblBal")
    protected Quantity80Choice ttlElgblBal;
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
    protected List<BalanceFormat14Choice> pdgDlvryBal;
    @XmlElement(name = "PdgRctBal")
    protected List<BalanceFormat14Choice> pdgRctBal;
    @XmlElement(name = "OutForRegnBal")
    protected BalanceFormat14Choice outForRegnBal;
    @XmlElement(name = "SttlmPosBal")
    protected BalanceFormat14Choice sttlmPosBal;
    @XmlElement(name = "StrtPosBal")
    protected BalanceFormat14Choice strtPosBal;
    @XmlElement(name = "TradDtPosBal")
    protected BalanceFormat14Choice tradDtPosBal;
    @XmlElement(name = "InTrnsShipmntBal")
    protected BalanceFormat14Choice inTrnsShipmntBal;
    @XmlElement(name = "RegdBal")
    protected BalanceFormat14Choice regdBal;

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
     * {@link BalanceFormat14Choice }
     * 
     * 
     * @return
     *     The value of the pdgDlvryBal property.
     */
    public List<BalanceFormat14Choice> getPdgDlvryBal() {
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
     * {@link BalanceFormat14Choice }
     * 
     * 
     * @return
     *     The value of the pdgRctBal property.
     */
    public List<BalanceFormat14Choice> getPdgRctBal() {
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
     * @return
     *     possible object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public BalanceFormat14Choice getSttlmPosBal() {
        return sttlmPosBal;
    }

    /**
     * Sets the value of the sttlmPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public void setSttlmPosBal(BalanceFormat14Choice value) {
        this.sttlmPosBal = value;
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

}
