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

package org.jpos.iso20022.seev_017_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesAccount12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesAccount12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.017.001.01}CreditDebitCode"/>
 *         <element name="AcctOwnrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.017.001.01}PartyIdentification2Choice" minOccurs="0"/>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:seev.017.001.01}Max35Text"/>
 *         <element name="BalTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.017.001.01}SecuritiesBalanceType6FormatChoice" minOccurs="0"/>
 *         <element name="SctyHldgForm" type="{urn:iso:std:iso:20022:tech:xsd:seev.017.001.01}FormOfSecurity1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccount12", propOrder = {
    "cdtDbtInd",
    "acctOwnrId",
    "acctId",
    "balTp",
    "sctyHldgForm"
})
public class SecuritiesAccount12 {

    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "AcctOwnrId")
    protected PartyIdentification2Choice acctOwnrId;
    @XmlElement(name = "AcctId", required = true)
    protected String acctId;
    @XmlElement(name = "BalTp")
    protected SecuritiesBalanceType6FormatChoice balTp;
    @XmlElement(name = "SctyHldgForm")
    @XmlSchemaType(name = "string")
    protected FormOfSecurity1Code sctyHldgForm;

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public void setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
    }

    /**
     * Gets the value of the acctOwnrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getAcctOwnrId() {
        return acctOwnrId;
    }

    /**
     * Sets the value of the acctOwnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public void setAcctOwnrId(PartyIdentification2Choice value) {
        this.acctOwnrId = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the balTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceType6FormatChoice }
     *     
     */
    public SecuritiesBalanceType6FormatChoice getBalTp() {
        return balTp;
    }

    /**
     * Sets the value of the balTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceType6FormatChoice }
     *     
     */
    public void setBalTp(SecuritiesBalanceType6FormatChoice value) {
        this.balTp = value;
    }

    /**
     * Gets the value of the sctyHldgForm property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public FormOfSecurity1Code getSctyHldgForm() {
        return sctyHldgForm;
    }

    /**
     * Sets the value of the sctyHldgForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public void setSctyHldgForm(FormOfSecurity1Code value) {
        this.sctyHldgForm = value;
    }

}
