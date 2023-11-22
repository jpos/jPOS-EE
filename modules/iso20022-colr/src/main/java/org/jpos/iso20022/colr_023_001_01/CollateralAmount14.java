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

package org.jpos.iso20022.colr_023_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralAmount14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralAmount14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}AmountAndDirection49" minOccurs="0"/>
 *         <element name="Termntn" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}AmountAndDirection49" minOccurs="0"/>
 *         <element name="Acrd" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}AmountAndDirection49" minOccurs="0"/>
 *         <element name="ValSght" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}AmountAndDirection49" minOccurs="0"/>
 *         <element name="UdsptdTx" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}AmountAndDirection49" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralAmount14", propOrder = {
    "tx",
    "termntn",
    "acrd",
    "valSght",
    "udsptdTx"
})
public class CollateralAmount14 {

    @XmlElement(name = "Tx")
    protected AmountAndDirection49 tx;
    @XmlElement(name = "Termntn")
    protected AmountAndDirection49 termntn;
    @XmlElement(name = "Acrd")
    protected AmountAndDirection49 acrd;
    @XmlElement(name = "ValSght")
    protected AmountAndDirection49 valSght;
    @XmlElement(name = "UdsptdTx")
    protected AmountAndDirection49 udsptdTx;

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public void setTx(AmountAndDirection49 value) {
        this.tx = value;
    }

    /**
     * Gets the value of the termntn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getTermntn() {
        return termntn;
    }

    /**
     * Sets the value of the termntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public void setTermntn(AmountAndDirection49 value) {
        this.termntn = value;
    }

    /**
     * Gets the value of the acrd property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getAcrd() {
        return acrd;
    }

    /**
     * Sets the value of the acrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public void setAcrd(AmountAndDirection49 value) {
        this.acrd = value;
    }

    /**
     * Gets the value of the valSght property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getValSght() {
        return valSght;
    }

    /**
     * Sets the value of the valSght property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public void setValSght(AmountAndDirection49 value) {
        this.valSght = value;
    }

    /**
     * Gets the value of the udsptdTx property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getUdsptdTx() {
        return udsptdTx;
    }

    /**
     * Sets the value of the udsptdTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public void setUdsptdTx(AmountAndDirection49 value) {
        this.udsptdTx = value;
    }

}
