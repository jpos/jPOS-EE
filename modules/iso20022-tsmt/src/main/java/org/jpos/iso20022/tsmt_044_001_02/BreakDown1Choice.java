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

package org.jpos.iso20022.tsmt_044_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BreakDown1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BreakDown1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ByPurchsOrdr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.044.001.02}ReportLine5"/>
 *         <element name="ByComrclInvc" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.044.001.02}ReportLine6"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BreakDown1Choice", propOrder = {
    "byPurchsOrdr",
    "byComrclInvc"
})
public class BreakDown1Choice {

    @XmlElement(name = "ByPurchsOrdr")
    protected ReportLine5 byPurchsOrdr;
    @XmlElement(name = "ByComrclInvc")
    protected ReportLine6 byComrclInvc;

    /**
     * Gets the value of the byPurchsOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link ReportLine5 }
     *     
     */
    public ReportLine5 getByPurchsOrdr() {
        return byPurchsOrdr;
    }

    /**
     * Sets the value of the byPurchsOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportLine5 }
     *     
     */
    public void setByPurchsOrdr(ReportLine5 value) {
        this.byPurchsOrdr = value;
    }

    /**
     * Gets the value of the byComrclInvc property.
     * 
     * @return
     *     possible object is
     *     {@link ReportLine6 }
     *     
     */
    public ReportLine6 getByComrclInvc() {
        return byComrclInvc;
    }

    /**
     * Sets the value of the byComrclInvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportLine6 }
     *     
     */
    public void setByComrclInvc(ReportLine6 value) {
        this.byComrclInvc = value;
    }

}
