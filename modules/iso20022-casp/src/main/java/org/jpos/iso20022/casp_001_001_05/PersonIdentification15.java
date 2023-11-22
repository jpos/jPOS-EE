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

package org.jpos.iso20022.casp_001_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonIdentification15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PersonIdentification15">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DrvrLicNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max35Text" minOccurs="0"/>
 *         <element name="DrvrLicLctn" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max35Text" minOccurs="0"/>
 *         <element name="DrvrLicNm" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max35Text" minOccurs="0"/>
 *         <element name="DrvrId" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max35Text" minOccurs="0"/>
 *         <element name="CstmrNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max35Text" minOccurs="0"/>
 *         <element name="SclSctyNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max35Text" minOccurs="0"/>
 *         <element name="AlnRegnNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max35Text" minOccurs="0"/>
 *         <element name="PsptNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max35Text" minOccurs="0"/>
 *         <element name="TaxIdNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max35Text" minOccurs="0"/>
 *         <element name="IdntyCardNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max35Text" minOccurs="0"/>
 *         <element name="MplyrIdNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max35Text" minOccurs="0"/>
 *         <element name="MplyeeIdNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max35Text" minOccurs="0"/>
 *         <element name="JobNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max35Text" minOccurs="0"/>
 *         <element name="Dept" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max35Text" minOccurs="0"/>
 *         <element name="EmailAdr" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max256Text" minOccurs="0"/>
 *         <element name="DtAndPlcOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}DateAndPlaceOfBirth1" minOccurs="0"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}GenericIdentification4" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdentification15", propOrder = {
    "drvrLicNb",
    "drvrLicLctn",
    "drvrLicNm",
    "drvrId",
    "cstmrNb",
    "sclSctyNb",
    "alnRegnNb",
    "psptNb",
    "taxIdNb",
    "idntyCardNb",
    "mplyrIdNb",
    "mplyeeIdNb",
    "jobNb",
    "dept",
    "emailAdr",
    "dtAndPlcOfBirth",
    "othr"
})
public class PersonIdentification15 {

    @XmlElement(name = "DrvrLicNb")
    protected String drvrLicNb;
    @XmlElement(name = "DrvrLicLctn")
    protected String drvrLicLctn;
    @XmlElement(name = "DrvrLicNm")
    protected String drvrLicNm;
    @XmlElement(name = "DrvrId")
    protected String drvrId;
    @XmlElement(name = "CstmrNb")
    protected String cstmrNb;
    @XmlElement(name = "SclSctyNb")
    protected String sclSctyNb;
    @XmlElement(name = "AlnRegnNb")
    protected String alnRegnNb;
    @XmlElement(name = "PsptNb")
    protected String psptNb;
    @XmlElement(name = "TaxIdNb")
    protected String taxIdNb;
    @XmlElement(name = "IdntyCardNb")
    protected String idntyCardNb;
    @XmlElement(name = "MplyrIdNb")
    protected String mplyrIdNb;
    @XmlElement(name = "MplyeeIdNb")
    protected String mplyeeIdNb;
    @XmlElement(name = "JobNb")
    protected String jobNb;
    @XmlElement(name = "Dept")
    protected String dept;
    @XmlElement(name = "EmailAdr")
    protected String emailAdr;
    @XmlElement(name = "DtAndPlcOfBirth")
    protected DateAndPlaceOfBirth1 dtAndPlcOfBirth;
    @XmlElement(name = "Othr")
    protected List<GenericIdentification4> othr;

    /**
     * Gets the value of the drvrLicNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvrLicNb() {
        return drvrLicNb;
    }

    /**
     * Sets the value of the drvrLicNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrvrLicNb(String value) {
        this.drvrLicNb = value;
    }

    /**
     * Gets the value of the drvrLicLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvrLicLctn() {
        return drvrLicLctn;
    }

    /**
     * Sets the value of the drvrLicLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrvrLicLctn(String value) {
        this.drvrLicLctn = value;
    }

    /**
     * Gets the value of the drvrLicNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvrLicNm() {
        return drvrLicNm;
    }

    /**
     * Sets the value of the drvrLicNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrvrLicNm(String value) {
        this.drvrLicNm = value;
    }

    /**
     * Gets the value of the drvrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvrId() {
        return drvrId;
    }

    /**
     * Sets the value of the drvrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrvrId(String value) {
        this.drvrId = value;
    }

    /**
     * Gets the value of the cstmrNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrNb() {
        return cstmrNb;
    }

    /**
     * Sets the value of the cstmrNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstmrNb(String value) {
        this.cstmrNb = value;
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
     * Gets the value of the alnRegnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlnRegnNb() {
        return alnRegnNb;
    }

    /**
     * Sets the value of the alnRegnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlnRegnNb(String value) {
        this.alnRegnNb = value;
    }

    /**
     * Gets the value of the psptNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsptNb() {
        return psptNb;
    }

    /**
     * Sets the value of the psptNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsptNb(String value) {
        this.psptNb = value;
    }

    /**
     * Gets the value of the taxIdNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdNb() {
        return taxIdNb;
    }

    /**
     * Sets the value of the taxIdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdNb(String value) {
        this.taxIdNb = value;
    }

    /**
     * Gets the value of the idntyCardNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdntyCardNb() {
        return idntyCardNb;
    }

    /**
     * Sets the value of the idntyCardNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdntyCardNb(String value) {
        this.idntyCardNb = value;
    }

    /**
     * Gets the value of the mplyrIdNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMplyrIdNb() {
        return mplyrIdNb;
    }

    /**
     * Sets the value of the mplyrIdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMplyrIdNb(String value) {
        this.mplyrIdNb = value;
    }

    /**
     * Gets the value of the mplyeeIdNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMplyeeIdNb() {
        return mplyeeIdNb;
    }

    /**
     * Sets the value of the mplyeeIdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMplyeeIdNb(String value) {
        this.mplyeeIdNb = value;
    }

    /**
     * Gets the value of the jobNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobNb() {
        return jobNb;
    }

    /**
     * Sets the value of the jobNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobNb(String value) {
        this.jobNb = value;
    }

    /**
     * Gets the value of the dept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDept() {
        return dept;
    }

    /**
     * Sets the value of the dept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDept(String value) {
        this.dept = value;
    }

    /**
     * Gets the value of the emailAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAdr() {
        return emailAdr;
    }

    /**
     * Sets the value of the emailAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAdr(String value) {
        this.emailAdr = value;
    }

    /**
     * Gets the value of the dtAndPlcOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndPlaceOfBirth1 }
     *     
     */
    public DateAndPlaceOfBirth1 getDtAndPlcOfBirth() {
        return dtAndPlcOfBirth;
    }

    /**
     * Sets the value of the dtAndPlcOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndPlaceOfBirth1 }
     *     
     */
    public void setDtAndPlcOfBirth(DateAndPlaceOfBirth1 value) {
        this.dtAndPlcOfBirth = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification4 }
     * 
     * 
     * @return
     *     The value of the othr property.
     */
    public List<GenericIdentification4> getOthr() {
        if (othr == null) {
            othr = new ArrayList<>();
        }
        return this.othr;
    }

}
