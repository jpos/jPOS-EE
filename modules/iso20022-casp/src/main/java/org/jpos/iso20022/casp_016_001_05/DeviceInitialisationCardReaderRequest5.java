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

package org.jpos.iso20022.casp_016_001_05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceInitialisationCardReaderRequest5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DeviceInitialisationCardReaderRequest5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WarmRstFlg" type="{urn:iso:std:iso:20022:tech:xsd:casp.016.001.05}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="ForceNtryMd" type="{urn:iso:std:iso:20022:tech:xsd:casp.016.001.05}CardDataReading8Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LeavCardFlg" type="{urn:iso:std:iso:20022:tech:xsd:casp.016.001.05}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="MaxWtgTm" type="{urn:iso:std:iso:20022:tech:xsd:casp.016.001.05}Number" minOccurs="0"/>
 *         <element name="DispOutpt" type="{urn:iso:std:iso:20022:tech:xsd:casp.016.001.05}ActionMessage10" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInitialisationCardReaderRequest5", propOrder = {
    "warmRstFlg",
    "forceNtryMd",
    "leavCardFlg",
    "maxWtgTm",
    "dispOutpt"
})
public class DeviceInitialisationCardReaderRequest5 {

    @XmlElement(name = "WarmRstFlg")
    protected Boolean warmRstFlg;
    @XmlElement(name = "ForceNtryMd")
    @XmlSchemaType(name = "string")
    protected List<CardDataReading8Code> forceNtryMd;
    @XmlElement(name = "LeavCardFlg")
    protected Boolean leavCardFlg;
    @XmlElement(name = "MaxWtgTm")
    protected BigDecimal maxWtgTm;
    @XmlElement(name = "DispOutpt")
    protected ActionMessage10 dispOutpt;

    /**
     * Gets the value of the warmRstFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWarmRstFlg() {
        return warmRstFlg;
    }

    /**
     * Sets the value of the warmRstFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWarmRstFlg(Boolean value) {
        this.warmRstFlg = value;
    }

    /**
     * Gets the value of the forceNtryMd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the forceNtryMd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForceNtryMd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardDataReading8Code }
     * 
     * 
     * @return
     *     The value of the forceNtryMd property.
     */
    public List<CardDataReading8Code> getForceNtryMd() {
        if (forceNtryMd == null) {
            forceNtryMd = new ArrayList<>();
        }
        return this.forceNtryMd;
    }

    /**
     * Gets the value of the leavCardFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeavCardFlg() {
        return leavCardFlg;
    }

    /**
     * Sets the value of the leavCardFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeavCardFlg(Boolean value) {
        this.leavCardFlg = value;
    }

    /**
     * Gets the value of the maxWtgTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxWtgTm() {
        return maxWtgTm;
    }

    /**
     * Sets the value of the maxWtgTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxWtgTm(BigDecimal value) {
        this.maxWtgTm = value;
    }

    /**
     * Gets the value of the dispOutpt property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage10 }
     *     
     */
    public ActionMessage10 getDispOutpt() {
        return dispOutpt;
    }

    /**
     * Sets the value of the dispOutpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage10 }
     *     
     */
    public void setDispOutpt(ActionMessage10 value) {
        this.dispOutpt = value;
    }

}
