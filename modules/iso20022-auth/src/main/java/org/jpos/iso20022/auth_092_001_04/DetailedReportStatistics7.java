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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailedReportStatistics7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DetailedReportStatistics7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlNbOfRpts" type="{urn:iso:std:iso:20022:tech:xsd:auth.092.001.04}Max20PositiveNumber"/>
 *         <element name="TtlNbOfRptsAccptd" type="{urn:iso:std:iso:20022:tech:xsd:auth.092.001.04}Max20PositiveNumber"/>
 *         <element name="TtlNbOfRptsRjctd" type="{urn:iso:std:iso:20022:tech:xsd:auth.092.001.04}Max20PositiveNumber"/>
 *         <element name="NbOfRptsRjctdPerErr" type="{urn:iso:std:iso:20022:tech:xsd:auth.092.001.04}NumberOfTransactionsPerValidationRule6" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedReportStatistics7", propOrder = {
    "ttlNbOfRpts",
    "ttlNbOfRptsAccptd",
    "ttlNbOfRptsRjctd",
    "nbOfRptsRjctdPerErr"
})
public class DetailedReportStatistics7 {

    @XmlElement(name = "TtlNbOfRpts", required = true)
    protected BigDecimal ttlNbOfRpts;
    @XmlElement(name = "TtlNbOfRptsAccptd", required = true)
    protected BigDecimal ttlNbOfRptsAccptd;
    @XmlElement(name = "TtlNbOfRptsRjctd", required = true)
    protected BigDecimal ttlNbOfRptsRjctd;
    @XmlElement(name = "NbOfRptsRjctdPerErr")
    protected List<NumberOfTransactionsPerValidationRule6> nbOfRptsRjctdPerErr;

    /**
     * Gets the value of the ttlNbOfRpts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfRpts() {
        return ttlNbOfRpts;
    }

    /**
     * Sets the value of the ttlNbOfRpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNbOfRpts(BigDecimal value) {
        this.ttlNbOfRpts = value;
    }

    /**
     * Gets the value of the ttlNbOfRptsAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfRptsAccptd() {
        return ttlNbOfRptsAccptd;
    }

    /**
     * Sets the value of the ttlNbOfRptsAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNbOfRptsAccptd(BigDecimal value) {
        this.ttlNbOfRptsAccptd = value;
    }

    /**
     * Gets the value of the ttlNbOfRptsRjctd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfRptsRjctd() {
        return ttlNbOfRptsRjctd;
    }

    /**
     * Sets the value of the ttlNbOfRptsRjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNbOfRptsRjctd(BigDecimal value) {
        this.ttlNbOfRptsRjctd = value;
    }

    /**
     * Gets the value of the nbOfRptsRjctdPerErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nbOfRptsRjctdPerErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNbOfRptsRjctdPerErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfTransactionsPerValidationRule6 }
     * 
     * 
     * @return
     *     The value of the nbOfRptsRjctdPerErr property.
     */
    public List<NumberOfTransactionsPerValidationRule6> getNbOfRptsRjctdPerErr() {
        if (nbOfRptsRjctdPerErr == null) {
            nbOfRptsRjctdPerErr = new ArrayList<>();
        }
        return this.nbOfRptsRjctdPerErr;
    }

}
