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

package org.jpos.iso20022.secl_004_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetPositionV03 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NetPositionV03">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptParams" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}ReportParameters1"/>
 *         <element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}Pagination"/>
 *         <element name="ClrMmb" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}PartyIdentification35Choice"/>
 *         <element name="ClrSgmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}PartyIdentification35Choice" minOccurs="0"/>
 *         <element name="NetPosRpt" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}NetPosition3" maxOccurs="unbounded"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:secl.004.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetPositionV03", propOrder = {
    "rptParams",
    "pgntn",
    "clrMmb",
    "clrSgmt",
    "netPosRpt",
    "splmtryData"
})
public class NetPositionV03 {

    @XmlElement(name = "RptParams", required = true)
    protected ReportParameters1 rptParams;
    @XmlElement(name = "Pgntn", required = true)
    protected Pagination pgntn;
    @XmlElement(name = "ClrMmb", required = true)
    protected PartyIdentification35Choice clrMmb;
    @XmlElement(name = "ClrSgmt")
    protected PartyIdentification35Choice clrSgmt;
    @XmlElement(name = "NetPosRpt", required = true)
    protected List<NetPosition3> netPosRpt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptParams property.
     * 
     * @return
     *     possible object is
     *     {@link ReportParameters1 }
     *     
     */
    public ReportParameters1 getRptParams() {
        return rptParams;
    }

    /**
     * Sets the value of the rptParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportParameters1 }
     *     
     */
    public void setRptParams(ReportParameters1 value) {
        this.rptParams = value;
    }

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public void setPgntn(Pagination value) {
        this.pgntn = value;
    }

    /**
     * Gets the value of the clrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getClrMmb() {
        return clrMmb;
    }

    /**
     * Sets the value of the clrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public void setClrMmb(PartyIdentification35Choice value) {
        this.clrMmb = value;
    }

    /**
     * Gets the value of the clrSgmt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getClrSgmt() {
        return clrSgmt;
    }

    /**
     * Sets the value of the clrSgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public void setClrSgmt(PartyIdentification35Choice value) {
        this.clrSgmt = value;
    }

    /**
     * Gets the value of the netPosRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the netPosRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetPosRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetPosition3 }
     * 
     * 
     * @return
     *     The value of the netPosRpt property.
     */
    public List<NetPosition3> getNetPosRpt() {
        if (netPosRpt == null) {
            netPosRpt = new ArrayList<>();
        }
        return this.netPosRpt;
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
