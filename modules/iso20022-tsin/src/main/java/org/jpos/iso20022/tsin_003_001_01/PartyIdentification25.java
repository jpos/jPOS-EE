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

package org.jpos.iso20022.tsin_003_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentification25 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification25">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:tsin.003.001.01}Max70Text"/>
 *         <element name="PrtryId" type="{urn:iso:std:iso:20022:tech:xsd:tsin.003.001.01}GenericIdentification4" minOccurs="0"/>
 *         <element name="BEI" type="{urn:iso:std:iso:20022:tech:xsd:tsin.003.001.01}BEIIdentifier" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification25", propOrder = {
    "nm",
    "prtryId",
    "bei"
})
public class PartyIdentification25 {

    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "PrtryId")
    protected GenericIdentification4 prtryId;
    @XmlElement(name = "BEI")
    protected String bei;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the prtryId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification4 }
     *     
     */
    public GenericIdentification4 getPrtryId() {
        return prtryId;
    }

    /**
     * Sets the value of the prtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification4 }
     *     
     */
    public void setPrtryId(GenericIdentification4 value) {
        this.prtryId = value;
    }

    /**
     * Gets the value of the bei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEI() {
        return bei;
    }

    /**
     * Sets the value of the bei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEI(String value) {
        this.bei = value;
    }

}
