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

package org.jpos.iso20022.semt_014_002_07;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraPositionDetails64 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntraPositionDetails64">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PoolId" type="{urn:iso:std:iso:20022:tech:xsd:semt.014.002.07}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:semt.014.002.07}PartyIdentification136Choice" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:semt.014.002.07}SecuritiesAccount30" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:semt.014.002.07}BlockChainAddressWallet7" minOccurs="0"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:semt.014.002.07}SecurityIdentification20"/>
 *         <element name="SttlmQty" type="{urn:iso:std:iso:20022:tech:xsd:semt.014.002.07}FinancialInstrumentQuantity36Choice"/>
 *         <element name="LotNb" type="{urn:iso:std:iso:20022:tech:xsd:semt.014.002.07}GenericIdentification39" minOccurs="0"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.014.002.07}DateAndDateTime2Choice"/>
 *         <element name="AckdStsTmStmp" type="{urn:iso:std:iso:20022:tech:xsd:semt.014.002.07}ISODateTime" minOccurs="0"/>
 *         <element name="BalFr" type="{urn:iso:std:iso:20022:tech:xsd:semt.014.002.07}SecuritiesBalanceType11Choice" minOccurs="0"/>
 *         <element name="BalTo" type="{urn:iso:std:iso:20022:tech:xsd:semt.014.002.07}SecuritiesBalanceType11Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraPositionDetails64", propOrder = {
    "poolId",
    "acctOwnr",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "finInstrmId",
    "sttlmQty",
    "lotNb",
    "sttlmDt",
    "ackdStsTmStmp",
    "balFr",
    "balTo"
})
public class IntraPositionDetails64 {

    @XmlElement(name = "PoolId")
    protected String poolId;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification136Choice acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount30 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet7 blckChainAdrOrWllt;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification20 finInstrmId;
    @XmlElement(name = "SttlmQty", required = true)
    protected FinancialInstrumentQuantity36Choice sttlmQty;
    @XmlElement(name = "LotNb")
    protected GenericIdentification39 lotNb;
    @XmlElement(name = "SttlmDt", required = true)
    protected DateAndDateTime2Choice sttlmDt;
    @XmlElement(name = "AckdStsTmStmp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ackdStsTmStmp;
    @XmlElement(name = "BalFr")
    protected SecuritiesBalanceType11Choice balFr;
    @XmlElement(name = "BalTo")
    protected SecuritiesBalanceType11Choice balTo;

    /**
     * Gets the value of the poolId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolId() {
        return poolId;
    }

    /**
     * Sets the value of the poolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolId(String value) {
        this.poolId = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136Choice }
     *     
     */
    public PartyIdentification136Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136Choice }
     *     
     */
    public void setAcctOwnr(PartyIdentification136Choice value) {
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
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public SecurityIdentification20 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification20 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the sttlmQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public FinancialInstrumentQuantity36Choice getSttlmQty() {
        return sttlmQty;
    }

    /**
     * Sets the value of the sttlmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public void setSttlmQty(FinancialInstrumentQuantity36Choice value) {
        this.sttlmQty = value;
    }

    /**
     * Gets the value of the lotNb property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification39 }
     *     
     */
    public GenericIdentification39 getLotNb() {
        return lotNb;
    }

    /**
     * Sets the value of the lotNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification39 }
     *     
     */
    public void setLotNb(GenericIdentification39 value) {
        this.lotNb = value;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setSttlmDt(DateAndDateTime2Choice value) {
        this.sttlmDt = value;
    }

    /**
     * Gets the value of the ackdStsTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAckdStsTmStmp() {
        return ackdStsTmStmp;
    }

    /**
     * Sets the value of the ackdStsTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAckdStsTmStmp(XMLGregorianCalendar value) {
        this.ackdStsTmStmp = value;
    }

    /**
     * Gets the value of the balFr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceType11Choice }
     *     
     */
    public SecuritiesBalanceType11Choice getBalFr() {
        return balFr;
    }

    /**
     * Sets the value of the balFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceType11Choice }
     *     
     */
    public void setBalFr(SecuritiesBalanceType11Choice value) {
        this.balFr = value;
    }

    /**
     * Gets the value of the balTo property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceType11Choice }
     *     
     */
    public SecuritiesBalanceType11Choice getBalTo() {
        return balTo;
    }

    /**
     * Sets the value of the balTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceType11Choice }
     *     
     */
    public void setBalTo(SecuritiesBalanceType11Choice value) {
        this.balTo = value;
    }

}
