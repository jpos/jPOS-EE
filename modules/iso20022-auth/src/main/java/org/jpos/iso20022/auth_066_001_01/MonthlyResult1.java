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

package org.jpos.iso20022.auth_066_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonthlyResult1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MonthlyResult1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NbOfObsrvtns" type="{urn:iso:std:iso:20022:tech:xsd:auth.066.001.01}PositiveNumber"/>
 *         <element name="NbOfXcptns" type="{urn:iso:std:iso:20022:tech:xsd:auth.066.001.01}NonNegativeNumber"/>
 *         <element name="Cvrg" type="{urn:iso:std:iso:20022:tech:xsd:auth.066.001.01}BaseOneRate"/>
 *         <element name="LrgstXcptn" type="{urn:iso:std:iso:20022:tech:xsd:auth.066.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="AvrgXcptn" type="{urn:iso:std:iso:20022:tech:xsd:auth.066.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="LrgstXcptnId" type="{urn:iso:std:iso:20022:tech:xsd:auth.066.001.01}GenericIdentification165" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthlyResult1", propOrder = {
    "nbOfObsrvtns",
    "nbOfXcptns",
    "cvrg",
    "lrgstXcptn",
    "avrgXcptn",
    "lrgstXcptnId"
})
public class MonthlyResult1 {

    @XmlElement(name = "NbOfObsrvtns", required = true)
    protected BigDecimal nbOfObsrvtns;
    @XmlElement(name = "NbOfXcptns", required = true)
    protected BigDecimal nbOfXcptns;
    @XmlElement(name = "Cvrg", required = true)
    protected BigDecimal cvrg;
    @XmlElement(name = "LrgstXcptn", required = true)
    protected ActiveCurrencyAndAmount lrgstXcptn;
    @XmlElement(name = "AvrgXcptn", required = true)
    protected ActiveCurrencyAndAmount avrgXcptn;
    @XmlElement(name = "LrgstXcptnId")
    protected GenericIdentification165 lrgstXcptnId;

    /**
     * Gets the value of the nbOfObsrvtns property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfObsrvtns() {
        return nbOfObsrvtns;
    }

    /**
     * Sets the value of the nbOfObsrvtns property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfObsrvtns(BigDecimal value) {
        this.nbOfObsrvtns = value;
    }

    /**
     * Gets the value of the nbOfXcptns property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfXcptns() {
        return nbOfXcptns;
    }

    /**
     * Sets the value of the nbOfXcptns property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfXcptns(BigDecimal value) {
        this.nbOfXcptns = value;
    }

    /**
     * Gets the value of the cvrg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCvrg() {
        return cvrg;
    }

    /**
     * Sets the value of the cvrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCvrg(BigDecimal value) {
        this.cvrg = value;
    }

    /**
     * Gets the value of the lrgstXcptn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getLrgstXcptn() {
        return lrgstXcptn;
    }

    /**
     * Sets the value of the lrgstXcptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setLrgstXcptn(ActiveCurrencyAndAmount value) {
        this.lrgstXcptn = value;
    }

    /**
     * Gets the value of the avrgXcptn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAvrgXcptn() {
        return avrgXcptn;
    }

    /**
     * Sets the value of the avrgXcptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAvrgXcptn(ActiveCurrencyAndAmount value) {
        this.avrgXcptn = value;
    }

    /**
     * Gets the value of the lrgstXcptnId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification165 }
     *     
     */
    public GenericIdentification165 getLrgstXcptnId() {
        return lrgstXcptnId;
    }

    /**
     * Sets the value of the lrgstXcptnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification165 }
     *     
     */
    public void setLrgstXcptnId(GenericIdentification165 value) {
        this.lrgstXcptnId = value;
    }

}
