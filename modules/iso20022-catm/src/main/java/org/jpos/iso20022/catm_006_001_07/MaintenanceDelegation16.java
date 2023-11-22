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

package org.jpos.iso20022.catm_006_001_07;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintenanceDelegation16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MaintenanceDelegation16">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MntncSvc" type="{urn:iso:std:iso:20022:tech:xsd:catm.006.001.07}DataSetCategory16Code" maxOccurs="unbounded"/>
 *         <element name="Rspn" type="{urn:iso:std:iso:20022:tech:xsd:catm.006.001.07}Response2Code"/>
 *         <element name="RspnRsn" type="{urn:iso:std:iso:20022:tech:xsd:catm.006.001.07}Max35Text" minOccurs="0"/>
 *         <element name="DlgtnTp" type="{urn:iso:std:iso:20022:tech:xsd:catm.006.001.07}TerminalManagementAction3Code"/>
 *         <element name="POISubset" type="{urn:iso:std:iso:20022:tech:xsd:catm.006.001.07}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DlgtnScpId" type="{urn:iso:std:iso:20022:tech:xsd:catm.006.001.07}Max35Text" minOccurs="0"/>
 *         <element name="DlgtnScpDef" type="{urn:iso:std:iso:20022:tech:xsd:catm.006.001.07}Max3000Binary" minOccurs="0"/>
 *         <element name="DlgtnProof" type="{urn:iso:std:iso:20022:tech:xsd:catm.006.001.07}Max5000Binary" minOccurs="0"/>
 *         <element name="PrtctdDlgtnProof" type="{urn:iso:std:iso:20022:tech:xsd:catm.006.001.07}ContentInformationType34" minOccurs="0"/>
 *         <element name="POIIdAssoctn" type="{urn:iso:std:iso:20022:tech:xsd:catm.006.001.07}MaintenanceIdentificationAssociation1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceDelegation16", propOrder = {
    "mntncSvc",
    "rspn",
    "rspnRsn",
    "dlgtnTp",
    "poiSubset",
    "dlgtnScpId",
    "dlgtnScpDef",
    "dlgtnProof",
    "prtctdDlgtnProof",
    "poiIdAssoctn"
})
public class MaintenanceDelegation16 {

    @XmlElement(name = "MntncSvc", required = true)
    @XmlSchemaType(name = "string")
    protected List<DataSetCategory16Code> mntncSvc;
    @XmlElement(name = "Rspn", required = true)
    @XmlSchemaType(name = "string")
    protected Response2Code rspn;
    @XmlElement(name = "RspnRsn")
    protected String rspnRsn;
    @XmlElement(name = "DlgtnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code dlgtnTp;
    @XmlElement(name = "POISubset")
    protected List<String> poiSubset;
    @XmlElement(name = "DlgtnScpId")
    protected String dlgtnScpId;
    @XmlElement(name = "DlgtnScpDef")
    protected byte[] dlgtnScpDef;
    @XmlElement(name = "DlgtnProof")
    protected byte[] dlgtnProof;
    @XmlElement(name = "PrtctdDlgtnProof")
    protected ContentInformationType34 prtctdDlgtnProof;
    @XmlElement(name = "POIIdAssoctn")
    protected List<MaintenanceIdentificationAssociation1> poiIdAssoctn;

    /**
     * Gets the value of the mntncSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mntncSvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMntncSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSetCategory16Code }
     * 
     * 
     * @return
     *     The value of the mntncSvc property.
     */
    public List<DataSetCategory16Code> getMntncSvc() {
        if (mntncSvc == null) {
            mntncSvc = new ArrayList<>();
        }
        return this.mntncSvc;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link Response2Code }
     *     
     */
    public Response2Code getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response2Code }
     *     
     */
    public void setRspn(Response2Code value) {
        this.rspn = value;
    }

    /**
     * Gets the value of the rspnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnRsn() {
        return rspnRsn;
    }

    /**
     * Sets the value of the rspnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspnRsn(String value) {
        this.rspnRsn = value;
    }

    /**
     * Gets the value of the dlgtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public TerminalManagementAction3Code getDlgtnTp() {
        return dlgtnTp;
    }

    /**
     * Sets the value of the dlgtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public void setDlgtnTp(TerminalManagementAction3Code value) {
        this.dlgtnTp = value;
    }

    /**
     * Gets the value of the poiSubset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the poiSubset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOISubset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the poiSubset property.
     */
    public List<String> getPOISubset() {
        if (poiSubset == null) {
            poiSubset = new ArrayList<>();
        }
        return this.poiSubset;
    }

    /**
     * Gets the value of the dlgtnScpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlgtnScpId() {
        return dlgtnScpId;
    }

    /**
     * Sets the value of the dlgtnScpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlgtnScpId(String value) {
        this.dlgtnScpId = value;
    }

    /**
     * Gets the value of the dlgtnScpDef property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDlgtnScpDef() {
        return dlgtnScpDef;
    }

    /**
     * Sets the value of the dlgtnScpDef property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDlgtnScpDef(byte[] value) {
        this.dlgtnScpDef = value;
    }

    /**
     * Gets the value of the dlgtnProof property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDlgtnProof() {
        return dlgtnProof;
    }

    /**
     * Sets the value of the dlgtnProof property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDlgtnProof(byte[] value) {
        this.dlgtnProof = value;
    }

    /**
     * Gets the value of the prtctdDlgtnProof property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType34 }
     *     
     */
    public ContentInformationType34 getPrtctdDlgtnProof() {
        return prtctdDlgtnProof;
    }

    /**
     * Sets the value of the prtctdDlgtnProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType34 }
     *     
     */
    public void setPrtctdDlgtnProof(ContentInformationType34 value) {
        this.prtctdDlgtnProof = value;
    }

    /**
     * Gets the value of the poiIdAssoctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the poiIdAssoctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOIIdAssoctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceIdentificationAssociation1 }
     * 
     * 
     * @return
     *     The value of the poiIdAssoctn property.
     */
    public List<MaintenanceIdentificationAssociation1> getPOIIdAssoctn() {
        if (poiIdAssoctn == null) {
            poiIdAssoctn = new ArrayList<>();
        }
        return this.poiIdAssoctn;
    }

}
