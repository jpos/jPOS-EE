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

package org.jpos.iso20022.auth_052_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvironmentalCommodityEmission2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EnvironmentalCommodityEmission2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BasePdct" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}AssetClassProductType3Code"/>
 *         <element name="SubPdct" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}AssetClassSubProductType10Code"/>
 *         <element name="AddtlSubPdct" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}AssetClassDetailedSubProductType8Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvironmentalCommodityEmission2", propOrder = {
    "basePdct",
    "subPdct",
    "addtlSubPdct"
})
public class EnvironmentalCommodityEmission2 {

    @XmlElement(name = "BasePdct", required = true)
    @XmlSchemaType(name = "string")
    protected AssetClassProductType3Code basePdct;
    @XmlElement(name = "SubPdct", required = true)
    @XmlSchemaType(name = "string")
    protected AssetClassSubProductType10Code subPdct;
    @XmlElement(name = "AddtlSubPdct", required = true)
    @XmlSchemaType(name = "string")
    protected AssetClassDetailedSubProductType8Code addtlSubPdct;

    /**
     * Gets the value of the basePdct property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassProductType3Code }
     *     
     */
    public AssetClassProductType3Code getBasePdct() {
        return basePdct;
    }

    /**
     * Sets the value of the basePdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassProductType3Code }
     *     
     */
    public void setBasePdct(AssetClassProductType3Code value) {
        this.basePdct = value;
    }

    /**
     * Gets the value of the subPdct property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassSubProductType10Code }
     *     
     */
    public AssetClassSubProductType10Code getSubPdct() {
        return subPdct;
    }

    /**
     * Sets the value of the subPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassSubProductType10Code }
     *     
     */
    public void setSubPdct(AssetClassSubProductType10Code value) {
        this.subPdct = value;
    }

    /**
     * Gets the value of the addtlSubPdct property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassDetailedSubProductType8Code }
     *     
     */
    public AssetClassDetailedSubProductType8Code getAddtlSubPdct() {
        return addtlSubPdct;
    }

    /**
     * Sets the value of the addtlSubPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassDetailedSubProductType8Code }
     *     
     */
    public void setAddtlSubPdct(AssetClassDetailedSubProductType8Code value) {
        this.addtlSubPdct = value;
    }

}
