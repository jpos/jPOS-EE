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

package org.jpos.iso20022.tsmt_014_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertifiedCharacteristics2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CertifiedCharacteristics2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Orgn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}CountryCode"/>
 *         <element name="Qlty" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Max70Text"/>
 *         <element name="Anlys" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Max70Text"/>
 *         <element name="Wght" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Quantity9"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Quantity9"/>
 *         <element name="HlthIndctn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}YesNoIndicator"/>
 *         <element name="PhytosntryIndctn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}YesNoIndicator"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertifiedCharacteristics2Choice", propOrder = {
    "orgn",
    "qlty",
    "anlys",
    "wght",
    "qty",
    "hlthIndctn",
    "phytosntryIndctn"
})
public class CertifiedCharacteristics2Choice {

    @XmlElement(name = "Orgn")
    protected String orgn;
    @XmlElement(name = "Qlty")
    protected String qlty;
    @XmlElement(name = "Anlys")
    protected String anlys;
    @XmlElement(name = "Wght")
    protected Quantity9 wght;
    @XmlElement(name = "Qty")
    protected Quantity9 qty;
    @XmlElement(name = "HlthIndctn")
    protected Boolean hlthIndctn;
    @XmlElement(name = "PhytosntryIndctn")
    protected Boolean phytosntryIndctn;

    /**
     * Gets the value of the orgn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgn() {
        return orgn;
    }

    /**
     * Sets the value of the orgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgn(String value) {
        this.orgn = value;
    }

    /**
     * Gets the value of the qlty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQlty() {
        return qlty;
    }

    /**
     * Sets the value of the qlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQlty(String value) {
        this.qlty = value;
    }

    /**
     * Gets the value of the anlys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnlys() {
        return anlys;
    }

    /**
     * Sets the value of the anlys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnlys(String value) {
        this.anlys = value;
    }

    /**
     * Gets the value of the wght property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity9 }
     *     
     */
    public Quantity9 getWght() {
        return wght;
    }

    /**
     * Sets the value of the wght property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity9 }
     *     
     */
    public void setWght(Quantity9 value) {
        this.wght = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity9 }
     *     
     */
    public Quantity9 getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity9 }
     *     
     */
    public void setQty(Quantity9 value) {
        this.qty = value;
    }

    /**
     * Gets the value of the hlthIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHlthIndctn() {
        return hlthIndctn;
    }

    /**
     * Sets the value of the hlthIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHlthIndctn(Boolean value) {
        this.hlthIndctn = value;
    }

    /**
     * Gets the value of the phytosntryIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhytosntryIndctn() {
        return phytosntryIndctn;
    }

    /**
     * Sets the value of the phytosntryIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhytosntryIndctn(Boolean value) {
        this.phytosntryIndctn = value;
    }

}
