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

package org.jpos.iso20022.acmt_002_001_08;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountParties17 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountParties17">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrncplAcctPty" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}AccountParties12Choice"/>
 *         <element name="ScndryOwnr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}InvestmentAccountOwnershipInformation16" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Bnfcry" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}InvestmentAccountOwnershipInformation16" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PwrOfAttny" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}InvestmentAccountOwnershipInformation16" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LglGuardn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}InvestmentAccountOwnershipInformation16" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CtdnForMnr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}InvestmentAccountOwnershipInformation16" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SucssrOnDth" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}InvestmentAccountOwnershipInformation16" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Admstr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}InvestmentAccountOwnershipInformation16" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OthrPty" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}ExtendedParty14" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Grntr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}InvestmentAccountOwnershipInformation16" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Sttlr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}InvestmentAccountOwnershipInformation16" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SnrMggOffcl" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}InvestmentAccountOwnershipInformation16" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Prtctr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}InvestmentAccountOwnershipInformation16" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RegdShrhldrNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}RegisteredShareholderName1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountParties17", propOrder = {
    "prncplAcctPty",
    "scndryOwnr",
    "bnfcry",
    "pwrOfAttny",
    "lglGuardn",
    "ctdnForMnr",
    "sucssrOnDth",
    "admstr",
    "othrPty",
    "grntr",
    "sttlr",
    "snrMggOffcl",
    "prtctr",
    "regdShrhldrNm"
})
public class AccountParties17 {

    @XmlElement(name = "PrncplAcctPty", required = true)
    protected AccountParties12Choice prncplAcctPty;
    @XmlElement(name = "ScndryOwnr")
    protected List<InvestmentAccountOwnershipInformation16> scndryOwnr;
    @XmlElement(name = "Bnfcry")
    protected List<InvestmentAccountOwnershipInformation16> bnfcry;
    @XmlElement(name = "PwrOfAttny")
    protected List<InvestmentAccountOwnershipInformation16> pwrOfAttny;
    @XmlElement(name = "LglGuardn")
    protected List<InvestmentAccountOwnershipInformation16> lglGuardn;
    @XmlElement(name = "CtdnForMnr")
    protected List<InvestmentAccountOwnershipInformation16> ctdnForMnr;
    @XmlElement(name = "SucssrOnDth")
    protected List<InvestmentAccountOwnershipInformation16> sucssrOnDth;
    @XmlElement(name = "Admstr")
    protected List<InvestmentAccountOwnershipInformation16> admstr;
    @XmlElement(name = "OthrPty")
    protected List<ExtendedParty14> othrPty;
    @XmlElement(name = "Grntr")
    protected List<InvestmentAccountOwnershipInformation16> grntr;
    @XmlElement(name = "Sttlr")
    protected List<InvestmentAccountOwnershipInformation16> sttlr;
    @XmlElement(name = "SnrMggOffcl")
    protected List<InvestmentAccountOwnershipInformation16> snrMggOffcl;
    @XmlElement(name = "Prtctr")
    protected List<InvestmentAccountOwnershipInformation16> prtctr;
    @XmlElement(name = "RegdShrhldrNm")
    protected RegisteredShareholderName1Choice regdShrhldrNm;

    /**
     * Gets the value of the prncplAcctPty property.
     * 
     * @return
     *     possible object is
     *     {@link AccountParties12Choice }
     *     
     */
    public AccountParties12Choice getPrncplAcctPty() {
        return prncplAcctPty;
    }

    /**
     * Sets the value of the prncplAcctPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountParties12Choice }
     *     
     */
    public void setPrncplAcctPty(AccountParties12Choice value) {
        this.prncplAcctPty = value;
    }

    /**
     * Gets the value of the scndryOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the scndryOwnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScndryOwnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     * @return
     *     The value of the scndryOwnr property.
     */
    public List<InvestmentAccountOwnershipInformation16> getScndryOwnr() {
        if (scndryOwnr == null) {
            scndryOwnr = new ArrayList<>();
        }
        return this.scndryOwnr;
    }

    /**
     * Gets the value of the bnfcry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bnfcry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnfcry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     * @return
     *     The value of the bnfcry property.
     */
    public List<InvestmentAccountOwnershipInformation16> getBnfcry() {
        if (bnfcry == null) {
            bnfcry = new ArrayList<>();
        }
        return this.bnfcry;
    }

    /**
     * Gets the value of the pwrOfAttny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pwrOfAttny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPwrOfAttny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     * @return
     *     The value of the pwrOfAttny property.
     */
    public List<InvestmentAccountOwnershipInformation16> getPwrOfAttny() {
        if (pwrOfAttny == null) {
            pwrOfAttny = new ArrayList<>();
        }
        return this.pwrOfAttny;
    }

    /**
     * Gets the value of the lglGuardn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lglGuardn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLglGuardn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     * @return
     *     The value of the lglGuardn property.
     */
    public List<InvestmentAccountOwnershipInformation16> getLglGuardn() {
        if (lglGuardn == null) {
            lglGuardn = new ArrayList<>();
        }
        return this.lglGuardn;
    }

    /**
     * Gets the value of the ctdnForMnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctdnForMnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtdnForMnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     * @return
     *     The value of the ctdnForMnr property.
     */
    public List<InvestmentAccountOwnershipInformation16> getCtdnForMnr() {
        if (ctdnForMnr == null) {
            ctdnForMnr = new ArrayList<>();
        }
        return this.ctdnForMnr;
    }

    /**
     * Gets the value of the sucssrOnDth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sucssrOnDth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSucssrOnDth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     * @return
     *     The value of the sucssrOnDth property.
     */
    public List<InvestmentAccountOwnershipInformation16> getSucssrOnDth() {
        if (sucssrOnDth == null) {
            sucssrOnDth = new ArrayList<>();
        }
        return this.sucssrOnDth;
    }

    /**
     * Gets the value of the admstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the admstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdmstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     * @return
     *     The value of the admstr property.
     */
    public List<InvestmentAccountOwnershipInformation16> getAdmstr() {
        if (admstr == null) {
            admstr = new ArrayList<>();
        }
        return this.admstr;
    }

    /**
     * Gets the value of the othrPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedParty14 }
     * 
     * 
     * @return
     *     The value of the othrPty property.
     */
    public List<ExtendedParty14> getOthrPty() {
        if (othrPty == null) {
            othrPty = new ArrayList<>();
        }
        return this.othrPty;
    }

    /**
     * Gets the value of the grntr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the grntr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrntr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     * @return
     *     The value of the grntr property.
     */
    public List<InvestmentAccountOwnershipInformation16> getGrntr() {
        if (grntr == null) {
            grntr = new ArrayList<>();
        }
        return this.grntr;
    }

    /**
     * Gets the value of the sttlr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     * @return
     *     The value of the sttlr property.
     */
    public List<InvestmentAccountOwnershipInformation16> getSttlr() {
        if (sttlr == null) {
            sttlr = new ArrayList<>();
        }
        return this.sttlr;
    }

    /**
     * Gets the value of the snrMggOffcl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the snrMggOffcl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSnrMggOffcl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     * @return
     *     The value of the snrMggOffcl property.
     */
    public List<InvestmentAccountOwnershipInformation16> getSnrMggOffcl() {
        if (snrMggOffcl == null) {
            snrMggOffcl = new ArrayList<>();
        }
        return this.snrMggOffcl;
    }

    /**
     * Gets the value of the prtctr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtctr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtctr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     * @return
     *     The value of the prtctr property.
     */
    public List<InvestmentAccountOwnershipInformation16> getPrtctr() {
        if (prtctr == null) {
            prtctr = new ArrayList<>();
        }
        return this.prtctr;
    }

    /**
     * Gets the value of the regdShrhldrNm property.
     * 
     * @return
     *     possible object is
     *     {@link RegisteredShareholderName1Choice }
     *     
     */
    public RegisteredShareholderName1Choice getRegdShrhldrNm() {
        return regdShrhldrNm;
    }

    /**
     * Sets the value of the regdShrhldrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisteredShareholderName1Choice }
     *     
     */
    public void setRegdShrhldrNm(RegisteredShareholderName1Choice value) {
        this.regdShrhldrNm = value;
    }

}
