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

package org.jpos.iso20022.seev_036_002_14;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionOption213 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionOption213">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OptnNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}OptionNumber1Choice"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CorporateActionOption39Choice"/>
 *         <element name="OptnFeatrs" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}OptionFeaturesFormat19Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FrctnDspstn" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}FractionDispositionType30Choice" minOccurs="0"/>
 *         <element name="CcyOptn" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="DtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CorporateActionDate91" minOccurs="0"/>
 *         <element name="PrdDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CorporateActionPeriod13" minOccurs="0"/>
 *         <element name="RateAndAmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CorporateActionRate108" minOccurs="0"/>
 *         <element name="PricDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CorporateActionPrice63" minOccurs="0"/>
 *         <element name="PlcOfTrad" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}MarketIdentification90" minOccurs="0"/>
 *         <element name="SctiesMvmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}SecuritiesOption95" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CshMvmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CashOption87" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionOption213", propOrder = {
    "optnNb",
    "optnTp",
    "optnFeatrs",
    "frctnDspstn",
    "ccyOptn",
    "dtDtls",
    "prdDtls",
    "rateAndAmtDtls",
    "pricDtls",
    "plcOfTrad",
    "sctiesMvmntDtls",
    "cshMvmntDtls"
})
public class CorporateActionOption213 {

    @XmlElement(name = "OptnNb", required = true)
    protected OptionNumber1Choice optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption39Choice optnTp;
    @XmlElement(name = "OptnFeatrs")
    protected List<OptionFeaturesFormat19Choice> optnFeatrs;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType30Choice frctnDspstn;
    @XmlElement(name = "CcyOptn")
    protected String ccyOptn;
    @XmlElement(name = "DtDtls")
    protected CorporateActionDate91 dtDtls;
    @XmlElement(name = "PrdDtls")
    protected CorporateActionPeriod13 prdDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected CorporateActionRate108 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice63 pricDtls;
    @XmlElement(name = "PlcOfTrad")
    protected MarketIdentification90 plcOfTrad;
    @XmlElement(name = "SctiesMvmntDtls")
    protected List<SecuritiesOption95> sctiesMvmntDtls;
    @XmlElement(name = "CshMvmntDtls")
    protected List<CashOption87> cshMvmntDtls;

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
     *     {@link CorporateActionOption39Choice }
     *     
     */
    public CorporateActionOption39Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption39Choice }
     *     
     */
    public void setOptnTp(CorporateActionOption39Choice value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the optnFeatrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the optnFeatrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnFeatrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionFeaturesFormat19Choice }
     * 
     * 
     * @return
     *     The value of the optnFeatrs property.
     */
    public List<OptionFeaturesFormat19Choice> getOptnFeatrs() {
        if (optnFeatrs == null) {
            optnFeatrs = new ArrayList<>();
        }
        return this.optnFeatrs;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType30Choice }
     *     
     */
    public FractionDispositionType30Choice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType30Choice }
     *     
     */
    public void setFrctnDspstn(FractionDispositionType30Choice value) {
        this.frctnDspstn = value;
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
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate91 }
     *     
     */
    public CorporateActionDate91 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate91 }
     *     
     */
    public void setDtDtls(CorporateActionDate91 value) {
        this.dtDtls = value;
    }

    /**
     * Gets the value of the prdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPeriod13 }
     *     
     */
    public CorporateActionPeriod13 getPrdDtls() {
        return prdDtls;
    }

    /**
     * Sets the value of the prdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPeriod13 }
     *     
     */
    public void setPrdDtls(CorporateActionPeriod13 value) {
        this.prdDtls = value;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate108 }
     *     
     */
    public CorporateActionRate108 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate108 }
     *     
     */
    public void setRateAndAmtDtls(CorporateActionRate108 value) {
        this.rateAndAmtDtls = value;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice63 }
     *     
     */
    public CorporateActionPrice63 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice63 }
     *     
     */
    public void setPricDtls(CorporateActionPrice63 value) {
        this.pricDtls = value;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification90 }
     *     
     */
    public MarketIdentification90 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification90 }
     *     
     */
    public void setPlcOfTrad(MarketIdentification90 value) {
        this.plcOfTrad = value;
    }

    /**
     * Gets the value of the sctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesOption95 }
     * 
     * 
     * @return
     *     The value of the sctiesMvmntDtls property.
     */
    public List<SecuritiesOption95> getSctiesMvmntDtls() {
        if (sctiesMvmntDtls == null) {
            sctiesMvmntDtls = new ArrayList<>();
        }
        return this.sctiesMvmntDtls;
    }

    /**
     * Gets the value of the cshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashOption87 }
     * 
     * 
     * @return
     *     The value of the cshMvmntDtls property.
     */
    public List<CashOption87> getCshMvmntDtls() {
        if (cshMvmntDtls == null) {
            cshMvmntDtls = new ArrayList<>();
        }
        return this.cshMvmntDtls;
    }

}
