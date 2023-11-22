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
 * <p>Java class for TMSAction11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TMSAction11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TerminalManagementAction5Code"/>
 *         <element name="RmotAccs" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}NetworkParameters7" minOccurs="0"/>
 *         <element name="Key" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}KEKIdentifier5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TermnlMgrId" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}GenericIdentification176" minOccurs="0"/>
 *         <element name="TMSPrtcol" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max35Text" minOccurs="0"/>
 *         <element name="TMSPrtcolVrsn" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max35Text" minOccurs="0"/>
 *         <element name="DataSetId" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}DataSetIdentification10" minOccurs="0"/>
 *         <element name="CmpntTp" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}DataSetCategory18Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DlgtnScpId" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max35Text" minOccurs="0"/>
 *         <element name="DlgtnScpDef" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max3000Binary" minOccurs="0"/>
 *         <element name="DlgtnProof" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max5000Binary" minOccurs="0"/>
 *         <element name="PrtctdDlgtnProof" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}ContentInformationType34" minOccurs="0"/>
 *         <element name="Trggr" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TerminalManagementActionTrigger1Code"/>
 *         <element name="AddtlPrc" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TerminalManagementAdditionalProcess1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ReTry" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}ProcessRetry3" minOccurs="0"/>
 *         <element name="TmCond" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}ProcessTiming5" minOccurs="0"/>
 *         <element name="TMChllng" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max140Binary" minOccurs="0"/>
 *         <element name="KeyNcphrmntCert" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max10KBinary" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ErrActn" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}ErrorAction5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max3000Binary" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MsgItm" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}MessageItemCondition2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DvcReq" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}DeviceRequest6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMSAction11", propOrder = {
    "tp",
    "rmotAccs",
    "key",
    "termnlMgrId",
    "tmsPrtcol",
    "tmsPrtcolVrsn",
    "dataSetId",
    "cmpntTp",
    "dlgtnScpId",
    "dlgtnScpDef",
    "dlgtnProof",
    "prtctdDlgtnProof",
    "trggr",
    "addtlPrc",
    "reTry",
    "tmCond",
    "tmChllng",
    "keyNcphrmntCert",
    "errActn",
    "addtlInf",
    "msgItm",
    "dvcReq"
})
public class TMSAction11 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction5Code tp;
    @XmlElement(name = "RmotAccs")
    protected NetworkParameters7 rmotAccs;
    @XmlElement(name = "Key")
    protected List<KEKIdentifier5> key;
    @XmlElement(name = "TermnlMgrId")
    protected GenericIdentification176 termnlMgrId;
    @XmlElement(name = "TMSPrtcol")
    protected String tmsPrtcol;
    @XmlElement(name = "TMSPrtcolVrsn")
    protected String tmsPrtcolVrsn;
    @XmlElement(name = "DataSetId")
    protected DataSetIdentification10 dataSetId;
    @XmlElement(name = "CmpntTp")
    @XmlSchemaType(name = "string")
    protected List<DataSetCategory18Code> cmpntTp;
    @XmlElement(name = "DlgtnScpId")
    protected String dlgtnScpId;
    @XmlElement(name = "DlgtnScpDef")
    protected byte[] dlgtnScpDef;
    @XmlElement(name = "DlgtnProof")
    protected byte[] dlgtnProof;
    @XmlElement(name = "PrtctdDlgtnProof")
    protected ContentInformationType34 prtctdDlgtnProof;
    @XmlElement(name = "Trggr", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementActionTrigger1Code trggr;
    @XmlElement(name = "AddtlPrc")
    @XmlSchemaType(name = "string")
    protected List<TerminalManagementAdditionalProcess1Code> addtlPrc;
    @XmlElement(name = "ReTry")
    protected ProcessRetry3 reTry;
    @XmlElement(name = "TmCond")
    protected ProcessTiming5 tmCond;
    @XmlElement(name = "TMChllng")
    protected byte[] tmChllng;
    @XmlElement(name = "KeyNcphrmntCert")
    protected List<byte[]> keyNcphrmntCert;
    @XmlElement(name = "ErrActn")
    protected List<ErrorAction5> errActn;
    @XmlElement(name = "AddtlInf")
    protected List<byte[]> addtlInf;
    @XmlElement(name = "MsgItm")
    protected List<MessageItemCondition2> msgItm;
    @XmlElement(name = "DvcReq")
    protected DeviceRequest6 dvcReq;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAction5Code }
     *     
     */
    public TerminalManagementAction5Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAction5Code }
     *     
     */
    public void setTp(TerminalManagementAction5Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the rmotAccs property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkParameters7 }
     *     
     */
    public NetworkParameters7 getRmotAccs() {
        return rmotAccs;
    }

    /**
     * Sets the value of the rmotAccs property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters7 }
     *     
     */
    public void setRmotAccs(NetworkParameters7 value) {
        this.rmotAccs = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KEKIdentifier5 }
     * 
     * 
     * @return
     *     The value of the key property.
     */
    public List<KEKIdentifier5> getKey() {
        if (key == null) {
            key = new ArrayList<>();
        }
        return this.key;
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
     * Gets the value of the tmsPrtcol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMSPrtcol() {
        return tmsPrtcol;
    }

    /**
     * Sets the value of the tmsPrtcol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMSPrtcol(String value) {
        this.tmsPrtcol = value;
    }

    /**
     * Gets the value of the tmsPrtcolVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMSPrtcolVrsn() {
        return tmsPrtcolVrsn;
    }

    /**
     * Sets the value of the tmsPrtcolVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMSPrtcolVrsn(String value) {
        this.tmsPrtcolVrsn = value;
    }

    /**
     * Gets the value of the dataSetId property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentification10 }
     *     
     */
    public DataSetIdentification10 getDataSetId() {
        return dataSetId;
    }

    /**
     * Sets the value of the dataSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentification10 }
     *     
     */
    public void setDataSetId(DataSetIdentification10 value) {
        this.dataSetId = value;
    }

    /**
     * Gets the value of the cmpntTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmpntTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmpntTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSetCategory18Code }
     * 
     * 
     * @return
     *     The value of the cmpntTp property.
     */
    public List<DataSetCategory18Code> getCmpntTp() {
        if (cmpntTp == null) {
            cmpntTp = new ArrayList<>();
        }
        return this.cmpntTp;
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
     * Gets the value of the trggr property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementActionTrigger1Code }
     *     
     */
    public TerminalManagementActionTrigger1Code getTrggr() {
        return trggr;
    }

    /**
     * Sets the value of the trggr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementActionTrigger1Code }
     *     
     */
    public void setTrggr(TerminalManagementActionTrigger1Code value) {
        this.trggr = value;
    }

    /**
     * Gets the value of the addtlPrc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlPrc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlPrc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminalManagementAdditionalProcess1Code }
     * 
     * 
     * @return
     *     The value of the addtlPrc property.
     */
    public List<TerminalManagementAdditionalProcess1Code> getAddtlPrc() {
        if (addtlPrc == null) {
            addtlPrc = new ArrayList<>();
        }
        return this.addtlPrc;
    }

    /**
     * Gets the value of the reTry property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessRetry3 }
     *     
     */
    public ProcessRetry3 getReTry() {
        return reTry;
    }

    /**
     * Sets the value of the reTry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessRetry3 }
     *     
     */
    public void setReTry(ProcessRetry3 value) {
        this.reTry = value;
    }

    /**
     * Gets the value of the tmCond property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessTiming5 }
     *     
     */
    public ProcessTiming5 getTmCond() {
        return tmCond;
    }

    /**
     * Sets the value of the tmCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessTiming5 }
     *     
     */
    public void setTmCond(ProcessTiming5 value) {
        this.tmCond = value;
    }

    /**
     * Gets the value of the tmChllng property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTMChllng() {
        return tmChllng;
    }

    /**
     * Sets the value of the tmChllng property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTMChllng(byte[] value) {
        this.tmChllng = value;
    }

    /**
     * Gets the value of the keyNcphrmntCert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keyNcphrmntCert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyNcphrmntCert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     * @return
     *     The value of the keyNcphrmntCert property.
     */
    public List<byte[]> getKeyNcphrmntCert() {
        if (keyNcphrmntCert == null) {
            keyNcphrmntCert = new ArrayList<>();
        }
        return this.keyNcphrmntCert;
    }

    /**
     * Gets the value of the errActn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the errActn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorAction5 }
     * 
     * 
     * @return
     *     The value of the errActn property.
     */
    public List<ErrorAction5> getErrActn() {
        if (errActn == null) {
            errActn = new ArrayList<>();
        }
        return this.errActn;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<byte[]> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
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
     * Gets the value of the dvcReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceRequest6 }
     *     
     */
    public DeviceRequest6 getDvcReq() {
        return dvcReq;
    }

    /**
     * Sets the value of the dvcReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceRequest6 }
     *     
     */
    public void setDvcReq(DeviceRequest6 value) {
        this.dvcReq = value;
    }

}
