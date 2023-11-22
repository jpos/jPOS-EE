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

package org.jpos.iso20022.auth_059_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCPIncomeStatementAndCapitalAdequacyReportV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CCPIncomeStatementAndCapitalAdequacyReportV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IncmStmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}IncomeStatement1"/>
 *         <element name="CptlRqrmnts" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}CapitalRequirement1"/>
 *         <element name="TtlCptl" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="LqdFinRsrcs" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="HpthtclCptlMeasr" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}HypotheticalCapitalMeasure1" maxOccurs="unbounded"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCPIncomeStatementAndCapitalAdequacyReportV01", propOrder = {
    "incmStmt",
    "cptlRqrmnts",
    "ttlCptl",
    "lqdFinRsrcs",
    "hpthtclCptlMeasr",
    "splmtryData"
})
public class CCPIncomeStatementAndCapitalAdequacyReportV01 {

    @XmlElement(name = "IncmStmt", required = true)
    protected IncomeStatement1 incmStmt;
    @XmlElement(name = "CptlRqrmnts", required = true)
    protected CapitalRequirement1 cptlRqrmnts;
    @XmlElement(name = "TtlCptl", required = true)
    protected ActiveCurrencyAndAmount ttlCptl;
    @XmlElement(name = "LqdFinRsrcs", required = true)
    protected ActiveCurrencyAndAmount lqdFinRsrcs;
    @XmlElement(name = "HpthtclCptlMeasr", required = true)
    protected List<HypotheticalCapitalMeasure1> hpthtclCptlMeasr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the incmStmt property.
     * 
     * @return
     *     possible object is
     *     {@link IncomeStatement1 }
     *     
     */
    public IncomeStatement1 getIncmStmt() {
        return incmStmt;
    }

    /**
     * Sets the value of the incmStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomeStatement1 }
     *     
     */
    public void setIncmStmt(IncomeStatement1 value) {
        this.incmStmt = value;
    }

    /**
     * Gets the value of the cptlRqrmnts property.
     * 
     * @return
     *     possible object is
     *     {@link CapitalRequirement1 }
     *     
     */
    public CapitalRequirement1 getCptlRqrmnts() {
        return cptlRqrmnts;
    }

    /**
     * Sets the value of the cptlRqrmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapitalRequirement1 }
     *     
     */
    public void setCptlRqrmnts(CapitalRequirement1 value) {
        this.cptlRqrmnts = value;
    }

    /**
     * Gets the value of the ttlCptl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlCptl() {
        return ttlCptl;
    }

    /**
     * Sets the value of the ttlCptl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlCptl(ActiveCurrencyAndAmount value) {
        this.ttlCptl = value;
    }

    /**
     * Gets the value of the lqdFinRsrcs property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getLqdFinRsrcs() {
        return lqdFinRsrcs;
    }

    /**
     * Sets the value of the lqdFinRsrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setLqdFinRsrcs(ActiveCurrencyAndAmount value) {
        this.lqdFinRsrcs = value;
    }

    /**
     * Gets the value of the hpthtclCptlMeasr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hpthtclCptlMeasr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHpthtclCptlMeasr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HypotheticalCapitalMeasure1 }
     * 
     * 
     * @return
     *     The value of the hpthtclCptlMeasr property.
     */
    public List<HypotheticalCapitalMeasure1> getHpthtclCptlMeasr() {
        if (hpthtclCptlMeasr == null) {
            hpthtclCptlMeasr = new ArrayList<>();
        }
        return this.hpthtclCptlMeasr;
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
