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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationGeneralInformation4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NotificationGeneralInformation4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NtfctnId" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Max35Text" minOccurs="0"/>
 *         <element name="NtfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}NotificationType3Code"/>
 *         <element name="NtfctnSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}EventStatus1"/>
 *         <element name="ShrhldrRghtsDrctvInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}YesNoIndicator" minOccurs="0"/>
 *         <element name="ConfOfHldgReqrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}YesNoIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationGeneralInformation4", propOrder = {
    "ntfctnId",
    "ntfctnTp",
    "ntfctnSts",
    "shrhldrRghtsDrctvInd",
    "confOfHldgReqrd"
})
public class NotificationGeneralInformation4 {

    @XmlElement(name = "NtfctnId")
    protected String ntfctnId;
    @XmlElement(name = "NtfctnTp", required = true)
    @XmlSchemaType(name = "string")
    protected NotificationType3Code ntfctnTp;
    @XmlElement(name = "NtfctnSts", required = true)
    protected EventStatus1 ntfctnSts;
    @XmlElement(name = "ShrhldrRghtsDrctvInd")
    protected Boolean shrhldrRghtsDrctvInd;
    @XmlElement(name = "ConfOfHldgReqrd")
    protected Boolean confOfHldgReqrd;

    /**
     * Gets the value of the ntfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtfctnId() {
        return ntfctnId;
    }

    /**
     * Sets the value of the ntfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtfctnId(String value) {
        this.ntfctnId = value;
    }

    /**
     * Gets the value of the ntfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationType3Code }
     *     
     */
    public NotificationType3Code getNtfctnTp() {
        return ntfctnTp;
    }

    /**
     * Sets the value of the ntfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationType3Code }
     *     
     */
    public void setNtfctnTp(NotificationType3Code value) {
        this.ntfctnTp = value;
    }

    /**
     * Gets the value of the ntfctnSts property.
     * 
     * @return
     *     possible object is
     *     {@link EventStatus1 }
     *     
     */
    public EventStatus1 getNtfctnSts() {
        return ntfctnSts;
    }

    /**
     * Sets the value of the ntfctnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventStatus1 }
     *     
     */
    public void setNtfctnSts(EventStatus1 value) {
        this.ntfctnSts = value;
    }

    /**
     * Gets the value of the shrhldrRghtsDrctvInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShrhldrRghtsDrctvInd() {
        return shrhldrRghtsDrctvInd;
    }

    /**
     * Sets the value of the shrhldrRghtsDrctvInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShrhldrRghtsDrctvInd(Boolean value) {
        this.shrhldrRghtsDrctvInd = value;
    }

    /**
     * Gets the value of the confOfHldgReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfOfHldgReqrd() {
        return confOfHldgReqrd;
    }

    /**
     * Sets the value of the confOfHldgReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfOfHldgReqrd(Boolean value) {
        this.confOfHldgReqrd = value;
    }

}
