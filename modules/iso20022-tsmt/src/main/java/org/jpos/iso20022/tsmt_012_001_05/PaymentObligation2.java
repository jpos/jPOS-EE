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

package org.jpos.iso20022.tsmt_012_001_05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentObligation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentObligation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OblgrBk" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}BICIdentification1"/>
 *         <element name="RcptBk" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}BICIdentification1"/>
 *         <element name="PmtOblgtnAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}AmountOrPercentage2Choice"/>
 *         <element name="Chrgs" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}Charges5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}ISODate"/>
 *         <element name="AplblRules" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}BPOApplicableRules1Choice" minOccurs="0"/>
 *         <element name="AplblLaw" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}CountryCode" minOccurs="0"/>
 *         <element name="PlcOfJursdctn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}Location2" minOccurs="0"/>
 *         <element name="PmtTerms" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}PaymentTerms4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SttlmTerms" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}SettlementTerms3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentObligation2", propOrder = {
    "oblgrBk",
    "rcptBk",
    "pmtOblgtnAmt",
    "chrgs",
    "xpryDt",
    "aplblRules",
    "aplblLaw",
    "plcOfJursdctn",
    "pmtTerms",
    "sttlmTerms"
})
public class PaymentObligation2 {

    @XmlElement(name = "OblgrBk", required = true)
    protected BICIdentification1 oblgrBk;
    @XmlElement(name = "RcptBk", required = true)
    protected BICIdentification1 rcptBk;
    @XmlElement(name = "PmtOblgtnAmt", required = true)
    protected AmountOrPercentage2Choice pmtOblgtnAmt;
    @XmlElement(name = "Chrgs")
    protected List<Charges5> chrgs;
    @XmlElement(name = "XpryDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpryDt;
    @XmlElement(name = "AplblRules")
    protected BPOApplicableRules1Choice aplblRules;
    @XmlElement(name = "AplblLaw")
    protected String aplblLaw;
    @XmlElement(name = "PlcOfJursdctn")
    protected Location2 plcOfJursdctn;
    @XmlElement(name = "PmtTerms")
    protected List<PaymentTerms4> pmtTerms;
    @XmlElement(name = "SttlmTerms")
    protected SettlementTerms3 sttlmTerms;

    /**
     * Gets the value of the oblgrBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getOblgrBk() {
        return oblgrBk;
    }

    /**
     * Sets the value of the oblgrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public void setOblgrBk(BICIdentification1 value) {
        this.oblgrBk = value;
    }

    /**
     * Gets the value of the rcptBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getRcptBk() {
        return rcptBk;
    }

    /**
     * Sets the value of the rcptBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public void setRcptBk(BICIdentification1 value) {
        this.rcptBk = value;
    }

    /**
     * Gets the value of the pmtOblgtnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrPercentage2Choice }
     *     
     */
    public AmountOrPercentage2Choice getPmtOblgtnAmt() {
        return pmtOblgtnAmt;
    }

    /**
     * Sets the value of the pmtOblgtnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrPercentage2Choice }
     *     
     */
    public void setPmtOblgtnAmt(AmountOrPercentage2Choice value) {
        this.pmtOblgtnAmt = value;
    }

    /**
     * Gets the value of the chrgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chrgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charges5 }
     * 
     * 
     * @return
     *     The value of the chrgs property.
     */
    public List<Charges5> getChrgs() {
        if (chrgs == null) {
            chrgs = new ArrayList<>();
        }
        return this.chrgs;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpryDt(XMLGregorianCalendar value) {
        this.xpryDt = value;
    }

    /**
     * Gets the value of the aplblRules property.
     * 
     * @return
     *     possible object is
     *     {@link BPOApplicableRules1Choice }
     *     
     */
    public BPOApplicableRules1Choice getAplblRules() {
        return aplblRules;
    }

    /**
     * Sets the value of the aplblRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPOApplicableRules1Choice }
     *     
     */
    public void setAplblRules(BPOApplicableRules1Choice value) {
        this.aplblRules = value;
    }

    /**
     * Gets the value of the aplblLaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAplblLaw() {
        return aplblLaw;
    }

    /**
     * Sets the value of the aplblLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAplblLaw(String value) {
        this.aplblLaw = value;
    }

    /**
     * Gets the value of the plcOfJursdctn property.
     * 
     * @return
     *     possible object is
     *     {@link Location2 }
     *     
     */
    public Location2 getPlcOfJursdctn() {
        return plcOfJursdctn;
    }

    /**
     * Sets the value of the plcOfJursdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location2 }
     *     
     */
    public void setPlcOfJursdctn(Location2 value) {
        this.plcOfJursdctn = value;
    }

    /**
     * Gets the value of the pmtTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTerms4 }
     * 
     * 
     * @return
     *     The value of the pmtTerms property.
     */
    public List<PaymentTerms4> getPmtTerms() {
        if (pmtTerms == null) {
            pmtTerms = new ArrayList<>();
        }
        return this.pmtTerms;
    }

    /**
     * Gets the value of the sttlmTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTerms3 }
     *     
     */
    public SettlementTerms3 getSttlmTerms() {
        return sttlmTerms;
    }

    /**
     * Sets the value of the sttlmTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTerms3 }
     *     
     */
    public void setSttlmTerms(SettlementTerms3 value) {
        this.sttlmTerms = value;
    }

}
