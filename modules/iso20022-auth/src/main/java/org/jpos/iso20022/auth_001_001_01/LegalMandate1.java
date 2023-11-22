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

package org.jpos.iso20022.auth_001_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalMandate1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LegalMandate1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Prgrph" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}Max35Text"/>
 *         <element name="Dsclmr" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalMandate1", propOrder = {
    "prgrph",
    "dsclmr"
})
public class LegalMandate1 {

    @XmlElement(name = "Prgrph", required = true)
    protected String prgrph;
    @XmlElement(name = "Dsclmr")
    protected String dsclmr;

    /**
     * Gets the value of the prgrph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrgrph() {
        return prgrph;
    }

    /**
     * Sets the value of the prgrph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrgrph(String value) {
        this.prgrph = value;
    }

    /**
     * Gets the value of the dsclmr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsclmr() {
        return dsclmr;
    }

    /**
     * Sets the value of the dsclmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsclmr(String value) {
        this.dsclmr = value;
    }

}
