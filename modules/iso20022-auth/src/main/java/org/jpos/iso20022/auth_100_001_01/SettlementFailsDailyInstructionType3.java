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

package org.jpos.iso20022.auth_100_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementFailsDailyInstructionType3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementFailsDailyInstructionType3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DlvryVrssPmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementDailyFailureReason1Choice"/>
 *         <element name="DlvryWthPmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementDailyFailureReason1Choice"/>
 *         <element name="PmtFreeOfDlvry" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementDailyFailureReason1Choice"/>
 *         <element name="FreeOfPmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementDailyFailureReason1Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsDailyInstructionType3", propOrder = {
    "dlvryVrssPmt",
    "dlvryWthPmt",
    "pmtFreeOfDlvry",
    "freeOfPmt"
})
public class SettlementFailsDailyInstructionType3 {

    @XmlElement(name = "DlvryVrssPmt", required = true)
    protected SettlementDailyFailureReason1Choice dlvryVrssPmt;
    @XmlElement(name = "DlvryWthPmt", required = true)
    protected SettlementDailyFailureReason1Choice dlvryWthPmt;
    @XmlElement(name = "PmtFreeOfDlvry", required = true)
    protected SettlementDailyFailureReason1Choice pmtFreeOfDlvry;
    @XmlElement(name = "FreeOfPmt", required = true)
    protected SettlementDailyFailureReason1Choice freeOfPmt;

    /**
     * Gets the value of the dlvryVrssPmt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDailyFailureReason1Choice }
     *     
     */
    public SettlementDailyFailureReason1Choice getDlvryVrssPmt() {
        return dlvryVrssPmt;
    }

    /**
     * Sets the value of the dlvryVrssPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDailyFailureReason1Choice }
     *     
     */
    public void setDlvryVrssPmt(SettlementDailyFailureReason1Choice value) {
        this.dlvryVrssPmt = value;
    }

    /**
     * Gets the value of the dlvryWthPmt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDailyFailureReason1Choice }
     *     
     */
    public SettlementDailyFailureReason1Choice getDlvryWthPmt() {
        return dlvryWthPmt;
    }

    /**
     * Sets the value of the dlvryWthPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDailyFailureReason1Choice }
     *     
     */
    public void setDlvryWthPmt(SettlementDailyFailureReason1Choice value) {
        this.dlvryWthPmt = value;
    }

    /**
     * Gets the value of the pmtFreeOfDlvry property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDailyFailureReason1Choice }
     *     
     */
    public SettlementDailyFailureReason1Choice getPmtFreeOfDlvry() {
        return pmtFreeOfDlvry;
    }

    /**
     * Sets the value of the pmtFreeOfDlvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDailyFailureReason1Choice }
     *     
     */
    public void setPmtFreeOfDlvry(SettlementDailyFailureReason1Choice value) {
        this.pmtFreeOfDlvry = value;
    }

    /**
     * Gets the value of the freeOfPmt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDailyFailureReason1Choice }
     *     
     */
    public SettlementDailyFailureReason1Choice getFreeOfPmt() {
        return freeOfPmt;
    }

    /**
     * Sets the value of the freeOfPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDailyFailureReason1Choice }
     *     
     */
    public void setFreeOfPmt(SettlementDailyFailureReason1Choice value) {
        this.freeOfPmt = value;
    }

}
