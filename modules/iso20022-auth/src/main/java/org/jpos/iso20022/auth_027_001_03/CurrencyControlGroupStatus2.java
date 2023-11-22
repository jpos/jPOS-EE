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

package org.jpos.iso20022.auth_027_001_03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyControlGroupStatus2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyControlGroupStatus2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrgnlRefs" type="{urn:iso:std:iso:20022:tech:xsd:auth.027.001.03}OriginalMessage5"/>
 *         <element name="RptgPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.027.001.03}TradeParty5"/>
 *         <element name="RegnAgt" type="{urn:iso:std:iso:20022:tech:xsd:auth.027.001.03}BranchAndFinancialInstitutionIdentification6"/>
 *         <element name="RptgPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.027.001.03}Period4Choice" minOccurs="0"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:auth.027.001.03}StatisticalReportingStatus1Code" minOccurs="0"/>
 *         <element name="StsRsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.027.001.03}ValidationStatusReason2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="StsDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.027.001.03}ISODateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyControlGroupStatus2", propOrder = {
    "orgnlRefs",
    "rptgPty",
    "regnAgt",
    "rptgPrd",
    "sts",
    "stsRsn",
    "stsDtTm"
})
public class CurrencyControlGroupStatus2 {

    @XmlElement(name = "OrgnlRefs", required = true)
    protected OriginalMessage5 orgnlRefs;
    @XmlElement(name = "RptgPty", required = true)
    protected TradeParty5 rptgPty;
    @XmlElement(name = "RegnAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification6 regnAgt;
    @XmlElement(name = "RptgPrd")
    protected Period4Choice rptgPrd;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected StatisticalReportingStatus1Code sts;
    @XmlElement(name = "StsRsn")
    protected List<ValidationStatusReason2> stsRsn;
    @XmlElement(name = "StsDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stsDtTm;

    /**
     * Gets the value of the orgnlRefs property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalMessage5 }
     *     
     */
    public OriginalMessage5 getOrgnlRefs() {
        return orgnlRefs;
    }

    /**
     * Sets the value of the orgnlRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalMessage5 }
     *     
     */
    public void setOrgnlRefs(OriginalMessage5 value) {
        this.orgnlRefs = value;
    }

    /**
     * Gets the value of the rptgPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty5 }
     *     
     */
    public TradeParty5 getRptgPty() {
        return rptgPty;
    }

    /**
     * Sets the value of the rptgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty5 }
     *     
     */
    public void setRptgPty(TradeParty5 value) {
        this.rptgPty = value;
    }

    /**
     * Gets the value of the regnAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getRegnAgt() {
        return regnAgt;
    }

    /**
     * Sets the value of the regnAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setRegnAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.regnAgt = value;
    }

    /**
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public void setRptgPrd(Period4Choice value) {
        this.rptgPrd = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticalReportingStatus1Code }
     *     
     */
    public StatisticalReportingStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticalReportingStatus1Code }
     *     
     */
    public void setSts(StatisticalReportingStatus1Code value) {
        this.sts = value;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stsRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationStatusReason2 }
     * 
     * 
     * @return
     *     The value of the stsRsn property.
     */
    public List<ValidationStatusReason2> getStsRsn() {
        if (stsRsn == null) {
            stsRsn = new ArrayList<>();
        }
        return this.stsRsn;
    }

    /**
     * Gets the value of the stsDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStsDtTm() {
        return stsDtTm;
    }

    /**
     * Sets the value of the stsDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStsDtTm(XMLGregorianCalendar value) {
        this.stsDtTm = value;
    }

}
