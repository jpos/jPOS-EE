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

package org.jpos.iso20022.reda_004_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherDistributionStrategy1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OtherDistributionStrategy1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DstrbtnStrtgyTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Max35Text" minOccurs="0"/>
 *         <element name="Trgt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}DistributionStrategy1Choice" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}AdditionalInformation15" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherDistributionStrategy1", propOrder = {
    "dstrbtnStrtgyTp",
    "trgt",
    "addtlInf"
})
public class OtherDistributionStrategy1 {

    @XmlElement(name = "DstrbtnStrtgyTp")
    protected String dstrbtnStrtgyTp;
    @XmlElement(name = "Trgt")
    protected DistributionStrategy1Choice trgt;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation15 addtlInf;

    /**
     * Gets the value of the dstrbtnStrtgyTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstrbtnStrtgyTp() {
        return dstrbtnStrtgyTp;
    }

    /**
     * Sets the value of the dstrbtnStrtgyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDstrbtnStrtgyTp(String value) {
        this.dstrbtnStrtgyTp = value;
    }

    /**
     * Gets the value of the trgt property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionStrategy1Choice }
     *     
     */
    public DistributionStrategy1Choice getTrgt() {
        return trgt;
    }

    /**
     * Sets the value of the trgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionStrategy1Choice }
     *     
     */
    public void setTrgt(DistributionStrategy1Choice value) {
        this.trgt = value;
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
