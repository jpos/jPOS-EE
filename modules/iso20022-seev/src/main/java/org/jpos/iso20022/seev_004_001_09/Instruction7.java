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
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Instruction7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Instruction7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SnglInstrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}Max35Text"/>
 *         <element name="ReqdExctnDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}ISODateTime" minOccurs="0"/>
 *         <element name="VoteExctnConf" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}YesNoIndicator"/>
 *         <element name="AcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}SafekeepingAccount15"/>
 *         <element name="Prxy" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}Proxy12" minOccurs="0"/>
 *         <element name="VoteDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}VoteDetails6" minOccurs="0"/>
 *         <element name="MtgAttndee" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}IndividualPerson41" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SpcfcInstrReq" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}SpecificInstructionRequest4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Instruction7", propOrder = {
    "snglInstrId",
    "reqdExctnDt",
    "voteExctnConf",
    "acctDtls",
    "prxy",
    "voteDtls",
    "mtgAttndee",
    "spcfcInstrReq"
})
public class Instruction7 {

    @XmlElement(name = "SnglInstrId", required = true)
    protected String snglInstrId;
    @XmlElement(name = "ReqdExctnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reqdExctnDt;
    @XmlElement(name = "VoteExctnConf")
    protected boolean voteExctnConf;
    @XmlElement(name = "AcctDtls", required = true)
    protected SafekeepingAccount15 acctDtls;
    @XmlElement(name = "Prxy")
    protected Proxy12 prxy;
    @XmlElement(name = "VoteDtls")
    protected VoteDetails6 voteDtls;
    @XmlElement(name = "MtgAttndee")
    protected List<IndividualPerson41> mtgAttndee;
    @XmlElement(name = "SpcfcInstrReq")
    protected SpecificInstructionRequest4 spcfcInstrReq;

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
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdExctnDt(XMLGregorianCalendar value) {
        this.reqdExctnDt = value;
    }

    /**
     * Gets the value of the voteExctnConf property.
     * 
     */
    public boolean isVoteExctnConf() {
        return voteExctnConf;
    }

    /**
     * Sets the value of the voteExctnConf property.
     * 
     */
    public void setVoteExctnConf(boolean value) {
        this.voteExctnConf = value;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingAccount15 }
     *     
     */
    public SafekeepingAccount15 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingAccount15 }
     *     
     */
    public void setAcctDtls(SafekeepingAccount15 value) {
        this.acctDtls = value;
    }

    /**
     * Gets the value of the prxy property.
     * 
     * @return
     *     possible object is
     *     {@link Proxy12 }
     *     
     */
    public Proxy12 getPrxy() {
        return prxy;
    }

    /**
     * Sets the value of the prxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proxy12 }
     *     
     */
    public void setPrxy(Proxy12 value) {
        this.prxy = value;
    }

    /**
     * Gets the value of the voteDtls property.
     * 
     * @return
     *     possible object is
     *     {@link VoteDetails6 }
     *     
     */
    public VoteDetails6 getVoteDtls() {
        return voteDtls;
    }

    /**
     * Sets the value of the voteDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteDetails6 }
     *     
     */
    public void setVoteDtls(VoteDetails6 value) {
        this.voteDtls = value;
    }

    /**
     * Gets the value of the mtgAttndee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mtgAttndee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMtgAttndee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualPerson41 }
     * 
     * 
     * @return
     *     The value of the mtgAttndee property.
     */
    public List<IndividualPerson41> getMtgAttndee() {
        if (mtgAttndee == null) {
            mtgAttndee = new ArrayList<>();
        }
        return this.mtgAttndee;
    }

    /**
     * Gets the value of the spcfcInstrReq property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificInstructionRequest4 }
     *     
     */
    public SpecificInstructionRequest4 getSpcfcInstrReq() {
        return spcfcInstrReq;
    }

    /**
     * Sets the value of the spcfcInstrReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificInstructionRequest4 }
     *     
     */
    public void setSpcfcInstrReq(SpecificInstructionRequest4 value) {
        this.spcfcInstrReq = value;
    }

}
