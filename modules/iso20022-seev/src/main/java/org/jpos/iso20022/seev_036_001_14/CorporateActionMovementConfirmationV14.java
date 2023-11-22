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

package org.jpos.iso20022.seev_036_001_14;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionMovementConfirmationV14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionMovementConfirmationV14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}Pagination1" minOccurs="0"/>
 *         <element name="NtfctnId" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}DocumentIdentification31" minOccurs="0"/>
 *         <element name="MvmntPrlimryAdvcId" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}DocumentIdentification31" minOccurs="0"/>
 *         <element name="InstrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}DocumentIdentification9" minOccurs="0"/>
 *         <element name="OthrDocId" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}DocumentIdentification32" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="EvtsLkg" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}CorporateActionEventReference3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}TransactionIdentification15" minOccurs="0"/>
 *         <element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}CorporateActionGeneralInformation162"/>
 *         <element name="AcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}AccountAndBalance49"/>
 *         <element name="CorpActnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}CorporateAction73" minOccurs="0"/>
 *         <element name="CorpActnConfDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}CorporateActionOption211"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}CorporateActionNarrative31" minOccurs="0"/>
 *         <element name="IssrAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}PartyIdentification120Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PngAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}PartyIdentification120Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SubPngAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}PartyIdentification120Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionMovementConfirmationV14", propOrder = {
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
public class CorporateActionMovementConfirmationV14 {

    @XmlElement(name = "Pgntn")
    protected Pagination1 pgntn;
    @XmlElement(name = "NtfctnId")
    protected DocumentIdentification31 ntfctnId;
    @XmlElement(name = "MvmntPrlimryAdvcId")
    protected DocumentIdentification31 mvmntPrlimryAdvcId;
    @XmlElement(name = "InstrId")
    protected DocumentIdentification9 instrId;
    @XmlElement(name = "OthrDocId")
    protected List<DocumentIdentification32> othrDocId;
    @XmlElement(name = "EvtsLkg")
    protected List<CorporateActionEventReference3> evtsLkg;
    @XmlElement(name = "TxId")
    protected TransactionIdentification15 txId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation162 corpActnGnlInf;
    @XmlElement(name = "AcctDtls", required = true)
    protected AccountAndBalance49 acctDtls;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateAction73 corpActnDtls;
    @XmlElement(name = "CorpActnConfDtls", required = true)
    protected CorporateActionOption211 corpActnConfDtls;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative31 addtlInf;
    @XmlElement(name = "IssrAgt")
    protected List<PartyIdentification120Choice> issrAgt;
    @XmlElement(name = "PngAgt")
    protected List<PartyIdentification120Choice> pngAgt;
    @XmlElement(name = "SubPngAgt")
    protected List<PartyIdentification120Choice> subPngAgt;
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
     *     {@link DocumentIdentification31 }
     *     
     */
    public DocumentIdentification31 getNtfctnId() {
        return ntfctnId;
    }

    /**
     * Sets the value of the ntfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification31 }
     *     
     */
    public void setNtfctnId(DocumentIdentification31 value) {
        this.ntfctnId = value;
    }

    /**
     * Gets the value of the mvmntPrlimryAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification31 }
     *     
     */
    public DocumentIdentification31 getMvmntPrlimryAdvcId() {
        return mvmntPrlimryAdvcId;
    }

    /**
     * Sets the value of the mvmntPrlimryAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification31 }
     *     
     */
    public void setMvmntPrlimryAdvcId(DocumentIdentification31 value) {
        this.mvmntPrlimryAdvcId = value;
    }

    /**
     * Gets the value of the instrId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification9 }
     *     
     */
    public DocumentIdentification9 getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification9 }
     *     
     */
    public void setInstrId(DocumentIdentification9 value) {
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
     * {@link DocumentIdentification32 }
     * 
     * 
     * @return
     *     The value of the othrDocId property.
     */
    public List<DocumentIdentification32> getOthrDocId() {
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
     * {@link CorporateActionEventReference3 }
     * 
     * 
     * @return
     *     The value of the evtsLkg property.
     */
    public List<CorporateActionEventReference3> getEvtsLkg() {
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
     *     {@link TransactionIdentification15 }
     *     
     */
    public TransactionIdentification15 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification15 }
     *     
     */
    public void setTxId(TransactionIdentification15 value) {
        this.txId = value;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation162 }
     *     
     */
    public CorporateActionGeneralInformation162 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation162 }
     *     
     */
    public void setCorpActnGnlInf(CorporateActionGeneralInformation162 value) {
        this.corpActnGnlInf = value;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountAndBalance49 }
     *     
     */
    public AccountAndBalance49 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountAndBalance49 }
     *     
     */
    public void setAcctDtls(AccountAndBalance49 value) {
        this.acctDtls = value;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction73 }
     *     
     */
    public CorporateAction73 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction73 }
     *     
     */
    public void setCorpActnDtls(CorporateAction73 value) {
        this.corpActnDtls = value;
    }

    /**
     * Gets the value of the corpActnConfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption211 }
     *     
     */
    public CorporateActionOption211 getCorpActnConfDtls() {
        return corpActnConfDtls;
    }

    /**
     * Sets the value of the corpActnConfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption211 }
     *     
     */
    public void setCorpActnConfDtls(CorporateActionOption211 value) {
        this.corpActnConfDtls = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative31 }
     *     
     */
    public CorporateActionNarrative31 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative31 }
     *     
     */
    public void setAddtlInf(CorporateActionNarrative31 value) {
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
     * {@link PartyIdentification120Choice }
     * 
     * 
     * @return
     *     The value of the issrAgt property.
     */
    public List<PartyIdentification120Choice> getIssrAgt() {
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
     * {@link PartyIdentification120Choice }
     * 
     * 
     * @return
     *     The value of the pngAgt property.
     */
    public List<PartyIdentification120Choice> getPngAgt() {
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
     * {@link PartyIdentification120Choice }
     * 
     * 
     * @return
     *     The value of the subPngAgt property.
     */
    public List<PartyIdentification120Choice> getSubPngAgt() {
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
