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

package org.jpos.iso20022.camt_005_001_10;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashAccountEntrySearch7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashAccountEntrySearch7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}AccountIdentificationSearchCriteria2Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NtryAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}ActiveOrHistoricAmountRange2Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NtryAmtCcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}ActiveOrHistoricCurrencyCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}CreditDebitCode" minOccurs="0"/>
 *         <element name="NtrySts" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}EntryStatus1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NtryDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}DateAndDateTimeSearch3Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}PartyIdentification135" minOccurs="0"/>
 *         <element name="AcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccountEntrySearch7", propOrder = {
    "acctId",
    "ntryAmt",
    "ntryAmtCcy",
    "cdtDbtInd",
    "ntrySts",
    "ntryDt",
    "acctOwnr",
    "acctSvcr"
})
public class CashAccountEntrySearch7 {

    @XmlElement(name = "AcctId")
    protected List<AccountIdentificationSearchCriteria2Choice> acctId;
    @XmlElement(name = "NtryAmt")
    protected List<ActiveOrHistoricAmountRange2Choice> ntryAmt;
    @XmlElement(name = "NtryAmtCcy")
    protected List<String> ntryAmtCcy;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "NtrySts")
    @XmlSchemaType(name = "string")
    protected List<EntryStatus1Code> ntrySts;
    @XmlElement(name = "NtryDt")
    protected List<DateAndDateTimeSearch3Choice> ntryDt;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification135 acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected BranchAndFinancialInstitutionIdentification6 acctSvcr;

    /**
     * Gets the value of the acctId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountIdentificationSearchCriteria2Choice }
     * 
     * 
     * @return
     *     The value of the acctId property.
     */
    public List<AccountIdentificationSearchCriteria2Choice> getAcctId() {
        if (acctId == null) {
            acctId = new ArrayList<>();
        }
        return this.acctId;
    }

    /**
     * Gets the value of the ntryAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntryAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtryAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveOrHistoricAmountRange2Choice }
     * 
     * 
     * @return
     *     The value of the ntryAmt property.
     */
    public List<ActiveOrHistoricAmountRange2Choice> getNtryAmt() {
        if (ntryAmt == null) {
            ntryAmt = new ArrayList<>();
        }
        return this.ntryAmt;
    }

    /**
     * Gets the value of the ntryAmtCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntryAmtCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtryAmtCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the ntryAmtCcy property.
     */
    public List<String> getNtryAmtCcy() {
        if (ntryAmtCcy == null) {
            ntryAmtCcy = new ArrayList<>();
        }
        return this.ntryAmtCcy;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public void setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
    }

    /**
     * Gets the value of the ntrySts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntrySts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtrySts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntryStatus1Code }
     * 
     * 
     * @return
     *     The value of the ntrySts property.
     */
    public List<EntryStatus1Code> getNtrySts() {
        if (ntrySts == null) {
            ntrySts = new ArrayList<>();
        }
        return this.ntrySts;
    }

    /**
     * Gets the value of the ntryDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntryDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtryDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateAndDateTimeSearch3Choice }
     * 
     * 
     * @return
     *     The value of the ntryDt property.
     */
    public List<DateAndDateTimeSearch3Choice> getNtryDt() {
        if (ntryDt == null) {
            ntryDt = new ArrayList<>();
        }
        return this.ntryDt;
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

}
