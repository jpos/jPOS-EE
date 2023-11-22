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

package org.jpos.iso20022.cain_018_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApprovalData1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ApprovalData1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ApprvlNtty" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}ApprovalEntity1" minOccurs="0"/>
 *         <element name="ApprvlCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}Exact6AlphaNumericText" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalData1", propOrder = {
    "apprvlNtty",
    "apprvlCd"
})
public class ApprovalData1 {

    @XmlElement(name = "ApprvlNtty")
    protected ApprovalEntity1 apprvlNtty;
    @XmlElement(name = "ApprvlCd")
    protected String apprvlCd;

    /**
     * Gets the value of the apprvlNtty property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalEntity1 }
     *     
     */
    public ApprovalEntity1 getApprvlNtty() {
        return apprvlNtty;
    }

    /**
     * Sets the value of the apprvlNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalEntity1 }
     *     
     */
    public void setApprvlNtty(ApprovalEntity1 value) {
        this.apprvlNtty = value;
    }

    /**
     * Gets the value of the apprvlCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprvlCd() {
        return apprvlCd;
    }

    /**
     * Sets the value of the apprvlCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprvlCd(String value) {
        this.apprvlCd = value;
    }

}
