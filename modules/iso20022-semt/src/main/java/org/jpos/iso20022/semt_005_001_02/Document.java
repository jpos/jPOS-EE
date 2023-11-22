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

package org.jpos.iso20022.semt_005_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Document">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctgStmtOfHldgsCxlV02" type="{urn:swift:xsd:semt.005.001.02}AccountingStatementOfHoldingsCancellationV02"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctgStmtOfHldgsCxlV02"
})
public class Document {

    @XmlElement(name = "AcctgStmtOfHldgsCxlV02", required = true)
    protected AccountingStatementOfHoldingsCancellationV02 acctgStmtOfHldgsCxlV02;

    /**
     * Gets the value of the acctgStmtOfHldgsCxlV02 property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingStatementOfHoldingsCancellationV02 }
     *     
     */
    public AccountingStatementOfHoldingsCancellationV02 getAcctgStmtOfHldgsCxlV02() {
        return acctgStmtOfHldgsCxlV02;
    }

    /**
     * Sets the value of the acctgStmtOfHldgsCxlV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingStatementOfHoldingsCancellationV02 }
     *     
     */
    public void setAcctgStmtOfHldgsCxlV02(AccountingStatementOfHoldingsCancellationV02 value) {
        this.acctgStmtOfHldgsCxlV02 = value;
    }

}
