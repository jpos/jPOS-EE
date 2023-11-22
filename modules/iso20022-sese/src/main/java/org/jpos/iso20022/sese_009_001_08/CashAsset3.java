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

package org.jpos.iso20022.sese_009_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashAsset3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashAsset3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CshAsstTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}CashAssetType1Choice"/>
 *         <element name="HldgCcy" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}ActiveCurrencyCode"/>
 *         <element name="TrfCcy" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}AdditionalInformation15" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAsset3", propOrder = {
    "cshAsstTp",
    "hldgCcy",
    "trfCcy",
    "addtlInf"
})
public class CashAsset3 {

    @XmlElement(name = "CshAsstTp", required = true)
    protected CashAssetType1Choice cshAsstTp;
    @XmlElement(name = "HldgCcy", required = true)
    protected String hldgCcy;
    @XmlElement(name = "TrfCcy")
    protected String trfCcy;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation15 addtlInf;

    /**
     * Gets the value of the cshAsstTp property.
     * 
     * @return
     *     possible object is
     *     {@link CashAssetType1Choice }
     *     
     */
    public CashAssetType1Choice getCshAsstTp() {
        return cshAsstTp;
    }

    /**
     * Sets the value of the cshAsstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAssetType1Choice }
     *     
     */
    public void setCshAsstTp(CashAssetType1Choice value) {
        this.cshAsstTp = value;
    }

    /**
     * Gets the value of the hldgCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHldgCcy() {
        return hldgCcy;
    }

    /**
     * Sets the value of the hldgCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHldgCcy(String value) {
        this.hldgCcy = value;
    }

    /**
     * Gets the value of the trfCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfCcy() {
        return trfCcy;
    }

    /**
     * Sets the value of the trfCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrfCcy(String value) {
        this.trfCcy = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation15 }
     *     
     */
    public AdditionalInformation15 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation15 }
     *     
     */
    public void setAddtlInf(AdditionalInformation15 value) {
        this.addtlInf = value;
    }

}
