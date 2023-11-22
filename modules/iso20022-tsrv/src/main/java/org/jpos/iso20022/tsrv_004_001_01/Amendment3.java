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

package org.jpos.iso20022.tsrv_004_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Amendment3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Amendment3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ApplcntReqNb" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01}Max35Text"/>
 *         <element name="UdrtkgId" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01}Undertaking9"/>
 *         <element name="Applcnt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01}PartyIdentification43"/>
 *         <element name="TermntnDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01}UndertakingTermination3" minOccurs="0"/>
 *         <element name="IncrDcrAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01}UndertakingAmount2" minOccurs="0"/>
 *         <element name="NewXpryDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01}ExpiryDetails2" minOccurs="0"/>
 *         <element name="NewBnfcry" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01}Beneficiary1" minOccurs="0"/>
 *         <element name="NewUdrtkgTermsAndConds" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01}Narrative1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CntrUdrtkg" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01}Undertaking10" minOccurs="0"/>
 *         <element name="DlvryChanl" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01}CommunicationChannel1" minOccurs="0"/>
 *         <element name="NclsdFile" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01}Document9" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01}Max2000Text" maxOccurs="5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amendment3", propOrder = {
    "applcntReqNb",
    "udrtkgId",
    "applcnt",
    "termntnDtls",
    "incrDcrAmt",
    "newXpryDtls",
    "newBnfcry",
    "newUdrtkgTermsAndConds",
    "cntrUdrtkg",
    "dlvryChanl",
    "nclsdFile",
    "addtlInf"
})
public class Amendment3 {

    @XmlElement(name = "ApplcntReqNb", required = true)
    protected String applcntReqNb;
    @XmlElement(name = "UdrtkgId", required = true)
    protected Undertaking9 udrtkgId;
    @XmlElement(name = "Applcnt", required = true)
    protected PartyIdentification43 applcnt;
    @XmlElement(name = "TermntnDtls")
    protected UndertakingTermination3 termntnDtls;
    @XmlElement(name = "IncrDcrAmt")
    protected UndertakingAmount2 incrDcrAmt;
    @XmlElement(name = "NewXpryDtls")
    protected ExpiryDetails2 newXpryDtls;
    @XmlElement(name = "NewBnfcry")
    protected Beneficiary1 newBnfcry;
    @XmlElement(name = "NewUdrtkgTermsAndConds")
    protected List<Narrative1> newUdrtkgTermsAndConds;
    @XmlElement(name = "CntrUdrtkg")
    protected Undertaking10 cntrUdrtkg;
    @XmlElement(name = "DlvryChanl")
    protected CommunicationChannel1 dlvryChanl;
    @XmlElement(name = "NclsdFile")
    protected List<Document9> nclsdFile;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the applcntReqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplcntReqNb() {
        return applcntReqNb;
    }

    /**
     * Sets the value of the applcntReqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplcntReqNb(String value) {
        this.applcntReqNb = value;
    }

    /**
     * Gets the value of the udrtkgId property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking9 }
     *     
     */
    public Undertaking9 getUdrtkgId() {
        return udrtkgId;
    }

    /**
     * Sets the value of the udrtkgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking9 }
     *     
     */
    public void setUdrtkgId(Undertaking9 value) {
        this.udrtkgId = value;
    }

    /**
     * Gets the value of the applcnt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getApplcnt() {
        return applcnt;
    }

    /**
     * Sets the value of the applcnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setApplcnt(PartyIdentification43 value) {
        this.applcnt = value;
    }

    /**
     * Gets the value of the termntnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingTermination3 }
     *     
     */
    public UndertakingTermination3 getTermntnDtls() {
        return termntnDtls;
    }

    /**
     * Sets the value of the termntnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingTermination3 }
     *     
     */
    public void setTermntnDtls(UndertakingTermination3 value) {
        this.termntnDtls = value;
    }

    /**
     * Gets the value of the incrDcrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmount2 }
     *     
     */
    public UndertakingAmount2 getIncrDcrAmt() {
        return incrDcrAmt;
    }

    /**
     * Sets the value of the incrDcrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmount2 }
     *     
     */
    public void setIncrDcrAmt(UndertakingAmount2 value) {
        this.incrDcrAmt = value;
    }

    /**
     * Gets the value of the newXpryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDetails2 }
     *     
     */
    public ExpiryDetails2 getNewXpryDtls() {
        return newXpryDtls;
    }

    /**
     * Sets the value of the newXpryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDetails2 }
     *     
     */
    public void setNewXpryDtls(ExpiryDetails2 value) {
        this.newXpryDtls = value;
    }

    /**
     * Gets the value of the newBnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link Beneficiary1 }
     *     
     */
    public Beneficiary1 getNewBnfcry() {
        return newBnfcry;
    }

    /**
     * Sets the value of the newBnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Beneficiary1 }
     *     
     */
    public void setNewBnfcry(Beneficiary1 value) {
        this.newBnfcry = value;
    }

    /**
     * Gets the value of the newUdrtkgTermsAndConds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the newUdrtkgTermsAndConds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewUdrtkgTermsAndConds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Narrative1 }
     * 
     * 
     * @return
     *     The value of the newUdrtkgTermsAndConds property.
     */
    public List<Narrative1> getNewUdrtkgTermsAndConds() {
        if (newUdrtkgTermsAndConds == null) {
            newUdrtkgTermsAndConds = new ArrayList<>();
        }
        return this.newUdrtkgTermsAndConds;
    }

    /**
     * Gets the value of the cntrUdrtkg property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking10 }
     *     
     */
    public Undertaking10 getCntrUdrtkg() {
        return cntrUdrtkg;
    }

    /**
     * Sets the value of the cntrUdrtkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking10 }
     *     
     */
    public void setCntrUdrtkg(Undertaking10 value) {
        this.cntrUdrtkg = value;
    }

    /**
     * Gets the value of the dlvryChanl property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationChannel1 }
     *     
     */
    public CommunicationChannel1 getDlvryChanl() {
        return dlvryChanl;
    }

    /**
     * Sets the value of the dlvryChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationChannel1 }
     *     
     */
    public void setDlvryChanl(CommunicationChannel1 value) {
        this.dlvryChanl = value;
    }

    /**
     * Gets the value of the nclsdFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nclsdFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNclsdFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document9 }
     * 
     * 
     * @return
     *     The value of the nclsdFile property.
     */
    public List<Document9> getNclsdFile() {
        if (nclsdFile == null) {
            nclsdFile = new ArrayList<>();
        }
        return this.nclsdFile;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
