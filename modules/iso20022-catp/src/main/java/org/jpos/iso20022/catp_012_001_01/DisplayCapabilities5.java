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

package org.jpos.iso20022.catp_012_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisplayCapabilities5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DisplayCapabilities5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Dstn" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}UserInterface5Code" maxOccurs="unbounded"/>
 *         <element name="AvlblFrmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}OutputFormat1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NbOfLines" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}Number" minOccurs="0"/>
 *         <element name="LineWidth" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}Number" minOccurs="0"/>
 *         <element name="AvlblLang" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}LanguageCode" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayCapabilities5", propOrder = {
    "dstn",
    "avlblFrmt",
    "nbOfLines",
    "lineWidth",
    "avlblLang"
})
public class DisplayCapabilities5 {

    @XmlElement(name = "Dstn", required = true)
    @XmlSchemaType(name = "string")
    protected List<UserInterface5Code> dstn;
    @XmlElement(name = "AvlblFrmt")
    @XmlSchemaType(name = "string")
    protected List<OutputFormat1Code> avlblFrmt;
    @XmlElement(name = "NbOfLines")
    protected BigDecimal nbOfLines;
    @XmlElement(name = "LineWidth")
    protected BigDecimal lineWidth;
    @XmlElement(name = "AvlblLang")
    protected List<String> avlblLang;

    /**
     * Gets the value of the dstn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dstn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDstn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserInterface5Code }
     * 
     * 
     * @return
     *     The value of the dstn property.
     */
    public List<UserInterface5Code> getDstn() {
        if (dstn == null) {
            dstn = new ArrayList<>();
        }
        return this.dstn;
    }

    /**
     * Gets the value of the avlblFrmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the avlblFrmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvlblFrmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputFormat1Code }
     * 
     * 
     * @return
     *     The value of the avlblFrmt property.
     */
    public List<OutputFormat1Code> getAvlblFrmt() {
        if (avlblFrmt == null) {
            avlblFrmt = new ArrayList<>();
        }
        return this.avlblFrmt;
    }

    /**
     * Gets the value of the nbOfLines property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfLines() {
        return nbOfLines;
    }

    /**
     * Sets the value of the nbOfLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfLines(BigDecimal value) {
        this.nbOfLines = value;
    }

    /**
     * Gets the value of the lineWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLineWidth() {
        return lineWidth;
    }

    /**
     * Sets the value of the lineWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLineWidth(BigDecimal value) {
        this.lineWidth = value;
    }

    /**
     * Gets the value of the avlblLang property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the avlblLang property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvlblLang().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the avlblLang property.
     */
    public List<String> getAvlblLang() {
        if (avlblLang == null) {
            avlblLang = new ArrayList<>();
        }
        return this.avlblLang;
    }

}
