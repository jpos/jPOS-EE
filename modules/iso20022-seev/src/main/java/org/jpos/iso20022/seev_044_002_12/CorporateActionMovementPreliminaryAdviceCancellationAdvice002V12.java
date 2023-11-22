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

package org.jpos.iso20022.seev_044_002_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionMovementPreliminaryAdviceCancellationAdvice002V12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionMovementPreliminaryAdviceCancellationAdvice002V12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MvmntPrlimryAdvcId" type="{urn:iso:std:iso:20022:tech:xsd:seev.044.002.12}DocumentIdentification37"/>
 *         <element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.044.002.12}CorporateActionGeneralInformation150"/>
 *         <element name="AcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.044.002.12}AccountIdentification50Choice"/>
 *         <element name="CorpActnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.044.002.12}CorporateAction76" minOccurs="0"/>
 *         <element name="IssrAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.044.002.12}PartyIdentification137Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PngAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.044.002.12}PartyIdentification137Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SubPngAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.044.002.12}PartyIdentification137Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Regar" type="{urn:iso:std:iso:20022:tech:xsd:seev.044.002.12}PartyIdentification137Choice" minOccurs="0"/>
 *         <element name="RsellngAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.044.002.12}PartyIdentification137Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PhysSctiesAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.044.002.12}PartyIdentification137Choice" minOccurs="0"/>
 *         <element name="DrpAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.044.002.12}PartyIdentification137Choice" minOccurs="0"/>
 *         <element name="SlctnAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.044.002.12}PartyIdentification137Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InfAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.044.002.12}PartyIdentification137Choice" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.044.002.12}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionMovementPreliminaryAdviceCancellationAdvice002V12", propOrder = {
    "mvmntPrlimryAdvcId",
    "corpActnGnlInf",
    "acctDtls",
    "corpActnDtls",
    "issrAgt",
    "pngAgt",
    "subPngAgt",
    "regar",
    "rsellngAgt",
    "physSctiesAgt",
    "drpAgt",
    "slctnAgt",
    "infAgt",
    "splmtryData"
})
public class CorporateActionMovementPreliminaryAdviceCancellationAdvice002V12 {

    @XmlElement(name = "MvmntPrlimryAdvcId", required = true)
    protected DocumentIdentification37 mvmntPrlimryAdvcId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation150 corpActnGnlInf;
    @XmlElement(name = "AcctDtls", required = true)
    protected AccountIdentification50Choice acctDtls;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateAction76 corpActnDtls;
    @XmlElement(name = "IssrAgt")
    protected List<PartyIdentification137Choice> issrAgt;
    @XmlElement(name = "PngAgt")
    protected List<PartyIdentification137Choice> pngAgt;
    @XmlElement(name = "SubPngAgt")
    protected List<PartyIdentification137Choice> subPngAgt;
    @XmlElement(name = "Regar")
    protected PartyIdentification137Choice regar;
    @XmlElement(name = "RsellngAgt")
    protected List<PartyIdentification137Choice> rsellngAgt;
    @XmlElement(name = "PhysSctiesAgt")
    protected PartyIdentification137Choice physSctiesAgt;
    @XmlElement(name = "DrpAgt")
    protected PartyIdentification137Choice drpAgt;
    @XmlElement(name = "SlctnAgt")
    protected List<PartyIdentification137Choice> slctnAgt;
    @XmlElement(name = "InfAgt")
    protected PartyIdentification137Choice infAgt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the mvmntPrlimryAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification37 }
     *     
     */
    public DocumentIdentification37 getMvmntPrlimryAdvcId() {
        return mvmntPrlimryAdvcId;
    }

    /**
     * Sets the value of the mvmntPrlimryAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification37 }
     *     
     */
    public void setMvmntPrlimryAdvcId(DocumentIdentification37 value) {
        this.mvmntPrlimryAdvcId = value;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation150 }
     *     
     */
    public CorporateActionGeneralInformation150 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation150 }
     *     
     */
    public void setCorpActnGnlInf(CorporateActionGeneralInformation150 value) {
        this.corpActnGnlInf = value;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification50Choice }
     *     
     */
    public AccountIdentification50Choice getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification50Choice }
     *     
     */
    public void setAcctDtls(AccountIdentification50Choice value) {
        this.acctDtls = value;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction76 }
     *     
     */
    public CorporateAction76 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction76 }
     *     
     */
    public void setCorpActnDtls(CorporateAction76 value) {
        this.corpActnDtls = value;
    }

    /**
     * Gets the value of the issrAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the issrAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssrAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification137Choice }
     * 
     * 
     * @return
     *     The value of the issrAgt property.
     */
    public List<PartyIdentification137Choice> getIssrAgt() {
        if (issrAgt == null) {
            issrAgt = new ArrayList<>();
        }
        return this.issrAgt;
    }

    /**
     * Gets the value of the pngAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pngAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPngAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification137Choice }
     * 
     * 
     * @return
     *     The value of the pngAgt property.
     */
    public List<PartyIdentification137Choice> getPngAgt() {
        if (pngAgt == null) {
            pngAgt = new ArrayList<>();
        }
        return this.pngAgt;
    }

    /**
     * Gets the value of the subPngAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the subPngAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubPngAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification137Choice }
     * 
     * 
     * @return
     *     The value of the subPngAgt property.
     */
    public List<PartyIdentification137Choice> getSubPngAgt() {
        if (subPngAgt == null) {
            subPngAgt = new ArrayList<>();
        }
        return this.subPngAgt;
    }

    /**
     * Gets the value of the regar property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public PartyIdentification137Choice getRegar() {
        return regar;
    }

    /**
     * Sets the value of the regar property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public void setRegar(PartyIdentification137Choice value) {
        this.regar = value;
    }

    /**
     * Gets the value of the rsellngAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rsellngAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsellngAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification137Choice }
     * 
     * 
     * @return
     *     The value of the rsellngAgt property.
     */
    public List<PartyIdentification137Choice> getRsellngAgt() {
        if (rsellngAgt == null) {
            rsellngAgt = new ArrayList<>();
        }
        return this.rsellngAgt;
    }

    /**
     * Gets the value of the physSctiesAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public PartyIdentification137Choice getPhysSctiesAgt() {
        return physSctiesAgt;
    }

    /**
     * Sets the value of the physSctiesAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public void setPhysSctiesAgt(PartyIdentification137Choice value) {
        this.physSctiesAgt = value;
    }

    /**
     * Gets the value of the drpAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public PartyIdentification137Choice getDrpAgt() {
        return drpAgt;
    }

    /**
     * Sets the value of the drpAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public void setDrpAgt(PartyIdentification137Choice value) {
        this.drpAgt = value;
    }

    /**
     * Gets the value of the slctnAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the slctnAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlctnAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification137Choice }
     * 
     * 
     * @return
     *     The value of the slctnAgt property.
     */
    public List<PartyIdentification137Choice> getSlctnAgt() {
        if (slctnAgt == null) {
            slctnAgt = new ArrayList<>();
        }
        return this.slctnAgt;
    }

    /**
     * Gets the value of the infAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public PartyIdentification137Choice getInfAgt() {
        return infAgt;
    }

    /**
     * Sets the value of the infAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public void setInfAgt(PartyIdentification137Choice value) {
        this.infAgt = value;
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
