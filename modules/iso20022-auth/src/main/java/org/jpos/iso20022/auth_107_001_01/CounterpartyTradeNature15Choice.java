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

package org.jpos.iso20022.auth_107_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterpartyTradeNature15Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CounterpartyTradeNature15Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="FI" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}FinancialInstitutionSector1"/>
 *         <element name="NFI" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}NonFinancialInstitutionSector10"/>
 *         <element name="CntrlCntrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}NoReasonCode"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}NoReasonCode"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyTradeNature15Choice", propOrder = {
    "fi",
    "nfi",
    "cntrlCntrPty",
    "othr"
})
public class CounterpartyTradeNature15Choice {

    @XmlElement(name = "FI")
    protected FinancialInstitutionSector1 fi;
    @XmlElement(name = "NFI")
    protected NonFinancialInstitutionSector10 nfi;
    @XmlElement(name = "CntrlCntrPty")
    @XmlSchemaType(name = "string")
    protected NoReasonCode cntrlCntrPty;
    @XmlElement(name = "Othr")
    @XmlSchemaType(name = "string")
    protected NoReasonCode othr;

    /**
     * Gets the value of the fi property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionSector1 }
     *     
     */
    public FinancialInstitutionSector1 getFI() {
        return fi;
    }

    /**
     * Sets the value of the fi property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionSector1 }
     *     
     */
    public void setFI(FinancialInstitutionSector1 value) {
        this.fi = value;
    }

    /**
     * Gets the value of the nfi property.
     * 
     * @return
     *     possible object is
     *     {@link NonFinancialInstitutionSector10 }
     *     
     */
    public NonFinancialInstitutionSector10 getNFI() {
        return nfi;
    }

    /**
     * Sets the value of the nfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonFinancialInstitutionSector10 }
     *     
     */
    public void setNFI(NonFinancialInstitutionSector10 value) {
        this.nfi = value;
    }

    /**
     * Gets the value of the cntrlCntrPty property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getCntrlCntrPty() {
        return cntrlCntrPty;
    }

    /**
     * Sets the value of the cntrlCntrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public void setCntrlCntrPty(NoReasonCode value) {
        this.cntrlCntrPty = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public void setOthr(NoReasonCode value) {
        this.othr = value;
    }

}
