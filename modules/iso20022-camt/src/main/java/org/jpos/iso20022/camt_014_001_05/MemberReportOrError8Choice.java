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

package org.jpos.iso20022.camt_014_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemberReportOrError8Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MemberReportOrError8Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Mmb" type="{urn:iso:std:iso:20022:tech:xsd:camt.014.001.05}Member7"/>
 *         <element name="BizErr" type="{urn:iso:std:iso:20022:tech:xsd:camt.014.001.05}ErrorHandling3"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberReportOrError8Choice", propOrder = {
    "mmb",
    "bizErr"
})
public class MemberReportOrError8Choice {

    @XmlElement(name = "Mmb")
    protected Member7 mmb;
    @XmlElement(name = "BizErr")
    protected ErrorHandling3 bizErr;

    /**
     * Gets the value of the mmb property.
     * 
     * @return
     *     possible object is
     *     {@link Member7 }
     *     
     */
    public Member7 getMmb() {
        return mmb;
    }

    /**
     * Sets the value of the mmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Member7 }
     *     
     */
    public void setMmb(Member7 value) {
        this.mmb = value;
    }

    /**
     * Gets the value of the bizErr property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling3 }
     *     
     */
    public ErrorHandling3 getBizErr() {
        return bizErr;
    }

    /**
     * Sets the value of the bizErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling3 }
     *     
     */
    public void setBizErr(ErrorHandling3 value) {
        this.bizErr = value;
    }

}
