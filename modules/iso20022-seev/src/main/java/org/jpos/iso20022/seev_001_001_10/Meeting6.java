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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Meeting6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Meeting6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DtAndTm" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}DateFormat58Choice"/>
 *         <element name="DtSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}MeetingDateStatus2Code" minOccurs="0"/>
 *         <element name="QrmReqrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}YesNoIndicator" minOccurs="0"/>
 *         <element name="Lctn" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}LocationFormat1Choice" maxOccurs="5"/>
 *         <element name="QrmQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}QuorumQuantity1Choice" minOccurs="0"/>
 *         <element name="URLAdr" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Max2048Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Meeting6", propOrder = {
    "dtAndTm",
    "dtSts",
    "qrmReqrd",
    "lctn",
    "qrmQty",
    "urlAdr"
})
public class Meeting6 {

    @XmlElement(name = "DtAndTm", required = true)
    protected DateFormat58Choice dtAndTm;
    @XmlElement(name = "DtSts")
    @XmlSchemaType(name = "string")
    protected MeetingDateStatus2Code dtSts;
    @XmlElement(name = "QrmReqrd")
    protected Boolean qrmReqrd;
    @XmlElement(name = "Lctn", required = true)
    protected List<LocationFormat1Choice> lctn;
    @XmlElement(name = "QrmQty")
    protected QuorumQuantity1Choice qrmQty;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;

    /**
     * Gets the value of the dtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getDtAndTm() {
        return dtAndTm;
    }

    /**
     * Sets the value of the dtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public void setDtAndTm(DateFormat58Choice value) {
        this.dtAndTm = value;
    }

    /**
     * Gets the value of the dtSts property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingDateStatus2Code }
     *     
     */
    public MeetingDateStatus2Code getDtSts() {
        return dtSts;
    }

    /**
     * Sets the value of the dtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingDateStatus2Code }
     *     
     */
    public void setDtSts(MeetingDateStatus2Code value) {
        this.dtSts = value;
    }

    /**
     * Gets the value of the qrmReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQrmReqrd() {
        return qrmReqrd;
    }

    /**
     * Sets the value of the qrmReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQrmReqrd(Boolean value) {
        this.qrmReqrd = value;
    }

    /**
     * Gets the value of the lctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationFormat1Choice }
     * 
     * 
     * @return
     *     The value of the lctn property.
     */
    public List<LocationFormat1Choice> getLctn() {
        if (lctn == null) {
            lctn = new ArrayList<>();
        }
        return this.lctn;
    }

    /**
     * Gets the value of the qrmQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuorumQuantity1Choice }
     *     
     */
    public QuorumQuantity1Choice getQrmQty() {
        return qrmQty;
    }

    /**
     * Sets the value of the qrmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuorumQuantity1Choice }
     *     
     */
    public void setQrmQty(QuorumQuantity1Choice value) {
        this.qrmQty = value;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAdr() {
        return urlAdr;
    }

    /**
     * Sets the value of the urlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLAdr(String value) {
        this.urlAdr = value;
    }

}
