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

package org.jpos.iso20022.cain_002_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalService2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdditionalService2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:cain.002.001.03}AdditionalServiceType2Code"/>
 *         <element name="OthrTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.002.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Rslt" type="{urn:iso:std:iso:20022:tech:xsd:cain.002.001.03}AdditionalServiceResult1Code" minOccurs="0"/>
 *         <element name="OthrRslt" type="{urn:iso:std:iso:20022:tech:xsd:cain.002.001.03}Max35Text" minOccurs="0"/>
 *         <element name="SvcDtl" type="{urn:iso:std:iso:20022:tech:xsd:cain.002.001.03}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalService2", propOrder = {
    "tp",
    "othrTp",
    "rslt",
    "othrRslt",
    "svcDtl"
})
public class AdditionalService2 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected AdditionalServiceType2Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Rslt")
    @XmlSchemaType(name = "string")
    protected AdditionalServiceResult1Code rslt;
    @XmlElement(name = "OthrRslt")
    protected String othrRslt;
    @XmlElement(name = "SvcDtl")
    protected List<AdditionalData1> svcDtl;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalServiceType2Code }
     *     
     */
    public AdditionalServiceType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalServiceType2Code }
     *     
     */
    public void setTp(AdditionalServiceType2Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrTp(String value) {
        this.othrTp = value;
    }

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalServiceResult1Code }
     *     
     */
    public AdditionalServiceResult1Code getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalServiceResult1Code }
     *     
     */
    public void setRslt(AdditionalServiceResult1Code value) {
        this.rslt = value;
    }

    /**
     * Gets the value of the othrRslt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRslt() {
        return othrRslt;
    }

    /**
     * Sets the value of the othrRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrRslt(String value) {
        this.othrRslt = value;
    }

    /**
     * Gets the value of the svcDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svcDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the svcDtl property.
     */
    public List<AdditionalData1> getSvcDtl() {
        if (svcDtl == null) {
            svcDtl = new ArrayList<>();
        }
        return this.svcDtl;
    }

}
