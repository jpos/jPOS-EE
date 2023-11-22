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

package org.jpos.iso20022.camt_053_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointOfInteractionCapabilities1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PointOfInteractionCapabilities1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CardRdngCpblties" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}CardDataReading1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CrdhldrVrfctnCpblties" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}CardholderVerificationCapability1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OnLineCpblties" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}OnLineCapability1Code" minOccurs="0"/>
 *         <element name="DispCpblties" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}DisplayCapabilities1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrtLineWidth" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}Max3NumericText" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionCapabilities1", propOrder = {
    "cardRdngCpblties",
    "crdhldrVrfctnCpblties",
    "onLineCpblties",
    "dispCpblties",
    "prtLineWidth"
})
public class PointOfInteractionCapabilities1 {

    @XmlElement(name = "CardRdngCpblties")
    @XmlSchemaType(name = "string")
    protected List<CardDataReading1Code> cardRdngCpblties;
    @XmlElement(name = "CrdhldrVrfctnCpblties")
    @XmlSchemaType(name = "string")
    protected List<CardholderVerificationCapability1Code> crdhldrVrfctnCpblties;
    @XmlElement(name = "OnLineCpblties")
    @XmlSchemaType(name = "string")
    protected OnLineCapability1Code onLineCpblties;
    @XmlElement(name = "DispCpblties")
    protected List<DisplayCapabilities1> dispCpblties;
    @XmlElement(name = "PrtLineWidth")
    protected String prtLineWidth;

    /**
     * Gets the value of the cardRdngCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cardRdngCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardRdngCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardDataReading1Code }
     * 
     * 
     * @return
     *     The value of the cardRdngCpblties property.
     */
    public List<CardDataReading1Code> getCardRdngCpblties() {
        if (cardRdngCpblties == null) {
            cardRdngCpblties = new ArrayList<>();
        }
        return this.cardRdngCpblties;
    }

    /**
     * Gets the value of the crdhldrVrfctnCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the crdhldrVrfctnCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrdhldrVrfctnCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardholderVerificationCapability1Code }
     * 
     * 
     * @return
     *     The value of the crdhldrVrfctnCpblties property.
     */
    public List<CardholderVerificationCapability1Code> getCrdhldrVrfctnCpblties() {
        if (crdhldrVrfctnCpblties == null) {
            crdhldrVrfctnCpblties = new ArrayList<>();
        }
        return this.crdhldrVrfctnCpblties;
    }

    /**
     * Gets the value of the onLineCpblties property.
     * 
     * @return
     *     possible object is
     *     {@link OnLineCapability1Code }
     *     
     */
    public OnLineCapability1Code getOnLineCpblties() {
        return onLineCpblties;
    }

    /**
     * Sets the value of the onLineCpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLineCapability1Code }
     *     
     */
    public void setOnLineCpblties(OnLineCapability1Code value) {
        this.onLineCpblties = value;
    }

    /**
     * Gets the value of the dispCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dispCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDispCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayCapabilities1 }
     * 
     * 
     * @return
     *     The value of the dispCpblties property.
     */
    public List<DisplayCapabilities1> getDispCpblties() {
        if (dispCpblties == null) {
            dispCpblties = new ArrayList<>();
        }
        return this.dispCpblties;
    }

    /**
     * Gets the value of the prtLineWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtLineWidth() {
        return prtLineWidth;
    }

    /**
     * Sets the value of the prtLineWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtLineWidth(String value) {
        this.prtLineWidth = value;
    }

}
