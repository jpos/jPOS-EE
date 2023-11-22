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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoteParameters8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VoteParameters8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctiesQtyReqrdToVote" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}FinancialInstrumentQuantity18Choice" minOccurs="0"/>
 *         <element name="PrtlVoteAllwd" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}YesNoIndicator"/>
 *         <element name="SpltVoteAllwd" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}YesNoIndicator"/>
 *         <element name="VoteDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}DateFormat58Choice" minOccurs="0"/>
 *         <element name="VoteMktDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}DateFormat58Choice" minOccurs="0"/>
 *         <element name="VoteMthds" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}VoteMethods5" minOccurs="0"/>
 *         <element name="VtngBlltElctrncAdr" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}CommunicationAddress11" minOccurs="0"/>
 *         <element name="VtngBlltReqAdr" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}PostalAddress1" minOccurs="0"/>
 *         <element name="RvcbltyDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}DateFormat58Choice" minOccurs="0"/>
 *         <element name="RvcbltyMktDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}DateFormat58Choice" minOccurs="0"/>
 *         <element name="BnfclOwnrDsclsr" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}YesNoIndicator" minOccurs="0"/>
 *         <element name="EarlyIncntivPrm" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}IncentivePremium5" minOccurs="0"/>
 *         <element name="IncntivPrm" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}IncentivePremium5" minOccurs="0"/>
 *         <element name="EarlyVoteWthPrmDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}DateFormat58Choice" minOccurs="0"/>
 *         <element name="VoteWthPrmDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}DateFormat58Choice" minOccurs="0"/>
 *         <element name="VoteWthPrmMktDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}DateFormat58Choice" minOccurs="0"/>
 *         <element name="AddtlVtngRqrmnts" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Max350Text" minOccurs="0"/>
 *         <element name="PrvsInstrInvldtyInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}YesNoIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteParameters8", propOrder = {
    "sctiesQtyReqrdToVote",
    "prtlVoteAllwd",
    "spltVoteAllwd",
    "voteDdln",
    "voteMktDdln",
    "voteMthds",
    "vtngBlltElctrncAdr",
    "vtngBlltReqAdr",
    "rvcbltyDdln",
    "rvcbltyMktDdln",
    "bnfclOwnrDsclsr",
    "earlyIncntivPrm",
    "incntivPrm",
    "earlyVoteWthPrmDdln",
    "voteWthPrmDdln",
    "voteWthPrmMktDdln",
    "addtlVtngRqrmnts",
    "prvsInstrInvldtyInd"
})
public class VoteParameters8 {

    @XmlElement(name = "SctiesQtyReqrdToVote")
    protected FinancialInstrumentQuantity18Choice sctiesQtyReqrdToVote;
    @XmlElement(name = "PrtlVoteAllwd")
    protected boolean prtlVoteAllwd;
    @XmlElement(name = "SpltVoteAllwd")
    protected boolean spltVoteAllwd;
    @XmlElement(name = "VoteDdln")
    protected DateFormat58Choice voteDdln;
    @XmlElement(name = "VoteMktDdln")
    protected DateFormat58Choice voteMktDdln;
    @XmlElement(name = "VoteMthds")
    protected VoteMethods5 voteMthds;
    @XmlElement(name = "VtngBlltElctrncAdr")
    protected CommunicationAddress11 vtngBlltElctrncAdr;
    @XmlElement(name = "VtngBlltReqAdr")
    protected PostalAddress1 vtngBlltReqAdr;
    @XmlElement(name = "RvcbltyDdln")
    protected DateFormat58Choice rvcbltyDdln;
    @XmlElement(name = "RvcbltyMktDdln")
    protected DateFormat58Choice rvcbltyMktDdln;
    @XmlElement(name = "BnfclOwnrDsclsr")
    protected Boolean bnfclOwnrDsclsr;
    @XmlElement(name = "EarlyIncntivPrm")
    protected IncentivePremium5 earlyIncntivPrm;
    @XmlElement(name = "IncntivPrm")
    protected IncentivePremium5 incntivPrm;
    @XmlElement(name = "EarlyVoteWthPrmDdln")
    protected DateFormat58Choice earlyVoteWthPrmDdln;
    @XmlElement(name = "VoteWthPrmDdln")
    protected DateFormat58Choice voteWthPrmDdln;
    @XmlElement(name = "VoteWthPrmMktDdln")
    protected DateFormat58Choice voteWthPrmMktDdln;
    @XmlElement(name = "AddtlVtngRqrmnts")
    protected String addtlVtngRqrmnts;
    @XmlElement(name = "PrvsInstrInvldtyInd")
    protected Boolean prvsInstrInvldtyInd;

    /**
     * Gets the value of the sctiesQtyReqrdToVote property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getSctiesQtyReqrdToVote() {
        return sctiesQtyReqrdToVote;
    }

    /**
     * Sets the value of the sctiesQtyReqrdToVote property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setSctiesQtyReqrdToVote(FinancialInstrumentQuantity18Choice value) {
        this.sctiesQtyReqrdToVote = value;
    }

    /**
     * Gets the value of the prtlVoteAllwd property.
     * 
     */
    public boolean isPrtlVoteAllwd() {
        return prtlVoteAllwd;
    }

    /**
     * Sets the value of the prtlVoteAllwd property.
     * 
     */
    public void setPrtlVoteAllwd(boolean value) {
        this.prtlVoteAllwd = value;
    }

    /**
     * Gets the value of the spltVoteAllwd property.
     * 
     */
    public boolean isSpltVoteAllwd() {
        return spltVoteAllwd;
    }

    /**
     * Sets the value of the spltVoteAllwd property.
     * 
     */
    public void setSpltVoteAllwd(boolean value) {
        this.spltVoteAllwd = value;
    }

    /**
     * Gets the value of the voteDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getVoteDdln() {
        return voteDdln;
    }

    /**
     * Sets the value of the voteDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public void setVoteDdln(DateFormat58Choice value) {
        this.voteDdln = value;
    }

    /**
     * Gets the value of the voteMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getVoteMktDdln() {
        return voteMktDdln;
    }

    /**
     * Sets the value of the voteMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public void setVoteMktDdln(DateFormat58Choice value) {
        this.voteMktDdln = value;
    }

    /**
     * Gets the value of the voteMthds property.
     * 
     * @return
     *     possible object is
     *     {@link VoteMethods5 }
     *     
     */
    public VoteMethods5 getVoteMthds() {
        return voteMthds;
    }

    /**
     * Sets the value of the voteMthds property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteMethods5 }
     *     
     */
    public void setVoteMthds(VoteMethods5 value) {
        this.voteMthds = value;
    }

    /**
     * Gets the value of the vtngBlltElctrncAdr property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress11 }
     *     
     */
    public CommunicationAddress11 getVtngBlltElctrncAdr() {
        return vtngBlltElctrncAdr;
    }

    /**
     * Sets the value of the vtngBlltElctrncAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress11 }
     *     
     */
    public void setVtngBlltElctrncAdr(CommunicationAddress11 value) {
        this.vtngBlltElctrncAdr = value;
    }

    /**
     * Gets the value of the vtngBlltReqAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress1 }
     *     
     */
    public PostalAddress1 getVtngBlltReqAdr() {
        return vtngBlltReqAdr;
    }

    /**
     * Sets the value of the vtngBlltReqAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress1 }
     *     
     */
    public void setVtngBlltReqAdr(PostalAddress1 value) {
        this.vtngBlltReqAdr = value;
    }

    /**
     * Gets the value of the rvcbltyDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getRvcbltyDdln() {
        return rvcbltyDdln;
    }

    /**
     * Sets the value of the rvcbltyDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public void setRvcbltyDdln(DateFormat58Choice value) {
        this.rvcbltyDdln = value;
    }

    /**
     * Gets the value of the rvcbltyMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getRvcbltyMktDdln() {
        return rvcbltyMktDdln;
    }

    /**
     * Sets the value of the rvcbltyMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public void setRvcbltyMktDdln(DateFormat58Choice value) {
        this.rvcbltyMktDdln = value;
    }

    /**
     * Gets the value of the bnfclOwnrDsclsr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBnfclOwnrDsclsr() {
        return bnfclOwnrDsclsr;
    }

    /**
     * Sets the value of the bnfclOwnrDsclsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBnfclOwnrDsclsr(Boolean value) {
        this.bnfclOwnrDsclsr = value;
    }

    /**
     * Gets the value of the earlyIncntivPrm property.
     * 
     * @return
     *     possible object is
     *     {@link IncentivePremium5 }
     *     
     */
    public IncentivePremium5 getEarlyIncntivPrm() {
        return earlyIncntivPrm;
    }

    /**
     * Sets the value of the earlyIncntivPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentivePremium5 }
     *     
     */
    public void setEarlyIncntivPrm(IncentivePremium5 value) {
        this.earlyIncntivPrm = value;
    }

    /**
     * Gets the value of the incntivPrm property.
     * 
     * @return
     *     possible object is
     *     {@link IncentivePremium5 }
     *     
     */
    public IncentivePremium5 getIncntivPrm() {
        return incntivPrm;
    }

    /**
     * Sets the value of the incntivPrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentivePremium5 }
     *     
     */
    public void setIncntivPrm(IncentivePremium5 value) {
        this.incntivPrm = value;
    }

    /**
     * Gets the value of the earlyVoteWthPrmDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getEarlyVoteWthPrmDdln() {
        return earlyVoteWthPrmDdln;
    }

    /**
     * Sets the value of the earlyVoteWthPrmDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public void setEarlyVoteWthPrmDdln(DateFormat58Choice value) {
        this.earlyVoteWthPrmDdln = value;
    }

    /**
     * Gets the value of the voteWthPrmDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getVoteWthPrmDdln() {
        return voteWthPrmDdln;
    }

    /**
     * Sets the value of the voteWthPrmDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public void setVoteWthPrmDdln(DateFormat58Choice value) {
        this.voteWthPrmDdln = value;
    }

    /**
     * Gets the value of the voteWthPrmMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getVoteWthPrmMktDdln() {
        return voteWthPrmMktDdln;
    }

    /**
     * Sets the value of the voteWthPrmMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public void setVoteWthPrmMktDdln(DateFormat58Choice value) {
        this.voteWthPrmMktDdln = value;
    }

    /**
     * Gets the value of the addtlVtngRqrmnts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlVtngRqrmnts() {
        return addtlVtngRqrmnts;
    }

    /**
     * Sets the value of the addtlVtngRqrmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlVtngRqrmnts(String value) {
        this.addtlVtngRqrmnts = value;
    }

    /**
     * Gets the value of the prvsInstrInvldtyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrvsInstrInvldtyInd() {
        return prvsInstrInvldtyInd;
    }

    /**
     * Sets the value of the prvsInstrInvldtyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrvsInstrInvldtyInd(Boolean value) {
        this.prvsInstrInvldtyInd = value;
    }

}
