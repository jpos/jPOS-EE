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

package org.jpos.iso20022.auth_034_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyReference3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyReference3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TrgtCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}ActiveCurrencyCode"/>
 *         <element name="SrcCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}ActiveCurrencyCode"/>
 *         <element name="XchgRateInf" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}ExchangeRateInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyReference3", propOrder = {
    "trgtCcy",
    "srcCcy",
    "xchgRateInf"
})
public class CurrencyReference3 {

    @XmlElement(name = "TrgtCcy", required = true)
    protected String trgtCcy;
    @XmlElement(name = "SrcCcy", required = true)
    protected String srcCcy;
    @XmlElement(name = "XchgRateInf")
    protected List<ExchangeRateInformation1> xchgRateInf;

    /**
     * Gets the value of the trgtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgtCcy() {
        return trgtCcy;
    }

    /**
     * Sets the value of the trgtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrgtCcy(String value) {
        this.trgtCcy = value;
    }

    /**
     * Gets the value of the srcCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcCcy() {
        return srcCcy;
    }

    /**
     * Sets the value of the srcCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcCcy(String value) {
        this.srcCcy = value;
    }

    /**
     * Gets the value of the xchgRateInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xchgRateInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXchgRateInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeRateInformation1 }
     * 
     * 
     * @return
     *     The value of the xchgRateInf property.
     */
    public List<ExchangeRateInformation1> getXchgRateInf() {
        if (xchgRateInf == null) {
            xchgRateInf = new ArrayList<>();
        }
        return this.xchgRateInf;
    }

}
