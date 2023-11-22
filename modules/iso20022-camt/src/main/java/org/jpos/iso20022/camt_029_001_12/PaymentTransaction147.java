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

package org.jpos.iso20022.camt_029_001_12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTransaction147 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentTransaction147">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ModStsId" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}Max35Text" minOccurs="0"/>
 *         <element name="RslvdCase" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}Case5" minOccurs="0"/>
 *         <element name="OrgnlGrpInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}OriginalGroupInformation29"/>
 *         <element name="OrgnlPmtInfId" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}Max35Text" minOccurs="0"/>
 *         <element name="OrgnlInstrId" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}Max35Text" minOccurs="0"/>
 *         <element name="OrgnlEndToEndId" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}Max35Text" minOccurs="0"/>
 *         <element name="OrgnlTxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}Max35Text" minOccurs="0"/>
 *         <element name="OrgnlClrSysRef" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}Max35Text" minOccurs="0"/>
 *         <element name="OrgnlUETR" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}UUIDv4Identifier" minOccurs="0"/>
 *         <element name="ModStsRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}ModificationStatusReason2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RsltnRltdInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}ResolutionData4" minOccurs="0"/>
 *         <element name="OrgnlIntrBkSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="OrgnlIntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}ISODate" minOccurs="0"/>
 *         <element name="Assgnr" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}Party40Choice" minOccurs="0"/>
 *         <element name="Assgne" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}Party40Choice" minOccurs="0"/>
 *         <element name="OrgnlTxRef" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}OriginalTransactionReference35" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransaction147", propOrder = {
    "modStsId",
    "rslvdCase",
    "orgnlGrpInf",
    "orgnlPmtInfId",
    "orgnlInstrId",
    "orgnlEndToEndId",
    "orgnlTxId",
    "orgnlClrSysRef",
    "orgnlUETR",
    "modStsRsnInf",
    "rsltnRltdInf",
    "orgnlIntrBkSttlmAmt",
    "orgnlIntrBkSttlmDt",
    "assgnr",
    "assgne",
    "orgnlTxRef"
})
public class PaymentTransaction147 {

    @XmlElement(name = "ModStsId")
    protected String modStsId;
    @XmlElement(name = "RslvdCase")
    protected Case5 rslvdCase;
    @XmlElement(name = "OrgnlGrpInf", required = true)
    protected OriginalGroupInformation29 orgnlGrpInf;
    @XmlElement(name = "OrgnlPmtInfId")
    protected String orgnlPmtInfId;
    @XmlElement(name = "OrgnlInstrId")
    protected String orgnlInstrId;
    @XmlElement(name = "OrgnlEndToEndId")
    protected String orgnlEndToEndId;
    @XmlElement(name = "OrgnlTxId")
    protected String orgnlTxId;
    @XmlElement(name = "OrgnlClrSysRef")
    protected String orgnlClrSysRef;
    @XmlElement(name = "OrgnlUETR")
    protected String orgnlUETR;
    @XmlElement(name = "ModStsRsnInf")
    protected List<ModificationStatusReason2> modStsRsnInf;
    @XmlElement(name = "RsltnRltdInf")
    protected ResolutionData4 rsltnRltdInf;
    @XmlElement(name = "OrgnlIntrBkSttlmAmt")
    protected ActiveOrHistoricCurrencyAndAmount orgnlIntrBkSttlmAmt;
    @XmlElement(name = "OrgnlIntrBkSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orgnlIntrBkSttlmDt;
    @XmlElement(name = "Assgnr")
    protected Party40Choice assgnr;
    @XmlElement(name = "Assgne")
    protected Party40Choice assgne;
    @XmlElement(name = "OrgnlTxRef")
    protected OriginalTransactionReference35 orgnlTxRef;

    /**
     * Gets the value of the modStsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModStsId() {
        return modStsId;
    }

    /**
     * Sets the value of the modStsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModStsId(String value) {
        this.modStsId = value;
    }

    /**
     * Gets the value of the rslvdCase property.
     * 
     * @return
     *     possible object is
     *     {@link Case5 }
     *     
     */
    public Case5 getRslvdCase() {
        return rslvdCase;
    }

    /**
     * Sets the value of the rslvdCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case5 }
     *     
     */
    public void setRslvdCase(Case5 value) {
        this.rslvdCase = value;
    }

    /**
     * Gets the value of the orgnlGrpInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public OriginalGroupInformation29 getOrgnlGrpInf() {
        return orgnlGrpInf;
    }

    /**
     * Sets the value of the orgnlGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public void setOrgnlGrpInf(OriginalGroupInformation29 value) {
        this.orgnlGrpInf = value;
    }

    /**
     * Gets the value of the orgnlPmtInfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlPmtInfId() {
        return orgnlPmtInfId;
    }

    /**
     * Sets the value of the orgnlPmtInfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlPmtInfId(String value) {
        this.orgnlPmtInfId = value;
    }

    /**
     * Gets the value of the orgnlInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlInstrId() {
        return orgnlInstrId;
    }

    /**
     * Sets the value of the orgnlInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlInstrId(String value) {
        this.orgnlInstrId = value;
    }

    /**
     * Gets the value of the orgnlEndToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlEndToEndId() {
        return orgnlEndToEndId;
    }

    /**
     * Sets the value of the orgnlEndToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlEndToEndId(String value) {
        this.orgnlEndToEndId = value;
    }

    /**
     * Gets the value of the orgnlTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlTxId() {
        return orgnlTxId;
    }

    /**
     * Sets the value of the orgnlTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlTxId(String value) {
        this.orgnlTxId = value;
    }

    /**
     * Gets the value of the orgnlClrSysRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlClrSysRef() {
        return orgnlClrSysRef;
    }

    /**
     * Sets the value of the orgnlClrSysRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlClrSysRef(String value) {
        this.orgnlClrSysRef = value;
    }

    /**
     * Gets the value of the orgnlUETR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlUETR() {
        return orgnlUETR;
    }

    /**
     * Sets the value of the orgnlUETR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlUETR(String value) {
        this.orgnlUETR = value;
    }

    /**
     * Gets the value of the modStsRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the modStsRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModStsRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationStatusReason2 }
     * 
     * 
     * @return
     *     The value of the modStsRsnInf property.
     */
    public List<ModificationStatusReason2> getModStsRsnInf() {
        if (modStsRsnInf == null) {
            modStsRsnInf = new ArrayList<>();
        }
        return this.modStsRsnInf;
    }

    /**
     * Gets the value of the rsltnRltdInf property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionData4 }
     *     
     */
    public ResolutionData4 getRsltnRltdInf() {
        return rsltnRltdInf;
    }

    /**
     * Sets the value of the rsltnRltdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionData4 }
     *     
     */
    public void setRsltnRltdInf(ResolutionData4 value) {
        this.rsltnRltdInf = value;
    }

    /**
     * Gets the value of the orgnlIntrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getOrgnlIntrBkSttlmAmt() {
        return orgnlIntrBkSttlmAmt;
    }

    /**
     * Sets the value of the orgnlIntrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setOrgnlIntrBkSttlmAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.orgnlIntrBkSttlmAmt = value;
    }

    /**
     * Gets the value of the orgnlIntrBkSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrgnlIntrBkSttlmDt() {
        return orgnlIntrBkSttlmDt;
    }

    /**
     * Sets the value of the orgnlIntrBkSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrgnlIntrBkSttlmDt(XMLGregorianCalendar value) {
        this.orgnlIntrBkSttlmDt = value;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setAssgnr(Party40Choice value) {
        this.assgnr = value;
    }

    /**
     * Gets the value of the assgne property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getAssgne() {
        return assgne;
    }

    /**
     * Sets the value of the assgne property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setAssgne(Party40Choice value) {
        this.assgne = value;
    }

    /**
     * Gets the value of the orgnlTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransactionReference35 }
     *     
     */
    public OriginalTransactionReference35 getOrgnlTxRef() {
        return orgnlTxRef;
    }

    /**
     * Sets the value of the orgnlTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransactionReference35 }
     *     
     */
    public void setOrgnlTxRef(OriginalTransactionReference35 value) {
        this.orgnlTxRef = value;
    }

}
