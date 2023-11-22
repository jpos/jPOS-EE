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

package org.jpos.iso20022.cain_003_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerTransportSummary2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PassengerTransportSummary2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DocNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Rsvatn" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}ReservationDetails3" minOccurs="0"/>
 *         <element name="TrvlAuthstnCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max70Text" minOccurs="0"/>
 *         <element name="TcktIssr" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="OpnTcktInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="CstmrRef" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}CustomerReference1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Pssngr" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Customer8" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Dprture" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}DepartureOrArrival1" minOccurs="0"/>
 *         <element name="Drtn" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max4NumericText" minOccurs="0"/>
 *         <element name="InsrncInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}AmountDetails2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SummryCmmdtyId" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="LltyPrgrmm" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}LoyaltyProgramme2" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerTransportSummary2", propOrder = {
    "docNb",
    "rsvatn",
    "trvlAuthstnCd",
    "tcktIssr",
    "opnTcktInd",
    "cstmrRef",
    "pssngr",
    "dprture",
    "drtn",
    "insrncInd",
    "ttlAmt",
    "summryCmmdtyId",
    "lltyPrgrmm",
    "addtlData"
})
public class PassengerTransportSummary2 {

    @XmlElement(name = "DocNb")
    protected String docNb;
    @XmlElement(name = "Rsvatn")
    protected ReservationDetails3 rsvatn;
    @XmlElement(name = "TrvlAuthstnCd")
    protected String trvlAuthstnCd;
    @XmlElement(name = "TcktIssr")
    protected String tcktIssr;
    @XmlElement(name = "OpnTcktInd")
    protected Boolean opnTcktInd;
    @XmlElement(name = "CstmrRef")
    protected List<CustomerReference1> cstmrRef;
    @XmlElement(name = "Pssngr")
    protected List<Customer8> pssngr;
    @XmlElement(name = "Dprture")
    protected DepartureOrArrival1 dprture;
    @XmlElement(name = "Drtn")
    protected String drtn;
    @XmlElement(name = "InsrncInd")
    protected Boolean insrncInd;
    @XmlElement(name = "TtlAmt")
    protected List<AmountDetails2> ttlAmt;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "LltyPrgrmm")
    protected LoyaltyProgramme2 lltyPrgrmm;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the docNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNb() {
        return docNb;
    }

    /**
     * Sets the value of the docNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNb(String value) {
        this.docNb = value;
    }

    /**
     * Gets the value of the rsvatn property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationDetails3 }
     *     
     */
    public ReservationDetails3 getRsvatn() {
        return rsvatn;
    }

    /**
     * Sets the value of the rsvatn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationDetails3 }
     *     
     */
    public void setRsvatn(ReservationDetails3 value) {
        this.rsvatn = value;
    }

    /**
     * Gets the value of the trvlAuthstnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrvlAuthstnCd() {
        return trvlAuthstnCd;
    }

    /**
     * Sets the value of the trvlAuthstnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrvlAuthstnCd(String value) {
        this.trvlAuthstnCd = value;
    }

    /**
     * Gets the value of the tcktIssr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcktIssr() {
        return tcktIssr;
    }

    /**
     * Sets the value of the tcktIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcktIssr(String value) {
        this.tcktIssr = value;
    }

    /**
     * Gets the value of the opnTcktInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpnTcktInd() {
        return opnTcktInd;
    }

    /**
     * Sets the value of the opnTcktInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpnTcktInd(Boolean value) {
        this.opnTcktInd = value;
    }

    /**
     * Gets the value of the cstmrRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cstmrRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstmrRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReference1 }
     * 
     * 
     * @return
     *     The value of the cstmrRef property.
     */
    public List<CustomerReference1> getCstmrRef() {
        if (cstmrRef == null) {
            cstmrRef = new ArrayList<>();
        }
        return this.cstmrRef;
    }

    /**
     * Gets the value of the pssngr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pssngr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPssngr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Customer8 }
     * 
     * 
     * @return
     *     The value of the pssngr property.
     */
    public List<Customer8> getPssngr() {
        if (pssngr == null) {
            pssngr = new ArrayList<>();
        }
        return this.pssngr;
    }

    /**
     * Gets the value of the dprture property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureOrArrival1 }
     *     
     */
    public DepartureOrArrival1 getDprture() {
        return dprture;
    }

    /**
     * Sets the value of the dprture property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureOrArrival1 }
     *     
     */
    public void setDprture(DepartureOrArrival1 value) {
        this.dprture = value;
    }

    /**
     * Gets the value of the drtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrtn() {
        return drtn;
    }

    /**
     * Sets the value of the drtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrtn(String value) {
        this.drtn = value;
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
     * Gets the value of the ttlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ttlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountDetails2 }
     * 
     * 
     * @return
     *     The value of the ttlAmt property.
     */
    public List<AmountDetails2> getTtlAmt() {
        if (ttlAmt == null) {
            ttlAmt = new ArrayList<>();
        }
        return this.ttlAmt;
    }

    /**
     * Gets the value of the summryCmmdtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummryCmmdtyId() {
        return summryCmmdtyId;
    }

    /**
     * Sets the value of the summryCmmdtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
    }

    /**
     * Gets the value of the lltyPrgrmm property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyProgramme2 }
     *     
     */
    public LoyaltyProgramme2 getLltyPrgrmm() {
        return lltyPrgrmm;
    }

    /**
     * Sets the value of the lltyPrgrmm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyProgramme2 }
     *     
     */
    public void setLltyPrgrmm(LoyaltyProgramme2 value) {
        this.lltyPrgrmm = value;
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
