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

package org.jpos.iso20022.cain_017_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointOfServiceContext4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PointOfServiceContext4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CardPres" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="CrdhldrPres" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="CrdhldrActvtd" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="TrnspndrInittd" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AttnddInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="UattnddLvlCtgy" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Max35NumericText" minOccurs="0"/>
 *         <element name="EComrcInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="EComrcData" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}ECommerceData1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MOTOCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}MOTO1Code" minOccurs="0"/>
 *         <element name="TrnstInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="PrtlApprvlSpprtd" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="DelydAuthstnInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="SctyChrtcs" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}SecurityCharacteristics1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OthrSctyChrtcs" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Max35Text" minOccurs="0"/>
 *         <element name="CardDataNtryMd" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}CardDataReading10Code" minOccurs="0"/>
 *         <element name="OthrCardDataNtryMd" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Max35Text" minOccurs="0"/>
 *         <element name="QRCdPresntmntMd" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}QRCodePresentmentMode1Code" minOccurs="0"/>
 *         <element name="OthrQRCdPresntmntMd" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Max35Text" minOccurs="0"/>
 *         <element name="TempScrCardDataReusd" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="StorgLctn" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Max35Text" minOccurs="0"/>
 *         <element name="SpclConds" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}SpecialConditions1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfServiceContext4", propOrder = {
    "cardPres",
    "crdhldrPres",
    "crdhldrActvtd",
    "trnspndrInittd",
    "attnddInd",
    "uattnddLvlCtgy",
    "eComrcInd",
    "eComrcData",
    "motoCd",
    "trnstInd",
    "prtlApprvlSpprtd",
    "delydAuthstnInd",
    "sctyChrtcs",
    "othrSctyChrtcs",
    "cardDataNtryMd",
    "othrCardDataNtryMd",
    "qrCdPresntmntMd",
    "othrQRCdPresntmntMd",
    "tempScrCardDataReusd",
    "storgLctn",
    "spclConds"
})
public class PointOfServiceContext4 {

    @XmlElement(name = "CardPres")
    protected Boolean cardPres;
    @XmlElement(name = "CrdhldrPres")
    protected Boolean crdhldrPres;
    @XmlElement(name = "CrdhldrActvtd")
    protected Boolean crdhldrActvtd;
    @XmlElement(name = "TrnspndrInittd")
    protected Boolean trnspndrInittd;
    @XmlElement(name = "AttnddInd")
    protected Boolean attnddInd;
    @XmlElement(name = "UattnddLvlCtgy")
    protected String uattnddLvlCtgy;
    @XmlElement(name = "EComrcInd")
    protected Boolean eComrcInd;
    @XmlElement(name = "EComrcData")
    protected List<ECommerceData1> eComrcData;
    @XmlElement(name = "MOTOCd")
    @XmlSchemaType(name = "string")
    protected MOTO1Code motoCd;
    @XmlElement(name = "TrnstInd")
    protected Boolean trnstInd;
    @XmlElement(name = "PrtlApprvlSpprtd")
    protected Boolean prtlApprvlSpprtd;
    @XmlElement(name = "DelydAuthstnInd")
    protected Boolean delydAuthstnInd;
    @XmlElement(name = "SctyChrtcs")
    @XmlSchemaType(name = "string")
    protected List<SecurityCharacteristics1Code> sctyChrtcs;
    @XmlElement(name = "OthrSctyChrtcs")
    protected String othrSctyChrtcs;
    @XmlElement(name = "CardDataNtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading10Code cardDataNtryMd;
    @XmlElement(name = "OthrCardDataNtryMd")
    protected String othrCardDataNtryMd;
    @XmlElement(name = "QRCdPresntmntMd")
    @XmlSchemaType(name = "string")
    protected QRCodePresentmentMode1Code qrCdPresntmntMd;
    @XmlElement(name = "OthrQRCdPresntmntMd")
    protected String othrQRCdPresntmntMd;
    @XmlElement(name = "TempScrCardDataReusd")
    protected Boolean tempScrCardDataReusd;
    @XmlElement(name = "StorgLctn")
    protected String storgLctn;
    @XmlElement(name = "SpclConds")
    protected List<SpecialConditions1> spclConds;

    /**
     * Gets the value of the cardPres property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardPres() {
        return cardPres;
    }

    /**
     * Sets the value of the cardPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardPres(Boolean value) {
        this.cardPres = value;
    }

    /**
     * Gets the value of the crdhldrPres property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrdhldrPres() {
        return crdhldrPres;
    }

    /**
     * Sets the value of the crdhldrPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrdhldrPres(Boolean value) {
        this.crdhldrPres = value;
    }

    /**
     * Gets the value of the crdhldrActvtd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrdhldrActvtd() {
        return crdhldrActvtd;
    }

    /**
     * Sets the value of the crdhldrActvtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrdhldrActvtd(Boolean value) {
        this.crdhldrActvtd = value;
    }

    /**
     * Gets the value of the trnspndrInittd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrnspndrInittd() {
        return trnspndrInittd;
    }

    /**
     * Sets the value of the trnspndrInittd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrnspndrInittd(Boolean value) {
        this.trnspndrInittd = value;
    }

    /**
     * Gets the value of the attnddInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttnddInd() {
        return attnddInd;
    }

    /**
     * Sets the value of the attnddInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttnddInd(Boolean value) {
        this.attnddInd = value;
    }

    /**
     * Gets the value of the uattnddLvlCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUattnddLvlCtgy() {
        return uattnddLvlCtgy;
    }

    /**
     * Sets the value of the uattnddLvlCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUattnddLvlCtgy(String value) {
        this.uattnddLvlCtgy = value;
    }

    /**
     * Gets the value of the eComrcInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEComrcInd() {
        return eComrcInd;
    }

    /**
     * Sets the value of the eComrcInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEComrcInd(Boolean value) {
        this.eComrcInd = value;
    }

    /**
     * Gets the value of the eComrcData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the eComrcData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEComrcData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ECommerceData1 }
     * 
     * 
     * @return
     *     The value of the eComrcData property.
     */
    public List<ECommerceData1> getEComrcData() {
        if (eComrcData == null) {
            eComrcData = new ArrayList<>();
        }
        return this.eComrcData;
    }

    /**
     * Gets the value of the motoCd property.
     * 
     * @return
     *     possible object is
     *     {@link MOTO1Code }
     *     
     */
    public MOTO1Code getMOTOCd() {
        return motoCd;
    }

    /**
     * Sets the value of the motoCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOTO1Code }
     *     
     */
    public void setMOTOCd(MOTO1Code value) {
        this.motoCd = value;
    }

    /**
     * Gets the value of the trnstInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrnstInd() {
        return trnstInd;
    }

    /**
     * Sets the value of the trnstInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrnstInd(Boolean value) {
        this.trnstInd = value;
    }

    /**
     * Gets the value of the prtlApprvlSpprtd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlApprvlSpprtd() {
        return prtlApprvlSpprtd;
    }

    /**
     * Sets the value of the prtlApprvlSpprtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrtlApprvlSpprtd(Boolean value) {
        this.prtlApprvlSpprtd = value;
    }

    /**
     * Gets the value of the delydAuthstnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelydAuthstnInd() {
        return delydAuthstnInd;
    }

    /**
     * Sets the value of the delydAuthstnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelydAuthstnInd(Boolean value) {
        this.delydAuthstnInd = value;
    }

    /**
     * Gets the value of the sctyChrtcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctyChrtcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctyChrtcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityCharacteristics1Code }
     * 
     * 
     * @return
     *     The value of the sctyChrtcs property.
     */
    public List<SecurityCharacteristics1Code> getSctyChrtcs() {
        if (sctyChrtcs == null) {
            sctyChrtcs = new ArrayList<>();
        }
        return this.sctyChrtcs;
    }

    /**
     * Gets the value of the othrSctyChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrSctyChrtcs() {
        return othrSctyChrtcs;
    }

    /**
     * Sets the value of the othrSctyChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrSctyChrtcs(String value) {
        this.othrSctyChrtcs = value;
    }

    /**
     * Gets the value of the cardDataNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading10Code }
     *     
     */
    public CardDataReading10Code getCardDataNtryMd() {
        return cardDataNtryMd;
    }

    /**
     * Sets the value of the cardDataNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading10Code }
     *     
     */
    public void setCardDataNtryMd(CardDataReading10Code value) {
        this.cardDataNtryMd = value;
    }

    /**
     * Gets the value of the othrCardDataNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrCardDataNtryMd() {
        return othrCardDataNtryMd;
    }

    /**
     * Sets the value of the othrCardDataNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrCardDataNtryMd(String value) {
        this.othrCardDataNtryMd = value;
    }

    /**
     * Gets the value of the qrCdPresntmntMd property.
     * 
     * @return
     *     possible object is
     *     {@link QRCodePresentmentMode1Code }
     *     
     */
    public QRCodePresentmentMode1Code getQRCdPresntmntMd() {
        return qrCdPresntmntMd;
    }

    /**
     * Sets the value of the qrCdPresntmntMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link QRCodePresentmentMode1Code }
     *     
     */
    public void setQRCdPresntmntMd(QRCodePresentmentMode1Code value) {
        this.qrCdPresntmntMd = value;
    }

    /**
     * Gets the value of the othrQRCdPresntmntMd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrQRCdPresntmntMd() {
        return othrQRCdPresntmntMd;
    }

    /**
     * Sets the value of the othrQRCdPresntmntMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrQRCdPresntmntMd(String value) {
        this.othrQRCdPresntmntMd = value;
    }

    /**
     * Gets the value of the tempScrCardDataReusd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTempScrCardDataReusd() {
        return tempScrCardDataReusd;
    }

    /**
     * Sets the value of the tempScrCardDataReusd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTempScrCardDataReusd(Boolean value) {
        this.tempScrCardDataReusd = value;
    }

    /**
     * Gets the value of the storgLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorgLctn() {
        return storgLctn;
    }

    /**
     * Sets the value of the storgLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorgLctn(String value) {
        this.storgLctn = value;
    }

    /**
     * Gets the value of the spclConds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the spclConds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpclConds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialConditions1 }
     * 
     * 
     * @return
     *     The value of the spclConds property.
     */
    public List<SpecialConditions1> getSpclConds() {
        if (spclConds == null) {
            spclConds = new ArrayList<>();
        }
        return this.spclConds;
    }

}
