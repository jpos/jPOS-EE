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

package org.jpos.iso20022.seev_051_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketClaimCancellationRequestV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MarketClaimCancellationRequestV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MktClmCreId" type="{urn:iso:std:iso:20022:tech:xsd:seev.051.001.01}DocumentIdentification9"/>
 *         <element name="TxRef" type="{urn:iso:std:iso:20022:tech:xsd:seev.051.001.01}References26"/>
 *         <element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.051.001.01}CorporateActionGeneralInformation157"/>
 *         <element name="AcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.051.001.01}AccountIdentification46"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.051.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketClaimCancellationRequestV01", propOrder = {
    "mktClmCreId",
    "txRef",
    "corpActnGnlInf",
    "acctDtls",
    "splmtryData"
})
public class MarketClaimCancellationRequestV01 {

    @XmlElement(name = "MktClmCreId", required = true)
    protected DocumentIdentification9 mktClmCreId;
    @XmlElement(name = "TxRef", required = true)
    protected References26 txRef;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation157 corpActnGnlInf;
    @XmlElement(name = "AcctDtls", required = true)
    protected AccountIdentification46 acctDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the mktClmCreId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification9 }
     *     
     */
    public DocumentIdentification9 getMktClmCreId() {
        return mktClmCreId;
    }

    /**
     * Sets the value of the mktClmCreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification9 }
     *     
     */
    public void setMktClmCreId(DocumentIdentification9 value) {
        this.mktClmCreId = value;
    }

    /**
     * Gets the value of the txRef property.
     * 
     * @return
     *     possible object is
     *     {@link References26 }
     *     
     */
    public References26 getTxRef() {
        return txRef;
    }

    /**
     * Sets the value of the txRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link References26 }
     *     
     */
    public void setTxRef(References26 value) {
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
