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

package org.jpos.iso20022.acmt_003_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegulatoryInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RegulatoryInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Sctr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max35Text" minOccurs="0"/>
 *         <element name="Brnch" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max35Text" minOccurs="0"/>
 *         <element name="Grp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max35Text" minOccurs="0"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryInformation1", propOrder = {
    "sctr",
    "brnch",
    "grp",
    "othr"
})
public class RegulatoryInformation1 {

    @XmlElement(name = "Sctr")
    protected String sctr;
    @XmlElement(name = "Brnch")
    protected String brnch;
    @XmlElement(name = "Grp")
    protected String grp;
    @XmlElement(name = "Othr")
    protected String othr;

    /**
     * Gets the value of the sctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctr() {
        return sctr;
    }

    /**
     * Sets the value of the sctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctr(String value) {
        this.sctr = value;
    }

    /**
     * Gets the value of the brnch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrnch() {
        return brnch;
    }

    /**
     * Sets the value of the brnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrnch(String value) {
        this.brnch = value;
    }

    /**
     * Gets the value of the grp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrp() {
        return grp;
    }

    /**
     * Sets the value of the grp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrp(String value) {
        this.grp = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthr(String value) {
        this.othr = value;
    }

}
