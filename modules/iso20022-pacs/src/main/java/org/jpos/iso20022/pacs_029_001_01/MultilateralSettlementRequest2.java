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

package org.jpos.iso20022.pacs_029_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultilateralSettlementRequest2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MultilateralSettlementRequest2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InstrId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.01}Max35Text"/>
 *         <element name="InstrPrty" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.01}Priority3Code" minOccurs="0"/>
 *         <element name="SttlmTmReq" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.01}SettlementTimeRequest2" minOccurs="0"/>
 *         <element name="SttlmPrty" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.01}Priority3Code" minOccurs="0"/>
 *         <element name="SttlmCycl" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.01}Max35Text" minOccurs="0"/>
 *         <element name="NbOfMvmntRcrds" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.01}Number" minOccurs="0"/>
 *         <element name="MvmntRcrd" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.01}MovementRecord1" maxOccurs="unbounded" minOccurs="2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultilateralSettlementRequest2", propOrder = {
    "instrId",
    "instrPrty",
    "sttlmTmReq",
    "sttlmPrty",
    "sttlmCycl",
    "nbOfMvmntRcrds",
    "mvmntRcrd"
})
public class MultilateralSettlementRequest2 {

    @XmlElement(name = "InstrId", required = true)
    protected String instrId;
    @XmlElement(name = "InstrPrty")
    @XmlSchemaType(name = "string")
    protected Priority3Code instrPrty;
    @XmlElement(name = "SttlmTmReq")
    protected SettlementTimeRequest2 sttlmTmReq;
    @XmlElement(name = "SttlmPrty")
    @XmlSchemaType(name = "string")
    protected Priority3Code sttlmPrty;
    @XmlElement(name = "SttlmCycl")
    protected String sttlmCycl;
    @XmlElement(name = "NbOfMvmntRcrds")
    protected BigDecimal nbOfMvmntRcrds;
    @XmlElement(name = "MvmntRcrd", required = true)
    protected List<MovementRecord1> mvmntRcrd;

    /**
     * Gets the value of the instrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrId(String value) {
        this.instrId = value;
    }

    /**
     * Gets the value of the instrPrty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority3Code }
     *     
     */
    public Priority3Code getInstrPrty() {
        return instrPrty;
    }

    /**
     * Sets the value of the instrPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority3Code }
     *     
     */
    public void setInstrPrty(Priority3Code value) {
        this.instrPrty = value;
    }

    /**
     * Gets the value of the sttlmTmReq property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTimeRequest2 }
     *     
     */
    public SettlementTimeRequest2 getSttlmTmReq() {
        return sttlmTmReq;
    }

    /**
     * Sets the value of the sttlmTmReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTimeRequest2 }
     *     
     */
    public void setSttlmTmReq(SettlementTimeRequest2 value) {
        this.sttlmTmReq = value;
    }

    /**
     * Gets the value of the sttlmPrty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority3Code }
     *     
     */
    public Priority3Code getSttlmPrty() {
        return sttlmPrty;
    }

    /**
     * Sets the value of the sttlmPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority3Code }
     *     
     */
    public void setSttlmPrty(Priority3Code value) {
        this.sttlmPrty = value;
    }

    /**
     * Gets the value of the sttlmCycl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCycl() {
        return sttlmCycl;
    }

    /**
     * Sets the value of the sttlmCycl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmCycl(String value) {
        this.sttlmCycl = value;
    }

    /**
     * Gets the value of the nbOfMvmntRcrds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfMvmntRcrds() {
        return nbOfMvmntRcrds;
    }

    /**
     * Sets the value of the nbOfMvmntRcrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfMvmntRcrds(BigDecimal value) {
        this.nbOfMvmntRcrds = value;
    }

    /**
     * Gets the value of the mvmntRcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mvmntRcrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMvmntRcrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MovementRecord1 }
     * 
     * 
     * @return
     *     The value of the mvmntRcrd property.
     */
    public List<MovementRecord1> getMvmntRcrd() {
        if (mvmntRcrd == null) {
            mvmntRcrd = new ArrayList<>();
        }
        return this.mvmntRcrd;
    }

}
