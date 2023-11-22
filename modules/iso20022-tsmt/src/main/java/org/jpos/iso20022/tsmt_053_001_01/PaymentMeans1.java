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

package org.jpos.iso20022.tsmt_053_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMeans1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentMeans1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtTp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.053.001.01}PaymentTypeInformation19"/>
 *         <element name="PmtMtdCd" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.053.001.01}PaymentMethod4Code"/>
 *         <element name="PyeeCdtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.053.001.01}CashAccount16"/>
 *         <element name="PyeeFI" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.053.001.01}BranchAndFinancialInstitutionIdentification4"/>
 *         <element name="PyerDbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.053.001.01}CashAccount16" minOccurs="0"/>
 *         <element name="PyerFI" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.053.001.01}BranchAndFinancialInstitutionIdentification4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMeans1", propOrder = {
    "pmtTp",
    "pmtMtdCd",
    "pyeeCdtrAcct",
    "pyeeFI",
    "pyerDbtrAcct",
    "pyerFI"
})
public class PaymentMeans1 {

    @XmlElement(name = "PmtTp", required = true)
    protected PaymentTypeInformation19 pmtTp;
    @XmlElement(name = "PmtMtdCd", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentMethod4Code pmtMtdCd;
    @XmlElement(name = "PyeeCdtrAcct", required = true)
    protected CashAccount16 pyeeCdtrAcct;
    @XmlElement(name = "PyeeFI", required = true)
    protected BranchAndFinancialInstitutionIdentification4 pyeeFI;
    @XmlElement(name = "PyerDbtrAcct")
    protected CashAccount16 pyerDbtrAcct;
    @XmlElement(name = "PyerFI")
    protected BranchAndFinancialInstitutionIdentification4 pyerFI;

    /**
     * Gets the value of the pmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeInformation19 }
     *     
     */
    public PaymentTypeInformation19 getPmtTp() {
        return pmtTp;
    }

    /**
     * Sets the value of the pmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeInformation19 }
     *     
     */
    public void setPmtTp(PaymentTypeInformation19 value) {
        this.pmtTp = value;
    }

    /**
     * Gets the value of the pmtMtdCd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod4Code }
     *     
     */
    public PaymentMethod4Code getPmtMtdCd() {
        return pmtMtdCd;
    }

    /**
     * Sets the value of the pmtMtdCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod4Code }
     *     
     */
    public void setPmtMtdCd(PaymentMethod4Code value) {
        this.pmtMtdCd = value;
    }

    /**
     * Gets the value of the pyeeCdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount16 }
     *     
     */
    public CashAccount16 getPyeeCdtrAcct() {
        return pyeeCdtrAcct;
    }

    /**
     * Sets the value of the pyeeCdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount16 }
     *     
     */
    public void setPyeeCdtrAcct(CashAccount16 value) {
        this.pyeeCdtrAcct = value;
    }

    /**
     * Gets the value of the pyeeFI property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification4 getPyeeFI() {
        return pyeeFI;
    }

    /**
     * Sets the value of the pyeeFI property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public void setPyeeFI(BranchAndFinancialInstitutionIdentification4 value) {
        this.pyeeFI = value;
    }

    /**
     * Gets the value of the pyerDbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount16 }
     *     
     */
    public CashAccount16 getPyerDbtrAcct() {
        return pyerDbtrAcct;
    }

    /**
     * Sets the value of the pyerDbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount16 }
     *     
     */
    public void setPyerDbtrAcct(CashAccount16 value) {
        this.pyerDbtrAcct = value;
    }

    /**
     * Gets the value of the pyerFI property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification4 getPyerFI() {
        return pyerFI;
    }

    /**
     * Sets the value of the pyerFI property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public void setPyerFI(BranchAndFinancialInstitutionIdentification4 value) {
        this.pyerFI = value;
    }

}
