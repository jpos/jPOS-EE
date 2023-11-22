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

package org.jpos.iso20022.semt_041_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Statement59 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Statement59">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SndrBizRole" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}SenderBusinessRole1Code"/>
 *         <element name="StmtNb" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}Number3Choice" minOccurs="0"/>
 *         <element name="QryRef" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}Max35Text" minOccurs="0"/>
 *         <element name="StmtId" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}Max35Text"/>
 *         <element name="StmtDtTm" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}DateAndDateTimeChoice"/>
 *         <element name="StmtPrd" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}DatePeriod1Choice"/>
 *         <element name="Frqcy" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}Frequency22Choice" minOccurs="0"/>
 *         <element name="FrqcyGrnlrty" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}FrequencyGranularityType1Code" minOccurs="0"/>
 *         <element name="UpdTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}UpdateType4Choice" minOccurs="0"/>
 *         <element name="ActvtyInd" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}YesNoIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement59", propOrder = {
    "sndrBizRole",
    "stmtNb",
    "qryRef",
    "stmtId",
    "stmtDtTm",
    "stmtPrd",
    "frqcy",
    "frqcyGrnlrty",
    "updTp",
    "actvtyInd"
})
public class Statement59 {

    @XmlElement(name = "SndrBizRole", required = true)
    @XmlSchemaType(name = "string")
    protected SenderBusinessRole1Code sndrBizRole;
    @XmlElement(name = "StmtNb")
    protected Number3Choice stmtNb;
    @XmlElement(name = "QryRef")
    protected String qryRef;
    @XmlElement(name = "StmtId", required = true)
    protected String stmtId;
    @XmlElement(name = "StmtDtTm", required = true)
    protected DateAndDateTimeChoice stmtDtTm;
    @XmlElement(name = "StmtPrd", required = true)
    protected DatePeriod1Choice stmtPrd;
    @XmlElement(name = "Frqcy")
    protected Frequency22Choice frqcy;
    @XmlElement(name = "FrqcyGrnlrty")
    @XmlSchemaType(name = "string")
    protected FrequencyGranularityType1Code frqcyGrnlrty;
    @XmlElement(name = "UpdTp")
    protected UpdateType4Choice updTp;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;

    /**
     * Gets the value of the sndrBizRole property.
     * 
     * @return
     *     possible object is
     *     {@link SenderBusinessRole1Code }
     *     
     */
    public SenderBusinessRole1Code getSndrBizRole() {
        return sndrBizRole;
    }

    /**
     * Sets the value of the sndrBizRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderBusinessRole1Code }
     *     
     */
    public void setSndrBizRole(SenderBusinessRole1Code value) {
        this.sndrBizRole = value;
    }

    /**
     * Gets the value of the stmtNb property.
     * 
     * @return
     *     possible object is
     *     {@link Number3Choice }
     *     
     */
    public Number3Choice getStmtNb() {
        return stmtNb;
    }

    /**
     * Sets the value of the stmtNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Number3Choice }
     *     
     */
    public void setStmtNb(Number3Choice value) {
        this.stmtNb = value;
    }

    /**
     * Gets the value of the qryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryRef() {
        return qryRef;
    }

    /**
     * Sets the value of the qryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryRef(String value) {
        this.qryRef = value;
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
     * Gets the value of the stmtDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getStmtDtTm() {
        return stmtDtTm;
    }

    /**
     * Sets the value of the stmtDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setStmtDtTm(DateAndDateTimeChoice value) {
        this.stmtDtTm = value;
    }

    /**
     * Gets the value of the stmtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod1Choice }
     *     
     */
    public DatePeriod1Choice getStmtPrd() {
        return stmtPrd;
    }

    /**
     * Sets the value of the stmtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod1Choice }
     *     
     */
    public void setStmtPrd(DatePeriod1Choice value) {
        this.stmtPrd = value;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency22Choice }
     *     
     */
    public Frequency22Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency22Choice }
     *     
     */
    public void setFrqcy(Frequency22Choice value) {
        this.frqcy = value;
    }

    /**
     * Gets the value of the frqcyGrnlrty property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyGranularityType1Code }
     *     
     */
    public FrequencyGranularityType1Code getFrqcyGrnlrty() {
        return frqcyGrnlrty;
    }

    /**
     * Sets the value of the frqcyGrnlrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyGranularityType1Code }
     *     
     */
    public void setFrqcyGrnlrty(FrequencyGranularityType1Code value) {
        this.frqcyGrnlrty = value;
    }

    /**
     * Gets the value of the updTp property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateType4Choice }
     *     
     */
    public UpdateType4Choice getUpdTp() {
        return updTp;
    }

    /**
     * Sets the value of the updTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateType4Choice }
     *     
     */
    public void setUpdTp(UpdateType4Choice value) {
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

}
