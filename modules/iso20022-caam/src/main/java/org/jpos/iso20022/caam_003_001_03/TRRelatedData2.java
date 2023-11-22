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

package org.jpos.iso20022.caam_003_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRRelatedData2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TRRelatedData2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TR34Cmd" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}TR34Command1Code" minOccurs="0"/>
 *         <element name="TRBlck" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}Max100KBinary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRRelatedData2", propOrder = {
    "tr34Cmd",
    "trBlck"
})
public class TRRelatedData2 {

    @XmlElement(name = "TR34Cmd")
    @XmlSchemaType(name = "string")
    protected TR34Command1Code tr34Cmd;
    @XmlElement(name = "TRBlck")
    protected byte[] trBlck;

    /**
     * Gets the value of the tr34Cmd property.
     * 
     * @return
     *     possible object is
     *     {@link TR34Command1Code }
     *     
     */
    public TR34Command1Code getTR34Cmd() {
        return tr34Cmd;
    }

    /**
     * Sets the value of the tr34Cmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TR34Command1Code }
     *     
     */
    public void setTR34Cmd(TR34Command1Code value) {
        this.tr34Cmd = value;
    }

    /**
     * Gets the value of the trBlck property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTRBlck() {
        return trBlck;
    }

    /**
     * Sets the value of the trBlck property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTRBlck(byte[] value) {
        this.trBlck = value;
    }

}
