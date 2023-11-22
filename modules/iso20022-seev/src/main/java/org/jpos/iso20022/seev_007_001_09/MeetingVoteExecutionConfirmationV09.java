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

package org.jpos.iso20022.seev_007_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingVoteExecutionConfirmationV09 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MeetingVoteExecutionConfirmationV09">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:seev.007.001.09}Pagination1" minOccurs="0"/>
 *         <element name="VoteExctnConfId" type="{urn:iso:std:iso:20022:tech:xsd:seev.007.001.09}Max35Text" minOccurs="0"/>
 *         <element name="MtgInstrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.007.001.09}Max35Text"/>
 *         <element name="MtgRef" type="{urn:iso:std:iso:20022:tech:xsd:seev.007.001.09}MeetingReference10"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:seev.007.001.09}SecurityIdentification19"/>
 *         <element name="VoteInstrs" type="{urn:iso:std:iso:20022:tech:xsd:seev.007.001.09}DetailedInstructionStatus18" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="VoteInstrsConfURLAdr" type="{urn:iso:std:iso:20022:tech:xsd:seev.007.001.09}Max2048Text" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.007.001.09}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingVoteExecutionConfirmationV09", propOrder = {
    "pgntn",
    "voteExctnConfId",
    "mtgInstrId",
    "mtgRef",
    "finInstrmId",
    "voteInstrs",
    "voteInstrsConfURLAdr",
    "splmtryData"
})
public class MeetingVoteExecutionConfirmationV09 {

    @XmlElement(name = "Pgntn")
    protected Pagination1 pgntn;
    @XmlElement(name = "VoteExctnConfId")
    protected String voteExctnConfId;
    @XmlElement(name = "MtgInstrId", required = true)
    protected String mtgInstrId;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference10 mtgRef;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "VoteInstrs")
    protected List<DetailedInstructionStatus18> voteInstrs;
    @XmlElement(name = "VoteInstrsConfURLAdr")
    protected String voteInstrsConfURLAdr;
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
     * Gets the value of the voteExctnConfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoteExctnConfId() {
        return voteExctnConfId;
    }

    /**
     * Sets the value of the voteExctnConfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoteExctnConfId(String value) {
        this.voteExctnConfId = value;
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
     * Gets the value of the voteInstrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the voteInstrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoteInstrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedInstructionStatus18 }
     * 
     * 
     * @return
     *     The value of the voteInstrs property.
     */
    public List<DetailedInstructionStatus18> getVoteInstrs() {
        if (voteInstrs == null) {
            voteInstrs = new ArrayList<>();
        }
        return this.voteInstrs;
    }

    /**
     * Gets the value of the voteInstrsConfURLAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoteInstrsConfURLAdr() {
        return voteInstrsConfURLAdr;
    }

    /**
     * Sets the value of the voteInstrsConfURLAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoteInstrsConfURLAdr(String value) {
        this.voteInstrsConfURLAdr = value;
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
