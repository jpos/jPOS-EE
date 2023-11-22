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

package org.jpos.iso20022.tsmt_012_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportMeans5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransportMeans5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IndvTrnsprt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}SingleTransport7"/>
 *         <element name="MltmdlTrnsprt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}MultimodalTransport3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportMeans5", propOrder = {
    "indvTrnsprt",
    "mltmdlTrnsprt"
})
public class TransportMeans5 {

    @XmlElement(name = "IndvTrnsprt", required = true)
    protected SingleTransport7 indvTrnsprt;
    @XmlElement(name = "MltmdlTrnsprt")
    protected MultimodalTransport3 mltmdlTrnsprt;

    /**
     * Gets the value of the indvTrnsprt property.
     * 
     * @return
     *     possible object is
     *     {@link SingleTransport7 }
     *     
     */
    public SingleTransport7 getIndvTrnsprt() {
        return indvTrnsprt;
    }

    /**
     * Sets the value of the indvTrnsprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleTransport7 }
     *     
     */
    public void setIndvTrnsprt(SingleTransport7 value) {
        this.indvTrnsprt = value;
    }

    /**
     * Gets the value of the mltmdlTrnsprt property.
     * 
     * @return
     *     possible object is
     *     {@link MultimodalTransport3 }
     *     
     */
    public MultimodalTransport3 getMltmdlTrnsprt() {
        return mltmdlTrnsprt;
    }

    /**
     * Sets the value of the mltmdlTrnsprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultimodalTransport3 }
     *     
     */
    public void setMltmdlTrnsprt(MultimodalTransport3 value) {
        this.mltmdlTrnsprt = value;
    }

}
