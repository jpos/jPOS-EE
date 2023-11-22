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

package org.jpos.iso20022.reda_007_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassificationType2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClassificationType2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClssfctnFinInstrm" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}CFIOct2015Identifier" minOccurs="0"/>
 *         <element name="FinInstrmPdctTpCd" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}ExternalFinancialInstrumentProductType1Code" minOccurs="0"/>
 *         <element name="AltrnClssfctn" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}GenericIdentification36" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationType2", propOrder = {
    "clssfctnFinInstrm",
    "finInstrmPdctTpCd",
    "altrnClssfctn"
})
public class ClassificationType2 {

    @XmlElement(name = "ClssfctnFinInstrm")
    protected String clssfctnFinInstrm;
    @XmlElement(name = "FinInstrmPdctTpCd")
    protected String finInstrmPdctTpCd;
    @XmlElement(name = "AltrnClssfctn")
    protected List<GenericIdentification36> altrnClssfctn;

    /**
     * Gets the value of the clssfctnFinInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssfctnFinInstrm() {
        return clssfctnFinInstrm;
    }

    /**
     * Sets the value of the clssfctnFinInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClssfctnFinInstrm(String value) {
        this.clssfctnFinInstrm = value;
    }

    /**
     * Gets the value of the finInstrmPdctTpCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinInstrmPdctTpCd() {
        return finInstrmPdctTpCd;
    }

    /**
     * Sets the value of the finInstrmPdctTpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinInstrmPdctTpCd(String value) {
        this.finInstrmPdctTpCd = value;
    }

    /**
     * Gets the value of the altrnClssfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the altrnClssfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltrnClssfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification36 }
     * 
     * 
     * @return
     *     The value of the altrnClssfctn property.
     */
    public List<GenericIdentification36> getAltrnClssfctn() {
        if (altrnClssfctn == null) {
            altrnClssfctn = new ArrayList<>();
        }
        return this.altrnClssfctn;
    }

}
