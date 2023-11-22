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

package org.jpos.iso20022.colr_016_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralAndExposureReportV05 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralAndExposureReportV05">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptParams" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ReportParameters6"/>
 *         <element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}Pagination1" minOccurs="0"/>
 *         <element name="Oblgtn" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}Obligation11"/>
 *         <element name="Agrmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}Agreement4" minOccurs="0"/>
 *         <element name="CollRpt" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}Collateral53" maxOccurs="unbounded"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralAndExposureReportV05", propOrder = {
    "rptParams",
    "pgntn",
    "oblgtn",
    "agrmt",
    "collRpt",
    "splmtryData"
})
public class CollateralAndExposureReportV05 {

    @XmlElement(name = "RptParams", required = true)
    protected ReportParameters6 rptParams;
    @XmlElement(name = "Pgntn")
    protected Pagination1 pgntn;
    @XmlElement(name = "Oblgtn", required = true)
    protected Obligation11 oblgtn;
    @XmlElement(name = "Agrmt")
    protected Agreement4 agrmt;
    @XmlElement(name = "CollRpt", required = true)
    protected List<Collateral53> collRpt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptParams property.
     * 
     * @return
     *     possible object is
     *     {@link ReportParameters6 }
     *     
     */
    public ReportParameters6 getRptParams() {
        return rptParams;
    }

    /**
     * Sets the value of the rptParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportParameters6 }
     *     
     */
    public void setRptParams(ReportParameters6 value) {
        this.rptParams = value;
    }

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public void setPgntn(Pagination1 value) {
        this.pgntn = value;
    }

    /**
     * Gets the value of the oblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link Obligation11 }
     *     
     */
    public Obligation11 getOblgtn() {
        return oblgtn;
    }

    /**
     * Sets the value of the oblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Obligation11 }
     *     
     */
    public void setOblgtn(Obligation11 value) {
        this.oblgtn = value;
    }

    /**
     * Gets the value of the agrmt property.
     * 
     * @return
     *     possible object is
     *     {@link Agreement4 }
     *     
     */
    public Agreement4 getAgrmt() {
        return agrmt;
    }

    /**
     * Sets the value of the agrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agreement4 }
     *     
     */
    public void setAgrmt(Agreement4 value) {
        this.agrmt = value;
    }

    /**
     * Gets the value of the collRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the collRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Collateral53 }
     * 
     * 
     * @return
     *     The value of the collRpt property.
     */
    public List<Collateral53> getCollRpt() {
        if (collRpt == null) {
            collRpt = new ArrayList<>();
        }
        return this.collRpt;
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
