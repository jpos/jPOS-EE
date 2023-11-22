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
 * <p>Java class for Notification2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Notification2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NtfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max35Text"/>
 *         <element name="Reqrd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}YesNoIndicator"/>
 *         <element name="DstrbtnTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}InformationDistribution1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notification2", propOrder = {
    "ntfctnTp",
    "reqrd",
    "dstrbtnTp"
})
public class Notification2 {

    @XmlElement(name = "NtfctnTp", required = true)
    protected String ntfctnTp;
    @XmlElement(name = "Reqrd")
    protected boolean reqrd;
    @XmlElement(name = "DstrbtnTp")
    protected InformationDistribution1Choice dstrbtnTp;

    /**
     * Gets the value of the ntfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtfctnTp() {
        return ntfctnTp;
    }

    /**
     * Sets the value of the ntfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtfctnTp(String value) {
        this.ntfctnTp = value;
    }

    /**
     * Gets the value of the reqrd property.
     * 
     */
    public boolean isReqrd() {
        return reqrd;
    }

    /**
     * Sets the value of the reqrd property.
     * 
     */
    public void setReqrd(boolean value) {
        this.reqrd = value;
    }

    /**
     * Gets the value of the dstrbtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link InformationDistribution1Choice }
     *     
     */
    public InformationDistribution1Choice getDstrbtnTp() {
        return dstrbtnTp;
    }

    /**
     * Sets the value of the dstrbtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationDistribution1Choice }
     *     
     */
    public void setDstrbtnTp(InformationDistribution1Choice value) {
        this.dstrbtnTp = value;
    }

}
