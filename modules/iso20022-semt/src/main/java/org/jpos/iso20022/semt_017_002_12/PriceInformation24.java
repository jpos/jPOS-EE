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

package org.jpos.iso20022.semt_017_002_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceInformation24 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PriceInformation24">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}TypeOfPrice49Choice"/>
 *         <element name="ValTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}YieldedOrValueType1Choice"/>
 *         <element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}PriceRateOrAmountOrUnknown3Choice"/>
 *         <element name="SrcOfPric" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}MarketIdentification91" minOccurs="0"/>
 *         <element name="QtnDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}DateAndDateTime2Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceInformation24", propOrder = {
    "tp",
    "valTp",
    "val",
    "srcOfPric",
    "qtnDt"
})
public class PriceInformation24 {

    @XmlElement(name = "Tp", required = true)
    protected TypeOfPrice49Choice tp;
    @XmlElement(name = "ValTp", required = true)
    protected YieldedOrValueType1Choice valTp;
    @XmlElement(name = "Val", required = true)
    protected PriceRateOrAmountOrUnknown3Choice val;
    @XmlElement(name = "SrcOfPric")
    protected MarketIdentification91 srcOfPric;
    @XmlElement(name = "QtnDt")
    protected DateAndDateTime2Choice qtnDt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice49Choice }
     *     
     */
    public TypeOfPrice49Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice49Choice }
     *     
     */
    public void setTp(TypeOfPrice49Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the valTp property.
     * 
     * @return
     *     possible object is
     *     {@link YieldedOrValueType1Choice }
     *     
     */
    public YieldedOrValueType1Choice getValTp() {
        return valTp;
    }

    /**
     * Sets the value of the valTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldedOrValueType1Choice }
     *     
     */
    public void setValTp(YieldedOrValueType1Choice value) {
        this.valTp = value;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmountOrUnknown3Choice }
     *     
     */
    public PriceRateOrAmountOrUnknown3Choice getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmountOrUnknown3Choice }
     *     
     */
    public void setVal(PriceRateOrAmountOrUnknown3Choice value) {
        this.val = value;
    }

    /**
     * Gets the value of the srcOfPric property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification91 }
     *     
     */
    public MarketIdentification91 getSrcOfPric() {
        return srcOfPric;
    }

    /**
     * Sets the value of the srcOfPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification91 }
     *     
     */
    public void setSrcOfPric(MarketIdentification91 value) {
        this.srcOfPric = value;
    }

    /**
     * Gets the value of the qtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getQtnDt() {
        return qtnDt;
    }

    /**
     * Sets the value of the qtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setQtnDt(DateAndDateTime2Choice value) {
        this.qtnDt = value;
    }

}
