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

package org.jpos.iso20022.cain_020_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Environment3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Environment3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Orgtr" type="{urn:iso:std:iso:20022:tech:xsd:cain.020.001.02}PartyIdentification197" minOccurs="0"/>
 *         <element name="Sndr" type="{urn:iso:std:iso:20022:tech:xsd:cain.020.001.02}PartyIdentification197" minOccurs="0"/>
 *         <element name="Rcvr" type="{urn:iso:std:iso:20022:tech:xsd:cain.020.001.02}PartyIdentification197" minOccurs="0"/>
 *         <element name="Dstn" type="{urn:iso:std:iso:20022:tech:xsd:cain.020.001.02}PartyIdentification197" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Environment3", propOrder = {
    "orgtr",
    "sndr",
    "rcvr",
    "dstn"
})
public class Environment3 {

    @XmlElement(name = "Orgtr")
    protected PartyIdentification197 orgtr;
    @XmlElement(name = "Sndr")
    protected PartyIdentification197 sndr;
    @XmlElement(name = "Rcvr")
    protected PartyIdentification197 rcvr;
    @XmlElement(name = "Dstn")
    protected PartyIdentification197 dstn;

    /**
     * Gets the value of the orgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification197 }
     *     
     */
    public PartyIdentification197 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification197 }
     *     
     */
    public void setOrgtr(PartyIdentification197 value) {
        this.orgtr = value;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification197 }
     *     
     */
    public PartyIdentification197 getSndr() {
        return sndr;
    }

    /**
     * Sets the value of the sndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification197 }
     *     
     */
    public void setSndr(PartyIdentification197 value) {
        this.sndr = value;
    }

    /**
     * Gets the value of the rcvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification197 }
     *     
     */
    public PartyIdentification197 getRcvr() {
        return rcvr;
    }

    /**
     * Sets the value of the rcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification197 }
     *     
     */
    public void setRcvr(PartyIdentification197 value) {
        this.rcvr = value;
    }

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification197 }
     *     
     */
    public PartyIdentification197 getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification197 }
     *     
     */
    public void setDstn(PartyIdentification197 value) {
        this.dstn = value;
    }

}
