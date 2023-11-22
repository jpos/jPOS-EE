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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMSecurityConfiguration1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMSecurityConfiguration1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Keys" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}ATMSecurityConfiguration2" minOccurs="0"/>
 *         <element name="Ncrptn" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}ATMSecurityConfiguration3" minOccurs="0"/>
 *         <element name="MACAlgo" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}Algorithm12Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DgstAlgo" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}Algorithm11Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DgtlSgntr" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}ATMSecurityConfiguration4" minOccurs="0"/>
 *         <element name="PIN" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}ATMSecurityConfiguration5" minOccurs="0"/>
 *         <element name="MsgPrtcn" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}MessageProtection1Code" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMSecurityConfiguration1", propOrder = {
    "keys",
    "ncrptn",
    "macAlgo",
    "dgstAlgo",
    "dgtlSgntr",
    "pin",
    "msgPrtcn"
})
public class ATMSecurityConfiguration1 {

    @XmlElement(name = "Keys")
    protected ATMSecurityConfiguration2 keys;
    @XmlElement(name = "Ncrptn")
    protected ATMSecurityConfiguration3 ncrptn;
    @XmlElement(name = "MACAlgo")
    @XmlSchemaType(name = "string")
    protected List<Algorithm12Code> macAlgo;
    @XmlElement(name = "DgstAlgo")
    @XmlSchemaType(name = "string")
    protected List<Algorithm11Code> dgstAlgo;
    @XmlElement(name = "DgtlSgntr")
    protected ATMSecurityConfiguration4 dgtlSgntr;
    @XmlElement(name = "PIN")
    protected ATMSecurityConfiguration5 pin;
    @XmlElement(name = "MsgPrtcn")
    @XmlSchemaType(name = "string")
    protected List<MessageProtection1Code> msgPrtcn;

    /**
     * Gets the value of the keys property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityConfiguration2 }
     *     
     */
    public ATMSecurityConfiguration2 getKeys() {
        return keys;
    }

    /**
     * Sets the value of the keys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityConfiguration2 }
     *     
     */
    public void setKeys(ATMSecurityConfiguration2 value) {
        this.keys = value;
    }

    /**
     * Gets the value of the ncrptn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityConfiguration3 }
     *     
     */
    public ATMSecurityConfiguration3 getNcrptn() {
        return ncrptn;
    }

    /**
     * Sets the value of the ncrptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityConfiguration3 }
     *     
     */
    public void setNcrptn(ATMSecurityConfiguration3 value) {
        this.ncrptn = value;
    }

    /**
     * Gets the value of the macAlgo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the macAlgo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMACAlgo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Algorithm12Code }
     * 
     * 
     * @return
     *     The value of the macAlgo property.
     */
    public List<Algorithm12Code> getMACAlgo() {
        if (macAlgo == null) {
            macAlgo = new ArrayList<>();
        }
        return this.macAlgo;
    }

    /**
     * Gets the value of the dgstAlgo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dgstAlgo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgstAlgo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Algorithm11Code }
     * 
     * 
     * @return
     *     The value of the dgstAlgo property.
     */
    public List<Algorithm11Code> getDgstAlgo() {
        if (dgstAlgo == null) {
            dgstAlgo = new ArrayList<>();
        }
        return this.dgstAlgo;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityConfiguration4 }
     *     
     */
    public ATMSecurityConfiguration4 getDgtlSgntr() {
        return dgtlSgntr;
    }

    /**
     * Sets the value of the dgtlSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityConfiguration4 }
     *     
     */
    public void setDgtlSgntr(ATMSecurityConfiguration4 value) {
        this.dgtlSgntr = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityConfiguration5 }
     *     
     */
    public ATMSecurityConfiguration5 getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityConfiguration5 }
     *     
     */
    public void setPIN(ATMSecurityConfiguration5 value) {
        this.pin = value;
    }

    /**
     * Gets the value of the msgPrtcn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgPrtcn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgPrtcn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageProtection1Code }
     * 
     * 
     * @return
     *     The value of the msgPrtcn property.
     */
    public List<MessageProtection1Code> getMsgPrtcn() {
        if (msgPrtcn == null) {
            msgPrtcn = new ArrayList<>();
        }
        return this.msgPrtcn;
    }

}
