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

package org.jpos.iso20022.sese_008_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferReference16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransferReference16">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TrfRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.008.001.09}Max35Text"/>
 *         <element name="ClntRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.008.001.09}AdditionalReference10" minOccurs="0"/>
 *         <element name="TrfConfRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.008.001.09}Max35Text" minOccurs="0"/>
 *         <element name="CtrPtyRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.008.001.09}AdditionalReference10" minOccurs="0"/>
 *         <element name="CxlRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.008.001.09}Max35Text" minOccurs="0"/>
 *         <element name="RvslRsn" type="{urn:iso:std:iso:20022:tech:xsd:sese.008.001.09}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferReference16", propOrder = {
    "trfRef",
    "clntRef",
    "trfConfRef",
    "ctrPtyRef",
    "cxlRef",
    "rvslRsn"
})
public class TransferReference16 {

    @XmlElement(name = "TrfRef", required = true)
    protected String trfRef;
    @XmlElement(name = "ClntRef")
    protected AdditionalReference10 clntRef;
    @XmlElement(name = "TrfConfRef")
    protected String trfConfRef;
    @XmlElement(name = "CtrPtyRef")
    protected AdditionalReference10 ctrPtyRef;
    @XmlElement(name = "CxlRef")
    protected String cxlRef;
    @XmlElement(name = "RvslRsn")
    protected String rvslRsn;

    /**
     * Gets the value of the trfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfRef() {
        return trfRef;
    }

    /**
     * Sets the value of the trfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrfRef(String value) {
        this.trfRef = value;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public void setClntRef(AdditionalReference10 value) {
        this.clntRef = value;
    }

    /**
     * Gets the value of the trfConfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfConfRef() {
        return trfConfRef;
    }

    /**
     * Sets the value of the trfConfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrfConfRef(String value) {
        this.trfConfRef = value;
    }

    /**
     * Gets the value of the ctrPtyRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getCtrPtyRef() {
        return ctrPtyRef;
    }

    /**
     * Sets the value of the ctrPtyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public void setCtrPtyRef(AdditionalReference10 value) {
        this.ctrPtyRef = value;
    }

    /**
     * Gets the value of the cxlRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRef() {
        return cxlRef;
    }

    /**
     * Sets the value of the cxlRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxlRef(String value) {
        this.cxlRef = value;
    }

    /**
     * Gets the value of the rvslRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRvslRsn() {
        return rvslRsn;
    }

    /**
     * Sets the value of the rvslRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRvslRsn(String value) {
        this.rvslRsn = value;
    }

}
