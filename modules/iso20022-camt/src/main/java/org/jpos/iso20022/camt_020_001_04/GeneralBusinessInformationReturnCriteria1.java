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

package org.jpos.iso20022.camt_020_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralBusinessInformationReturnCriteria1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GeneralBusinessInformationReturnCriteria1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="QlfrInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.020.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="SbjtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.020.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="SbjtDtlsInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.020.001.04}RequestedIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralBusinessInformationReturnCriteria1", propOrder = {
    "qlfrInd",
    "sbjtInd",
    "sbjtDtlsInd"
})
public class GeneralBusinessInformationReturnCriteria1 {

    @XmlElement(name = "QlfrInd")
    protected Boolean qlfrInd;
    @XmlElement(name = "SbjtInd")
    protected Boolean sbjtInd;
    @XmlElement(name = "SbjtDtlsInd")
    protected Boolean sbjtDtlsInd;

    /**
     * Gets the value of the qlfrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQlfrInd() {
        return qlfrInd;
    }

    /**
     * Sets the value of the qlfrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQlfrInd(Boolean value) {
        this.qlfrInd = value;
    }

    /**
     * Gets the value of the sbjtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSbjtInd() {
        return sbjtInd;
    }

    /**
     * Sets the value of the sbjtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSbjtInd(Boolean value) {
        this.sbjtInd = value;
    }

    /**
     * Gets the value of the sbjtDtlsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSbjtDtlsInd() {
        return sbjtDtlsInd;
    }

    /**
     * Sets the value of the sbjtDtlsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSbjtDtlsInd(Boolean value) {
        this.sbjtDtlsInd = value;
    }

}
