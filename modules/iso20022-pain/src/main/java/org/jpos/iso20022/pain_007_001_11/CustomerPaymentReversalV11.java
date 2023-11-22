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

package org.jpos.iso20022.pain_007_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerPaymentReversalV11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CustomerPaymentReversalV11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}GroupHeader88"/>
 *         <element name="OrgnlGrpInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}OriginalGroupHeader16"/>
 *         <element name="OrgnlPmtInfAndRvsl" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}OriginalPaymentInstruction41" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerPaymentReversalV11", propOrder = {
    "grpHdr",
    "orgnlGrpInf",
    "orgnlPmtInfAndRvsl",
    "splmtryData"
})
public class CustomerPaymentReversalV11 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader88 grpHdr;
    @XmlElement(name = "OrgnlGrpInf", required = true)
    protected OriginalGroupHeader16 orgnlGrpInf;
    @XmlElement(name = "OrgnlPmtInfAndRvsl")
    protected List<OriginalPaymentInstruction41> orgnlPmtInfAndRvsl;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader88 }
     *     
     */
    public GroupHeader88 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader88 }
     *     
     */
    public void setGrpHdr(GroupHeader88 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the orgnlGrpInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupHeader16 }
     *     
     */
    public OriginalGroupHeader16 getOrgnlGrpInf() {
        return orgnlGrpInf;
    }

    /**
     * Sets the value of the orgnlGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupHeader16 }
     *     
     */
    public void setOrgnlGrpInf(OriginalGroupHeader16 value) {
        this.orgnlGrpInf = value;
    }

    /**
     * Gets the value of the orgnlPmtInfAndRvsl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the orgnlPmtInfAndRvsl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlPmtInfAndRvsl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginalPaymentInstruction41 }
     * 
     * 
     * @return
     *     The value of the orgnlPmtInfAndRvsl property.
     */
    public List<OriginalPaymentInstruction41> getOrgnlPmtInfAndRvsl() {
        if (orgnlPmtInfAndRvsl == null) {
            orgnlPmtInfAndRvsl = new ArrayList<>();
        }
        return this.orgnlPmtInfAndRvsl;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
