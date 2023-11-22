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

package org.jpos.iso20022.camt_072_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestDetails22 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequestDetails22">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:camt.072.001.01}References14"/>
 *         <element name="Lkg" type="{urn:iso:std:iso:20022:tech:xsd:camt.072.001.01}LinkageType3Choice" minOccurs="0"/>
 *         <element name="Prty" type="{urn:iso:std:iso:20022:tech:xsd:camt.072.001.01}PriorityNumeric4Choice" minOccurs="0"/>
 *         <element name="OthrPrcg" type="{urn:iso:std:iso:20022:tech:xsd:camt.072.001.01}GenericIdentification30" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrtlSttlmInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.072.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="ClrChanl" type="{urn:iso:std:iso:20022:tech:xsd:camt.072.001.01}ClearingChannel2Code" minOccurs="0"/>
 *         <element name="Lnkgs" type="{urn:iso:std:iso:20022:tech:xsd:camt.072.001.01}Linkages57" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDetails22", propOrder = {
    "ref",
    "lkg",
    "prty",
    "othrPrcg",
    "prtlSttlmInd",
    "clrChanl",
    "lnkgs"
})
public class RequestDetails22 {

    @XmlElement(name = "Ref", required = true)
    protected References14 ref;
    @XmlElement(name = "Lkg")
    protected LinkageType3Choice lkg;
    @XmlElement(name = "Prty")
    protected PriorityNumeric4Choice prty;
    @XmlElement(name = "OthrPrcg")
    protected List<GenericIdentification30> othrPrcg;
    @XmlElement(name = "PrtlSttlmInd")
    protected Boolean prtlSttlmInd;
    @XmlElement(name = "ClrChanl")
    @XmlSchemaType(name = "string")
    protected ClearingChannel2Code clrChanl;
    @XmlElement(name = "Lnkgs")
    protected List<Linkages57> lnkgs;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References14 }
     *     
     */
    public References14 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References14 }
     *     
     */
    public void setRef(References14 value) {
        this.ref = value;
    }

    /**
     * Gets the value of the lkg property.
     * 
     * @return
     *     possible object is
     *     {@link LinkageType3Choice }
     *     
     */
    public LinkageType3Choice getLkg() {
        return lkg;
    }

    /**
     * Sets the value of the lkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkageType3Choice }
     *     
     */
    public void setLkg(LinkageType3Choice value) {
        this.lkg = value;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityNumeric4Choice }
     *     
     */
    public PriorityNumeric4Choice getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityNumeric4Choice }
     *     
     */
    public void setPrty(PriorityNumeric4Choice value) {
        this.prty = value;
    }

    /**
     * Gets the value of the othrPrcg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrPrcg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrPrcg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification30 }
     * 
     * 
     * @return
     *     The value of the othrPrcg property.
     */
    public List<GenericIdentification30> getOthrPrcg() {
        if (othrPrcg == null) {
            othrPrcg = new ArrayList<>();
        }
        return this.othrPrcg;
    }

    /**
     * Gets the value of the prtlSttlmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlSttlmInd() {
        return prtlSttlmInd;
    }

    /**
     * Sets the value of the prtlSttlmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrtlSttlmInd(Boolean value) {
        this.prtlSttlmInd = value;
    }

    /**
     * Gets the value of the clrChanl property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingChannel2Code }
     *     
     */
    public ClearingChannel2Code getClrChanl() {
        return clrChanl;
    }

    /**
     * Sets the value of the clrChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingChannel2Code }
     *     
     */
    public void setClrChanl(ClearingChannel2Code value) {
        this.clrChanl = value;
    }

    /**
     * Gets the value of the lnkgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lnkgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnkgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linkages57 }
     * 
     * 
     * @return
     *     The value of the lnkgs property.
     */
    public List<Linkages57> getLnkgs() {
        if (lnkgs == null) {
            lnkgs = new ArrayList<>();
        }
        return this.lnkgs;
    }

}
