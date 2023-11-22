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

package org.jpos.iso20022.camt_086_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankServicesBillingStatementV04 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BankServicesBillingStatementV04">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptHdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}ReportHeader6"/>
 *         <element name="BllgStmtGrp" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}StatementGroup4" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankServicesBillingStatementV04", propOrder = {
    "rptHdr",
    "bllgStmtGrp"
})
public class BankServicesBillingStatementV04 {

    @XmlElement(name = "RptHdr", required = true)
    protected ReportHeader6 rptHdr;
    @XmlElement(name = "BllgStmtGrp", required = true)
    protected List<StatementGroup4> bllgStmtGrp;

    /**
     * Gets the value of the rptHdr property.
     * 
     * @return
     *     possible object is
     *     {@link ReportHeader6 }
     *     
     */
    public ReportHeader6 getRptHdr() {
        return rptHdr;
    }

    /**
     * Sets the value of the rptHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportHeader6 }
     *     
     */
    public void setRptHdr(ReportHeader6 value) {
        this.rptHdr = value;
    }

    /**
     * Gets the value of the bllgStmtGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bllgStmtGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBllgStmtGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementGroup4 }
     * 
     * 
     * @return
     *     The value of the bllgStmtGrp property.
     */
    public List<StatementGroup4> getBllgStmtGrp() {
        if (bllgStmtGrp == null) {
            bllgStmtGrp = new ArrayList<>();
        }
        return this.bllgStmtGrp;
    }

}
