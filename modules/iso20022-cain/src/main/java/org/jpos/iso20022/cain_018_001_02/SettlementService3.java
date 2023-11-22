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

package org.jpos.iso20022.cain_018_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementService3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementService3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SttlmSvcPropsd" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}SettlementServiceMode1" minOccurs="0"/>
 *         <element name="SttlmSvcApld" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}SettlementServiceMode1" minOccurs="0"/>
 *         <element name="SttlmSvcDts" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}SettlementServiceDate2" minOccurs="0"/>
 *         <element name="SttlmRptgNtty" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}SettlementReportingEntity1" minOccurs="0"/>
 *         <element name="AddtlSttlmInf" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementService3", propOrder = {
    "sttlmSvcPropsd",
    "sttlmSvcApld",
    "sttlmSvcDts",
    "sttlmRptgNtty",
    "addtlSttlmInf"
})
public class SettlementService3 {

    @XmlElement(name = "SttlmSvcPropsd")
    protected SettlementServiceMode1 sttlmSvcPropsd;
    @XmlElement(name = "SttlmSvcApld")
    protected SettlementServiceMode1 sttlmSvcApld;
    @XmlElement(name = "SttlmSvcDts")
    protected SettlementServiceDate2 sttlmSvcDts;
    @XmlElement(name = "SttlmRptgNtty")
    protected SettlementReportingEntity1 sttlmRptgNtty;
    @XmlElement(name = "AddtlSttlmInf")
    protected List<AdditionalData1> addtlSttlmInf;

    /**
     * Gets the value of the sttlmSvcPropsd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementServiceMode1 }
     *     
     */
    public SettlementServiceMode1 getSttlmSvcPropsd() {
        return sttlmSvcPropsd;
    }

    /**
     * Sets the value of the sttlmSvcPropsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementServiceMode1 }
     *     
     */
    public void setSttlmSvcPropsd(SettlementServiceMode1 value) {
        this.sttlmSvcPropsd = value;
    }

    /**
     * Gets the value of the sttlmSvcApld property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementServiceMode1 }
     *     
     */
    public SettlementServiceMode1 getSttlmSvcApld() {
        return sttlmSvcApld;
    }

    /**
     * Sets the value of the sttlmSvcApld property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementServiceMode1 }
     *     
     */
    public void setSttlmSvcApld(SettlementServiceMode1 value) {
        this.sttlmSvcApld = value;
    }

    /**
     * Gets the value of the sttlmSvcDts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementServiceDate2 }
     *     
     */
    public SettlementServiceDate2 getSttlmSvcDts() {
        return sttlmSvcDts;
    }

    /**
     * Sets the value of the sttlmSvcDts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementServiceDate2 }
     *     
     */
    public void setSttlmSvcDts(SettlementServiceDate2 value) {
        this.sttlmSvcDts = value;
    }

    /**
     * Gets the value of the sttlmRptgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementReportingEntity1 }
     *     
     */
    public SettlementReportingEntity1 getSttlmRptgNtty() {
        return sttlmRptgNtty;
    }

    /**
     * Sets the value of the sttlmRptgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementReportingEntity1 }
     *     
     */
    public void setSttlmRptgNtty(SettlementReportingEntity1 value) {
        this.sttlmRptgNtty = value;
    }

    /**
     * Gets the value of the addtlSttlmInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlSttlmInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlSttlmInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlSttlmInf property.
     */
    public List<AdditionalData1> getAddtlSttlmInf() {
        if (addtlSttlmInf == null) {
            addtlSttlmInf = new ArrayList<>();
        }
        return this.addtlSttlmInf;
    }

}
