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

package org.jpos.iso20022.camt_004_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashAccount42 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashAccount42">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}Max70Text" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}CashAccountType2Choice" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="Prxy" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}ProxyAccountIdentification1" minOccurs="0"/>
 *         <element name="CurMulLmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}Limit5" minOccurs="0"/>
 *         <element name="Ownr" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}PartyIdentification135" minOccurs="0"/>
 *         <element name="Svcr" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="MulBal" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}CashBalance13" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CurBilLmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}BilateralLimit3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="StgOrdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}StandingOrder9" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccount42", propOrder = {
    "nm",
    "tp",
    "ccy",
    "prxy",
    "curMulLmt",
    "ownr",
    "svcr",
    "mulBal",
    "curBilLmt",
    "stgOrdr"
})
public class CashAccount42 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Tp")
    protected CashAccountType2Choice tp;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "Prxy")
    protected ProxyAccountIdentification1 prxy;
    @XmlElement(name = "CurMulLmt")
    protected Limit5 curMulLmt;
    @XmlElement(name = "Ownr")
    protected PartyIdentification135 ownr;
    @XmlElement(name = "Svcr")
    protected BranchAndFinancialInstitutionIdentification6 svcr;
    @XmlElement(name = "MulBal")
    protected List<CashBalance13> mulBal;
    @XmlElement(name = "CurBilLmt")
    protected List<BilateralLimit3> curBilLmt;
    @XmlElement(name = "StgOrdr")
    protected List<StandingOrder9> stgOrdr;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountType2Choice }
     *     
     */
    public CashAccountType2Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountType2Choice }
     *     
     */
    public void setTp(CashAccountType2Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the prxy property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyAccountIdentification1 }
     *     
     */
    public ProxyAccountIdentification1 getPrxy() {
        return prxy;
    }

    /**
     * Sets the value of the prxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyAccountIdentification1 }
     *     
     */
    public void setPrxy(ProxyAccountIdentification1 value) {
        this.prxy = value;
    }

    /**
     * Gets the value of the curMulLmt property.
     * 
     * @return
     *     possible object is
     *     {@link Limit5 }
     *     
     */
    public Limit5 getCurMulLmt() {
        return curMulLmt;
    }

    /**
     * Sets the value of the curMulLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Limit5 }
     *     
     */
    public void setCurMulLmt(Limit5 value) {
        this.curMulLmt = value;
    }

    /**
     * Gets the value of the ownr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getOwnr() {
        return ownr;
    }

    /**
     * Sets the value of the ownr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setOwnr(PartyIdentification135 value) {
        this.ownr = value;
    }

    /**
     * Gets the value of the svcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getSvcr() {
        return svcr;
    }

    /**
     * Sets the value of the svcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setSvcr(BranchAndFinancialInstitutionIdentification6 value) {
        this.svcr = value;
    }

    /**
     * Gets the value of the mulBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mulBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMulBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashBalance13 }
     * 
     * 
     * @return
     *     The value of the mulBal property.
     */
    public List<CashBalance13> getMulBal() {
        if (mulBal == null) {
            mulBal = new ArrayList<>();
        }
        return this.mulBal;
    }

    /**
     * Gets the value of the curBilLmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the curBilLmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurBilLmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BilateralLimit3 }
     * 
     * 
     * @return
     *     The value of the curBilLmt property.
     */
    public List<BilateralLimit3> getCurBilLmt() {
        if (curBilLmt == null) {
            curBilLmt = new ArrayList<>();
        }
        return this.curBilLmt;
    }

    /**
     * Gets the value of the stgOrdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stgOrdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStgOrdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandingOrder9 }
     * 
     * 
     * @return
     *     The value of the stgOrdr property.
     */
    public List<StandingOrder9> getStgOrdr() {
        if (stgOrdr == null) {
            stgOrdr = new ArrayList<>();
        }
        return this.stgOrdr;
    }

}
