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

package org.jpos.iso20022.catp_007_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCustomerProfile5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMCustomerProfile5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrflRef" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}Max35Text" minOccurs="0"/>
 *         <element name="CstmrId" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}Max35Text" minOccurs="0"/>
 *         <element name="PrflDesc" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}Max70Text" minOccurs="0"/>
 *         <element name="AllwdSvcs" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ATMService17" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCustomerProfile5", propOrder = {
    "prflRef",
    "cstmrId",
    "prflDesc",
    "allwdSvcs"
})
public class ATMCustomerProfile5 {

    @XmlElement(name = "PrflRef")
    protected String prflRef;
    @XmlElement(name = "CstmrId")
    protected String cstmrId;
    @XmlElement(name = "PrflDesc")
    protected String prflDesc;
    @XmlElement(name = "AllwdSvcs")
    protected List<ATMService17> allwdSvcs;

    /**
     * Gets the value of the prflRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrflRef() {
        return prflRef;
    }

    /**
     * Sets the value of the prflRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrflRef(String value) {
        this.prflRef = value;
    }

    /**
     * Gets the value of the cstmrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrId() {
        return cstmrId;
    }

    /**
     * Sets the value of the cstmrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstmrId(String value) {
        this.cstmrId = value;
    }

    /**
     * Gets the value of the prflDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrflDesc() {
        return prflDesc;
    }

    /**
     * Sets the value of the prflDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrflDesc(String value) {
        this.prflDesc = value;
    }

    /**
     * Gets the value of the allwdSvcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the allwdSvcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdSvcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMService17 }
     * 
     * 
     * @return
     *     The value of the allwdSvcs property.
     */
    public List<ATMService17> getAllwdSvcs() {
        if (allwdSvcs == null) {
            allwdSvcs = new ArrayList<>();
        }
        return this.allwdSvcs;
    }

}
