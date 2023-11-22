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

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelecomServicesSummary2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TelecomServicesSummary2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Cstmr" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Customer6" minOccurs="0"/>
 *         <element name="BllgStmtPrdStart" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ISODate" minOccurs="0"/>
 *         <element name="BllgStmtPrdEnd" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ISODate" minOccurs="0"/>
 *         <element name="BllgEvt" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Amount19" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TtlTax" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Tax39" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelecomServicesSummary2", propOrder = {
    "cstmr",
    "bllgStmtPrdStart",
    "bllgStmtPrdEnd",
    "bllgEvt",
    "ttlTax",
    "addtlData"
})
public class TelecomServicesSummary2 {

    @XmlElement(name = "Cstmr")
    protected Customer6 cstmr;
    @XmlElement(name = "BllgStmtPrdStart")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bllgStmtPrdStart;
    @XmlElement(name = "BllgStmtPrdEnd")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bllgStmtPrdEnd;
    @XmlElement(name = "BllgEvt")
    protected List<Amount19> bllgEvt;
    @XmlElement(name = "TtlTax")
    protected List<Tax39> ttlTax;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the cstmr property.
     * 
     * @return
     *     possible object is
     *     {@link Customer6 }
     *     
     */
    public Customer6 getCstmr() {
        return cstmr;
    }

    /**
     * Sets the value of the cstmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer6 }
     *     
     */
    public void setCstmr(Customer6 value) {
        this.cstmr = value;
    }

    /**
     * Gets the value of the bllgStmtPrdStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBllgStmtPrdStart() {
        return bllgStmtPrdStart;
    }

    /**
     * Sets the value of the bllgStmtPrdStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBllgStmtPrdStart(XMLGregorianCalendar value) {
        this.bllgStmtPrdStart = value;
    }

    /**
     * Gets the value of the bllgStmtPrdEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBllgStmtPrdEnd() {
        return bllgStmtPrdEnd;
    }

    /**
     * Sets the value of the bllgStmtPrdEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBllgStmtPrdEnd(XMLGregorianCalendar value) {
        this.bllgStmtPrdEnd = value;
    }

    /**
     * Gets the value of the bllgEvt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bllgEvt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBllgEvt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amount19 }
     * 
     * 
     * @return
     *     The value of the bllgEvt property.
     */
    public List<Amount19> getBllgEvt() {
        if (bllgEvt == null) {
            bllgEvt = new ArrayList<>();
        }
        return this.bllgEvt;
    }

    /**
     * Gets the value of the ttlTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ttlTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax39 }
     * 
     * 
     * @return
     *     The value of the ttlTax property.
     */
    public List<Tax39> getTtlTax() {
        if (ttlTax == null) {
            ttlTax = new ArrayList<>();
        }
        return this.ttlTax;
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
