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

package org.jpos.iso20022.camt_039_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseStatusReportV05 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CaseStatusReportV05">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.039.001.05}ReportHeader5"/>
 *         <element name="Case" type="{urn:iso:std:iso:20022:tech:xsd:camt.039.001.05}Case5"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:camt.039.001.05}CaseStatus2"/>
 *         <element name="NewAssgnmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.039.001.05}CaseAssignment5" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.039.001.05}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseStatusReportV05", propOrder = {
    "hdr",
    "_case",
    "sts",
    "newAssgnmt",
    "splmtryData"
})
public class CaseStatusReportV05 {

    @XmlElement(name = "Hdr", required = true)
    protected ReportHeader5 hdr;
    @XmlElement(name = "Case", required = true)
    protected Case5 _case;
    @XmlElement(name = "Sts", required = true)
    protected CaseStatus2 sts;
    @XmlElement(name = "NewAssgnmt")
    protected CaseAssignment5 newAssgnmt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link ReportHeader5 }
     *     
     */
    public ReportHeader5 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportHeader5 }
     *     
     */
    public void setHdr(ReportHeader5 value) {
        this.hdr = value;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case5 }
     *     
     */
    public Case5 getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case5 }
     *     
     */
    public void setCase(Case5 value) {
        this._case = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link CaseStatus2 }
     *     
     */
    public CaseStatus2 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseStatus2 }
     *     
     */
    public void setSts(CaseStatus2 value) {
        this.sts = value;
    }

    /**
     * Gets the value of the newAssgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment5 }
     *     
     */
    public CaseAssignment5 getNewAssgnmt() {
        return newAssgnmt;
    }

    /**
     * Sets the value of the newAssgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment5 }
     *     
     */
    public void setNewAssgnmt(CaseAssignment5 value) {
        this.newAssgnmt = value;
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
