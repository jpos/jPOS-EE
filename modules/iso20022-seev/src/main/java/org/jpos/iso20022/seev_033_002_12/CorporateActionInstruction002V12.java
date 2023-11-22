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

package org.jpos.iso20022.seev_033_002_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionInstruction002V12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionInstruction002V12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ChngInstrInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}YesNoIndicator" minOccurs="0"/>
 *         <element name="CancInstrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}DocumentIdentification37" minOccurs="0"/>
 *         <element name="InstrCxlReqId" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}DocumentIdentification37" minOccurs="0"/>
 *         <element name="OthrDocId" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}DocumentIdentification38" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="EvtsLkg" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}CorporateActionEventReference4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}CorporateActionGeneralInformation166"/>
 *         <element name="AcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}AccountAndBalance51"/>
 *         <element name="BnfclOwnrDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}PartyIdentification252" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CorpActnInstr" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}CorporateActionOption204"/>
 *         <element name="PrtctInstr" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}ProtectInstruction5" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}CorporateActionNarrative34" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionInstruction002V12", propOrder = {
    "chngInstrInd",
    "cancInstrId",
    "instrCxlReqId",
    "othrDocId",
    "evtsLkg",
    "corpActnGnlInf",
    "acctDtls",
    "bnfclOwnrDtls",
    "corpActnInstr",
    "prtctInstr",
    "addtlInf",
    "splmtryData"
})
public class CorporateActionInstruction002V12 {

    @XmlElement(name = "ChngInstrInd")
    protected Boolean chngInstrInd;
    @XmlElement(name = "CancInstrId")
    protected DocumentIdentification37 cancInstrId;
    @XmlElement(name = "InstrCxlReqId")
    protected DocumentIdentification37 instrCxlReqId;
    @XmlElement(name = "OthrDocId")
    protected List<DocumentIdentification38> othrDocId;
    @XmlElement(name = "EvtsLkg")
    protected List<CorporateActionEventReference4> evtsLkg;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation166 corpActnGnlInf;
    @XmlElement(name = "AcctDtls", required = true)
    protected AccountAndBalance51 acctDtls;
    @XmlElement(name = "BnfclOwnrDtls")
    protected List<PartyIdentification252> bnfclOwnrDtls;
    @XmlElement(name = "CorpActnInstr", required = true)
    protected CorporateActionOption204 corpActnInstr;
    @XmlElement(name = "PrtctInstr")
    protected ProtectInstruction5 prtctInstr;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative34 addtlInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the chngInstrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChngInstrInd() {
        return chngInstrInd;
    }

    /**
     * Sets the value of the chngInstrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChngInstrInd(Boolean value) {
        this.chngInstrInd = value;
    }

    /**
     * Gets the value of the cancInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification37 }
     *     
     */
    public DocumentIdentification37 getCancInstrId() {
        return cancInstrId;
    }

    /**
     * Sets the value of the cancInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification37 }
     *     
     */
    public void setCancInstrId(DocumentIdentification37 value) {
        this.cancInstrId = value;
    }

    /**
     * Gets the value of the instrCxlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification37 }
     *     
     */
    public DocumentIdentification37 getInstrCxlReqId() {
        return instrCxlReqId;
    }

    /**
     * Sets the value of the instrCxlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification37 }
     *     
     */
    public void setInstrCxlReqId(DocumentIdentification37 value) {
        this.instrCxlReqId = value;
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
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation166 }
     *     
     */
    public CorporateActionGeneralInformation166 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation166 }
     *     
     */
    public void setCorpActnGnlInf(CorporateActionGeneralInformation166 value) {
        this.corpActnGnlInf = value;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountAndBalance51 }
     *     
     */
    public AccountAndBalance51 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountAndBalance51 }
     *     
     */
    public void setAcctDtls(AccountAndBalance51 value) {
        this.acctDtls = value;
    }

    /**
     * Gets the value of the bnfclOwnrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bnfclOwnrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnfclOwnrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification252 }
     * 
     * 
     * @return
     *     The value of the bnfclOwnrDtls property.
     */
    public List<PartyIdentification252> getBnfclOwnrDtls() {
        if (bnfclOwnrDtls == null) {
            bnfclOwnrDtls = new ArrayList<>();
        }
        return this.bnfclOwnrDtls;
    }

    /**
     * Gets the value of the corpActnInstr property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption204 }
     *     
     */
    public CorporateActionOption204 getCorpActnInstr() {
        return corpActnInstr;
    }

    /**
     * Sets the value of the corpActnInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption204 }
     *     
     */
    public void setCorpActnInstr(CorporateActionOption204 value) {
        this.corpActnInstr = value;
    }

    /**
     * Gets the value of the prtctInstr property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectInstruction5 }
     *     
     */
    public ProtectInstruction5 getPrtctInstr() {
        return prtctInstr;
    }

    /**
     * Sets the value of the prtctInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectInstruction5 }
     *     
     */
    public void setPrtctInstr(ProtectInstruction5 value) {
        this.prtctInstr = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative34 }
     *     
     */
    public CorporateActionNarrative34 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative34 }
     *     
     */
    public void setAddtlInf(CorporateActionNarrative34 value) {
        this.addtlInf = value;
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
