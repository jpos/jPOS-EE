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

package org.jpos.iso20022.auth_063_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StressLiquidResourceRequirement1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StressLiquidResourceRequirement1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OprlOutflw" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}AmountAndDirection102"/>
 *         <element name="VartnMrgnPmtOblgtn" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}AmountAndDirection102"/>
 *         <element name="SttlmOrDlvry" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}AmountAndDirection102"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}AmountAndDirection102"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StressLiquidResourceRequirement1", propOrder = {
    "oprlOutflw",
    "vartnMrgnPmtOblgtn",
    "sttlmOrDlvry",
    "othr"
})
public class StressLiquidResourceRequirement1 {

    @XmlElement(name = "OprlOutflw", required = true)
    protected AmountAndDirection102 oprlOutflw;
    @XmlElement(name = "VartnMrgnPmtOblgtn", required = true)
    protected AmountAndDirection102 vartnMrgnPmtOblgtn;
    @XmlElement(name = "SttlmOrDlvry", required = true)
    protected AmountAndDirection102 sttlmOrDlvry;
    @XmlElement(name = "Othr", required = true)
    protected AmountAndDirection102 othr;

    /**
     * Gets the value of the oprlOutflw property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getOprlOutflw() {
        return oprlOutflw;
    }

    /**
     * Sets the value of the oprlOutflw property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setOprlOutflw(AmountAndDirection102 value) {
        this.oprlOutflw = value;
    }

    /**
     * Gets the value of the vartnMrgnPmtOblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getVartnMrgnPmtOblgtn() {
        return vartnMrgnPmtOblgtn;
    }

    /**
     * Sets the value of the vartnMrgnPmtOblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setVartnMrgnPmtOblgtn(AmountAndDirection102 value) {
        this.vartnMrgnPmtOblgtn = value;
    }

    /**
     * Gets the value of the sttlmOrDlvry property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getSttlmOrDlvry() {
        return sttlmOrDlvry;
    }

    /**
     * Sets the value of the sttlmOrDlvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setSttlmOrDlvry(AmountAndDirection102 value) {
        this.sttlmOrDlvry = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setOthr(AmountAndDirection102 value) {
        this.othr = value;
    }

}
