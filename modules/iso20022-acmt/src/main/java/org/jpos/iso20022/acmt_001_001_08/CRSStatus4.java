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

package org.jpos.iso20022.acmt_001_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CRSStatus4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CRSStatus4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}CRSStatus3Choice"/>
 *         <element name="Src" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}CRSSource1Choice" minOccurs="0"/>
 *         <element name="XcptnlRptgCtry" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}CountryCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRSStatus4", propOrder = {
    "tp",
    "src",
    "xcptnlRptgCtry"
})
public class CRSStatus4 {

    @XmlElement(name = "Tp", required = true)
    protected CRSStatus3Choice tp;
    @XmlElement(name = "Src")
    protected CRSSource1Choice src;
    @XmlElement(name = "XcptnlRptgCtry")
    protected String xcptnlRptgCtry;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CRSStatus3Choice }
     *     
     */
    public CRSStatus3Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRSStatus3Choice }
     *     
     */
    public void setTp(CRSStatus3Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the src property.
     * 
     * @return
     *     possible object is
     *     {@link CRSSource1Choice }
     *     
     */
    public CRSSource1Choice getSrc() {
        return src;
    }

    /**
     * Sets the value of the src property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRSSource1Choice }
     *     
     */
    public void setSrc(CRSSource1Choice value) {
        this.src = value;
    }

    /**
     * Gets the value of the xcptnlRptgCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXcptnlRptgCtry() {
        return xcptnlRptgCtry;
    }

    /**
     * Sets the value of the xcptnlRptgCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXcptnlRptgCtry(String value) {
        this.xcptnlRptgCtry = value;
    }

}
