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

package org.jpos.iso20022.seev_013_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentCAElectionAmendmentRequestV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgentCAElectionAmendmentRequestV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.013.001.01}DocumentIdentification8"/>
 *         <element name="AgtCAElctnAdvcId" type="{urn:iso:std:iso:20022:tech:xsd:seev.013.001.01}DocumentIdentification8"/>
 *         <element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.013.001.01}CorporateActionInformation1"/>
 *         <element name="AcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.013.001.01}SecuritiesAccount7"/>
 *         <element name="OrgnlElctnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.013.001.01}CorporateActionElection1"/>
 *         <element name="AmddElctnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.013.001.01}CorporateActionElection2"/>
 *         <element name="CtctDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.013.001.01}ContactPerson1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCAElectionAmendmentRequestV01", propOrder = {
    "id",
    "agtCAElctnAdvcId",
    "corpActnGnlInf",
    "acctDtls",
    "orgnlElctnDtls",
    "amddElctnDtls",
    "ctctDtls"
})
public class AgentCAElectionAmendmentRequestV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCAElctnAdvcId", required = true)
    protected DocumentIdentification8 agtCAElctnAdvcId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation1 corpActnGnlInf;
    @XmlElement(name = "AcctDtls", required = true)
    protected SecuritiesAccount7 acctDtls;
    @XmlElement(name = "OrgnlElctnDtls", required = true)
    protected CorporateActionElection1 orgnlElctnDtls;
    @XmlElement(name = "AmddElctnDtls", required = true)
    protected CorporateActionElection2 amddElctnDtls;
    @XmlElement(name = "CtctDtls")
    protected ContactPerson1 ctctDtls;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setId(DocumentIdentification8 value) {
        this.id = value;
    }

    /**
     * Gets the value of the agtCAElctnAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAElctnAdvcId() {
        return agtCAElctnAdvcId;
    }

    /**
     * Sets the value of the agtCAElctnAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCAElctnAdvcId(DocumentIdentification8 value) {
        this.agtCAElctnAdvcId = value;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInformation1 }
     *     
     */
    public CorporateActionInformation1 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInformation1 }
     *     
     */
    public void setCorpActnGnlInf(CorporateActionInformation1 value) {
        this.corpActnGnlInf = value;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount7 }
     *     
     */
    public SecuritiesAccount7 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount7 }
     *     
     */
    public void setAcctDtls(SecuritiesAccount7 value) {
        this.acctDtls = value;
    }

    /**
     * Gets the value of the orgnlElctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionElection1 }
     *     
     */
    public CorporateActionElection1 getOrgnlElctnDtls() {
        return orgnlElctnDtls;
    }

    /**
     * Sets the value of the orgnlElctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionElection1 }
     *     
     */
    public void setOrgnlElctnDtls(CorporateActionElection1 value) {
        this.orgnlElctnDtls = value;
    }

    /**
     * Gets the value of the amddElctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionElection2 }
     *     
     */
    public CorporateActionElection2 getAmddElctnDtls() {
        return amddElctnDtls;
    }

    /**
     * Sets the value of the amddElctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionElection2 }
     *     
     */
    public void setAmddElctnDtls(CorporateActionElection2 value) {
        this.amddElctnDtls = value;
    }

    /**
     * Gets the value of the ctctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPerson1 }
     *     
     */
    public ContactPerson1 getCtctDtls() {
        return ctctDtls;
    }

    /**
     * Sets the value of the ctctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPerson1 }
     *     
     */
    public void setCtctDtls(ContactPerson1 value) {
        this.ctctDtls = value;
    }

}
