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

package org.jpos.iso20022.seev_022_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailedMovement1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FailedMovement1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="CshAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.022.001.01}ActiveCurrencyAndAmount"/>
 *           <element name="SctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.022.001.01}UnitOrFaceAmount1Choice"/>
 *         </choice>
 *         <element name="SctyId" type="{urn:iso:std:iso:20022:tech:xsd:seev.022.001.01}SecurityIdentification7" minOccurs="0"/>
 *         <element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:seev.022.001.01}FailedSettlementReason1FormatChoice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailedMovement1", propOrder = {
    "cshAmt",
    "sctiesQty",
    "sctyId",
    "rsn"
})
public class FailedMovement1 {

    @XmlElement(name = "CshAmt")
    protected ActiveCurrencyAndAmount cshAmt;
    @XmlElement(name = "SctiesQty")
    protected UnitOrFaceAmount1Choice sctiesQty;
    @XmlElement(name = "SctyId")
    protected SecurityIdentification7 sctyId;
    @XmlElement(name = "Rsn", required = true)
    protected FailedSettlementReason1FormatChoice rsn;

    /**
     * Gets the value of the cshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCshAmt() {
        return cshAmt;
    }

    /**
     * Sets the value of the cshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCshAmt(ActiveCurrencyAndAmount value) {
        this.cshAmt = value;
    }

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setSctiesQty(UnitOrFaceAmount1Choice value) {
        this.sctiesQty = value;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public void setSctyId(SecurityIdentification7 value) {
        this.sctyId = value;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link FailedSettlementReason1FormatChoice }
     *     
     */
    public FailedSettlementReason1FormatChoice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailedSettlementReason1FormatChoice }
     *     
     */
    public void setRsn(FailedSettlementReason1FormatChoice value) {
        this.rsn = value;
    }

}
