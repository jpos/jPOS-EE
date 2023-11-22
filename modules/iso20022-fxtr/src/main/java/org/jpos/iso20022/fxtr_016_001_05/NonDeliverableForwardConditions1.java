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

package org.jpos.iso20022.fxtr_016_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonDeliverableForwardConditions1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NonDeliverableForwardConditions1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OpngInd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05}YesNoIndicator"/>
 *         <element name="OpngFxgConds" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05}NDFOpeningFixing1Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonDeliverableForwardConditions1", propOrder = {
    "opngInd",
    "opngFxgConds"
})
public class NonDeliverableForwardConditions1 {

    @XmlElement(name = "OpngInd")
    protected boolean opngInd;
    @XmlElement(name = "OpngFxgConds", required = true)
    protected NDFOpeningFixing1Choice opngFxgConds;

    /**
     * Gets the value of the opngInd property.
     * 
     */
    public boolean isOpngInd() {
        return opngInd;
    }

    /**
     * Sets the value of the opngInd property.
     * 
     */
    public void setOpngInd(boolean value) {
        this.opngInd = value;
    }

    /**
     * Gets the value of the opngFxgConds property.
     * 
     * @return
     *     possible object is
     *     {@link NDFOpeningFixing1Choice }
     *     
     */
    public NDFOpeningFixing1Choice getOpngFxgConds() {
        return opngFxgConds;
    }

    /**
     * Sets the value of the opngFxgConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link NDFOpeningFixing1Choice }
     *     
     */
    public void setOpngFxgConds(NDFOpeningFixing1Choice value) {
        this.opngFxgConds = value;
    }

}
