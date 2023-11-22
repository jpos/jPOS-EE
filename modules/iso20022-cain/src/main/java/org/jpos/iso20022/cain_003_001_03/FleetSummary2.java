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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FleetSummary2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FleetSummary2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Drvr" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Driver2" minOccurs="0"/>
 *         <element name="Vhcl" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Vehicle5" minOccurs="0"/>
 *         <element name="DrvrOrVhclCard" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}PlainCardData21" minOccurs="0"/>
 *         <element name="CardFuelPrmptCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max1Number" minOccurs="0"/>
 *         <element name="AgtFuelPrmptCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="TripInf" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TripInformation1" minOccurs="0"/>
 *         <element name="LclAmnty" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}LocalAmenity1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TxRltdData" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}PaymentTransaction141" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}AdditionalInformation19" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FleetSummary2", propOrder = {
    "drvr",
    "vhcl",
    "drvrOrVhclCard",
    "cardFuelPrmptCd",
    "agtFuelPrmptCd",
    "tripInf",
    "lclAmnty",
    "txRltdData",
    "addtlData"
})
public class FleetSummary2 {

    @XmlElement(name = "Drvr")
    protected Driver2 drvr;
    @XmlElement(name = "Vhcl")
    protected Vehicle5 vhcl;
    @XmlElement(name = "DrvrOrVhclCard")
    protected PlainCardData21 drvrOrVhclCard;
    @XmlElement(name = "CardFuelPrmptCd")
    protected BigDecimal cardFuelPrmptCd;
    @XmlElement(name = "AgtFuelPrmptCd")
    protected String agtFuelPrmptCd;
    @XmlElement(name = "TripInf")
    protected TripInformation1 tripInf;
    @XmlElement(name = "LclAmnty")
    protected List<LocalAmenity1> lclAmnty;
    @XmlElement(name = "TxRltdData")
    protected List<PaymentTransaction141> txRltdData;
    @XmlElement(name = "AddtlData")
    protected AdditionalInformation19 addtlData;

    /**
     * Gets the value of the drvr property.
     * 
     * @return
     *     possible object is
     *     {@link Driver2 }
     *     
     */
    public Driver2 getDrvr() {
        return drvr;
    }

    /**
     * Sets the value of the drvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Driver2 }
     *     
     */
    public void setDrvr(Driver2 value) {
        this.drvr = value;
    }

    /**
     * Gets the value of the vhcl property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle5 }
     *     
     */
    public Vehicle5 getVhcl() {
        return vhcl;
    }

    /**
     * Sets the value of the vhcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle5 }
     *     
     */
    public void setVhcl(Vehicle5 value) {
        this.vhcl = value;
    }

    /**
     * Gets the value of the drvrOrVhclCard property.
     * 
     * @return
     *     possible object is
     *     {@link PlainCardData21 }
     *     
     */
    public PlainCardData21 getDrvrOrVhclCard() {
        return drvrOrVhclCard;
    }

    /**
     * Sets the value of the drvrOrVhclCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlainCardData21 }
     *     
     */
    public void setDrvrOrVhclCard(PlainCardData21 value) {
        this.drvrOrVhclCard = value;
    }

    /**
     * Gets the value of the cardFuelPrmptCd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCardFuelPrmptCd() {
        return cardFuelPrmptCd;
    }

    /**
     * Sets the value of the cardFuelPrmptCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCardFuelPrmptCd(BigDecimal value) {
        this.cardFuelPrmptCd = value;
    }

    /**
     * Gets the value of the agtFuelPrmptCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgtFuelPrmptCd() {
        return agtFuelPrmptCd;
    }

    /**
     * Sets the value of the agtFuelPrmptCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgtFuelPrmptCd(String value) {
        this.agtFuelPrmptCd = value;
    }

    /**
     * Gets the value of the tripInf property.
     * 
     * @return
     *     possible object is
     *     {@link TripInformation1 }
     *     
     */
    public TripInformation1 getTripInf() {
        return tripInf;
    }

    /**
     * Sets the value of the tripInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripInformation1 }
     *     
     */
    public void setTripInf(TripInformation1 value) {
        this.tripInf = value;
    }

    /**
     * Gets the value of the lclAmnty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lclAmnty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLclAmnty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalAmenity1 }
     * 
     * 
     * @return
     *     The value of the lclAmnty property.
     */
    public List<LocalAmenity1> getLclAmnty() {
        if (lclAmnty == null) {
            lclAmnty = new ArrayList<>();
        }
        return this.lclAmnty;
    }

    /**
     * Gets the value of the txRltdData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txRltdData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxRltdData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTransaction141 }
     * 
     * 
     * @return
     *     The value of the txRltdData property.
     */
    public List<PaymentTransaction141> getTxRltdData() {
        if (txRltdData == null) {
            txRltdData = new ArrayList<>();
        }
        return this.txRltdData;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation19 }
     *     
     */
    public AdditionalInformation19 getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation19 }
     *     
     */
    public void setAddtlData(AdditionalInformation19 value) {
        this.addtlData = value;
    }

}
