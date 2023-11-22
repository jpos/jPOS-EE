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

package org.jpos.iso20022.auth_072_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssuerCSDReport1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IssuerCSDReport1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}IssuerCSDIdentification1"/>
 *         <element name="OvrllTtl" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationData1"/>
 *         <element name="FinInstrm" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}SettlementInternaliserFinancialInstrument1"/>
 *         <element name="TxTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}SettlementInternaliserTransactionType1"/>
 *         <element name="ClntTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}SettlementInternaliserClientType1"/>
 *         <element name="TtlCshTrf" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationData1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuerCSDReport1", propOrder = {
    "id",
    "ovrllTtl",
    "finInstrm",
    "txTp",
    "clntTp",
    "ttlCshTrf"
})
public class IssuerCSDReport1 {

    @XmlElement(name = "Id", required = true)
    protected IssuerCSDIdentification1 id;
    @XmlElement(name = "OvrllTtl", required = true)
    protected InternalisationData1 ovrllTtl;
    @XmlElement(name = "FinInstrm", required = true)
    protected SettlementInternaliserFinancialInstrument1 finInstrm;
    @XmlElement(name = "TxTp", required = true)
    protected SettlementInternaliserTransactionType1 txTp;
    @XmlElement(name = "ClntTp", required = true)
    protected SettlementInternaliserClientType1 clntTp;
    @XmlElement(name = "TtlCshTrf", required = true)
    protected InternalisationData1 ttlCshTrf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerCSDIdentification1 }
     *     
     */
    public IssuerCSDIdentification1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerCSDIdentification1 }
     *     
     */
    public void setId(IssuerCSDIdentification1 value) {
        this.id = value;
    }

    /**
     * Gets the value of the ovrllTtl property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getOvrllTtl() {
        return ovrllTtl;
    }

    /**
     * Sets the value of the ovrllTtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public void setOvrllTtl(InternalisationData1 value) {
        this.ovrllTtl = value;
    }

    /**
     * Gets the value of the finInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInternaliserFinancialInstrument1 }
     *     
     */
    public SettlementInternaliserFinancialInstrument1 getFinInstrm() {
        return finInstrm;
    }

    /**
     * Sets the value of the finInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInternaliserFinancialInstrument1 }
     *     
     */
    public void setFinInstrm(SettlementInternaliserFinancialInstrument1 value) {
        this.finInstrm = value;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInternaliserTransactionType1 }
     *     
     */
    public SettlementInternaliserTransactionType1 getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInternaliserTransactionType1 }
     *     
     */
    public void setTxTp(SettlementInternaliserTransactionType1 value) {
        this.txTp = value;
    }

    /**
     * Gets the value of the clntTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInternaliserClientType1 }
     *     
     */
    public SettlementInternaliserClientType1 getClntTp() {
        return clntTp;
    }

    /**
     * Sets the value of the clntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInternaliserClientType1 }
     *     
     */
    public void setClntTp(SettlementInternaliserClientType1 value) {
        this.clntTp = value;
    }

    /**
     * Gets the value of the ttlCshTrf property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getTtlCshTrf() {
        return ttlCshTrf;
    }

    /**
     * Sets the value of the ttlCshTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public void setTtlCshTrf(InternalisationData1 value) {
        this.ttlCshTrf = value;
    }

}
