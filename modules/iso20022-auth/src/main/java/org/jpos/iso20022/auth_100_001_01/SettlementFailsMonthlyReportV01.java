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

package org.jpos.iso20022.auth_100_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementFailsMonthlyReportV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementFailsMonthlyReportV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptHdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementFailsReportHeader2"/>
 *         <element name="MnthlyAggt" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementFailsData3"/>
 *         <element name="DalyData" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementFailsDailyData3" maxOccurs="unbounded"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsMonthlyReportV01", propOrder = {
    "rptHdr",
    "mnthlyAggt",
    "dalyData",
    "splmtryData"
})
public class SettlementFailsMonthlyReportV01 {

    @XmlElement(name = "RptHdr", required = true)
    protected SettlementFailsReportHeader2 rptHdr;
    @XmlElement(name = "MnthlyAggt", required = true)
    protected SettlementFailsData3 mnthlyAggt;
    @XmlElement(name = "DalyData", required = true)
    protected List<SettlementFailsDailyData3> dalyData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptHdr property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsReportHeader2 }
     *     
     */
    public SettlementFailsReportHeader2 getRptHdr() {
        return rptHdr;
    }

    /**
     * Sets the value of the rptHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsReportHeader2 }
     *     
     */
    public void setRptHdr(SettlementFailsReportHeader2 value) {
        this.rptHdr = value;
    }

    /**
     * Gets the value of the mnthlyAggt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsData3 }
     *     
     */
    public SettlementFailsData3 getMnthlyAggt() {
        return mnthlyAggt;
    }

    /**
     * Sets the value of the mnthlyAggt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsData3 }
     *     
     */
    public void setMnthlyAggt(SettlementFailsData3 value) {
        this.mnthlyAggt = value;
    }

    /**
     * Gets the value of the dalyData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dalyData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDalyData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementFailsDailyData3 }
     * 
     * 
     * @return
     *     The value of the dalyData property.
     */
    public List<SettlementFailsDailyData3> getDalyData() {
        if (dalyData == null) {
            dalyData = new ArrayList<>();
        }
        return this.dalyData;
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
