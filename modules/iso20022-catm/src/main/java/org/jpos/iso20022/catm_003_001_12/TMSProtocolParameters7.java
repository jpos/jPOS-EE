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

package org.jpos.iso20022.catm_003_001_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TMSProtocolParameters7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TMSProtocolParameters7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActnTp" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}TerminalManagementAction3Code"/>
 *         <element name="TermnlMgrId" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}GenericIdentification176"/>
 *         <element name="PrtcolVrsn" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max8Text" minOccurs="0"/>
 *         <element name="MntncSvc" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}DataSetCategory10Code" maxOccurs="unbounded"/>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max256Text"/>
 *         <element name="ApplId" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="HstId" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max35Text"/>
 *         <element name="POIId" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max35Text" minOccurs="0"/>
 *         <element name="InitgPtyId" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max35Text" minOccurs="0"/>
 *         <element name="RcptPtyId" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max35Text" minOccurs="0"/>
 *         <element name="FileTrf" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="MsgItm" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}MessageItemCondition2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="XtrnlyTpSpprtd" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max1025Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMSProtocolParameters7", propOrder = {
    "actnTp",
    "termnlMgrId",
    "prtcolVrsn",
    "mntncSvc",
    "vrsn",
    "applId",
    "hstId",
    "poiId",
    "initgPtyId",
    "rcptPtyId",
    "fileTrf",
    "msgItm",
    "xtrnlyTpSpprtd"
})
public class TMSProtocolParameters7 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code actnTp;
    @XmlElement(name = "TermnlMgrId", required = true)
    protected GenericIdentification176 termnlMgrId;
    @XmlElement(name = "PrtcolVrsn")
    protected String prtcolVrsn;
    @XmlElement(name = "MntncSvc", required = true)
    @XmlSchemaType(name = "string")
    protected List<DataSetCategory10Code> mntncSvc;
    @XmlElement(name = "Vrsn", required = true)
    protected String vrsn;
    @XmlElement(name = "ApplId")
    protected List<String> applId;
    @XmlElement(name = "HstId", required = true)
    protected String hstId;
    @XmlElement(name = "POIId")
    protected String poiId;
    @XmlElement(name = "InitgPtyId")
    protected String initgPtyId;
    @XmlElement(name = "RcptPtyId")
    protected String rcptPtyId;
    @XmlElement(name = "FileTrf")
    protected Boolean fileTrf;
    @XmlElement(name = "MsgItm")
    protected List<MessageItemCondition2> msgItm;
    @XmlElement(name = "XtrnlyTpSpprtd")
    protected List<String> xtrnlyTpSpprtd;

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public TerminalManagementAction3Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public void setActnTp(TerminalManagementAction3Code value) {
        this.actnTp = value;
    }

    /**
     * Gets the value of the termnlMgrId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getTermnlMgrId() {
        return termnlMgrId;
    }

    /**
     * Sets the value of the termnlMgrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public void setTermnlMgrId(GenericIdentification176 value) {
        this.termnlMgrId = value;
    }

    /**
     * Gets the value of the prtcolVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtcolVrsn() {
        return prtcolVrsn;
    }

    /**
     * Sets the value of the prtcolVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtcolVrsn(String value) {
        this.prtcolVrsn = value;
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
     * {@link DataSetCategory10Code }
     * 
     * 
     * @return
     *     The value of the mntncSvc property.
     */
    public List<DataSetCategory10Code> getMntncSvc() {
        if (mntncSvc == null) {
            mntncSvc = new ArrayList<>();
        }
        return this.mntncSvc;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrsn(String value) {
        this.vrsn = value;
    }

    /**
     * Gets the value of the applId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the applId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the applId property.
     */
    public List<String> getApplId() {
        if (applId == null) {
            applId = new ArrayList<>();
        }
        return this.applId;
    }

    /**
     * Gets the value of the hstId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHstId() {
        return hstId;
    }

    /**
     * Sets the value of the hstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHstId(String value) {
        this.hstId = value;
    }

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOIId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOIId(String value) {
        this.poiId = value;
    }

    /**
     * Gets the value of the initgPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitgPtyId() {
        return initgPtyId;
    }

    /**
     * Sets the value of the initgPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitgPtyId(String value) {
        this.initgPtyId = value;
    }

    /**
     * Gets the value of the rcptPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcptPtyId() {
        return rcptPtyId;
    }

    /**
     * Sets the value of the rcptPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcptPtyId(String value) {
        this.rcptPtyId = value;
    }

    /**
     * Gets the value of the fileTrf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFileTrf() {
        return fileTrf;
    }

    /**
     * Sets the value of the fileTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFileTrf(Boolean value) {
        this.fileTrf = value;
    }

    /**
     * Gets the value of the msgItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageItemCondition2 }
     * 
     * 
     * @return
     *     The value of the msgItm property.
     */
    public List<MessageItemCondition2> getMsgItm() {
        if (msgItm == null) {
            msgItm = new ArrayList<>();
        }
        return this.msgItm;
    }

    /**
     * Gets the value of the xtrnlyTpSpprtd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtrnlyTpSpprtd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtrnlyTpSpprtd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the xtrnlyTpSpprtd property.
     */
    public List<String> getXtrnlyTpSpprtd() {
        if (xtrnlyTpSpprtd == null) {
            xtrnlyTpSpprtd = new ArrayList<>();
        }
        return this.xtrnlyTpSpprtd;
    }

}
