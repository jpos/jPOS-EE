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

package org.jpos.iso20022.auth_084_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailedReportStatistics5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DetailedReportStatistics5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlNbOfRpts" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}Max15NumericText"/>
 *         <element name="TtlNbOfRptsAccptd" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}Max15NumericText"/>
 *         <element name="TtlNbOfRptsRjctd" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}Max15NumericText"/>
 *         <element name="NbOfRptsRjctdPerErr" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}NumberOfTransactionsPerValidationRule5" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedReportStatistics5", propOrder = {
    "ttlNbOfRpts",
    "ttlNbOfRptsAccptd",
    "ttlNbOfRptsRjctd",
    "nbOfRptsRjctdPerErr"
})
public class DetailedReportStatistics5 {

    @XmlElement(name = "TtlNbOfRpts", required = true)
    protected String ttlNbOfRpts;
    @XmlElement(name = "TtlNbOfRptsAccptd", required = true)
    protected String ttlNbOfRptsAccptd;
    @XmlElement(name = "TtlNbOfRptsRjctd", required = true)
    protected String ttlNbOfRptsRjctd;
    @XmlElement(name = "NbOfRptsRjctdPerErr")
    protected List<NumberOfTransactionsPerValidationRule5> nbOfRptsRjctdPerErr;

    /**
     * Gets the value of the ttlNbOfRpts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfRpts() {
        return ttlNbOfRpts;
    }

    /**
     * Sets the value of the ttlNbOfRpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlNbOfRpts(String value) {
        this.ttlNbOfRpts = value;
    }

    /**
     * Gets the value of the ttlNbOfRptsAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfRptsAccptd() {
        return ttlNbOfRptsAccptd;
    }

    /**
     * Sets the value of the ttlNbOfRptsAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlNbOfRptsAccptd(String value) {
        this.ttlNbOfRptsAccptd = value;
    }

    /**
     * Gets the value of the ttlNbOfRptsRjctd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfRptsRjctd() {
        return ttlNbOfRptsRjctd;
    }

    /**
     * Sets the value of the ttlNbOfRptsRjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlNbOfRptsRjctd(String value) {
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
     * {@link NumberOfTransactionsPerValidationRule5 }
     * 
     * 
     * @return
     *     The value of the nbOfRptsRjctdPerErr property.
     */
    public List<NumberOfTransactionsPerValidationRule5> getNbOfRptsRjctdPerErr() {
        if (nbOfRptsRjctdPerErr == null) {
            nbOfRptsRjctdPerErr = new ArrayList<>();
        }
        return this.nbOfRptsRjctdPerErr;
    }

}
