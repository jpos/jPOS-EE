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

package org.jpos.iso20022.seev_050_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketClaimCreationV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MarketClaimCreationV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxRef" type="{urn:iso:std:iso:20022:tech:xsd:seev.050.001.01}References25"/>
 *         <element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.050.001.01}CorporateActionGeneralInformation157"/>
 *         <element name="RltdSttlmInstrDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.050.001.01}RelatedSettlementInstruction1"/>
 *         <element name="AcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.050.001.01}AccountIdentification46"/>
 *         <element name="CorpActnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.050.001.01}CorporateAction59" minOccurs="0"/>
 *         <element name="MktClmTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.050.001.01}MarketClaimType1Code"/>
 *         <element name="MktClmDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.050.001.01}CorporateActionOption185"/>
 *         <element name="DlvrgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:seev.050.001.01}SettlementParties75" minOccurs="0"/>
 *         <element name="RcvgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:seev.050.001.01}SettlementParties75" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.050.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketClaimCreationV01", propOrder = {
    "txRef",
    "corpActnGnlInf",
    "rltdSttlmInstrDtls",
    "acctDtls",
    "corpActnDtls",
    "mktClmTp",
    "mktClmDtls",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "splmtryData"
})
public class MarketClaimCreationV01 {

    @XmlElement(name = "TxRef", required = true)
    protected References25 txRef;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation157 corpActnGnlInf;
    @XmlElement(name = "RltdSttlmInstrDtls", required = true)
    protected RelatedSettlementInstruction1 rltdSttlmInstrDtls;
    @XmlElement(name = "AcctDtls", required = true)
    protected AccountIdentification46 acctDtls;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateAction59 corpActnDtls;
    @XmlElement(name = "MktClmTp", required = true)
    @XmlSchemaType(name = "string")
    protected MarketClaimType1Code mktClmTp;
    @XmlElement(name = "MktClmDtls", required = true)
    protected CorporateActionOption185 mktClmDtls;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties75 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties75 rcvgSttlmPties;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txRef property.
     * 
     * @return
     *     possible object is
     *     {@link References25 }
     *     
     */
    public References25 getTxRef() {
        return txRef;
    }

    /**
     * Sets the value of the txRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link References25 }
     *     
     */
    public void setTxRef(References25 value) {
        this.txRef = value;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation157 }
     *     
     */
    public CorporateActionGeneralInformation157 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation157 }
     *     
     */
    public void setCorpActnGnlInf(CorporateActionGeneralInformation157 value) {
        this.corpActnGnlInf = value;
    }

    /**
     * Gets the value of the rltdSttlmInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedSettlementInstruction1 }
     *     
     */
    public RelatedSettlementInstruction1 getRltdSttlmInstrDtls() {
        return rltdSttlmInstrDtls;
    }

    /**
     * Sets the value of the rltdSttlmInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedSettlementInstruction1 }
     *     
     */
    public void setRltdSttlmInstrDtls(RelatedSettlementInstruction1 value) {
        this.rltdSttlmInstrDtls = value;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification46 }
     *     
     */
    public AccountIdentification46 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification46 }
     *     
     */
    public void setAcctDtls(AccountIdentification46 value) {
        this.acctDtls = value;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction59 }
     *     
     */
    public CorporateAction59 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction59 }
     *     
     */
    public void setCorpActnDtls(CorporateAction59 value) {
        this.corpActnDtls = value;
    }

    /**
     * Gets the value of the mktClmTp property.
     * 
     * @return
     *     possible object is
     *     {@link MarketClaimType1Code }
     *     
     */
    public MarketClaimType1Code getMktClmTp() {
        return mktClmTp;
    }

    /**
     * Sets the value of the mktClmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketClaimType1Code }
     *     
     */
    public void setMktClmTp(MarketClaimType1Code value) {
        this.mktClmTp = value;
    }

    /**
     * Gets the value of the mktClmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption185 }
     *     
     */
    public CorporateActionOption185 getMktClmDtls() {
        return mktClmDtls;
    }

    /**
     * Sets the value of the mktClmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption185 }
     *     
     */
    public void setMktClmDtls(CorporateActionOption185 value) {
        this.mktClmDtls = value;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties75 }
     *     
     */
    public SettlementParties75 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties75 }
     *     
     */
    public void setDlvrgSttlmPties(SettlementParties75 value) {
        this.dlvrgSttlmPties = value;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties75 }
     *     
     */
    public SettlementParties75 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties75 }
     *     
     */
    public void setRcvgSttlmPties(SettlementParties75 value) {
        this.rcvgSttlmPties = value;
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
