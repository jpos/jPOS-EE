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

package org.jpos.iso20022.tsrv_006_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpiryTerms1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ExpiryTerms1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DtTm" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.006.001.01}DateAndDateTimeChoice" minOccurs="0"/>
 *         <element name="AutoXtnsn" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.006.001.01}AutoExtension1" minOccurs="0"/>
 *         <element name="Cond" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.006.001.01}Max2000Text" minOccurs="0"/>
 *         <element name="OpnEnddInd" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.006.001.01}YesNoIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpiryTerms1", propOrder = {
    "dtTm",
    "autoXtnsn",
    "cond",
    "opnEnddInd"
})
public class ExpiryTerms1 {

    @XmlElement(name = "DtTm")
    protected DateAndDateTimeChoice dtTm;
    @XmlElement(name = "AutoXtnsn")
    protected AutoExtension1 autoXtnsn;
    @XmlElement(name = "Cond")
    protected String cond;
    @XmlElement(name = "OpnEnddInd")
    protected Boolean opnEnddInd;

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setDtTm(DateAndDateTimeChoice value) {
        this.dtTm = value;
    }

    /**
     * Gets the value of the autoXtnsn property.
     * 
     * @return
     *     possible object is
     *     {@link AutoExtension1 }
     *     
     */
    public AutoExtension1 getAutoXtnsn() {
        return autoXtnsn;
    }

    /**
     * Sets the value of the autoXtnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoExtension1 }
     *     
     */
    public void setAutoXtnsn(AutoExtension1 value) {
        this.autoXtnsn = value;
    }

    /**
     * Gets the value of the cond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCond() {
        return cond;
    }

    /**
     * Sets the value of the cond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCond(String value) {
        this.cond = value;
    }

    /**
     * Gets the value of the opnEnddInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpnEnddInd() {
        return opnEnddInd;
    }

    /**
     * Sets the value of the opnEnddInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpnEnddInd(Boolean value) {
        this.opnEnddInd = value;
    }

}
