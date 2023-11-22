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

package org.jpos.iso20022.camt_009_001_07;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitReturnCriteria2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LimitReturnCriteria2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StartDtTmInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}RequestedIndicator" minOccurs="0"/>
 *         <element name="StsInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}RequestedIndicator" minOccurs="0"/>
 *         <element name="UsdAmtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}RequestedIndicator" minOccurs="0"/>
 *         <element name="UsdPctgInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}RequestedIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitReturnCriteria2", propOrder = {
    "startDtTmInd",
    "stsInd",
    "usdAmtInd",
    "usdPctgInd"
})
public class LimitReturnCriteria2 {

    @XmlElement(name = "StartDtTmInd")
    protected Boolean startDtTmInd;
    @XmlElement(name = "StsInd")
    protected Boolean stsInd;
    @XmlElement(name = "UsdAmtInd")
    protected Boolean usdAmtInd;
    @XmlElement(name = "UsdPctgInd")
    protected Boolean usdPctgInd;

    /**
     * Gets the value of the startDtTmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartDtTmInd() {
        return startDtTmInd;
    }

    /**
     * Sets the value of the startDtTmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartDtTmInd(Boolean value) {
        this.startDtTmInd = value;
    }

    /**
     * Gets the value of the stsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStsInd() {
        return stsInd;
    }

    /**
     * Sets the value of the stsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStsInd(Boolean value) {
        this.stsInd = value;
    }

    /**
     * Gets the value of the usdAmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsdAmtInd() {
        return usdAmtInd;
    }

    /**
     * Sets the value of the usdAmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsdAmtInd(Boolean value) {
        this.usdAmtInd = value;
    }

    /**
     * Gets the value of the usdPctgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsdPctgInd() {
        return usdPctgInd;
    }

    /**
     * Sets the value of the usdPctgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsdPctgInd(Boolean value) {
        this.usdPctgInd = value;
    }

}
