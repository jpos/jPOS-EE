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

package org.jpos.iso20022.casp_010_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDirectDebit2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardDirectDebit2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DbtrId" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}Debtor4" minOccurs="0"/>
 *         <element name="CdtrId" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}Creditor4"/>
 *         <element name="MndtRltdInf" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}MandateRelatedInformation13"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardDirectDebit2", propOrder = {
    "dbtrId",
    "cdtrId",
    "mndtRltdInf"
})
public class CardDirectDebit2 {

    @XmlElement(name = "DbtrId")
    protected Debtor4 dbtrId;
    @XmlElement(name = "CdtrId", required = true)
    protected Creditor4 cdtrId;
    @XmlElement(name = "MndtRltdInf", required = true)
    protected MandateRelatedInformation13 mndtRltdInf;

    /**
     * Gets the value of the dbtrId property.
     * 
     * @return
     *     possible object is
     *     {@link Debtor4 }
     *     
     */
    public Debtor4 getDbtrId() {
        return dbtrId;
    }

    /**
     * Sets the value of the dbtrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Debtor4 }
     *     
     */
    public void setDbtrId(Debtor4 value) {
        this.dbtrId = value;
    }

    /**
     * Gets the value of the cdtrId property.
     * 
     * @return
     *     possible object is
     *     {@link Creditor4 }
     *     
     */
    public Creditor4 getCdtrId() {
        return cdtrId;
    }

    /**
     * Sets the value of the cdtrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Creditor4 }
     *     
     */
    public void setCdtrId(Creditor4 value) {
        this.cdtrId = value;
    }

    /**
     * Gets the value of the mndtRltdInf property.
     * 
     * @return
     *     possible object is
     *     {@link MandateRelatedInformation13 }
     *     
     */
    public MandateRelatedInformation13 getMndtRltdInf() {
        return mndtRltdInf;
    }

    /**
     * Sets the value of the mndtRltdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateRelatedInformation13 }
     *     
     */
    public void setMndtRltdInf(MandateRelatedInformation13 value) {
        this.mndtRltdInf = value;
    }

}
