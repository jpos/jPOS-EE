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

package org.jpos.iso20022.setr_029_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlternatePartyIdentification10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AlternatePartyIdentification10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TpOfId" type="{urn:iso:std:iso:20022:tech:xsd:setr.029.001.02}IdentificationType42Choice"/>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:setr.029.001.02}CountryCode"/>
 *         <element name="AltrnId" type="{urn:iso:std:iso:20022:tech:xsd:setr.029.001.02}Max35Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternatePartyIdentification10", propOrder = {
    "tpOfId",
    "ctry",
    "altrnId"
})
public class AlternatePartyIdentification10 {

    @XmlElement(name = "TpOfId", required = true)
    protected IdentificationType42Choice tpOfId;
    @XmlElement(name = "Ctry", required = true)
    protected String ctry;
    @XmlElement(name = "AltrnId", required = true)
    protected String altrnId;

    /**
     * Gets the value of the tpOfId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType42Choice }
     *     
     */
    public IdentificationType42Choice getTpOfId() {
        return tpOfId;
    }

    /**
     * Sets the value of the tpOfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType42Choice }
     *     
     */
    public void setTpOfId(IdentificationType42Choice value) {
        this.tpOfId = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltrnId(String value) {
        this.altrnId = value;
    }

}
