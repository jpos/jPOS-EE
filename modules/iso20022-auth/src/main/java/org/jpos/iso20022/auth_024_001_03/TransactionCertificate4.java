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
 * <p>Java class for TransactionCertificate4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionCertificate4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}Max35Text"/>
 *         <element name="Cert" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}DocumentIdentification28"/>
 *         <element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}CashAccount40" minOccurs="0"/>
 *         <element name="BkAcctDmcltnCtry" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}CountryCode" minOccurs="0"/>
 *         <element name="Amdmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}DocumentAmendment1" minOccurs="0"/>
 *         <element name="CertRcrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}TransactionCertificateRecord2" maxOccurs="unbounded"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionCertificate4", propOrder = {
    "txId",
    "cert",
    "acct",
    "bkAcctDmcltnCtry",
    "amdmnt",
    "certRcrd",
    "splmtryData"
})
public class TransactionCertificate4 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "Cert", required = true)
    protected DocumentIdentification28 cert;
    @XmlElement(name = "Acct")
    protected CashAccount40 acct;
    @XmlElement(name = "BkAcctDmcltnCtry")
    protected String bkAcctDmcltnCtry;
    @XmlElement(name = "Amdmnt")
    protected DocumentAmendment1 amdmnt;
    @XmlElement(name = "CertRcrd", required = true)
    protected List<TransactionCertificateRecord2> certRcrd;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
    }

    /**
     * Gets the value of the cert property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification28 }
     *     
     */
    public DocumentIdentification28 getCert() {
        return cert;
    }

    /**
     * Sets the value of the cert property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification28 }
     *     
     */
    public void setCert(DocumentIdentification28 value) {
        this.cert = value;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setAcct(CashAccount40 value) {
        this.acct = value;
    }

    /**
     * Gets the value of the bkAcctDmcltnCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkAcctDmcltnCtry() {
        return bkAcctDmcltnCtry;
    }

    /**
     * Sets the value of the bkAcctDmcltnCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBkAcctDmcltnCtry(String value) {
        this.bkAcctDmcltnCtry = value;
    }

    /**
     * Gets the value of the amdmnt property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentAmendment1 }
     *     
     */
    public DocumentAmendment1 getAmdmnt() {
        return amdmnt;
    }

    /**
     * Sets the value of the amdmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentAmendment1 }
     *     
     */
    public void setAmdmnt(DocumentAmendment1 value) {
        this.amdmnt = value;
    }

    /**
     * Gets the value of the certRcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the certRcrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertRcrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionCertificateRecord2 }
     * 
     * 
     * @return
     *     The value of the certRcrd property.
     */
    public List<TransactionCertificateRecord2> getCertRcrd() {
        if (certRcrd == null) {
            certRcrd = new ArrayList<>();
        }
        return this.certRcrd;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
