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

package org.jpos.iso20022.caad_008_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TripLeg2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TripLeg2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35NumericText" minOccurs="0"/>
 *         <element name="Tckt" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Ticket2" minOccurs="0"/>
 *         <element name="Doc" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}DocumentReference1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrcdrRef" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="TrnsprtTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}TransportType1Code" minOccurs="0"/>
 *         <element name="OthrTrnsprtTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="CmmdtyCd" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max4Text" minOccurs="0"/>
 *         <element name="Crrier" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}CarrierIdentification1" minOccurs="0"/>
 *         <element name="RouteNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="SvcClss" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Dprture" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}DepartureOrArrival1" minOccurs="0"/>
 *         <element name="Arrvl" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}DepartureOrArrival1" minOccurs="0"/>
 *         <element name="Drtn" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max4NumericText" minOccurs="0"/>
 *         <element name="StopOverInd" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="NonDrctRouteCd" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="FairBsisCd" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="InsrncInd" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="TripLegAmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}AmountDetails2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CdtRsnCd" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="PrcdrId" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="LltyPrgrmm" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}LoyaltyProgramme2" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripLeg2", propOrder = {
    "seqNb",
    "tckt",
    "doc",
    "prcdrRef",
    "trnsprtTp",
    "othrTrnsprtTp",
    "cmmdtyCd",
    "crrier",
    "routeNb",
    "svcClss",
    "dprture",
    "arrvl",
    "drtn",
    "stopOverInd",
    "nonDrctRouteCd",
    "fairBsisCd",
    "insrncInd",
    "tripLegAmt",
    "cdtRsnCd",
    "prcdrId",
    "lltyPrgrmm",
    "addtlData"
})
public class TripLeg2 {

    @XmlElement(name = "SeqNb")
    protected String seqNb;
    @XmlElement(name = "Tckt")
    protected Ticket2 tckt;
    @XmlElement(name = "Doc")
    protected List<DocumentReference1> doc;
    @XmlElement(name = "PrcdrRef")
    protected String prcdrRef;
    @XmlElement(name = "TrnsprtTp")
    @XmlSchemaType(name = "string")
    protected TransportType1Code trnsprtTp;
    @XmlElement(name = "OthrTrnsprtTp")
    protected String othrTrnsprtTp;
    @XmlElement(name = "CmmdtyCd")
    protected String cmmdtyCd;
    @XmlElement(name = "Crrier")
    protected CarrierIdentification1 crrier;
    @XmlElement(name = "RouteNb")
    protected String routeNb;
    @XmlElement(name = "SvcClss")
    protected String svcClss;
    @XmlElement(name = "Dprture")
    protected DepartureOrArrival1 dprture;
    @XmlElement(name = "Arrvl")
    protected DepartureOrArrival1 arrvl;
    @XmlElement(name = "Drtn")
    protected String drtn;
    @XmlElement(name = "StopOverInd")
    protected Boolean stopOverInd;
    @XmlElement(name = "NonDrctRouteCd")
    protected String nonDrctRouteCd;
    @XmlElement(name = "FairBsisCd")
    protected String fairBsisCd;
    @XmlElement(name = "InsrncInd")
    protected Boolean insrncInd;
    @XmlElement(name = "TripLegAmt")
    protected List<AmountDetails2> tripLegAmt;
    @XmlElement(name = "CdtRsnCd")
    protected String cdtRsnCd;
    @XmlElement(name = "PrcdrId")
    protected String prcdrId;
    @XmlElement(name = "LltyPrgrmm")
    protected LoyaltyProgramme2 lltyPrgrmm;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqNb(String value) {
        this.seqNb = value;
    }

    /**
     * Gets the value of the tckt property.
     * 
     * @return
     *     possible object is
     *     {@link Ticket2 }
     *     
     */
    public Ticket2 getTckt() {
        return tckt;
    }

    /**
     * Sets the value of the tckt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ticket2 }
     *     
     */
    public void setTckt(Ticket2 value) {
        this.tckt = value;
    }

    /**
     * Gets the value of the doc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the doc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReference1 }
     * 
     * 
     * @return
     *     The value of the doc property.
     */
    public List<DocumentReference1> getDoc() {
        if (doc == null) {
            doc = new ArrayList<>();
        }
        return this.doc;
    }

    /**
     * Gets the value of the prcdrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcdrRef() {
        return prcdrRef;
    }

    /**
     * Sets the value of the prcdrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcdrRef(String value) {
        this.prcdrRef = value;
    }

    /**
     * Gets the value of the trnsprtTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransportType1Code }
     *     
     */
    public TransportType1Code getTrnsprtTp() {
        return trnsprtTp;
    }

    /**
     * Sets the value of the trnsprtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportType1Code }
     *     
     */
    public void setTrnsprtTp(TransportType1Code value) {
        this.trnsprtTp = value;
    }

    /**
     * Gets the value of the othrTrnsprtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTrnsprtTp() {
        return othrTrnsprtTp;
    }

    /**
     * Sets the value of the othrTrnsprtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrTrnsprtTp(String value) {
        this.othrTrnsprtTp = value;
    }

    /**
     * Gets the value of the cmmdtyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmmdtyCd() {
        return cmmdtyCd;
    }

    /**
     * Sets the value of the cmmdtyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmmdtyCd(String value) {
        this.cmmdtyCd = value;
    }

    /**
     * Gets the value of the crrier property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierIdentification1 }
     *     
     */
    public CarrierIdentification1 getCrrier() {
        return crrier;
    }

    /**
     * Sets the value of the crrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierIdentification1 }
     *     
     */
    public void setCrrier(CarrierIdentification1 value) {
        this.crrier = value;
    }

    /**
     * Gets the value of the routeNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteNb() {
        return routeNb;
    }

    /**
     * Sets the value of the routeNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteNb(String value) {
        this.routeNb = value;
    }

    /**
     * Gets the value of the svcClss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcClss() {
        return svcClss;
    }

    /**
     * Sets the value of the svcClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcClss(String value) {
        this.svcClss = value;
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
     * Gets the value of the arrvl property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureOrArrival1 }
     *     
     */
    public DepartureOrArrival1 getArrvl() {
        return arrvl;
    }

    /**
     * Sets the value of the arrvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureOrArrival1 }
     *     
     */
    public void setArrvl(DepartureOrArrival1 value) {
        this.arrvl = value;
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
     * Gets the value of the stopOverInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopOverInd() {
        return stopOverInd;
    }

    /**
     * Sets the value of the stopOverInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopOverInd(Boolean value) {
        this.stopOverInd = value;
    }

    /**
     * Gets the value of the nonDrctRouteCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonDrctRouteCd() {
        return nonDrctRouteCd;
    }

    /**
     * Sets the value of the nonDrctRouteCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonDrctRouteCd(String value) {
        this.nonDrctRouteCd = value;
    }

    /**
     * Gets the value of the fairBsisCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFairBsisCd() {
        return fairBsisCd;
    }

    /**
     * Sets the value of the fairBsisCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFairBsisCd(String value) {
        this.fairBsisCd = value;
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
     * Gets the value of the tripLegAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tripLegAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripLegAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountDetails2 }
     * 
     * 
     * @return
     *     The value of the tripLegAmt property.
     */
    public List<AmountDetails2> getTripLegAmt() {
        if (tripLegAmt == null) {
            tripLegAmt = new ArrayList<>();
        }
        return this.tripLegAmt;
    }

    /**
     * Gets the value of the cdtRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtRsnCd() {
        return cdtRsnCd;
    }

    /**
     * Sets the value of the cdtRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtRsnCd(String value) {
        this.cdtRsnCd = value;
    }

    /**
     * Gets the value of the prcdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcdrId() {
        return prcdrId;
    }

    /**
     * Sets the value of the prcdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcdrId(String value) {
        this.prcdrId = value;
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
