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

package org.jpos.iso20022.cain_017_001_02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountStatementData2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountStatementData2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StmtDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}ISODate" minOccurs="0"/>
 *         <element name="StmtTm" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}ISOTime" minOccurs="0"/>
 *         <element name="AcctStmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}AccountStatementDetails2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountStatementData2", propOrder = {
    "stmtDt",
    "stmtTm",
    "acctStmt"
})
public class AccountStatementData2 {

    @XmlElement(name = "StmtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stmtDt;
    @XmlElement(name = "StmtTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar stmtTm;
    @XmlElement(name = "AcctStmt")
    protected List<AccountStatementDetails2> acctStmt;

    /**
     * Gets the value of the stmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStmtDt() {
        return stmtDt;
    }

    /**
     * Sets the value of the stmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStmtDt(XMLGregorianCalendar value) {
        this.stmtDt = value;
    }

    /**
     * Gets the value of the stmtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStmtTm() {
        return stmtTm;
    }

    /**
     * Sets the value of the stmtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStmtTm(XMLGregorianCalendar value) {
        this.stmtTm = value;
    }

    /**
     * Gets the value of the acctStmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctStmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctStmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountStatementDetails2 }
     * 
     * 
     * @return
     *     The value of the acctStmt property.
     */
    public List<AccountStatementDetails2> getAcctStmt() {
        if (acctStmt == null) {
            acctStmt = new ArrayList<>();
        }
        return this.acctStmt;
    }

}
