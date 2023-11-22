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

package org.jpos.iso20022.semt_007_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementOfInvestmentFundTransactions3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatementOfInvestmentFundTransactions3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StmtGnlDtls" type="{urn:swift:xsd:semt.007.001.03}Statement8" minOccurs="0"/>
 *         <element name="InvstmtAcctDtls" type="{urn:swift:xsd:semt.007.001.03}InvestmentAccount43" minOccurs="0"/>
 *         <element name="TxOnAcct" type="{urn:swift:xsd:semt.007.001.03}InvestmentFundTransactionsByFund3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SubAcctDtls" type="{urn:swift:xsd:semt.007.001.03}SubAccountIdentification36" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Xtnsn" type="{urn:swift:xsd:semt.007.001.03}Extension1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementOfInvestmentFundTransactions3", propOrder = {
    "stmtGnlDtls",
    "invstmtAcctDtls",
    "txOnAcct",
    "subAcctDtls",
    "xtnsn"
})
public class StatementOfInvestmentFundTransactions3 {

    @XmlElement(name = "StmtGnlDtls")
    protected Statement8 stmtGnlDtls;
    @XmlElement(name = "InvstmtAcctDtls")
    protected InvestmentAccount43 invstmtAcctDtls;
    @XmlElement(name = "TxOnAcct")
    protected List<InvestmentFundTransactionsByFund3> txOnAcct;
    @XmlElement(name = "SubAcctDtls")
    protected List<SubAccountIdentification36> subAcctDtls;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the stmtGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Statement8 }
     *     
     */
    public Statement8 getStmtGnlDtls() {
        return stmtGnlDtls;
    }

    /**
     * Sets the value of the stmtGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement8 }
     *     
     */
    public void setStmtGnlDtls(Statement8 value) {
        this.stmtGnlDtls = value;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount43 }
     *     
     */
    public InvestmentAccount43 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount43 }
     *     
     */
    public void setInvstmtAcctDtls(InvestmentAccount43 value) {
        this.invstmtAcctDtls = value;
    }

    /**
     * Gets the value of the txOnAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txOnAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxOnAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentFundTransactionsByFund3 }
     * 
     * 
     * @return
     *     The value of the txOnAcct property.
     */
    public List<InvestmentFundTransactionsByFund3> getTxOnAcct() {
        if (txOnAcct == null) {
            txOnAcct = new ArrayList<>();
        }
        return this.txOnAcct;
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
     * {@link SubAccountIdentification36 }
     * 
     * 
     * @return
     *     The value of the subAcctDtls property.
     */
    public List<SubAccountIdentification36> getSubAcctDtls() {
        if (subAcctDtls == null) {
            subAcctDtls = new ArrayList<>();
        }
        return this.subAcctDtls;
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
