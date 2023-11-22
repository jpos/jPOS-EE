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

package org.jpos.iso20022.reda_058_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProprietaryStatusAndReason5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProprietaryStatusAndReason5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:reda.058.001.01}GenericIdentification36"/>
 *         <element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:reda.058.001.01}ProprietaryReason1Choice"/>
 *         <element name="AddtlRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:reda.058.001.01}Max210Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProprietaryStatusAndReason5", propOrder = {
    "sts",
    "rsn",
    "addtlRsnInf"
})
public class ProprietaryStatusAndReason5 {

    @XmlElement(name = "Sts", required = true)
    protected GenericIdentification36 sts;
    @XmlElement(name = "Rsn", required = true)
    protected ProprietaryReason1Choice rsn;
    @XmlElement(name = "AddtlRsnInf")
    protected String addtlRsnInf;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification36 }
     *     
     */
    public GenericIdentification36 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification36 }
     *     
     */
    public void setSts(GenericIdentification36 value) {
        this.sts = value;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1Choice }
     *     
     */
    public ProprietaryReason1Choice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1Choice }
     *     
     */
    public void setRsn(ProprietaryReason1Choice value) {
        this.rsn = value;
    }

    /**
     * Gets the value of the addtlRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRsnInf() {
        return addtlRsnInf;
    }

    /**
     * Sets the value of the addtlRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlRsnInf(String value) {
        this.addtlRsnInf = value;
    }

}
