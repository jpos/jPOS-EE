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

package org.jpos.iso20022.seev_033_001_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionOption198 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionOption198">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OptnNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}OptionNumber1Choice"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}CorporateActionOption40Choice"/>
 *         <element name="OptnFeatrs" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}OptionFeaturesFormat25Choice" minOccurs="0"/>
 *         <element name="FrctnDspstn" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}FractionDispositionType28Choice" minOccurs="0"/>
 *         <element name="ChngTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}CorporateActionChangeTypeFormat6Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ElgblForCollInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}YesNoIndicator" minOccurs="0"/>
 *         <element name="SlctnDealrFeeInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}YesNoIndicator" minOccurs="0"/>
 *         <element name="CcyToBuy" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="CcyToSell" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="CcyOptn" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="SctyId" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}SecurityIdentification19" minOccurs="0"/>
 *         <element name="SctiesQtyOrInstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}SecuritiesQuantityOrAmount6Choice"/>
 *         <element name="ExctnReqdDtTm" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="RateAndAmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}CorporateActionRate71" minOccurs="0"/>
 *         <element name="PricDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}CorporateActionPrice76" minOccurs="0"/>
 *         <element name="ShrhldrNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}Max25Text" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}CorporateActionNarrative32" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionOption198", propOrder = {
    "optnNb",
    "optnTp",
    "optnFeatrs",
    "frctnDspstn",
    "chngTp",
    "elgblForCollInd",
    "slctnDealrFeeInd",
    "ccyToBuy",
    "ccyToSell",
    "ccyOptn",
    "sctyId",
    "sctiesQtyOrInstdAmt",
    "exctnReqdDtTm",
    "rateAndAmtDtls",
    "pricDtls",
    "shrhldrNb",
    "addtlInf"
})
public class CorporateActionOption198 {

    @XmlElement(name = "OptnNb", required = true)
    protected OptionNumber1Choice optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption40Choice optnTp;
    @XmlElement(name = "OptnFeatrs")
    protected OptionFeaturesFormat25Choice optnFeatrs;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType28Choice frctnDspstn;
    @XmlElement(name = "ChngTp")
    protected List<CorporateActionChangeTypeFormat6Choice> chngTp;
    @XmlElement(name = "ElgblForCollInd")
    protected Boolean elgblForCollInd;
    @XmlElement(name = "SlctnDealrFeeInd")
    protected Boolean slctnDealrFeeInd;
    @XmlElement(name = "CcyToBuy")
    protected String ccyToBuy;
    @XmlElement(name = "CcyToSell")
    protected String ccyToSell;
    @XmlElement(name = "CcyOptn")
    protected String ccyOptn;
    @XmlElement(name = "SctyId")
    protected SecurityIdentification19 sctyId;
    @XmlElement(name = "SctiesQtyOrInstdAmt", required = true)
    protected SecuritiesQuantityOrAmount6Choice sctiesQtyOrInstdAmt;
    @XmlElement(name = "ExctnReqdDtTm")
    protected DateAndDateTime2Choice exctnReqdDtTm;
    @XmlElement(name = "RateAndAmtDtls")
    protected CorporateActionRate71 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice76 pricDtls;
    @XmlElement(name = "ShrhldrNb")
    protected String shrhldrNb;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative32 addtlInf;

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link OptionNumber1Choice }
     *     
     */
    public OptionNumber1Choice getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionNumber1Choice }
     *     
     */
    public void setOptnNb(OptionNumber1Choice value) {
        this.optnNb = value;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption40Choice }
     *     
     */
    public CorporateActionOption40Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption40Choice }
     *     
     */
    public void setOptnTp(CorporateActionOption40Choice value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the optnFeatrs property.
     * 
     * @return
     *     possible object is
     *     {@link OptionFeaturesFormat25Choice }
     *     
     */
    public OptionFeaturesFormat25Choice getOptnFeatrs() {
        return optnFeatrs;
    }

    /**
     * Sets the value of the optnFeatrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionFeaturesFormat25Choice }
     *     
     */
    public void setOptnFeatrs(OptionFeaturesFormat25Choice value) {
        this.optnFeatrs = value;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType28Choice }
     *     
     */
    public FractionDispositionType28Choice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType28Choice }
     *     
     */
    public void setFrctnDspstn(FractionDispositionType28Choice value) {
        this.frctnDspstn = value;
    }

    /**
     * Gets the value of the chngTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chngTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChngTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionChangeTypeFormat6Choice }
     * 
     * 
     * @return
     *     The value of the chngTp property.
     */
    public List<CorporateActionChangeTypeFormat6Choice> getChngTp() {
        if (chngTp == null) {
            chngTp = new ArrayList<>();
        }
        return this.chngTp;
    }

    /**
     * Gets the value of the elgblForCollInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElgblForCollInd() {
        return elgblForCollInd;
    }

    /**
     * Sets the value of the elgblForCollInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElgblForCollInd(Boolean value) {
        this.elgblForCollInd = value;
    }

    /**
     * Gets the value of the slctnDealrFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSlctnDealrFeeInd() {
        return slctnDealrFeeInd;
    }

    /**
     * Sets the value of the slctnDealrFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSlctnDealrFeeInd(Boolean value) {
        this.slctnDealrFeeInd = value;
    }

    /**
     * Gets the value of the ccyToBuy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyToBuy() {
        return ccyToBuy;
    }

    /**
     * Sets the value of the ccyToBuy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcyToBuy(String value) {
        this.ccyToBuy = value;
    }

    /**
     * Gets the value of the ccyToSell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyToSell() {
        return ccyToSell;
    }

    /**
     * Sets the value of the ccyToSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcyToSell(String value) {
        this.ccyToSell = value;
    }

    /**
     * Gets the value of the ccyOptn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyOptn() {
        return ccyOptn;
    }

    /**
     * Sets the value of the ccyOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcyOptn(String value) {
        this.ccyOptn = value;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setSctyId(SecurityIdentification19 value) {
        this.sctyId = value;
    }

    /**
     * Gets the value of the sctiesQtyOrInstdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesQuantityOrAmount6Choice }
     *     
     */
    public SecuritiesQuantityOrAmount6Choice getSctiesQtyOrInstdAmt() {
        return sctiesQtyOrInstdAmt;
    }

    /**
     * Sets the value of the sctiesQtyOrInstdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesQuantityOrAmount6Choice }
     *     
     */
    public void setSctiesQtyOrInstdAmt(SecuritiesQuantityOrAmount6Choice value) {
        this.sctiesQtyOrInstdAmt = value;
    }

    /**
     * Gets the value of the exctnReqdDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getExctnReqdDtTm() {
        return exctnReqdDtTm;
    }

    /**
     * Sets the value of the exctnReqdDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setExctnReqdDtTm(DateAndDateTime2Choice value) {
        this.exctnReqdDtTm = value;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate71 }
     *     
     */
    public CorporateActionRate71 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate71 }
     *     
     */
    public void setRateAndAmtDtls(CorporateActionRate71 value) {
        this.rateAndAmtDtls = value;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice76 }
     *     
     */
    public CorporateActionPrice76 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice76 }
     *     
     */
    public void setPricDtls(CorporateActionPrice76 value) {
        this.pricDtls = value;
    }

    /**
     * Gets the value of the shrhldrNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrhldrNb() {
        return shrhldrNb;
    }

    /**
     * Sets the value of the shrhldrNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShrhldrNb(String value) {
        this.shrhldrNb = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative32 }
     *     
     */
    public CorporateActionNarrative32 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative32 }
     *     
     */
    public void setAddtlInf(CorporateActionNarrative32 value) {
        this.addtlInf = value;
    }

}
