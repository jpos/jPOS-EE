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

package org.jpos.iso20022.cain_023_001_02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerificationInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VerificationInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}VerificationValue1Choice" minOccurs="0"/>
 *         <element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DtTm" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}ISODateTime" minOccurs="0"/>
 *         <element name="VldtyEndDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}ISODate" minOccurs="0"/>
 *         <element name="VldtyEndTm" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}ISOTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationInformation1", propOrder = {
    "tp",
    "val",
    "rsn",
    "dtTm",
    "vldtyEndDt",
    "vldtyEndTm"
})
public class VerificationInformation1 {

    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "Val")
    protected VerificationValue1Choice val;
    @XmlElement(name = "Rsn")
    protected List<String> rsn;
    @XmlElement(name = "DtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtTm;
    @XmlElement(name = "VldtyEndDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vldtyEndDt;
    @XmlElement(name = "VldtyEndTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar vldtyEndTm;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationValue1Choice }
     *     
     */
    public VerificationValue1Choice getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationValue1Choice }
     *     
     */
    public void setVal(VerificationValue1Choice value) {
        this.val = value;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the rsn property.
     */
    public List<String> getRsn() {
        if (rsn == null) {
            rsn = new ArrayList<>();
        }
        return this.rsn;
    }

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtTm(XMLGregorianCalendar value) {
        this.dtTm = value;
    }

    /**
     * Gets the value of the vldtyEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVldtyEndDt() {
        return vldtyEndDt;
    }

    /**
     * Sets the value of the vldtyEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVldtyEndDt(XMLGregorianCalendar value) {
        this.vldtyEndDt = value;
    }

    /**
     * Gets the value of the vldtyEndTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVldtyEndTm() {
        return vldtyEndTm;
    }

    /**
     * Sets the value of the vldtyEndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVldtyEndTm(XMLGregorianCalendar value) {
        this.vldtyEndTm = value;
    }

}
