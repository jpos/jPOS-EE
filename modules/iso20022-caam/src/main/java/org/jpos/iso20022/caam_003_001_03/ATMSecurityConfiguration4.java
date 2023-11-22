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

package org.jpos.iso20022.caam_003_001_03;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMSecurityConfiguration4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMSecurityConfiguration4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MaxCerts" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}Number" minOccurs="0"/>
 *         <element name="MaxSgntrs" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}Number" minOccurs="0"/>
 *         <element name="DgtlSgntrAlgo" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}Algorithm14Code" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMSecurityConfiguration4", propOrder = {
    "maxCerts",
    "maxSgntrs",
    "dgtlSgntrAlgo"
})
public class ATMSecurityConfiguration4 {

    @XmlElement(name = "MaxCerts")
    protected BigDecimal maxCerts;
    @XmlElement(name = "MaxSgntrs")
    protected BigDecimal maxSgntrs;
    @XmlElement(name = "DgtlSgntrAlgo")
    @XmlSchemaType(name = "string")
    protected List<Algorithm14Code> dgtlSgntrAlgo;

    /**
     * Gets the value of the maxCerts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxCerts() {
        return maxCerts;
    }

    /**
     * Sets the value of the maxCerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxCerts(BigDecimal value) {
        this.maxCerts = value;
    }

    /**
     * Gets the value of the maxSgntrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxSgntrs() {
        return maxSgntrs;
    }

    /**
     * Sets the value of the maxSgntrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxSgntrs(BigDecimal value) {
        this.maxSgntrs = value;
    }

    /**
     * Gets the value of the dgtlSgntrAlgo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dgtlSgntrAlgo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgtlSgntrAlgo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Algorithm14Code }
     * 
     * 
     * @return
     *     The value of the dgtlSgntrAlgo property.
     */
    public List<Algorithm14Code> getDgtlSgntrAlgo() {
        if (dgtlSgntrAlgo == null) {
            dgtlSgntrAlgo = new ArrayList<>();
        }
        return this.dgtlSgntrAlgo;
    }

}
