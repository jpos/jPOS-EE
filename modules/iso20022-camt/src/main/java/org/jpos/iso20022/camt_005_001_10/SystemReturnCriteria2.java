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

package org.jpos.iso20022.camt_005_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemReturnCriteria2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SystemReturnCriteria2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SysIdInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="MmbIdInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="CtryIdInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="AcctIdInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemReturnCriteria2", propOrder = {
    "sysIdInd",
    "mmbIdInd",
    "ctryIdInd",
    "acctIdInd"
})
public class SystemReturnCriteria2 {

    @XmlElement(name = "SysIdInd")
    protected Boolean sysIdInd;
    @XmlElement(name = "MmbIdInd")
    protected Boolean mmbIdInd;
    @XmlElement(name = "CtryIdInd")
    protected Boolean ctryIdInd;
    @XmlElement(name = "AcctIdInd")
    protected Boolean acctIdInd;

    /**
     * Gets the value of the sysIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSysIdInd() {
        return sysIdInd;
    }

    /**
     * Sets the value of the sysIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSysIdInd(Boolean value) {
        this.sysIdInd = value;
    }

    /**
     * Gets the value of the mmbIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMmbIdInd() {
        return mmbIdInd;
    }

    /**
     * Sets the value of the mmbIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMmbIdInd(Boolean value) {
        this.mmbIdInd = value;
    }

    /**
     * Gets the value of the ctryIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCtryIdInd() {
        return ctryIdInd;
    }

    /**
     * Sets the value of the ctryIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCtryIdInd(Boolean value) {
        this.ctryIdInd = value;
    }

    /**
     * Gets the value of the acctIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctIdInd() {
        return acctIdInd;
    }

    /**
     * Sets the value of the acctIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcctIdInd(Boolean value) {
        this.acctIdInd = value;
    }

}
