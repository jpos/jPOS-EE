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

package org.jpos.iso20022.catm_006_001_07;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintenanceDelegationResponse7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MaintenanceDelegationResponse7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TMId" type="{urn:iso:std:iso:20022:tech:xsd:catm.006.001.07}GenericIdentification176"/>
 *         <element name="MstrTMId" type="{urn:iso:std:iso:20022:tech:xsd:catm.006.001.07}GenericIdentification176" minOccurs="0"/>
 *         <element name="TMDtTm" type="{urn:iso:std:iso:20022:tech:xsd:catm.006.001.07}ISODateTime"/>
 *         <element name="TMChllngVal" type="{urn:iso:std:iso:20022:tech:xsd:catm.006.001.07}Max140Binary"/>
 *         <element name="DlgtnRspn" type="{urn:iso:std:iso:20022:tech:xsd:catm.006.001.07}MaintenanceDelegation16" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceDelegationResponse7", propOrder = {
    "tmId",
    "mstrTMId",
    "tmDtTm",
    "tmChllngVal",
    "dlgtnRspn"
})
public class MaintenanceDelegationResponse7 {

    @XmlElement(name = "TMId", required = true)
    protected GenericIdentification176 tmId;
    @XmlElement(name = "MstrTMId")
    protected GenericIdentification176 mstrTMId;
    @XmlElement(name = "TMDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tmDtTm;
    @XmlElement(name = "TMChllngVal", required = true)
    protected byte[] tmChllngVal;
    @XmlElement(name = "DlgtnRspn", required = true)
    protected List<MaintenanceDelegation16> dlgtnRspn;

    /**
     * Gets the value of the tmId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getTMId() {
        return tmId;
    }

    /**
     * Sets the value of the tmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public void setTMId(GenericIdentification176 value) {
        this.tmId = value;
    }

    /**
     * Gets the value of the mstrTMId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getMstrTMId() {
        return mstrTMId;
    }

    /**
     * Sets the value of the mstrTMId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public void setMstrTMId(GenericIdentification176 value) {
        this.mstrTMId = value;
    }

    /**
     * Gets the value of the tmDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTMDtTm() {
        return tmDtTm;
    }

    /**
     * Sets the value of the tmDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTMDtTm(XMLGregorianCalendar value) {
        this.tmDtTm = value;
    }

    /**
     * Gets the value of the tmChllngVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTMChllngVal() {
        return tmChllngVal;
    }

    /**
     * Sets the value of the tmChllngVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTMChllngVal(byte[] value) {
        this.tmChllngVal = value;
    }

    /**
     * Gets the value of the dlgtnRspn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dlgtnRspn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlgtnRspn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceDelegation16 }
     * 
     * 
     * @return
     *     The value of the dlgtnRspn property.
     */
    public List<MaintenanceDelegation16> getDlgtnRspn() {
        if (dlgtnRspn == null) {
            dlgtnRspn = new ArrayList<>();
        }
        return this.dlgtnRspn;
    }

}
