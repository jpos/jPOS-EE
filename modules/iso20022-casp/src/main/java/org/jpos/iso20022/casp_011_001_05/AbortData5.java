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

package org.jpos.iso20022.casp_011_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbortData5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AbortData5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="XchgId" type="{urn:iso:std:iso:20022:tech:xsd:casp.011.001.05}Max35Text"/>
 *         <element name="AbrtRsn" type="{urn:iso:std:iso:20022:tech:xsd:casp.011.001.05}Max140Text"/>
 *         <element name="DispOutpt" type="{urn:iso:std:iso:20022:tech:xsd:casp.011.001.05}ActionMessage10" minOccurs="0"/>
 *         <element name="TxSucss" type="{urn:iso:std:iso:20022:tech:xsd:casp.011.001.05}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbortData5", propOrder = {
    "xchgId",
    "abrtRsn",
    "dispOutpt",
    "txSucss"
})
public class AbortData5 {

    @XmlElement(name = "XchgId", required = true)
    protected String xchgId;
    @XmlElement(name = "AbrtRsn", required = true)
    protected String abrtRsn;
    @XmlElement(name = "DispOutpt")
    protected ActionMessage10 dispOutpt;
    @XmlElement(name = "TxSucss")
    protected Boolean txSucss;

    /**
     * Gets the value of the xchgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchgId() {
        return xchgId;
    }

    /**
     * Sets the value of the xchgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXchgId(String value) {
        this.xchgId = value;
    }

    /**
     * Gets the value of the abrtRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbrtRsn() {
        return abrtRsn;
    }

    /**
     * Sets the value of the abrtRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbrtRsn(String value) {
        this.abrtRsn = value;
    }

    /**
     * Gets the value of the dispOutpt property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage10 }
     *     
     */
    public ActionMessage10 getDispOutpt() {
        return dispOutpt;
    }

    /**
     * Sets the value of the dispOutpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage10 }
     *     
     */
    public void setDispOutpt(ActionMessage10 value) {
        this.dispOutpt = value;
    }

    /**
     * Gets the value of the txSucss property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTxSucss() {
        return txSucss;
    }

    /**
     * Sets the value of the txSucss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTxSucss(Boolean value) {
        this.txSucss = value;
    }

}
