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

package org.jpos.iso20022.camt_011_001_07;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitIdentification2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LimitIdentification2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Cur" type="{urn:iso:std:iso:20022:tech:xsd:camt.011.001.07}LimitIdentification5"/>
 *         <element name="Dflt" type="{urn:iso:std:iso:20022:tech:xsd:camt.011.001.07}LimitIdentification5"/>
 *         <element name="AllCur" type="{urn:iso:std:iso:20022:tech:xsd:camt.011.001.07}LimitIdentification6"/>
 *         <element name="AllDflt" type="{urn:iso:std:iso:20022:tech:xsd:camt.011.001.07}LimitIdentification6"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitIdentification2Choice", propOrder = {
    "cur",
    "dflt",
    "allCur",
    "allDflt"
})
public class LimitIdentification2Choice {

    @XmlElement(name = "Cur")
    protected LimitIdentification5 cur;
    @XmlElement(name = "Dflt")
    protected LimitIdentification5 dflt;
    @XmlElement(name = "AllCur")
    protected LimitIdentification6 allCur;
    @XmlElement(name = "AllDflt")
    protected LimitIdentification6 allDflt;

    /**
     * Gets the value of the cur property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification5 }
     *     
     */
    public LimitIdentification5 getCur() {
        return cur;
    }

    /**
     * Sets the value of the cur property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification5 }
     *     
     */
    public void setCur(LimitIdentification5 value) {
        this.cur = value;
    }

    /**
     * Gets the value of the dflt property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification5 }
     *     
     */
    public LimitIdentification5 getDflt() {
        return dflt;
    }

    /**
     * Sets the value of the dflt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification5 }
     *     
     */
    public void setDflt(LimitIdentification5 value) {
        this.dflt = value;
    }

    /**
     * Gets the value of the allCur property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification6 }
     *     
     */
    public LimitIdentification6 getAllCur() {
        return allCur;
    }

    /**
     * Sets the value of the allCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification6 }
     *     
     */
    public void setAllCur(LimitIdentification6 value) {
        this.allCur = value;
    }

    /**
     * Gets the value of the allDflt property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification6 }
     *     
     */
    public LimitIdentification6 getAllDflt() {
        return allDflt;
    }

    /**
     * Sets the value of the allDflt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification6 }
     *     
     */
    public void setAllDflt(LimitIdentification6 value) {
        this.allDflt = value;
    }

}
