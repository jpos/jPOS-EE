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

package org.jpos.iso20022.auth_032_001_01;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransparencyDataReport11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransparencyDataReport11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TechRcrdId" type="{urn:iso:std:iso:20022:tech:xsd:auth.032.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.032.001.01}ISINOct2015Identifier"/>
 *         <element name="FullNm" type="{urn:iso:std:iso:20022:tech:xsd:auth.032.001.01}Max350Text" minOccurs="0"/>
 *         <element name="TradgVn" type="{urn:iso:std:iso:20022:tech:xsd:auth.032.001.01}MICIdentifier" minOccurs="0"/>
 *         <element name="RptgDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.032.001.01}ISODate" minOccurs="0"/>
 *         <element name="FinInstrmClssfctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.032.001.01}EquityInstrumentReportingClassification1Code"/>
 *         <element name="NbOutsdngInstrms" type="{urn:iso:std:iso:20022:tech:xsd:auth.032.001.01}DecimalNumberFraction5" minOccurs="0"/>
 *         <element name="HldgsExcdgTtlVtngRghtThrshld" type="{urn:iso:std:iso:20022:tech:xsd:auth.032.001.01}DecimalNumberFraction5" minOccurs="0"/>
 *         <element name="IssncSz" type="{urn:iso:std:iso:20022:tech:xsd:auth.032.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="InstrmPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.032.001.01}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransparencyDataReport11", propOrder = {
    "techRcrdId",
    "id",
    "fullNm",
    "tradgVn",
    "rptgDt",
    "finInstrmClssfctn",
    "nbOutsdngInstrms",
    "hldgsExcdgTtlVtngRghtThrshld",
    "issncSz",
    "instrmPric"
})
public class TransparencyDataReport11 {

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
    @XmlElement(name = "FinInstrmClssfctn", required = true)
    @XmlSchemaType(name = "string")
    protected EquityInstrumentReportingClassification1Code finInstrmClssfctn;
    @XmlElement(name = "NbOutsdngInstrms")
    protected BigDecimal nbOutsdngInstrms;
    @XmlElement(name = "HldgsExcdgTtlVtngRghtThrshld")
    protected BigDecimal hldgsExcdgTtlVtngRghtThrshld;
    @XmlElement(name = "IssncSz")
    protected ActiveCurrencyAndAmount issncSz;
    @XmlElement(name = "InstrmPric")
    protected ActiveCurrencyAnd13DecimalAmount instrmPric;

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
     * Gets the value of the finInstrmClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link EquityInstrumentReportingClassification1Code }
     *     
     */
    public EquityInstrumentReportingClassification1Code getFinInstrmClssfctn() {
        return finInstrmClssfctn;
    }

    /**
     * Sets the value of the finInstrmClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityInstrumentReportingClassification1Code }
     *     
     */
    public void setFinInstrmClssfctn(EquityInstrumentReportingClassification1Code value) {
        this.finInstrmClssfctn = value;
    }

    /**
     * Gets the value of the nbOutsdngInstrms property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOutsdngInstrms() {
        return nbOutsdngInstrms;
    }

    /**
     * Sets the value of the nbOutsdngInstrms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOutsdngInstrms(BigDecimal value) {
        this.nbOutsdngInstrms = value;
    }

    /**
     * Gets the value of the hldgsExcdgTtlVtngRghtThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHldgsExcdgTtlVtngRghtThrshld() {
        return hldgsExcdgTtlVtngRghtThrshld;
    }

    /**
     * Sets the value of the hldgsExcdgTtlVtngRghtThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHldgsExcdgTtlVtngRghtThrshld(BigDecimal value) {
        this.hldgsExcdgTtlVtngRghtThrshld = value;
    }

    /**
     * Gets the value of the issncSz property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIssncSz() {
        return issncSz;
    }

    /**
     * Sets the value of the issncSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setIssncSz(ActiveCurrencyAndAmount value) {
        this.issncSz = value;
    }

    /**
     * Gets the value of the instrmPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getInstrmPric() {
        return instrmPric;
    }

    /**
     * Sets the value of the instrmPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setInstrmPric(ActiveCurrencyAnd13DecimalAmount value) {
        this.instrmPric = value;
    }

}
