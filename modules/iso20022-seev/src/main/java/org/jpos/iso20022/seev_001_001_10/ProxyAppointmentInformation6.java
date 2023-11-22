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

package org.jpos.iso20022.seev_001_001_10;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProxyAppointmentInformation6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProxyAppointmentInformation6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RegnMtd" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Max350Text" minOccurs="0"/>
 *         <element name="Ddln" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}DateFormat58Choice" minOccurs="0"/>
 *         <element name="MktDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}DateFormat58Choice" minOccurs="0"/>
 *         <element name="AuthrsdPrxy" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Proxy11" maxOccurs="10" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProxyAppointmentInformation6", propOrder = {
    "regnMtd",
    "ddln",
    "mktDdln",
    "authrsdPrxy"
})
public class ProxyAppointmentInformation6 {

    @XmlElement(name = "RegnMtd")
    protected String regnMtd;
    @XmlElement(name = "Ddln")
    protected DateFormat58Choice ddln;
    @XmlElement(name = "MktDdln")
    protected DateFormat58Choice mktDdln;
    @XmlElement(name = "AuthrsdPrxy")
    protected List<Proxy11> authrsdPrxy;

    /**
     * Gets the value of the regnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnMtd() {
        return regnMtd;
    }

    /**
     * Sets the value of the regnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnMtd(String value) {
        this.regnMtd = value;
    }

    /**
     * Gets the value of the ddln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getDdln() {
        return ddln;
    }

    /**
     * Sets the value of the ddln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public void setDdln(DateFormat58Choice value) {
        this.ddln = value;
    }

    /**
     * Gets the value of the mktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getMktDdln() {
        return mktDdln;
    }

    /**
     * Sets the value of the mktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public void setMktDdln(DateFormat58Choice value) {
        this.mktDdln = value;
    }

    /**
     * Gets the value of the authrsdPrxy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the authrsdPrxy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthrsdPrxy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Proxy11 }
     * 
     * 
     * @return
     *     The value of the authrsdPrxy property.
     */
    public List<Proxy11> getAuthrsdPrxy() {
        if (authrsdPrxy == null) {
            authrsdPrxy = new ArrayList<>();
        }
        return this.authrsdPrxy;
    }

}
