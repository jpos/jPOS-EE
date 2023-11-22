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

package org.jpos.iso20022.semt_041_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountSubLevel12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountSubLevel12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}SecuritiesAccount19"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}PartyIdentification100"/>
 *         <element name="AcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}PartyIdentification100"/>
 *         <element name="BnfclOwnr" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}BeneficialOwner2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BalDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}AggregateHoldingBalance3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AcctSubLvl3" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}AccountSubLevel13" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AcctSubLvl3Diff" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}AggregateHoldingBalance2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSubLevel12", propOrder = {
    "acctId",
    "acctOwnr",
    "acctSvcr",
    "bnfclOwnr",
    "balDtls",
    "acctSubLvl3",
    "acctSubLvl3Diff",
    "splmtryData"
})
public class AccountSubLevel12 {

    @XmlElement(name = "AcctId", required = true)
    protected SecuritiesAccount19 acctId;
    @XmlElement(name = "AcctOwnr", required = true)
    protected PartyIdentification100 acctOwnr;
    @XmlElement(name = "AcctSvcr", required = true)
    protected PartyIdentification100 acctSvcr;
    @XmlElement(name = "BnfclOwnr")
    protected List<BeneficialOwner2> bnfclOwnr;
    @XmlElement(name = "BalDtls")
    protected List<AggregateHoldingBalance3> balDtls;
    @XmlElement(name = "AcctSubLvl3")
    protected List<AccountSubLevel13> acctSubLvl3;
    @XmlElement(name = "AcctSubLvl3Diff")
    protected List<AggregateHoldingBalance2> acctSubLvl3Diff;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setAcctId(SecuritiesAccount19 value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public void setAcctOwnr(PartyIdentification100 value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public void setAcctSvcr(PartyIdentification100 value) {
        this.acctSvcr = value;
    }

    /**
     * Gets the value of the bnfclOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bnfclOwnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnfclOwnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeneficialOwner2 }
     * 
     * 
     * @return
     *     The value of the bnfclOwnr property.
     */
    public List<BeneficialOwner2> getBnfclOwnr() {
        if (bnfclOwnr == null) {
            bnfclOwnr = new ArrayList<>();
        }
        return this.bnfclOwnr;
    }

    /**
     * Gets the value of the balDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregateHoldingBalance3 }
     * 
     * 
     * @return
     *     The value of the balDtls property.
     */
    public List<AggregateHoldingBalance3> getBalDtls() {
        if (balDtls == null) {
            balDtls = new ArrayList<>();
        }
        return this.balDtls;
    }

    /**
     * Gets the value of the acctSubLvl3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctSubLvl3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctSubLvl3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountSubLevel13 }
     * 
     * 
     * @return
     *     The value of the acctSubLvl3 property.
     */
    public List<AccountSubLevel13> getAcctSubLvl3() {
        if (acctSubLvl3 == null) {
            acctSubLvl3 = new ArrayList<>();
        }
        return this.acctSubLvl3;
    }

    /**
     * Gets the value of the acctSubLvl3Diff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctSubLvl3Diff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctSubLvl3Diff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregateHoldingBalance2 }
     * 
     * 
     * @return
     *     The value of the acctSubLvl3Diff property.
     */
    public List<AggregateHoldingBalance2> getAcctSubLvl3Diff() {
        if (acctSubLvl3Diff == null) {
            acctSubLvl3Diff = new ArrayList<>();
        }
        return this.acctSubLvl3Diff;
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
