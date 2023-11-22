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

package org.jpos.iso20022.auth_043_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesIndexReport1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesIndexReport1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TechRcrdId" type="{urn:iso:std:iso:20022:tech:xsd:auth.043.001.01}Max35Text" minOccurs="0"/>
 *         <element name="RqstngNtty" type="{urn:iso:std:iso:20022:tech:xsd:auth.043.001.01}CountryCode" minOccurs="0"/>
 *         <element name="Indx" type="{urn:iso:std:iso:20022:tech:xsd:auth.043.001.01}FinancialInstrument46Choice"/>
 *         <element name="VldtyPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.043.001.01}Period4Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesIndexReport1", propOrder = {
    "techRcrdId",
    "rqstngNtty",
    "indx",
    "vldtyPrd"
})
public class SecuritiesIndexReport1 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "RqstngNtty")
    protected String rqstngNtty;
    @XmlElement(name = "Indx", required = true)
    protected FinancialInstrument46Choice indx;
    @XmlElement(name = "VldtyPrd")
    protected Period4Choice vldtyPrd;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechRcrdId(String value) {
        this.techRcrdId = value;
    }

    /**
     * Gets the value of the rqstngNtty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqstngNtty() {
        return rqstngNtty;
    }

    /**
     * Sets the value of the rqstngNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqstngNtty(String value) {
        this.rqstngNtty = value;
    }

    /**
     * Gets the value of the indx property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument46Choice }
     *     
     */
    public FinancialInstrument46Choice getIndx() {
        return indx;
    }

    /**
     * Sets the value of the indx property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument46Choice }
     *     
     */
    public void setIndx(FinancialInstrument46Choice value) {
        this.indx = value;
    }

    /**
     * Gets the value of the vldtyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getVldtyPrd() {
        return vldtyPrd;
    }

    /**
     * Sets the value of the vldtyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public void setVldtyPrd(Period4Choice value) {
        this.vldtyPrd = value;
    }

}
