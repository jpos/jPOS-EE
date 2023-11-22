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

package org.jpos.iso20022.seev_013_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionElection1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionElection1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.013.001.01}CorporateActionOption1FormatChoice"/>
 *         <element name="OptnNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.013.001.01}Exact3NumericText"/>
 *         <element name="OrgnlInstdQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.013.001.01}UnitOrFaceAmount1Choice"/>
 *         <element name="RmngQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.013.001.01}UnitOrFaceAmount1Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionElection1", propOrder = {
    "optnTp",
    "optnNb",
    "orgnlInstdQty",
    "rmngQty"
})
public class CorporateActionElection1 {

    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption1FormatChoice optnTp;
    @XmlElement(name = "OptnNb", required = true)
    protected String optnNb;
    @XmlElement(name = "OrgnlInstdQty", required = true)
    protected UnitOrFaceAmount1Choice orgnlInstdQty;
    @XmlElement(name = "RmngQty", required = true)
    protected UnitOrFaceAmount1Choice rmngQty;

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public CorporateActionOption1FormatChoice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public void setOptnTp(CorporateActionOption1FormatChoice value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptnNb(String value) {
        this.optnNb = value;
    }

    /**
     * Gets the value of the orgnlInstdQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getOrgnlInstdQty() {
        return orgnlInstdQty;
    }

    /**
     * Sets the value of the orgnlInstdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setOrgnlInstdQty(UnitOrFaceAmount1Choice value) {
        this.orgnlInstdQty = value;
    }

    /**
     * Gets the value of the rmngQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getRmngQty() {
        return rmngQty;
    }

    /**
     * Sets the value of the rmngQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setRmngQty(UnitOrFaceAmount1Choice value) {
        this.rmngQty = value;
    }

}
