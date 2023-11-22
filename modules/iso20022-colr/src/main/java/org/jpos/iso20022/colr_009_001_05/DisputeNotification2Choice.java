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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeNotification2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DisputeNotification2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="DsptNtfctnDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.009.001.05}DisputeNotification2"/>
 *         <element name="SgrtdIndpdntAmtDsptDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.009.001.05}SegregatedIndependentAmountDispute2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeNotification2Choice", propOrder = {
    "dsptNtfctnDtls",
    "sgrtdIndpdntAmtDsptDtls"
})
public class DisputeNotification2Choice {

    @XmlElement(name = "DsptNtfctnDtls")
    protected DisputeNotification2 dsptNtfctnDtls;
    @XmlElement(name = "SgrtdIndpdntAmtDsptDtls")
    protected SegregatedIndependentAmountDispute2 sgrtdIndpdntAmtDsptDtls;

    /**
     * Gets the value of the dsptNtfctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeNotification2 }
     *     
     */
    public DisputeNotification2 getDsptNtfctnDtls() {
        return dsptNtfctnDtls;
    }

    /**
     * Sets the value of the dsptNtfctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeNotification2 }
     *     
     */
    public void setDsptNtfctnDtls(DisputeNotification2 value) {
        this.dsptNtfctnDtls = value;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmtDsptDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SegregatedIndependentAmountDispute2 }
     *     
     */
    public SegregatedIndependentAmountDispute2 getSgrtdIndpdntAmtDsptDtls() {
        return sgrtdIndpdntAmtDsptDtls;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmtDsptDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegregatedIndependentAmountDispute2 }
     *     
     */
    public void setSgrtdIndpdntAmtDsptDtls(SegregatedIndependentAmountDispute2 value) {
        this.sgrtdIndpdntAmtDsptDtls = value;
    }

}
