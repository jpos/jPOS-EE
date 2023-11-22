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

package org.jpos.iso20022.tsin_010_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for QualifiedDocumentInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="QualifiedDocumentInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}ID"/>
 *         <element name="Issr" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         <element name="ItmListIdr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.010.001.01}Max35Text" minOccurs="0"/>
 *         <element name="ItmIdr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.010.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.010.001.01}ISODate" minOccurs="0"/>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:tsin.010.001.01}Max6Text" minOccurs="0"/>
 *         <element name="ElctrncOrgnl" type="{urn:iso:std:iso:20022:tech:xsd:tsin.010.001.01}YesNoIndicator"/>
 *         <element name="Dgst" type="{urn:iso:std:iso:20022:tech:xsd:tsin.010.001.01}AlgorithmAndDigest1" maxOccurs="2" minOccurs="0"/>
 *         <element name="DocTp" type="{urn:iso:std:iso:20022:tech:xsd:tsin.010.001.01}ExternalDocumentType1Code" minOccurs="0"/>
 *         <element name="URL" type="{urn:iso:std:iso:20022:tech:xsd:tsin.010.001.01}Max2048Text" minOccurs="0"/>
 *         <element name="AttchdFile" type="{urn:iso:std:iso:20022:tech:xsd:tsin.010.001.01}BinaryFile1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifiedDocumentInformation1", propOrder = {
    "id",
    "issr",
    "itmListIdr",
    "itmIdr",
    "dt",
    "vrsn",
    "elctrncOrgnl",
    "dgst",
    "docTp",
    "url",
    "attchdFile"
})
public class QualifiedDocumentInformation1 {

    @XmlElement(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlElement(name = "Issr")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object issr;
    @XmlElement(name = "ItmListIdr")
    protected String itmListIdr;
    @XmlElement(name = "ItmIdr")
    protected String itmIdr;
    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Vrsn")
    protected String vrsn;
    @XmlElement(name = "ElctrncOrgnl")
    protected boolean elctrncOrgnl;
    @XmlElement(name = "Dgst")
    protected List<AlgorithmAndDigest1> dgst;
    @XmlElement(name = "DocTp")
    protected String docTp;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "AttchdFile")
    protected List<BinaryFile1> attchdFile;

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
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIssr(Object value) {
        this.issr = value;
    }

    /**
     * Gets the value of the itmListIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmListIdr() {
        return itmListIdr;
    }

    /**
     * Sets the value of the itmListIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItmListIdr(String value) {
        this.itmListIdr = value;
    }

    /**
     * Gets the value of the itmIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmIdr() {
        return itmIdr;
    }

    /**
     * Sets the value of the itmIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItmIdr(String value) {
        this.itmIdr = value;
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
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrsn(String value) {
        this.vrsn = value;
    }

    /**
     * Gets the value of the elctrncOrgnl property.
     * 
     */
    public boolean isElctrncOrgnl() {
        return elctrncOrgnl;
    }

    /**
     * Sets the value of the elctrncOrgnl property.
     * 
     */
    public void setElctrncOrgnl(boolean value) {
        this.elctrncOrgnl = value;
    }

    /**
     * Gets the value of the dgst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dgst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlgorithmAndDigest1 }
     * 
     * 
     * @return
     *     The value of the dgst property.
     */
    public List<AlgorithmAndDigest1> getDgst() {
        if (dgst == null) {
            dgst = new ArrayList<>();
        }
        return this.dgst;
    }

    /**
     * Gets the value of the docTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTp() {
        return docTp;
    }

    /**
     * Sets the value of the docTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTp(String value) {
        this.docTp = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the attchdFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the attchdFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchdFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinaryFile1 }
     * 
     * 
     * @return
     *     The value of the attchdFile property.
     */
    public List<BinaryFile1> getAttchdFile() {
        if (attchdFile == null) {
            attchdFile = new ArrayList<>();
        }
        return this.attchdFile;
    }

}
