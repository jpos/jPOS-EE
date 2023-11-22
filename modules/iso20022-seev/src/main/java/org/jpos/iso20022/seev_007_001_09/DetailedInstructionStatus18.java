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
 * <p>Java class for DetailedInstructionStatus18 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DetailedInstructionStatus18">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SnglInstrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.007.001.09}Max35Text"/>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:seev.007.001.09}Max35Text" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:seev.007.001.09}PartyIdentification231Choice" minOccurs="0"/>
 *         <element name="SubAcctId" type="{urn:iso:std:iso:20022:tech:xsd:seev.007.001.09}Max35Text" minOccurs="0"/>
 *         <element name="RghtsHldr" type="{urn:iso:std:iso:20022:tech:xsd:seev.007.001.09}PartyIdentification246Choice" maxOccurs="250" minOccurs="0"/>
 *         <element name="Prxy" type="{urn:iso:std:iso:20022:tech:xsd:seev.007.001.09}PartyIdentification232Choice" minOccurs="0"/>
 *         <element name="StgInstr" type="{urn:iso:std:iso:20022:tech:xsd:seev.007.001.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="ModltyOfCntg" type="{urn:iso:std:iso:20022:tech:xsd:seev.007.001.09}ModalityOfCounting1Choice"/>
 *         <element name="VoteRctDtTm" type="{urn:iso:std:iso:20022:tech:xsd:seev.007.001.09}DateAndDateTime1Choice" minOccurs="0"/>
 *         <element name="VotePerRsltn" type="{urn:iso:std:iso:20022:tech:xsd:seev.007.001.09}Vote17" maxOccurs="1000" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedInstructionStatus18", propOrder = {
    "snglInstrId",
    "acctId",
    "acctOwnr",
    "subAcctId",
    "rghtsHldr",
    "prxy",
    "stgInstr",
    "modltyOfCntg",
    "voteRctDtTm",
    "votePerRsltn"
})
public class DetailedInstructionStatus18 {

    @XmlElement(name = "SnglInstrId", required = true)
    protected String snglInstrId;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification231Choice acctOwnr;
    @XmlElement(name = "SubAcctId")
    protected String subAcctId;
    @XmlElement(name = "RghtsHldr")
    protected List<PartyIdentification246Choice> rghtsHldr;
    @XmlElement(name = "Prxy")
    protected PartyIdentification232Choice prxy;
    @XmlElement(name = "StgInstr")
    protected Boolean stgInstr;
    @XmlElement(name = "ModltyOfCntg", required = true)
    protected ModalityOfCounting1Choice modltyOfCntg;
    @XmlElement(name = "VoteRctDtTm")
    protected DateAndDateTime1Choice voteRctDtTm;
    @XmlElement(name = "VotePerRsltn")
    protected List<Vote17> votePerRsltn;

    /**
     * Gets the value of the snglInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnglInstrId() {
        return snglInstrId;
    }

    /**
     * Sets the value of the snglInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnglInstrId(String value) {
        this.snglInstrId = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification231Choice }
     *     
     */
    public PartyIdentification231Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification231Choice }
     *     
     */
    public void setAcctOwnr(PartyIdentification231Choice value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the subAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAcctId() {
        return subAcctId;
    }

    /**
     * Sets the value of the subAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubAcctId(String value) {
        this.subAcctId = value;
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
     * Gets the value of the prxy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public PartyIdentification232Choice getPrxy() {
        return prxy;
    }

    /**
     * Sets the value of the prxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public void setPrxy(PartyIdentification232Choice value) {
        this.prxy = value;
    }

    /**
     * Gets the value of the stgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStgInstr() {
        return stgInstr;
    }

    /**
     * Sets the value of the stgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStgInstr(Boolean value) {
        this.stgInstr = value;
    }

    /**
     * Gets the value of the modltyOfCntg property.
     * 
     * @return
     *     possible object is
     *     {@link ModalityOfCounting1Choice }
     *     
     */
    public ModalityOfCounting1Choice getModltyOfCntg() {
        return modltyOfCntg;
    }

    /**
     * Sets the value of the modltyOfCntg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModalityOfCounting1Choice }
     *     
     */
    public void setModltyOfCntg(ModalityOfCounting1Choice value) {
        this.modltyOfCntg = value;
    }

    /**
     * Gets the value of the voteRctDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public DateAndDateTime1Choice getVoteRctDtTm() {
        return voteRctDtTm;
    }

    /**
     * Sets the value of the voteRctDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public void setVoteRctDtTm(DateAndDateTime1Choice value) {
        this.voteRctDtTm = value;
    }

    /**
     * Gets the value of the votePerRsltn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the votePerRsltn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVotePerRsltn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vote17 }
     * 
     * 
     * @return
     *     The value of the votePerRsltn property.
     */
    public List<Vote17> getVotePerRsltn() {
        if (votePerRsltn == null) {
            votePerRsltn = new ArrayList<>();
        }
        return this.votePerRsltn;
    }

}
