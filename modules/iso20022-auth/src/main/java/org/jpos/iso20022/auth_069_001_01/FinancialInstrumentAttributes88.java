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

package org.jpos.iso20022.auth_069_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentAttributes88 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrumentAttributes88">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrctTerm" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}InterestRateContractTerm1" minOccurs="0"/>
 *         <element name="Stdstn" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}Standardisation1Code" maxOccurs="3" minOccurs="0"/>
 *         <element name="PmtFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}Frequency11Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributes88", propOrder = {
    "ctrctTerm",
    "stdstn",
    "pmtFrqcy"
})
public class FinancialInstrumentAttributes88 {

    @XmlElement(name = "CtrctTerm")
    protected InterestRateContractTerm1 ctrctTerm;
    @XmlElement(name = "Stdstn")
    @XmlSchemaType(name = "string")
    protected List<Standardisation1Code> stdstn;
    @XmlElement(name = "PmtFrqcy", required = true)
    @XmlSchemaType(name = "string")
    protected Frequency11Code pmtFrqcy;

    /**
     * Gets the value of the ctrctTerm property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateContractTerm1 }
     *     
     */
    public InterestRateContractTerm1 getCtrctTerm() {
        return ctrctTerm;
    }

    /**
     * Sets the value of the ctrctTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateContractTerm1 }
     *     
     */
    public void setCtrctTerm(InterestRateContractTerm1 value) {
        this.ctrctTerm = value;
    }

    /**
     * Gets the value of the stdstn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stdstn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStdstn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Standardisation1Code }
     * 
     * 
     * @return
     *     The value of the stdstn property.
     */
    public List<Standardisation1Code> getStdstn() {
        if (stdstn == null) {
            stdstn = new ArrayList<>();
        }
        return this.stdstn;
    }

    /**
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency11Code }
     *     
     */
    public Frequency11Code getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency11Code }
     *     
     */
    public void setPmtFrqcy(Frequency11Code value) {
        this.pmtFrqcy = value;
    }

}
