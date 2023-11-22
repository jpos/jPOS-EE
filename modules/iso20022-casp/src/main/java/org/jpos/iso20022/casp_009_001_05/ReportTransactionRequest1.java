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

package org.jpos.iso20022.casp_009_001_05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportTransactionRequest1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportTransactionRequest1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SchCrit" type="{urn:iso:std:iso:20022:tech:xsd:casp.009.001.05}SearchCriteria1" maxOccurs="unbounded"/>
 *         <element name="SchOutptOrdr" type="{urn:iso:std:iso:20022:tech:xsd:casp.009.001.05}SearchOutputOrder1" minOccurs="0"/>
 *         <element name="DscndgOrdr" type="{urn:iso:std:iso:20022:tech:xsd:casp.009.001.05}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="BlckStart" type="{urn:iso:std:iso:20022:tech:xsd:casp.009.001.05}PositiveNumber" minOccurs="0"/>
 *         <element name="BlckStop" type="{urn:iso:std:iso:20022:tech:xsd:casp.009.001.05}PositiveNumber" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportTransactionRequest1", propOrder = {
    "schCrit",
    "schOutptOrdr",
    "dscndgOrdr",
    "blckStart",
    "blckStop"
})
public class ReportTransactionRequest1 {

    @XmlElement(name = "SchCrit", required = true)
    protected List<SearchCriteria1> schCrit;
    @XmlElement(name = "SchOutptOrdr")
    protected SearchOutputOrder1 schOutptOrdr;
    @XmlElement(name = "DscndgOrdr")
    protected Boolean dscndgOrdr;
    @XmlElement(name = "BlckStart")
    protected BigDecimal blckStart;
    @XmlElement(name = "BlckStop")
    protected BigDecimal blckStop;

    /**
     * Gets the value of the schCrit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the schCrit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchCrit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchCriteria1 }
     * 
     * 
     * @return
     *     The value of the schCrit property.
     */
    public List<SearchCriteria1> getSchCrit() {
        if (schCrit == null) {
            schCrit = new ArrayList<>();
        }
        return this.schCrit;
    }

    /**
     * Gets the value of the schOutptOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link SearchOutputOrder1 }
     *     
     */
    public SearchOutputOrder1 getSchOutptOrdr() {
        return schOutptOrdr;
    }

    /**
     * Sets the value of the schOutptOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOutputOrder1 }
     *     
     */
    public void setSchOutptOrdr(SearchOutputOrder1 value) {
        this.schOutptOrdr = value;
    }

    /**
     * Gets the value of the dscndgOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDscndgOrdr() {
        return dscndgOrdr;
    }

    /**
     * Sets the value of the dscndgOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDscndgOrdr(Boolean value) {
        this.dscndgOrdr = value;
    }

    /**
     * Gets the value of the blckStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBlckStart() {
        return blckStart;
    }

    /**
     * Sets the value of the blckStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBlckStart(BigDecimal value) {
        this.blckStart = value;
    }

    /**
     * Gets the value of the blckStop property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBlckStop() {
        return blckStop;
    }

    /**
     * Sets the value of the blckStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBlckStop(BigDecimal value) {
        this.blckStop = value;
    }

}
