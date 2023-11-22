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

package org.jpos.iso20022.tsmt_014_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjustmentType1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdjustmentType1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}AdjustmentType2Code"/>
 *         <element name="OthrAdjstmntTp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Max35Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustmentType1Choice", propOrder = {
    "tp",
    "othrAdjstmntTp"
})
public class AdjustmentType1Choice {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected AdjustmentType2Code tp;
    @XmlElement(name = "OthrAdjstmntTp")
    protected String othrAdjstmntTp;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentType2Code }
     *     
     */
    public AdjustmentType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentType2Code }
     *     
     */
    public void setTp(AdjustmentType2Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the othrAdjstmntTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrAdjstmntTp() {
        return othrAdjstmntTp;
    }

    /**
     * Sets the value of the othrAdjstmntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrAdjstmntTp(String value) {
        this.othrAdjstmntTp = value;
    }

}
