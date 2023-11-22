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

package org.jpos.iso20022.auth_044_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransparencyDataReport17 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransparencyDataReport17">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TechRcrdId" type="{urn:iso:std:iso:20022:tech:xsd:auth.044.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.044.001.02}ISINOct2015Identifier"/>
 *         <element name="FinInstrmClssfctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.044.001.02}EquityInstrumentReportingClassification1Code" minOccurs="0"/>
 *         <element name="FullNm" type="{urn:iso:std:iso:20022:tech:xsd:auth.044.001.02}Max350Text" minOccurs="0"/>
 *         <element name="TradgVn" type="{urn:iso:std:iso:20022:tech:xsd:auth.044.001.02}MICIdentifier" minOccurs="0"/>
 *         <element name="RptgPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.044.001.02}Period4Choice" minOccurs="0"/>
 *         <element name="Lqdty" type="{urn:iso:std:iso:20022:tech:xsd:auth.044.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="Mthdlgy" type="{urn:iso:std:iso:20022:tech:xsd:auth.044.001.02}TransparencyMethodology2Code" minOccurs="0"/>
 *         <element name="Sttstcs" type="{urn:iso:std:iso:20022:tech:xsd:auth.044.001.02}StatisticsTransparency3" minOccurs="0"/>
 *         <element name="RlvntMkt" type="{urn:iso:std:iso:20022:tech:xsd:auth.044.001.02}MarketDetail2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransparencyDataReport17", propOrder = {
    "techRcrdId",
    "id",
    "finInstrmClssfctn",
    "fullNm",
    "tradgVn",
    "rptgPrd",
    "lqdty",
    "mthdlgy",
    "sttstcs",
    "rlvntMkt"
})
public class TransparencyDataReport17 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "FinInstrmClssfctn")
    @XmlSchemaType(name = "string")
    protected EquityInstrumentReportingClassification1Code finInstrmClssfctn;
    @XmlElement(name = "FullNm")
    protected String fullNm;
    @XmlElement(name = "TradgVn")
    protected String tradgVn;
    @XmlElement(name = "RptgPrd")
    protected Period4Choice rptgPrd;
    @XmlElement(name = "Lqdty")
    protected Boolean lqdty;
    @XmlElement(name = "Mthdlgy")
    @XmlSchemaType(name = "string")
    protected TransparencyMethodology2Code mthdlgy;
    @XmlElement(name = "Sttstcs")
    protected StatisticsTransparency3 sttstcs;
    @XmlElement(name = "RlvntMkt")
    protected MarketDetail2 rlvntMkt;

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
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public void setRptgPrd(Period4Choice value) {
        this.rptgPrd = value;
    }

    /**
     * Gets the value of the lqdty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLqdty() {
        return lqdty;
    }

    /**
     * Sets the value of the lqdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLqdty(Boolean value) {
        this.lqdty = value;
    }

    /**
     * Gets the value of the mthdlgy property.
     * 
     * @return
     *     possible object is
     *     {@link TransparencyMethodology2Code }
     *     
     */
    public TransparencyMethodology2Code getMthdlgy() {
        return mthdlgy;
    }

    /**
     * Sets the value of the mthdlgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransparencyMethodology2Code }
     *     
     */
    public void setMthdlgy(TransparencyMethodology2Code value) {
        this.mthdlgy = value;
    }

    /**
     * Gets the value of the sttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsTransparency3 }
     *     
     */
    public StatisticsTransparency3 getSttstcs() {
        return sttstcs;
    }

    /**
     * Sets the value of the sttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsTransparency3 }
     *     
     */
    public void setSttstcs(StatisticsTransparency3 value) {
        this.sttstcs = value;
    }

    /**
     * Gets the value of the rlvntMkt property.
     * 
     * @return
     *     possible object is
     *     {@link MarketDetail2 }
     *     
     */
    public MarketDetail2 getRlvntMkt() {
        return rlvntMkt;
    }

    /**
     * Sets the value of the rlvntMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketDetail2 }
     *     
     */
    public void setRlvntMkt(MarketDetail2 value) {
        this.rlvntMkt = value;
    }

}
