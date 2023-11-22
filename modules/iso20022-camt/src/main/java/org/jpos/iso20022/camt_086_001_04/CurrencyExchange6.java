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

package org.jpos.iso20022.camt_086_001_04;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyExchange6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyExchange6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SrcCcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}ActiveOrHistoricCurrencyCode"/>
 *         <element name="TrgtCcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}ActiveOrHistoricCurrencyCode"/>
 *         <element name="XchgRate" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BaseOneRate"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Max40Text" minOccurs="0"/>
 *         <element name="UnitCcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="Cmnts" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Max70Text" minOccurs="0"/>
 *         <element name="QtnDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}ISODateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyExchange6", propOrder = {
    "srcCcy",
    "trgtCcy",
    "xchgRate",
    "desc",
    "unitCcy",
    "cmnts",
    "qtnDt"
})
public class CurrencyExchange6 {

    @XmlElement(name = "SrcCcy", required = true)
    protected String srcCcy;
    @XmlElement(name = "TrgtCcy", required = true)
    protected String trgtCcy;
    @XmlElement(name = "XchgRate", required = true)
    protected BigDecimal xchgRate;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "UnitCcy")
    protected String unitCcy;
    @XmlElement(name = "Cmnts")
    protected String cmnts;
    @XmlElement(name = "QtnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar qtnDt;

    /**
     * Gets the value of the srcCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcCcy() {
        return srcCcy;
    }

    /**
     * Sets the value of the srcCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcCcy(String value) {
        this.srcCcy = value;
    }

    /**
     * Gets the value of the trgtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgtCcy() {
        return trgtCcy;
    }

    /**
     * Sets the value of the trgtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrgtCcy(String value) {
        this.trgtCcy = value;
    }

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXchgRate(BigDecimal value) {
        this.xchgRate = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the unitCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCcy() {
        return unitCcy;
    }

    /**
     * Sets the value of the unitCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCcy(String value) {
        this.unitCcy = value;
    }

    /**
     * Gets the value of the cmnts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmnts() {
        return cmnts;
    }

    /**
     * Sets the value of the cmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmnts(String value) {
        this.cmnts = value;
    }

    /**
     * Gets the value of the qtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQtnDt() {
        return qtnDt;
    }

    /**
     * Sets the value of the qtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQtnDt(XMLGregorianCalendar value) {
        this.qtnDt = value;
    }

}
