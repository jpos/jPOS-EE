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

package org.jpos.iso20022.catm_007_001_06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificateManagementRequest3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CertificateManagementRequest3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="POIId" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}GenericIdentification176"/>
 *         <element name="TMId" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}GenericIdentification176" minOccurs="0"/>
 *         <element name="CertSvc" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}CardPaymentServiceType10Code"/>
 *         <element name="SctyDomn" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}Max70Text" minOccurs="0"/>
 *         <element name="KeyFctn" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}KeyUsage1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="POIChllngVal" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}Max140Binary"/>
 *         <element name="POIDtTm" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}ISODateTime"/>
 *         <element name="BinryCertfctnReq" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}Max20000Text" minOccurs="0"/>
 *         <element name="CertfctnReq" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}CertificationRequest1" minOccurs="0"/>
 *         <element name="ClntCert" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}Max10KBinary" minOccurs="0"/>
 *         <element name="WhtListId" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}PointOfInteraction6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateManagementRequest3", propOrder = {
    "poiId",
    "tmId",
    "certSvc",
    "sctyDomn",
    "keyFctn",
    "poiChllngVal",
    "poiDtTm",
    "binryCertfctnReq",
    "certfctnReq",
    "clntCert",
    "whtListId"
})
public class CertificateManagementRequest3 {

    @XmlElement(name = "POIId", required = true)
    protected GenericIdentification176 poiId;
    @XmlElement(name = "TMId")
    protected GenericIdentification176 tmId;
    @XmlElement(name = "CertSvc", required = true)
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType10Code certSvc;
    @XmlElement(name = "SctyDomn")
    protected String sctyDomn;
    @XmlElement(name = "KeyFctn")
    @XmlSchemaType(name = "string")
    protected List<KeyUsage1Code> keyFctn;
    @XmlElement(name = "POIChllngVal", required = true)
    protected byte[] poiChllngVal;
    @XmlElement(name = "POIDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar poiDtTm;
    @XmlElement(name = "BinryCertfctnReq")
    protected String binryCertfctnReq;
    @XmlElement(name = "CertfctnReq")
    protected CertificationRequest1 certfctnReq;
    @XmlElement(name = "ClntCert")
    protected byte[] clntCert;
    @XmlElement(name = "WhtListId")
    protected PointOfInteraction6 whtListId;

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getPOIId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public void setPOIId(GenericIdentification176 value) {
        this.poiId = value;
    }

    /**
     * Gets the value of the tmId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getTMId() {
        return tmId;
    }

    /**
     * Sets the value of the tmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public void setTMId(GenericIdentification176 value) {
        this.tmId = value;
    }

    /**
     * Gets the value of the certSvc property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType10Code }
     *     
     */
    public CardPaymentServiceType10Code getCertSvc() {
        return certSvc;
    }

    /**
     * Sets the value of the certSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType10Code }
     *     
     */
    public void setCertSvc(CardPaymentServiceType10Code value) {
        this.certSvc = value;
    }

    /**
     * Gets the value of the sctyDomn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctyDomn() {
        return sctyDomn;
    }

    /**
     * Sets the value of the sctyDomn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctyDomn(String value) {
        this.sctyDomn = value;
    }

    /**
     * Gets the value of the keyFctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keyFctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyFctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyUsage1Code }
     * 
     * 
     * @return
     *     The value of the keyFctn property.
     */
    public List<KeyUsage1Code> getKeyFctn() {
        if (keyFctn == null) {
            keyFctn = new ArrayList<>();
        }
        return this.keyFctn;
    }

    /**
     * Gets the value of the poiChllngVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPOIChllngVal() {
        return poiChllngVal;
    }

    /**
     * Sets the value of the poiChllngVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPOIChllngVal(byte[] value) {
        this.poiChllngVal = value;
    }

    /**
     * Gets the value of the poiDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPOIDtTm() {
        return poiDtTm;
    }

    /**
     * Sets the value of the poiDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPOIDtTm(XMLGregorianCalendar value) {
        this.poiDtTm = value;
    }

    /**
     * Gets the value of the binryCertfctnReq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinryCertfctnReq() {
        return binryCertfctnReq;
    }

    /**
     * Sets the value of the binryCertfctnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinryCertfctnReq(String value) {
        this.binryCertfctnReq = value;
    }

    /**
     * Gets the value of the certfctnReq property.
     * 
     * @return
     *     possible object is
     *     {@link CertificationRequest1 }
     *     
     */
    public CertificationRequest1 getCertfctnReq() {
        return certfctnReq;
    }

    /**
     * Sets the value of the certfctnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationRequest1 }
     *     
     */
    public void setCertfctnReq(CertificationRequest1 value) {
        this.certfctnReq = value;
    }

    /**
     * Gets the value of the clntCert property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getClntCert() {
        return clntCert;
    }

    /**
     * Sets the value of the clntCert property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setClntCert(byte[] value) {
        this.clntCert = value;
    }

    /**
     * Gets the value of the whtListId property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteraction6 }
     *     
     */
    public PointOfInteraction6 getWhtListId() {
        return whtListId;
    }

    /**
     * Sets the value of the whtListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteraction6 }
     *     
     */
    public void setWhtListId(PointOfInteraction6 value) {
        this.whtListId = value;
    }

}
