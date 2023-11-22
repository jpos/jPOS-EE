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

package org.jpos.iso20022.catp_007_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMTransaction8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMTransaction8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="RctFlg" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="BalPrtFlg" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="MixTp" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Mix" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ATMMediaMix2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction8", propOrder = {
    "amt",
    "ccy",
    "rctFlg",
    "balPrtFlg",
    "mixTp",
    "mix"
})
public class ATMTransaction8 {

    @XmlElement(name = "Amt")
    protected BigDecimal amt;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "RctFlg")
    protected Boolean rctFlg;
    @XmlElement(name = "BalPrtFlg")
    protected Boolean balPrtFlg;
    @XmlElement(name = "MixTp")
    protected String mixTp;
    @XmlElement(name = "Mix")
    protected List<ATMMediaMix2> mix;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the rctFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRctFlg() {
        return rctFlg;
    }

    /**
     * Sets the value of the rctFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRctFlg(Boolean value) {
        this.rctFlg = value;
    }

    /**
     * Gets the value of the balPrtFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalPrtFlg() {
        return balPrtFlg;
    }

    /**
     * Sets the value of the balPrtFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalPrtFlg(Boolean value) {
        this.balPrtFlg = value;
    }

    /**
     * Gets the value of the mixTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMixTp() {
        return mixTp;
    }

    /**
     * Sets the value of the mixTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMixTp(String value) {
        this.mixTp = value;
    }

    /**
     * Gets the value of the mix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMMediaMix2 }
     * 
     * 
     * @return
     *     The value of the mix property.
     */
    public List<ATMMediaMix2> getMix() {
        if (mix == null) {
            mix = new ArrayList<>();
        }
        return this.mix;
    }

}
