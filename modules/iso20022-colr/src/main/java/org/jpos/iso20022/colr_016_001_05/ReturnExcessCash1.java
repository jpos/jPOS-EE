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

package org.jpos.iso20022.colr_016_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnExcessCash1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReturnExcessCash1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RtrXcssCshTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ReturnExcessCash1Choice"/>
 *         <element name="CshCollCcy" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveOrHistoricCurrencyCode"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnExcessCash1", propOrder = {
    "rtrXcssCshTp",
    "cshCollCcy"
})
public class ReturnExcessCash1 {

    @XmlElement(name = "RtrXcssCshTp", required = true)
    protected ReturnExcessCash1Choice rtrXcssCshTp;
    @XmlElement(name = "CshCollCcy", required = true)
    protected String cshCollCcy;

    /**
     * Gets the value of the rtrXcssCshTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnExcessCash1Choice }
     *     
     */
    public ReturnExcessCash1Choice getRtrXcssCshTp() {
        return rtrXcssCshTp;
    }

    /**
     * Sets the value of the rtrXcssCshTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnExcessCash1Choice }
     *     
     */
    public void setRtrXcssCshTp(ReturnExcessCash1Choice value) {
        this.rtrXcssCshTp = value;
    }

    /**
     * Gets the value of the cshCollCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshCollCcy() {
        return cshCollCcy;
    }

    /**
     * Sets the value of the cshCollCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCshCollCcy(String value) {
        this.cshCollCcy = value;
    }

}
