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

package org.jpos.iso20022.caad_009_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DriverInParty2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DriverInParty2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max70Text" minOccurs="0"/>
 *         <element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Address2" minOccurs="0"/>
 *         <element name="Ctct" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Contact6" minOccurs="0"/>
 *         <element name="DtOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}ISODate" minOccurs="0"/>
 *         <element name="Age" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max2NumericText" minOccurs="0"/>
 *         <element name="DrvrCrdntl" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}TravelDocument2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DrvgLic" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}DrivingLicense2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriverInParty2", propOrder = {
    "nm",
    "adr",
    "ctct",
    "dtOfBirth",
    "age",
    "drvrCrdntl",
    "drvgLic"
})
public class DriverInParty2 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Adr")
    protected Address2 adr;
    @XmlElement(name = "Ctct")
    protected Contact6 ctct;
    @XmlElement(name = "DtOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfBirth;
    @XmlElement(name = "Age")
    protected String age;
    @XmlElement(name = "DrvrCrdntl")
    protected List<TravelDocument2> drvrCrdntl;
    @XmlElement(name = "DrvgLic")
    protected DrivingLicense2 drvgLic;

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
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public void setAdr(Address2 value) {
        this.adr = value;
    }

    /**
     * Gets the value of the ctct property.
     * 
     * @return
     *     possible object is
     *     {@link Contact6 }
     *     
     */
    public Contact6 getCtct() {
        return ctct;
    }

    /**
     * Sets the value of the ctct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact6 }
     *     
     */
    public void setCtct(Contact6 value) {
        this.ctct = value;
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
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge(String value) {
        this.age = value;
    }

    /**
     * Gets the value of the drvrCrdntl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the drvrCrdntl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrvrCrdntl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelDocument2 }
     * 
     * 
     * @return
     *     The value of the drvrCrdntl property.
     */
    public List<TravelDocument2> getDrvrCrdntl() {
        if (drvrCrdntl == null) {
            drvrCrdntl = new ArrayList<>();
        }
        return this.drvrCrdntl;
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

}
