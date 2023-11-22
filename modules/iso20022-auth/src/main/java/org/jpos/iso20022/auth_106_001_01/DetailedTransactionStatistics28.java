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

package org.jpos.iso20022.auth_106_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailedTransactionStatistics28 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DetailedTransactionStatistics28">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NbOfDerivsRptd" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}Number"/>
 *         <element name="NbOfDerivsRptdWthOtlrs" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}Number"/>
 *         <element name="Wrnngs" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}AbnormalValuesData4" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedTransactionStatistics28", propOrder = {
    "nbOfDerivsRptd",
    "nbOfDerivsRptdWthOtlrs",
    "wrnngs"
})
public class DetailedTransactionStatistics28 {

    @XmlElement(name = "NbOfDerivsRptd", required = true)
    protected BigDecimal nbOfDerivsRptd;
    @XmlElement(name = "NbOfDerivsRptdWthOtlrs", required = true)
    protected BigDecimal nbOfDerivsRptdWthOtlrs;
    @XmlElement(name = "Wrnngs", required = true)
    protected List<AbnormalValuesData4> wrnngs;

    /**
     * Gets the value of the nbOfDerivsRptd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDerivsRptd() {
        return nbOfDerivsRptd;
    }

    /**
     * Sets the value of the nbOfDerivsRptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfDerivsRptd(BigDecimal value) {
        this.nbOfDerivsRptd = value;
    }

    /**
     * Gets the value of the nbOfDerivsRptdWthOtlrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDerivsRptdWthOtlrs() {
        return nbOfDerivsRptdWthOtlrs;
    }

    /**
     * Sets the value of the nbOfDerivsRptdWthOtlrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfDerivsRptdWthOtlrs(BigDecimal value) {
        this.nbOfDerivsRptdWthOtlrs = value;
    }

    /**
     * Gets the value of the wrnngs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the wrnngs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWrnngs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbnormalValuesData4 }
     * 
     * 
     * @return
     *     The value of the wrnngs property.
     */
    public List<AbnormalValuesData4> getWrnngs() {
        if (wrnngs == null) {
            wrnngs = new ArrayList<>();
        }
        return this.wrnngs;
    }

}
