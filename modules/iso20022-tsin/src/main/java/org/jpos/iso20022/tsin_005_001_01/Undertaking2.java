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

package org.jpos.iso20022.tsin_005_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Undertaking2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Undertaking2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}UndertakingName1Code" minOccurs="0"/>
 *         <element name="Bnfcry" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}PartyIdentification43" minOccurs="0"/>
 *         <element name="XpryDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}ExpiryDetails2" minOccurs="0"/>
 *         <element name="CntrUdrtkgAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}UndertakingAmount1" minOccurs="0"/>
 *         <element name="ConfChrgsPyblBy" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}ExternalTypeOfParty1Code" minOccurs="0"/>
 *         <element name="GovncRulesAndLaw" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}GovernanceRules1" minOccurs="0"/>
 *         <element name="StdClmDocInd" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}Max2000Text" maxOccurs="5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Undertaking2", propOrder = {
    "nm",
    "bnfcry",
    "xpryDtls",
    "cntrUdrtkgAmt",
    "confChrgsPyblBy",
    "govncRulesAndLaw",
    "stdClmDocInd",
    "addtlInf"
})
public class Undertaking2 {

    @XmlElement(name = "Nm")
    @XmlSchemaType(name = "string")
    protected UndertakingName1Code nm;
    @XmlElement(name = "Bnfcry")
    protected PartyIdentification43 bnfcry;
    @XmlElement(name = "XpryDtls")
    protected ExpiryDetails2 xpryDtls;
    @XmlElement(name = "CntrUdrtkgAmt")
    protected UndertakingAmount1 cntrUdrtkgAmt;
    @XmlElement(name = "ConfChrgsPyblBy")
    protected String confChrgsPyblBy;
    @XmlElement(name = "GovncRulesAndLaw")
    protected GovernanceRules1 govncRulesAndLaw;
    @XmlElement(name = "StdClmDocInd")
    protected Boolean stdClmDocInd;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingName1Code }
     *     
     */
    public UndertakingName1Code getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingName1Code }
     *     
     */
    public void setNm(UndertakingName1Code value) {
        this.nm = value;
    }

    /**
     * Gets the value of the bnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getBnfcry() {
        return bnfcry;
    }

    /**
     * Sets the value of the bnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setBnfcry(PartyIdentification43 value) {
        this.bnfcry = value;
    }

    /**
     * Gets the value of the xpryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDetails2 }
     *     
     */
    public ExpiryDetails2 getXpryDtls() {
        return xpryDtls;
    }

    /**
     * Sets the value of the xpryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDetails2 }
     *     
     */
    public void setXpryDtls(ExpiryDetails2 value) {
        this.xpryDtls = value;
    }

    /**
     * Gets the value of the cntrUdrtkgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmount1 }
     *     
     */
    public UndertakingAmount1 getCntrUdrtkgAmt() {
        return cntrUdrtkgAmt;
    }

    /**
     * Sets the value of the cntrUdrtkgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmount1 }
     *     
     */
    public void setCntrUdrtkgAmt(UndertakingAmount1 value) {
        this.cntrUdrtkgAmt = value;
    }

    /**
     * Gets the value of the confChrgsPyblBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfChrgsPyblBy() {
        return confChrgsPyblBy;
    }

    /**
     * Sets the value of the confChrgsPyblBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfChrgsPyblBy(String value) {
        this.confChrgsPyblBy = value;
    }

    /**
     * Gets the value of the govncRulesAndLaw property.
     * 
     * @return
     *     possible object is
     *     {@link GovernanceRules1 }
     *     
     */
    public GovernanceRules1 getGovncRulesAndLaw() {
        return govncRulesAndLaw;
    }

    /**
     * Sets the value of the govncRulesAndLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernanceRules1 }
     *     
     */
    public void setGovncRulesAndLaw(GovernanceRules1 value) {
        this.govncRulesAndLaw = value;
    }

    /**
     * Gets the value of the stdClmDocInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStdClmDocInd() {
        return stdClmDocInd;
    }

    /**
     * Sets the value of the stdClmDocInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStdClmDocInd(Boolean value) {
        this.stdClmDocInd = value;
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
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
