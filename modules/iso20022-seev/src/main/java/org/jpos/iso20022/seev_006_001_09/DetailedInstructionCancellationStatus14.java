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
 * <p>Java class for DetailedInstructionCancellationStatus14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DetailedInstructionCancellationStatus14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SnglInstrCxlId" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}Max35Text"/>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}Max35Text" minOccurs="0"/>
 *         <element name="SubAcctId" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}Max35Text" minOccurs="0"/>
 *         <element name="InstrCxlSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}CancellationStatus26Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedInstructionCancellationStatus14", propOrder = {
    "snglInstrCxlId",
    "acctId",
    "subAcctId",
    "instrCxlSts"
})
public class DetailedInstructionCancellationStatus14 {

    @XmlElement(name = "SnglInstrCxlId", required = true)
    protected String snglInstrCxlId;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "SubAcctId")
    protected String subAcctId;
    @XmlElement(name = "InstrCxlSts", required = true)
    protected CancellationStatus26Choice instrCxlSts;

    /**
     * Gets the value of the snglInstrCxlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnglInstrCxlId() {
        return snglInstrCxlId;
    }

    /**
     * Sets the value of the snglInstrCxlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnglInstrCxlId(String value) {
        this.snglInstrCxlId = value;
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
     * Gets the value of the instrCxlSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus26Choice }
     *     
     */
    public CancellationStatus26Choice getInstrCxlSts() {
        return instrCxlSts;
    }

    /**
     * Sets the value of the instrCxlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus26Choice }
     *     
     */
    public void setInstrCxlSts(CancellationStatus26Choice value) {
        this.instrCxlSts = value;
    }

}
