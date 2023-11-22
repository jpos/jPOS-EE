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
 * <p>Java class for ContractModification9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ContractModification9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActnTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}TransactionOperationType10Code" minOccurs="0"/>
 *         <element name="Lvl" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ModificationLevel1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractModification9", propOrder = {
    "actnTp",
    "lvl"
})
public class ContractModification9 {

    @XmlElement(name = "ActnTp")
    @XmlSchemaType(name = "string")
    protected TransactionOperationType10Code actnTp;
    @XmlElement(name = "Lvl")
    @XmlSchemaType(name = "string")
    protected ModificationLevel1Code lvl;

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionOperationType10Code }
     *     
     */
    public TransactionOperationType10Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionOperationType10Code }
     *     
     */
    public void setActnTp(TransactionOperationType10Code value) {
        this.actnTp = value;
    }

    /**
     * Gets the value of the lvl property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationLevel1Code }
     *     
     */
    public ModificationLevel1Code getLvl() {
        return lvl;
    }

    /**
     * Sets the value of the lvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationLevel1Code }
     *     
     */
    public void setLvl(ModificationLevel1Code value) {
        this.lvl = value;
    }

}
