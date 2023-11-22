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

package org.jpos.iso20022.colr_002_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralValuePosition3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralValuePosition3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DataAccsTm" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}ISODateTime"/>
 *         <element name="TtlCollValtn" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="SctiesAcct" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}SecuritiesAccount19" minOccurs="0"/>
 *         <element name="Scties" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}SecurityCharacteristics3" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValuePosition3", propOrder = {
    "dataAccsTm",
    "ttlCollValtn",
    "sctiesAcct",
    "scties"
})
public class CollateralValuePosition3 {

    @XmlElement(name = "DataAccsTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAccsTm;
    @XmlElement(name = "TtlCollValtn")
    protected ActiveCurrencyAndAmount ttlCollValtn;
    @XmlElement(name = "SctiesAcct")
    protected SecuritiesAccount19 sctiesAcct;
    @XmlElement(name = "Scties")
    protected List<SecurityCharacteristics3> scties;

    /**
     * Gets the value of the dataAccsTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAccsTm() {
        return dataAccsTm;
    }

    /**
     * Sets the value of the dataAccsTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAccsTm(XMLGregorianCalendar value) {
        this.dataAccsTm = value;
    }

    /**
     * Gets the value of the ttlCollValtn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlCollValtn() {
        return ttlCollValtn;
    }

    /**
     * Sets the value of the ttlCollValtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlCollValtn(ActiveCurrencyAndAmount value) {
        this.ttlCollValtn = value;
    }

    /**
     * Gets the value of the sctiesAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSctiesAcct() {
        return sctiesAcct;
    }

    /**
     * Sets the value of the sctiesAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setSctiesAcct(SecuritiesAccount19 value) {
        this.sctiesAcct = value;
    }

    /**
     * Gets the value of the scties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the scties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityCharacteristics3 }
     * 
     * 
     * @return
     *     The value of the scties property.
     */
    public List<SecurityCharacteristics3> getScties() {
        if (scties == null) {
            scties = new ArrayList<>();
        }
        return this.scties;
    }

}
