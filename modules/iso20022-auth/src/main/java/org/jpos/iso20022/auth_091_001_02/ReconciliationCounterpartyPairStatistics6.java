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

package org.jpos.iso20022.auth_091_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationCounterpartyPairStatistics6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReconciliationCounterpartyPairStatistics6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrPtyId" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CounterpartyData91"/>
 *         <element name="TtlNbOfTxs" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}Number"/>
 *         <element name="RcncltnRpt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}ReconciliationReport14" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationCounterpartyPairStatistics6", propOrder = {
    "ctrPtyId",
    "ttlNbOfTxs",
    "rcncltnRpt"
})
public class ReconciliationCounterpartyPairStatistics6 {

    @XmlElement(name = "CtrPtyId", required = true)
    protected CounterpartyData91 ctrPtyId;
    @XmlElement(name = "TtlNbOfTxs", required = true)
    protected BigDecimal ttlNbOfTxs;
    @XmlElement(name = "RcncltnRpt", required = true)
    protected List<ReconciliationReport14> rcncltnRpt;

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyData91 }
     *     
     */
    public CounterpartyData91 getCtrPtyId() {
        return ctrPtyId;
    }

    /**
     * Sets the value of the ctrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyData91 }
     *     
     */
    public void setCtrPtyId(CounterpartyData91 value) {
        this.ctrPtyId = value;
    }

    /**
     * Gets the value of the ttlNbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfTxs() {
        return ttlNbOfTxs;
    }

    /**
     * Sets the value of the ttlNbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNbOfTxs(BigDecimal value) {
        this.ttlNbOfTxs = value;
    }

    /**
     * Gets the value of the rcncltnRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rcncltnRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcncltnRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReconciliationReport14 }
     * 
     * 
     * @return
     *     The value of the rcncltnRpt property.
     */
    public List<ReconciliationReport14> getRcncltnRpt() {
        if (rcncltnRpt == null) {
            rcncltnRpt = new ArrayList<>();
        }
        return this.rcncltnRpt;
    }

}
