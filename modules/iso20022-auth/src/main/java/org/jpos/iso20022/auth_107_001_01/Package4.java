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

package org.jpos.iso20022.auth_107_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Package4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Package4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CmplxTradId" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}Max100Text" minOccurs="0"/>
 *         <element name="FxSwpLkId" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}Max100Text" minOccurs="0"/>
 *         <element name="Pric" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}SecuritiesTransactionPrice17Choice" minOccurs="0"/>
 *         <element name="Sprd" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}SecuritiesTransactionPrice20Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Package4", propOrder = {
    "cmplxTradId",
    "fxSwpLkId",
    "pric",
    "sprd"
})
public class Package4 {

    @XmlElement(name = "CmplxTradId")
    protected String cmplxTradId;
    @XmlElement(name = "FxSwpLkId")
    protected String fxSwpLkId;
    @XmlElement(name = "Pric")
    protected SecuritiesTransactionPrice17Choice pric;
    @XmlElement(name = "Sprd")
    protected SecuritiesTransactionPrice20Choice sprd;

    /**
     * Gets the value of the cmplxTradId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmplxTradId() {
        return cmplxTradId;
    }

    /**
     * Sets the value of the cmplxTradId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmplxTradId(String value) {
        this.cmplxTradId = value;
    }

    /**
     * Gets the value of the fxSwpLkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxSwpLkId() {
        return fxSwpLkId;
    }

    /**
     * Sets the value of the fxSwpLkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxSwpLkId(String value) {
        this.fxSwpLkId = value;
    }

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice17Choice }
     *     
     */
    public SecuritiesTransactionPrice17Choice getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice17Choice }
     *     
     */
    public void setPric(SecuritiesTransactionPrice17Choice value) {
        this.pric = value;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice20Choice }
     *     
     */
    public SecuritiesTransactionPrice20Choice getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice20Choice }
     *     
     */
    public void setSprd(SecuritiesTransactionPrice20Choice value) {
        this.sprd = value;
    }

}
