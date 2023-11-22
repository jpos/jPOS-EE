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

package org.jpos.iso20022.auth_033_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditDefaultSwapSingleName2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CreditDefaultSwapSingleName2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SvrgnIssr" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}TrueFalseIndicator"/>
 *         <element name="RefPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}DerivativePartyIdentification1Choice" minOccurs="0"/>
 *         <element name="NtnlCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}ActiveOrHistoricCurrencyCode"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditDefaultSwapSingleName2", propOrder = {
    "svrgnIssr",
    "refPty",
    "ntnlCcy"
})
public class CreditDefaultSwapSingleName2 {

    @XmlElement(name = "SvrgnIssr")
    protected boolean svrgnIssr;
    @XmlElement(name = "RefPty")
    protected DerivativePartyIdentification1Choice refPty;
    @XmlElement(name = "NtnlCcy", required = true)
    protected String ntnlCcy;

    /**
     * Gets the value of the svrgnIssr property.
     * 
     */
    public boolean isSvrgnIssr() {
        return svrgnIssr;
    }

    /**
     * Sets the value of the svrgnIssr property.
     * 
     */
    public void setSvrgnIssr(boolean value) {
        this.svrgnIssr = value;
    }

    /**
     * Gets the value of the refPty property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativePartyIdentification1Choice }
     *     
     */
    public DerivativePartyIdentification1Choice getRefPty() {
        return refPty;
    }

    /**
     * Sets the value of the refPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativePartyIdentification1Choice }
     *     
     */
    public void setRefPty(DerivativePartyIdentification1Choice value) {
        this.refPty = value;
    }

    /**
     * Gets the value of the ntnlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlCcy() {
        return ntnlCcy;
    }

    /**
     * Sets the value of the ntnlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtnlCcy(String value) {
        this.ntnlCcy = value;
    }

}
