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

package org.jpos.iso20022.auth_024_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegulatoryReportingNotification3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RegulatoryReportingNotification3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxNtfctnId" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}Max35Text"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}PartyIdentification135"/>
 *         <element name="AcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}BranchAndFinancialInstitutionIdentification6"/>
 *         <element name="TxCert" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}TransactionCertificate4" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryReportingNotification3", propOrder = {
    "txNtfctnId",
    "acctOwnr",
    "acctSvcr",
    "txCert"
})
public class RegulatoryReportingNotification3 {

    @XmlElement(name = "TxNtfctnId", required = true)
    protected String txNtfctnId;
    @XmlElement(name = "AcctOwnr", required = true)
    protected PartyIdentification135 acctOwnr;
    @XmlElement(name = "AcctSvcr", required = true)
    protected BranchAndFinancialInstitutionIdentification6 acctSvcr;
    @XmlElement(name = "TxCert", required = true)
    protected List<TransactionCertificate4> txCert;

    /**
     * Gets the value of the txNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxNtfctnId() {
        return txNtfctnId;
    }

    /**
     * Sets the value of the txNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxNtfctnId(String value) {
        this.txNtfctnId = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setAcctOwnr(PartyIdentification135 value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setAcctSvcr(BranchAndFinancialInstitutionIdentification6 value) {
        this.acctSvcr = value;
    }

    /**
     * Gets the value of the txCert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txCert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxCert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionCertificate4 }
     * 
     * 
     * @return
     *     The value of the txCert property.
     */
    public List<TransactionCertificate4> getTxCert() {
        if (txCert == null) {
            txCert = new ArrayList<>();
        }
        return this.txCert;
    }

}
