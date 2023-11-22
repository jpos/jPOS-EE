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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeneficialOwner2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BeneficialOwner2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BnfclOwnrId" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}PartyIdentification100"/>
 *         <element name="AddtlId" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}AlternateIdentification4" minOccurs="0"/>
 *         <element name="Ntlty" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}CountryCode" minOccurs="0"/>
 *         <element name="DmclCtry" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}CountryCode" minOccurs="0"/>
 *         <element name="NonDmclCtry" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}CountryCode" minOccurs="0"/>
 *         <element name="CertfctnInd" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}YesNoIndicator" minOccurs="0"/>
 *         <element name="CertfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}BeneficiaryCertificationType9Choice" minOccurs="0"/>
 *         <element name="DclrtnDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeneficialOwner2", propOrder = {
    "bnfclOwnrId",
    "addtlId",
    "ntlty",
    "dmclCtry",
    "nonDmclCtry",
    "certfctnInd",
    "certfctnTp",
    "dclrtnDtls"
})
public class BeneficialOwner2 {

    @XmlElement(name = "BnfclOwnrId", required = true)
    protected PartyIdentification100 bnfclOwnrId;
    @XmlElement(name = "AddtlId")
    protected AlternateIdentification4 addtlId;
    @XmlElement(name = "Ntlty")
    protected String ntlty;
    @XmlElement(name = "DmclCtry")
    protected String dmclCtry;
    @XmlElement(name = "NonDmclCtry")
    protected String nonDmclCtry;
    @XmlElement(name = "CertfctnInd")
    protected Boolean certfctnInd;
    @XmlElement(name = "CertfctnTp")
    protected BeneficiaryCertificationType9Choice certfctnTp;
    @XmlElement(name = "DclrtnDtls")
    protected String dclrtnDtls;

    /**
     * Gets the value of the bnfclOwnrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getBnfclOwnrId() {
        return bnfclOwnrId;
    }

    /**
     * Sets the value of the bnfclOwnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public void setBnfclOwnrId(PartyIdentification100 value) {
        this.bnfclOwnrId = value;
    }

    /**
     * Gets the value of the addtlId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateIdentification4 }
     *     
     */
    public AlternateIdentification4 getAddtlId() {
        return addtlId;
    }

    /**
     * Sets the value of the addtlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateIdentification4 }
     *     
     */
    public void setAddtlId(AlternateIdentification4 value) {
        this.addtlId = value;
    }

    /**
     * Gets the value of the ntlty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtlty() {
        return ntlty;
    }

    /**
     * Sets the value of the ntlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtlty(String value) {
        this.ntlty = value;
    }

    /**
     * Gets the value of the dmclCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmclCtry() {
        return dmclCtry;
    }

    /**
     * Sets the value of the dmclCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmclCtry(String value) {
        this.dmclCtry = value;
    }

    /**
     * Gets the value of the nonDmclCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonDmclCtry() {
        return nonDmclCtry;
    }

    /**
     * Sets the value of the nonDmclCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonDmclCtry(String value) {
        this.nonDmclCtry = value;
    }

    /**
     * Gets the value of the certfctnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCertfctnInd() {
        return certfctnInd;
    }

    /**
     * Sets the value of the certfctnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCertfctnInd(Boolean value) {
        this.certfctnInd = value;
    }

    /**
     * Gets the value of the certfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryCertificationType9Choice }
     *     
     */
    public BeneficiaryCertificationType9Choice getCertfctnTp() {
        return certfctnTp;
    }

    /**
     * Sets the value of the certfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryCertificationType9Choice }
     *     
     */
    public void setCertfctnTp(BeneficiaryCertificationType9Choice value) {
        this.certfctnTp = value;
    }

    /**
     * Gets the value of the dclrtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDclrtnDtls() {
        return dclrtnDtls;
    }

    /**
     * Sets the value of the dclrtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDclrtnDtls(String value) {
        this.dclrtnDtls = value;
    }

}
