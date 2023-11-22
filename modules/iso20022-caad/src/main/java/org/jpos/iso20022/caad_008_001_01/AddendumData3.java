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

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddendumData3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AddendumData3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PurchsIdrTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}PurchaseIdentifierType1Code" minOccurs="0"/>
 *         <element name="OthrPurchsIdrTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="PurchsIdr" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max99Text" minOccurs="0"/>
 *         <element name="AddtlAccptrData" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}AdditionalAcceptorData1" minOccurs="0"/>
 *         <element name="Cstmr" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Customer4" minOccurs="0"/>
 *         <element name="Sale" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Sale2" minOccurs="0"/>
 *         <element name="Fleet" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}FleetData4" minOccurs="0"/>
 *         <element name="Invc" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Invoice2" minOccurs="0"/>
 *         <element name="TrvlAgcy" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}TravelAgency3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PssngrTrnsprt" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}PassengerTransport2" minOccurs="0"/>
 *         <element name="VhclRntl" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}VehicleRentalService2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Ldgg" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Lodging3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ShppgData" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}ShippingData2" minOccurs="0"/>
 *         <element name="TelecomSvcs" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}TelecomServices2" minOccurs="0"/>
 *         <element name="TempSvcs" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}TemporaryServices2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Instlmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Instalment4" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddendumData3", propOrder = {
    "purchsIdrTp",
    "othrPurchsIdrTp",
    "purchsIdr",
    "addtlAccptrData",
    "cstmr",
    "sale",
    "fleet",
    "invc",
    "trvlAgcy",
    "pssngrTrnsprt",
    "vhclRntl",
    "ldgg",
    "shppgData",
    "telecomSvcs",
    "tempSvcs",
    "instlmt",
    "addtlData"
})
public class AddendumData3 {

    @XmlElement(name = "PurchsIdrTp")
    @XmlSchemaType(name = "string")
    protected PurchaseIdentifierType1Code purchsIdrTp;
    @XmlElement(name = "OthrPurchsIdrTp")
    protected String othrPurchsIdrTp;
    @XmlElement(name = "PurchsIdr")
    protected String purchsIdr;
    @XmlElement(name = "AddtlAccptrData")
    protected AdditionalAcceptorData1 addtlAccptrData;
    @XmlElement(name = "Cstmr")
    protected Customer4 cstmr;
    @XmlElement(name = "Sale")
    protected Sale2 sale;
    @XmlElement(name = "Fleet")
    protected FleetData4 fleet;
    @XmlElement(name = "Invc")
    protected Invoice2 invc;
    @XmlElement(name = "TrvlAgcy")
    protected List<TravelAgency3> trvlAgcy;
    @XmlElement(name = "PssngrTrnsprt")
    protected PassengerTransport2 pssngrTrnsprt;
    @XmlElement(name = "VhclRntl")
    protected List<VehicleRentalService2> vhclRntl;
    @XmlElement(name = "Ldgg")
    protected List<Lodging3> ldgg;
    @XmlElement(name = "ShppgData")
    protected ShippingData2 shppgData;
    @XmlElement(name = "TelecomSvcs")
    protected TelecomServices2 telecomSvcs;
    @XmlElement(name = "TempSvcs")
    protected List<TemporaryServices2> tempSvcs;
    @XmlElement(name = "Instlmt")
    protected Instalment4 instlmt;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the purchsIdrTp property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseIdentifierType1Code }
     *     
     */
    public PurchaseIdentifierType1Code getPurchsIdrTp() {
        return purchsIdrTp;
    }

    /**
     * Sets the value of the purchsIdrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseIdentifierType1Code }
     *     
     */
    public void setPurchsIdrTp(PurchaseIdentifierType1Code value) {
        this.purchsIdrTp = value;
    }

    /**
     * Gets the value of the othrPurchsIdrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPurchsIdrTp() {
        return othrPurchsIdrTp;
    }

    /**
     * Sets the value of the othrPurchsIdrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrPurchsIdrTp(String value) {
        this.othrPurchsIdrTp = value;
    }

    /**
     * Gets the value of the purchsIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchsIdr() {
        return purchsIdr;
    }

    /**
     * Sets the value of the purchsIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchsIdr(String value) {
        this.purchsIdr = value;
    }

    /**
     * Gets the value of the addtlAccptrData property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalAcceptorData1 }
     *     
     */
    public AdditionalAcceptorData1 getAddtlAccptrData() {
        return addtlAccptrData;
    }

    /**
     * Sets the value of the addtlAccptrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalAcceptorData1 }
     *     
     */
    public void setAddtlAccptrData(AdditionalAcceptorData1 value) {
        this.addtlAccptrData = value;
    }

    /**
     * Gets the value of the cstmr property.
     * 
     * @return
     *     possible object is
     *     {@link Customer4 }
     *     
     */
    public Customer4 getCstmr() {
        return cstmr;
    }

    /**
     * Sets the value of the cstmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer4 }
     *     
     */
    public void setCstmr(Customer4 value) {
        this.cstmr = value;
    }

    /**
     * Gets the value of the sale property.
     * 
     * @return
     *     possible object is
     *     {@link Sale2 }
     *     
     */
    public Sale2 getSale() {
        return sale;
    }

    /**
     * Sets the value of the sale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sale2 }
     *     
     */
    public void setSale(Sale2 value) {
        this.sale = value;
    }

    /**
     * Gets the value of the fleet property.
     * 
     * @return
     *     possible object is
     *     {@link FleetData4 }
     *     
     */
    public FleetData4 getFleet() {
        return fleet;
    }

    /**
     * Sets the value of the fleet property.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetData4 }
     *     
     */
    public void setFleet(FleetData4 value) {
        this.fleet = value;
    }

    /**
     * Gets the value of the invc property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice2 }
     *     
     */
    public Invoice2 getInvc() {
        return invc;
    }

    /**
     * Sets the value of the invc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice2 }
     *     
     */
    public void setInvc(Invoice2 value) {
        this.invc = value;
    }

    /**
     * Gets the value of the trvlAgcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trvlAgcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrvlAgcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelAgency3 }
     * 
     * 
     * @return
     *     The value of the trvlAgcy property.
     */
    public List<TravelAgency3> getTrvlAgcy() {
        if (trvlAgcy == null) {
            trvlAgcy = new ArrayList<>();
        }
        return this.trvlAgcy;
    }

    /**
     * Gets the value of the pssngrTrnsprt property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerTransport2 }
     *     
     */
    public PassengerTransport2 getPssngrTrnsprt() {
        return pssngrTrnsprt;
    }

    /**
     * Sets the value of the pssngrTrnsprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerTransport2 }
     *     
     */
    public void setPssngrTrnsprt(PassengerTransport2 value) {
        this.pssngrTrnsprt = value;
    }

    /**
     * Gets the value of the vhclRntl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the vhclRntl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVhclRntl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRentalService2 }
     * 
     * 
     * @return
     *     The value of the vhclRntl property.
     */
    public List<VehicleRentalService2> getVhclRntl() {
        if (vhclRntl == null) {
            vhclRntl = new ArrayList<>();
        }
        return this.vhclRntl;
    }

    /**
     * Gets the value of the ldgg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ldgg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLdgg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lodging3 }
     * 
     * 
     * @return
     *     The value of the ldgg property.
     */
    public List<Lodging3> getLdgg() {
        if (ldgg == null) {
            ldgg = new ArrayList<>();
        }
        return this.ldgg;
    }

    /**
     * Gets the value of the shppgData property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingData2 }
     *     
     */
    public ShippingData2 getShppgData() {
        return shppgData;
    }

    /**
     * Sets the value of the shppgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingData2 }
     *     
     */
    public void setShppgData(ShippingData2 value) {
        this.shppgData = value;
    }

    /**
     * Gets the value of the telecomSvcs property.
     * 
     * @return
     *     possible object is
     *     {@link TelecomServices2 }
     *     
     */
    public TelecomServices2 getTelecomSvcs() {
        return telecomSvcs;
    }

    /**
     * Sets the value of the telecomSvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecomServices2 }
     *     
     */
    public void setTelecomSvcs(TelecomServices2 value) {
        this.telecomSvcs = value;
    }

    /**
     * Gets the value of the tempSvcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tempSvcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTempSvcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemporaryServices2 }
     * 
     * 
     * @return
     *     The value of the tempSvcs property.
     */
    public List<TemporaryServices2> getTempSvcs() {
        if (tempSvcs == null) {
            tempSvcs = new ArrayList<>();
        }
        return this.tempSvcs;
    }

    /**
     * Gets the value of the instlmt property.
     * 
     * @return
     *     possible object is
     *     {@link Instalment4 }
     *     
     */
    public Instalment4 getInstlmt() {
        return instlmt;
    }

    /**
     * Sets the value of the instlmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instalment4 }
     *     
     */
    public void setInstlmt(Instalment4 value) {
        this.instlmt = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
    }

}
