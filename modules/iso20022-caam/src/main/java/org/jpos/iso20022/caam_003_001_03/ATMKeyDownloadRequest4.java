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

package org.jpos.iso20022.caam_003_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMKeyDownloadRequest4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMKeyDownloadRequest4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}ATMEnvironment15"/>
 *         <element name="CmdRslt" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}ATMCommand11" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CmdCntxt" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}ATMCommand12" minOccurs="0"/>
 *         <element name="ATMSctyCntxt" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}ATMSecurityContext3"/>
 *         <element name="ATMSctyParams" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}SecurityParameters9"/>
 *         <element name="HstChllng" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}Max140Binary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMKeyDownloadRequest4", propOrder = {
    "envt",
    "cmdRslt",
    "cmdCntxt",
    "atmSctyCntxt",
    "atmSctyParams",
    "hstChllng"
})
public class ATMKeyDownloadRequest4 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment15 envt;
    @XmlElement(name = "CmdRslt")
    protected List<ATMCommand11> cmdRslt;
    @XmlElement(name = "CmdCntxt")
    protected ATMCommand12 cmdCntxt;
    @XmlElement(name = "ATMSctyCntxt", required = true)
    protected ATMSecurityContext3 atmSctyCntxt;
    @XmlElement(name = "ATMSctyParams", required = true)
    protected SecurityParameters9 atmSctyParams;
    @XmlElement(name = "HstChllng")
    protected byte[] hstChllng;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEnvironment15 }
     *     
     */
    public ATMEnvironment15 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEnvironment15 }
     *     
     */
    public void setEnvt(ATMEnvironment15 value) {
        this.envt = value;
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
     *     {@link ATMSecurityContext3 }
     *     
     */
    public ATMSecurityContext3 getATMSctyCntxt() {
        return atmSctyCntxt;
    }

    /**
     * Sets the value of the atmSctyCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityContext3 }
     *     
     */
    public void setATMSctyCntxt(ATMSecurityContext3 value) {
        this.atmSctyCntxt = value;
    }

    /**
     * Gets the value of the atmSctyParams property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityParameters9 }
     *     
     */
    public SecurityParameters9 getATMSctyParams() {
        return atmSctyParams;
    }

    /**
     * Sets the value of the atmSctyParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityParameters9 }
     *     
     */
    public void setATMSctyParams(SecurityParameters9 value) {
        this.atmSctyParams = value;
    }

    /**
     * Gets the value of the hstChllng property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getHstChllng() {
        return hstChllng;
    }

    /**
     * Sets the value of the hstChllng property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setHstChllng(byte[] value) {
        this.hstChllng = value;
    }

}
