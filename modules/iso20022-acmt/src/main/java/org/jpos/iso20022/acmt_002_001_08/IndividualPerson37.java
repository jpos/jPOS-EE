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

package org.jpos.iso20022.acmt_002_001_08;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualPerson37 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IndividualPerson37">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NmPrfx" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}NamePrefix1Choice" minOccurs="0"/>
 *         <element name="GvnNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max35Text" minOccurs="0"/>
 *         <element name="MddlNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max35Text" minOccurs="0"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max350Text"/>
 *         <element name="NmSfx" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max35Text" minOccurs="0"/>
 *         <element name="Gndr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Gender1Code" minOccurs="0"/>
 *         <element name="BirthDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}ISODate" minOccurs="0"/>
 *         <element name="CtryOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}CountryCode" minOccurs="0"/>
 *         <element name="PrvcOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max35Text" minOccurs="0"/>
 *         <element name="CityOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max35Text" minOccurs="0"/>
 *         <element name="Prfssn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max35Text" minOccurs="0"/>
 *         <element name="PstlAdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}PostalAddress21" maxOccurs="10"/>
 *         <element name="Ctznsh" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}CitizenshipInformation2" maxOccurs="3" minOccurs="0"/>
 *         <element name="EmplngCpny" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max140Text" minOccurs="0"/>
 *         <element name="BizFctn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max35Text" minOccurs="0"/>
 *         <element name="PltclyXpsdPrsn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}PoliticallyExposedPerson1" minOccurs="0"/>
 *         <element name="DthDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}ISODate" minOccurs="0"/>
 *         <element name="CvlSts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}CivilStatus1Choice" minOccurs="0"/>
 *         <element name="EdctnLvl" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max35Text" minOccurs="0"/>
 *         <element name="FmlyInf" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}PersonalInformation1" minOccurs="0"/>
 *         <element name="GDPRData" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}GDPRData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPerson37", propOrder = {
    "nmPrfx",
    "gvnNm",
    "mddlNm",
    "nm",
    "nmSfx",
    "gndr",
    "birthDt",
    "ctryOfBirth",
    "prvcOfBirth",
    "cityOfBirth",
    "prfssn",
    "pstlAdr",
    "ctznsh",
    "emplngCpny",
    "bizFctn",
    "pltclyXpsdPrsn",
    "dthDt",
    "cvlSts",
    "edctnLvl",
    "fmlyInf",
    "gdprData"
})
public class IndividualPerson37 {

    @XmlElement(name = "NmPrfx")
    protected NamePrefix1Choice nmPrfx;
    @XmlElement(name = "GvnNm")
    protected String gvnNm;
    @XmlElement(name = "MddlNm")
    protected String mddlNm;
    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "NmSfx")
    protected String nmSfx;
    @XmlElement(name = "Gndr")
    @XmlSchemaType(name = "string")
    protected Gender1Code gndr;
    @XmlElement(name = "BirthDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDt;
    @XmlElement(name = "CtryOfBirth")
    protected String ctryOfBirth;
    @XmlElement(name = "PrvcOfBirth")
    protected String prvcOfBirth;
    @XmlElement(name = "CityOfBirth")
    protected String cityOfBirth;
    @XmlElement(name = "Prfssn")
    protected String prfssn;
    @XmlElement(name = "PstlAdr", required = true)
    protected List<PostalAddress21> pstlAdr;
    @XmlElement(name = "Ctznsh")
    protected List<CitizenshipInformation2> ctznsh;
    @XmlElement(name = "EmplngCpny")
    protected String emplngCpny;
    @XmlElement(name = "BizFctn")
    protected String bizFctn;
    @XmlElement(name = "PltclyXpsdPrsn")
    protected PoliticallyExposedPerson1 pltclyXpsdPrsn;
    @XmlElement(name = "DthDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dthDt;
    @XmlElement(name = "CvlSts")
    protected CivilStatus1Choice cvlSts;
    @XmlElement(name = "EdctnLvl")
    protected String edctnLvl;
    @XmlElement(name = "FmlyInf")
    protected PersonalInformation1 fmlyInf;
    @XmlElement(name = "GDPRData")
    protected List<GDPRData1> gdprData;

    /**
     * Gets the value of the nmPrfx property.
     * 
     * @return
     *     possible object is
     *     {@link NamePrefix1Choice }
     *     
     */
    public NamePrefix1Choice getNmPrfx() {
        return nmPrfx;
    }

    /**
     * Sets the value of the nmPrfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePrefix1Choice }
     *     
     */
    public void setNmPrfx(NamePrefix1Choice value) {
        this.nmPrfx = value;
    }

    /**
     * Gets the value of the gvnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGvnNm() {
        return gvnNm;
    }

    /**
     * Sets the value of the gvnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGvnNm(String value) {
        this.gvnNm = value;
    }

    /**
     * Gets the value of the mddlNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMddlNm() {
        return mddlNm;
    }

    /**
     * Sets the value of the mddlNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMddlNm(String value) {
        this.mddlNm = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the nmSfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmSfx() {
        return nmSfx;
    }

    /**
     * Sets the value of the nmSfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmSfx(String value) {
        this.nmSfx = value;
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
     * Gets the value of the prfssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrfssn() {
        return prfssn;
    }

    /**
     * Sets the value of the prfssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrfssn(String value) {
        this.prfssn = value;
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
     * {@link PostalAddress21 }
     * 
     * 
     * @return
     *     The value of the pstlAdr property.
     */
    public List<PostalAddress21> getPstlAdr() {
        if (pstlAdr == null) {
            pstlAdr = new ArrayList<>();
        }
        return this.pstlAdr;
    }

    /**
     * Gets the value of the ctznsh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctznsh property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtznsh().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitizenshipInformation2 }
     * 
     * 
     * @return
     *     The value of the ctznsh property.
     */
    public List<CitizenshipInformation2> getCtznsh() {
        if (ctznsh == null) {
            ctznsh = new ArrayList<>();
        }
        return this.ctznsh;
    }

    /**
     * Gets the value of the emplngCpny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmplngCpny() {
        return emplngCpny;
    }

    /**
     * Sets the value of the emplngCpny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmplngCpny(String value) {
        this.emplngCpny = value;
    }

    /**
     * Gets the value of the bizFctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizFctn() {
        return bizFctn;
    }

    /**
     * Sets the value of the bizFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizFctn(String value) {
        this.bizFctn = value;
    }

    /**
     * Gets the value of the pltclyXpsdPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link PoliticallyExposedPerson1 }
     *     
     */
    public PoliticallyExposedPerson1 getPltclyXpsdPrsn() {
        return pltclyXpsdPrsn;
    }

    /**
     * Sets the value of the pltclyXpsdPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoliticallyExposedPerson1 }
     *     
     */
    public void setPltclyXpsdPrsn(PoliticallyExposedPerson1 value) {
        this.pltclyXpsdPrsn = value;
    }

    /**
     * Gets the value of the dthDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDthDt() {
        return dthDt;
    }

    /**
     * Sets the value of the dthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDthDt(XMLGregorianCalendar value) {
        this.dthDt = value;
    }

    /**
     * Gets the value of the cvlSts property.
     * 
     * @return
     *     possible object is
     *     {@link CivilStatus1Choice }
     *     
     */
    public CivilStatus1Choice getCvlSts() {
        return cvlSts;
    }

    /**
     * Sets the value of the cvlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CivilStatus1Choice }
     *     
     */
    public void setCvlSts(CivilStatus1Choice value) {
        this.cvlSts = value;
    }

    /**
     * Gets the value of the edctnLvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdctnLvl() {
        return edctnLvl;
    }

    /**
     * Sets the value of the edctnLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdctnLvl(String value) {
        this.edctnLvl = value;
    }

    /**
     * Gets the value of the fmlyInf property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalInformation1 }
     *     
     */
    public PersonalInformation1 getFmlyInf() {
        return fmlyInf;
    }

    /**
     * Sets the value of the fmlyInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalInformation1 }
     *     
     */
    public void setFmlyInf(PersonalInformation1 value) {
        this.fmlyInf = value;
    }

    /**
     * Gets the value of the gdprData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the gdprData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGDPRData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GDPRData1 }
     * 
     * 
     * @return
     *     The value of the gdprData property.
     */
    public List<GDPRData1> getGDPRData() {
        if (gdprData == null) {
            gdprData = new ArrayList<>();
        }
        return this.gdprData;
    }

}
