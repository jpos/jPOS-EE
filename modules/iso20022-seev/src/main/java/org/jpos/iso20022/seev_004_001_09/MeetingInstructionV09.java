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

package org.jpos.iso20022.seev_004_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingInstructionV09 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MeetingInstructionV09">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}Pagination1" minOccurs="0"/>
 *         <element name="MtgInstrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}Max35Text" minOccurs="0"/>
 *         <element name="MtgRef" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}MeetingReference10"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}SecurityIdentification19"/>
 *         <element name="InstrCxlReqId" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}MeetingInstructionCancellation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CancInstrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}MeetingInstructionIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OthrDocId" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}DocumentIdentification32" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Instr" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}Instruction7" maxOccurs="unbounded"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingInstructionV09", propOrder = {
    "pgntn",
    "mtgInstrId",
    "mtgRef",
    "finInstrmId",
    "instrCxlReqId",
    "cancInstrId",
    "othrDocId",
    "instr",
    "splmtryData"
})
public class MeetingInstructionV09 {

    @XmlElement(name = "Pgntn")
    protected Pagination1 pgntn;
    @XmlElement(name = "MtgInstrId")
    protected String mtgInstrId;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference10 mtgRef;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "InstrCxlReqId")
    protected List<MeetingInstructionCancellation1> instrCxlReqId;
    @XmlElement(name = "CancInstrId")
    protected List<MeetingInstructionIdentification1> cancInstrId;
    @XmlElement(name = "OthrDocId")
    protected List<DocumentIdentification32> othrDocId;
    @XmlElement(name = "Instr", required = true)
    protected List<Instruction7> instr;
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
     * Gets the value of the mtgInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtgInstrId() {
        return mtgInstrId;
    }

    /**
     * Sets the value of the mtgInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtgInstrId(String value) {
        this.mtgInstrId = value;
    }

    /**
     * Gets the value of the mtgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingReference10 }
     *     
     */
    public MeetingReference10 getMtgRef() {
        return mtgRef;
    }

    /**
     * Sets the value of the mtgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingReference10 }
     *     
     */
    public void setMtgRef(MeetingReference10 value) {
        this.mtgRef = value;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the instrCxlReqId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instrCxlReqId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrCxlReqId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeetingInstructionCancellation1 }
     * 
     * 
     * @return
     *     The value of the instrCxlReqId property.
     */
    public List<MeetingInstructionCancellation1> getInstrCxlReqId() {
        if (instrCxlReqId == null) {
            instrCxlReqId = new ArrayList<>();
        }
        return this.instrCxlReqId;
    }

    /**
     * Gets the value of the cancInstrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cancInstrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancInstrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeetingInstructionIdentification1 }
     * 
     * 
     * @return
     *     The value of the cancInstrId property.
     */
    public List<MeetingInstructionIdentification1> getCancInstrId() {
        if (cancInstrId == null) {
            cancInstrId = new ArrayList<>();
        }
        return this.cancInstrId;
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
     * Gets the value of the instr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instruction7 }
     * 
     * 
     * @return
     *     The value of the instr property.
     */
    public List<Instruction7> getInstr() {
        if (instr == null) {
            instr = new ArrayList<>();
        }
        return this.instr;
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
