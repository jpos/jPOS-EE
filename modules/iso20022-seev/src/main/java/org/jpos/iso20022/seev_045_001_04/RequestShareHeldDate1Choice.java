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

package org.jpos.iso20022.seev_045_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestShareHeldDate1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequestShareHeldDate1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="DtClctnMtd" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}DateCalculationMethod1Code"/>
 *         <element name="DtClctnDesc" type="{urn:iso:std:iso:20022:tech:xsd:seev.045.001.04}Max350Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestShareHeldDate1Choice", propOrder = {
    "dtClctnMtd",
    "dtClctnDesc"
})
public class RequestShareHeldDate1Choice {

    @XmlElement(name = "DtClctnMtd")
    @XmlSchemaType(name = "string")
    protected DateCalculationMethod1Code dtClctnMtd;
    @XmlElement(name = "DtClctnDesc")
    protected String dtClctnDesc;

    /**
     * Gets the value of the dtClctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link DateCalculationMethod1Code }
     *     
     */
    public DateCalculationMethod1Code getDtClctnMtd() {
        return dtClctnMtd;
    }

    /**
     * Sets the value of the dtClctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCalculationMethod1Code }
     *     
     */
    public void setDtClctnMtd(DateCalculationMethod1Code value) {
        this.dtClctnMtd = value;
    }

    /**
     * Gets the value of the dtClctnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtClctnDesc() {
        return dtClctnDesc;
    }

    /**
     * Sets the value of the dtClctnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtClctnDesc(String value) {
        this.dtClctnDesc = value;
    }

}
