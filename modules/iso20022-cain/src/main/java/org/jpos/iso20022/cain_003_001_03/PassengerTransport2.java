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
 * <p>Java class for PassengerTransport2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PassengerTransport2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Summry" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}PassengerTransportSummary2" minOccurs="0"/>
 *         <element name="TripLeg" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TripLeg2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AncllryPurchs" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}AncillaryPurchase2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="HirdVhclDtls" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}HiredVehicle2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerTransport2", propOrder = {
    "summry",
    "tripLeg",
    "ancllryPurchs",
    "hirdVhclDtls"
})
public class PassengerTransport2 {

    @XmlElement(name = "Summry")
    protected PassengerTransportSummary2 summry;
    @XmlElement(name = "TripLeg")
    protected List<TripLeg2> tripLeg;
    @XmlElement(name = "AncllryPurchs")
    protected List<AncillaryPurchase2> ancllryPurchs;
    @XmlElement(name = "HirdVhclDtls")
    protected List<HiredVehicle2> hirdVhclDtls;

    /**
     * Gets the value of the summry property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerTransportSummary2 }
     *     
     */
    public PassengerTransportSummary2 getSummry() {
        return summry;
    }

    /**
     * Sets the value of the summry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerTransportSummary2 }
     *     
     */
    public void setSummry(PassengerTransportSummary2 value) {
        this.summry = value;
    }

    /**
     * Gets the value of the tripLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tripLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TripLeg2 }
     * 
     * 
     * @return
     *     The value of the tripLeg property.
     */
    public List<TripLeg2> getTripLeg() {
        if (tripLeg == null) {
            tripLeg = new ArrayList<>();
        }
        return this.tripLeg;
    }

    /**
     * Gets the value of the ancllryPurchs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ancllryPurchs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncllryPurchs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryPurchase2 }
     * 
     * 
     * @return
     *     The value of the ancllryPurchs property.
     */
    public List<AncillaryPurchase2> getAncllryPurchs() {
        if (ancllryPurchs == null) {
            ancllryPurchs = new ArrayList<>();
        }
        return this.ancllryPurchs;
    }

    /**
     * Gets the value of the hirdVhclDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hirdVhclDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHirdVhclDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HiredVehicle2 }
     * 
     * 
     * @return
     *     The value of the hirdVhclDtls property.
     */
    public List<HiredVehicle2> getHirdVhclDtls() {
        if (hirdVhclDtls == null) {
            hirdVhclDtls = new ArrayList<>();
        }
        return this.hirdVhclDtls;
    }

}
