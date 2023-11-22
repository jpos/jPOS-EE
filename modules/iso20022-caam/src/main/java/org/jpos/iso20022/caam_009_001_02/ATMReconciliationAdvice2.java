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

package org.jpos.iso20022.caam_009_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMReconciliationAdvice2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMReconciliationAdvice2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}ATMEnvironment10"/>
 *         <element name="CmdRslt" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}ATMCommand8" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CmdCntxt" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}ATMCommand9" minOccurs="0"/>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}ATMTransaction25"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMReconciliationAdvice2", propOrder = {
    "envt",
    "cmdRslt",
    "cmdCntxt",
    "tx"
})
public class ATMReconciliationAdvice2 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment10 envt;
    @XmlElement(name = "CmdRslt")
    protected List<ATMCommand8> cmdRslt;
    @XmlElement(name = "CmdCntxt")
    protected ATMCommand9 cmdCntxt;
    @XmlElement(name = "Tx", required = true)
    protected ATMTransaction25 tx;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEnvironment10 }
     *     
     */
    public ATMEnvironment10 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEnvironment10 }
     *     
     */
    public void setEnvt(ATMEnvironment10 value) {
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
     * {@link ATMCommand8 }
     * 
     * 
     * @return
     *     The value of the cmdRslt property.
     */
    public List<ATMCommand8> getCmdRslt() {
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
     *     {@link ATMCommand9 }
     *     
     */
    public ATMCommand9 getCmdCntxt() {
        return cmdCntxt;
    }

    /**
     * Sets the value of the cmdCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommand9 }
     *     
     */
    public void setCmdCntxt(ATMCommand9 value) {
        this.cmdCntxt = value;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransaction25 }
     *     
     */
    public ATMTransaction25 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransaction25 }
     *     
     */
    public void setTx(ATMTransaction25 value) {
        this.tx = value;
    }

}
