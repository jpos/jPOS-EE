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

package org.jpos.iso20022.caam_001_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMDeviceReport3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMDeviceReport3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}ATMEnvironment6"/>
 *         <element name="ATMGblSts" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}ATMStatus1"/>
 *         <element name="CmdRslt" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}ATMCommand11" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CmdCntxt" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}ATMCommand12" minOccurs="0"/>
 *         <element name="ATMSctyCntxt" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}ATMSecurityContext5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMDeviceReport3", propOrder = {
    "envt",
    "atmGblSts",
    "cmdRslt",
    "cmdCntxt",
    "atmSctyCntxt"
})
public class ATMDeviceReport3 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment6 envt;
    @XmlElement(name = "ATMGblSts", required = true)
    protected ATMStatus1 atmGblSts;
    @XmlElement(name = "CmdRslt")
    protected List<ATMCommand11> cmdRslt;
    @XmlElement(name = "CmdCntxt")
    protected ATMCommand12 cmdCntxt;
    @XmlElement(name = "ATMSctyCntxt")
    protected ATMSecurityContext5 atmSctyCntxt;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEnvironment6 }
     *     
     */
    public ATMEnvironment6 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEnvironment6 }
     *     
     */
    public void setEnvt(ATMEnvironment6 value) {
        this.envt = value;
    }

    /**
     * Gets the value of the atmGblSts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMStatus1 }
     *     
     */
    public ATMStatus1 getATMGblSts() {
        return atmGblSts;
    }

    /**
     * Sets the value of the atmGblSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMStatus1 }
     *     
     */
    public void setATMGblSts(ATMStatus1 value) {
        this.atmGblSts = value;
    }

    /**
     * Gets the value of the cmdRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmdRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmdRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCommand11 }
     * 
     * 
     * @return
     *     The value of the cmdRslt property.
     */
    public List<ATMCommand11> getCmdRslt() {
        if (cmdRslt == null) {
            cmdRslt = new ArrayList<>();
        }
        return this.cmdRslt;
    }

    /**
     * Gets the value of the cmdCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommand12 }
     *     
     */
    public ATMCommand12 getCmdCntxt() {
        return cmdCntxt;
    }

    /**
     * Sets the value of the cmdCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommand12 }
     *     
     */
    public void setCmdCntxt(ATMCommand12 value) {
        this.cmdCntxt = value;
    }

    /**
     * Gets the value of the atmSctyCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityContext5 }
     *     
     */
    public ATMSecurityContext5 getATMSctyCntxt() {
        return atmSctyCntxt;
    }

    /**
     * Sets the value of the atmSctyCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityContext5 }
     *     
     */
    public void setATMSctyCntxt(ATMSecurityContext5 value) {
        this.atmSctyCntxt = value;
    }

}
