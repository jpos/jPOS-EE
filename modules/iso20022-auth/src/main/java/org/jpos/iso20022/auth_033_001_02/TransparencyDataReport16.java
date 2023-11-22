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

package org.jpos.iso20022.auth_033_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransparencyDataReport16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransparencyDataReport16">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TechRcrdId" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}ISINOct2015Identifier"/>
 *         <element name="FullNm" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}Max350Text" minOccurs="0"/>
 *         <element name="TradgVn" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}MICIdentifier" minOccurs="0"/>
 *         <element name="RptgDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}ISODate" minOccurs="0"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}ISODate" minOccurs="0"/>
 *         <element name="FinInstrmClssfctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}NonEquityInstrumentReportingClassification1Code"/>
 *         <element name="UndrlygInstrmAsstClss" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}ProductType5Code" minOccurs="0"/>
 *         <element name="DerivCtrctTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}FinancialInstrumentContractType1Code" minOccurs="0"/>
 *         <element name="Bd" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}DebtInstrument5" minOccurs="0"/>
 *         <element name="EmssnAllwncTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}EmissionAllowanceProductType2Code" minOccurs="0"/>
 *         <element name="Deriv" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}Derivative3Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransparencyDataReport16", propOrder = {
    "techRcrdId",
    "id",
    "fullNm",
    "tradgVn",
    "rptgDt",
    "mtrtyDt",
    "finInstrmClssfctn",
    "undrlygInstrmAsstClss",
    "derivCtrctTp",
    "bd",
    "emssnAllwncTp",
    "deriv"
})
public class TransparencyDataReport16 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "FullNm")
    protected String fullNm;
    @XmlElement(name = "TradgVn")
    protected String tradgVn;
    @XmlElement(name = "RptgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rptgDt;
    @XmlElement(name = "MtrtyDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtrtyDt;
    @XmlElement(name = "FinInstrmClssfctn", required = true)
    @XmlSchemaType(name = "string")
    protected NonEquityInstrumentReportingClassification1Code finInstrmClssfctn;
    @XmlElement(name = "UndrlygInstrmAsstClss")
    @XmlSchemaType(name = "string")
    protected ProductType5Code undrlygInstrmAsstClss;
    @XmlElement(name = "DerivCtrctTp")
    @XmlSchemaType(name = "string")
    protected FinancialInstrumentContractType1Code derivCtrctTp;
    @XmlElement(name = "Bd")
    protected DebtInstrument5 bd;
    @XmlElement(name = "EmssnAllwncTp")
    @XmlSchemaType(name = "string")
    protected EmissionAllowanceProductType2Code emssnAllwncTp;
    @XmlElement(name = "Deriv")
    protected Derivative3Choice deriv;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechRcrdId(String value) {
        this.techRcrdId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the fullNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNm() {
        return fullNm;
    }

    /**
     * Sets the value of the fullNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNm(String value) {
        this.fullNm = value;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradgVn(String value) {
        this.tradgVn = value;
    }

    /**
     * Gets the value of the rptgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRptgDt() {
        return rptgDt;
    }

    /**
     * Sets the value of the rptgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRptgDt(XMLGregorianCalendar value) {
        this.rptgDt = value;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMtrtyDt(XMLGregorianCalendar value) {
        this.mtrtyDt = value;
    }

    /**
     * Gets the value of the finInstrmClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link NonEquityInstrumentReportingClassification1Code }
     *     
     */
    public NonEquityInstrumentReportingClassification1Code getFinInstrmClssfctn() {
        return finInstrmClssfctn;
    }

    /**
     * Sets the value of the finInstrmClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEquityInstrumentReportingClassification1Code }
     *     
     */
    public void setFinInstrmClssfctn(NonEquityInstrumentReportingClassification1Code value) {
        this.finInstrmClssfctn = value;
    }

    /**
     * Gets the value of the undrlygInstrmAsstClss property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType5Code }
     *     
     */
    public ProductType5Code getUndrlygInstrmAsstClss() {
        return undrlygInstrmAsstClss;
    }

    /**
     * Sets the value of the undrlygInstrmAsstClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType5Code }
     *     
     */
    public void setUndrlygInstrmAsstClss(ProductType5Code value) {
        this.undrlygInstrmAsstClss = value;
    }

    /**
     * Gets the value of the derivCtrctTp property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentContractType1Code }
     *     
     */
    public FinancialInstrumentContractType1Code getDerivCtrctTp() {
        return derivCtrctTp;
    }

    /**
     * Sets the value of the derivCtrctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentContractType1Code }
     *     
     */
    public void setDerivCtrctTp(FinancialInstrumentContractType1Code value) {
        this.derivCtrctTp = value;
    }

    /**
     * Gets the value of the bd property.
     * 
     * @return
     *     possible object is
     *     {@link DebtInstrument5 }
     *     
     */
    public DebtInstrument5 getBd() {
        return bd;
    }

    /**
     * Sets the value of the bd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtInstrument5 }
     *     
     */
    public void setBd(DebtInstrument5 value) {
        this.bd = value;
    }

    /**
     * Gets the value of the emssnAllwncTp property.
     * 
     * @return
     *     possible object is
     *     {@link EmissionAllowanceProductType2Code }
     *     
     */
    public EmissionAllowanceProductType2Code getEmssnAllwncTp() {
        return emssnAllwncTp;
    }

    /**
     * Sets the value of the emssnAllwncTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmissionAllowanceProductType2Code }
     *     
     */
    public void setEmssnAllwncTp(EmissionAllowanceProductType2Code value) {
        this.emssnAllwncTp = value;
    }

    /**
     * Gets the value of the deriv property.
     * 
     * @return
     *     possible object is
     *     {@link Derivative3Choice }
     *     
     */
    public Derivative3Choice getDeriv() {
        return deriv;
    }

    /**
     * Sets the value of the deriv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Derivative3Choice }
     *     
     */
    public void setDeriv(Derivative3Choice value) {
        this.deriv = value;
    }

}
