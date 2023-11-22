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

package org.jpos.iso20022.auth_045_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassAndSubClassIdentification2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassAndSubClassIdentification2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AsstClss" type="{urn:iso:std:iso:20022:tech:xsd:auth.045.001.03}NonEquityAssetClass1Code"/>
 *         <element name="DerivSubClss" type="{urn:iso:std:iso:20022:tech:xsd:auth.045.001.03}NonEquitySubClass1" minOccurs="0"/>
 *         <element name="FinInstrmClssfctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.045.001.03}NonEquityInstrumentReportingClassification1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassAndSubClassIdentification2", propOrder = {
    "asstClss",
    "derivSubClss",
    "finInstrmClssfctn"
})
public class AssetClassAndSubClassIdentification2 {

    @XmlElement(name = "AsstClss", required = true)
    @XmlSchemaType(name = "string")
    protected NonEquityAssetClass1Code asstClss;
    @XmlElement(name = "DerivSubClss")
    protected NonEquitySubClass1 derivSubClss;
    @XmlElement(name = "FinInstrmClssfctn")
    @XmlSchemaType(name = "string")
    protected NonEquityInstrumentReportingClassification1Code finInstrmClssfctn;

    /**
     * Gets the value of the asstClss property.
     * 
     * @return
     *     possible object is
     *     {@link NonEquityAssetClass1Code }
     *     
     */
    public NonEquityAssetClass1Code getAsstClss() {
        return asstClss;
    }

    /**
     * Sets the value of the asstClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEquityAssetClass1Code }
     *     
     */
    public void setAsstClss(NonEquityAssetClass1Code value) {
        this.asstClss = value;
    }

    /**
     * Gets the value of the derivSubClss property.
     * 
     * @return
     *     possible object is
     *     {@link NonEquitySubClass1 }
     *     
     */
    public NonEquitySubClass1 getDerivSubClss() {
        return derivSubClss;
    }

    /**
     * Sets the value of the derivSubClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEquitySubClass1 }
     *     
     */
    public void setDerivSubClss(NonEquitySubClass1 value) {
        this.derivSubClss = value;
    }

    /**
     * Gets the value of the finInstrmClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link NonEquityInstrumentReportingClassification1Code }
     *     
     */
    public NonEquityInstrumentReportingClassification1Code getFinInstrmClssfctn() {
        return finInstrmClssfctn;
    }

    /**
     * Sets the value of the finInstrmClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEquityInstrumentReportingClassification1Code }
     *     
     */
    public void setFinInstrmClssfctn(NonEquityInstrumentReportingClassification1Code value) {
        this.finInstrmClssfctn = value;
    }

}
