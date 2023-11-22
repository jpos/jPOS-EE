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

package org.jpos.iso20022.cain_001_001_03;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceLineItem2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvoiceLineItem2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}ISODate" minOccurs="0"/>
 *         <element name="OrdrDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}ISODate" minOccurs="0"/>
 *         <element name="CtrctNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max70Text" minOccurs="0"/>
 *         <element name="ShppgDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}ISODate" minOccurs="0"/>
 *         <element name="RbllgInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="MdclSvcsInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="ShipToIndstryCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max50Text" minOccurs="0"/>
 *         <element name="PdctCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max70Text" minOccurs="0"/>
 *         <element name="PdctQlfr" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max256Text" minOccurs="0"/>
 *         <element name="TpOfSpply" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max10Text" minOccurs="0"/>
 *         <element name="UnitOfMeasr" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}UnitOfMeasure1Code" minOccurs="0"/>
 *         <element name="OthrUnitOfMeasr" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="UnitPric" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="PdctQty" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}DecimalNumber" minOccurs="0"/>
 *         <element name="Adjstmnt" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Adjustment12" minOccurs="0"/>
 *         <element name="InsrncInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="InsrncAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Tax39" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="UnqVATInvcRef" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CdtDbt" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}CreditDebit3Code" minOccurs="0"/>
 *         <element name="ZeroCostToCstmrInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceLineItem2", propOrder = {
    "dt",
    "ordrDt",
    "ctrctNb",
    "shppgDt",
    "rbllgInd",
    "mdclSvcsInd",
    "shipToIndstryCd",
    "pdctCd",
    "pdctQlfr",
    "desc",
    "tpOfSpply",
    "unitOfMeasr",
    "othrUnitOfMeasr",
    "unitPric",
    "pdctQty",
    "adjstmnt",
    "insrncInd",
    "insrncAmt",
    "tax",
    "unqVATInvcRef",
    "ttlAmt",
    "cdtDbt",
    "zeroCostToCstmrInd",
    "addtlData"
})
public class InvoiceLineItem2 {

    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "OrdrDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ordrDt;
    @XmlElement(name = "CtrctNb")
    protected String ctrctNb;
    @XmlElement(name = "ShppgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shppgDt;
    @XmlElement(name = "RbllgInd")
    protected Boolean rbllgInd;
    @XmlElement(name = "MdclSvcsInd")
    protected Boolean mdclSvcsInd;
    @XmlElement(name = "ShipToIndstryCd")
    protected String shipToIndstryCd;
    @XmlElement(name = "PdctCd")
    protected String pdctCd;
    @XmlElement(name = "PdctQlfr")
    protected String pdctQlfr;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "TpOfSpply")
    protected String tpOfSpply;
    @XmlElement(name = "UnitOfMeasr")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure1Code unitOfMeasr;
    @XmlElement(name = "OthrUnitOfMeasr")
    protected String othrUnitOfMeasr;
    @XmlElement(name = "UnitPric")
    protected BigDecimal unitPric;
    @XmlElement(name = "PdctQty")
    protected BigDecimal pdctQty;
    @XmlElement(name = "Adjstmnt")
    protected Adjustment12 adjstmnt;
    @XmlElement(name = "InsrncInd")
    protected Boolean insrncInd;
    @XmlElement(name = "InsrncAmt")
    protected BigDecimal insrncAmt;
    @XmlElement(name = "Tax")
    protected List<Tax39> tax;
    @XmlElement(name = "UnqVATInvcRef")
    protected String unqVATInvcRef;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;
    @XmlElement(name = "CdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code cdtDbt;
    @XmlElement(name = "ZeroCostToCstmrInd")
    protected Boolean zeroCostToCstmrInd;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * Gets the value of the ordrDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrdrDt() {
        return ordrDt;
    }

    /**
     * Sets the value of the ordrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrdrDt(XMLGregorianCalendar value) {
        this.ordrDt = value;
    }

    /**
     * Gets the value of the ctrctNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrctNb() {
        return ctrctNb;
    }

    /**
     * Sets the value of the ctrctNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrctNb(String value) {
        this.ctrctNb = value;
    }

    /**
     * Gets the value of the shppgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShppgDt() {
        return shppgDt;
    }

    /**
     * Sets the value of the shppgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShppgDt(XMLGregorianCalendar value) {
        this.shppgDt = value;
    }

    /**
     * Gets the value of the rbllgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRbllgInd() {
        return rbllgInd;
    }

    /**
     * Sets the value of the rbllgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRbllgInd(Boolean value) {
        this.rbllgInd = value;
    }

    /**
     * Gets the value of the mdclSvcsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMdclSvcsInd() {
        return mdclSvcsInd;
    }

    /**
     * Sets the value of the mdclSvcsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMdclSvcsInd(Boolean value) {
        this.mdclSvcsInd = value;
    }

    /**
     * Gets the value of the shipToIndstryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToIndstryCd() {
        return shipToIndstryCd;
    }

    /**
     * Sets the value of the shipToIndstryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToIndstryCd(String value) {
        this.shipToIndstryCd = value;
    }

    /**
     * Gets the value of the pdctCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctCd() {
        return pdctCd;
    }

    /**
     * Sets the value of the pdctCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdctCd(String value) {
        this.pdctCd = value;
    }

    /**
     * Gets the value of the pdctQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctQlfr() {
        return pdctQlfr;
    }

    /**
     * Sets the value of the pdctQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdctQlfr(String value) {
        this.pdctQlfr = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the tpOfSpply property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpOfSpply() {
        return tpOfSpply;
    }

    /**
     * Sets the value of the tpOfSpply property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpOfSpply(String value) {
        this.tpOfSpply = value;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure1Code }
     *     
     */
    public UnitOfMeasure1Code getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure1Code }
     *     
     */
    public void setUnitOfMeasr(UnitOfMeasure1Code value) {
        this.unitOfMeasr = value;
    }

    /**
     * Gets the value of the othrUnitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrUnitOfMeasr() {
        return othrUnitOfMeasr;
    }

    /**
     * Sets the value of the othrUnitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrUnitOfMeasr(String value) {
        this.othrUnitOfMeasr = value;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPric(BigDecimal value) {
        this.unitPric = value;
    }

    /**
     * Gets the value of the pdctQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPdctQty() {
        return pdctQty;
    }

    /**
     * Sets the value of the pdctQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPdctQty(BigDecimal value) {
        this.pdctQty = value;
    }

    /**
     * Gets the value of the adjstmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Adjustment12 }
     *     
     */
    public Adjustment12 getAdjstmnt() {
        return adjstmnt;
    }

    /**
     * Sets the value of the adjstmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adjustment12 }
     *     
     */
    public void setAdjstmnt(Adjustment12 value) {
        this.adjstmnt = value;
    }

    /**
     * Gets the value of the insrncInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsrncInd() {
        return insrncInd;
    }

    /**
     * Sets the value of the insrncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsrncInd(Boolean value) {
        this.insrncInd = value;
    }

    /**
     * Gets the value of the insrncAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsrncAmt() {
        return insrncAmt;
    }

    /**
     * Sets the value of the insrncAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsrncAmt(BigDecimal value) {
        this.insrncAmt = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax39 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax39> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the unqVATInvcRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqVATInvcRef() {
        return unqVATInvcRef;
    }

    /**
     * Sets the value of the unqVATInvcRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnqVATInvcRef(String value) {
        this.unqVATInvcRef = value;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
    }

    /**
     * Gets the value of the cdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getCdtDbt() {
        return cdtDbt;
    }

    /**
     * Sets the value of the cdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public void setCdtDbt(CreditDebit3Code value) {
        this.cdtDbt = value;
    }

    /**
     * Gets the value of the zeroCostToCstmrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroCostToCstmrInd() {
        return zeroCostToCstmrInd;
    }

    /**
     * Sets the value of the zeroCostToCstmrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroCostToCstmrInd(Boolean value) {
        this.zeroCostToCstmrInd = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlData(String value) {
        this.addtlData = value;
    }

}
