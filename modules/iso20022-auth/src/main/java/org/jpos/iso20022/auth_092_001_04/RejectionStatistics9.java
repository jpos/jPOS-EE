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

package org.jpos.iso20022.auth_092_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionStatistics9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RejectionStatistics9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrPtyId" type="{urn:iso:std:iso:20022:tech:xsd:auth.092.001.04}CounterpartyData92"/>
 *         <element name="RptSttstcs" type="{urn:iso:std:iso:20022:tech:xsd:auth.092.001.04}DetailedReportStatistics7"/>
 *         <element name="DerivSttstcs" type="{urn:iso:std:iso:20022:tech:xsd:auth.092.001.04}DetailedTransactionStatistics7Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectionStatistics9", propOrder = {
    "ctrPtyId",
    "rptSttstcs",
    "derivSttstcs"
})
public class RejectionStatistics9 {

    @XmlElement(name = "CtrPtyId", required = true)
    protected CounterpartyData92 ctrPtyId;
    @XmlElement(name = "RptSttstcs", required = true)
    protected DetailedReportStatistics7 rptSttstcs;
    @XmlElement(name = "DerivSttstcs", required = true)
    protected DetailedTransactionStatistics7Choice derivSttstcs;

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyData92 }
     *     
     */
    public CounterpartyData92 getCtrPtyId() {
        return ctrPtyId;
    }

    /**
     * Sets the value of the ctrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyData92 }
     *     
     */
    public void setCtrPtyId(CounterpartyData92 value) {
        this.ctrPtyId = value;
    }

    /**
     * Gets the value of the rptSttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedReportStatistics7 }
     *     
     */
    public DetailedReportStatistics7 getRptSttstcs() {
        return rptSttstcs;
    }

    /**
     * Sets the value of the rptSttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedReportStatistics7 }
     *     
     */
    public void setRptSttstcs(DetailedReportStatistics7 value) {
        this.rptSttstcs = value;
    }

    /**
     * Gets the value of the derivSttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedTransactionStatistics7Choice }
     *     
     */
    public DetailedTransactionStatistics7Choice getDerivSttstcs() {
        return derivSttstcs;
    }

    /**
     * Sets the value of the derivSttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedTransactionStatistics7Choice }
     *     
     */
    public void setDerivSttstcs(DetailedTransactionStatistics7Choice value) {
        this.derivSttstcs = value;
    }

}
