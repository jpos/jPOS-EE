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

package org.jpos.iso20022.seev_040_002_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionInstructionCancellationRequest002V12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionInstructionCancellationRequest002V12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ChngInstrInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.040.002.12}YesNoIndicator" minOccurs="0"/>
 *         <element name="InstrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.040.002.12}DocumentIdentification37"/>
 *         <element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.040.002.12}CorporateActionGeneralInformation159"/>
 *         <element name="AcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.040.002.12}AccountIdentification62"/>
 *         <element name="CorpActnInstr" type="{urn:iso:std:iso:20022:tech:xsd:seev.040.002.12}CorporateActionOption202"/>
 *         <element name="PrtctInstr" type="{urn:iso:std:iso:20022:tech:xsd:seev.040.002.12}ProtectInstruction7" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.040.002.12}CorporateActionNarrative19" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.040.002.12}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionInstructionCancellationRequest002V12", propOrder = {
    "chngInstrInd",
    "instrId",
    "corpActnGnlInf",
    "acctDtls",
    "corpActnInstr",
    "prtctInstr",
    "addtlInf",
    "splmtryData"
})
public class CorporateActionInstructionCancellationRequest002V12 {

    @XmlElement(name = "ChngInstrInd")
    protected Boolean chngInstrInd;
    @XmlElement(name = "InstrId", required = true)
    protected DocumentIdentification37 instrId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation159 corpActnGnlInf;
    @XmlElement(name = "AcctDtls", required = true)
    protected AccountIdentification62 acctDtls;
    @XmlElement(name = "CorpActnInstr", required = true)
    protected CorporateActionOption202 corpActnInstr;
    @XmlElement(name = "PrtctInstr")
    protected ProtectInstruction7 prtctInstr;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative19 addtlInf;
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
     * Gets the value of the instrId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification37 }
     *     
     */
    public DocumentIdentification37 getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification37 }
     *     
     */
    public void setInstrId(DocumentIdentification37 value) {
        this.instrId = value;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation159 }
     *     
     */
    public CorporateActionGeneralInformation159 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation159 }
     *     
     */
    public void setCorpActnGnlInf(CorporateActionGeneralInformation159 value) {
        this.corpActnGnlInf = value;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification62 }
     *     
     */
    public AccountIdentification62 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification62 }
     *     
     */
    public void setAcctDtls(AccountIdentification62 value) {
        this.acctDtls = value;
    }

    /**
     * Gets the value of the corpActnInstr property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption202 }
     *     
     */
    public CorporateActionOption202 getCorpActnInstr() {
        return corpActnInstr;
    }

    /**
     * Sets the value of the corpActnInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption202 }
     *     
     */
    public void setCorpActnInstr(CorporateActionOption202 value) {
        this.corpActnInstr = value;
    }

    /**
     * Gets the value of the prtctInstr property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectInstruction7 }
     *     
     */
    public ProtectInstruction7 getPrtctInstr() {
        return prtctInstr;
    }

    /**
     * Sets the value of the prtctInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectInstruction7 }
     *     
     */
    public void setPrtctInstr(ProtectInstruction7 value) {
        this.prtctInstr = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative19 }
     *     
     */
    public CorporateActionNarrative19 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative19 }
     *     
     */
    public void setAddtlInf(CorporateActionNarrative19 value) {
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
