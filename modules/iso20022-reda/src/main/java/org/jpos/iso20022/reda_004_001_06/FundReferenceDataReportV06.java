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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundReferenceDataReportV06 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FundReferenceDataReportV06">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}MessageIdentification1"/>
 *         <element name="PrvsRef" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}AdditionalReference10" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RltdRef" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}AdditionalReference10" minOccurs="0"/>
 *         <element name="FndRefDataRptId" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Max35Text" minOccurs="0"/>
 *         <element name="Rpt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}FundReferenceDataReport4" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundReferenceDataReportV06", propOrder = {
    "msgId",
    "prvsRef",
    "rltdRef",
    "fndRefDataRptId",
    "rpt"
})
public class FundReferenceDataReportV06 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PrvsRef")
    protected List<AdditionalReference10> prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference10 rltdRef;
    @XmlElement(name = "FndRefDataRptId")
    protected String fndRefDataRptId;
    @XmlElement(name = "Rpt", required = true)
    protected List<FundReferenceDataReport4> rpt;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setMsgId(MessageIdentification1 value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvsRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvsRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalReference10 }
     * 
     * 
     * @return
     *     The value of the prvsRef property.
     */
    public List<AdditionalReference10> getPrvsRef() {
        if (prvsRef == null) {
            prvsRef = new ArrayList<>();
        }
        return this.prvsRef;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public void setRltdRef(AdditionalReference10 value) {
        this.rltdRef = value;
    }

    /**
     * Gets the value of the fndRefDataRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFndRefDataRptId() {
        return fndRefDataRptId;
    }

    /**
     * Sets the value of the fndRefDataRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFndRefDataRptId(String value) {
        this.fndRefDataRptId = value;
    }

    /**
     * Gets the value of the rpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundReferenceDataReport4 }
     * 
     * 
     * @return
     *     The value of the rpt property.
     */
    public List<FundReferenceDataReport4> getRpt() {
        if (rpt == null) {
            rpt = new ArrayList<>();
        }
        return this.rpt;
    }

}
