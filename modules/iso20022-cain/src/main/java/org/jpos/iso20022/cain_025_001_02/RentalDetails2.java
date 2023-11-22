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

package org.jpos.iso20022.cain_025_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RentalDetails2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RentalDetails2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RntlId" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max70Text" minOccurs="0"/>
 *         <element name="RntlDtTm" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ISODateTime" minOccurs="0"/>
 *         <element name="RntlStart" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ServiceStartEnd2" minOccurs="0"/>
 *         <element name="RntlRtr" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ServiceStartEnd2" minOccurs="0"/>
 *         <element name="RntlTmPrd" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}PeriodUnit2Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TmPrdUnit" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max4NumericText" minOccurs="0"/>
 *         <element name="TmPrdRate" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ISO3NumericCurrencyCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RentalDetails2", propOrder = {
    "rntlId",
    "rntlDtTm",
    "rntlStart",
    "rntlRtr",
    "rntlTmPrd",
    "tmPrdUnit",
    "tmPrdRate",
    "ccy"
})
public class RentalDetails2 {

    @XmlElement(name = "RntlId")
    protected String rntlId;
    @XmlElement(name = "RntlDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rntlDtTm;
    @XmlElement(name = "RntlStart")
    protected ServiceStartEnd2 rntlStart;
    @XmlElement(name = "RntlRtr")
    protected ServiceStartEnd2 rntlRtr;
    @XmlElement(name = "RntlTmPrd")
    @XmlSchemaType(name = "string")
    protected List<PeriodUnit2Code> rntlTmPrd;
    @XmlElement(name = "TmPrdUnit")
    protected String tmPrdUnit;
    @XmlElement(name = "TmPrdRate")
    protected BigDecimal tmPrdRate;
    @XmlElement(name = "Ccy")
    protected String ccy;

    /**
     * Gets the value of the rntlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRntlId() {
        return rntlId;
    }

    /**
     * Sets the value of the rntlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRntlId(String value) {
        this.rntlId = value;
    }

    /**
     * Gets the value of the rntlDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRntlDtTm() {
        return rntlDtTm;
    }

    /**
     * Sets the value of the rntlDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRntlDtTm(XMLGregorianCalendar value) {
        this.rntlDtTm = value;
    }

    /**
     * Gets the value of the rntlStart property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStartEnd2 }
     *     
     */
    public ServiceStartEnd2 getRntlStart() {
        return rntlStart;
    }

    /**
     * Sets the value of the rntlStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStartEnd2 }
     *     
     */
    public void setRntlStart(ServiceStartEnd2 value) {
        this.rntlStart = value;
    }

    /**
     * Gets the value of the rntlRtr property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStartEnd2 }
     *     
     */
    public ServiceStartEnd2 getRntlRtr() {
        return rntlRtr;
    }

    /**
     * Sets the value of the rntlRtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStartEnd2 }
     *     
     */
    public void setRntlRtr(ServiceStartEnd2 value) {
        this.rntlRtr = value;
    }

    /**
     * Gets the value of the rntlTmPrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rntlTmPrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRntlTmPrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodUnit2Code }
     * 
     * 
     * @return
     *     The value of the rntlTmPrd property.
     */
    public List<PeriodUnit2Code> getRntlTmPrd() {
        if (rntlTmPrd == null) {
            rntlTmPrd = new ArrayList<>();
        }
        return this.rntlTmPrd;
    }

    /**
     * Gets the value of the tmPrdUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmPrdUnit() {
        return tmPrdUnit;
    }

    /**
     * Sets the value of the tmPrdUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmPrdUnit(String value) {
        this.tmPrdUnit = value;
    }

    /**
     * Gets the value of the tmPrdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTmPrdRate() {
        return tmPrdRate;
    }

    /**
     * Sets the value of the tmPrdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTmPrdRate(BigDecimal value) {
        this.tmPrdRate = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

}
