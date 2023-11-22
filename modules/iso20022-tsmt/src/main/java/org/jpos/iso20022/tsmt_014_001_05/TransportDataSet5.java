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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportDataSet5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransportDataSet5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DataSetId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}DocumentIdentification1"/>
 *         <element name="Buyr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}PartyIdentification26" minOccurs="0"/>
 *         <element name="Sellr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}PartyIdentification26" minOccurs="0"/>
 *         <element name="Consgnr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}PartyIdentification26"/>
 *         <element name="Consgn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}PartyIdentification26" minOccurs="0"/>
 *         <element name="ShipTo" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}PartyIdentification26" minOccurs="0"/>
 *         <element name="TrnsprtInf" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}TransportDetails4"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportDataSet5", propOrder = {
    "dataSetId",
    "buyr",
    "sellr",
    "consgnr",
    "consgn",
    "shipTo",
    "trnsprtInf"
})
public class TransportDataSet5 {

    @XmlElement(name = "DataSetId", required = true)
    protected DocumentIdentification1 dataSetId;
    @XmlElement(name = "Buyr")
    protected PartyIdentification26 buyr;
    @XmlElement(name = "Sellr")
    protected PartyIdentification26 sellr;
    @XmlElement(name = "Consgnr", required = true)
    protected PartyIdentification26 consgnr;
    @XmlElement(name = "Consgn")
    protected PartyIdentification26 consgn;
    @XmlElement(name = "ShipTo")
    protected PartyIdentification26 shipTo;
    @XmlElement(name = "TrnsprtInf", required = true)
    protected TransportDetails4 trnsprtInf;

    /**
     * Gets the value of the dataSetId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification1 }
     *     
     */
    public DocumentIdentification1 getDataSetId() {
        return dataSetId;
    }

    /**
     * Sets the value of the dataSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification1 }
     *     
     */
    public void setDataSetId(DocumentIdentification1 value) {
        this.dataSetId = value;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setBuyr(PartyIdentification26 value) {
        this.buyr = value;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setSellr(PartyIdentification26 value) {
        this.sellr = value;
    }

    /**
     * Gets the value of the consgnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getConsgnr() {
        return consgnr;
    }

    /**
     * Sets the value of the consgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setConsgnr(PartyIdentification26 value) {
        this.consgnr = value;
    }

    /**
     * Gets the value of the consgn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getConsgn() {
        return consgn;
    }

    /**
     * Sets the value of the consgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setConsgn(PartyIdentification26 value) {
        this.consgn = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setShipTo(PartyIdentification26 value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the trnsprtInf property.
     * 
     * @return
     *     possible object is
     *     {@link TransportDetails4 }
     *     
     */
    public TransportDetails4 getTrnsprtInf() {
        return trnsprtInf;
    }

    /**
     * Sets the value of the trnsprtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportDetails4 }
     *     
     */
    public void setTrnsprtInf(TransportDetails4 value) {
        this.trnsprtInf = value;
    }

}
