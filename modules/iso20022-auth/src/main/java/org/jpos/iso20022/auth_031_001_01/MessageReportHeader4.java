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

package org.jpos.iso20022.auth_031_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageReportHeader4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MessageReportHeader4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgRptIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.031.001.01}Max140Text" minOccurs="0"/>
 *         <element name="MsgSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.031.001.01}StatusAdviceReport3" minOccurs="0"/>
 *         <element name="RcrdSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.031.001.01}StatusReportRecord3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.031.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageReportHeader4", propOrder = {
    "msgRptIdr",
    "msgSts",
    "rcrdSts",
    "splmtryData"
})
public class MessageReportHeader4 {

    @XmlElement(name = "MsgRptIdr")
    protected String msgRptIdr;
    @XmlElement(name = "MsgSts")
    protected StatusAdviceReport3 msgSts;
    @XmlElement(name = "RcrdSts")
    protected List<StatusReportRecord3> rcrdSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgRptIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgRptIdr() {
        return msgRptIdr;
    }

    /**
     * Sets the value of the msgRptIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgRptIdr(String value) {
        this.msgRptIdr = value;
    }

    /**
     * Gets the value of the msgSts property.
     * 
     * @return
     *     possible object is
     *     {@link StatusAdviceReport3 }
     *     
     */
    public StatusAdviceReport3 getMsgSts() {
        return msgSts;
    }

    /**
     * Sets the value of the msgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusAdviceReport3 }
     *     
     */
    public void setMsgSts(StatusAdviceReport3 value) {
        this.msgSts = value;
    }

    /**
     * Gets the value of the rcrdSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rcrdSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcrdSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusReportRecord3 }
     * 
     * 
     * @return
     *     The value of the rcrdSts property.
     */
    public List<StatusReportRecord3> getRcrdSts() {
        if (rcrdSts == null) {
            rcrdSts = new ArrayList<>();
        }
        return this.rcrdSts;
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
