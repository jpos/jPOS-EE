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

package org.jpos.iso20022.cain_016_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerDevice4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CustomerDevice4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Dvc" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}Device2" minOccurs="0"/>
 *         <element name="DvcId" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}DeviceIdentification1" minOccurs="0"/>
 *         <element name="OprgSys" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}DeviceOperatingSystem1" minOccurs="0"/>
 *         <element name="Prvdr" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}Max35Text" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDevice4", propOrder = {
    "dvc",
    "dvcId",
    "oprgSys",
    "prvdr",
    "addtlData"
})
public class CustomerDevice4 {

    @XmlElement(name = "Dvc")
    protected Device2 dvc;
    @XmlElement(name = "DvcId")
    protected DeviceIdentification1 dvcId;
    @XmlElement(name = "OprgSys")
    protected DeviceOperatingSystem1 oprgSys;
    @XmlElement(name = "Prvdr")
    protected String prvdr;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the dvc property.
     * 
     * @return
     *     possible object is
     *     {@link Device2 }
     *     
     */
    public Device2 getDvc() {
        return dvc;
    }

    /**
     * Sets the value of the dvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Device2 }
     *     
     */
    public void setDvc(Device2 value) {
        this.dvc = value;
    }

    /**
     * Gets the value of the dvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceIdentification1 }
     *     
     */
    public DeviceIdentification1 getDvcId() {
        return dvcId;
    }

    /**
     * Sets the value of the dvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceIdentification1 }
     *     
     */
    public void setDvcId(DeviceIdentification1 value) {
        this.dvcId = value;
    }

    /**
     * Gets the value of the oprgSys property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceOperatingSystem1 }
     *     
     */
    public DeviceOperatingSystem1 getOprgSys() {
        return oprgSys;
    }

    /**
     * Sets the value of the oprgSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceOperatingSystem1 }
     *     
     */
    public void setOprgSys(DeviceOperatingSystem1 value) {
        this.oprgSys = value;
    }

    /**
     * Gets the value of the prvdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdr() {
        return prvdr;
    }

    /**
     * Sets the value of the prvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvdr(String value) {
        this.prvdr = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
    }

}
