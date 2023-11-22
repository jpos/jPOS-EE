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

package org.jpos.iso20022.cain_016_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GracePeriod2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GracePeriod2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tm" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}Max3NumericText" minOccurs="0"/>
 *         <element name="UnitTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}GracePeriodUnitType1Code" minOccurs="0"/>
 *         <element name="OthrUnitTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}Max35Text" minOccurs="0"/>
 *         <element name="CstmrSelctdGracePrd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GracePeriod2", propOrder = {
    "tm",
    "unitTp",
    "othrUnitTp",
    "cstmrSelctdGracePrd"
})
public class GracePeriod2 {

    @XmlElement(name = "Tm")
    protected String tm;
    @XmlElement(name = "UnitTp")
    @XmlSchemaType(name = "string")
    protected GracePeriodUnitType1Code unitTp;
    @XmlElement(name = "OthrUnitTp")
    protected String othrUnitTp;
    @XmlElement(name = "CstmrSelctdGracePrd")
    protected Boolean cstmrSelctdGracePrd;

    /**
     * Gets the value of the tm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTm() {
        return tm;
    }

    /**
     * Sets the value of the tm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTm(String value) {
        this.tm = value;
    }

    /**
     * Gets the value of the unitTp property.
     * 
     * @return
     *     possible object is
     *     {@link GracePeriodUnitType1Code }
     *     
     */
    public GracePeriodUnitType1Code getUnitTp() {
        return unitTp;
    }

    /**
     * Sets the value of the unitTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GracePeriodUnitType1Code }
     *     
     */
    public void setUnitTp(GracePeriodUnitType1Code value) {
        this.unitTp = value;
    }

    /**
     * Gets the value of the othrUnitTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrUnitTp() {
        return othrUnitTp;
    }

    /**
     * Sets the value of the othrUnitTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrUnitTp(String value) {
        this.othrUnitTp = value;
    }

    /**
     * Gets the value of the cstmrSelctdGracePrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCstmrSelctdGracePrd() {
        return cstmrSelctdGracePrd;
    }

    /**
     * Sets the value of the cstmrSelctdGracePrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCstmrSelctdGracePrd(Boolean value) {
        this.cstmrSelctdGracePrd = value;
    }

}
