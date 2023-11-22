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

package org.jpos.iso20022.caad_008_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleRentalService2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VehicleRentalService2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VhclRntlCpny" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}VehicleRentalCompany2" minOccurs="0"/>
 *         <element name="Cstmr" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}VehicleRentalCustomer2" minOccurs="0"/>
 *         <element name="SummryCmmdtyId" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="RntlAgrmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}VehicleRentalAgreement2" minOccurs="0"/>
 *         <element name="RntlInvc" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}VehicleRentalInvoice2" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalService2", propOrder = {
    "vhclRntlCpny",
    "cstmr",
    "summryCmmdtyId",
    "rntlAgrmt",
    "rntlInvc",
    "addtlData"
})
public class VehicleRentalService2 {

    @XmlElement(name = "VhclRntlCpny")
    protected VehicleRentalCompany2 vhclRntlCpny;
    @XmlElement(name = "Cstmr")
    protected VehicleRentalCustomer2 cstmr;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "RntlAgrmt")
    protected VehicleRentalAgreement2 rntlAgrmt;
    @XmlElement(name = "RntlInvc")
    protected VehicleRentalInvoice2 rntlInvc;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the vhclRntlCpny property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalCompany2 }
     *     
     */
    public VehicleRentalCompany2 getVhclRntlCpny() {
        return vhclRntlCpny;
    }

    /**
     * Sets the value of the vhclRntlCpny property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalCompany2 }
     *     
     */
    public void setVhclRntlCpny(VehicleRentalCompany2 value) {
        this.vhclRntlCpny = value;
    }

    /**
     * Gets the value of the cstmr property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalCustomer2 }
     *     
     */
    public VehicleRentalCustomer2 getCstmr() {
        return cstmr;
    }

    /**
     * Sets the value of the cstmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalCustomer2 }
     *     
     */
    public void setCstmr(VehicleRentalCustomer2 value) {
        this.cstmr = value;
    }

    /**
     * Gets the value of the summryCmmdtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummryCmmdtyId() {
        return summryCmmdtyId;
    }

    /**
     * Sets the value of the summryCmmdtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
    }

    /**
     * Gets the value of the rntlAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalAgreement2 }
     *     
     */
    public VehicleRentalAgreement2 getRntlAgrmt() {
        return rntlAgrmt;
    }

    /**
     * Sets the value of the rntlAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalAgreement2 }
     *     
     */
    public void setRntlAgrmt(VehicleRentalAgreement2 value) {
        this.rntlAgrmt = value;
    }

    /**
     * Gets the value of the rntlInvc property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalInvoice2 }
     *     
     */
    public VehicleRentalInvoice2 getRntlInvc() {
        return rntlInvc;
    }

    /**
     * Sets the value of the rntlInvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalInvoice2 }
     *     
     */
    public void setRntlInvc(VehicleRentalInvoice2 value) {
        this.rntlInvc = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlData(String value) {
        this.addtlData = value;
    }

}
