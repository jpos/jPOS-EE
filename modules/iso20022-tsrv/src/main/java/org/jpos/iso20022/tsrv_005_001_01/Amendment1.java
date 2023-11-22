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

package org.jpos.iso20022.tsrv_005_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Amendment1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Amendment1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.005.001.01}Max4AlphaNumericText"/>
 *         <element name="DtOfIssnc" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.005.001.01}ISODate"/>
 *         <element name="UdrtkgId" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.005.001.01}Undertaking7"/>
 *         <element name="AdvsgPty" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.005.001.01}PartyIdentification43" minOccurs="0"/>
 *         <element name="ScndAdvsgPty" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.005.001.01}PartyIdentification43" minOccurs="0"/>
 *         <element name="TermntnDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.005.001.01}UndertakingTermination3" minOccurs="0"/>
 *         <element name="UdrtkgAmtAdjstmnt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.005.001.01}UndertakingAmount2" minOccurs="0"/>
 *         <element name="NewXpryDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.005.001.01}ExpiryDetails1" minOccurs="0"/>
 *         <element name="NewBnfcry" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.005.001.01}PartyIdentification43" minOccurs="0"/>
 *         <element name="NewUdrtkgTermsAndConds" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.005.001.01}Narrative1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LclUdrtkg" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.005.001.01}Undertaking11" minOccurs="0"/>
 *         <element name="BnfcryCnsntReqInd" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.005.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="DlvryChanl" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.005.001.01}CommunicationChannel1" minOccurs="0"/>
 *         <element name="NclsdFile" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.005.001.01}Document9" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.005.001.01}Max2000Text" maxOccurs="5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amendment1", propOrder = {
    "seqNb",
    "dtOfIssnc",
    "udrtkgId",
    "advsgPty",
    "scndAdvsgPty",
    "termntnDtls",
    "udrtkgAmtAdjstmnt",
    "newXpryDtls",
    "newBnfcry",
    "newUdrtkgTermsAndConds",
    "lclUdrtkg",
    "bnfcryCnsntReqInd",
    "dlvryChanl",
    "nclsdFile",
    "addtlInf"
})
public class Amendment1 {

    @XmlElement(name = "SeqNb", required = true)
    protected String seqNb;
    @XmlElement(name = "DtOfIssnc", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfIssnc;
    @XmlElement(name = "UdrtkgId", required = true)
    protected Undertaking7 udrtkgId;
    @XmlElement(name = "AdvsgPty")
    protected PartyIdentification43 advsgPty;
    @XmlElement(name = "ScndAdvsgPty")
    protected PartyIdentification43 scndAdvsgPty;
    @XmlElement(name = "TermntnDtls")
    protected UndertakingTermination3 termntnDtls;
    @XmlElement(name = "UdrtkgAmtAdjstmnt")
    protected UndertakingAmount2 udrtkgAmtAdjstmnt;
    @XmlElement(name = "NewXpryDtls")
    protected ExpiryDetails1 newXpryDtls;
    @XmlElement(name = "NewBnfcry")
    protected PartyIdentification43 newBnfcry;
    @XmlElement(name = "NewUdrtkgTermsAndConds")
    protected List<Narrative1> newUdrtkgTermsAndConds;
    @XmlElement(name = "LclUdrtkg")
    protected Undertaking11 lclUdrtkg;
    @XmlElement(name = "BnfcryCnsntReqInd")
    protected Boolean bnfcryCnsntReqInd;
    @XmlElement(name = "DlvryChanl")
    protected CommunicationChannel1 dlvryChanl;
    @XmlElement(name = "NclsdFile")
    protected List<Document9> nclsdFile;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqNb(String value) {
        this.seqNb = value;
    }

    /**
     * Gets the value of the dtOfIssnc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtOfIssnc() {
        return dtOfIssnc;
    }

    /**
     * Sets the value of the dtOfIssnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtOfIssnc(XMLGregorianCalendar value) {
        this.dtOfIssnc = value;
    }

    /**
     * Gets the value of the udrtkgId property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking7 }
     *     
     */
    public Undertaking7 getUdrtkgId() {
        return udrtkgId;
    }

    /**
     * Sets the value of the udrtkgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking7 }
     *     
     */
    public void setUdrtkgId(Undertaking7 value) {
        this.udrtkgId = value;
    }

    /**
     * Gets the value of the advsgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getAdvsgPty() {
        return advsgPty;
    }

    /**
     * Sets the value of the advsgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setAdvsgPty(PartyIdentification43 value) {
        this.advsgPty = value;
    }

    /**
     * Gets the value of the scndAdvsgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getScndAdvsgPty() {
        return scndAdvsgPty;
    }

    /**
     * Sets the value of the scndAdvsgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setScndAdvsgPty(PartyIdentification43 value) {
        this.scndAdvsgPty = value;
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
     * Gets the value of the udrtkgAmtAdjstmnt property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmount2 }
     *     
     */
    public UndertakingAmount2 getUdrtkgAmtAdjstmnt() {
        return udrtkgAmtAdjstmnt;
    }

    /**
     * Sets the value of the udrtkgAmtAdjstmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmount2 }
     *     
     */
    public void setUdrtkgAmtAdjstmnt(UndertakingAmount2 value) {
        this.udrtkgAmtAdjstmnt = value;
    }

    /**
     * Gets the value of the newXpryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDetails1 }
     *     
     */
    public ExpiryDetails1 getNewXpryDtls() {
        return newXpryDtls;
    }

    /**
     * Sets the value of the newXpryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDetails1 }
     *     
     */
    public void setNewXpryDtls(ExpiryDetails1 value) {
        this.newXpryDtls = value;
    }

    /**
     * Gets the value of the newBnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getNewBnfcry() {
        return newBnfcry;
    }

    /**
     * Sets the value of the newBnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setNewBnfcry(PartyIdentification43 value) {
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
     * Gets the value of the lclUdrtkg property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking11 }
     *     
     */
    public Undertaking11 getLclUdrtkg() {
        return lclUdrtkg;
    }

    /**
     * Sets the value of the lclUdrtkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking11 }
     *     
     */
    public void setLclUdrtkg(Undertaking11 value) {
        this.lclUdrtkg = value;
    }

    /**
     * Gets the value of the bnfcryCnsntReqInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBnfcryCnsntReqInd() {
        return bnfcryCnsntReqInd;
    }

    /**
     * Sets the value of the bnfcryCnsntReqInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBnfcryCnsntReqInd(Boolean value) {
        this.bnfcryCnsntReqInd = value;
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
