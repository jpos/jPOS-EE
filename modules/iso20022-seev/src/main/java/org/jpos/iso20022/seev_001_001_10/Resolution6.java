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

package org.jpos.iso20022.seev_001_001_10;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Resolution6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Resolution6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IssrLabl" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Max35Text"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}ItemDescription1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ListgGrpRsltnLabl" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Max35Text" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}ResolutionType2Code" minOccurs="0"/>
 *         <element name="ForInfOnly" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}YesNoIndicator"/>
 *         <element name="VoteTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}VoteType1Code" minOccurs="0"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}ResolutionStatus1Code"/>
 *         <element name="SubmittdBySctyHldr" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}YesNoIndicator" minOccurs="0"/>
 *         <element name="RghtToWdrwInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}YesNoIndicator" minOccurs="0"/>
 *         <element name="VoteInstrTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}VoteInstructionType1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MgmtRcmmndtn" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}VoteInstruction5Code" minOccurs="0"/>
 *         <element name="NtifngPtyRcmmndtn" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}VoteInstruction5Code" minOccurs="0"/>
 *         <element name="Entitlmnt" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Entitlement1Choice" minOccurs="0"/>
 *         <element name="VtngRghtsThrshldForApprvl" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}VotingRightsThreshold1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="URLAdr" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Max2048Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resolution6", propOrder = {
    "issrLabl",
    "desc",
    "listgGrpRsltnLabl",
    "tp",
    "forInfOnly",
    "voteTp",
    "sts",
    "submittdBySctyHldr",
    "rghtToWdrwInd",
    "voteInstrTp",
    "mgmtRcmmndtn",
    "ntifngPtyRcmmndtn",
    "entitlmnt",
    "vtngRghtsThrshldForApprvl",
    "urlAdr"
})
public class Resolution6 {

    @XmlElement(name = "IssrLabl", required = true)
    protected String issrLabl;
    @XmlElement(name = "Desc")
    protected List<ItemDescription1> desc;
    @XmlElement(name = "ListgGrpRsltnLabl")
    protected String listgGrpRsltnLabl;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected ResolutionType2Code tp;
    @XmlElement(name = "ForInfOnly")
    protected boolean forInfOnly;
    @XmlElement(name = "VoteTp")
    @XmlSchemaType(name = "string")
    protected VoteType1Code voteTp;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected ResolutionStatus1Code sts;
    @XmlElement(name = "SubmittdBySctyHldr")
    protected Boolean submittdBySctyHldr;
    @XmlElement(name = "RghtToWdrwInd")
    protected Boolean rghtToWdrwInd;
    @XmlElement(name = "VoteInstrTp")
    protected List<VoteInstructionType1> voteInstrTp;
    @XmlElement(name = "MgmtRcmmndtn")
    @XmlSchemaType(name = "string")
    protected VoteInstruction5Code mgmtRcmmndtn;
    @XmlElement(name = "NtifngPtyRcmmndtn")
    @XmlSchemaType(name = "string")
    protected VoteInstruction5Code ntifngPtyRcmmndtn;
    @XmlElement(name = "Entitlmnt")
    protected Entitlement1Choice entitlmnt;
    @XmlElement(name = "VtngRghtsThrshldForApprvl")
    protected List<VotingRightsThreshold1> vtngRghtsThrshldForApprvl;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;

    /**
     * Gets the value of the issrLabl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrLabl() {
        return issrLabl;
    }

    /**
     * Sets the value of the issrLabl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssrLabl(String value) {
        this.issrLabl = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the desc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemDescription1 }
     * 
     * 
     * @return
     *     The value of the desc property.
     */
    public List<ItemDescription1> getDesc() {
        if (desc == null) {
            desc = new ArrayList<>();
        }
        return this.desc;
    }

    /**
     * Gets the value of the listgGrpRsltnLabl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListgGrpRsltnLabl() {
        return listgGrpRsltnLabl;
    }

    /**
     * Sets the value of the listgGrpRsltnLabl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListgGrpRsltnLabl(String value) {
        this.listgGrpRsltnLabl = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionType2Code }
     *     
     */
    public ResolutionType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionType2Code }
     *     
     */
    public void setTp(ResolutionType2Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the forInfOnly property.
     * 
     */
    public boolean isForInfOnly() {
        return forInfOnly;
    }

    /**
     * Sets the value of the forInfOnly property.
     * 
     */
    public void setForInfOnly(boolean value) {
        this.forInfOnly = value;
    }

    /**
     * Gets the value of the voteTp property.
     * 
     * @return
     *     possible object is
     *     {@link VoteType1Code }
     *     
     */
    public VoteType1Code getVoteTp() {
        return voteTp;
    }

    /**
     * Sets the value of the voteTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteType1Code }
     *     
     */
    public void setVoteTp(VoteType1Code value) {
        this.voteTp = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionStatus1Code }
     *     
     */
    public ResolutionStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionStatus1Code }
     *     
     */
    public void setSts(ResolutionStatus1Code value) {
        this.sts = value;
    }

    /**
     * Gets the value of the submittdBySctyHldr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubmittdBySctyHldr() {
        return submittdBySctyHldr;
    }

    /**
     * Sets the value of the submittdBySctyHldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubmittdBySctyHldr(Boolean value) {
        this.submittdBySctyHldr = value;
    }

    /**
     * Gets the value of the rghtToWdrwInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRghtToWdrwInd() {
        return rghtToWdrwInd;
    }

    /**
     * Sets the value of the rghtToWdrwInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRghtToWdrwInd(Boolean value) {
        this.rghtToWdrwInd = value;
    }

    /**
     * Gets the value of the voteInstrTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the voteInstrTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoteInstrTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoteInstructionType1 }
     * 
     * 
     * @return
     *     The value of the voteInstrTp property.
     */
    public List<VoteInstructionType1> getVoteInstrTp() {
        if (voteInstrTp == null) {
            voteInstrTp = new ArrayList<>();
        }
        return this.voteInstrTp;
    }

    /**
     * Gets the value of the mgmtRcmmndtn property.
     * 
     * @return
     *     possible object is
     *     {@link VoteInstruction5Code }
     *     
     */
    public VoteInstruction5Code getMgmtRcmmndtn() {
        return mgmtRcmmndtn;
    }

    /**
     * Sets the value of the mgmtRcmmndtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteInstruction5Code }
     *     
     */
    public void setMgmtRcmmndtn(VoteInstruction5Code value) {
        this.mgmtRcmmndtn = value;
    }

    /**
     * Gets the value of the ntifngPtyRcmmndtn property.
     * 
     * @return
     *     possible object is
     *     {@link VoteInstruction5Code }
     *     
     */
    public VoteInstruction5Code getNtifngPtyRcmmndtn() {
        return ntifngPtyRcmmndtn;
    }

    /**
     * Sets the value of the ntifngPtyRcmmndtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteInstruction5Code }
     *     
     */
    public void setNtifngPtyRcmmndtn(VoteInstruction5Code value) {
        this.ntifngPtyRcmmndtn = value;
    }

    /**
     * Gets the value of the entitlmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Entitlement1Choice }
     *     
     */
    public Entitlement1Choice getEntitlmnt() {
        return entitlmnt;
    }

    /**
     * Sets the value of the entitlmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entitlement1Choice }
     *     
     */
    public void setEntitlmnt(Entitlement1Choice value) {
        this.entitlmnt = value;
    }

    /**
     * Gets the value of the vtngRghtsThrshldForApprvl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the vtngRghtsThrshldForApprvl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVtngRghtsThrshldForApprvl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VotingRightsThreshold1 }
     * 
     * 
     * @return
     *     The value of the vtngRghtsThrshldForApprvl property.
     */
    public List<VotingRightsThreshold1> getVtngRghtsThrshldForApprvl() {
        if (vtngRghtsThrshldForApprvl == null) {
            vtngRghtsThrshldForApprvl = new ArrayList<>();
        }
        return this.vtngRghtsThrshldForApprvl;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAdr() {
        return urlAdr;
    }

    /**
     * Sets the value of the urlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLAdr(String value) {
        this.urlAdr = value;
    }

}
