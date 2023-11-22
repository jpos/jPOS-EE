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

package org.jpos.iso20022.tsrv_003_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoExtension1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AutoExtension1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Prd" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}AutoExtend1Choice" minOccurs="0"/>
 *         <element name="FnlXpryDt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}ISODate" minOccurs="0"/>
 *         <element name="NonXtnsnNtfctn" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}NonExtension1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoExtension1", propOrder = {
    "prd",
    "fnlXpryDt",
    "nonXtnsnNtfctn"
})
public class AutoExtension1 {

    @XmlElement(name = "Prd")
    protected AutoExtend1Choice prd;
    @XmlElement(name = "FnlXpryDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fnlXpryDt;
    @XmlElement(name = "NonXtnsnNtfctn")
    protected List<NonExtension1> nonXtnsnNtfctn;

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link AutoExtend1Choice }
     *     
     */
    public AutoExtend1Choice getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoExtend1Choice }
     *     
     */
    public void setPrd(AutoExtend1Choice value) {
        this.prd = value;
    }

    /**
     * Gets the value of the fnlXpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFnlXpryDt() {
        return fnlXpryDt;
    }

    /**
     * Sets the value of the fnlXpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFnlXpryDt(XMLGregorianCalendar value) {
        this.fnlXpryDt = value;
    }

    /**
     * Gets the value of the nonXtnsnNtfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nonXtnsnNtfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonXtnsnNtfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonExtension1 }
     * 
     * 
     * @return
     *     The value of the nonXtnsnNtfctn property.
     */
    public List<NonExtension1> getNonXtnsnNtfctn() {
        if (nonXtnsnNtfctn == null) {
            nonXtnsnNtfctn = new ArrayList<>();
        }
        return this.nonXtnsnNtfctn;
    }

}
