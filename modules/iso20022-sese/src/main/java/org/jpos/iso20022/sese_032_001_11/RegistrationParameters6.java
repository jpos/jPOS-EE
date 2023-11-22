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

package org.jpos.iso20022.sese_032_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrationParameters6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RegistrationParameters6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CertfctnId" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}Max35Text" minOccurs="0"/>
 *         <element name="CertfctnDtTm" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="RegarAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}Max35Text" minOccurs="0"/>
 *         <element name="CertNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}SecuritiesCertificate4" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationParameters6", propOrder = {
    "certfctnId",
    "certfctnDtTm",
    "regarAcct",
    "certNb"
})
public class RegistrationParameters6 {

    @XmlElement(name = "CertfctnId")
    protected String certfctnId;
    @XmlElement(name = "CertfctnDtTm")
    protected DateAndDateTime2Choice certfctnDtTm;
    @XmlElement(name = "RegarAcct")
    protected String regarAcct;
    @XmlElement(name = "CertNb")
    protected List<SecuritiesCertificate4> certNb;

    /**
     * Gets the value of the certfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertfctnId() {
        return certfctnId;
    }

    /**
     * Sets the value of the certfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertfctnId(String value) {
        this.certfctnId = value;
    }

    /**
     * Gets the value of the certfctnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getCertfctnDtTm() {
        return certfctnDtTm;
    }

    /**
     * Sets the value of the certfctnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setCertfctnDtTm(DateAndDateTime2Choice value) {
        this.certfctnDtTm = value;
    }

    /**
     * Gets the value of the regarAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegarAcct() {
        return regarAcct;
    }

    /**
     * Sets the value of the regarAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegarAcct(String value) {
        this.regarAcct = value;
    }

    /**
     * Gets the value of the certNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the certNb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertNb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesCertificate4 }
     * 
     * 
     * @return
     *     The value of the certNb property.
     */
    public List<SecuritiesCertificate4> getCertNb() {
        if (certNb == null) {
            certNb = new ArrayList<>();
        }
        return this.certNb;
    }

}
