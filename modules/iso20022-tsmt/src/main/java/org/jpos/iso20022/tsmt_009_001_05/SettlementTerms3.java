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

package org.jpos.iso20022.tsmt_009_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementTerms3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementTerms3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}FinancialInstitutionIdentification4Choice" minOccurs="0"/>
 *         <element name="CdtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}CashAccount24"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementTerms3", propOrder = {
    "cdtrAgt",
    "cdtrAcct"
})
public class SettlementTerms3 {

    @XmlElement(name = "CdtrAgt")
    protected FinancialInstitutionIdentification4Choice cdtrAgt;
    @XmlElement(name = "CdtrAcct", required = true)
    protected CashAccount24 cdtrAcct;

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification4Choice }
     *     
     */
    public FinancialInstitutionIdentification4Choice getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification4Choice }
     *     
     */
    public void setCdtrAgt(FinancialInstitutionIdentification4Choice value) {
        this.cdtrAgt = value;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public void setCdtrAcct(CashAccount24 value) {
        this.cdtrAcct = value;
    }

}
