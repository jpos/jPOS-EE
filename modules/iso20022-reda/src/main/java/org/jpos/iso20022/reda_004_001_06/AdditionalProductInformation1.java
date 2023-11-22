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

package org.jpos.iso20022.reda_004_001_06;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalProductInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdditionalProductInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ESGCtgyGrmnFndMkt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ESGCategoryGermanFundMarket1Code" minOccurs="0"/>
 *         <element name="ESGCtgyGrmnStrdSctiesMkt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ESGCategoryGermanStructuredSecuritiesMarket1Code" minOccurs="0"/>
 *         <element name="ESGFcs" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ESGFocus1Code" minOccurs="0"/>
 *         <element name="ESGLablOrStd" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ESGLabelOrStandard1Code" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalProductInformation1", propOrder = {
    "esgCtgyGrmnFndMkt",
    "esgCtgyGrmnStrdSctiesMkt",
    "esgFcs",
    "esgLablOrStd"
})
public class AdditionalProductInformation1 {

    @XmlElement(name = "ESGCtgyGrmnFndMkt")
    @XmlSchemaType(name = "string")
    protected ESGCategoryGermanFundMarket1Code esgCtgyGrmnFndMkt;
    @XmlElement(name = "ESGCtgyGrmnStrdSctiesMkt")
    @XmlSchemaType(name = "string")
    protected ESGCategoryGermanStructuredSecuritiesMarket1Code esgCtgyGrmnStrdSctiesMkt;
    @XmlElement(name = "ESGFcs")
    @XmlSchemaType(name = "string")
    protected ESGFocus1Code esgFcs;
    @XmlElement(name = "ESGLablOrStd")
    @XmlSchemaType(name = "string")
    protected List<ESGLabelOrStandard1Code> esgLablOrStd;

    /**
     * Gets the value of the esgCtgyGrmnFndMkt property.
     * 
     * @return
     *     possible object is
     *     {@link ESGCategoryGermanFundMarket1Code }
     *     
     */
    public ESGCategoryGermanFundMarket1Code getESGCtgyGrmnFndMkt() {
        return esgCtgyGrmnFndMkt;
    }

    /**
     * Sets the value of the esgCtgyGrmnFndMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESGCategoryGermanFundMarket1Code }
     *     
     */
    public void setESGCtgyGrmnFndMkt(ESGCategoryGermanFundMarket1Code value) {
        this.esgCtgyGrmnFndMkt = value;
    }

    /**
     * Gets the value of the esgCtgyGrmnStrdSctiesMkt property.
     * 
     * @return
     *     possible object is
     *     {@link ESGCategoryGermanStructuredSecuritiesMarket1Code }
     *     
     */
    public ESGCategoryGermanStructuredSecuritiesMarket1Code getESGCtgyGrmnStrdSctiesMkt() {
        return esgCtgyGrmnStrdSctiesMkt;
    }

    /**
     * Sets the value of the esgCtgyGrmnStrdSctiesMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESGCategoryGermanStructuredSecuritiesMarket1Code }
     *     
     */
    public void setESGCtgyGrmnStrdSctiesMkt(ESGCategoryGermanStructuredSecuritiesMarket1Code value) {
        this.esgCtgyGrmnStrdSctiesMkt = value;
    }

    /**
     * Gets the value of the esgFcs property.
     * 
     * @return
     *     possible object is
     *     {@link ESGFocus1Code }
     *     
     */
    public ESGFocus1Code getESGFcs() {
        return esgFcs;
    }

    /**
     * Sets the value of the esgFcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESGFocus1Code }
     *     
     */
    public void setESGFcs(ESGFocus1Code value) {
        this.esgFcs = value;
    }

    /**
     * Gets the value of the esgLablOrStd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the esgLablOrStd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getESGLablOrStd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ESGLabelOrStandard1Code }
     * 
     * 
     * @return
     *     The value of the esgLablOrStd property.
     */
    public List<ESGLabelOrStandard1Code> getESGLablOrStd() {
        if (esgLablOrStd == null) {
            esgLablOrStd = new ArrayList<>();
        }
        return this.esgLablOrStd;
    }

}
