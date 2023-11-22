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

package org.jpos.iso20022.catp_010_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMService20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMService20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SvcRef" type="{urn:iso:std:iso:20022:tech:xsd:catp.010.001.02}Max35Text" minOccurs="0"/>
 *         <element name="ATMSvcCd" type="{urn:iso:std:iso:20022:tech:xsd:catp.010.001.02}Max35Text" minOccurs="0"/>
 *         <element name="SvcTp" type="{urn:iso:std:iso:20022:tech:xsd:catp.010.001.02}ATMServiceType5Code"/>
 *         <element name="SvcVarntId" type="{urn:iso:std:iso:20022:tech:xsd:catp.010.001.02}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMService20", propOrder = {
    "svcRef",
    "atmSvcCd",
    "svcTp",
    "svcVarntId"
})
public class ATMService20 {

    @XmlElement(name = "SvcRef")
    protected String svcRef;
    @XmlElement(name = "ATMSvcCd")
    protected String atmSvcCd;
    @XmlElement(name = "SvcTp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMServiceType5Code svcTp;
    @XmlElement(name = "SvcVarntId")
    protected List<String> svcVarntId;

    /**
     * Gets the value of the svcRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcRef() {
        return svcRef;
    }

    /**
     * Sets the value of the svcRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcRef(String value) {
        this.svcRef = value;
    }

    /**
     * Gets the value of the atmSvcCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMSvcCd() {
        return atmSvcCd;
    }

    /**
     * Sets the value of the atmSvcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMSvcCd(String value) {
        this.atmSvcCd = value;
    }

    /**
     * Gets the value of the svcTp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMServiceType5Code }
     *     
     */
    public ATMServiceType5Code getSvcTp() {
        return svcTp;
    }

    /**
     * Sets the value of the svcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMServiceType5Code }
     *     
     */
    public void setSvcTp(ATMServiceType5Code value) {
        this.svcTp = value;
    }

    /**
     * Gets the value of the svcVarntId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svcVarntId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcVarntId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the svcVarntId property.
     */
    public List<String> getSvcVarntId() {
        if (svcVarntId == null) {
            svcVarntId = new ArrayList<>();
        }
        return this.svcVarntId;
    }

}
