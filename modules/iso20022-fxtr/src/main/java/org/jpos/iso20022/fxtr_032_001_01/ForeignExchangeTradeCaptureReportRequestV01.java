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

package org.jpos.iso20022.fxtr_032_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForeignExchangeTradeCaptureReportRequestV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ForeignExchangeTradeCaptureReportRequestV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="QryReqId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.032.001.01}MessageIdentification1"/>
 *         <element name="QryOrdrSts" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.032.001.01}QueryOrderStatus1Code"/>
 *         <element name="QryTp" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.032.001.01}QueryDataType1Code" minOccurs="0"/>
 *         <element name="QryStartNb" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.032.001.01}Max35NumericText"/>
 *         <element name="QryByPrd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.032.001.01}YesNoIndicator"/>
 *         <element name="QryPrd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.032.001.01}Period4" minOccurs="0"/>
 *         <element name="QryTradId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.032.001.01}Max35Text" minOccurs="0"/>
 *         <element name="QryEndId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.032.001.01}Max35Text" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.032.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="QryPgSz" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.032.001.01}Max35NumericText" minOccurs="0"/>
 *         <element name="QryParamVal" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.032.001.01}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeCaptureReportRequestV01", propOrder = {
    "qryReqId",
    "qryOrdrSts",
    "qryTp",
    "qryStartNb",
    "qryByPrd",
    "qryPrd",
    "qryTradId",
    "qryEndId",
    "splmtryData",
    "qryPgSz",
    "qryParamVal"
})
public class ForeignExchangeTradeCaptureReportRequestV01 {

    @XmlElement(name = "QryReqId", required = true)
    protected MessageIdentification1 qryReqId;
    @XmlElement(name = "QryOrdrSts", required = true)
    @XmlSchemaType(name = "string")
    protected QueryOrderStatus1Code qryOrdrSts;
    @XmlElement(name = "QryTp")
    @XmlSchemaType(name = "string")
    protected QueryDataType1Code qryTp;
    @XmlElement(name = "QryStartNb", required = true)
    protected String qryStartNb;
    @XmlElement(name = "QryByPrd")
    protected boolean qryByPrd;
    @XmlElement(name = "QryPrd")
    protected Period4 qryPrd;
    @XmlElement(name = "QryTradId")
    protected String qryTradId;
    @XmlElement(name = "QryEndId")
    protected String qryEndId;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;
    @XmlElement(name = "QryPgSz")
    protected String qryPgSz;
    @XmlElement(name = "QryParamVal")
    protected String qryParamVal;

    /**
     * Gets the value of the qryReqId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getQryReqId() {
        return qryReqId;
    }

    /**
     * Sets the value of the qryReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setQryReqId(MessageIdentification1 value) {
        this.qryReqId = value;
    }

    /**
     * Gets the value of the qryOrdrSts property.
     * 
     * @return
     *     possible object is
     *     {@link QueryOrderStatus1Code }
     *     
     */
    public QueryOrderStatus1Code getQryOrdrSts() {
        return qryOrdrSts;
    }

    /**
     * Sets the value of the qryOrdrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryOrderStatus1Code }
     *     
     */
    public void setQryOrdrSts(QueryOrderStatus1Code value) {
        this.qryOrdrSts = value;
    }

    /**
     * Gets the value of the qryTp property.
     * 
     * @return
     *     possible object is
     *     {@link QueryDataType1Code }
     *     
     */
    public QueryDataType1Code getQryTp() {
        return qryTp;
    }

    /**
     * Sets the value of the qryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryDataType1Code }
     *     
     */
    public void setQryTp(QueryDataType1Code value) {
        this.qryTp = value;
    }

    /**
     * Gets the value of the qryStartNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryStartNb() {
        return qryStartNb;
    }

    /**
     * Sets the value of the qryStartNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryStartNb(String value) {
        this.qryStartNb = value;
    }

    /**
     * Gets the value of the qryByPrd property.
     * 
     */
    public boolean isQryByPrd() {
        return qryByPrd;
    }

    /**
     * Sets the value of the qryByPrd property.
     * 
     */
    public void setQryByPrd(boolean value) {
        this.qryByPrd = value;
    }

    /**
     * Gets the value of the qryPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4 }
     *     
     */
    public Period4 getQryPrd() {
        return qryPrd;
    }

    /**
     * Sets the value of the qryPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4 }
     *     
     */
    public void setQryPrd(Period4 value) {
        this.qryPrd = value;
    }

    /**
     * Gets the value of the qryTradId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryTradId() {
        return qryTradId;
    }

    /**
     * Sets the value of the qryTradId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryTradId(String value) {
        this.qryTradId = value;
    }

    /**
     * Gets the value of the qryEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryEndId() {
        return qryEndId;
    }

    /**
     * Sets the value of the qryEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryEndId(String value) {
        this.qryEndId = value;
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

    /**
     * Gets the value of the qryPgSz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryPgSz() {
        return qryPgSz;
    }

    /**
     * Sets the value of the qryPgSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryPgSz(String value) {
        this.qryPgSz = value;
    }

    /**
     * Gets the value of the qryParamVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryParamVal() {
        return qryParamVal;
    }

    /**
     * Sets the value of the qryParamVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryParamVal(String value) {
        this.qryParamVal = value;
    }

}
