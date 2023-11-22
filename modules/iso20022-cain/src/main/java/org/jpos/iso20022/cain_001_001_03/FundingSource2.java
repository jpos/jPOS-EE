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

package org.jpos.iso20022.cain_001_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundingSource2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FundingSource2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SrcTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}FundingSourceType2Code" minOccurs="0"/>
 *         <element name="OthrSrcTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundingSource2", propOrder = {
    "srcTp",
    "othrSrcTp",
    "ref"
})
public class FundingSource2 {

    @XmlElement(name = "SrcTp")
    @XmlSchemaType(name = "string")
    protected FundingSourceType2Code srcTp;
    @XmlElement(name = "OthrSrcTp")
    protected String othrSrcTp;
    @XmlElement(name = "Ref")
    protected String ref;

    /**
     * Gets the value of the srcTp property.
     * 
     * @return
     *     possible object is
     *     {@link FundingSourceType2Code }
     *     
     */
    public FundingSourceType2Code getSrcTp() {
        return srcTp;
    }

    /**
     * Sets the value of the srcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingSourceType2Code }
     *     
     */
    public void setSrcTp(FundingSourceType2Code value) {
        this.srcTp = value;
    }

    /**
     * Gets the value of the othrSrcTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrSrcTp() {
        return othrSrcTp;
    }

    /**
     * Sets the value of the othrSrcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrSrcTp(String value) {
        this.othrSrcTp = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

}
