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

package org.jpos.iso20022.seev_035_002_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionNarrative53 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionNarrative53">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AddtlTxt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}UpdatedAdditionalInformation5" minOccurs="0"/>
 *         <element name="NrrtvVrsn" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}UpdatedAdditionalInformation5" minOccurs="0"/>
 *         <element name="InfConds" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}UpdatedAdditionalInformation5" minOccurs="0"/>
 *         <element name="InfToCmplyWth" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}UpdatedAdditionalInformation5" minOccurs="0"/>
 *         <element name="TaxtnConds" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}UpdatedAdditionalInformation5" minOccurs="0"/>
 *         <element name="Dsclmr" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}UpdatedAdditionalInformation5" minOccurs="0"/>
 *         <element name="PtyCtctNrrtv" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}UpdatedAdditionalInformation5" minOccurs="0"/>
 *         <element name="RegnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}UpdatedAdditionalInformation5" minOccurs="0"/>
 *         <element name="BsktOrIndxInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}UpdatedAdditionalInformation5" minOccurs="0"/>
 *         <element name="CertfctnBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}UpdatedAdditionalInformation5" minOccurs="0"/>
 *         <element name="PrcgTxtForNxtIntrmy" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}UpdatedAdditionalInformation1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNarrative53", propOrder = {
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
public class CorporateActionNarrative53 {

    @XmlElement(name = "AddtlTxt")
    protected UpdatedAdditionalInformation5 addtlTxt;
    @XmlElement(name = "NrrtvVrsn")
    protected UpdatedAdditionalInformation5 nrrtvVrsn;
    @XmlElement(name = "InfConds")
    protected UpdatedAdditionalInformation5 infConds;
    @XmlElement(name = "InfToCmplyWth")
    protected UpdatedAdditionalInformation5 infToCmplyWth;
    @XmlElement(name = "TaxtnConds")
    protected UpdatedAdditionalInformation5 taxtnConds;
    @XmlElement(name = "Dsclmr")
    protected UpdatedAdditionalInformation5 dsclmr;
    @XmlElement(name = "PtyCtctNrrtv")
    protected UpdatedAdditionalInformation5 ptyCtctNrrtv;
    @XmlElement(name = "RegnDtls")
    protected UpdatedAdditionalInformation5 regnDtls;
    @XmlElement(name = "BsktOrIndxInf")
    protected UpdatedAdditionalInformation5 bsktOrIndxInf;
    @XmlElement(name = "CertfctnBrkdwn")
    protected UpdatedAdditionalInformation5 certfctnBrkdwn;
    @XmlElement(name = "PrcgTxtForNxtIntrmy")
    protected UpdatedAdditionalInformation1 prcgTxtForNxtIntrmy;

    /**
     * Gets the value of the addtlTxt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public UpdatedAdditionalInformation5 getAddtlTxt() {
        return addtlTxt;
    }

    /**
     * Sets the value of the addtlTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public void setAddtlTxt(UpdatedAdditionalInformation5 value) {
        this.addtlTxt = value;
    }

    /**
     * Gets the value of the nrrtvVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public UpdatedAdditionalInformation5 getNrrtvVrsn() {
        return nrrtvVrsn;
    }

    /**
     * Sets the value of the nrrtvVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public void setNrrtvVrsn(UpdatedAdditionalInformation5 value) {
        this.nrrtvVrsn = value;
    }

    /**
     * Gets the value of the infConds property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public UpdatedAdditionalInformation5 getInfConds() {
        return infConds;
    }

    /**
     * Sets the value of the infConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public void setInfConds(UpdatedAdditionalInformation5 value) {
        this.infConds = value;
    }

    /**
     * Gets the value of the infToCmplyWth property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public UpdatedAdditionalInformation5 getInfToCmplyWth() {
        return infToCmplyWth;
    }

    /**
     * Sets the value of the infToCmplyWth property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public void setInfToCmplyWth(UpdatedAdditionalInformation5 value) {
        this.infToCmplyWth = value;
    }

    /**
     * Gets the value of the taxtnConds property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public UpdatedAdditionalInformation5 getTaxtnConds() {
        return taxtnConds;
    }

    /**
     * Sets the value of the taxtnConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public void setTaxtnConds(UpdatedAdditionalInformation5 value) {
        this.taxtnConds = value;
    }

    /**
     * Gets the value of the dsclmr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public UpdatedAdditionalInformation5 getDsclmr() {
        return dsclmr;
    }

    /**
     * Sets the value of the dsclmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public void setDsclmr(UpdatedAdditionalInformation5 value) {
        this.dsclmr = value;
    }

    /**
     * Gets the value of the ptyCtctNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public UpdatedAdditionalInformation5 getPtyCtctNrrtv() {
        return ptyCtctNrrtv;
    }

    /**
     * Sets the value of the ptyCtctNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public void setPtyCtctNrrtv(UpdatedAdditionalInformation5 value) {
        this.ptyCtctNrrtv = value;
    }

    /**
     * Gets the value of the regnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public UpdatedAdditionalInformation5 getRegnDtls() {
        return regnDtls;
    }

    /**
     * Sets the value of the regnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public void setRegnDtls(UpdatedAdditionalInformation5 value) {
        this.regnDtls = value;
    }

    /**
     * Gets the value of the bsktOrIndxInf property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public UpdatedAdditionalInformation5 getBsktOrIndxInf() {
        return bsktOrIndxInf;
    }

    /**
     * Sets the value of the bsktOrIndxInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public void setBsktOrIndxInf(UpdatedAdditionalInformation5 value) {
        this.bsktOrIndxInf = value;
    }

    /**
     * Gets the value of the certfctnBrkdwn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public UpdatedAdditionalInformation5 getCertfctnBrkdwn() {
        return certfctnBrkdwn;
    }

    /**
     * Sets the value of the certfctnBrkdwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation5 }
     *     
     */
    public void setCertfctnBrkdwn(UpdatedAdditionalInformation5 value) {
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
