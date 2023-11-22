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

package org.jpos.iso20022.casp_006_001_05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageType4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PackageType4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PackgId" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}GenericIdentification176" minOccurs="0"/>
 *         <element name="PackgLngth" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}PositiveNumber" minOccurs="0"/>
 *         <element name="OffsetStart" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}PositiveNumber" minOccurs="0"/>
 *         <element name="OffsetEnd" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}PositiveNumber" minOccurs="0"/>
 *         <element name="PackgBlck" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}ExternallyDefinedData4" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageType4", propOrder = {
    "packgId",
    "packgLngth",
    "offsetStart",
    "offsetEnd",
    "packgBlck"
})
public class PackageType4 {

    @XmlElement(name = "PackgId")
    protected GenericIdentification176 packgId;
    @XmlElement(name = "PackgLngth")
    protected BigDecimal packgLngth;
    @XmlElement(name = "OffsetStart")
    protected BigDecimal offsetStart;
    @XmlElement(name = "OffsetEnd")
    protected BigDecimal offsetEnd;
    @XmlElement(name = "PackgBlck")
    protected List<ExternallyDefinedData4> packgBlck;

    /**
     * Gets the value of the packgId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getPackgId() {
        return packgId;
    }

    /**
     * Sets the value of the packgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public void setPackgId(GenericIdentification176 value) {
        this.packgId = value;
    }

    /**
     * Gets the value of the packgLngth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPackgLngth() {
        return packgLngth;
    }

    /**
     * Sets the value of the packgLngth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPackgLngth(BigDecimal value) {
        this.packgLngth = value;
    }

    /**
     * Gets the value of the offsetStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOffsetStart() {
        return offsetStart;
    }

    /**
     * Sets the value of the offsetStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOffsetStart(BigDecimal value) {
        this.offsetStart = value;
    }

    /**
     * Gets the value of the offsetEnd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOffsetEnd() {
        return offsetEnd;
    }

    /**
     * Sets the value of the offsetEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOffsetEnd(BigDecimal value) {
        this.offsetEnd = value;
    }

    /**
     * Gets the value of the packgBlck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the packgBlck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackgBlck().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternallyDefinedData4 }
     * 
     * 
     * @return
     *     The value of the packgBlck property.
     */
    public List<ExternallyDefinedData4> getPackgBlck() {
        if (packgBlck == null) {
            packgBlck = new ArrayList<>();
        }
        return this.packgBlck;
    }

}
