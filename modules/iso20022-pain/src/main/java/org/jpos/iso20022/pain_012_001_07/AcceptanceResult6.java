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

package org.jpos.iso20022.pain_012_001_07;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcceptanceResult6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AcceptanceResult6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Accptd" type="{urn:iso:std:iso:20022:tech:xsd:pain.012.001.07}YesNoIndicator"/>
 *         <element name="RjctRsn" type="{urn:iso:std:iso:20022:tech:xsd:pain.012.001.07}MandateReason1Choice" minOccurs="0"/>
 *         <element name="AddtlRjctRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.012.001.07}Max105Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptanceResult6", propOrder = {
    "accptd",
    "rjctRsn",
    "addtlRjctRsnInf"
})
public class AcceptanceResult6 {

    @XmlElement(name = "Accptd")
    protected boolean accptd;
    @XmlElement(name = "RjctRsn")
    protected MandateReason1Choice rjctRsn;
    @XmlElement(name = "AddtlRjctRsnInf")
    protected List<String> addtlRjctRsnInf;

    /**
     * Gets the value of the accptd property.
     * 
     */
    public boolean isAccptd() {
        return accptd;
    }

    /**
     * Sets the value of the accptd property.
     * 
     */
    public void setAccptd(boolean value) {
        this.accptd = value;
    }

    /**
     * Gets the value of the rjctRsn property.
     * 
     * @return
     *     possible object is
     *     {@link MandateReason1Choice }
     *     
     */
    public MandateReason1Choice getRjctRsn() {
        return rjctRsn;
    }

    /**
     * Sets the value of the rjctRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateReason1Choice }
     *     
     */
    public void setRjctRsn(MandateReason1Choice value) {
        this.rjctRsn = value;
    }

    /**
     * Gets the value of the addtlRjctRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlRjctRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlRjctRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlRjctRsnInf property.
     */
    public List<String> getAddtlRjctRsnInf() {
        if (addtlRjctRsnInf == null) {
            addtlRjctRsnInf = new ArrayList<>();
        }
        return this.addtlRjctRsnInf;
    }

}
