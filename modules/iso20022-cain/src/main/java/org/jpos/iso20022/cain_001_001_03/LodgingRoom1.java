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

package org.jpos.iso20022.cain_001_001_03;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LodgingRoom1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LodgingRoom1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RoomTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="RoomLctn" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="BedTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max70Text" minOccurs="0"/>
 *         <element name="GstsPerRoom" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max3NumericText" minOccurs="0"/>
 *         <element name="AdltsInRoom" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max3NumericText" minOccurs="0"/>
 *         <element name="ChldrnInRoom" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max3NumericText" minOccurs="0"/>
 *         <element name="DalyRoomRate" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LodgingRoom1", propOrder = {
    "roomTp",
    "roomLctn",
    "bedTp",
    "gstsPerRoom",
    "adltsInRoom",
    "chldrnInRoom",
    "dalyRoomRate"
})
public class LodgingRoom1 {

    @XmlElement(name = "RoomTp")
    protected String roomTp;
    @XmlElement(name = "RoomLctn")
    protected String roomLctn;
    @XmlElement(name = "BedTp")
    protected String bedTp;
    @XmlElement(name = "GstsPerRoom")
    protected String gstsPerRoom;
    @XmlElement(name = "AdltsInRoom")
    protected String adltsInRoom;
    @XmlElement(name = "ChldrnInRoom")
    protected String chldrnInRoom;
    @XmlElement(name = "DalyRoomRate")
    protected BigDecimal dalyRoomRate;

    /**
     * Gets the value of the roomTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTp() {
        return roomTp;
    }

    /**
     * Sets the value of the roomTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTp(String value) {
        this.roomTp = value;
    }

    /**
     * Gets the value of the roomLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomLctn() {
        return roomLctn;
    }

    /**
     * Sets the value of the roomLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomLctn(String value) {
        this.roomLctn = value;
    }

    /**
     * Gets the value of the bedTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedTp() {
        return bedTp;
    }

    /**
     * Sets the value of the bedTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedTp(String value) {
        this.bedTp = value;
    }

    /**
     * Gets the value of the gstsPerRoom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGstsPerRoom() {
        return gstsPerRoom;
    }

    /**
     * Sets the value of the gstsPerRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGstsPerRoom(String value) {
        this.gstsPerRoom = value;
    }

    /**
     * Gets the value of the adltsInRoom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdltsInRoom() {
        return adltsInRoom;
    }

    /**
     * Sets the value of the adltsInRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdltsInRoom(String value) {
        this.adltsInRoom = value;
    }

    /**
     * Gets the value of the chldrnInRoom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChldrnInRoom() {
        return chldrnInRoom;
    }

    /**
     * Sets the value of the chldrnInRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChldrnInRoom(String value) {
        this.chldrnInRoom = value;
    }

    /**
     * Gets the value of the dalyRoomRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDalyRoomRate() {
        return dalyRoomRate;
    }

    /**
     * Sets the value of the dalyRoomRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDalyRoomRate(BigDecimal value) {
        this.dalyRoomRate = value;
    }

}
