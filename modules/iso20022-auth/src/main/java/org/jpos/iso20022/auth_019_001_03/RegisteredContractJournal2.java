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

package org.jpos.iso20022.auth_019_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisteredContractJournal2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RegisteredContractJournal2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RegnAgt" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}BranchAndFinancialInstitutionIdentification6"/>
 *         <element name="UnqId" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}DocumentIdentification28" minOccurs="0"/>
 *         <element name="ClsrDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}ISODate"/>
 *         <element name="ClsrRsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}ContractClosureReason1Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisteredContractJournal2", propOrder = {
    "regnAgt",
    "unqId",
    "clsrDt",
    "clsrRsn"
})
public class RegisteredContractJournal2 {

    @XmlElement(name = "RegnAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification6 regnAgt;
    @XmlElement(name = "UnqId")
    protected DocumentIdentification28 unqId;
    @XmlElement(name = "ClsrDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar clsrDt;
    @XmlElement(name = "ClsrRsn", required = true)
    protected ContractClosureReason1Choice clsrRsn;

    /**
     * Gets the value of the regnAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getRegnAgt() {
        return regnAgt;
    }

    /**
     * Sets the value of the regnAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setRegnAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.regnAgt = value;
    }

    /**
     * Gets the value of the unqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification28 }
     *     
     */
    public DocumentIdentification28 getUnqId() {
        return unqId;
    }

    /**
     * Sets the value of the unqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification28 }
     *     
     */
    public void setUnqId(DocumentIdentification28 value) {
        this.unqId = value;
    }

    /**
     * Gets the value of the clsrDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClsrDt() {
        return clsrDt;
    }

    /**
     * Sets the value of the clsrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClsrDt(XMLGregorianCalendar value) {
        this.clsrDt = value;
    }

    /**
     * Gets the value of the clsrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link ContractClosureReason1Choice }
     *     
     */
    public ContractClosureReason1Choice getClsrRsn() {
        return clsrRsn;
    }

    /**
     * Sets the value of the clsrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractClosureReason1Choice }
     *     
     */
    public void setClsrRsn(ContractClosureReason1Choice value) {
        this.clsrRsn = value;
    }

}
