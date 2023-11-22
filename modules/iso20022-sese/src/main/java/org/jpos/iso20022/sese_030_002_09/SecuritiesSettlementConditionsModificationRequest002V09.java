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

package org.jpos.iso20022.sese_030_002_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesSettlementConditionsModificationRequest002V09 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesSettlementConditionsModificationRequest002V09">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:sese.030.002.09}PartyIdentification156" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.030.002.09}SecuritiesAccount30" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:sese.030.002.09}BlockChainAddressWallet7" minOccurs="0"/>
 *         <element name="ReqDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.030.002.09}RequestDetails29" maxOccurs="unbounded"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.030.002.09}AdditionalInformation28" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:sese.030.002.09}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementConditionsModificationRequest002V09", propOrder = {
    "acctOwnr",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "reqDtls",
    "addtlInf",
    "splmtryData"
})
public class SecuritiesSettlementConditionsModificationRequest002V09 {

    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification156 acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount30 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet7 blckChainAdrOrWllt;
    @XmlElement(name = "ReqDtls", required = true)
    protected List<RequestDetails29> reqDtls;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation28> addtlInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification156 }
     *     
     */
    public PartyIdentification156 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification156 }
     *     
     */
    public void setAcctOwnr(PartyIdentification156 value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount30 }
     *     
     */
    public SecuritiesAccount30 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount30 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount30 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet7 }
     *     
     */
    public BlockChainAddressWallet7 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet7 }
     *     
     */
    public void setBlckChainAdrOrWllt(BlockChainAddressWallet7 value) {
        this.blckChainAdrOrWllt = value;
    }

    /**
     * Gets the value of the reqDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reqDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestDetails29 }
     * 
     * 
     * @return
     *     The value of the reqDtls property.
     */
    public List<RequestDetails29> getReqDtls() {
        if (reqDtls == null) {
            reqDtls = new ArrayList<>();
        }
        return this.reqDtls;
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
     * {@link AdditionalInformation28 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation28> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
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
