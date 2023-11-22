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
 * <p>Java class for CorporateActionNarrative29 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionNarrative29">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AddtlTxt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}UpdatedAdditionalInformation3" minOccurs="0"/>
 *         <element name="NrrtvVrsn" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}UpdatedAdditionalInformation3" minOccurs="0"/>
 *         <element name="InfConds" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}UpdatedAdditionalInformation1" minOccurs="0"/>
 *         <element name="InfToCmplyWth" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}UpdatedAdditionalInformation1" minOccurs="0"/>
 *         <element name="SctyRstrctn" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}UpdatedAdditionalInformation1" minOccurs="0"/>
 *         <element name="TaxtnConds" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}UpdatedAdditionalInformation1" minOccurs="0"/>
 *         <element name="Dsclmr" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}UpdatedAdditionalInformation1" minOccurs="0"/>
 *         <element name="CertfctnBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}UpdatedAdditionalInformation1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNarrative29", propOrder = {
    "addtlTxt",
    "nrrtvVrsn",
    "infConds",
    "infToCmplyWth",
    "sctyRstrctn",
    "taxtnConds",
    "dsclmr",
    "certfctnBrkdwn"
})
public class CorporateActionNarrative29 {

    @XmlElement(name = "AddtlTxt")
    protected UpdatedAdditionalInformation3 addtlTxt;
    @XmlElement(name = "NrrtvVrsn")
    protected UpdatedAdditionalInformation3 nrrtvVrsn;
    @XmlElement(name = "InfConds")
    protected UpdatedAdditionalInformation1 infConds;
    @XmlElement(name = "InfToCmplyWth")
    protected UpdatedAdditionalInformation1 infToCmplyWth;
    @XmlElement(name = "SctyRstrctn")
    protected UpdatedAdditionalInformation1 sctyRstrctn;
    @XmlElement(name = "TaxtnConds")
    protected UpdatedAdditionalInformation1 taxtnConds;
    @XmlElement(name = "Dsclmr")
    protected UpdatedAdditionalInformation1 dsclmr;
    @XmlElement(name = "CertfctnBrkdwn")
    protected UpdatedAdditionalInformation1 certfctnBrkdwn;

    /**
     * Gets the value of the addtlTxt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation3 }
     *     
     */
    public UpdatedAdditionalInformation3 getAddtlTxt() {
        return addtlTxt;
    }

    /**
     * Sets the value of the addtlTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation3 }
     *     
     */
    public void setAddtlTxt(UpdatedAdditionalInformation3 value) {
        this.addtlTxt = value;
    }

    /**
     * Gets the value of the nrrtvVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation3 }
     *     
     */
    public UpdatedAdditionalInformation3 getNrrtvVrsn() {
        return nrrtvVrsn;
    }

    /**
     * Sets the value of the nrrtvVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation3 }
     *     
     */
    public void setNrrtvVrsn(UpdatedAdditionalInformation3 value) {
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
     * Gets the value of the sctyRstrctn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getSctyRstrctn() {
        return sctyRstrctn;
    }

    /**
     * Sets the value of the sctyRstrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public void setSctyRstrctn(UpdatedAdditionalInformation1 value) {
        this.sctyRstrctn = value;
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

}
