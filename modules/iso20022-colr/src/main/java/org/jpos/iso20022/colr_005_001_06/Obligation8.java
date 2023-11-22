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

package org.jpos.iso20022.colr_005_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Obligation8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Obligation8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PtyA" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}PartyIdentification178Choice"/>
 *         <element name="SvcgPtyA" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}PartyIdentification178Choice" minOccurs="0"/>
 *         <element name="PtyB" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}PartyIdentification178Choice"/>
 *         <element name="SvcgPtyB" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}PartyIdentification178Choice" minOccurs="0"/>
 *         <element name="CollAcctId" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}CollateralAccount3" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}BlockChainAddressWallet5" minOccurs="0"/>
 *         <element name="XpsrTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}ExposureType21Choice" minOccurs="0"/>
 *         <element name="CollTxTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}CollateralTransactionType1Choice" minOccurs="0"/>
 *         <element name="CollSd" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}CollateralRole1Code" minOccurs="0"/>
 *         <element name="XpsrAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ValtnDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="ClsgDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}ClosingDate4Choice" minOccurs="0"/>
 *         <element name="ReqdExctnDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="SttlmPrc" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}GenericIdentification30" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Obligation8", propOrder = {
    "ptyA",
    "svcgPtyA",
    "ptyB",
    "svcgPtyB",
    "collAcctId",
    "blckChainAdrOrWllt",
    "xpsrTp",
    "collTxTp",
    "collSd",
    "xpsrAmt",
    "valtnDt",
    "clsgDt",
    "reqdExctnDt",
    "sttlmPrc"
})
public class Obligation8 {

    @XmlElement(name = "PtyA", required = true)
    protected PartyIdentification178Choice ptyA;
    @XmlElement(name = "SvcgPtyA")
    protected PartyIdentification178Choice svcgPtyA;
    @XmlElement(name = "PtyB", required = true)
    protected PartyIdentification178Choice ptyB;
    @XmlElement(name = "SvcgPtyB")
    protected PartyIdentification178Choice svcgPtyB;
    @XmlElement(name = "CollAcctId")
    protected CollateralAccount3 collAcctId;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet5 blckChainAdrOrWllt;
    @XmlElement(name = "XpsrTp")
    protected ExposureType21Choice xpsrTp;
    @XmlElement(name = "CollTxTp")
    protected CollateralTransactionType1Choice collTxTp;
    @XmlElement(name = "CollSd")
    @XmlSchemaType(name = "string")
    protected CollateralRole1Code collSd;
    @XmlElement(name = "XpsrAmt")
    protected ActiveOrHistoricCurrencyAndAmount xpsrAmt;
    @XmlElement(name = "ValtnDt")
    protected DateAndDateTime2Choice valtnDt;
    @XmlElement(name = "ClsgDt")
    protected ClosingDate4Choice clsgDt;
    @XmlElement(name = "ReqdExctnDt")
    protected DateAndDateTime2Choice reqdExctnDt;
    @XmlElement(name = "SttlmPrc")
    protected GenericIdentification30 sttlmPrc;

    /**
     * Gets the value of the ptyA property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public PartyIdentification178Choice getPtyA() {
        return ptyA;
    }

    /**
     * Sets the value of the ptyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public void setPtyA(PartyIdentification178Choice value) {
        this.ptyA = value;
    }

    /**
     * Gets the value of the svcgPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public PartyIdentification178Choice getSvcgPtyA() {
        return svcgPtyA;
    }

    /**
     * Sets the value of the svcgPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public void setSvcgPtyA(PartyIdentification178Choice value) {
        this.svcgPtyA = value;
    }

    /**
     * Gets the value of the ptyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public PartyIdentification178Choice getPtyB() {
        return ptyB;
    }

    /**
     * Sets the value of the ptyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public void setPtyB(PartyIdentification178Choice value) {
        this.ptyB = value;
    }

    /**
     * Gets the value of the svcgPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public PartyIdentification178Choice getSvcgPtyB() {
        return svcgPtyB;
    }

    /**
     * Sets the value of the svcgPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public void setSvcgPtyB(PartyIdentification178Choice value) {
        this.svcgPtyB = value;
    }

    /**
     * Gets the value of the collAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAccount3 }
     *     
     */
    public CollateralAccount3 getCollAcctId() {
        return collAcctId;
    }

    /**
     * Sets the value of the collAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAccount3 }
     *     
     */
    public void setCollAcctId(CollateralAccount3 value) {
        this.collAcctId = value;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet5 }
     *     
     */
    public BlockChainAddressWallet5 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet5 }
     *     
     */
    public void setBlckChainAdrOrWllt(BlockChainAddressWallet5 value) {
        this.blckChainAdrOrWllt = value;
    }

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType21Choice }
     *     
     */
    public ExposureType21Choice getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType21Choice }
     *     
     */
    public void setXpsrTp(ExposureType21Choice value) {
        this.xpsrTp = value;
    }

    /**
     * Gets the value of the collTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralTransactionType1Choice }
     *     
     */
    public CollateralTransactionType1Choice getCollTxTp() {
        return collTxTp;
    }

    /**
     * Sets the value of the collTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralTransactionType1Choice }
     *     
     */
    public void setCollTxTp(CollateralTransactionType1Choice value) {
        this.collTxTp = value;
    }

    /**
     * Gets the value of the collSd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralRole1Code }
     *     
     */
    public CollateralRole1Code getCollSd() {
        return collSd;
    }

    /**
     * Sets the value of the collSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralRole1Code }
     *     
     */
    public void setCollSd(CollateralRole1Code value) {
        this.collSd = value;
    }

    /**
     * Gets the value of the xpsrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getXpsrAmt() {
        return xpsrAmt;
    }

    /**
     * Sets the value of the xpsrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setXpsrAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.xpsrAmt = value;
    }

    /**
     * Gets the value of the valtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getValtnDt() {
        return valtnDt;
    }

    /**
     * Sets the value of the valtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setValtnDt(DateAndDateTime2Choice value) {
        this.valtnDt = value;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public ClosingDate4Choice getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public void setClsgDt(ClosingDate4Choice value) {
        this.clsgDt = value;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setReqdExctnDt(DateAndDateTime2Choice value) {
        this.reqdExctnDt = value;
    }

    /**
     * Gets the value of the sttlmPrc property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getSttlmPrc() {
        return sttlmPrc;
    }

    /**
     * Sets the value of the sttlmPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setSttlmPrc(GenericIdentification30 value) {
        this.sttlmPrc = value;
    }

}
