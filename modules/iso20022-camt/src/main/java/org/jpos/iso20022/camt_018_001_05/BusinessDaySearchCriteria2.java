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

package org.jpos.iso20022.camt_018_001_05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessDaySearchCriteria2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BusinessDaySearchCriteria2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SysDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.018.001.05}ISODate" minOccurs="0"/>
 *         <element name="SysId" type="{urn:iso:std:iso:20022:tech:xsd:camt.018.001.05}SystemIdentification2Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SysCcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.018.001.05}ActiveCurrencyCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="EvtTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.018.001.05}SystemEventType2Choice" minOccurs="0"/>
 *         <element name="ClsrPrd" type="{urn:iso:std:iso:20022:tech:xsd:camt.018.001.05}DateTimePeriod1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDaySearchCriteria2", propOrder = {
    "sysDt",
    "sysId",
    "sysCcy",
    "evtTp",
    "clsrPrd"
})
public class BusinessDaySearchCriteria2 {

    @XmlElement(name = "SysDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sysDt;
    @XmlElement(name = "SysId")
    protected List<SystemIdentification2Choice> sysId;
    @XmlElement(name = "SysCcy")
    protected List<String> sysCcy;
    @XmlElement(name = "EvtTp")
    protected SystemEventType2Choice evtTp;
    @XmlElement(name = "ClsrPrd")
    protected DateTimePeriod1Choice clsrPrd;

    /**
     * Gets the value of the sysDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSysDt() {
        return sysDt;
    }

    /**
     * Sets the value of the sysDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSysDt(XMLGregorianCalendar value) {
        this.sysDt = value;
    }

    /**
     * Gets the value of the sysId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sysId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSysId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemIdentification2Choice }
     * 
     * 
     * @return
     *     The value of the sysId property.
     */
    public List<SystemIdentification2Choice> getSysId() {
        if (sysId == null) {
            sysId = new ArrayList<>();
        }
        return this.sysId;
    }

    /**
     * Gets the value of the sysCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sysCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSysCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the sysCcy property.
     */
    public List<String> getSysCcy() {
        if (sysCcy == null) {
            sysCcy = new ArrayList<>();
        }
        return this.sysCcy;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEventType2Choice }
     *     
     */
    public SystemEventType2Choice getEvtTp() {
        return evtTp;
    }

    /**
     * Sets the value of the evtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEventType2Choice }
     *     
     */
    public void setEvtTp(SystemEventType2Choice value) {
        this.evtTp = value;
    }

    /**
     * Gets the value of the clsrPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public DateTimePeriod1Choice getClsrPrd() {
        return clsrPrd;
    }

    /**
     * Sets the value of the clsrPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public void setClsrPrd(DateTimePeriod1Choice value) {
        this.clsrPrd = value;
    }

}
