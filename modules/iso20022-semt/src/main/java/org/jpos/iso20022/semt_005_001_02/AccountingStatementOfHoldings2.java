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

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountingStatementOfHoldings2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountingStatementOfHoldings2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StmtGnlDtls" type="{urn:swift:xsd:semt.005.001.02}Statement6" minOccurs="0"/>
 *         <element name="AcctDtls" type="{urn:swift:xsd:semt.005.001.02}SafekeepingAccount2" minOccurs="0"/>
 *         <element name="BalForAcct" type="{urn:swift:xsd:semt.005.001.02}AggregateBalanceInformation3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SubAcctDtls" type="{urn:swift:xsd:semt.005.001.02}SubAccountIdentification3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TtlVals" type="{urn:swift:xsd:semt.005.001.02}TotalValueInPageAndStatement" minOccurs="0"/>
 *         <element name="Xtnsn" type="{urn:swift:xsd:semt.005.001.02}Extension1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingStatementOfHoldings2", propOrder = {
    "stmtGnlDtls",
    "acctDtls",
    "balForAcct",
    "subAcctDtls",
    "ttlVals",
    "xtnsn"
})
public class AccountingStatementOfHoldings2 {

    @XmlElement(name = "StmtGnlDtls")
    protected Statement6 stmtGnlDtls;
    @XmlElement(name = "AcctDtls")
    protected SafekeepingAccount2 acctDtls;
    @XmlElement(name = "BalForAcct")
    protected List<AggregateBalanceInformation3> balForAcct;
    @XmlElement(name = "SubAcctDtls")
    protected List<SubAccountIdentification3> subAcctDtls;
    @XmlElement(name = "TtlVals")
    protected TotalValueInPageAndStatement ttlVals;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the stmtGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Statement6 }
     *     
     */
    public Statement6 getStmtGnlDtls() {
        return stmtGnlDtls;
    }

    /**
     * Sets the value of the stmtGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement6 }
     *     
     */
    public void setStmtGnlDtls(Statement6 value) {
        this.stmtGnlDtls = value;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingAccount2 }
     *     
     */
    public SafekeepingAccount2 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingAccount2 }
     *     
     */
    public void setAcctDtls(SafekeepingAccount2 value) {
        this.acctDtls = value;
    }

    /**
     * Gets the value of the balForAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balForAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalForAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregateBalanceInformation3 }
     * 
     * 
     * @return
     *     The value of the balForAcct property.
     */
    public List<AggregateBalanceInformation3> getBalForAcct() {
        if (balForAcct == null) {
            balForAcct = new ArrayList<>();
        }
        return this.balForAcct;
    }

    /**
     * Gets the value of the subAcctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the subAcctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubAcctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubAccountIdentification3 }
     * 
     * 
     * @return
     *     The value of the subAcctDtls property.
     */
    public List<SubAccountIdentification3> getSubAcctDtls() {
        if (subAcctDtls == null) {
            subAcctDtls = new ArrayList<>();
        }
        return this.subAcctDtls;
    }

    /**
     * Gets the value of the ttlVals property.
     * 
     * @return
     *     possible object is
     *     {@link TotalValueInPageAndStatement }
     *     
     */
    public TotalValueInPageAndStatement getTtlVals() {
        return ttlVals;
    }

    /**
     * Sets the value of the ttlVals property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalValueInPageAndStatement }
     *     
     */
    public void setTtlVals(TotalValueInPageAndStatement value) {
        this.ttlVals = value;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<>();
        }
        return this.xtnsn;
    }

}
