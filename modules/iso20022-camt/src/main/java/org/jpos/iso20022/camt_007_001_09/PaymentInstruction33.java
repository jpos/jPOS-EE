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

package org.jpos.iso20022.camt_007_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInstruction33 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentInstruction33">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Instr" type="{urn:iso:std:iso:20022:tech:xsd:camt.007.001.09}Instruction1Code" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.007.001.09}PaymentType4Choice" minOccurs="0"/>
 *         <element name="Prty" type="{urn:iso:std:iso:20022:tech:xsd:camt.007.001.09}Priority1Choice" minOccurs="0"/>
 *         <element name="PrcgVldtyTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.007.001.09}DateTimePeriod1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstruction33", propOrder = {
    "instr",
    "tp",
    "prty",
    "prcgVldtyTm"
})
public class PaymentInstruction33 {

    @XmlElement(name = "Instr")
    @XmlSchemaType(name = "string")
    protected Instruction1Code instr;
    @XmlElement(name = "Tp")
    protected PaymentType4Choice tp;
    @XmlElement(name = "Prty")
    protected Priority1Choice prty;
    @XmlElement(name = "PrcgVldtyTm")
    protected DateTimePeriod1Choice prcgVldtyTm;

    /**
     * Gets the value of the instr property.
     * 
     * @return
     *     possible object is
     *     {@link Instruction1Code }
     *     
     */
    public Instruction1Code getInstr() {
        return instr;
    }

    /**
     * Sets the value of the instr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instruction1Code }
     *     
     */
    public void setInstr(Instruction1Code value) {
        this.instr = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType4Choice }
     *     
     */
    public PaymentType4Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType4Choice }
     *     
     */
    public void setTp(PaymentType4Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority1Choice }
     *     
     */
    public Priority1Choice getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority1Choice }
     *     
     */
    public void setPrty(Priority1Choice value) {
        this.prty = value;
    }

    /**
     * Gets the value of the prcgVldtyTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public DateTimePeriod1Choice getPrcgVldtyTm() {
        return prcgVldtyTm;
    }

    /**
     * Sets the value of the prcgVldtyTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public void setPrcgVldtyTm(DateTimePeriod1Choice value) {
        this.prcgVldtyTm = value;
    }

}
