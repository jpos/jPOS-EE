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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TripInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TripInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TripNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="JobNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max10Text" minOccurs="0"/>
 *         <element name="WorkOrdr" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max70Text" minOccurs="0"/>
 *         <element name="InvcNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max70Text" minOccurs="0"/>
 *         <element name="BllgId" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max70Text" minOccurs="0"/>
 *         <element name="CtrlNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="DlvryTcktNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripInformation1", propOrder = {
    "tripNb",
    "jobNb",
    "workOrdr",
    "invcNb",
    "bllgId",
    "ctrlNb",
    "dlvryTcktNb"
})
public class TripInformation1 {

    @XmlElement(name = "TripNb")
    protected String tripNb;
    @XmlElement(name = "JobNb")
    protected String jobNb;
    @XmlElement(name = "WorkOrdr")
    protected String workOrdr;
    @XmlElement(name = "InvcNb")
    protected String invcNb;
    @XmlElement(name = "BllgId")
    protected String bllgId;
    @XmlElement(name = "CtrlNb")
    protected String ctrlNb;
    @XmlElement(name = "DlvryTcktNb")
    protected String dlvryTcktNb;

    /**
     * Gets the value of the tripNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripNb() {
        return tripNb;
    }

    /**
     * Sets the value of the tripNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripNb(String value) {
        this.tripNb = value;
    }

    /**
     * Gets the value of the jobNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobNb() {
        return jobNb;
    }

    /**
     * Sets the value of the jobNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobNb(String value) {
        this.jobNb = value;
    }

    /**
     * Gets the value of the workOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrdr() {
        return workOrdr;
    }

    /**
     * Sets the value of the workOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrdr(String value) {
        this.workOrdr = value;
    }

    /**
     * Gets the value of the invcNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvcNb() {
        return invcNb;
    }

    /**
     * Sets the value of the invcNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvcNb(String value) {
        this.invcNb = value;
    }

    /**
     * Gets the value of the bllgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBllgId() {
        return bllgId;
    }

    /**
     * Sets the value of the bllgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBllgId(String value) {
        this.bllgId = value;
    }

    /**
     * Gets the value of the ctrlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrlNb() {
        return ctrlNb;
    }

    /**
     * Sets the value of the ctrlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrlNb(String value) {
        this.ctrlNb = value;
    }

    /**
     * Gets the value of the dlvryTcktNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvryTcktNb() {
        return dlvryTcktNb;
    }

    /**
     * Sets the value of the dlvryTcktNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvryTcktNb(String value) {
        this.dlvryTcktNb = value;
    }

}
