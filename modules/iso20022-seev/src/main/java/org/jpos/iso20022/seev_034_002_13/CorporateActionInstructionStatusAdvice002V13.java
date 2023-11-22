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

package org.jpos.iso20022.seev_034_002_13;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionInstructionStatusAdvice002V13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionInstructionStatusAdvice002V13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InstrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}DocumentIdentification17" minOccurs="0"/>
 *         <element name="OthrDocId" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}DocumentIdentification34" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}CorporateActionGeneralInformation158"/>
 *         <element name="InstrPrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}InstructionProcessingStatus49Choice" maxOccurs="unbounded"/>
 *         <element name="CorpActnInstr" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}CorporateActionOption203" minOccurs="0"/>
 *         <element name="PrtctInstr" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}ProtectInstruction6" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}CorporateActionNarrative19" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionInstructionStatusAdvice002V13", propOrder = {
    "instrId",
    "othrDocId",
    "corpActnGnlInf",
    "instrPrcgSts",
    "corpActnInstr",
    "prtctInstr",
    "addtlInf",
    "splmtryData"
})
public class CorporateActionInstructionStatusAdvice002V13 {

    @XmlElement(name = "InstrId")
    protected DocumentIdentification17 instrId;
    @XmlElement(name = "OthrDocId")
    protected List<DocumentIdentification34> othrDocId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation158 corpActnGnlInf;
    @XmlElement(name = "InstrPrcgSts", required = true)
    protected List<InstructionProcessingStatus49Choice> instrPrcgSts;
    @XmlElement(name = "CorpActnInstr")
    protected CorporateActionOption203 corpActnInstr;
    @XmlElement(name = "PrtctInstr")
    protected ProtectInstruction6 prtctInstr;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative19 addtlInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

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
     * {@link DocumentIdentification34 }
     * 
     * 
     * @return
     *     The value of the othrDocId property.
     */
    public List<DocumentIdentification34> getOthrDocId() {
        if (othrDocId == null) {
            othrDocId = new ArrayList<>();
        }
        return this.othrDocId;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation158 }
     *     
     */
    public CorporateActionGeneralInformation158 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation158 }
     *     
     */
    public void setCorpActnGnlInf(CorporateActionGeneralInformation158 value) {
        this.corpActnGnlInf = value;
    }

    /**
     * Gets the value of the instrPrcgSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instrPrcgSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrPrcgSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionProcessingStatus49Choice }
     * 
     * 
     * @return
     *     The value of the instrPrcgSts property.
     */
    public List<InstructionProcessingStatus49Choice> getInstrPrcgSts() {
        if (instrPrcgSts == null) {
            instrPrcgSts = new ArrayList<>();
        }
        return this.instrPrcgSts;
    }

    /**
     * Gets the value of the corpActnInstr property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption203 }
     *     
     */
    public CorporateActionOption203 getCorpActnInstr() {
        return corpActnInstr;
    }

    /**
     * Sets the value of the corpActnInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption203 }
     *     
     */
    public void setCorpActnInstr(CorporateActionOption203 value) {
        this.corpActnInstr = value;
    }

    /**
     * Gets the value of the prtctInstr property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectInstruction6 }
     *     
     */
    public ProtectInstruction6 getPrtctInstr() {
        return prtctInstr;
    }

    /**
     * Sets the value of the prtctInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectInstruction6 }
     *     
     */
    public void setPrtctInstr(ProtectInstruction6 value) {
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
