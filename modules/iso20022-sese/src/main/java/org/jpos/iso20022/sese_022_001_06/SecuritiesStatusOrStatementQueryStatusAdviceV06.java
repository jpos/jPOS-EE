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

package org.jpos.iso20022.sese_022_001_06;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesStatusOrStatementQueryStatusAdviceV06 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesStatusOrStatementQueryStatusAdviceV06">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="QryDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.022.001.06}DocumentIdentification54"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:sese.022.001.06}PartyIdentification144" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.022.001.06}SecuritiesAccount19" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:sese.022.001.06}BlockChainAddressWallet3" minOccurs="0"/>
 *         <element name="StsOrStmtReqd" type="{urn:iso:std:iso:20022:tech:xsd:sese.022.001.06}StatusOrStatement11Choice" minOccurs="0"/>
 *         <element name="PrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.022.001.06}ProcessingStatus89Choice"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:sese.022.001.06}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesStatusOrStatementQueryStatusAdviceV06", propOrder = {
    "qryDtls",
    "acctOwnr",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "stsOrStmtReqd",
    "prcgSts",
    "splmtryData"
})
public class SecuritiesStatusOrStatementQueryStatusAdviceV06 {

    @XmlElement(name = "QryDtls", required = true)
    protected DocumentIdentification54 qryDtls;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification144 acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet3 blckChainAdrOrWllt;
    @XmlElement(name = "StsOrStmtReqd")
    protected StatusOrStatement11Choice stsOrStmtReqd;
    @XmlElement(name = "PrcgSts", required = true)
    protected ProcessingStatus89Choice prcgSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the qryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification54 }
     *     
     */
    public DocumentIdentification54 getQryDtls() {
        return qryDtls;
    }

    /**
     * Sets the value of the qryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification54 }
     *     
     */
    public void setQryDtls(DocumentIdentification54 value) {
        this.qryDtls = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification144 }
     *     
     */
    public PartyIdentification144 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification144 }
     *     
     */
    public void setAcctOwnr(PartyIdentification144 value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public BlockChainAddressWallet3 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public void setBlckChainAdrOrWllt(BlockChainAddressWallet3 value) {
        this.blckChainAdrOrWllt = value;
    }

    /**
     * Gets the value of the stsOrStmtReqd property.
     * 
     * @return
     *     possible object is
     *     {@link StatusOrStatement11Choice }
     *     
     */
    public StatusOrStatement11Choice getStsOrStmtReqd() {
        return stsOrStmtReqd;
    }

    /**
     * Sets the value of the stsOrStmtReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusOrStatement11Choice }
     *     
     */
    public void setStsOrStmtReqd(StatusOrStatement11Choice value) {
        this.stsOrStmtReqd = value;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus89Choice }
     *     
     */
    public ProcessingStatus89Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus89Choice }
     *     
     */
    public void setPrcgSts(ProcessingStatus89Choice value) {
        this.prcgSts = value;
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
