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

package org.jpos.iso20022.auth_030_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetalCommodityNonPrecious2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MetalCommodityNonPrecious2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BasePdct" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}AssetClassProductType7Code"/>
 *         <element name="SubPdct" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}AssetClassSubProductType15Code" minOccurs="0"/>
 *         <element name="AddtlSubPdct" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}AssetClassDetailedSubProductType10Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetalCommodityNonPrecious2", propOrder = {
    "basePdct",
    "subPdct",
    "addtlSubPdct"
})
public class MetalCommodityNonPrecious2 {

    @XmlElement(name = "BasePdct", required = true)
    @XmlSchemaType(name = "string")
    protected AssetClassProductType7Code basePdct;
    @XmlElement(name = "SubPdct")
    @XmlSchemaType(name = "string")
    protected AssetClassSubProductType15Code subPdct;
    @XmlElement(name = "AddtlSubPdct")
    @XmlSchemaType(name = "string")
    protected AssetClassDetailedSubProductType10Code addtlSubPdct;

    /**
     * Gets the value of the basePdct property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassProductType7Code }
     *     
     */
    public AssetClassProductType7Code getBasePdct() {
        return basePdct;
    }

    /**
     * Sets the value of the basePdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassProductType7Code }
     *     
     */
    public void setBasePdct(AssetClassProductType7Code value) {
        this.basePdct = value;
    }

    /**
     * Gets the value of the subPdct property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassSubProductType15Code }
     *     
     */
    public AssetClassSubProductType15Code getSubPdct() {
        return subPdct;
    }

    /**
     * Sets the value of the subPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassSubProductType15Code }
     *     
     */
    public void setSubPdct(AssetClassSubProductType15Code value) {
        this.subPdct = value;
    }

    /**
     * Gets the value of the addtlSubPdct property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassDetailedSubProductType10Code }
     *     
     */
    public AssetClassDetailedSubProductType10Code getAddtlSubPdct() {
        return addtlSubPdct;
    }

    /**
     * Sets the value of the addtlSubPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassDetailedSubProductType10Code }
     *     
     */
    public void setAddtlSubPdct(AssetClassDetailedSubProductType10Code value) {
        this.addtlSubPdct = value;
    }

}
