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

package org.jpos.iso20022.seev_036_002_14;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionMovementConfirmation002V14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionMovementConfirmation002V14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}Pagination1" minOccurs="0"/>
 *         <element name="NtfctnId" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}DocumentIdentification37" minOccurs="0"/>
 *         <element name="MvmntPrlimryAdvcId" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}DocumentIdentification37" minOccurs="0"/>
 *         <element name="InstrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}DocumentIdentification17" minOccurs="0"/>
 *         <element name="OthrDocId" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}DocumentIdentification38" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="EvtsLkg" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CorporateActionEventReference4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}TransactionIdentification1" minOccurs="0"/>
 *         <element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CorporateActionGeneralInformation167"/>
 *         <element name="AcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}AccountAndBalance52"/>
 *         <element name="CorpActnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CorporateAction75" minOccurs="0"/>
 *         <element name="CorpActnConfDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CorporateActionOption213"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CorporateActionNarrative35" minOccurs="0"/>
 *         <element name="IssrAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PartyIdentification137Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PngAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PartyIdentification137Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SubPngAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PartyIdentification137Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionMovementConfirmation002V14", propOrder = {
    "pgntn",
    "ntfctnId",
    "mvmntPrlimryAdvcId",
    "instrId",
    "othrDocId",
    "evtsLkg",
    "txId",
    "corpActnGnlInf",
    "acctDtls",
    "corpActnDtls",
    "corpActnConfDtls",
    "addtlInf",
    "issrAgt",
    "pngAgt",
    "subPngAgt",
    "splmtryData"
})
public class CorporateActionMovementConfirmation002V14 {

    @XmlElement(name = "Pgntn")
    protected Pagination1 pgntn;
    @XmlElement(name = "NtfctnId")
    protected DocumentIdentification37 ntfctnId;
    @XmlElement(name = "MvmntPrlimryAdvcId")
    protected DocumentIdentification37 mvmntPrlimryAdvcId;
    @XmlElement(name = "InstrId")
    protected DocumentIdentification17 instrId;
    @XmlElement(name = "OthrDocId")
    protected List<DocumentIdentification38> othrDocId;
    @XmlElement(name = "EvtsLkg")
    protected List<CorporateActionEventReference4> evtsLkg;
    @XmlElement(name = "TxId")
    protected TransactionIdentification1 txId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation167 corpActnGnlInf;
    @XmlElement(name = "AcctDtls", required = true)
    protected AccountAndBalance52 acctDtls;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateAction75 corpActnDtls;
    @XmlElement(name = "CorpActnConfDtls", required = true)
    protected CorporateActionOption213 corpActnConfDtls;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative35 addtlInf;
    @XmlElement(name = "IssrAgt")
    protected List<PartyIdentification137Choice> issrAgt;
    @XmlElement(name = "PngAgt")
    protected List<PartyIdentification137Choice> pngAgt;
    @XmlElement(name = "SubPngAgt")
    protected List<PartyIdentification137Choice> subPngAgt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

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
     * Gets the value of the ntfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification37 }
     *     
     */
    public DocumentIdentification37 getNtfctnId() {
        return ntfctnId;
    }

    /**
     * Sets the value of the ntfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification37 }
     *     
     */
    public void setNtfctnId(DocumentIdentification37 value) {
        this.ntfctnId = value;
    }

    /**
     * Gets the value of the mvmntPrlimryAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification37 }
     *     
     */
    public DocumentIdentification37 getMvmntPrlimryAdvcId() {
        return mvmntPrlimryAdvcId;
    }

    /**
     * Sets the value of the mvmntPrlimryAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification37 }
     *     
     */
    public void setMvmntPrlimryAdvcId(DocumentIdentification37 value) {
        this.mvmntPrlimryAdvcId = value;
    }

    /**
     * Gets the value of the instrId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification17 }
     *     
     */
    public DocumentIdentification17 getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification17 }
     *     
     */
    public void setInstrId(DocumentIdentification17 value) {
        this.instrId = value;
    }

    /**
     * Gets the value of the othrDocId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrDocId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrDocId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIdentification38 }
     * 
     * 
     * @return
     *     The value of the othrDocId property.
     */
    public List<DocumentIdentification38> getOthrDocId() {
        if (othrDocId == null) {
            othrDocId = new ArrayList<>();
        }
        return this.othrDocId;
    }

    /**
     * Gets the value of the evtsLkg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the evtsLkg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtsLkg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionEventReference4 }
     * 
     * 
     * @return
     *     The value of the evtsLkg property.
     */
    public List<CorporateActionEventReference4> getEvtsLkg() {
        if (evtsLkg == null) {
            evtsLkg = new ArrayList<>();
        }
        return this.evtsLkg;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentification1 }
     *     
     */
    public TransactionIdentification1 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification1 }
     *     
     */
    public void setTxId(TransactionIdentification1 value) {
        this.txId = value;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation167 }
     *     
     */
    public CorporateActionGeneralInformation167 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation167 }
     *     
     */
    public void setCorpActnGnlInf(CorporateActionGeneralInformation167 value) {
        this.corpActnGnlInf = value;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountAndBalance52 }
     *     
     */
    public AccountAndBalance52 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountAndBalance52 }
     *     
     */
    public void setAcctDtls(AccountAndBalance52 value) {
        this.acctDtls = value;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction75 }
     *     
     */
    public CorporateAction75 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction75 }
     *     
     */
    public void setCorpActnDtls(CorporateAction75 value) {
        this.corpActnDtls = value;
    }

    /**
     * Gets the value of the corpActnConfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption213 }
     *     
     */
    public CorporateActionOption213 getCorpActnConfDtls() {
        return corpActnConfDtls;
    }

    /**
     * Sets the value of the corpActnConfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption213 }
     *     
     */
    public void setCorpActnConfDtls(CorporateActionOption213 value) {
        this.corpActnConfDtls = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative35 }
     *     
     */
    public CorporateActionNarrative35 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative35 }
     *     
     */
    public void setAddtlInf(CorporateActionNarrative35 value) {
        this.addtlInf = value;
    }

    /**
     * Gets the value of the issrAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the issrAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssrAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification137Choice }
     * 
     * 
     * @return
     *     The value of the issrAgt property.
     */
    public List<PartyIdentification137Choice> getIssrAgt() {
        if (issrAgt == null) {
            issrAgt = new ArrayList<>();
        }
        return this.issrAgt;
    }

    /**
     * Gets the value of the pngAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pngAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPngAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification137Choice }
     * 
     * 
     * @return
     *     The value of the pngAgt property.
     */
    public List<PartyIdentification137Choice> getPngAgt() {
        if (pngAgt == null) {
            pngAgt = new ArrayList<>();
        }
        return this.pngAgt;
    }

    /**
     * Gets the value of the subPngAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the subPngAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubPngAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification137Choice }
     * 
     * 
     * @return
     *     The value of the subPngAgt property.
     */
    public List<PartyIdentification137Choice> getSubPngAgt() {
        if (subPngAgt == null) {
            subPngAgt = new ArrayList<>();
        }
        return this.subPngAgt;
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
