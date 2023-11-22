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

package org.jpos.iso20022.semt_005_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceInformation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PriceInformation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Val" type="{urn:swift:xsd:semt.005.001.02}PriceRateOrAmountOrUnknownChoice"/>
 *         <element name="ValTp" type="{urn:swift:xsd:semt.005.001.02}PriceValueType2Code" minOccurs="0"/>
 *         <choice>
 *           <element name="Tp" type="{urn:swift:xsd:semt.005.001.02}TypeOfPrice11Code"/>
 *           <element name="XtndedTp" type="{urn:swift:xsd:semt.005.001.02}Extended350Code"/>
 *         </choice>
 *         <element name="SrcOfPric" type="{urn:swift:xsd:semt.005.001.02}PriceSourceFormatChoice" minOccurs="0"/>
 *         <element name="QtnDt" type="{urn:swift:xsd:semt.005.001.02}DateAndDateTimeChoice" minOccurs="0"/>
 *         <element name="Yldd" type="{urn:swift:xsd:semt.005.001.02}YesNoIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceInformation2", propOrder = {
    "val",
    "valTp",
    "tp",
    "xtndedTp",
    "srcOfPric",
    "qtnDt",
    "yldd"
})
public class PriceInformation2 {

    @XmlElement(name = "Val", required = true)
    protected PriceRateOrAmountOrUnknownChoice val;
    @XmlElement(name = "ValTp")
    @XmlSchemaType(name = "string")
    protected PriceValueType2Code valTp;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected TypeOfPrice11Code tp;
    @XmlElement(name = "XtndedTp")
    protected String xtndedTp;
    @XmlElement(name = "SrcOfPric")
    protected PriceSourceFormatChoice srcOfPric;
    @XmlElement(name = "QtnDt")
    protected DateAndDateTimeChoice qtnDt;
    @XmlElement(name = "Yldd")
    protected Boolean yldd;

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmountOrUnknownChoice }
     *     
     */
    public PriceRateOrAmountOrUnknownChoice getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmountOrUnknownChoice }
     *     
     */
    public void setVal(PriceRateOrAmountOrUnknownChoice value) {
        this.val = value;
    }

    /**
     * Gets the value of the valTp property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueType2Code }
     *     
     */
    public PriceValueType2Code getValTp() {
        return valTp;
    }

    /**
     * Sets the value of the valTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueType2Code }
     *     
     */
    public void setValTp(PriceValueType2Code value) {
        this.valTp = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice11Code }
     *     
     */
    public TypeOfPrice11Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice11Code }
     *     
     */
    public void setTp(TypeOfPrice11Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the xtndedTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedTp() {
        return xtndedTp;
    }

    /**
     * Sets the value of the xtndedTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXtndedTp(String value) {
        this.xtndedTp = value;
    }

    /**
     * Gets the value of the srcOfPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSourceFormatChoice }
     *     
     */
    public PriceSourceFormatChoice getSrcOfPric() {
        return srcOfPric;
    }

    /**
     * Sets the value of the srcOfPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSourceFormatChoice }
     *     
     */
    public void setSrcOfPric(PriceSourceFormatChoice value) {
        this.srcOfPric = value;
    }

    /**
     * Gets the value of the qtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getQtnDt() {
        return qtnDt;
    }

    /**
     * Sets the value of the qtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setQtnDt(DateAndDateTimeChoice value) {
        this.qtnDt = value;
    }

    /**
     * Gets the value of the yldd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isYldd() {
        return yldd;
    }

    /**
     * Sets the value of the yldd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setYldd(Boolean value) {
        this.yldd = value;
    }

}
