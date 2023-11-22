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

package org.jpos.iso20022.seev_042_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Statement72 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Statement72">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StmtTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}CorporateActionStatementType2Code"/>
 *         <element name="RptgTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}CorporateActionStatementReportingType1Code"/>
 *         <element name="StmtId" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}Max35Text"/>
 *         <element name="InstrAggtnPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}DatePeriod2" minOccurs="0"/>
 *         <element name="RptNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}Max5NumericText" minOccurs="0"/>
 *         <element name="StmtDtTm" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}DateAndDateTime2Choice"/>
 *         <element name="Frqcy" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}Frequency25Choice"/>
 *         <element name="UpdTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}UpdateType15Choice"/>
 *         <element name="ActvtyInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}YesNoIndicator"/>
 *         <element name="NtfctnDdlnPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}DateOrDateTimePeriod1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement72", propOrder = {
    "stmtTp",
    "rptgTp",
    "stmtId",
    "instrAggtnPrd",
    "rptNb",
    "stmtDtTm",
    "frqcy",
    "updTp",
    "actvtyInd",
    "ntfctnDdlnPrd"
})
public class Statement72 {

    @XmlElement(name = "StmtTp", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionStatementType2Code stmtTp;
    @XmlElement(name = "RptgTp", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionStatementReportingType1Code rptgTp;
    @XmlElement(name = "StmtId", required = true)
    protected String stmtId;
    @XmlElement(name = "InstrAggtnPrd")
    protected DatePeriod2 instrAggtnPrd;
    @XmlElement(name = "RptNb")
    protected String rptNb;
    @XmlElement(name = "StmtDtTm", required = true)
    protected DateAndDateTime2Choice stmtDtTm;
    @XmlElement(name = "Frqcy", required = true)
    protected Frequency25Choice frqcy;
    @XmlElement(name = "UpdTp", required = true)
    protected UpdateType15Choice updTp;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;
    @XmlElement(name = "NtfctnDdlnPrd")
    protected DateOrDateTimePeriod1Choice ntfctnDdlnPrd;

    /**
     * Gets the value of the stmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionStatementType2Code }
     *     
     */
    public CorporateActionStatementType2Code getStmtTp() {
        return stmtTp;
    }

    /**
     * Sets the value of the stmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionStatementType2Code }
     *     
     */
    public void setStmtTp(CorporateActionStatementType2Code value) {
        this.stmtTp = value;
    }

    /**
     * Gets the value of the rptgTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionStatementReportingType1Code }
     *     
     */
    public CorporateActionStatementReportingType1Code getRptgTp() {
        return rptgTp;
    }

    /**
     * Sets the value of the rptgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionStatementReportingType1Code }
     *     
     */
    public void setRptgTp(CorporateActionStatementReportingType1Code value) {
        this.rptgTp = value;
    }

    /**
     * Gets the value of the stmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtId() {
        return stmtId;
    }

    /**
     * Sets the value of the stmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtId(String value) {
        this.stmtId = value;
    }

    /**
     * Gets the value of the instrAggtnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod2 }
     *     
     */
    public DatePeriod2 getInstrAggtnPrd() {
        return instrAggtnPrd;
    }

    /**
     * Sets the value of the instrAggtnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod2 }
     *     
     */
    public void setInstrAggtnPrd(DatePeriod2 value) {
        this.instrAggtnPrd = value;
    }

    /**
     * Gets the value of the rptNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptNb() {
        return rptNb;
    }

    /**
     * Sets the value of the rptNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptNb(String value) {
        this.rptNb = value;
    }

    /**
     * Gets the value of the stmtDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getStmtDtTm() {
        return stmtDtTm;
    }

    /**
     * Sets the value of the stmtDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setStmtDtTm(DateAndDateTime2Choice value) {
        this.stmtDtTm = value;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency25Choice }
     *     
     */
    public Frequency25Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency25Choice }
     *     
     */
    public void setFrqcy(Frequency25Choice value) {
        this.frqcy = value;
    }

    /**
     * Gets the value of the updTp property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateType15Choice }
     *     
     */
    public UpdateType15Choice getUpdTp() {
        return updTp;
    }

    /**
     * Sets the value of the updTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateType15Choice }
     *     
     */
    public void setUpdTp(UpdateType15Choice value) {
        this.updTp = value;
    }

    /**
     * Gets the value of the actvtyInd property.
     * 
     */
    public boolean isActvtyInd() {
        return actvtyInd;
    }

    /**
     * Sets the value of the actvtyInd property.
     * 
     */
    public void setActvtyInd(boolean value) {
        this.actvtyInd = value;
    }

    /**
     * Gets the value of the ntfctnDdlnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrDateTimePeriod1Choice }
     *     
     */
    public DateOrDateTimePeriod1Choice getNtfctnDdlnPrd() {
        return ntfctnDdlnPrd;
    }

    /**
     * Sets the value of the ntfctnDdlnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrDateTimePeriod1Choice }
     *     
     */
    public void setNtfctnDdlnPrd(DateOrDateTimePeriod1Choice value) {
        this.ntfctnDdlnPrd = value;
    }

}
