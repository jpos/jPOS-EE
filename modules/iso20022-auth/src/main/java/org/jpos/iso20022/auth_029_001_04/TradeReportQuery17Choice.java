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

package org.jpos.iso20022.auth_029_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeReportQuery17Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeReportQuery17Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AdHocQry" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}TradeQueryCriteria14"/>
 *         <element name="RcrntQry" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}TradeRecurrentQuery5"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeReportQuery17Choice", propOrder = {
    "adHocQry",
    "rcrntQry"
})
public class TradeReportQuery17Choice {

    @XmlElement(name = "AdHocQry")
    protected TradeQueryCriteria14 adHocQry;
    @XmlElement(name = "RcrntQry")
    protected TradeRecurrentQuery5 rcrntQry;

    /**
     * Gets the value of the adHocQry property.
     * 
     * @return
     *     possible object is
     *     {@link TradeQueryCriteria14 }
     *     
     */
    public TradeQueryCriteria14 getAdHocQry() {
        return adHocQry;
    }

    /**
     * Sets the value of the adHocQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeQueryCriteria14 }
     *     
     */
    public void setAdHocQry(TradeQueryCriteria14 value) {
        this.adHocQry = value;
    }

    /**
     * Gets the value of the rcrntQry property.
     * 
     * @return
     *     possible object is
     *     {@link TradeRecurrentQuery5 }
     *     
     */
    public TradeRecurrentQuery5 getRcrntQry() {
        return rcrntQry;
    }

    /**
     * Sets the value of the rcrntQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeRecurrentQuery5 }
     *     
     */
    public void setRcrntQry(TradeRecurrentQuery5 value) {
        this.rcrntQry = value;
    }

}
