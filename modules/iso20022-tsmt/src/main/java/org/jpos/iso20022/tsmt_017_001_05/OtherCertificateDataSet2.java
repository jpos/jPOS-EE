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

package org.jpos.iso20022.tsmt_017_001_05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherCertificateDataSet2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OtherCertificateDataSet2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DataSetId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}DocumentIdentification1"/>
 *         <element name="CertId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max35Text"/>
 *         <element name="CertTp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Exact4AlphaNumericText"/>
 *         <element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}ISODate"/>
 *         <element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}PartyIdentification26"/>
 *         <element name="CertInf" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max350Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherCertificateDataSet2", propOrder = {
    "dataSetId",
    "certId",
    "certTp",
    "isseDt",
    "issr",
    "certInf"
})
public class OtherCertificateDataSet2 {

    @XmlElement(name = "DataSetId", required = true)
    protected DocumentIdentification1 dataSetId;
    @XmlElement(name = "CertId", required = true)
    protected String certId;
    @XmlElement(name = "CertTp", required = true)
    protected String certTp;
    @XmlElement(name = "IsseDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isseDt;
    @XmlElement(name = "Issr", required = true)
    protected PartyIdentification26 issr;
    @XmlElement(name = "CertInf")
    protected List<String> certInf;

    /**
     * Gets the value of the dataSetId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification1 }
     *     
     */
    public DocumentIdentification1 getDataSetId() {
        return dataSetId;
    }

    /**
     * Sets the value of the dataSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification1 }
     *     
     */
    public void setDataSetId(DocumentIdentification1 value) {
        this.dataSetId = value;
    }

    /**
     * Gets the value of the certId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertId() {
        return certId;
    }

    /**
     * Sets the value of the certId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertId(String value) {
        this.certId = value;
    }

    /**
     * Gets the value of the certTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertTp() {
        return certTp;
    }

    /**
     * Sets the value of the certTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertTp(String value) {
        this.certTp = value;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIsseDt(XMLGregorianCalendar value) {
        this.isseDt = value;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setIssr(PartyIdentification26 value) {
        this.issr = value;
    }

    /**
     * Gets the value of the certInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the certInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the certInf property.
     */
    public List<String> getCertInf() {
        if (certInf == null) {
            certInf = new ArrayList<>();
        }
        return this.certInf;
    }

}
