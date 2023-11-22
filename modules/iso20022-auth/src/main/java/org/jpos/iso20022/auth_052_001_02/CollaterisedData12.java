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

package org.jpos.iso20022.auth_052_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollaterisedData12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollaterisedData12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CollValDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}ISODate" minOccurs="0"/>
 *         <element name="AsstTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}CollateralType21" minOccurs="0"/>
 *         <element name="NetXpsrCollstnInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="BsktIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}SecurityIdentification26Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaterisedData12", propOrder = {
    "collValDt",
    "asstTp",
    "netXpsrCollstnInd",
    "bsktIdr"
})
public class CollaterisedData12 {

    @XmlElement(name = "CollValDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar collValDt;
    @XmlElement(name = "AsstTp")
    protected CollateralType21 asstTp;
    @XmlElement(name = "NetXpsrCollstnInd")
    protected Boolean netXpsrCollstnInd;
    @XmlElement(name = "BsktIdr")
    protected SecurityIdentification26Choice bsktIdr;

    /**
     * Gets the value of the collValDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCollValDt() {
        return collValDt;
    }

    /**
     * Sets the value of the collValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCollValDt(XMLGregorianCalendar value) {
        this.collValDt = value;
    }

    /**
     * Gets the value of the asstTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralType21 }
     *     
     */
    public CollateralType21 getAsstTp() {
        return asstTp;
    }

    /**
     * Sets the value of the asstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralType21 }
     *     
     */
    public void setAsstTp(CollateralType21 value) {
        this.asstTp = value;
    }

    /**
     * Gets the value of the netXpsrCollstnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetXpsrCollstnInd() {
        return netXpsrCollstnInd;
    }

    /**
     * Sets the value of the netXpsrCollstnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetXpsrCollstnInd(Boolean value) {
        this.netXpsrCollstnInd = value;
    }

    /**
     * Gets the value of the bsktIdr property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification26Choice }
     *     
     */
    public SecurityIdentification26Choice getBsktIdr() {
        return bsktIdr;
    }

    /**
     * Sets the value of the bsktIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification26Choice }
     *     
     */
    public void setBsktIdr(SecurityIdentification26Choice value) {
        this.bsktIdr = value;
    }

}
