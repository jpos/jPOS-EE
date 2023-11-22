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

package org.jpos.iso20022.camt_088_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetReportV02 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NetReportV02">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NetRptData" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}NetReportData2"/>
 *         <element name="NetSvcPtcptId" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}PartyIdentification242Choice"/>
 *         <element name="NetSvcCtrPtyId" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}PartyIdentification242Choice" minOccurs="0"/>
 *         <element name="NetOblgtn" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}NetObligation2" maxOccurs="unbounded"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetReportV02", propOrder = {
    "netRptData",
    "netSvcPtcptId",
    "netSvcCtrPtyId",
    "netOblgtn",
    "splmtryData"
})
public class NetReportV02 {

    @XmlElement(name = "NetRptData", required = true)
    protected NetReportData2 netRptData;
    @XmlElement(name = "NetSvcPtcptId", required = true)
    protected PartyIdentification242Choice netSvcPtcptId;
    @XmlElement(name = "NetSvcCtrPtyId")
    protected PartyIdentification242Choice netSvcCtrPtyId;
    @XmlElement(name = "NetOblgtn", required = true)
    protected List<NetObligation2> netOblgtn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the netRptData property.
     * 
     * @return
     *     possible object is
     *     {@link NetReportData2 }
     *     
     */
    public NetReportData2 getNetRptData() {
        return netRptData;
    }

    /**
     * Sets the value of the netRptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetReportData2 }
     *     
     */
    public void setNetRptData(NetReportData2 value) {
        this.netRptData = value;
    }

    /**
     * Gets the value of the netSvcPtcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getNetSvcPtcptId() {
        return netSvcPtcptId;
    }

    /**
     * Sets the value of the netSvcPtcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setNetSvcPtcptId(PartyIdentification242Choice value) {
        this.netSvcPtcptId = value;
    }

    /**
     * Gets the value of the netSvcCtrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getNetSvcCtrPtyId() {
        return netSvcCtrPtyId;
    }

    /**
     * Sets the value of the netSvcCtrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setNetSvcCtrPtyId(PartyIdentification242Choice value) {
        this.netSvcCtrPtyId = value;
    }

    /**
     * Gets the value of the netOblgtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the netOblgtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetOblgtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetObligation2 }
     * 
     * 
     * @return
     *     The value of the netOblgtn property.
     */
    public List<NetObligation2> getNetOblgtn() {
        if (netOblgtn == null) {
            netOblgtn = new ArrayList<>();
        }
        return this.netOblgtn;
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
