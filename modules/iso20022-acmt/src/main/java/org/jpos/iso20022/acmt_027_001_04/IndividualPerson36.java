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

package org.jpos.iso20022.acmt_027_001_04;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualPerson36 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IndividualPerson36">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CurNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}IndividualPersonNameLong2"/>
 *         <element name="PrvsNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}IndividualPersonNameLong2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Gndr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}Gender1Code" minOccurs="0"/>
 *         <element name="Lang" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}LanguageCode" minOccurs="0"/>
 *         <element name="BirthDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}ISODate" minOccurs="0"/>
 *         <element name="CtryOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}CountryCode" minOccurs="0"/>
 *         <element name="PrvcOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}Max35Text" minOccurs="0"/>
 *         <element name="CityOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}Max35Text" minOccurs="0"/>
 *         <element name="TaxtnCtry" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}CountryCode" minOccurs="0"/>
 *         <element name="CtryAndResdtlSts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}CountryAndResidentialStatusType1" minOccurs="0"/>
 *         <element name="SclSctyNb" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}Max35Text" minOccurs="0"/>
 *         <element name="PstlAdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}PostalAddress24" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CtznshInf" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}CitizenshipInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PmryComAdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}CommunicationAddress3" minOccurs="0"/>
 *         <element name="ScndryComAdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}CommunicationAddress3" minOccurs="0"/>
 *         <element name="OthrId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}GenericIdentification44" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OthrDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}TransferInstruction1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPerson36", propOrder = {
    "curNm",
    "prvsNm",
    "gndr",
    "lang",
    "birthDt",
    "ctryOfBirth",
    "prvcOfBirth",
    "cityOfBirth",
    "taxtnCtry",
    "ctryAndResdtlSts",
    "sclSctyNb",
    "pstlAdr",
    "ctznshInf",
    "pmryComAdr",
    "scndryComAdr",
    "othrId",
    "othrDtls"
})
public class IndividualPerson36 {

    @XmlElement(name = "CurNm", required = true)
    protected IndividualPersonNameLong2 curNm;
    @XmlElement(name = "PrvsNm")
    protected List<IndividualPersonNameLong2> prvsNm;
    @XmlElement(name = "Gndr")
    @XmlSchemaType(name = "string")
    protected Gender1Code gndr;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "BirthDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDt;
    @XmlElement(name = "CtryOfBirth")
    protected String ctryOfBirth;
    @XmlElement(name = "PrvcOfBirth")
    protected String prvcOfBirth;
    @XmlElement(name = "CityOfBirth")
    protected String cityOfBirth;
    @XmlElement(name = "TaxtnCtry")
    protected String taxtnCtry;
    @XmlElement(name = "CtryAndResdtlSts")
    protected CountryAndResidentialStatusType1 ctryAndResdtlSts;
    @XmlElement(name = "SclSctyNb")
    protected String sclSctyNb;
    @XmlElement(name = "PstlAdr")
    protected List<PostalAddress24> pstlAdr;
    @XmlElement(name = "CtznshInf")
    protected List<CitizenshipInformation1> ctznshInf;
    @XmlElement(name = "PmryComAdr")
    protected CommunicationAddress3 pmryComAdr;
    @XmlElement(name = "ScndryComAdr")
    protected CommunicationAddress3 scndryComAdr;
    @XmlElement(name = "OthrId")
    protected List<GenericIdentification44> othrId;
    @XmlElement(name = "OthrDtls")
    protected List<TransferInstruction1> othrDtls;

    /**
     * Gets the value of the curNm property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPersonNameLong2 }
     *     
     */
    public IndividualPersonNameLong2 getCurNm() {
        return curNm;
    }

    /**
     * Sets the value of the curNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPersonNameLong2 }
     *     
     */
    public void setCurNm(IndividualPersonNameLong2 value) {
        this.curNm = value;
    }

    /**
     * Gets the value of the prvsNm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvsNm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvsNm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualPersonNameLong2 }
     * 
     * 
     * @return
     *     The value of the prvsNm property.
     */
    public List<IndividualPersonNameLong2> getPrvsNm() {
        if (prvsNm == null) {
            prvsNm = new ArrayList<>();
        }
        return this.prvsNm;
    }

    /**
     * Gets the value of the gndr property.
     * 
     * @return
     *     possible object is
     *     {@link Gender1Code }
     *     
     */
    public Gender1Code getGndr() {
        return gndr;
    }

    /**
     * Sets the value of the gndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender1Code }
     *     
     */
    public void setGndr(Gender1Code value) {
        this.gndr = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the birthDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDt() {
        return birthDt;
    }

    /**
     * Sets the value of the birthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDt(XMLGregorianCalendar value) {
        this.birthDt = value;
    }

    /**
     * Gets the value of the ctryOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfBirth() {
        return ctryOfBirth;
    }

    /**
     * Sets the value of the ctryOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfBirth(String value) {
        this.ctryOfBirth = value;
    }

    /**
     * Gets the value of the prvcOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvcOfBirth() {
        return prvcOfBirth;
    }

    /**
     * Sets the value of the prvcOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvcOfBirth(String value) {
        this.prvcOfBirth = value;
    }

    /**
     * Gets the value of the cityOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityOfBirth() {
        return cityOfBirth;
    }

    /**
     * Sets the value of the cityOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityOfBirth(String value) {
        this.cityOfBirth = value;
    }

    /**
     * Gets the value of the taxtnCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxtnCtry() {
        return taxtnCtry;
    }

    /**
     * Sets the value of the taxtnCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxtnCtry(String value) {
        this.taxtnCtry = value;
    }

    /**
     * Gets the value of the ctryAndResdtlSts property.
     * 
     * @return
     *     possible object is
     *     {@link CountryAndResidentialStatusType1 }
     *     
     */
    public CountryAndResidentialStatusType1 getCtryAndResdtlSts() {
        return ctryAndResdtlSts;
    }

    /**
     * Sets the value of the ctryAndResdtlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryAndResidentialStatusType1 }
     *     
     */
    public void setCtryAndResdtlSts(CountryAndResidentialStatusType1 value) {
        this.ctryAndResdtlSts = value;
    }

    /**
     * Gets the value of the sclSctyNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSclSctyNb() {
        return sclSctyNb;
    }

    /**
     * Sets the value of the sclSctyNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSclSctyNb(String value) {
        this.sclSctyNb = value;
    }

    /**
     * Gets the value of the pstlAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pstlAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPstlAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddress24 }
     * 
     * 
     * @return
     *     The value of the pstlAdr property.
     */
    public List<PostalAddress24> getPstlAdr() {
        if (pstlAdr == null) {
            pstlAdr = new ArrayList<>();
        }
        return this.pstlAdr;
    }

    /**
     * Gets the value of the ctznshInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctznshInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtznshInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitizenshipInformation1 }
     * 
     * 
     * @return
     *     The value of the ctznshInf property.
     */
    public List<CitizenshipInformation1> getCtznshInf() {
        if (ctznshInf == null) {
            ctznshInf = new ArrayList<>();
        }
        return this.ctznshInf;
    }

    /**
     * Gets the value of the pmryComAdr property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress3 }
     *     
     */
    public CommunicationAddress3 getPmryComAdr() {
        return pmryComAdr;
    }

    /**
     * Sets the value of the pmryComAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress3 }
     *     
     */
    public void setPmryComAdr(CommunicationAddress3 value) {
        this.pmryComAdr = value;
    }

    /**
     * Gets the value of the scndryComAdr property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress3 }
     *     
     */
    public CommunicationAddress3 getScndryComAdr() {
        return scndryComAdr;
    }

    /**
     * Sets the value of the scndryComAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress3 }
     *     
     */
    public void setScndryComAdr(CommunicationAddress3 value) {
        this.scndryComAdr = value;
    }

    /**
     * Gets the value of the othrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification44 }
     * 
     * 
     * @return
     *     The value of the othrId property.
     */
    public List<GenericIdentification44> getOthrId() {
        if (othrId == null) {
            othrId = new ArrayList<>();
        }
        return this.othrId;
    }

    /**
     * Gets the value of the othrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferInstruction1 }
     * 
     * 
     * @return
     *     The value of the othrDtls property.
     */
    public List<TransferInstruction1> getOthrDtls() {
        if (othrDtls == null) {
            othrDtls = new ArrayList<>();
        }
        return this.othrDtls;
    }

}
