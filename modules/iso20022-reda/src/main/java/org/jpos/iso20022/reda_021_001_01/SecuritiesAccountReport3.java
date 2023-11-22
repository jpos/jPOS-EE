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

package org.jpos.iso20022.reda_021_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesAccountReport3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesAccountReport3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctiesAcctId" type="{urn:iso:std:iso:20022:tech:xsd:reda.021.001.01}SecuritiesAccount19"/>
 *         <element name="SctiesAcctOrErr" type="{urn:iso:std:iso:20022:tech:xsd:reda.021.001.01}SecuritiesAccountOrBusinessError3Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountReport3", propOrder = {
    "sctiesAcctId",
    "sctiesAcctOrErr"
})
public class SecuritiesAccountReport3 {

    @XmlElement(name = "SctiesAcctId", required = true)
    protected SecuritiesAccount19 sctiesAcctId;
    @XmlElement(name = "SctiesAcctOrErr", required = true)
    protected SecuritiesAccountOrBusinessError3Choice sctiesAcctOrErr;

    /**
     * Gets the value of the sctiesAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSctiesAcctId() {
        return sctiesAcctId;
    }

    /**
     * Sets the value of the sctiesAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setSctiesAcctId(SecuritiesAccount19 value) {
        this.sctiesAcctId = value;
    }

    /**
     * Gets the value of the sctiesAcctOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountOrBusinessError3Choice }
     *     
     */
    public SecuritiesAccountOrBusinessError3Choice getSctiesAcctOrErr() {
        return sctiesAcctOrErr;
    }

    /**
     * Sets the value of the sctiesAcctOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountOrBusinessError3Choice }
     *     
     */
    public void setSctiesAcctOrErr(SecuritiesAccountOrBusinessError3Choice value) {
        this.sctiesAcctOrErr = value;
    }

}
