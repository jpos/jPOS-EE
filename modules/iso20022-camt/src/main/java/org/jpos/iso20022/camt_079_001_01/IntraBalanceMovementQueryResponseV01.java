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

package org.jpos.iso20022.camt_079_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraBalanceMovementQueryResponseV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntraBalanceMovementQueryResponseV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}DocumentIdentification51" minOccurs="0"/>
 *         <element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}Pagination1"/>
 *         <element name="RptGnlDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}MovementReport1"/>
 *         <element name="RptOrErr" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}IntraBalanceOrOperationalError7Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalanceMovementQueryResponseV01", propOrder = {
    "id",
    "pgntn",
    "rptGnlDtls",
    "rptOrErr"
})
public class IntraBalanceMovementQueryResponseV01 {

    @XmlElement(name = "Id")
    protected DocumentIdentification51 id;
    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "RptGnlDtls", required = true)
    protected MovementReport1 rptGnlDtls;
    @XmlElement(name = "RptOrErr")
    protected IntraBalanceOrOperationalError7Choice rptOrErr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification51 }
     *     
     */
    public DocumentIdentification51 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification51 }
     *     
     */
    public void setId(DocumentIdentification51 value) {
        this.id = value;
    }

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public void setPgntn(Pagination1 value) {
        this.pgntn = value;
    }

    /**
     * Gets the value of the rptGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link MovementReport1 }
     *     
     */
    public MovementReport1 getRptGnlDtls() {
        return rptGnlDtls;
    }

    /**
     * Sets the value of the rptGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementReport1 }
     *     
     */
    public void setRptGnlDtls(MovementReport1 value) {
        this.rptGnlDtls = value;
    }

    /**
     * Gets the value of the rptOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalanceOrOperationalError7Choice }
     *     
     */
    public IntraBalanceOrOperationalError7Choice getRptOrErr() {
        return rptOrErr;
    }

    /**
     * Sets the value of the rptOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalanceOrOperationalError7Choice }
     *     
     */
    public void setRptOrErr(IntraBalanceOrOperationalError7Choice value) {
        this.rptOrErr = value;
    }

}
