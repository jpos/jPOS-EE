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

package org.jpos.iso20022.tsmt_017_001_05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsuranceDataSet1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InsuranceDataSet1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DataSetId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}DocumentIdentification1"/>
 *         <element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}PartyIdentification26"/>
 *         <element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}ISODate"/>
 *         <element name="FctvDt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}ISODate" minOccurs="0"/>
 *         <element name="PlcOfIsse" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}PostalAddress5" minOccurs="0"/>
 *         <element name="InsrncDocId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max35Text"/>
 *         <element name="Trnsprt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}SingleTransport3" minOccurs="0"/>
 *         <element name="InsrdAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}CurrencyAndAmount"/>
 *         <element name="InsrdGoodsDesc" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max70Text" minOccurs="0"/>
 *         <element name="InsrncConds" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max350Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InsrncClauses" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}InsuranceClauses1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Assrd" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}PartyIdentification29Choice"/>
 *         <element name="ClmsPyblAt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}PostalAddress5"/>
 *         <element name="ClmsPyblIn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}CurrencyCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceDataSet1", propOrder = {
    "dataSetId",
    "issr",
    "isseDt",
    "fctvDt",
    "plcOfIsse",
    "insrncDocId",
    "trnsprt",
    "insrdAmt",
    "insrdGoodsDesc",
    "insrncConds",
    "insrncClauses",
    "assrd",
    "clmsPyblAt",
    "clmsPyblIn"
})
public class InsuranceDataSet1 {

    @XmlElement(name = "DataSetId", required = true)
    protected DocumentIdentification1 dataSetId;
    @XmlElement(name = "Issr", required = true)
    protected PartyIdentification26 issr;
    @XmlElement(name = "IsseDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isseDt;
    @XmlElement(name = "FctvDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fctvDt;
    @XmlElement(name = "PlcOfIsse")
    protected PostalAddress5 plcOfIsse;
    @XmlElement(name = "InsrncDocId", required = true)
    protected String insrncDocId;
    @XmlElement(name = "Trnsprt")
    protected SingleTransport3 trnsprt;
    @XmlElement(name = "InsrdAmt", required = true)
    protected CurrencyAndAmount insrdAmt;
    @XmlElement(name = "InsrdGoodsDesc")
    protected String insrdGoodsDesc;
    @XmlElement(name = "InsrncConds")
    protected List<String> insrncConds;
    @XmlElement(name = "InsrncClauses")
    @XmlSchemaType(name = "string")
    protected List<InsuranceClauses1Code> insrncClauses;
    @XmlElement(name = "Assrd", required = true)
    protected PartyIdentification29Choice assrd;
    @XmlElement(name = "ClmsPyblAt", required = true)
    protected PostalAddress5 clmsPyblAt;
    @XmlElement(name = "ClmsPyblIn")
    protected String clmsPyblIn;

    /**
     * Gets the value of the dataSetId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification1 }
     *     
     */
    public DocumentIdentification1 getDataSetId() {
        return dataSetId;
    }

    /**
     * Sets the value of the dataSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification1 }
     *     
     */
    public void setDataSetId(DocumentIdentification1 value) {
        this.dataSetId = value;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setIssr(PartyIdentification26 value) {
        this.issr = value;
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
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFctvDt(XMLGregorianCalendar value) {
        this.fctvDt = value;
    }

    /**
     * Gets the value of the plcOfIsse property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress5 }
     *     
     */
    public PostalAddress5 getPlcOfIsse() {
        return plcOfIsse;
    }

    /**
     * Sets the value of the plcOfIsse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress5 }
     *     
     */
    public void setPlcOfIsse(PostalAddress5 value) {
        this.plcOfIsse = value;
    }

    /**
     * Gets the value of the insrncDocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsrncDocId() {
        return insrncDocId;
    }

    /**
     * Sets the value of the insrncDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsrncDocId(String value) {
        this.insrncDocId = value;
    }

    /**
     * Gets the value of the trnsprt property.
     * 
     * @return
     *     possible object is
     *     {@link SingleTransport3 }
     *     
     */
    public SingleTransport3 getTrnsprt() {
        return trnsprt;
    }

    /**
     * Sets the value of the trnsprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleTransport3 }
     *     
     */
    public void setTrnsprt(SingleTransport3 value) {
        this.trnsprt = value;
    }

    /**
     * Gets the value of the insrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getInsrdAmt() {
        return insrdAmt;
    }

    /**
     * Sets the value of the insrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setInsrdAmt(CurrencyAndAmount value) {
        this.insrdAmt = value;
    }

    /**
     * Gets the value of the insrdGoodsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsrdGoodsDesc() {
        return insrdGoodsDesc;
    }

    /**
     * Sets the value of the insrdGoodsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsrdGoodsDesc(String value) {
        this.insrdGoodsDesc = value;
    }

    /**
     * Gets the value of the insrncConds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the insrncConds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsrncConds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the insrncConds property.
     */
    public List<String> getInsrncConds() {
        if (insrncConds == null) {
            insrncConds = new ArrayList<>();
        }
        return this.insrncConds;
    }

    /**
     * Gets the value of the insrncClauses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the insrncClauses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsrncClauses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceClauses1Code }
     * 
     * 
     * @return
     *     The value of the insrncClauses property.
     */
    public List<InsuranceClauses1Code> getInsrncClauses() {
        if (insrncClauses == null) {
            insrncClauses = new ArrayList<>();
        }
        return this.insrncClauses;
    }

    /**
     * Gets the value of the assrd property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification29Choice }
     *     
     */
    public PartyIdentification29Choice getAssrd() {
        return assrd;
    }

    /**
     * Sets the value of the assrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification29Choice }
     *     
     */
    public void setAssrd(PartyIdentification29Choice value) {
        this.assrd = value;
    }

    /**
     * Gets the value of the clmsPyblAt property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress5 }
     *     
     */
    public PostalAddress5 getClmsPyblAt() {
        return clmsPyblAt;
    }

    /**
     * Sets the value of the clmsPyblAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress5 }
     *     
     */
    public void setClmsPyblAt(PostalAddress5 value) {
        this.clmsPyblAt = value;
    }

    /**
     * Gets the value of the clmsPyblIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClmsPyblIn() {
        return clmsPyblIn;
    }

    /**
     * Sets the value of the clmsPyblIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClmsPyblIn(String value) {
        this.clmsPyblIn = value;
    }

}
