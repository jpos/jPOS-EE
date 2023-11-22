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

package org.jpos.iso20022.setr_016_001_04;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fee3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Fee3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}ChargeType5Choice" minOccurs="0"/>
 *         <element name="RprdStdAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="RprdStdRate" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="RprdDscntAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="RprdDscntRate" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="RprdReqdAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="RprdReqdRate" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="ComrclAgrmtRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}Max35Text" minOccurs="0"/>
 *         <element name="NewComrclAgrmtRefInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}YesNoIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fee3", propOrder = {
    "tp",
    "rprdStdAmt",
    "rprdStdRate",
    "rprdDscntAmt",
    "rprdDscntRate",
    "rprdReqdAmt",
    "rprdReqdRate",
    "comrclAgrmtRef",
    "newComrclAgrmtRefInd"
})
public class Fee3 {

    @XmlElement(name = "Tp")
    protected ChargeType5Choice tp;
    @XmlElement(name = "RprdStdAmt")
    protected ActiveCurrencyAndAmount rprdStdAmt;
    @XmlElement(name = "RprdStdRate")
    protected BigDecimal rprdStdRate;
    @XmlElement(name = "RprdDscntAmt")
    protected ActiveCurrencyAndAmount rprdDscntAmt;
    @XmlElement(name = "RprdDscntRate")
    protected BigDecimal rprdDscntRate;
    @XmlElement(name = "RprdReqdAmt")
    protected ActiveCurrencyAndAmount rprdReqdAmt;
    @XmlElement(name = "RprdReqdRate")
    protected BigDecimal rprdReqdRate;
    @XmlElement(name = "ComrclAgrmtRef")
    protected String comrclAgrmtRef;
    @XmlElement(name = "NewComrclAgrmtRefInd")
    protected Boolean newComrclAgrmtRefInd;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType5Choice }
     *     
     */
    public ChargeType5Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType5Choice }
     *     
     */
    public void setTp(ChargeType5Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the rprdStdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRprdStdAmt() {
        return rprdStdAmt;
    }

    /**
     * Sets the value of the rprdStdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setRprdStdAmt(ActiveCurrencyAndAmount value) {
        this.rprdStdAmt = value;
    }

    /**
     * Gets the value of the rprdStdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRprdStdRate() {
        return rprdStdRate;
    }

    /**
     * Sets the value of the rprdStdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRprdStdRate(BigDecimal value) {
        this.rprdStdRate = value;
    }

    /**
     * Gets the value of the rprdDscntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRprdDscntAmt() {
        return rprdDscntAmt;
    }

    /**
     * Sets the value of the rprdDscntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setRprdDscntAmt(ActiveCurrencyAndAmount value) {
        this.rprdDscntAmt = value;
    }

    /**
     * Gets the value of the rprdDscntRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRprdDscntRate() {
        return rprdDscntRate;
    }

    /**
     * Sets the value of the rprdDscntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRprdDscntRate(BigDecimal value) {
        this.rprdDscntRate = value;
    }

    /**
     * Gets the value of the rprdReqdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRprdReqdAmt() {
        return rprdReqdAmt;
    }

    /**
     * Sets the value of the rprdReqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setRprdReqdAmt(ActiveCurrencyAndAmount value) {
        this.rprdReqdAmt = value;
    }

    /**
     * Gets the value of the rprdReqdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRprdReqdRate() {
        return rprdReqdRate;
    }

    /**
     * Sets the value of the rprdReqdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRprdReqdRate(BigDecimal value) {
        this.rprdReqdRate = value;
    }

    /**
     * Gets the value of the comrclAgrmtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComrclAgrmtRef() {
        return comrclAgrmtRef;
    }

    /**
     * Sets the value of the comrclAgrmtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComrclAgrmtRef(String value) {
        this.comrclAgrmtRef = value;
    }

    /**
     * Gets the value of the newComrclAgrmtRefInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewComrclAgrmtRefInd() {
        return newComrclAgrmtRefInd;
    }

    /**
     * Sets the value of the newComrclAgrmtRefInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewComrclAgrmtRefInd(Boolean value) {
        this.newComrclAgrmtRefInd = value;
    }

}
