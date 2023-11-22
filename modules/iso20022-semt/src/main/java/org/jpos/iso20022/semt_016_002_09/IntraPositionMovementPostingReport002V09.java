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

package org.jpos.iso20022.semt_016_002_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraPositionMovementPostingReport002V09 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntraPositionMovementPostingReport002V09">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:semt.016.002.09}Pagination1"/>
 *         <element name="StmtGnlDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.016.002.09}Statement81"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:semt.016.002.09}PartyIdentification136Choice" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:semt.016.002.09}SecuritiesAccount30" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:semt.016.002.09}BlockChainAddressWallet7" minOccurs="0"/>
 *         <element name="FinInstrm" type="{urn:iso:std:iso:20022:tech:xsd:semt.016.002.09}FinancialInstrumentDetails44" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraPositionMovementPostingReport002V09", propOrder = {
    "pgntn",
    "stmtGnlDtls",
    "acctOwnr",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "finInstrm"
})
public class IntraPositionMovementPostingReport002V09 {

    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "StmtGnlDtls", required = true)
    protected Statement81 stmtGnlDtls;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification136Choice acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount30 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet7 blckChainAdrOrWllt;
    @XmlElement(name = "FinInstrm")
    protected List<FinancialInstrumentDetails44> finInstrm;

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
     * Gets the value of the stmtGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Statement81 }
     *     
     */
    public Statement81 getStmtGnlDtls() {
        return stmtGnlDtls;
    }

    /**
     * Sets the value of the stmtGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement81 }
     *     
     */
    public void setStmtGnlDtls(Statement81 value) {
        this.stmtGnlDtls = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136Choice }
     *     
     */
    public PartyIdentification136Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136Choice }
     *     
     */
    public void setAcctOwnr(PartyIdentification136Choice value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount30 }
     *     
     */
    public SecuritiesAccount30 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount30 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount30 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet7 }
     *     
     */
    public BlockChainAddressWallet7 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet7 }
     *     
     */
    public void setBlckChainAdrOrWllt(BlockChainAddressWallet7 value) {
        this.blckChainAdrOrWllt = value;
    }

    /**
     * Gets the value of the finInstrm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentDetails44 }
     * 
     * 
     * @return
     *     The value of the finInstrm property.
     */
    public List<FinancialInstrumentDetails44> getFinInstrm() {
        if (finInstrm == null) {
            finInstrm = new ArrayList<>();
        }
        return this.finInstrm;
    }

}
