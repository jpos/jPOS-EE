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

package org.jpos.iso20022.tsmt_053_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialItemParameters1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialItemParameters1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Idr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.053.001.01}Max35Text"/>
 *         <element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.053.001.01}ISODate"/>
 *         <element name="RltdItm" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DocPurp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.053.001.01}ExternalDocumentPurpose1Code" minOccurs="0"/>
 *         <element name="LangCd" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.053.001.01}LanguageCode" minOccurs="0"/>
 *         <element name="Issr" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         <element name="Rcpt" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         <element name="Buyr" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         <element name="Sellr" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         <element name="SellrFinAgt" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         <element name="BuyrFinAgt" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         <element name="GovngCtrct" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LglCntxt" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.053.001.01}CurrencyCode" minOccurs="0"/>
 *         <element name="DbtAcct" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.053.001.01}AccountIdentification4Choice" minOccurs="0"/>
 *         <element name="CdtAcct" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.053.001.01}AccountIdentification4Choice" minOccurs="0"/>
 *         <element name="TradMkt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.053.001.01}TradeMarket1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialItemParameters1", propOrder = {
    "idr",
    "isseDt",
    "rltdItm",
    "docPurp",
    "langCd",
    "issr",
    "rcpt",
    "buyr",
    "sellr",
    "sellrFinAgt",
    "buyrFinAgt",
    "govngCtrct",
    "lglCntxt",
    "ccy",
    "dbtAcct",
    "cdtAcct",
    "tradMkt"
})
public class FinancialItemParameters1 {

    @XmlElement(name = "Idr", required = true)
    protected String idr;
    @XmlElement(name = "IsseDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isseDt;
    @XmlElementRef(name = "RltdItm", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.053.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> rltdItm;
    @XmlElement(name = "DocPurp")
    protected String docPurp;
    @XmlElement(name = "LangCd")
    protected String langCd;
    @XmlElement(name = "Issr")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object issr;
    @XmlElement(name = "Rcpt")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object rcpt;
    @XmlElement(name = "Buyr")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object buyr;
    @XmlElement(name = "Sellr")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object sellr;
    @XmlElement(name = "SellrFinAgt")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object sellrFinAgt;
    @XmlElement(name = "BuyrFinAgt")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object buyrFinAgt;
    @XmlElementRef(name = "GovngCtrct", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.053.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> govngCtrct;
    @XmlElement(name = "LglCntxt")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object lglCntxt;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "DbtAcct")
    protected AccountIdentification4Choice dbtAcct;
    @XmlElement(name = "CdtAcct")
    protected AccountIdentification4Choice cdtAcct;
    @XmlElement(name = "TradMkt")
    protected TradeMarket1Choice tradMkt;

    /**
     * Gets the value of the idr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdr() {
        return idr;
    }

    /**
     * Sets the value of the idr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdr(String value) {
        this.idr = value;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIsseDt(XMLGregorianCalendar value) {
        this.isseDt = value;
    }

    /**
     * Gets the value of the rltdItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     * @return
     *     The value of the rltdItm property.
     */
    public List<JAXBElement<Object>> getRltdItm() {
        if (rltdItm == null) {
            rltdItm = new ArrayList<>();
        }
        return this.rltdItm;
    }

    /**
     * Gets the value of the docPurp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocPurp() {
        return docPurp;
    }

    /**
     * Sets the value of the docPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocPurp(String value) {
        this.docPurp = value;
    }

    /**
     * Gets the value of the langCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCd() {
        return langCd;
    }

    /**
     * Sets the value of the langCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangCd(String value) {
        this.langCd = value;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIssr(Object value) {
        this.issr = value;
    }

    /**
     * Gets the value of the rcpt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRcpt() {
        return rcpt;
    }

    /**
     * Sets the value of the rcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRcpt(Object value) {
        this.rcpt = value;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBuyr(Object value) {
        this.buyr = value;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSellr(Object value) {
        this.sellr = value;
    }

    /**
     * Gets the value of the sellrFinAgt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSellrFinAgt() {
        return sellrFinAgt;
    }

    /**
     * Sets the value of the sellrFinAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSellrFinAgt(Object value) {
        this.sellrFinAgt = value;
    }

    /**
     * Gets the value of the buyrFinAgt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBuyrFinAgt() {
        return buyrFinAgt;
    }

    /**
     * Sets the value of the buyrFinAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBuyrFinAgt(Object value) {
        this.buyrFinAgt = value;
    }

    /**
     * Gets the value of the govngCtrct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the govngCtrct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGovngCtrct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     * @return
     *     The value of the govngCtrct property.
     */
    public List<JAXBElement<Object>> getGovngCtrct() {
        if (govngCtrct == null) {
            govngCtrct = new ArrayList<>();
        }
        return this.govngCtrct;
    }

    /**
     * Gets the value of the lglCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLglCntxt() {
        return lglCntxt;
    }

    /**
     * Sets the value of the lglCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLglCntxt(Object value) {
        this.lglCntxt = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the dbtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getDbtAcct() {
        return dbtAcct;
    }

    /**
     * Sets the value of the dbtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public void setDbtAcct(AccountIdentification4Choice value) {
        this.dbtAcct = value;
    }

    /**
     * Gets the value of the cdtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getCdtAcct() {
        return cdtAcct;
    }

    /**
     * Sets the value of the cdtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public void setCdtAcct(AccountIdentification4Choice value) {
        this.cdtAcct = value;
    }

    /**
     * Gets the value of the tradMkt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeMarket1Choice }
     *     
     */
    public TradeMarket1Choice getTradMkt() {
        return tradMkt;
    }

    /**
     * Sets the value of the tradMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeMarket1Choice }
     *     
     */
    public void setTradMkt(TradeMarket1Choice value) {
        this.tradMkt = value;
    }

}
