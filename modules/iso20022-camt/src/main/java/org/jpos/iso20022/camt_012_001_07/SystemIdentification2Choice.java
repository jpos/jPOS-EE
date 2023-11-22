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

package org.jpos.iso20022.camt_012_001_07;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemIdentification2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SystemIdentification2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="MktInfrstrctrId" type="{urn:iso:std:iso:20022:tech:xsd:camt.012.001.07}MarketInfrastructureIdentification1Choice"/>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:camt.012.001.07}CountryCode"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemIdentification2Choice", propOrder = {
    "mktInfrstrctrId",
    "ctry"
})
public class SystemIdentification2Choice {

    @XmlElement(name = "MktInfrstrctrId")
    protected MarketInfrastructureIdentification1Choice mktInfrstrctrId;
    @XmlElement(name = "Ctry")
    protected String ctry;

    /**
     * Gets the value of the mktInfrstrctrId property.
     * 
     * @return
     *     possible object is
     *     {@link MarketInfrastructureIdentification1Choice }
     *     
     */
    public MarketInfrastructureIdentification1Choice getMktInfrstrctrId() {
        return mktInfrstrctrId;
    }

    /**
     * Sets the value of the mktInfrstrctrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketInfrastructureIdentification1Choice }
     *     
     */
    public void setMktInfrstrctrId(MarketInfrastructureIdentification1Choice value) {
        this.mktInfrstrctrId = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

}
