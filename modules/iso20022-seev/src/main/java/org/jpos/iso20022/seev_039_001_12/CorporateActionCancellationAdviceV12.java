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

package org.jpos.iso20022.seev_039_001_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionCancellationAdviceV12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionCancellationAdviceV12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CxlAdvcGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.001.12}CorporateActionCancellation3"/>
 *         <element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.001.12}CorporateActionGeneralInformation135"/>
 *         <element name="AcctsDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.001.12}AccountIdentification49Choice"/>
 *         <element name="CorpActnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.001.12}CorporateAction72" minOccurs="0"/>
 *         <element name="AddtlTxt" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.001.12}Max8000Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IssrAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.001.12}PartyIdentification120Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PngAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.001.12}PartyIdentification120Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SubPngAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.001.12}PartyIdentification120Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Regar" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.001.12}PartyIdentification120Choice" minOccurs="0"/>
 *         <element name="RsellngAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.001.12}PartyIdentification120Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PhysSctiesAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.001.12}PartyIdentification120Choice" minOccurs="0"/>
 *         <element name="DrpAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.001.12}PartyIdentification120Choice" minOccurs="0"/>
 *         <element name="SlctnAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.001.12}PartyIdentification120Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InfAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.001.12}PartyIdentification120Choice" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.001.12}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionCancellationAdviceV12", propOrder = {
    "cxlAdvcGnlInf",
    "corpActnGnlInf",
    "acctsDtls",
    "corpActnDtls",
    "addtlTxt",
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
public class CorporateActionCancellationAdviceV12 {

    @XmlElement(name = "CxlAdvcGnlInf", required = true)
    protected CorporateActionCancellation3 cxlAdvcGnlInf;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation135 corpActnGnlInf;
    @XmlElement(name = "AcctsDtls", required = true)
    protected AccountIdentification49Choice acctsDtls;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateAction72 corpActnDtls;
    @XmlElement(name = "AddtlTxt")
    protected List<String> addtlTxt;
    @XmlElement(name = "IssrAgt")
    protected List<PartyIdentification120Choice> issrAgt;
    @XmlElement(name = "PngAgt")
    protected List<PartyIdentification120Choice> pngAgt;
    @XmlElement(name = "SubPngAgt")
    protected List<PartyIdentification120Choice> subPngAgt;
    @XmlElement(name = "Regar")
    protected PartyIdentification120Choice regar;
    @XmlElement(name = "RsellngAgt")
    protected List<PartyIdentification120Choice> rsellngAgt;
    @XmlElement(name = "PhysSctiesAgt")
    protected PartyIdentification120Choice physSctiesAgt;
    @XmlElement(name = "DrpAgt")
    protected PartyIdentification120Choice drpAgt;
    @XmlElement(name = "SlctnAgt")
    protected List<PartyIdentification120Choice> slctnAgt;
    @XmlElement(name = "InfAgt")
    protected PartyIdentification120Choice infAgt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the cxlAdvcGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionCancellation3 }
     *     
     */
    public CorporateActionCancellation3 getCxlAdvcGnlInf() {
        return cxlAdvcGnlInf;
    }

    /**
     * Sets the value of the cxlAdvcGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionCancellation3 }
     *     
     */
    public void setCxlAdvcGnlInf(CorporateActionCancellation3 value) {
        this.cxlAdvcGnlInf = value;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation135 }
     *     
     */
    public CorporateActionGeneralInformation135 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation135 }
     *     
     */
    public void setCorpActnGnlInf(CorporateActionGeneralInformation135 value) {
        this.corpActnGnlInf = value;
    }

    /**
     * Gets the value of the acctsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification49Choice }
     *     
     */
    public AccountIdentification49Choice getAcctsDtls() {
        return acctsDtls;
    }

    /**
     * Sets the value of the acctsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification49Choice }
     *     
     */
    public void setAcctsDtls(AccountIdentification49Choice value) {
        this.acctsDtls = value;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction72 }
     *     
     */
    public CorporateAction72 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction72 }
     *     
     */
    public void setCorpActnDtls(CorporateAction72 value) {
        this.corpActnDtls = value;
    }

    /**
     * Gets the value of the addtlTxt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlTxt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlTxt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlTxt property.
     */
    public List<String> getAddtlTxt() {
        if (addtlTxt == null) {
            addtlTxt = new ArrayList<>();
        }
        return this.addtlTxt;
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
     * {@link PartyIdentification120Choice }
     * 
     * 
     * @return
     *     The value of the issrAgt property.
     */
    public List<PartyIdentification120Choice> getIssrAgt() {
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
     * {@link PartyIdentification120Choice }
     * 
     * 
     * @return
     *     The value of the pngAgt property.
     */
    public List<PartyIdentification120Choice> getPngAgt() {
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
     * {@link PartyIdentification120Choice }
     * 
     * 
     * @return
     *     The value of the subPngAgt property.
     */
    public List<PartyIdentification120Choice> getSubPngAgt() {
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
     *     {@link PartyIdentification120Choice }
     *     
     */
    public PartyIdentification120Choice getRegar() {
        return regar;
    }

    /**
     * Sets the value of the regar property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification120Choice }
     *     
     */
    public void setRegar(PartyIdentification120Choice value) {
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
     * {@link PartyIdentification120Choice }
     * 
     * 
     * @return
     *     The value of the rsellngAgt property.
     */
    public List<PartyIdentification120Choice> getRsellngAgt() {
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
     *     {@link PartyIdentification120Choice }
     *     
     */
    public PartyIdentification120Choice getPhysSctiesAgt() {
        return physSctiesAgt;
    }

    /**
     * Sets the value of the physSctiesAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification120Choice }
     *     
     */
    public void setPhysSctiesAgt(PartyIdentification120Choice value) {
        this.physSctiesAgt = value;
    }

    /**
     * Gets the value of the drpAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification120Choice }
     *     
     */
    public PartyIdentification120Choice getDrpAgt() {
        return drpAgt;
    }

    /**
     * Sets the value of the drpAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification120Choice }
     *     
     */
    public void setDrpAgt(PartyIdentification120Choice value) {
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
     * {@link PartyIdentification120Choice }
     * 
     * 
     * @return
     *     The value of the slctnAgt property.
     */
    public List<PartyIdentification120Choice> getSlctnAgt() {
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
     *     {@link PartyIdentification120Choice }
     *     
     */
    public PartyIdentification120Choice getInfAgt() {
        return infAgt;
    }

    /**
     * Sets the value of the infAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification120Choice }
     *     
     */
    public void setInfAgt(PartyIdentification120Choice value) {
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
