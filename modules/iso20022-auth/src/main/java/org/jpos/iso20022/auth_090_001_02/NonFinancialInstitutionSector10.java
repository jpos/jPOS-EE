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

package org.jpos.iso20022.auth_090_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonFinancialInstitutionSector10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NonFinancialInstitutionSector10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Sctr" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}GenericIdentification175" maxOccurs="unbounded"/>
 *         <element name="ClrThrshld" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="DrctlyLkdActvty" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="FdrlInstn" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonFinancialInstitutionSector10", propOrder = {
    "sctr",
    "clrThrshld",
    "drctlyLkdActvty",
    "fdrlInstn"
})
public class NonFinancialInstitutionSector10 {

    @XmlElement(name = "Sctr", required = true)
    protected List<GenericIdentification175> sctr;
    @XmlElement(name = "ClrThrshld")
    protected Boolean clrThrshld;
    @XmlElement(name = "DrctlyLkdActvty")
    protected Boolean drctlyLkdActvty;
    @XmlElement(name = "FdrlInstn")
    protected Boolean fdrlInstn;

    /**
     * Gets the value of the sctr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification175 }
     * 
     * 
     * @return
     *     The value of the sctr property.
     */
    public List<GenericIdentification175> getSctr() {
        if (sctr == null) {
            sctr = new ArrayList<>();
        }
        return this.sctr;
    }

    /**
     * Gets the value of the clrThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClrThrshld() {
        return clrThrshld;
    }

    /**
     * Sets the value of the clrThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClrThrshld(Boolean value) {
        this.clrThrshld = value;
    }

    /**
     * Gets the value of the drctlyLkdActvty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDrctlyLkdActvty() {
        return drctlyLkdActvty;
    }

    /**
     * Sets the value of the drctlyLkdActvty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDrctlyLkdActvty(Boolean value) {
        this.drctlyLkdActvty = value;
    }

    /**
     * Gets the value of the fdrlInstn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFdrlInstn() {
        return fdrlInstn;
    }

    /**
     * Sets the value of the fdrlInstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFdrlInstn(Boolean value) {
        this.fdrlInstn = value;
    }

}
