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

package org.jpos.iso20022.caad_008_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeData3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DisputeData3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PresntmntCycl" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Exact1NumericText" minOccurs="0"/>
 *         <element name="DsptCond" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="DsptSts" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="PrtlDspt" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="DsptRef" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}DisputeReference1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DcmnttnSts" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="AddtlDsptData" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}AdditionalData1" minOccurs="0"/>
 *         <element name="DsptRjctRsn" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ChrgbckElgblty" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeData3", propOrder = {
    "presntmntCycl",
    "dsptCond",
    "dsptSts",
    "prtlDspt",
    "dsptRef",
    "dcmnttnSts",
    "addtlDsptData",
    "dsptRjctRsn",
    "chrgbckElgblty"
})
public class DisputeData3 {

    @XmlElement(name = "PresntmntCycl")
    protected String presntmntCycl;
    @XmlElement(name = "DsptCond")
    protected String dsptCond;
    @XmlElement(name = "DsptSts")
    protected String dsptSts;
    @XmlElement(name = "PrtlDspt")
    protected Boolean prtlDspt;
    @XmlElement(name = "DsptRef")
    protected List<DisputeReference1> dsptRef;
    @XmlElement(name = "DcmnttnSts")
    protected String dcmnttnSts;
    @XmlElement(name = "AddtlDsptData")
    protected AdditionalData1 addtlDsptData;
    @XmlElement(name = "DsptRjctRsn")
    protected List<String> dsptRjctRsn;
    @XmlElement(name = "ChrgbckElgblty")
    protected String chrgbckElgblty;

    /**
     * Gets the value of the presntmntCycl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresntmntCycl() {
        return presntmntCycl;
    }

    /**
     * Sets the value of the presntmntCycl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresntmntCycl(String value) {
        this.presntmntCycl = value;
    }

    /**
     * Gets the value of the dsptCond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsptCond() {
        return dsptCond;
    }

    /**
     * Sets the value of the dsptCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsptCond(String value) {
        this.dsptCond = value;
    }

    /**
     * Gets the value of the dsptSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsptSts() {
        return dsptSts;
    }

    /**
     * Sets the value of the dsptSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsptSts(String value) {
        this.dsptSts = value;
    }

    /**
     * Gets the value of the prtlDspt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlDspt() {
        return prtlDspt;
    }

    /**
     * Sets the value of the prtlDspt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrtlDspt(Boolean value) {
        this.prtlDspt = value;
    }

    /**
     * Gets the value of the dsptRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dsptRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsptRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeReference1 }
     * 
     * 
     * @return
     *     The value of the dsptRef property.
     */
    public List<DisputeReference1> getDsptRef() {
        if (dsptRef == null) {
            dsptRef = new ArrayList<>();
        }
        return this.dsptRef;
    }

    /**
     * Gets the value of the dcmnttnSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcmnttnSts() {
        return dcmnttnSts;
    }

    /**
     * Sets the value of the dcmnttnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcmnttnSts(String value) {
        this.dcmnttnSts = value;
    }

    /**
     * Gets the value of the addtlDsptData property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalData1 }
     *     
     */
    public AdditionalData1 getAddtlDsptData() {
        return addtlDsptData;
    }

    /**
     * Sets the value of the addtlDsptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalData1 }
     *     
     */
    public void setAddtlDsptData(AdditionalData1 value) {
        this.addtlDsptData = value;
    }

    /**
     * Gets the value of the dsptRjctRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dsptRjctRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsptRjctRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the dsptRjctRsn property.
     */
    public List<String> getDsptRjctRsn() {
        if (dsptRjctRsn == null) {
            dsptRjctRsn = new ArrayList<>();
        }
        return this.dsptRjctRsn;
    }

    /**
     * Gets the value of the chrgbckElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChrgbckElgblty() {
        return chrgbckElgblty;
    }

    /**
     * Sets the value of the chrgbckElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChrgbckElgblty(String value) {
        this.chrgbckElgblty = value;
    }

}
