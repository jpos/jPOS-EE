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

package org.jpos.iso20022.setr_009_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cheque9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Cheque9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nb" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}Max35Text" minOccurs="0"/>
 *         <element name="PyeeId" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}PartyIdentification113"/>
 *         <element name="DrweeId" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}FinancialInstitutionIdentification10" minOccurs="0"/>
 *         <element name="DrwrId" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}PartyIdentification113" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cheque9", propOrder = {
    "nb",
    "pyeeId",
    "drweeId",
    "drwrId"
})
public class Cheque9 {

    @XmlElement(name = "Nb")
    protected String nb;
    @XmlElement(name = "PyeeId", required = true)
    protected PartyIdentification113 pyeeId;
    @XmlElement(name = "DrweeId")
    protected FinancialInstitutionIdentification10 drweeId;
    @XmlElement(name = "DrwrId")
    protected PartyIdentification113 drwrId;

    /**
     * Gets the value of the nb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNb() {
        return nb;
    }

    /**
     * Sets the value of the nb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNb(String value) {
        this.nb = value;
    }

    /**
     * Gets the value of the pyeeId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification113 }
     *     
     */
    public PartyIdentification113 getPyeeId() {
        return pyeeId;
    }

    /**
     * Sets the value of the pyeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification113 }
     *     
     */
    public void setPyeeId(PartyIdentification113 value) {
        this.pyeeId = value;
    }

    /**
     * Gets the value of the drweeId property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification10 }
     *     
     */
    public FinancialInstitutionIdentification10 getDrweeId() {
        return drweeId;
    }

    /**
     * Sets the value of the drweeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification10 }
     *     
     */
    public void setDrweeId(FinancialInstitutionIdentification10 value) {
        this.drweeId = value;
    }

    /**
     * Gets the value of the drwrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification113 }
     *     
     */
    public PartyIdentification113 getDrwrId() {
        return drwrId;
    }

    /**
     * Sets the value of the drwrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification113 }
     *     
     */
    public void setDrwrId(PartyIdentification113 value) {
        this.drwrId = value;
    }

}
