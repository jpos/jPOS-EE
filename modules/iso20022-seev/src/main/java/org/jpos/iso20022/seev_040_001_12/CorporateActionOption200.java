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

package org.jpos.iso20022.seev_040_001_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionOption200 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionOption200">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OptnNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.040.001.12}OptionNumber1Choice"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.040.001.12}CorporateActionOption40Choice"/>
 *         <element name="InstdQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.040.001.12}Quantity52Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionOption200", propOrder = {
    "optnNb",
    "optnTp",
    "instdQty"
})
public class CorporateActionOption200 {

    @XmlElement(name = "OptnNb", required = true)
    protected OptionNumber1Choice optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption40Choice optnTp;
    @XmlElement(name = "InstdQty", required = true)
    protected Quantity52Choice instdQty;

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link OptionNumber1Choice }
     *     
     */
    public OptionNumber1Choice getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionNumber1Choice }
     *     
     */
    public void setOptnNb(OptionNumber1Choice value) {
        this.optnNb = value;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption40Choice }
     *     
     */
    public CorporateActionOption40Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption40Choice }
     *     
     */
    public void setOptnTp(CorporateActionOption40Choice value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the instdQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity52Choice }
     *     
     */
    public Quantity52Choice getInstdQty() {
        return instdQty;
    }

    /**
     * Sets the value of the instdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity52Choice }
     *     
     */
    public void setInstdQty(Quantity52Choice value) {
        this.instdQty = value;
    }

}
