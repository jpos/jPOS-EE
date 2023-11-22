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

package org.jpos.iso20022.catm_008_001_06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificateManagementResponse3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CertificateManagementResponse3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="POIId" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.06}GenericIdentification176"/>
 *         <element name="TMId" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.06}GenericIdentification176" minOccurs="0"/>
 *         <element name="CertSvc" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.06}CardPaymentServiceType10Code"/>
 *         <element name="Rslt" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.06}ResponseType6"/>
 *         <element name="SctyPrfl" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.06}Max35Text" minOccurs="0"/>
 *         <element name="POIChllngVal" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.06}Max140Binary"/>
 *         <element name="TMSDtTm" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.06}ISODateTime"/>
 *         <element name="ClntCert" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.06}Max3000Binary" minOccurs="0"/>
 *         <element name="ClntCertPth" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.06}Max10KBinary" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SvrCertPth" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.06}Max10KBinary" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateManagementResponse3", propOrder = {
    "poiId",
    "tmId",
    "certSvc",
    "rslt",
    "sctyPrfl",
    "poiChllngVal",
    "tmsDtTm",
    "clntCert",
    "clntCertPth",
    "svrCertPth"
})
public class CertificateManagementResponse3 {

    @XmlElement(name = "POIId", required = true)
    protected GenericIdentification176 poiId;
    @XmlElement(name = "TMId")
    protected GenericIdentification176 tmId;
    @XmlElement(name = "CertSvc", required = true)
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType10Code certSvc;
    @XmlElement(name = "Rslt", required = true)
    protected ResponseType6 rslt;
    @XmlElement(name = "SctyPrfl")
    protected String sctyPrfl;
    @XmlElement(name = "POIChllngVal", required = true)
    protected byte[] poiChllngVal;
    @XmlElement(name = "TMSDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tmsDtTm;
    @XmlElement(name = "ClntCert")
    protected byte[] clntCert;
    @XmlElement(name = "ClntCertPth")
    protected List<byte[]> clntCertPth;
    @XmlElement(name = "SvrCertPth")
    protected List<byte[]> svrCertPth;

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
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType6 }
     *     
     */
    public ResponseType6 getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType6 }
     *     
     */
    public void setRslt(ResponseType6 value) {
        this.rslt = value;
    }

    /**
     * Gets the value of the sctyPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctyPrfl() {
        return sctyPrfl;
    }

    /**
     * Sets the value of the sctyPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctyPrfl(String value) {
        this.sctyPrfl = value;
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
     * Gets the value of the tmsDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTMSDtTm() {
        return tmsDtTm;
    }

    /**
     * Sets the value of the tmsDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTMSDtTm(XMLGregorianCalendar value) {
        this.tmsDtTm = value;
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
     * Gets the value of the clntCertPth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clntCertPth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClntCertPth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     * @return
     *     The value of the clntCertPth property.
     */
    public List<byte[]> getClntCertPth() {
        if (clntCertPth == null) {
            clntCertPth = new ArrayList<>();
        }
        return this.clntCertPth;
    }

    /**
     * Gets the value of the svrCertPth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svrCertPth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvrCertPth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     * @return
     *     The value of the svrCertPth property.
     */
    public List<byte[]> getSvrCertPth() {
        if (svrCertPth == null) {
            svrCertPth = new ArrayList<>();
        }
        return this.svrCertPth;
    }

}
