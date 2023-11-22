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

package org.jpos.iso20022.seev_001_001_10;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PowerOfAttorneyRequirements4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PowerOfAttorneyRequirements4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LglRqrmnt" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}PowerOfAttorneyLegalisation1Code" maxOccurs="4" minOccurs="0"/>
 *         <element name="OthrDcmnttn" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Max350Text" minOccurs="0"/>
 *         <element name="DocSubmissnDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}DateFormat58Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerOfAttorneyRequirements4", propOrder = {
    "lglRqrmnt",
    "othrDcmnttn",
    "docSubmissnDdln"
})
public class PowerOfAttorneyRequirements4 {

    @XmlElement(name = "LglRqrmnt")
    @XmlSchemaType(name = "string")
    protected List<PowerOfAttorneyLegalisation1Code> lglRqrmnt;
    @XmlElement(name = "OthrDcmnttn")
    protected String othrDcmnttn;
    @XmlElement(name = "DocSubmissnDdln")
    protected DateFormat58Choice docSubmissnDdln;

    /**
     * Gets the value of the lglRqrmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lglRqrmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLglRqrmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PowerOfAttorneyLegalisation1Code }
     * 
     * 
     * @return
     *     The value of the lglRqrmnt property.
     */
    public List<PowerOfAttorneyLegalisation1Code> getLglRqrmnt() {
        if (lglRqrmnt == null) {
            lglRqrmnt = new ArrayList<>();
        }
        return this.lglRqrmnt;
    }

    /**
     * Gets the value of the othrDcmnttn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrDcmnttn() {
        return othrDcmnttn;
    }

    /**
     * Sets the value of the othrDcmnttn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrDcmnttn(String value) {
        this.othrDcmnttn = value;
    }

    /**
     * Gets the value of the docSubmissnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getDocSubmissnDdln() {
        return docSubmissnDdln;
    }

    /**
     * Sets the value of the docSubmissnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public void setDocSubmissnDdln(DateFormat58Choice value) {
        this.docSubmissnDdln = value;
    }

}
