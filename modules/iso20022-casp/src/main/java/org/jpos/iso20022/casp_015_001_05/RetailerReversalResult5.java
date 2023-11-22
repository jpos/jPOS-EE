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

package org.jpos.iso20022.casp_015_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerReversalResult5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RetailerReversalResult5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="POIRcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}Max35Text" minOccurs="0"/>
 *         <element name="OrgnlPmtTx" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}CardPaymentTransaction127" minOccurs="0"/>
 *         <element name="CstmrOrdr" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}CustomerOrder1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailerReversalResult5", propOrder = {
    "poiRcncltnId",
    "orgnlPmtTx",
    "cstmrOrdr"
})
public class RetailerReversalResult5 {

    @XmlElement(name = "POIRcncltnId")
    protected String poiRcncltnId;
    @XmlElement(name = "OrgnlPmtTx")
    protected CardPaymentTransaction127 orgnlPmtTx;
    @XmlElement(name = "CstmrOrdr")
    protected List<CustomerOrder1> cstmrOrdr;

    /**
     * Gets the value of the poiRcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOIRcncltnId() {
        return poiRcncltnId;
    }

    /**
     * Sets the value of the poiRcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOIRcncltnId(String value) {
        this.poiRcncltnId = value;
    }

    /**
     * Gets the value of the orgnlPmtTx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction127 }
     *     
     */
    public CardPaymentTransaction127 getOrgnlPmtTx() {
        return orgnlPmtTx;
    }

    /**
     * Sets the value of the orgnlPmtTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction127 }
     *     
     */
    public void setOrgnlPmtTx(CardPaymentTransaction127 value) {
        this.orgnlPmtTx = value;
    }

    /**
     * Gets the value of the cstmrOrdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cstmrOrdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstmrOrdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrder1 }
     * 
     * 
     * @return
     *     The value of the cstmrOrdr property.
     */
    public List<CustomerOrder1> getCstmrOrdr() {
        if (cstmrOrdr == null) {
            cstmrOrdr = new ArrayList<>();
        }
        return this.cstmrOrdr;
    }

}
