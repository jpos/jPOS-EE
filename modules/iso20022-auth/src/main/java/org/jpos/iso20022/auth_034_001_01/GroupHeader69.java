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

package org.jpos.iso20022.auth_034_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupHeader69 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GroupHeader69">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}Max35Text"/>
 *         <element name="IssdDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}ISODate"/>
 *         <element name="RptCtgy" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}ExternalDocumentType1Code"/>
 *         <element name="TaxRptPurp" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}ExternalDocumentType1Code"/>
 *         <element name="OrgnlId" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}Max35Text" minOccurs="0"/>
 *         <element name="SellrTaxRprtv" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}PartyIdentification116" minOccurs="0"/>
 *         <element name="BuyrTaxRprtv" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}PartyIdentification116" minOccurs="0"/>
 *         <element name="LangCd" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}LanguageCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupHeader69", propOrder = {
    "id",
    "issdDt",
    "rptCtgy",
    "taxRptPurp",
    "orgnlId",
    "sellrTaxRprtv",
    "buyrTaxRprtv",
    "langCd"
})
public class GroupHeader69 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "IssdDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issdDt;
    @XmlElement(name = "RptCtgy", required = true)
    protected String rptCtgy;
    @XmlElement(name = "TaxRptPurp", required = true)
    protected String taxRptPurp;
    @XmlElement(name = "OrgnlId")
    protected String orgnlId;
    @XmlElement(name = "SellrTaxRprtv")
    protected PartyIdentification116 sellrTaxRprtv;
    @XmlElement(name = "BuyrTaxRprtv")
    protected PartyIdentification116 buyrTaxRprtv;
    @XmlElement(name = "LangCd")
    protected String langCd;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the issdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssdDt() {
        return issdDt;
    }

    /**
     * Sets the value of the issdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssdDt(XMLGregorianCalendar value) {
        this.issdDt = value;
    }

    /**
     * Gets the value of the rptCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptCtgy() {
        return rptCtgy;
    }

    /**
     * Sets the value of the rptCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptCtgy(String value) {
        this.rptCtgy = value;
    }

    /**
     * Gets the value of the taxRptPurp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRptPurp() {
        return taxRptPurp;
    }

    /**
     * Sets the value of the taxRptPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRptPurp(String value) {
        this.taxRptPurp = value;
    }

    /**
     * Gets the value of the orgnlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlId() {
        return orgnlId;
    }

    /**
     * Sets the value of the orgnlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlId(String value) {
        this.orgnlId = value;
    }

    /**
     * Gets the value of the sellrTaxRprtv property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification116 }
     *     
     */
    public PartyIdentification116 getSellrTaxRprtv() {
        return sellrTaxRprtv;
    }

    /**
     * Sets the value of the sellrTaxRprtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification116 }
     *     
     */
    public void setSellrTaxRprtv(PartyIdentification116 value) {
        this.sellrTaxRprtv = value;
    }

    /**
     * Gets the value of the buyrTaxRprtv property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification116 }
     *     
     */
    public PartyIdentification116 getBuyrTaxRprtv() {
        return buyrTaxRprtv;
    }

    /**
     * Sets the value of the buyrTaxRprtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification116 }
     *     
     */
    public void setBuyrTaxRprtv(PartyIdentification116 value) {
        this.buyrTaxRprtv = value;
    }

    /**
     * Gets the value of the langCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCd() {
        return langCd;
    }

    /**
     * Sets the value of the langCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangCd(String value) {
        this.langCd = value;
    }

}
