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

package org.jpos.iso20022.auth_039_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesNonTradingDayReport1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesNonTradingDayReport1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.039.001.01}TradingVenueIdentification1Choice"/>
 *         <element name="NonWorkgDay" type="{urn:iso:std:iso:20022:tech:xsd:auth.039.001.01}SecuritiesNonTradingDay1" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesNonTradingDayReport1", propOrder = {
    "id",
    "nonWorkgDay"
})
public class SecuritiesNonTradingDayReport1 {

    @XmlElement(name = "Id", required = true)
    protected TradingVenueIdentification1Choice id;
    @XmlElement(name = "NonWorkgDay", required = true)
    protected List<SecuritiesNonTradingDay1> nonWorkgDay;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link TradingVenueIdentification1Choice }
     *     
     */
    public TradingVenueIdentification1Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingVenueIdentification1Choice }
     *     
     */
    public void setId(TradingVenueIdentification1Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the nonWorkgDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nonWorkgDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonWorkgDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesNonTradingDay1 }
     * 
     * 
     * @return
     *     The value of the nonWorkgDay property.
     */
    public List<SecuritiesNonTradingDay1> getNonWorkgDay() {
        if (nonWorkgDay == null) {
            nonWorkgDay = new ArrayList<>();
        }
        return this.nonWorkgDay;
    }

}
