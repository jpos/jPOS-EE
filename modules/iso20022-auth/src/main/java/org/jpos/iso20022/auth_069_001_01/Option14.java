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

package org.jpos.iso20022.auth_069_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Option14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Option14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="XprtnStyle" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}OptionStyle5Code" maxOccurs="4"/>
 *         <element name="OptnStyle" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}ExoticOptionStyle1Code" minOccurs="0"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}OptionType1Code" minOccurs="0"/>
 *         <element name="BrrrInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="EvtTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}OptionEvent2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Option14", propOrder = {
    "xprtnStyle",
    "optnStyle",
    "optnTp",
    "brrrInd",
    "evtTp"
})
public class Option14 {

    @XmlElement(name = "XprtnStyle", required = true)
    @XmlSchemaType(name = "string")
    protected List<OptionStyle5Code> xprtnStyle;
    @XmlElement(name = "OptnStyle")
    @XmlSchemaType(name = "string")
    protected ExoticOptionStyle1Code optnStyle;
    @XmlElement(name = "OptnTp")
    @XmlSchemaType(name = "string")
    protected OptionType1Code optnTp;
    @XmlElement(name = "BrrrInd")
    protected Boolean brrrInd;
    @XmlElement(name = "EvtTp")
    protected OptionEvent2 evtTp;

    /**
     * Gets the value of the xprtnStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xprtnStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXprtnStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionStyle5Code }
     * 
     * 
     * @return
     *     The value of the xprtnStyle property.
     */
    public List<OptionStyle5Code> getXprtnStyle() {
        if (xprtnStyle == null) {
            xprtnStyle = new ArrayList<>();
        }
        return this.xprtnStyle;
    }

    /**
     * Gets the value of the optnStyle property.
     * 
     * @return
     *     possible object is
     *     {@link ExoticOptionStyle1Code }
     *     
     */
    public ExoticOptionStyle1Code getOptnStyle() {
        return optnStyle;
    }

    /**
     * Sets the value of the optnStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExoticOptionStyle1Code }
     *     
     */
    public void setOptnStyle(ExoticOptionStyle1Code value) {
        this.optnStyle = value;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType1Code }
     *     
     */
    public OptionType1Code getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType1Code }
     *     
     */
    public void setOptnTp(OptionType1Code value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the brrrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrrrInd() {
        return brrrInd;
    }

    /**
     * Sets the value of the brrrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrrrInd(Boolean value) {
        this.brrrInd = value;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionEvent2 }
     *     
     */
    public OptionEvent2 getEvtTp() {
        return evtTp;
    }

    /**
     * Sets the value of the evtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionEvent2 }
     *     
     */
    public void setEvtTp(OptionEvent2 value) {
        this.evtTp = value;
    }

}
