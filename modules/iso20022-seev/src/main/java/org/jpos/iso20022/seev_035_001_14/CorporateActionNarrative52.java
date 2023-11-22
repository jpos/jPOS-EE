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

package org.jpos.iso20022.seev_035_001_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionNarrative52 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionNarrative52">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AddtlTxt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}UpdatedAdditionalInformation1" minOccurs="0"/>
 *         <element name="NrrtvVrsn" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}UpdatedAdditionalInformation1" minOccurs="0"/>
 *         <element name="InfConds" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}UpdatedAdditionalInformation1" minOccurs="0"/>
 *         <element name="InfToCmplyWth" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}UpdatedAdditionalInformation1" minOccurs="0"/>
 *         <element name="TaxtnConds" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}UpdatedAdditionalInformation1" minOccurs="0"/>
 *         <element name="Dsclmr" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}UpdatedAdditionalInformation1" minOccurs="0"/>
 *         <element name="PtyCtctNrrtv" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}UpdatedAdditionalInformation1" minOccurs="0"/>
 *         <element name="RegnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}UpdatedAdditionalInformation1" minOccurs="0"/>
 *         <element name="BsktOrIndxInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}UpdatedAdditionalInformation1" minOccurs="0"/>
 *         <element name="CertfctnBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}UpdatedAdditionalInformation1" minOccurs="0"/>
 *         <element name="PrcgTxtForNxtIntrmy" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}UpdatedAdditionalInformation1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNarrative52", propOrder = {
    "addtlTxt",
    "nrrtvVrsn",
    "infConds",
    "infToCmplyWth",
    "taxtnConds",
    "dsclmr",
    "ptyCtctNrrtv",
    "regnDtls",
    "bsktOrIndxInf",
    "certfctnBrkdwn",
    "prcgTxtForNxtIntrmy"
})
public class CorporateActionNarrative52 {

    @XmlElement(name = "AddtlTxt")
    protected UpdatedAdditionalInformation1 addtlTxt;
    @XmlElement(name = "NrrtvVrsn")
    protected UpdatedAdditionalInformation1 nrrtvVrsn;
    @XmlElement(name = "InfConds")
    protected UpdatedAdditionalInformation1 infConds;
    @XmlElement(name = "InfToCmplyWth")
    protected UpdatedAdditionalInformation1 infToCmplyWth;
    @XmlElement(name = "TaxtnConds")
    protected UpdatedAdditionalInformation1 taxtnConds;
    @XmlElement(name = "Dsclmr")
    protected UpdatedAdditionalInformation1 dsclmr;
    @XmlElement(name = "PtyCtctNrrtv")
    protected UpdatedAdditionalInformation1 ptyCtctNrrtv;
    @XmlElement(name = "RegnDtls")
    protected UpdatedAdditionalInformation1 regnDtls;
    @XmlElement(name = "BsktOrIndxInf")
    protected UpdatedAdditionalInformation1 bsktOrIndxInf;
    @XmlElement(name = "CertfctnBrkdwn")
    protected UpdatedAdditionalInformation1 certfctnBrkdwn;
    @XmlElement(name = "PrcgTxtForNxtIntrmy")
    protected UpdatedAdditionalInformation1 prcgTxtForNxtIntrmy;

    /**
     * Gets the value of the addtlTxt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getAddtlTxt() {
        return addtlTxt;
    }

    /**
     * Sets the value of the addtlTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public void setAddtlTxt(UpdatedAdditionalInformation1 value) {
        this.addtlTxt = value;
    }

    /**
     * Gets the value of the nrrtvVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getNrrtvVrsn() {
        return nrrtvVrsn;
    }

    /**
     * Sets the value of the nrrtvVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public void setNrrtvVrsn(UpdatedAdditionalInformation1 value) {
        this.nrrtvVrsn = value;
    }

    /**
     * Gets the value of the infConds property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getInfConds() {
        return infConds;
    }

    /**
     * Sets the value of the infConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public void setInfConds(UpdatedAdditionalInformation1 value) {
        this.infConds = value;
    }

    /**
     * Gets the value of the infToCmplyWth property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getInfToCmplyWth() {
        return infToCmplyWth;
    }

    /**
     * Sets the value of the infToCmplyWth property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public void setInfToCmplyWth(UpdatedAdditionalInformation1 value) {
        this.infToCmplyWth = value;
    }

    /**
     * Gets the value of the taxtnConds property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getTaxtnConds() {
        return taxtnConds;
    }

    /**
     * Sets the value of the taxtnConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public void setTaxtnConds(UpdatedAdditionalInformation1 value) {
        this.taxtnConds = value;
    }

    /**
     * Gets the value of the dsclmr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getDsclmr() {
        return dsclmr;
    }

    /**
     * Sets the value of the dsclmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public void setDsclmr(UpdatedAdditionalInformation1 value) {
        this.dsclmr = value;
    }

    /**
     * Gets the value of the ptyCtctNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getPtyCtctNrrtv() {
        return ptyCtctNrrtv;
    }

    /**
     * Sets the value of the ptyCtctNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public void setPtyCtctNrrtv(UpdatedAdditionalInformation1 value) {
        this.ptyCtctNrrtv = value;
    }

    /**
     * Gets the value of the regnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getRegnDtls() {
        return regnDtls;
    }

    /**
     * Sets the value of the regnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public void setRegnDtls(UpdatedAdditionalInformation1 value) {
        this.regnDtls = value;
    }

    /**
     * Gets the value of the bsktOrIndxInf property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getBsktOrIndxInf() {
        return bsktOrIndxInf;
    }

    /**
     * Sets the value of the bsktOrIndxInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public void setBsktOrIndxInf(UpdatedAdditionalInformation1 value) {
        this.bsktOrIndxInf = value;
    }

    /**
     * Gets the value of the certfctnBrkdwn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getCertfctnBrkdwn() {
        return certfctnBrkdwn;
    }

    /**
     * Sets the value of the certfctnBrkdwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public void setCertfctnBrkdwn(UpdatedAdditionalInformation1 value) {
        this.certfctnBrkdwn = value;
    }

    /**
     * Gets the value of the prcgTxtForNxtIntrmy property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getPrcgTxtForNxtIntrmy() {
        return prcgTxtForNxtIntrmy;
    }

    /**
     * Sets the value of the prcgTxtForNxtIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public void setPrcgTxtForNxtIntrmy(UpdatedAdditionalInformation1 value) {
        this.prcgTxtForNxtIntrmy = value;
    }

}
