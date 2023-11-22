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

package org.jpos.iso20022.colr_010_001_05;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherCollateral11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OtherCollateral11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CollId" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}Max35Text" minOccurs="0"/>
 *         <element name="AsstNb" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}Max35Text" minOccurs="0"/>
 *         <element name="LttrOfCdtId" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}Max35Text" minOccurs="0"/>
 *         <element name="LttrOfCdtAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="GrntAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="OthrTpOfColl" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}OtherTypeOfCollateral3" minOccurs="0"/>
 *         <element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}DateFormat14Choice" minOccurs="0"/>
 *         <element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}DateFormat14Choice" minOccurs="0"/>
 *         <element name="LtdCvrgInd" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}YesNoIndicator" minOccurs="0"/>
 *         <element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}PartyIdentification178Choice" minOccurs="0"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}ISODate" minOccurs="0"/>
 *         <element name="XchgRate" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}BaseOneRate" minOccurs="0"/>
 *         <element name="MktVal" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Hrcut" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}PercentageRate" minOccurs="0"/>
 *         <element name="CollVal" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}ActiveCurrencyAndAmount"/>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}SafekeepingPlaceFormat29Choice" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}SecuritiesAccount19" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}BlockChainAddressWallet3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherCollateral11", propOrder = {
    "collId",
    "asstNb",
    "lttrOfCdtId",
    "lttrOfCdtAmt",
    "grntAmt",
    "othrTpOfColl",
    "isseDt",
    "xpryDt",
    "ltdCvrgInd",
    "issr",
    "valDt",
    "xchgRate",
    "mktVal",
    "hrcut",
    "collVal",
    "sfkpgPlc",
    "sfkpgAcct",
    "blckChainAdrOrWllt"
})
public class OtherCollateral11 {

    @XmlElement(name = "CollId")
    protected String collId;
    @XmlElement(name = "AsstNb")
    protected String asstNb;
    @XmlElement(name = "LttrOfCdtId")
    protected String lttrOfCdtId;
    @XmlElement(name = "LttrOfCdtAmt")
    protected ActiveCurrencyAndAmount lttrOfCdtAmt;
    @XmlElement(name = "GrntAmt")
    protected ActiveCurrencyAndAmount grntAmt;
    @XmlElement(name = "OthrTpOfColl")
    protected OtherTypeOfCollateral3 othrTpOfColl;
    @XmlElement(name = "IsseDt")
    protected DateFormat14Choice isseDt;
    @XmlElement(name = "XpryDt")
    protected DateFormat14Choice xpryDt;
    @XmlElement(name = "LtdCvrgInd")
    protected Boolean ltdCvrgInd;
    @XmlElement(name = "Issr")
    protected PartyIdentification178Choice issr;
    @XmlElement(name = "ValDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDt;
    @XmlElement(name = "XchgRate")
    protected BigDecimal xchgRate;
    @XmlElement(name = "MktVal")
    protected ActiveCurrencyAndAmount mktVal;
    @XmlElement(name = "Hrcut")
    protected BigDecimal hrcut;
    @XmlElement(name = "CollVal", required = true)
    protected ActiveCurrencyAndAmount collVal;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat29Choice sfkpgPlc;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet3 blckChainAdrOrWllt;

    /**
     * Gets the value of the collId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollId() {
        return collId;
    }

    /**
     * Sets the value of the collId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollId(String value) {
        this.collId = value;
    }

    /**
     * Gets the value of the asstNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsstNb() {
        return asstNb;
    }

    /**
     * Sets the value of the asstNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsstNb(String value) {
        this.asstNb = value;
    }

    /**
     * Gets the value of the lttrOfCdtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLttrOfCdtId() {
        return lttrOfCdtId;
    }

    /**
     * Sets the value of the lttrOfCdtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLttrOfCdtId(String value) {
        this.lttrOfCdtId = value;
    }

    /**
     * Gets the value of the lttrOfCdtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getLttrOfCdtAmt() {
        return lttrOfCdtAmt;
    }

    /**
     * Sets the value of the lttrOfCdtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setLttrOfCdtAmt(ActiveCurrencyAndAmount value) {
        this.lttrOfCdtAmt = value;
    }

    /**
     * Gets the value of the grntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrntAmt() {
        return grntAmt;
    }

    /**
     * Sets the value of the grntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setGrntAmt(ActiveCurrencyAndAmount value) {
        this.grntAmt = value;
    }

    /**
     * Gets the value of the othrTpOfColl property.
     * 
     * @return
     *     possible object is
     *     {@link OtherTypeOfCollateral3 }
     *     
     */
    public OtherTypeOfCollateral3 getOthrTpOfColl() {
        return othrTpOfColl;
    }

    /**
     * Sets the value of the othrTpOfColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherTypeOfCollateral3 }
     *     
     */
    public void setOthrTpOfColl(OtherTypeOfCollateral3 value) {
        this.othrTpOfColl = value;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat14Choice }
     *     
     */
    public DateFormat14Choice getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat14Choice }
     *     
     */
    public void setIsseDt(DateFormat14Choice value) {
        this.isseDt = value;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat14Choice }
     *     
     */
    public DateFormat14Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat14Choice }
     *     
     */
    public void setXpryDt(DateFormat14Choice value) {
        this.xpryDt = value;
    }

    /**
     * Gets the value of the ltdCvrgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLtdCvrgInd() {
        return ltdCvrgInd;
    }

    /**
     * Sets the value of the ltdCvrgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLtdCvrgInd(Boolean value) {
        this.ltdCvrgInd = value;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public PartyIdentification178Choice getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public void setIssr(PartyIdentification178Choice value) {
        this.issr = value;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValDt(XMLGregorianCalendar value) {
        this.valDt = value;
    }

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXchgRate(BigDecimal value) {
        this.xchgRate = value;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setMktVal(ActiveCurrencyAndAmount value) {
        this.mktVal = value;
    }

    /**
     * Gets the value of the hrcut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHrcut() {
        return hrcut;
    }

    /**
     * Sets the value of the hrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHrcut(BigDecimal value) {
        this.hrcut = value;
    }

    /**
     * Gets the value of the collVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCollVal() {
        return collVal;
    }

    /**
     * Sets the value of the collVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCollVal(ActiveCurrencyAndAmount value) {
        this.collVal = value;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat29Choice }
     *     
     */
    public SafekeepingPlaceFormat29Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat29Choice }
     *     
     */
    public void setSfkpgPlc(SafekeepingPlaceFormat29Choice value) {
        this.sfkpgPlc = value;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public BlockChainAddressWallet3 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public void setBlckChainAdrOrWllt(BlockChainAddressWallet3 value) {
        this.blckChainAdrOrWllt = value;
    }

}
