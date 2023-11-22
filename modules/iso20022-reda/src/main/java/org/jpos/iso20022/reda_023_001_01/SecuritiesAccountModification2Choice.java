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

package org.jpos.iso20022.reda_023_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesAccountModification2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesAccountModification2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="SysSctiesAcct" type="{urn:iso:std:iso:20022:tech:xsd:reda.023.001.01}SystemSecuritiesAccount5"/>
 *         <element name="SysRstrctn" type="{urn:iso:std:iso:20022:tech:xsd:reda.023.001.01}SystemRestriction1"/>
 *         <element name="MktSpcfcAttr" type="{urn:iso:std:iso:20022:tech:xsd:reda.023.001.01}MarketSpecificAttribute1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountModification2Choice", propOrder = {
    "sysSctiesAcct",
    "sysRstrctn",
    "mktSpcfcAttr"
})
public class SecuritiesAccountModification2Choice {

    @XmlElement(name = "SysSctiesAcct")
    protected SystemSecuritiesAccount5 sysSctiesAcct;
    @XmlElement(name = "SysRstrctn")
    protected SystemRestriction1 sysRstrctn;
    @XmlElement(name = "MktSpcfcAttr")
    protected MarketSpecificAttribute1 mktSpcfcAttr;

    /**
     * Gets the value of the sysSctiesAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SystemSecuritiesAccount5 }
     *     
     */
    public SystemSecuritiesAccount5 getSysSctiesAcct() {
        return sysSctiesAcct;
    }

    /**
     * Sets the value of the sysSctiesAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemSecuritiesAccount5 }
     *     
     */
    public void setSysSctiesAcct(SystemSecuritiesAccount5 value) {
        this.sysSctiesAcct = value;
    }

    /**
     * Gets the value of the sysRstrctn property.
     * 
     * @return
     *     possible object is
     *     {@link SystemRestriction1 }
     *     
     */
    public SystemRestriction1 getSysRstrctn() {
        return sysRstrctn;
    }

    /**
     * Sets the value of the sysRstrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemRestriction1 }
     *     
     */
    public void setSysRstrctn(SystemRestriction1 value) {
        this.sysRstrctn = value;
    }

    /**
     * Gets the value of the mktSpcfcAttr property.
     * 
     * @return
     *     possible object is
     *     {@link MarketSpecificAttribute1 }
     *     
     */
    public MarketSpecificAttribute1 getMktSpcfcAttr() {
        return mktSpcfcAttr;
    }

    /**
     * Sets the value of the mktSpcfcAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketSpecificAttribute1 }
     *     
     */
    public void setMktSpcfcAttr(MarketSpecificAttribute1 value) {
        this.mktSpcfcAttr = value;
    }

}
