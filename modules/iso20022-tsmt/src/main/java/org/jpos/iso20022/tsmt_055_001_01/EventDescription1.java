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

package org.jpos.iso20022.tsmt_055_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventDescription1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EventDescription1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Idr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max35Text"/>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="Rcpt" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *         <element name="Advsr" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *         <element name="OthrPty" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LangCd" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}LanguageCode"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max2000Text"/>
 *         <element name="RltdDoc" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RltdLttr" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RltdMsg" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AssoctdDoc" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="GovngCtrct" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LglCntxt" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventDescription1", propOrder = {
    "idr",
    "dt",
    "rcpt",
    "advsr",
    "othrPty",
    "langCd",
    "desc",
    "rltdDoc",
    "rltdLttr",
    "rltdMsg",
    "assoctdDoc",
    "govngCtrct",
    "lglCntxt"
})
public class EventDescription1 {

    @XmlElement(name = "Idr", required = true)
    protected String idr;
    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Rcpt", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object rcpt;
    @XmlElement(name = "Advsr", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object advsr;
    @XmlElementRef(name = "OthrPty", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> othrPty;
    @XmlElement(name = "LangCd", required = true)
    protected String langCd;
    @XmlElement(name = "Desc", required = true)
    protected String desc;
    @XmlElementRef(name = "RltdDoc", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> rltdDoc;
    @XmlElementRef(name = "RltdLttr", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> rltdLttr;
    @XmlElementRef(name = "RltdMsg", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> rltdMsg;
    @XmlElementRef(name = "AssoctdDoc", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> assoctdDoc;
    @XmlElementRef(name = "GovngCtrct", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> govngCtrct;
    @XmlElement(name = "LglCntxt")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object lglCntxt;

    /**
     * Gets the value of the idr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdr() {
        return idr;
    }

    /**
     * Sets the value of the idr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdr(String value) {
        this.idr = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * Gets the value of the rcpt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRcpt() {
        return rcpt;
    }

    /**
     * Sets the value of the rcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRcpt(Object value) {
        this.rcpt = value;
    }

    /**
     * Gets the value of the advsr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAdvsr() {
        return advsr;
    }

    /**
     * Sets the value of the advsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAdvsr(Object value) {
        this.advsr = value;
    }

    /**
     * Gets the value of the othrPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     * @return
     *     The value of the othrPty property.
     */
    public List<JAXBElement<Object>> getOthrPty() {
        if (othrPty == null) {
            othrPty = new ArrayList<>();
        }
        return this.othrPty;
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

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the rltdDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     * @return
     *     The value of the rltdDoc property.
     */
    public List<JAXBElement<Object>> getRltdDoc() {
        if (rltdDoc == null) {
            rltdDoc = new ArrayList<>();
        }
        return this.rltdDoc;
    }

    /**
     * Gets the value of the rltdLttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdLttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdLttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     * @return
     *     The value of the rltdLttr property.
     */
    public List<JAXBElement<Object>> getRltdLttr() {
        if (rltdLttr == null) {
            rltdLttr = new ArrayList<>();
        }
        return this.rltdLttr;
    }

    /**
     * Gets the value of the rltdMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdMsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     * @return
     *     The value of the rltdMsg property.
     */
    public List<JAXBElement<Object>> getRltdMsg() {
        if (rltdMsg == null) {
            rltdMsg = new ArrayList<>();
        }
        return this.rltdMsg;
    }

    /**
     * Gets the value of the assoctdDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assoctdDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssoctdDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     * @return
     *     The value of the assoctdDoc property.
     */
    public List<JAXBElement<Object>> getAssoctdDoc() {
        if (assoctdDoc == null) {
            assoctdDoc = new ArrayList<>();
        }
        return this.assoctdDoc;
    }

    /**
     * Gets the value of the govngCtrct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the govngCtrct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGovngCtrct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     * @return
     *     The value of the govngCtrct property.
     */
    public List<JAXBElement<Object>> getGovngCtrct() {
        if (govngCtrct == null) {
            govngCtrct = new ArrayList<>();
        }
        return this.govngCtrct;
    }

    /**
     * Gets the value of the lglCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLglCntxt() {
        return lglCntxt;
    }

    /**
     * Sets the value of the lglCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLglCntxt(Object value) {
        this.lglCntxt = value;
    }

}
