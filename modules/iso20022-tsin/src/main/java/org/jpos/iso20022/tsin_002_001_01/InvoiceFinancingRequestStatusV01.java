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

package org.jpos.iso20022.tsin_002_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceFinancingRequestStatusV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvoiceFinancingRequestStatusV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StsId" type="{urn:iso:std:iso:20022:tech:xsd:tsin.002.001.01}MessageIdentification1"/>
 *         <element name="OrgnlReqInfAndSts" type="{urn:iso:std:iso:20022:tech:xsd:tsin.002.001.01}OriginalRequestInformation1"/>
 *         <element name="FincgInfAndSts" type="{urn:iso:std:iso:20022:tech:xsd:tsin.002.001.01}FinancingInformationAndStatus1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceFinancingRequestStatusV01", propOrder = {
    "stsId",
    "orgnlReqInfAndSts",
    "fincgInfAndSts"
})
public class InvoiceFinancingRequestStatusV01 {

    @XmlElement(name = "StsId", required = true)
    protected MessageIdentification1 stsId;
    @XmlElement(name = "OrgnlReqInfAndSts", required = true)
    protected OriginalRequestInformation1 orgnlReqInfAndSts;
    @XmlElement(name = "FincgInfAndSts")
    protected FinancingInformationAndStatus1 fincgInfAndSts;

    /**
     * Gets the value of the stsId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getStsId() {
        return stsId;
    }

    /**
     * Sets the value of the stsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setStsId(MessageIdentification1 value) {
        this.stsId = value;
    }

    /**
     * Gets the value of the orgnlReqInfAndSts property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalRequestInformation1 }
     *     
     */
    public OriginalRequestInformation1 getOrgnlReqInfAndSts() {
        return orgnlReqInfAndSts;
    }

    /**
     * Sets the value of the orgnlReqInfAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalRequestInformation1 }
     *     
     */
    public void setOrgnlReqInfAndSts(OriginalRequestInformation1 value) {
        this.orgnlReqInfAndSts = value;
    }

    /**
     * Gets the value of the fincgInfAndSts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingInformationAndStatus1 }
     *     
     */
    public FinancingInformationAndStatus1 getFincgInfAndSts() {
        return fincgInfAndSts;
    }

    /**
     * Sets the value of the fincgInfAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingInformationAndStatus1 }
     *     
     */
    public void setFincgInfAndSts(FinancingInformationAndStatus1 value) {
        this.fincgInfAndSts = value;
    }

}
