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
 * <p>Java class for CollateralAmount5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralAmount5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ReqrdMrgn" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}AmountAndDirection44" minOccurs="0"/>
 *         <element name="Collsd" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}AmountAndDirection44" minOccurs="0"/>
 *         <element name="RmngCollsd" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}AmountAndDirection44" minOccurs="0"/>
 *         <element name="Sttld" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}AmountAndDirection44" minOccurs="0"/>
 *         <element name="RmngSttlm" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}AmountAndDirection44" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralAmount5", propOrder = {
    "reqrdMrgn",
    "collsd",
    "rmngCollsd",
    "sttld",
    "rmngSttlm"
})
public class CollateralAmount5 {

    @XmlElement(name = "ReqrdMrgn")
    protected AmountAndDirection44 reqrdMrgn;
    @XmlElement(name = "Collsd")
    protected AmountAndDirection44 collsd;
    @XmlElement(name = "RmngCollsd")
    protected AmountAndDirection44 rmngCollsd;
    @XmlElement(name = "Sttld")
    protected AmountAndDirection44 sttld;
    @XmlElement(name = "RmngSttlm")
    protected AmountAndDirection44 rmngSttlm;

    /**
     * Gets the value of the reqrdMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getReqrdMrgn() {
        return reqrdMrgn;
    }

    /**
     * Sets the value of the reqrdMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setReqrdMrgn(AmountAndDirection44 value) {
        this.reqrdMrgn = value;
    }

    /**
     * Gets the value of the collsd property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getCollsd() {
        return collsd;
    }

    /**
     * Sets the value of the collsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setCollsd(AmountAndDirection44 value) {
        this.collsd = value;
    }

    /**
     * Gets the value of the rmngCollsd property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getRmngCollsd() {
        return rmngCollsd;
    }

    /**
     * Sets the value of the rmngCollsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setRmngCollsd(AmountAndDirection44 value) {
        this.rmngCollsd = value;
    }

    /**
     * Gets the value of the sttld property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getSttld() {
        return sttld;
    }

    /**
     * Sets the value of the sttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setSttld(AmountAndDirection44 value) {
        this.sttld = value;
    }

    /**
     * Gets the value of the rmngSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getRmngSttlm() {
        return rmngSttlm;
    }

    /**
     * Sets the value of the rmngSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setRmngSttlm(AmountAndDirection44 value) {
        this.rmngSttlm = value;
    }

}
