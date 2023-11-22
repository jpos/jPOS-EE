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

package org.jpos.iso20022.cain_006_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalAction1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdditionalAction1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}ActionType10Code" minOccurs="0"/>
 *         <element name="Dstn" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}PartyType21Code" minOccurs="0"/>
 *         <element name="OthrDstn" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}Max35Text" minOccurs="0"/>
 *         <element name="DstnTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}ActionDestination1Code" minOccurs="0"/>
 *         <element name="OthrDstnTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}Max35Text" minOccurs="0"/>
 *         <element name="DstnAdr" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}Max70Text" minOccurs="0"/>
 *         <element name="Frmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}OutputFormat4Code" minOccurs="0"/>
 *         <element name="OthrFrmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Cntt" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}Content1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalAction1", propOrder = {
    "tp",
    "dstn",
    "othrDstn",
    "dstnTp",
    "othrDstnTp",
    "dstnAdr",
    "frmt",
    "othrFrmt",
    "cntt"
})
public class AdditionalAction1 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected ActionType10Code tp;
    @XmlElement(name = "Dstn")
    @XmlSchemaType(name = "string")
    protected PartyType21Code dstn;
    @XmlElement(name = "OthrDstn")
    protected String othrDstn;
    @XmlElement(name = "DstnTp")
    @XmlSchemaType(name = "string")
    protected ActionDestination1Code dstnTp;
    @XmlElement(name = "OthrDstnTp")
    protected String othrDstnTp;
    @XmlElement(name = "DstnAdr")
    protected String dstnAdr;
    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat4Code frmt;
    @XmlElement(name = "OthrFrmt")
    protected String othrFrmt;
    @XmlElement(name = "Cntt")
    protected Content1 cntt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType10Code }
     *     
     */
    public ActionType10Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType10Code }
     *     
     */
    public void setTp(ActionType10Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType21Code }
     *     
     */
    public PartyType21Code getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType21Code }
     *     
     */
    public void setDstn(PartyType21Code value) {
        this.dstn = value;
    }

    /**
     * Gets the value of the othrDstn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrDstn() {
        return othrDstn;
    }

    /**
     * Sets the value of the othrDstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrDstn(String value) {
        this.othrDstn = value;
    }

    /**
     * Gets the value of the dstnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ActionDestination1Code }
     *     
     */
    public ActionDestination1Code getDstnTp() {
        return dstnTp;
    }

    /**
     * Sets the value of the dstnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionDestination1Code }
     *     
     */
    public void setDstnTp(ActionDestination1Code value) {
        this.dstnTp = value;
    }

    /**
     * Gets the value of the othrDstnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrDstnTp() {
        return othrDstnTp;
    }

    /**
     * Sets the value of the othrDstnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrDstnTp(String value) {
        this.othrDstnTp = value;
    }

    /**
     * Gets the value of the dstnAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstnAdr() {
        return dstnAdr;
    }

    /**
     * Sets the value of the dstnAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDstnAdr(String value) {
        this.dstnAdr = value;
    }

    /**
     * Gets the value of the frmt property.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat4Code }
     *     
     */
    public OutputFormat4Code getFrmt() {
        return frmt;
    }

    /**
     * Sets the value of the frmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat4Code }
     *     
     */
    public void setFrmt(OutputFormat4Code value) {
        this.frmt = value;
    }

    /**
     * Gets the value of the othrFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrFrmt() {
        return othrFrmt;
    }

    /**
     * Sets the value of the othrFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrFrmt(String value) {
        this.othrFrmt = value;
    }

    /**
     * Gets the value of the cntt property.
     * 
     * @return
     *     possible object is
     *     {@link Content1 }
     *     
     */
    public Content1 getCntt() {
        return cntt;
    }

    /**
     * Sets the value of the cntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Content1 }
     *     
     */
    public void setCntt(Content1 value) {
        this.cntt = value;
    }

}
