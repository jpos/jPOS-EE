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

package org.jpos.iso20022.catm_005_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintenanceDelegation15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MaintenanceDelegation15">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DlgtnTp" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TerminalManagementAction3Code"/>
 *         <element name="MntncSvc" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}DataSetCategory16Code" maxOccurs="unbounded"/>
 *         <element name="PrtlDlgtn" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="POISubset" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DlgtdActn" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}MaintenanceDelegateAction8" minOccurs="0"/>
 *         <element name="DlgtnScpId" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max35Text" minOccurs="0"/>
 *         <element name="DlgtnScpDef" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max3000Binary" minOccurs="0"/>
 *         <element name="Cert" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max10KBinary" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="POIIdAssoctn" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}MaintenanceIdentificationAssociation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SmmtrcKey" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}KEKIdentifier5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ParamDataSet" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}AcceptorConfigurationDataSet4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceDelegation15", propOrder = {
    "dlgtnTp",
    "mntncSvc",
    "prtlDlgtn",
    "poiSubset",
    "dlgtdActn",
    "dlgtnScpId",
    "dlgtnScpDef",
    "cert",
    "poiIdAssoctn",
    "smmtrcKey",
    "paramDataSet"
})
public class MaintenanceDelegation15 {

    @XmlElement(name = "DlgtnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code dlgtnTp;
    @XmlElement(name = "MntncSvc", required = true)
    @XmlSchemaType(name = "string")
    protected List<DataSetCategory16Code> mntncSvc;
    @XmlElement(name = "PrtlDlgtn")
    protected Boolean prtlDlgtn;
    @XmlElement(name = "POISubset")
    protected List<String> poiSubset;
    @XmlElement(name = "DlgtdActn")
    protected MaintenanceDelegateAction8 dlgtdActn;
    @XmlElement(name = "DlgtnScpId")
    protected String dlgtnScpId;
    @XmlElement(name = "DlgtnScpDef")
    protected byte[] dlgtnScpDef;
    @XmlElement(name = "Cert")
    protected List<byte[]> cert;
    @XmlElement(name = "POIIdAssoctn")
    protected List<MaintenanceIdentificationAssociation1> poiIdAssoctn;
    @XmlElement(name = "SmmtrcKey")
    protected List<KEKIdentifier5> smmtrcKey;
    @XmlElement(name = "ParamDataSet")
    protected AcceptorConfigurationDataSet4 paramDataSet;

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
     * Gets the value of the prtlDlgtn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlDlgtn() {
        return prtlDlgtn;
    }

    /**
     * Sets the value of the prtlDlgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrtlDlgtn(Boolean value) {
        this.prtlDlgtn = value;
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
     * Gets the value of the dlgtdActn property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceDelegateAction8 }
     *     
     */
    public MaintenanceDelegateAction8 getDlgtdActn() {
        return dlgtdActn;
    }

    /**
     * Sets the value of the dlgtdActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceDelegateAction8 }
     *     
     */
    public void setDlgtdActn(MaintenanceDelegateAction8 value) {
        this.dlgtdActn = value;
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
     * Gets the value of the cert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     * @return
     *     The value of the cert property.
     */
    public List<byte[]> getCert() {
        if (cert == null) {
            cert = new ArrayList<>();
        }
        return this.cert;
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

    /**
     * Gets the value of the smmtrcKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the smmtrcKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmmtrcKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KEKIdentifier5 }
     * 
     * 
     * @return
     *     The value of the smmtrcKey property.
     */
    public List<KEKIdentifier5> getSmmtrcKey() {
        if (smmtrcKey == null) {
            smmtrcKey = new ArrayList<>();
        }
        return this.smmtrcKey;
    }

    /**
     * Gets the value of the paramDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorConfigurationDataSet4 }
     *     
     */
    public AcceptorConfigurationDataSet4 getParamDataSet() {
        return paramDataSet;
    }

    /**
     * Sets the value of the paramDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorConfigurationDataSet4 }
     *     
     */
    public void setParamDataSet(AcceptorConfigurationDataSet4 value) {
        this.paramDataSet = value;
    }

}
