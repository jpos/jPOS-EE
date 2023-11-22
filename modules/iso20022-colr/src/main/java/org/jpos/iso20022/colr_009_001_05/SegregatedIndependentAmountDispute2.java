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

package org.jpos.iso20022.colr_009_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegregatedIndependentAmountDispute2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SegregatedIndependentAmountDispute2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DsptDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.009.001.05}Dispute1"/>
 *         <element name="DsptRsltnTp1Chc" type="{urn:iso:std:iso:20022:tech:xsd:colr.009.001.05}DisputeResolutionType1Choice" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegregatedIndependentAmountDispute2", propOrder = {
    "dsptDtls",
    "dsptRsltnTp1Chc"
})
public class SegregatedIndependentAmountDispute2 {

    @XmlElement(name = "DsptDtls", required = true)
    protected Dispute1 dsptDtls;
    @XmlElement(name = "DsptRsltnTp1Chc")
    protected List<DisputeResolutionType1Choice> dsptRsltnTp1Chc;

    /**
     * Gets the value of the dsptDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Dispute1 }
     *     
     */
    public Dispute1 getDsptDtls() {
        return dsptDtls;
    }

    /**
     * Sets the value of the dsptDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dispute1 }
     *     
     */
    public void setDsptDtls(Dispute1 value) {
        this.dsptDtls = value;
    }

    /**
     * Gets the value of the dsptRsltnTp1Chc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dsptRsltnTp1Chc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsptRsltnTp1Chc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeResolutionType1Choice }
     * 
     * 
     * @return
     *     The value of the dsptRsltnTp1Chc property.
     */
    public List<DisputeResolutionType1Choice> getDsptRsltnTp1Chc() {
        if (dsptRsltnTp1Chc == null) {
            dsptRsltnTp1Chc = new ArrayList<>();
        }
        return this.dsptRsltnTp1Chc;
    }

}
