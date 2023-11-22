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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LodgingSummary2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LodgingSummary2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FolioNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Prprty" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}LodgingProperty2" minOccurs="0"/>
 *         <element name="Cstmr" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Customer8" minOccurs="0"/>
 *         <element name="NbOfRooms" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max4NumericText" minOccurs="0"/>
 *         <element name="Room" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}LodgingRoom1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Drtn" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max4NumericText" minOccurs="0"/>
 *         <element name="Arrvl" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}DepartureOrArrival2" minOccurs="0"/>
 *         <element name="Dprture" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}DepartureOrArrival1" minOccurs="0"/>
 *         <element name="NoShowInd" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="InsrncInd" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="InsrncAmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlTax" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Tax39" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AuthrsdAmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}AuthorisedAmount1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SummryCmmdtyId" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="LltyPrgrmm" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}LoyaltyProgramme2" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "LodgingSummary2", propOrder = {
    "folioNb",
    "prprty",
    "cstmr",
    "nbOfRooms",
    "room",
    "drtn",
    "arrvl",
    "dprture",
    "noShowInd",
    "insrncInd",
    "insrncAmt",
    "ttlTax",
    "ttlAmt",
    "authrsdAmt",
    "summryCmmdtyId",
    "lltyPrgrmm",
    "addtlData"
})
public class LodgingSummary2 {

    @XmlElement(name = "FolioNb")
    protected String folioNb;
    @XmlElement(name = "Prprty")
    protected LodgingProperty2 prprty;
    @XmlElement(name = "Cstmr")
    protected Customer8 cstmr;
    @XmlElement(name = "NbOfRooms")
    protected String nbOfRooms;
    @XmlElement(name = "Room")
    protected List<LodgingRoom1> room;
    @XmlElement(name = "Drtn")
    protected String drtn;
    @XmlElement(name = "Arrvl")
    protected DepartureOrArrival2 arrvl;
    @XmlElement(name = "Dprture")
    protected DepartureOrArrival1 dprture;
    @XmlElement(name = "NoShowInd")
    protected Boolean noShowInd;
    @XmlElement(name = "InsrncInd")
    protected Boolean insrncInd;
    @XmlElement(name = "InsrncAmt")
    protected BigDecimal insrncAmt;
    @XmlElement(name = "TtlTax")
    protected List<Tax39> ttlTax;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;
    @XmlElement(name = "AuthrsdAmt")
    protected List<AuthorisedAmount1> authrsdAmt;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "LltyPrgrmm")
    protected List<LoyaltyProgramme2> lltyPrgrmm;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the folioNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioNb() {
        return folioNb;
    }

    /**
     * Sets the value of the folioNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioNb(String value) {
        this.folioNb = value;
    }

    /**
     * Gets the value of the prprty property.
     * 
     * @return
     *     possible object is
     *     {@link LodgingProperty2 }
     *     
     */
    public LodgingProperty2 getPrprty() {
        return prprty;
    }

    /**
     * Sets the value of the prprty property.
     * 
     * @param value
     *     allowed object is
     *     {@link LodgingProperty2 }
     *     
     */
    public void setPrprty(LodgingProperty2 value) {
        this.prprty = value;
    }

    /**
     * Gets the value of the cstmr property.
     * 
     * @return
     *     possible object is
     *     {@link Customer8 }
     *     
     */
    public Customer8 getCstmr() {
        return cstmr;
    }

    /**
     * Sets the value of the cstmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer8 }
     *     
     */
    public void setCstmr(Customer8 value) {
        this.cstmr = value;
    }

    /**
     * Gets the value of the nbOfRooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfRooms() {
        return nbOfRooms;
    }

    /**
     * Sets the value of the nbOfRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfRooms(String value) {
        this.nbOfRooms = value;
    }

    /**
     * Gets the value of the room property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the room property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LodgingRoom1 }
     * 
     * 
     * @return
     *     The value of the room property.
     */
    public List<LodgingRoom1> getRoom() {
        if (room == null) {
            room = new ArrayList<>();
        }
        return this.room;
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
     * Gets the value of the arrvl property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureOrArrival2 }
     *     
     */
    public DepartureOrArrival2 getArrvl() {
        return arrvl;
    }

    /**
     * Sets the value of the arrvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureOrArrival2 }
     *     
     */
    public void setArrvl(DepartureOrArrival2 value) {
        this.arrvl = value;
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
     * Gets the value of the noShowInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoShowInd() {
        return noShowInd;
    }

    /**
     * Sets the value of the noShowInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoShowInd(Boolean value) {
        this.noShowInd = value;
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
     * Gets the value of the ttlTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ttlTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax39 }
     * 
     * 
     * @return
     *     The value of the ttlTax property.
     */
    public List<Tax39> getTtlTax() {
        if (ttlTax == null) {
            ttlTax = new ArrayList<>();
        }
        return this.ttlTax;
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
     * Gets the value of the authrsdAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the authrsdAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthrsdAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorisedAmount1 }
     * 
     * 
     * @return
     *     The value of the authrsdAmt property.
     */
    public List<AuthorisedAmount1> getAuthrsdAmt() {
        if (authrsdAmt == null) {
            authrsdAmt = new ArrayList<>();
        }
        return this.authrsdAmt;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lltyPrgrmm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLltyPrgrmm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyProgramme2 }
     * 
     * 
     * @return
     *     The value of the lltyPrgrmm property.
     */
    public List<LoyaltyProgramme2> getLltyPrgrmm() {
        if (lltyPrgrmm == null) {
            lltyPrgrmm = new ArrayList<>();
        }
        return this.lltyPrgrmm;
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
