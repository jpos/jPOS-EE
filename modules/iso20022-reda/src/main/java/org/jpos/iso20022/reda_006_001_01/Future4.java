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

package org.jpos.iso20022.reda_006_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Future4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Future4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrctSz" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}BaseOneRate" minOccurs="0"/>
 *         <element name="ExrcPric" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Price8" minOccurs="0"/>
 *         <element name="FutrDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="MinSz" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="UnitOfMeasr" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}UnitOfMeasure7Choice" minOccurs="0"/>
 *         <element name="TmUnit" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}TimeUnit3Choice" minOccurs="0"/>
 *         <element name="AddtlUndrlygAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}UnderlyingAttributes4" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Future4", propOrder = {
    "ctrctSz",
    "exrcPric",
    "futrDt",
    "minSz",
    "unitOfMeasr",
    "tmUnit",
    "addtlUndrlygAttrbts"
})
public class Future4 {

    @XmlElement(name = "CtrctSz")
    protected BigDecimal ctrctSz;
    @XmlElement(name = "ExrcPric")
    protected Price8 exrcPric;
    @XmlElement(name = "FutrDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar futrDt;
    @XmlElement(name = "MinSz")
    protected ActiveCurrencyAndAmount minSz;
    @XmlElement(name = "UnitOfMeasr")
    protected UnitOfMeasure7Choice unitOfMeasr;
    @XmlElement(name = "TmUnit")
    protected TimeUnit3Choice tmUnit;
    @XmlElement(name = "AddtlUndrlygAttrbts")
    protected List<UnderlyingAttributes4> addtlUndrlygAttrbts;

    /**
     * Gets the value of the ctrctSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrctSz() {
        return ctrctSz;
    }

    /**
     * Sets the value of the ctrctSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCtrctSz(BigDecimal value) {
        this.ctrctSz = value;
    }

    /**
     * Gets the value of the exrcPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price8 }
     *     
     */
    public Price8 getExrcPric() {
        return exrcPric;
    }

    /**
     * Sets the value of the exrcPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price8 }
     *     
     */
    public void setExrcPric(Price8 value) {
        this.exrcPric = value;
    }

    /**
     * Gets the value of the futrDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFutrDt() {
        return futrDt;
    }

    /**
     * Sets the value of the futrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFutrDt(XMLGregorianCalendar value) {
        this.futrDt = value;
    }

    /**
     * Gets the value of the minSz property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinSz() {
        return minSz;
    }

    /**
     * Sets the value of the minSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setMinSz(ActiveCurrencyAndAmount value) {
        this.minSz = value;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure7Choice }
     *     
     */
    public UnitOfMeasure7Choice getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure7Choice }
     *     
     */
    public void setUnitOfMeasr(UnitOfMeasure7Choice value) {
        this.unitOfMeasr = value;
    }

    /**
     * Gets the value of the tmUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnit3Choice }
     *     
     */
    public TimeUnit3Choice getTmUnit() {
        return tmUnit;
    }

    /**
     * Sets the value of the tmUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnit3Choice }
     *     
     */
    public void setTmUnit(TimeUnit3Choice value) {
        this.tmUnit = value;
    }

    /**
     * Gets the value of the addtlUndrlygAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlUndrlygAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlUndrlygAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingAttributes4 }
     * 
     * 
     * @return
     *     The value of the addtlUndrlygAttrbts property.
     */
    public List<UnderlyingAttributes4> getAddtlUndrlygAttrbts() {
        if (addtlUndrlygAttrbts == null) {
            addtlUndrlygAttrbts = new ArrayList<>();
        }
        return this.addtlUndrlygAttrbts;
    }

}
