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

package org.jpos.iso20022.caad_008_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Driver2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Driver2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max70Text" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max70Text" minOccurs="0"/>
 *         <element name="DrvgLic" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}DrivingLicense2" minOccurs="0"/>
 *         <element name="Mplyr" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max70Text" minOccurs="0"/>
 *         <element name="MplyeeId" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max70Text" minOccurs="0"/>
 *         <element name="DeptNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="AddtlId" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}TravelDocument2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DtOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}ISODate" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}AdditionalData1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Driver2", propOrder = {
    "nm",
    "id",
    "drvgLic",
    "mplyr",
    "mplyeeId",
    "deptNb",
    "addtlId",
    "dtOfBirth",
    "addtlData"
})
public class Driver2 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "DrvgLic")
    protected DrivingLicense2 drvgLic;
    @XmlElement(name = "Mplyr")
    protected String mplyr;
    @XmlElement(name = "MplyeeId")
    protected String mplyeeId;
    @XmlElement(name = "DeptNb")
    protected String deptNb;
    @XmlElement(name = "AddtlId")
    protected List<TravelDocument2> addtlId;
    @XmlElement(name = "DtOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfBirth;
    @XmlElement(name = "AddtlData")
    protected AdditionalData1 addtlData;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

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
     * Gets the value of the drvgLic property.
     * 
     * @return
     *     possible object is
     *     {@link DrivingLicense2 }
     *     
     */
    public DrivingLicense2 getDrvgLic() {
        return drvgLic;
    }

    /**
     * Sets the value of the drvgLic property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrivingLicense2 }
     *     
     */
    public void setDrvgLic(DrivingLicense2 value) {
        this.drvgLic = value;
    }

    /**
     * Gets the value of the mplyr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMplyr() {
        return mplyr;
    }

    /**
     * Sets the value of the mplyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMplyr(String value) {
        this.mplyr = value;
    }

    /**
     * Gets the value of the mplyeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMplyeeId() {
        return mplyeeId;
    }

    /**
     * Sets the value of the mplyeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMplyeeId(String value) {
        this.mplyeeId = value;
    }

    /**
     * Gets the value of the deptNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptNb() {
        return deptNb;
    }

    /**
     * Sets the value of the deptNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptNb(String value) {
        this.deptNb = value;
    }

    /**
     * Gets the value of the addtlId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelDocument2 }
     * 
     * 
     * @return
     *     The value of the addtlId property.
     */
    public List<TravelDocument2> getAddtlId() {
        if (addtlId == null) {
            addtlId = new ArrayList<>();
        }
        return this.addtlId;
    }

    /**
     * Gets the value of the dtOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtOfBirth() {
        return dtOfBirth;
    }

    /**
     * Sets the value of the dtOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtOfBirth(XMLGregorianCalendar value) {
        this.dtOfBirth = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalData1 }
     *     
     */
    public AdditionalData1 getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalData1 }
     *     
     */
    public void setAddtlData(AdditionalData1 value) {
        this.addtlData = value;
    }

}
