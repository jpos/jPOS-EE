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

package org.jpos.iso20022.camt_013_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemberReturnCriteria1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MemberReturnCriteria1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NmInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.013.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="MmbRtrAdrInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.013.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="AcctInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.013.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="TpInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.013.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="StsInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.013.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="CtctRefInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.013.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="ComAdrInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.013.001.04}RequestedIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberReturnCriteria1", propOrder = {
    "nmInd",
    "mmbRtrAdrInd",
    "acctInd",
    "tpInd",
    "stsInd",
    "ctctRefInd",
    "comAdrInd"
})
public class MemberReturnCriteria1 {

    @XmlElement(name = "NmInd")
    protected Boolean nmInd;
    @XmlElement(name = "MmbRtrAdrInd")
    protected Boolean mmbRtrAdrInd;
    @XmlElement(name = "AcctInd")
    protected Boolean acctInd;
    @XmlElement(name = "TpInd")
    protected Boolean tpInd;
    @XmlElement(name = "StsInd")
    protected Boolean stsInd;
    @XmlElement(name = "CtctRefInd")
    protected Boolean ctctRefInd;
    @XmlElement(name = "ComAdrInd")
    protected Boolean comAdrInd;

    /**
     * Gets the value of the nmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNmInd() {
        return nmInd;
    }

    /**
     * Sets the value of the nmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNmInd(Boolean value) {
        this.nmInd = value;
    }

    /**
     * Gets the value of the mmbRtrAdrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMmbRtrAdrInd() {
        return mmbRtrAdrInd;
    }

    /**
     * Sets the value of the mmbRtrAdrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMmbRtrAdrInd(Boolean value) {
        this.mmbRtrAdrInd = value;
    }

    /**
     * Gets the value of the acctInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctInd() {
        return acctInd;
    }

    /**
     * Sets the value of the acctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcctInd(Boolean value) {
        this.acctInd = value;
    }

    /**
     * Gets the value of the tpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTpInd() {
        return tpInd;
    }

    /**
     * Sets the value of the tpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTpInd(Boolean value) {
        this.tpInd = value;
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
     * Gets the value of the ctctRefInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCtctRefInd() {
        return ctctRefInd;
    }

    /**
     * Sets the value of the ctctRefInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCtctRefInd(Boolean value) {
        this.ctctRefInd = value;
    }

    /**
     * Gets the value of the comAdrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComAdrInd() {
        return comAdrInd;
    }

    /**
     * Sets the value of the comAdrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComAdrInd(Boolean value) {
        this.comAdrInd = value;
    }

}
