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

package org.jpos.iso20022.fxtr_016_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FXCommissionOrFee1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FXCommissionOrFee1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05}FXAmountType1Choice"/>
 *         <element name="AmtOrRate" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05}AmountOrRate4Choice"/>
 *         <element name="Sgn" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05}PlusOrMinusIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FXCommissionOrFee1", propOrder = {
    "tp",
    "amtOrRate",
    "sgn"
})
public class FXCommissionOrFee1 {

    @XmlElement(name = "Tp", required = true)
    protected FXAmountType1Choice tp;
    @XmlElement(name = "AmtOrRate", required = true)
    protected AmountOrRate4Choice amtOrRate;
    @XmlElement(name = "Sgn")
    protected Boolean sgn;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link FXAmountType1Choice }
     *     
     */
    public FXAmountType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FXAmountType1Choice }
     *     
     */
    public void setTp(FXAmountType1Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the amtOrRate property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrRate4Choice }
     *     
     */
    public AmountOrRate4Choice getAmtOrRate() {
        return amtOrRate;
    }

    /**
     * Sets the value of the amtOrRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrRate4Choice }
     *     
     */
    public void setAmtOrRate(AmountOrRate4Choice value) {
        this.amtOrRate = value;
    }

    /**
     * Gets the value of the sgn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSgn() {
        return sgn;
    }

    /**
     * Sets the value of the sgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSgn(Boolean value) {
        this.sgn = value;
    }

}
