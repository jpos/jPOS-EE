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

package org.jpos.iso20022.auth_091_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventIdentifier1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EventIdentifier1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="EvtIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}UTIIdentifier"/>
 *         <element name="PstTradRskRdctnIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}PostTradeRiskReductionIdentifier1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventIdentifier1Choice", propOrder = {
    "evtIdr",
    "pstTradRskRdctnIdr"
})
public class EventIdentifier1Choice {

    @XmlElement(name = "EvtIdr")
    protected String evtIdr;
    @XmlElement(name = "PstTradRskRdctnIdr")
    protected PostTradeRiskReductionIdentifier1 pstTradRskRdctnIdr;

    /**
     * Gets the value of the evtIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtIdr() {
        return evtIdr;
    }

    /**
     * Sets the value of the evtIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtIdr(String value) {
        this.evtIdr = value;
    }

    /**
     * Gets the value of the pstTradRskRdctnIdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostTradeRiskReductionIdentifier1 }
     *     
     */
    public PostTradeRiskReductionIdentifier1 getPstTradRskRdctnIdr() {
        return pstTradRskRdctnIdr;
    }

    /**
     * Sets the value of the pstTradRskRdctnIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostTradeRiskReductionIdentifier1 }
     *     
     */
    public void setPstTradRskRdctnIdr(PostTradeRiskReductionIdentifier1 value) {
        this.pstTradRskRdctnIdr = value;
    }

}
