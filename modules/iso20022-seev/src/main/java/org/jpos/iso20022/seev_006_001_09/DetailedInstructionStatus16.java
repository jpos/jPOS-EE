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

package org.jpos.iso20022.seev_006_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailedInstructionStatus16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DetailedInstructionStatus16">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SnglInstrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}Max35Text"/>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}Max35Text" minOccurs="0"/>
 *         <element name="SubAcctId" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}Max35Text" minOccurs="0"/>
 *         <element name="InstrSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}InstructionStatus11Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedInstructionStatus16", propOrder = {
    "snglInstrId",
    "acctId",
    "subAcctId",
    "instrSts"
})
public class DetailedInstructionStatus16 {

    @XmlElement(name = "SnglInstrId", required = true)
    protected String snglInstrId;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "SubAcctId")
    protected String subAcctId;
    @XmlElement(name = "InstrSts", required = true)
    protected InstructionStatus11Choice instrSts;

    /**
     * Gets the value of the snglInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnglInstrId() {
        return snglInstrId;
    }

    /**
     * Sets the value of the snglInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnglInstrId(String value) {
        this.snglInstrId = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the subAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAcctId() {
        return subAcctId;
    }

    /**
     * Sets the value of the subAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubAcctId(String value) {
        this.subAcctId = value;
    }

    /**
     * Gets the value of the instrSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionStatus11Choice }
     *     
     */
    public InstructionStatus11Choice getInstrSts() {
        return instrSts;
    }

    /**
     * Sets the value of the instrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionStatus11Choice }
     *     
     */
    public void setInstrSts(InstructionStatus11Choice value) {
        this.instrSts = value;
    }

}
