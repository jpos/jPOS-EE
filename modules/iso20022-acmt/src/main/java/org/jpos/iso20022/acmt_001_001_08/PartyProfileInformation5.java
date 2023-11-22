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
 * <p>Java class for PartyProfileInformation5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyProfileInformation5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CertfctnInd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}YesNoIndicator" minOccurs="0"/>
 *         <element name="VldtngPty" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max140Text" minOccurs="0"/>
 *         <element name="ChckngPty" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max140Text" minOccurs="0"/>
 *         <element name="RspnsblPty" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max140Text" minOccurs="0"/>
 *         <element name="CertTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}CertificationType1Choice" minOccurs="0"/>
 *         <element name="ChckngDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}ISODate" minOccurs="0"/>
 *         <element name="ChckngFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}EventFrequency1Code" minOccurs="0"/>
 *         <element name="NxtRvsnDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}ISODate" minOccurs="0"/>
 *         <element name="SlryRg" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max35Text" minOccurs="0"/>
 *         <element name="SrcOfWlth" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max140Text" minOccurs="0"/>
 *         <element name="CstmrCndctClssfctn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}CustomerConductClassification1Choice" minOccurs="0"/>
 *         <element name="RskLvl" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}RiskLevel2Choice" minOccurs="0"/>
 *         <element name="KnowYourCstmrChckTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}KYCCheckType1Choice" minOccurs="0"/>
 *         <element name="KnowYourCstmrDBChck" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}DataBaseCheck1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyProfileInformation5", propOrder = {
    "certfctnInd",
    "vldtngPty",
    "chckngPty",
    "rspnsblPty",
    "certTp",
    "chckngDt",
    "chckngFrqcy",
    "nxtRvsnDt",
    "slryRg",
    "srcOfWlth",
    "cstmrCndctClssfctn",
    "rskLvl",
    "knowYourCstmrChckTp",
    "knowYourCstmrDBChck"
})
public class PartyProfileInformation5 {

    @XmlElement(name = "CertfctnInd")
    protected Boolean certfctnInd;
    @XmlElement(name = "VldtngPty")
    protected String vldtngPty;
    @XmlElement(name = "ChckngPty")
    protected String chckngPty;
    @XmlElement(name = "RspnsblPty")
    protected String rspnsblPty;
    @XmlElement(name = "CertTp")
    protected CertificationType1Choice certTp;
    @XmlElement(name = "ChckngDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar chckngDt;
    @XmlElement(name = "ChckngFrqcy")
    @XmlSchemaType(name = "string")
    protected EventFrequency1Code chckngFrqcy;
    @XmlElement(name = "NxtRvsnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nxtRvsnDt;
    @XmlElement(name = "SlryRg")
    protected String slryRg;
    @XmlElement(name = "SrcOfWlth")
    protected String srcOfWlth;
    @XmlElement(name = "CstmrCndctClssfctn")
    protected CustomerConductClassification1Choice cstmrCndctClssfctn;
    @XmlElement(name = "RskLvl")
    protected RiskLevel2Choice rskLvl;
    @XmlElement(name = "KnowYourCstmrChckTp")
    protected KYCCheckType1Choice knowYourCstmrChckTp;
    @XmlElement(name = "KnowYourCstmrDBChck")
    protected DataBaseCheck1 knowYourCstmrDBChck;

    /**
     * Gets the value of the certfctnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCertfctnInd() {
        return certfctnInd;
    }

    /**
     * Sets the value of the certfctnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCertfctnInd(Boolean value) {
        this.certfctnInd = value;
    }

    /**
     * Gets the value of the vldtngPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVldtngPty() {
        return vldtngPty;
    }

    /**
     * Sets the value of the vldtngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVldtngPty(String value) {
        this.vldtngPty = value;
    }

    /**
     * Gets the value of the chckngPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChckngPty() {
        return chckngPty;
    }

    /**
     * Sets the value of the chckngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChckngPty(String value) {
        this.chckngPty = value;
    }

    /**
     * Gets the value of the rspnsblPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnsblPty() {
        return rspnsblPty;
    }

    /**
     * Sets the value of the rspnsblPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspnsblPty(String value) {
        this.rspnsblPty = value;
    }

    /**
     * Gets the value of the certTp property.
     * 
     * @return
     *     possible object is
     *     {@link CertificationType1Choice }
     *     
     */
    public CertificationType1Choice getCertTp() {
        return certTp;
    }

    /**
     * Sets the value of the certTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationType1Choice }
     *     
     */
    public void setCertTp(CertificationType1Choice value) {
        this.certTp = value;
    }

    /**
     * Gets the value of the chckngDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChckngDt() {
        return chckngDt;
    }

    /**
     * Sets the value of the chckngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChckngDt(XMLGregorianCalendar value) {
        this.chckngDt = value;
    }

    /**
     * Gets the value of the chckngFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency1Code }
     *     
     */
    public EventFrequency1Code getChckngFrqcy() {
        return chckngFrqcy;
    }

    /**
     * Sets the value of the chckngFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency1Code }
     *     
     */
    public void setChckngFrqcy(EventFrequency1Code value) {
        this.chckngFrqcy = value;
    }

    /**
     * Gets the value of the nxtRvsnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNxtRvsnDt() {
        return nxtRvsnDt;
    }

    /**
     * Sets the value of the nxtRvsnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNxtRvsnDt(XMLGregorianCalendar value) {
        this.nxtRvsnDt = value;
    }

    /**
     * Gets the value of the slryRg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlryRg() {
        return slryRg;
    }

    /**
     * Sets the value of the slryRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlryRg(String value) {
        this.slryRg = value;
    }

    /**
     * Gets the value of the srcOfWlth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcOfWlth() {
        return srcOfWlth;
    }

    /**
     * Sets the value of the srcOfWlth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcOfWlth(String value) {
        this.srcOfWlth = value;
    }

    /**
     * Gets the value of the cstmrCndctClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerConductClassification1Choice }
     *     
     */
    public CustomerConductClassification1Choice getCstmrCndctClssfctn() {
        return cstmrCndctClssfctn;
    }

    /**
     * Sets the value of the cstmrCndctClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerConductClassification1Choice }
     *     
     */
    public void setCstmrCndctClssfctn(CustomerConductClassification1Choice value) {
        this.cstmrCndctClssfctn = value;
    }

    /**
     * Gets the value of the rskLvl property.
     * 
     * @return
     *     possible object is
     *     {@link RiskLevel2Choice }
     *     
     */
    public RiskLevel2Choice getRskLvl() {
        return rskLvl;
    }

    /**
     * Sets the value of the rskLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskLevel2Choice }
     *     
     */
    public void setRskLvl(RiskLevel2Choice value) {
        this.rskLvl = value;
    }

    /**
     * Gets the value of the knowYourCstmrChckTp property.
     * 
     * @return
     *     possible object is
     *     {@link KYCCheckType1Choice }
     *     
     */
    public KYCCheckType1Choice getKnowYourCstmrChckTp() {
        return knowYourCstmrChckTp;
    }

    /**
     * Sets the value of the knowYourCstmrChckTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link KYCCheckType1Choice }
     *     
     */
    public void setKnowYourCstmrChckTp(KYCCheckType1Choice value) {
        this.knowYourCstmrChckTp = value;
    }

    /**
     * Gets the value of the knowYourCstmrDBChck property.
     * 
     * @return
     *     possible object is
     *     {@link DataBaseCheck1 }
     *     
     */
    public DataBaseCheck1 getKnowYourCstmrDBChck() {
        return knowYourCstmrDBChck;
    }

    /**
     * Sets the value of the knowYourCstmrDBChck property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataBaseCheck1 }
     *     
     */
    public void setKnowYourCstmrDBChck(DataBaseCheck1 value) {
        this.knowYourCstmrDBChck = value;
    }

}
