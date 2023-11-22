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

package org.jpos.iso20022.caam_011_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutomatedTellerMachine9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AutomatedTellerMachine9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}Max35Text"/>
 *         <element name="AddtlId" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}Max35Text" minOccurs="0"/>
 *         <element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}Max35Text" minOccurs="0"/>
 *         <element name="BaseCcy" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}ActiveCurrencyCode"/>
 *         <element name="Lctn" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}PostalAddress17" minOccurs="0"/>
 *         <element name="LctnCtgy" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}TransactionEnvironment2Code" minOccurs="0"/>
 *         <element name="Cpblties" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}PointOfInteractionCapabilities7" minOccurs="0"/>
 *         <element name="Eqpmnt" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}ATMEquipment1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutomatedTellerMachine9", propOrder = {
    "id",
    "addtlId",
    "seqNb",
    "baseCcy",
    "lctn",
    "lctnCtgy",
    "cpblties",
    "eqpmnt"
})
public class AutomatedTellerMachine9 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "AddtlId")
    protected String addtlId;
    @XmlElement(name = "SeqNb")
    protected String seqNb;
    @XmlElement(name = "BaseCcy", required = true)
    protected String baseCcy;
    @XmlElement(name = "Lctn")
    protected PostalAddress17 lctn;
    @XmlElement(name = "LctnCtgy")
    @XmlSchemaType(name = "string")
    protected TransactionEnvironment2Code lctnCtgy;
    @XmlElement(name = "Cpblties")
    protected PointOfInteractionCapabilities7 cpblties;
    @XmlElement(name = "Eqpmnt")
    protected ATMEquipment1 eqpmnt;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the addtlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlId() {
        return addtlId;
    }

    /**
     * Sets the value of the addtlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlId(String value) {
        this.addtlId = value;
    }

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqNb(String value) {
        this.seqNb = value;
    }

    /**
     * Gets the value of the baseCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCcy() {
        return baseCcy;
    }

    /**
     * Sets the value of the baseCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCcy(String value) {
        this.baseCcy = value;
    }

    /**
     * Gets the value of the lctn property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress17 }
     *     
     */
    public PostalAddress17 getLctn() {
        return lctn;
    }

    /**
     * Sets the value of the lctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress17 }
     *     
     */
    public void setLctn(PostalAddress17 value) {
        this.lctn = value;
    }

    /**
     * Gets the value of the lctnCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionEnvironment2Code }
     *     
     */
    public TransactionEnvironment2Code getLctnCtgy() {
        return lctnCtgy;
    }

    /**
     * Sets the value of the lctnCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionEnvironment2Code }
     *     
     */
    public void setLctnCtgy(TransactionEnvironment2Code value) {
        this.lctnCtgy = value;
    }

    /**
     * Gets the value of the cpblties property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionCapabilities7 }
     *     
     */
    public PointOfInteractionCapabilities7 getCpblties() {
        return cpblties;
    }

    /**
     * Sets the value of the cpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionCapabilities7 }
     *     
     */
    public void setCpblties(PointOfInteractionCapabilities7 value) {
        this.cpblties = value;
    }

    /**
     * Gets the value of the eqpmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEquipment1 }
     *     
     */
    public ATMEquipment1 getEqpmnt() {
        return eqpmnt;
    }

    /**
     * Sets the value of the eqpmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEquipment1 }
     *     
     */
    public void setEqpmnt(ATMEquipment1 value) {
        this.eqpmnt = value;
    }

}
