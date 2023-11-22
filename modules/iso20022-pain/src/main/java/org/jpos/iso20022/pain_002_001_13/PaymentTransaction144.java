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

package org.jpos.iso20022.pain_002_001_13;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTransaction144 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentTransaction144">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StsId" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.13}Max35Text" minOccurs="0"/>
 *         <element name="OrgnlInstrId" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.13}Max35Text" minOccurs="0"/>
 *         <element name="OrgnlEndToEndId" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.13}Max35Text" minOccurs="0"/>
 *         <element name="OrgnlUETR" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.13}UUIDv4Identifier" minOccurs="0"/>
 *         <element name="TxSts" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.13}ExternalPaymentTransactionStatus1Code" minOccurs="0"/>
 *         <element name="StsRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.13}StatusReasonInformation12" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ChrgsInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.13}Charges12" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TrckrData" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.13}TrackerData1" minOccurs="0"/>
 *         <element name="AccptncDtTm" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.13}ISODateTime" minOccurs="0"/>
 *         <element name="AcctSvcrRef" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.13}Max35Text" minOccurs="0"/>
 *         <element name="ClrSysRef" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.13}Max35Text" minOccurs="0"/>
 *         <element name="OrgnlTxRef" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.13}OriginalTransactionReference35" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.13}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransaction144", propOrder = {
    "stsId",
    "orgnlInstrId",
    "orgnlEndToEndId",
    "orgnlUETR",
    "txSts",
    "stsRsnInf",
    "chrgsInf",
    "trckrData",
    "accptncDtTm",
    "acctSvcrRef",
    "clrSysRef",
    "orgnlTxRef",
    "splmtryData"
})
public class PaymentTransaction144 {

    @XmlElement(name = "StsId")
    protected String stsId;
    @XmlElement(name = "OrgnlInstrId")
    protected String orgnlInstrId;
    @XmlElement(name = "OrgnlEndToEndId")
    protected String orgnlEndToEndId;
    @XmlElement(name = "OrgnlUETR")
    protected String orgnlUETR;
    @XmlElement(name = "TxSts")
    protected String txSts;
    @XmlElement(name = "StsRsnInf")
    protected List<StatusReasonInformation12> stsRsnInf;
    @XmlElement(name = "ChrgsInf")
    protected List<Charges12> chrgsInf;
    @XmlElement(name = "TrckrData")
    protected TrackerData1 trckrData;
    @XmlElement(name = "AccptncDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accptncDtTm;
    @XmlElement(name = "AcctSvcrRef")
    protected String acctSvcrRef;
    @XmlElement(name = "ClrSysRef")
    protected String clrSysRef;
    @XmlElement(name = "OrgnlTxRef")
    protected OriginalTransactionReference35 orgnlTxRef;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the stsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsId() {
        return stsId;
    }

    /**
     * Sets the value of the stsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStsId(String value) {
        this.stsId = value;
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
     * Gets the value of the txSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxSts() {
        return txSts;
    }

    /**
     * Sets the value of the txSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxSts(String value) {
        this.txSts = value;
    }

    /**
     * Gets the value of the stsRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stsRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusReasonInformation12 }
     * 
     * 
     * @return
     *     The value of the stsRsnInf property.
     */
    public List<StatusReasonInformation12> getStsRsnInf() {
        if (stsRsnInf == null) {
            stsRsnInf = new ArrayList<>();
        }
        return this.stsRsnInf;
    }

    /**
     * Gets the value of the chrgsInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chrgsInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgsInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charges12 }
     * 
     * 
     * @return
     *     The value of the chrgsInf property.
     */
    public List<Charges12> getChrgsInf() {
        if (chrgsInf == null) {
            chrgsInf = new ArrayList<>();
        }
        return this.chrgsInf;
    }

    /**
     * Gets the value of the trckrData property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerData1 }
     *     
     */
    public TrackerData1 getTrckrData() {
        return trckrData;
    }

    /**
     * Sets the value of the trckrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerData1 }
     *     
     */
    public void setTrckrData(TrackerData1 value) {
        this.trckrData = value;
    }

    /**
     * Gets the value of the accptncDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccptncDtTm() {
        return accptncDtTm;
    }

    /**
     * Sets the value of the accptncDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccptncDtTm(XMLGregorianCalendar value) {
        this.accptncDtTm = value;
    }

    /**
     * Gets the value of the acctSvcrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSvcrRef() {
        return acctSvcrRef;
    }

    /**
     * Sets the value of the acctSvcrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSvcrRef(String value) {
        this.acctSvcrRef = value;
    }

    /**
     * Gets the value of the clrSysRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrSysRef() {
        return clrSysRef;
    }

    /**
     * Sets the value of the clrSysRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrSysRef(String value) {
        this.clrSysRef = value;
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

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
