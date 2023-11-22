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

package org.jpos.iso20022.caam_004_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMKeyDownloadResponse4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMKeyDownloadResponse4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}ATMEnvironment7"/>
 *         <element name="ATMSctyCntxt" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}ATMSecurityContext3"/>
 *         <element name="ATMChllng" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}Max140Binary" minOccurs="0"/>
 *         <element name="HstSctyParams" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}SecurityParameters10"/>
 *         <element name="Cmd" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}ATMCommand13" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMKeyDownloadResponse4", propOrder = {
    "envt",
    "atmSctyCntxt",
    "atmChllng",
    "hstSctyParams",
    "cmd"
})
public class ATMKeyDownloadResponse4 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment7 envt;
    @XmlElement(name = "ATMSctyCntxt", required = true)
    protected ATMSecurityContext3 atmSctyCntxt;
    @XmlElement(name = "ATMChllng")
    protected byte[] atmChllng;
    @XmlElement(name = "HstSctyParams", required = true)
    protected SecurityParameters10 hstSctyParams;
    @XmlElement(name = "Cmd")
    protected List<ATMCommand13> cmd;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEnvironment7 }
     *     
     */
    public ATMEnvironment7 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEnvironment7 }
     *     
     */
    public void setEnvt(ATMEnvironment7 value) {
        this.envt = value;
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
     * Gets the value of the atmChllng property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getATMChllng() {
        return atmChllng;
    }

    /**
     * Sets the value of the atmChllng property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setATMChllng(byte[] value) {
        this.atmChllng = value;
    }

    /**
     * Gets the value of the hstSctyParams property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityParameters10 }
     *     
     */
    public SecurityParameters10 getHstSctyParams() {
        return hstSctyParams;
    }

    /**
     * Sets the value of the hstSctyParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityParameters10 }
     *     
     */
    public void setHstSctyParams(SecurityParameters10 value) {
        this.hstSctyParams = value;
    }

    /**
     * Gets the value of the cmd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCommand13 }
     * 
     * 
     * @return
     *     The value of the cmd property.
     */
    public List<ATMCommand13> getCmd() {
        if (cmd == null) {
            cmd = new ArrayList<>();
        }
        return this.cmd;
    }

}
