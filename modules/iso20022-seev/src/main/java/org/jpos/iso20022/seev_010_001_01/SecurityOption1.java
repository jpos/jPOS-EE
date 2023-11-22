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

package org.jpos.iso20022.seev_010_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityOption1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityOption1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctyId" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}FinancialInstrumentDescription3"/>
 *         <element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CreditDebitCode"/>
 *         <element name="SctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}UnitOrFaceAmount1Choice" minOccurs="0"/>
 *         <element name="MinExrcblSctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}UnitOrFaceAmount1Choice" minOccurs="0"/>
 *         <element name="MinExrcblMltplSctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}UnitOrFaceAmount1Choice" minOccurs="0"/>
 *         <element name="NewDnmtnSctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}UnitOrFaceAmount1Choice" minOccurs="0"/>
 *         <element name="NewBrdLotSctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}UnitOrFaceAmount1Choice" minOccurs="0"/>
 *         <element name="ShrRnkg" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}ShareRanking1FormatChoice" minOccurs="0"/>
 *         <element name="AddtlQtyForSbcbdRsltntScties" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}QuantityToQuantityRatio1" minOccurs="0"/>
 *         <element name="DtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionDate3" minOccurs="0"/>
 *         <element name="PricDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionPrice4" minOccurs="0"/>
 *         <element name="TradgPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}Period1" minOccurs="0"/>
 *         <element name="AddtlQtyForExstgScties" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}QuantityToQuantityRatio1" minOccurs="0"/>
 *         <element name="TempFinInstrmInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="FrctnDspstn" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}FractionDispositionType1FormatChoice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityOption1", propOrder = {
    "sctyId",
    "cdtDbtInd",
    "sctiesQty",
    "minExrcblSctiesQty",
    "minExrcblMltplSctiesQty",
    "newDnmtnSctiesQty",
    "newBrdLotSctiesQty",
    "shrRnkg",
    "addtlQtyForSbcbdRsltntScties",
    "dtDtls",
    "pricDtls",
    "tradgPrd",
    "addtlQtyForExstgScties",
    "tempFinInstrmInd",
    "frctnDspstn"
})
public class SecurityOption1 {

    @XmlElement(name = "SctyId", required = true)
    protected FinancialInstrumentDescription3 sctyId;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "SctiesQty")
    protected UnitOrFaceAmount1Choice sctiesQty;
    @XmlElement(name = "MinExrcblSctiesQty")
    protected UnitOrFaceAmount1Choice minExrcblSctiesQty;
    @XmlElement(name = "MinExrcblMltplSctiesQty")
    protected UnitOrFaceAmount1Choice minExrcblMltplSctiesQty;
    @XmlElement(name = "NewDnmtnSctiesQty")
    protected UnitOrFaceAmount1Choice newDnmtnSctiesQty;
    @XmlElement(name = "NewBrdLotSctiesQty")
    protected UnitOrFaceAmount1Choice newBrdLotSctiesQty;
    @XmlElement(name = "ShrRnkg")
    protected ShareRanking1FormatChoice shrRnkg;
    @XmlElement(name = "AddtlQtyForSbcbdRsltntScties")
    protected QuantityToQuantityRatio1 addtlQtyForSbcbdRsltntScties;
    @XmlElement(name = "DtDtls")
    protected CorporateActionDate3 dtDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice4 pricDtls;
    @XmlElement(name = "TradgPrd")
    protected Period1 tradgPrd;
    @XmlElement(name = "AddtlQtyForExstgScties")
    protected QuantityToQuantityRatio1 addtlQtyForExstgScties;
    @XmlElement(name = "TempFinInstrmInd")
    protected Boolean tempFinInstrmInd;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType1FormatChoice frctnDspstn;

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentDescription3 }
     *     
     */
    public FinancialInstrumentDescription3 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentDescription3 }
     *     
     */
    public void setSctyId(FinancialInstrumentDescription3 value) {
        this.sctyId = value;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public void setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
    }

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setSctiesQty(UnitOrFaceAmount1Choice value) {
        this.sctiesQty = value;
    }

    /**
     * Gets the value of the minExrcblSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getMinExrcblSctiesQty() {
        return minExrcblSctiesQty;
    }

    /**
     * Sets the value of the minExrcblSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setMinExrcblSctiesQty(UnitOrFaceAmount1Choice value) {
        this.minExrcblSctiesQty = value;
    }

    /**
     * Gets the value of the minExrcblMltplSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getMinExrcblMltplSctiesQty() {
        return minExrcblMltplSctiesQty;
    }

    /**
     * Sets the value of the minExrcblMltplSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setMinExrcblMltplSctiesQty(UnitOrFaceAmount1Choice value) {
        this.minExrcblMltplSctiesQty = value;
    }

    /**
     * Gets the value of the newDnmtnSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getNewDnmtnSctiesQty() {
        return newDnmtnSctiesQty;
    }

    /**
     * Sets the value of the newDnmtnSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setNewDnmtnSctiesQty(UnitOrFaceAmount1Choice value) {
        this.newDnmtnSctiesQty = value;
    }

    /**
     * Gets the value of the newBrdLotSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getNewBrdLotSctiesQty() {
        return newBrdLotSctiesQty;
    }

    /**
     * Sets the value of the newBrdLotSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setNewBrdLotSctiesQty(UnitOrFaceAmount1Choice value) {
        this.newBrdLotSctiesQty = value;
    }

    /**
     * Gets the value of the shrRnkg property.
     * 
     * @return
     *     possible object is
     *     {@link ShareRanking1FormatChoice }
     *     
     */
    public ShareRanking1FormatChoice getShrRnkg() {
        return shrRnkg;
    }

    /**
     * Sets the value of the shrRnkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareRanking1FormatChoice }
     *     
     */
    public void setShrRnkg(ShareRanking1FormatChoice value) {
        this.shrRnkg = value;
    }

    /**
     * Gets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityToQuantityRatio1 }
     *     
     */
    public QuantityToQuantityRatio1 getAddtlQtyForSbcbdRsltntScties() {
        return addtlQtyForSbcbdRsltntScties;
    }

    /**
     * Sets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityToQuantityRatio1 }
     *     
     */
    public void setAddtlQtyForSbcbdRsltntScties(QuantityToQuantityRatio1 value) {
        this.addtlQtyForSbcbdRsltntScties = value;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate3 }
     *     
     */
    public CorporateActionDate3 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate3 }
     *     
     */
    public void setDtDtls(CorporateActionDate3 value) {
        this.dtDtls = value;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice4 }
     *     
     */
    public CorporateActionPrice4 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice4 }
     *     
     */
    public void setPricDtls(CorporateActionPrice4 value) {
        this.pricDtls = value;
    }

    /**
     * Gets the value of the tradgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getTradgPrd() {
        return tradgPrd;
    }

    /**
     * Sets the value of the tradgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public void setTradgPrd(Period1 value) {
        this.tradgPrd = value;
    }

    /**
     * Gets the value of the addtlQtyForExstgScties property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityToQuantityRatio1 }
     *     
     */
    public QuantityToQuantityRatio1 getAddtlQtyForExstgScties() {
        return addtlQtyForExstgScties;
    }

    /**
     * Sets the value of the addtlQtyForExstgScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityToQuantityRatio1 }
     *     
     */
    public void setAddtlQtyForExstgScties(QuantityToQuantityRatio1 value) {
        this.addtlQtyForExstgScties = value;
    }

    /**
     * Gets the value of the tempFinInstrmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTempFinInstrmInd() {
        return tempFinInstrmInd;
    }

    /**
     * Sets the value of the tempFinInstrmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTempFinInstrmInd(Boolean value) {
        this.tempFinInstrmInd = value;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType1FormatChoice }
     *     
     */
    public FractionDispositionType1FormatChoice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType1FormatChoice }
     *     
     */
    public void setFrctnDspstn(FractionDispositionType1FormatChoice value) {
        this.frctnDspstn = value;
    }

}
