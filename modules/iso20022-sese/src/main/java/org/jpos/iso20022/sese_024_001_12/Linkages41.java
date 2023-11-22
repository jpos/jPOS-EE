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

package org.jpos.iso20022.sese_024_001_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Linkages41 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Linkages41">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrcgPos" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}ProcessingPosition9Choice" minOccurs="0"/>
 *         <element name="SctiesSttlmTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}Max35Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Linkages41", propOrder = {
    "prcgPos",
    "sctiesSttlmTxId"
})
public class Linkages41 {

    @XmlElement(name = "PrcgPos")
    protected ProcessingPosition9Choice prcgPos;
    @XmlElement(name = "SctiesSttlmTxId", required = true)
    protected String sctiesSttlmTxId;

    /**
     * Gets the value of the prcgPos property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition9Choice }
     *     
     */
    public ProcessingPosition9Choice getPrcgPos() {
        return prcgPos;
    }

    /**
     * Sets the value of the prcgPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition9Choice }
     *     
     */
    public void setPrcgPos(ProcessingPosition9Choice value) {
        this.prcgPos = value;
    }

    /**
     * Gets the value of the sctiesSttlmTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesSttlmTxId() {
        return sctiesSttlmTxId;
    }

    /**
     * Sets the value of the sctiesSttlmTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctiesSttlmTxId(String value) {
        this.sctiesSttlmTxId = value;
    }

}
