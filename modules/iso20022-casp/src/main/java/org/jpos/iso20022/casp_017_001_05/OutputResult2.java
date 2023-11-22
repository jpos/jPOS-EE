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

package org.jpos.iso20022.casp_017_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputResult2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OutputResult2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DvcTp" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}UserInterface4Code"/>
 *         <element name="InfQlfr" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}InformationQualify1Code"/>
 *         <element name="Rspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}ResponseType11"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputResult2", propOrder = {
    "dvcTp",
    "infQlfr",
    "rspn"
})
public class OutputResult2 {

    @XmlElement(name = "DvcTp", required = true)
    @XmlSchemaType(name = "string")
    protected UserInterface4Code dvcTp;
    @XmlElement(name = "InfQlfr", required = true)
    @XmlSchemaType(name = "string")
    protected InformationQualify1Code infQlfr;
    @XmlElement(name = "Rspn", required = true)
    protected ResponseType11 rspn;

    /**
     * Gets the value of the dvcTp property.
     * 
     * @return
     *     possible object is
     *     {@link UserInterface4Code }
     *     
     */
    public UserInterface4Code getDvcTp() {
        return dvcTp;
    }

    /**
     * Sets the value of the dvcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInterface4Code }
     *     
     */
    public void setDvcTp(UserInterface4Code value) {
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
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType11 }
     *     
     */
    public ResponseType11 getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType11 }
     *     
     */
    public void setRspn(ResponseType11 value) {
        this.rspn = value;
    }

}
