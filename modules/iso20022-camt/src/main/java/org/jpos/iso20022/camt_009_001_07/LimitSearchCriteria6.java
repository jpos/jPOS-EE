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

package org.jpos.iso20022.camt_009_001_07;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitSearchCriteria6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LimitSearchCriteria6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SysId" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}SystemIdentification2Choice" minOccurs="0"/>
 *         <element name="BilLmtCtrPtyId" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}BranchAndFinancialInstitutionIdentification6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DfltLmtTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}LimitType1Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CurLmtTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}LimitType1Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}AccountIdentification4Choice" minOccurs="0"/>
 *         <element name="UsdAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}ActiveAmountRange3Choice" minOccurs="0"/>
 *         <element name="UsdPctg" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}PercentageRange1Choice" minOccurs="0"/>
 *         <element name="LmtCcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="LmtAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}ActiveAmountRange3Choice" minOccurs="0"/>
 *         <element name="LmtVldAsOfDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}DateAndPeriod2Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitSearchCriteria6", propOrder = {
    "sysId",
    "bilLmtCtrPtyId",
    "dfltLmtTp",
    "curLmtTp",
    "acctOwnr",
    "acctId",
    "usdAmt",
    "usdPctg",
    "lmtCcy",
    "lmtAmt",
    "lmtVldAsOfDt"
})
public class LimitSearchCriteria6 {

    @XmlElement(name = "SysId")
    protected SystemIdentification2Choice sysId;
    @XmlElement(name = "BilLmtCtrPtyId")
    protected List<BranchAndFinancialInstitutionIdentification6> bilLmtCtrPtyId;
    @XmlElement(name = "DfltLmtTp")
    protected List<LimitType1Choice> dfltLmtTp;
    @XmlElement(name = "CurLmtTp")
    protected List<LimitType1Choice> curLmtTp;
    @XmlElement(name = "AcctOwnr")
    protected BranchAndFinancialInstitutionIdentification6 acctOwnr;
    @XmlElement(name = "AcctId")
    protected AccountIdentification4Choice acctId;
    @XmlElement(name = "UsdAmt")
    protected ActiveAmountRange3Choice usdAmt;
    @XmlElement(name = "UsdPctg")
    protected PercentageRange1Choice usdPctg;
    @XmlElement(name = "LmtCcy")
    protected String lmtCcy;
    @XmlElement(name = "LmtAmt")
    protected ActiveAmountRange3Choice lmtAmt;
    @XmlElement(name = "LmtVldAsOfDt")
    protected DateAndPeriod2Choice lmtVldAsOfDt;

    /**
     * Gets the value of the sysId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemIdentification2Choice }
     *     
     */
    public SystemIdentification2Choice getSysId() {
        return sysId;
    }

    /**
     * Sets the value of the sysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemIdentification2Choice }
     *     
     */
    public void setSysId(SystemIdentification2Choice value) {
        this.sysId = value;
    }

    /**
     * Gets the value of the bilLmtCtrPtyId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bilLmtCtrPtyId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBilLmtCtrPtyId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BranchAndFinancialInstitutionIdentification6 }
     * 
     * 
     * @return
     *     The value of the bilLmtCtrPtyId property.
     */
    public List<BranchAndFinancialInstitutionIdentification6> getBilLmtCtrPtyId() {
        if (bilLmtCtrPtyId == null) {
            bilLmtCtrPtyId = new ArrayList<>();
        }
        return this.bilLmtCtrPtyId;
    }

    /**
     * Gets the value of the dfltLmtTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dfltLmtTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDfltLmtTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitType1Choice }
     * 
     * 
     * @return
     *     The value of the dfltLmtTp property.
     */
    public List<LimitType1Choice> getDfltLmtTp() {
        if (dfltLmtTp == null) {
            dfltLmtTp = new ArrayList<>();
        }
        return this.dfltLmtTp;
    }

    /**
     * Gets the value of the curLmtTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the curLmtTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurLmtTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitType1Choice }
     * 
     * 
     * @return
     *     The value of the curLmtTp property.
     */
    public List<LimitType1Choice> getCurLmtTp() {
        if (curLmtTp == null) {
            curLmtTp = new ArrayList<>();
        }
        return this.curLmtTp;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setAcctOwnr(BranchAndFinancialInstitutionIdentification6 value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public void setAcctId(AccountIdentification4Choice value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the usdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveAmountRange3Choice }
     *     
     */
    public ActiveAmountRange3Choice getUsdAmt() {
        return usdAmt;
    }

    /**
     * Sets the value of the usdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveAmountRange3Choice }
     *     
     */
    public void setUsdAmt(ActiveAmountRange3Choice value) {
        this.usdAmt = value;
    }

    /**
     * Gets the value of the usdPctg property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageRange1Choice }
     *     
     */
    public PercentageRange1Choice getUsdPctg() {
        return usdPctg;
    }

    /**
     * Sets the value of the usdPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageRange1Choice }
     *     
     */
    public void setUsdPctg(PercentageRange1Choice value) {
        this.usdPctg = value;
    }

    /**
     * Gets the value of the lmtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLmtCcy() {
        return lmtCcy;
    }

    /**
     * Sets the value of the lmtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLmtCcy(String value) {
        this.lmtCcy = value;
    }

    /**
     * Gets the value of the lmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveAmountRange3Choice }
     *     
     */
    public ActiveAmountRange3Choice getLmtAmt() {
        return lmtAmt;
    }

    /**
     * Sets the value of the lmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveAmountRange3Choice }
     *     
     */
    public void setLmtAmt(ActiveAmountRange3Choice value) {
        this.lmtAmt = value;
    }

    /**
     * Gets the value of the lmtVldAsOfDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndPeriod2Choice }
     *     
     */
    public DateAndPeriod2Choice getLmtVldAsOfDt() {
        return lmtVldAsOfDt;
    }

    /**
     * Sets the value of the lmtVldAsOfDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndPeriod2Choice }
     *     
     */
    public void setLmtVldAsOfDt(DateAndPeriod2Choice value) {
        this.lmtVldAsOfDt = value;
    }

}
