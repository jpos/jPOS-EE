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

package org.jpos.iso20022.seev_006_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingInstructionStatusV09 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MeetingInstructionStatusV09">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InstrTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}InstructionType2Choice"/>
 *         <element name="MtgRef" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}MeetingReference10"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}SecurityIdentification19"/>
 *         <element name="InstrTpSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}InstructionTypeStatus5Choice"/>
 *         <element name="Pos" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}EligiblePosition17" minOccurs="0"/>
 *         <element name="CnfrmgPty" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}PartyIdentification226Choice"/>
 *         <element name="VoteCstgPty" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}PartyIdentification226Choice"/>
 *         <element name="RghtsHldr" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}PartyIdentification246Choice" maxOccurs="250" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingInstructionStatusV09", propOrder = {
    "instrTp",
    "mtgRef",
    "finInstrmId",
    "instrTpSts",
    "pos",
    "cnfrmgPty",
    "voteCstgPty",
    "rghtsHldr",
    "splmtryData"
})
public class MeetingInstructionStatusV09 {

    @XmlElement(name = "InstrTp", required = true)
    protected InstructionType2Choice instrTp;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference10 mtgRef;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "InstrTpSts", required = true)
    protected InstructionTypeStatus5Choice instrTpSts;
    @XmlElement(name = "Pos")
    protected EligiblePosition17 pos;
    @XmlElement(name = "CnfrmgPty", required = true)
    protected PartyIdentification226Choice cnfrmgPty;
    @XmlElement(name = "VoteCstgPty", required = true)
    protected PartyIdentification226Choice voteCstgPty;
    @XmlElement(name = "RghtsHldr")
    protected List<PartyIdentification246Choice> rghtsHldr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the instrTp property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionType2Choice }
     *     
     */
    public InstructionType2Choice getInstrTp() {
        return instrTp;
    }

    /**
     * Sets the value of the instrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionType2Choice }
     *     
     */
    public void setInstrTp(InstructionType2Choice value) {
        this.instrTp = value;
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
     * Gets the value of the instrTpSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionTypeStatus5Choice }
     *     
     */
    public InstructionTypeStatus5Choice getInstrTpSts() {
        return instrTpSts;
    }

    /**
     * Sets the value of the instrTpSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionTypeStatus5Choice }
     *     
     */
    public void setInstrTpSts(InstructionTypeStatus5Choice value) {
        this.instrTpSts = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link EligiblePosition17 }
     *     
     */
    public EligiblePosition17 getPos() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligiblePosition17 }
     *     
     */
    public void setPos(EligiblePosition17 value) {
        this.pos = value;
    }

    /**
     * Gets the value of the cnfrmgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification226Choice }
     *     
     */
    public PartyIdentification226Choice getCnfrmgPty() {
        return cnfrmgPty;
    }

    /**
     * Sets the value of the cnfrmgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification226Choice }
     *     
     */
    public void setCnfrmgPty(PartyIdentification226Choice value) {
        this.cnfrmgPty = value;
    }

    /**
     * Gets the value of the voteCstgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification226Choice }
     *     
     */
    public PartyIdentification226Choice getVoteCstgPty() {
        return voteCstgPty;
    }

    /**
     * Sets the value of the voteCstgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification226Choice }
     *     
     */
    public void setVoteCstgPty(PartyIdentification226Choice value) {
        this.voteCstgPty = value;
    }

    /**
     * Gets the value of the rghtsHldr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rghtsHldr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRghtsHldr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification246Choice }
     * 
     * 
     * @return
     *     The value of the rghtsHldr property.
     */
    public List<PartyIdentification246Choice> getRghtsHldr() {
        if (rghtsHldr == null) {
            rghtsHldr = new ArrayList<>();
        }
        return this.rghtsHldr;
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
