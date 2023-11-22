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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompareOtherPayment1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CompareOtherPayment1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OthrPmtTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareOtherPaymentType1" minOccurs="0"/>
 *         <element name="OthrPmtAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareAmountAndDirection3" minOccurs="0"/>
 *         <element name="OthrPmtDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDate3" minOccurs="0"/>
 *         <element name="OthrPmtPyer" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareOrganisationIdentification7" minOccurs="0"/>
 *         <element name="OthrPmtRcvr" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareOrganisationIdentification7" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompareOtherPayment1", propOrder = {
    "othrPmtTp",
    "othrPmtAmt",
    "othrPmtDt",
    "othrPmtPyer",
    "othrPmtRcvr"
})
public class CompareOtherPayment1 {

    @XmlElement(name = "OthrPmtTp")
    protected CompareOtherPaymentType1 othrPmtTp;
    @XmlElement(name = "OthrPmtAmt")
    protected CompareAmountAndDirection3 othrPmtAmt;
    @XmlElement(name = "OthrPmtDt")
    protected CompareDate3 othrPmtDt;
    @XmlElement(name = "OthrPmtPyer")
    protected CompareOrganisationIdentification7 othrPmtPyer;
    @XmlElement(name = "OthrPmtRcvr")
    protected CompareOrganisationIdentification7 othrPmtRcvr;

    /**
     * Gets the value of the othrPmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareOtherPaymentType1 }
     *     
     */
    public CompareOtherPaymentType1 getOthrPmtTp() {
        return othrPmtTp;
    }

    /**
     * Sets the value of the othrPmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareOtherPaymentType1 }
     *     
     */
    public void setOthrPmtTp(CompareOtherPaymentType1 value) {
        this.othrPmtTp = value;
    }

    /**
     * Gets the value of the othrPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAmountAndDirection3 }
     *     
     */
    public CompareAmountAndDirection3 getOthrPmtAmt() {
        return othrPmtAmt;
    }

    /**
     * Sets the value of the othrPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAmountAndDirection3 }
     *     
     */
    public void setOthrPmtAmt(CompareAmountAndDirection3 value) {
        this.othrPmtAmt = value;
    }

    /**
     * Gets the value of the othrPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getOthrPmtDt() {
        return othrPmtDt;
    }

    /**
     * Sets the value of the othrPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public void setOthrPmtDt(CompareDate3 value) {
        this.othrPmtDt = value;
    }

    /**
     * Gets the value of the othrPmtPyer property.
     * 
     * @return
     *     possible object is
     *     {@link CompareOrganisationIdentification7 }
     *     
     */
    public CompareOrganisationIdentification7 getOthrPmtPyer() {
        return othrPmtPyer;
    }

    /**
     * Sets the value of the othrPmtPyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareOrganisationIdentification7 }
     *     
     */
    public void setOthrPmtPyer(CompareOrganisationIdentification7 value) {
        this.othrPmtPyer = value;
    }

    /**
     * Gets the value of the othrPmtRcvr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareOrganisationIdentification7 }
     *     
     */
    public CompareOrganisationIdentification7 getOthrPmtRcvr() {
        return othrPmtRcvr;
    }

    /**
     * Sets the value of the othrPmtRcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareOrganisationIdentification7 }
     *     
     */
    public void setOthrPmtRcvr(CompareOrganisationIdentification7 value) {
        this.othrPmtRcvr = value;
    }

}
