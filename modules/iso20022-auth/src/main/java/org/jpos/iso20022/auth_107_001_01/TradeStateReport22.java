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

package org.jpos.iso20022.auth_107_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeStateReport22 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeStateReport22">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrPtySpcfcData" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}CounterpartySpecificData36" maxOccurs="2"/>
 *         <element name="CmonTradData" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}CommonTradeDataReport70"/>
 *         <element name="TechAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}TechnicalAttributes5" minOccurs="0"/>
 *         <element name="PblcDssmntnData" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}DisseminationData1" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeStateReport22", propOrder = {
    "ctrPtySpcfcData",
    "cmonTradData",
    "techAttrbts",
    "pblcDssmntnData",
    "splmtryData"
})
public class TradeStateReport22 {

    @XmlElement(name = "CtrPtySpcfcData", required = true)
    protected List<CounterpartySpecificData36> ctrPtySpcfcData;
    @XmlElement(name = "CmonTradData", required = true)
    protected CommonTradeDataReport70 cmonTradData;
    @XmlElement(name = "TechAttrbts")
    protected TechnicalAttributes5 techAttrbts;
    @XmlElement(name = "PblcDssmntnData")
    protected DisseminationData1 pblcDssmntnData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the ctrPtySpcfcData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctrPtySpcfcData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrPtySpcfcData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CounterpartySpecificData36 }
     * 
     * 
     * @return
     *     The value of the ctrPtySpcfcData property.
     */
    public List<CounterpartySpecificData36> getCtrPtySpcfcData() {
        if (ctrPtySpcfcData == null) {
            ctrPtySpcfcData = new ArrayList<>();
        }
        return this.ctrPtySpcfcData;
    }

    /**
     * Gets the value of the cmonTradData property.
     * 
     * @return
     *     possible object is
     *     {@link CommonTradeDataReport70 }
     *     
     */
    public CommonTradeDataReport70 getCmonTradData() {
        return cmonTradData;
    }

    /**
     * Sets the value of the cmonTradData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonTradeDataReport70 }
     *     
     */
    public void setCmonTradData(CommonTradeDataReport70 value) {
        this.cmonTradData = value;
    }

    /**
     * Gets the value of the techAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalAttributes5 }
     *     
     */
    public TechnicalAttributes5 getTechAttrbts() {
        return techAttrbts;
    }

    /**
     * Sets the value of the techAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalAttributes5 }
     *     
     */
    public void setTechAttrbts(TechnicalAttributes5 value) {
        this.techAttrbts = value;
    }

    /**
     * Gets the value of the pblcDssmntnData property.
     * 
     * @return
     *     possible object is
     *     {@link DisseminationData1 }
     *     
     */
    public DisseminationData1 getPblcDssmntnData() {
        return pblcDssmntnData;
    }

    /**
     * Sets the value of the pblcDssmntnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisseminationData1 }
     *     
     */
    public void setPblcDssmntnData(DisseminationData1 value) {
        this.pblcDssmntnData = value;
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
