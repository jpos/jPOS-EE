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

package org.jpos.iso20022.camt_006_001_10;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashEntry2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashEntry2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}EntryStatus1Code" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}Max35Text" minOccurs="0"/>
 *         <element name="StmtId" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}Max35Text" minOccurs="0"/>
 *         <element name="AcctSvcrRef" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}Number" minOccurs="0"/>
 *         <element name="AddtlNtryInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}Max140Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashEntry2", propOrder = {
    "amt",
    "dt",
    "sts",
    "id",
    "stmtId",
    "acctSvcrRef",
    "addtlNtryInf"
})
public class CashEntry2 {

    @XmlElement(name = "Amt")
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "Dt")
    protected DateAndDateTime2Choice dt;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected EntryStatus1Code sts;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "StmtId")
    protected String stmtId;
    @XmlElement(name = "AcctSvcrRef")
    protected BigDecimal acctSvcrRef;
    @XmlElement(name = "AddtlNtryInf")
    protected List<String> addtlNtryInf;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setDt(DateAndDateTime2Choice value) {
        this.dt = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link EntryStatus1Code }
     *     
     */
    public EntryStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryStatus1Code }
     *     
     */
    public void setSts(EntryStatus1Code value) {
        this.sts = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the stmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtId() {
        return stmtId;
    }

    /**
     * Sets the value of the stmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtId(String value) {
        this.stmtId = value;
    }

    /**
     * Gets the value of the acctSvcrRef property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcctSvcrRef() {
        return acctSvcrRef;
    }

    /**
     * Sets the value of the acctSvcrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcctSvcrRef(BigDecimal value) {
        this.acctSvcrRef = value;
    }

    /**
     * Gets the value of the addtlNtryInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlNtryInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlNtryInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlNtryInf property.
     */
    public List<String> getAddtlNtryInf() {
        if (addtlNtryInf == null) {
            addtlNtryInf = new ArrayList<>();
        }
        return this.addtlNtryInf;
    }

}
