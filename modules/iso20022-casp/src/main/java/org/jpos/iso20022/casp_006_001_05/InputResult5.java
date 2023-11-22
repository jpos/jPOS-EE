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

package org.jpos.iso20022.casp_006_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputResult5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InputResult5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DvcTp" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}SaleCapabilities2Code"/>
 *         <element name="InfQlfr" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}InformationQualify1Code"/>
 *         <element name="InptRsltData" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}InputResultData5"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputResult5", propOrder = {
    "dvcTp",
    "infQlfr",
    "inptRsltData"
})
public class InputResult5 {

    @XmlElement(name = "DvcTp", required = true)
    @XmlSchemaType(name = "string")
    protected SaleCapabilities2Code dvcTp;
    @XmlElement(name = "InfQlfr", required = true)
    @XmlSchemaType(name = "string")
    protected InformationQualify1Code infQlfr;
    @XmlElement(name = "InptRsltData", required = true)
    protected InputResultData5 inptRsltData;

    /**
     * Gets the value of the dvcTp property.
     * 
     * @return
     *     possible object is
     *     {@link SaleCapabilities2Code }
     *     
     */
    public SaleCapabilities2Code getDvcTp() {
        return dvcTp;
    }

    /**
     * Sets the value of the dvcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleCapabilities2Code }
     *     
     */
    public void setDvcTp(SaleCapabilities2Code value) {
        this.dvcTp = value;
    }

    /**
     * Gets the value of the infQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link InformationQualify1Code }
     *     
     */
    public InformationQualify1Code getInfQlfr() {
        return infQlfr;
    }

    /**
     * Sets the value of the infQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationQualify1Code }
     *     
     */
    public void setInfQlfr(InformationQualify1Code value) {
        this.infQlfr = value;
    }

    /**
     * Gets the value of the inptRsltData property.
     * 
     * @return
     *     possible object is
     *     {@link InputResultData5 }
     *     
     */
    public InputResultData5 getInptRsltData() {
        return inptRsltData;
    }

    /**
     * Sets the value of the inptRsltData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputResultData5 }
     *     
     */
    public void setInptRsltData(InputResultData5 value) {
        this.inptRsltData = value;
    }

}
