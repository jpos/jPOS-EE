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

package org.jpos.iso20022.camt_062_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayInScheduleV03 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PayInScheduleV03">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PtyId" type="{urn:iso:std:iso:20022:tech:xsd:camt.062.001.03}PartyIdentification73Choice"/>
 *         <element name="RptData" type="{urn:iso:std:iso:20022:tech:xsd:camt.062.001.03}ReportData4"/>
 *         <element name="PayInSchdlLngBal" type="{urn:iso:std:iso:20022:tech:xsd:camt.062.001.03}BalanceStatus2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PayInSchdlItm" type="{urn:iso:std:iso:20022:tech:xsd:camt.062.001.03}PayInScheduleItems1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PayInFctrs" type="{urn:iso:std:iso:20022:tech:xsd:camt.062.001.03}PayInFactors1" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.062.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayInScheduleV03", propOrder = {
    "ptyId",
    "rptData",
    "payInSchdlLngBal",
    "payInSchdlItm",
    "payInFctrs",
    "splmtryData"
})
public class PayInScheduleV03 {

    @XmlElement(name = "PtyId", required = true)
    protected PartyIdentification73Choice ptyId;
    @XmlElement(name = "RptData", required = true)
    protected ReportData4 rptData;
    @XmlElement(name = "PayInSchdlLngBal")
    protected List<BalanceStatus2> payInSchdlLngBal;
    @XmlElement(name = "PayInSchdlItm")
    protected List<PayInScheduleItems1> payInSchdlItm;
    @XmlElement(name = "PayInFctrs")
    protected PayInFactors1 payInFctrs;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public void setPtyId(PartyIdentification73Choice value) {
        this.ptyId = value;
    }

    /**
     * Gets the value of the rptData property.
     * 
     * @return
     *     possible object is
     *     {@link ReportData4 }
     *     
     */
    public ReportData4 getRptData() {
        return rptData;
    }

    /**
     * Sets the value of the rptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportData4 }
     *     
     */
    public void setRptData(ReportData4 value) {
        this.rptData = value;
    }

    /**
     * Gets the value of the payInSchdlLngBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the payInSchdlLngBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayInSchdlLngBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceStatus2 }
     * 
     * 
     * @return
     *     The value of the payInSchdlLngBal property.
     */
    public List<BalanceStatus2> getPayInSchdlLngBal() {
        if (payInSchdlLngBal == null) {
            payInSchdlLngBal = new ArrayList<>();
        }
        return this.payInSchdlLngBal;
    }

    /**
     * Gets the value of the payInSchdlItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the payInSchdlItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayInSchdlItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayInScheduleItems1 }
     * 
     * 
     * @return
     *     The value of the payInSchdlItm property.
     */
    public List<PayInScheduleItems1> getPayInSchdlItm() {
        if (payInSchdlItm == null) {
            payInSchdlItm = new ArrayList<>();
        }
        return this.payInSchdlItm;
    }

    /**
     * Gets the value of the payInFctrs property.
     * 
     * @return
     *     possible object is
     *     {@link PayInFactors1 }
     *     
     */
    public PayInFactors1 getPayInFctrs() {
        return payInFctrs;
    }

    /**
     * Sets the value of the payInFctrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayInFactors1 }
     *     
     */
    public void setPayInFctrs(PayInFactors1 value) {
        this.payInFctrs = value;
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
