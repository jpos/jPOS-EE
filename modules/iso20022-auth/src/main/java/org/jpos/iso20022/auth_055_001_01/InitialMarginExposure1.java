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

package org.jpos.iso20022.auth_055_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitialMarginExposure1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InitialMarginExposure1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:auth.055.001.01}Amount3"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:auth.055.001.01}MarginType2Choice"/>
 *         <element name="CoreInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.055.001.01}TrueFalseIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitialMarginExposure1", propOrder = {
    "amt",
    "tp",
    "coreInd"
})
public class InitialMarginExposure1 {

    @XmlElement(name = "Amt", required = true)
    protected Amount3 amt;
    @XmlElement(name = "Tp", required = true)
    protected MarginType2Choice tp;
    @XmlElement(name = "CoreInd")
    protected boolean coreInd;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount3 }
     *     
     */
    public Amount3 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount3 }
     *     
     */
    public void setAmt(Amount3 value) {
        this.amt = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link MarginType2Choice }
     *     
     */
    public MarginType2Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginType2Choice }
     *     
     */
    public void setTp(MarginType2Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the coreInd property.
     * 
     */
    public boolean isCoreInd() {
        return coreInd;
    }

    /**
     * Sets the value of the coreInd property.
     * 
     */
    public void setCoreInd(boolean value) {
        this.coreInd = value;
    }

}
