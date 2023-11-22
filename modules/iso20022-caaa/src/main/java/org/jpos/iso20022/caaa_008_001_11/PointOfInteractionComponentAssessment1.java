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

package org.jpos.iso20022.caaa_008_001_11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointOfInteractionComponentAssessment1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PointOfInteractionComponentAssessment1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.008.001.11}POIComponentAssessment1Code"/>
 *         <element name="Assgnr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.008.001.11}Max35Text" maxOccurs="unbounded"/>
 *         <element name="DlvryDt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.008.001.11}ISODateTime" minOccurs="0"/>
 *         <element name="XprtnDt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.008.001.11}ISODateTime" minOccurs="0"/>
 *         <element name="Nb" type="{urn:iso:std:iso:20022:tech:xsd:caaa.008.001.11}Max35Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionComponentAssessment1", propOrder = {
    "tp",
    "assgnr",
    "dlvryDt",
    "xprtnDt",
    "nb"
})
public class PointOfInteractionComponentAssessment1 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected POIComponentAssessment1Code tp;
    @XmlElement(name = "Assgnr", required = true)
    protected List<String> assgnr;
    @XmlElement(name = "DlvryDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dlvryDt;
    @XmlElement(name = "XprtnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar xprtnDt;
    @XmlElement(name = "Nb", required = true)
    protected String nb;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link POIComponentAssessment1Code }
     *     
     */
    public POIComponentAssessment1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link POIComponentAssessment1Code }
     *     
     */
    public void setTp(POIComponentAssessment1Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assgnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssgnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the assgnr property.
     */
    public List<String> getAssgnr() {
        if (assgnr == null) {
            assgnr = new ArrayList<>();
        }
        return this.assgnr;
    }

    /**
     * Gets the value of the dlvryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDlvryDt() {
        return dlvryDt;
    }

    /**
     * Sets the value of the dlvryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDlvryDt(XMLGregorianCalendar value) {
        this.dlvryDt = value;
    }

    /**
     * Gets the value of the xprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXprtnDt() {
        return xprtnDt;
    }

    /**
     * Sets the value of the xprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXprtnDt(XMLGregorianCalendar value) {
        this.xprtnDt = value;
    }

    /**
     * Gets the value of the nb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNb() {
        return nb;
    }

    /**
     * Sets the value of the nb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNb(String value) {
        this.nb = value;
    }

}
