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

package org.jpos.iso20022.seev_002_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingCancellationReason2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MeetingCancellationReason2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CxlRsnCd" type="{urn:iso:std:iso:20022:tech:xsd:seev.002.001.09}MeetingCancellationReason1Choice" minOccurs="0"/>
 *         <element name="CxlRsn" type="{urn:iso:std:iso:20022:tech:xsd:seev.002.001.09}Max140Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingCancellationReason2", propOrder = {
    "cxlRsnCd",
    "cxlRsn"
})
public class MeetingCancellationReason2 {

    @XmlElement(name = "CxlRsnCd")
    protected MeetingCancellationReason1Choice cxlRsnCd;
    @XmlElement(name = "CxlRsn")
    protected String cxlRsn;

    /**
     * Gets the value of the cxlRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingCancellationReason1Choice }
     *     
     */
    public MeetingCancellationReason1Choice getCxlRsnCd() {
        return cxlRsnCd;
    }

    /**
     * Sets the value of the cxlRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingCancellationReason1Choice }
     *     
     */
    public void setCxlRsnCd(MeetingCancellationReason1Choice value) {
        this.cxlRsnCd = value;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxlRsn(String value) {
        this.cxlRsn = value;
    }

}
