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

package org.jpos.iso20022.tsmt_014_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportDetails4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransportDetails4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TrnsprtDocRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}DocumentIdentification7" maxOccurs="unbounded"/>
 *         <element name="TrnsprtdGoods" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}TransportedGoods1" maxOccurs="unbounded"/>
 *         <element name="Consgnmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Consignment3" minOccurs="0"/>
 *         <element name="RtgSummry" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}TransportMeans6"/>
 *         <element name="ShipmntDt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}ShipmentDate1Choice"/>
 *         <element name="FrghtChrgs" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Charge25" minOccurs="0"/>
 *         <element name="Incotrms" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Incoterms4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportDetails4", propOrder = {
    "trnsprtDocRef",
    "trnsprtdGoods",
    "consgnmt",
    "rtgSummry",
    "shipmntDt",
    "frghtChrgs",
    "incotrms"
})
public class TransportDetails4 {

    @XmlElement(name = "TrnsprtDocRef", required = true)
    protected List<DocumentIdentification7> trnsprtDocRef;
    @XmlElement(name = "TrnsprtdGoods", required = true)
    protected List<TransportedGoods1> trnsprtdGoods;
    @XmlElement(name = "Consgnmt")
    protected Consignment3 consgnmt;
    @XmlElement(name = "RtgSummry", required = true)
    protected TransportMeans6 rtgSummry;
    @XmlElement(name = "ShipmntDt", required = true)
    protected ShipmentDate1Choice shipmntDt;
    @XmlElement(name = "FrghtChrgs")
    protected Charge25 frghtChrgs;
    @XmlElement(name = "Incotrms")
    protected Incoterms4 incotrms;

    /**
     * Gets the value of the trnsprtDocRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trnsprtDocRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnsprtDocRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIdentification7 }
     * 
     * 
     * @return
     *     The value of the trnsprtDocRef property.
     */
    public List<DocumentIdentification7> getTrnsprtDocRef() {
        if (trnsprtDocRef == null) {
            trnsprtDocRef = new ArrayList<>();
        }
        return this.trnsprtDocRef;
    }

    /**
     * Gets the value of the trnsprtdGoods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trnsprtdGoods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnsprtdGoods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportedGoods1 }
     * 
     * 
     * @return
     *     The value of the trnsprtdGoods property.
     */
    public List<TransportedGoods1> getTrnsprtdGoods() {
        if (trnsprtdGoods == null) {
            trnsprtdGoods = new ArrayList<>();
        }
        return this.trnsprtdGoods;
    }

    /**
     * Gets the value of the consgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link Consignment3 }
     *     
     */
    public Consignment3 getConsgnmt() {
        return consgnmt;
    }

    /**
     * Sets the value of the consgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Consignment3 }
     *     
     */
    public void setConsgnmt(Consignment3 value) {
        this.consgnmt = value;
    }

    /**
     * Gets the value of the rtgSummry property.
     * 
     * @return
     *     possible object is
     *     {@link TransportMeans6 }
     *     
     */
    public TransportMeans6 getRtgSummry() {
        return rtgSummry;
    }

    /**
     * Sets the value of the rtgSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeans6 }
     *     
     */
    public void setRtgSummry(TransportMeans6 value) {
        this.rtgSummry = value;
    }

    /**
     * Gets the value of the shipmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDate1Choice }
     *     
     */
    public ShipmentDate1Choice getShipmntDt() {
        return shipmntDt;
    }

    /**
     * Sets the value of the shipmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDate1Choice }
     *     
     */
    public void setShipmntDt(ShipmentDate1Choice value) {
        this.shipmntDt = value;
    }

    /**
     * Gets the value of the frghtChrgs property.
     * 
     * @return
     *     possible object is
     *     {@link Charge25 }
     *     
     */
    public Charge25 getFrghtChrgs() {
        return frghtChrgs;
    }

    /**
     * Sets the value of the frghtChrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charge25 }
     *     
     */
    public void setFrghtChrgs(Charge25 value) {
        this.frghtChrgs = value;
    }

    /**
     * Gets the value of the incotrms property.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms4 }
     *     
     */
    public Incoterms4 getIncotrms() {
        return incotrms;
    }

    /**
     * Sets the value of the incotrms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms4 }
     *     
     */
    public void setIncotrms(Incoterms4 value) {
        this.incotrms = value;
    }

}
