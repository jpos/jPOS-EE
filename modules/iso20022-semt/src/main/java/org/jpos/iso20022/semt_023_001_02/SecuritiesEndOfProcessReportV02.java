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

package org.jpos.iso20022.semt_023_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesEndOfProcessReportV02 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesEndOfProcessReportV02">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}Pagination1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RptGnlDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}Report6"/>
 *         <element name="ConfPties" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}ConfirmationParties7" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Invstr" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}PartyIdentificationAndAccount220" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesEndOfProcessReportV02", propOrder = {
    "pgntn",
    "rptGnlDtls",
    "confPties",
    "invstr",
    "splmtryData"
})
public class SecuritiesEndOfProcessReportV02 {

    @XmlElement(name = "Pgntn")
    protected List<Pagination1> pgntn;
    @XmlElement(name = "RptGnlDtls", required = true)
    protected Report6 rptGnlDtls;
    @XmlElement(name = "ConfPties")
    protected List<ConfirmationParties7> confPties;
    @XmlElement(name = "Invstr")
    protected List<PartyIdentificationAndAccount220> invstr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the pgntn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pgntn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPgntn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pagination1 }
     * 
     * 
     * @return
     *     The value of the pgntn property.
     */
    public List<Pagination1> getPgntn() {
        if (pgntn == null) {
            pgntn = new ArrayList<>();
        }
        return this.pgntn;
    }

    /**
     * Gets the value of the rptGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Report6 }
     *     
     */
    public Report6 getRptGnlDtls() {
        return rptGnlDtls;
    }

    /**
     * Sets the value of the rptGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Report6 }
     *     
     */
    public void setRptGnlDtls(Report6 value) {
        this.rptGnlDtls = value;
    }

    /**
     * Gets the value of the confPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the confPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfirmationParties7 }
     * 
     * 
     * @return
     *     The value of the confPties property.
     */
    public List<ConfirmationParties7> getConfPties() {
        if (confPties == null) {
            confPties = new ArrayList<>();
        }
        return this.confPties;
    }

    /**
     * Gets the value of the invstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the invstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentificationAndAccount220 }
     * 
     * 
     * @return
     *     The value of the invstr property.
     */
    public List<PartyIdentificationAndAccount220> getInvstr() {
        if (invstr == null) {
            invstr = new ArrayList<>();
        }
        return this.invstr;
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
