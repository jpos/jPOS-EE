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

package org.jpos.iso20022.camt_053_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceType13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BalanceType13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdOrPrtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}BalanceType10Choice"/>
 *         <element name="SubTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}BalanceSubType1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceType13", propOrder = {
    "cdOrPrtry",
    "subTp"
})
public class BalanceType13 {

    @XmlElement(name = "CdOrPrtry", required = true)
    protected BalanceType10Choice cdOrPrtry;
    @XmlElement(name = "SubTp")
    protected BalanceSubType1Choice subTp;

    /**
     * Gets the value of the cdOrPrtry property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceType10Choice }
     *     
     */
    public BalanceType10Choice getCdOrPrtry() {
        return cdOrPrtry;
    }

    /**
     * Sets the value of the cdOrPrtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceType10Choice }
     *     
     */
    public void setCdOrPrtry(BalanceType10Choice value) {
        this.cdOrPrtry = value;
    }

    /**
     * Gets the value of the subTp property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSubType1Choice }
     *     
     */
    public BalanceSubType1Choice getSubTp() {
        return subTp;
    }

    /**
     * Sets the value of the subTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSubType1Choice }
     *     
     */
    public void setSubTp(BalanceSubType1Choice value) {
        this.subTp = value;
    }

}
