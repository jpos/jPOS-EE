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

package org.jpos.iso20022.seev_004_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecificInstructionRequest4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SpecificInstructionRequest4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrtcptnMtd" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}ParticipationMethod3Choice" minOccurs="0"/>
 *         <element name="SctiesRegn" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}YesNoIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificInstructionRequest4", propOrder = {
    "prtcptnMtd",
    "sctiesRegn"
})
public class SpecificInstructionRequest4 {

    @XmlElement(name = "PrtcptnMtd")
    protected ParticipationMethod3Choice prtcptnMtd;
    @XmlElement(name = "SctiesRegn")
    protected Boolean sctiesRegn;

    /**
     * Gets the value of the prtcptnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipationMethod3Choice }
     *     
     */
    public ParticipationMethod3Choice getPrtcptnMtd() {
        return prtcptnMtd;
    }

    /**
     * Sets the value of the prtcptnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationMethod3Choice }
     *     
     */
    public void setPrtcptnMtd(ParticipationMethod3Choice value) {
        this.prtcptnMtd = value;
    }

    /**
     * Gets the value of the sctiesRegn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSctiesRegn() {
        return sctiesRegn;
    }

    /**
     * Sets the value of the sctiesRegn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSctiesRegn(Boolean value) {
        this.sctiesRegn = value;
    }

}
