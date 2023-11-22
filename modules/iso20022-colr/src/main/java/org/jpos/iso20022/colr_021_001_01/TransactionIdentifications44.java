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

package org.jpos.iso20022.colr_021_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionIdentifications44 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionIdentifications44">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TrptyAgtSvcPrvdrCollInstrId" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}Max35Text"/>
 *         <element name="TrptyAgtSvcPrvdrCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}Max35Text" minOccurs="0"/>
 *         <element name="ClntCollInstrId" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}Max35Text" minOccurs="0"/>
 *         <element name="ClntCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}Max35Text" minOccurs="0"/>
 *         <element name="CtrPtyCollInstrId" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}Max35Text" minOccurs="0"/>
 *         <element name="CtrPtyCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}Max35Text" minOccurs="0"/>
 *         <element name="CmonTxId" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}Max52Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionIdentifications44", propOrder = {
    "trptyAgtSvcPrvdrCollInstrId",
    "trptyAgtSvcPrvdrCollTxId",
    "clntCollInstrId",
    "clntCollTxId",
    "ctrPtyCollInstrId",
    "ctrPtyCollTxId",
    "cmonTxId"
})
public class TransactionIdentifications44 {

    @XmlElement(name = "TrptyAgtSvcPrvdrCollInstrId", required = true)
    protected String trptyAgtSvcPrvdrCollInstrId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCollTxId")
    protected String trptyAgtSvcPrvdrCollTxId;
    @XmlElement(name = "ClntCollInstrId")
    protected String clntCollInstrId;
    @XmlElement(name = "ClntCollTxId")
    protected String clntCollTxId;
    @XmlElement(name = "CtrPtyCollInstrId")
    protected String ctrPtyCollInstrId;
    @XmlElement(name = "CtrPtyCollTxId")
    protected String ctrPtyCollTxId;
    @XmlElement(name = "CmonTxId")
    protected String cmonTxId;

    /**
     * Gets the value of the trptyAgtSvcPrvdrCollInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtSvcPrvdrCollInstrId() {
        return trptyAgtSvcPrvdrCollInstrId;
    }

    /**
     * Sets the value of the trptyAgtSvcPrvdrCollInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrptyAgtSvcPrvdrCollInstrId(String value) {
        this.trptyAgtSvcPrvdrCollInstrId = value;
    }

    /**
     * Gets the value of the trptyAgtSvcPrvdrCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtSvcPrvdrCollTxId() {
        return trptyAgtSvcPrvdrCollTxId;
    }

    /**
     * Sets the value of the trptyAgtSvcPrvdrCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrptyAgtSvcPrvdrCollTxId(String value) {
        this.trptyAgtSvcPrvdrCollTxId = value;
    }

    /**
     * Gets the value of the clntCollInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntCollInstrId() {
        return clntCollInstrId;
    }

    /**
     * Sets the value of the clntCollInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntCollInstrId(String value) {
        this.clntCollInstrId = value;
    }

    /**
     * Gets the value of the clntCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntCollTxId() {
        return clntCollTxId;
    }

    /**
     * Sets the value of the clntCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntCollTxId(String value) {
        this.clntCollTxId = value;
    }

    /**
     * Gets the value of the ctrPtyCollInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrPtyCollInstrId() {
        return ctrPtyCollInstrId;
    }

    /**
     * Sets the value of the ctrPtyCollInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrPtyCollInstrId(String value) {
        this.ctrPtyCollInstrId = value;
    }

    /**
     * Gets the value of the ctrPtyCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrPtyCollTxId() {
        return ctrPtyCollTxId;
    }

    /**
     * Sets the value of the ctrPtyCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrPtyCollTxId(String value) {
        this.ctrPtyCollTxId = value;
    }

    /**
     * Gets the value of the cmonTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonTxId() {
        return cmonTxId;
    }

    /**
     * Sets the value of the cmonTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmonTxId(String value) {
        this.cmonTxId = value;
    }

}
