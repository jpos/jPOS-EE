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

package org.jpos.iso20022.casp_006_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiagnosisResponse5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DiagnosisResponse5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LggdSaleId" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="POISts" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}StatusReportContent12" minOccurs="0"/>
 *         <element name="HstSts" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}HostStatus1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosisResponse5", propOrder = {
    "lggdSaleId",
    "poiSts",
    "hstSts"
})
public class DiagnosisResponse5 {

    @XmlElement(name = "LggdSaleId")
    protected List<String> lggdSaleId;
    @XmlElement(name = "POISts")
    protected StatusReportContent12 poiSts;
    @XmlElement(name = "HstSts")
    protected List<HostStatus1> hstSts;

    /**
     * Gets the value of the lggdSaleId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lggdSaleId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLggdSaleId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the lggdSaleId property.
     */
    public List<String> getLggdSaleId() {
        if (lggdSaleId == null) {
            lggdSaleId = new ArrayList<>();
        }
        return this.lggdSaleId;
    }

    /**
     * Gets the value of the poiSts property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReportContent12 }
     *     
     */
    public StatusReportContent12 getPOISts() {
        return poiSts;
    }

    /**
     * Sets the value of the poiSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReportContent12 }
     *     
     */
    public void setPOISts(StatusReportContent12 value) {
        this.poiSts = value;
    }

    /**
     * Gets the value of the hstSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hstSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHstSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostStatus1 }
     * 
     * 
     * @return
     *     The value of the hstSts property.
     */
    public List<HostStatus1> getHstSts() {
        if (hstSts == null) {
            hstSts = new ArrayList<>();
        }
        return this.hstSts;
    }

}
