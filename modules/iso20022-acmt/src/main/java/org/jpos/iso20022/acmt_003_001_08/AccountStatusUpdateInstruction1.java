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

package org.jpos.iso20022.acmt_003_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountStatusUpdateInstruction1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountStatusUpdateInstruction1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UpdInstr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}AccountStatusUpdateInstruction1Choice"/>
 *         <element name="UpdInstrRsn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}AccountStatusUpdateInstructionReason1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountStatusUpdateInstruction1", propOrder = {
    "updInstr",
    "updInstrRsn"
})
public class AccountStatusUpdateInstruction1 {

    @XmlElement(name = "UpdInstr", required = true)
    protected AccountStatusUpdateInstruction1Choice updInstr;
    @XmlElement(name = "UpdInstrRsn")
    protected AccountStatusUpdateInstructionReason1Choice updInstrRsn;

    /**
     * Gets the value of the updInstr property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatusUpdateInstruction1Choice }
     *     
     */
    public AccountStatusUpdateInstruction1Choice getUpdInstr() {
        return updInstr;
    }

    /**
     * Sets the value of the updInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatusUpdateInstruction1Choice }
     *     
     */
    public void setUpdInstr(AccountStatusUpdateInstruction1Choice value) {
        this.updInstr = value;
    }

    /**
     * Gets the value of the updInstrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatusUpdateInstructionReason1Choice }
     *     
     */
    public AccountStatusUpdateInstructionReason1Choice getUpdInstrRsn() {
        return updInstrRsn;
    }

    /**
     * Sets the value of the updInstrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatusUpdateInstructionReason1Choice }
     *     
     */
    public void setUpdInstrRsn(AccountStatusUpdateInstructionReason1Choice value) {
        this.updInstrRsn = value;
    }

}
