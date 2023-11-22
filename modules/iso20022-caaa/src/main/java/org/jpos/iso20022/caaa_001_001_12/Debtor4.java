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

package org.jpos.iso20022.caaa_001_001_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Debtor4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Debtor4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}PartyIdentification178Choice" minOccurs="0"/>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}CashAccountIdentification7Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Debtor4", propOrder = {
    "dbtr",
    "acctId"
})
public class Debtor4 {

    @XmlElement(name = "Dbtr")
    protected PartyIdentification178Choice dbtr;
    @XmlElement(name = "AcctId")
    protected CashAccountIdentification7Choice acctId;

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public PartyIdentification178Choice getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public void setDbtr(PartyIdentification178Choice value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification7Choice }
     *     
     */
    public CashAccountIdentification7Choice getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification7Choice }
     *     
     */
    public void setAcctId(CashAccountIdentification7Choice value) {
        this.acctId = value;
    }

}
