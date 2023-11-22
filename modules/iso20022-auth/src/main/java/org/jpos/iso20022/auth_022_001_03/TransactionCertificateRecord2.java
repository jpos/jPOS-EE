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

package org.jpos.iso20022.auth_022_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionCertificateRecord2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionCertificateRecord2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CertRcrdId" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}Max35Text"/>
 *         <element name="DocSubmitgPrcdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}Exact1NumericText" minOccurs="0"/>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}TransactionCertificate5"/>
 *         <element name="Ctrct" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}TransactionCertificateContract2" minOccurs="0"/>
 *         <element name="Attchmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}DocumentGeneralInformation5" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionCertificateRecord2", propOrder = {
    "certRcrdId",
    "docSubmitgPrcdr",
    "tx",
    "ctrct",
    "attchmnt"
})
public class TransactionCertificateRecord2 {

    @XmlElement(name = "CertRcrdId", required = true)
    protected String certRcrdId;
    @XmlElement(name = "DocSubmitgPrcdr")
    protected String docSubmitgPrcdr;
    @XmlElement(name = "Tx", required = true)
    protected TransactionCertificate5 tx;
    @XmlElement(name = "Ctrct")
    protected TransactionCertificateContract2 ctrct;
    @XmlElement(name = "Attchmnt")
    protected List<DocumentGeneralInformation5> attchmnt;

    /**
     * Gets the value of the certRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertRcrdId() {
        return certRcrdId;
    }

    /**
     * Sets the value of the certRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertRcrdId(String value) {
        this.certRcrdId = value;
    }

    /**
     * Gets the value of the docSubmitgPrcdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocSubmitgPrcdr() {
        return docSubmitgPrcdr;
    }

    /**
     * Sets the value of the docSubmitgPrcdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocSubmitgPrcdr(String value) {
        this.docSubmitgPrcdr = value;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCertificate5 }
     *     
     */
    public TransactionCertificate5 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCertificate5 }
     *     
     */
    public void setTx(TransactionCertificate5 value) {
        this.tx = value;
    }

    /**
     * Gets the value of the ctrct property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCertificateContract2 }
     *     
     */
    public TransactionCertificateContract2 getCtrct() {
        return ctrct;
    }

    /**
     * Sets the value of the ctrct property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCertificateContract2 }
     *     
     */
    public void setCtrct(TransactionCertificateContract2 value) {
        this.ctrct = value;
    }

    /**
     * Gets the value of the attchmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the attchmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentGeneralInformation5 }
     * 
     * 
     * @return
     *     The value of the attchmnt property.
     */
    public List<DocumentGeneralInformation5> getAttchmnt() {
        if (attchmnt == null) {
            attchmnt = new ArrayList<>();
        }
        return this.attchmnt;
    }

}
