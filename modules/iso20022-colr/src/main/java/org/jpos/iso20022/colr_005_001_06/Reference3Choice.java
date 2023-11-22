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

package org.jpos.iso20022.colr_005_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reference3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Reference3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ClntCollInstrId" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}Max35Text"/>
 *         <element name="ClntCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}Max35Text"/>
 *         <element name="CollPrpslId" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}Max35Text"/>
 *         <element name="CollPrpslRspnId" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}Max35Text"/>
 *         <element name="CollSbstitnConfId" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}Max35Text"/>
 *         <element name="CollSbstitnReqId" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}Max35Text"/>
 *         <element name="CollSbstitnRspnId" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}Max35Text"/>
 *         <element name="CmonTxId" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}Max52Text"/>
 *         <element name="DsptNtfctnId" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}Max35Text"/>
 *         <element name="IntrstPmtReqId" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}Max35Text"/>
 *         <element name="IntrstPmtRspnId" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}Max35Text"/>
 *         <element name="IntrstPmtStmtId" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}Max35Text"/>
 *         <element name="MrgnCallReqId" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}Max35Text"/>
 *         <element name="MrgnCallRspnId" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}Max35Text"/>
 *         <element name="TrptyAgtSvcPrvdrCollInstrId" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}Max35Text"/>
 *         <element name="TrptyAgtSvcPrvdrCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}Max35Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference3Choice", propOrder = {
    "clntCollInstrId",
    "clntCollTxId",
    "collPrpslId",
    "collPrpslRspnId",
    "collSbstitnConfId",
    "collSbstitnReqId",
    "collSbstitnRspnId",
    "cmonTxId",
    "dsptNtfctnId",
    "intrstPmtReqId",
    "intrstPmtRspnId",
    "intrstPmtStmtId",
    "mrgnCallReqId",
    "mrgnCallRspnId",
    "trptyAgtSvcPrvdrCollInstrId",
    "trptyAgtSvcPrvdrCollTxId"
})
public class Reference3Choice {

    @XmlElement(name = "ClntCollInstrId")
    protected String clntCollInstrId;
    @XmlElement(name = "ClntCollTxId")
    protected String clntCollTxId;
    @XmlElement(name = "CollPrpslId")
    protected String collPrpslId;
    @XmlElement(name = "CollPrpslRspnId")
    protected String collPrpslRspnId;
    @XmlElement(name = "CollSbstitnConfId")
    protected String collSbstitnConfId;
    @XmlElement(name = "CollSbstitnReqId")
    protected String collSbstitnReqId;
    @XmlElement(name = "CollSbstitnRspnId")
    protected String collSbstitnRspnId;
    @XmlElement(name = "CmonTxId")
    protected String cmonTxId;
    @XmlElement(name = "DsptNtfctnId")
    protected String dsptNtfctnId;
    @XmlElement(name = "IntrstPmtReqId")
    protected String intrstPmtReqId;
    @XmlElement(name = "IntrstPmtRspnId")
    protected String intrstPmtRspnId;
    @XmlElement(name = "IntrstPmtStmtId")
    protected String intrstPmtStmtId;
    @XmlElement(name = "MrgnCallReqId")
    protected String mrgnCallReqId;
    @XmlElement(name = "MrgnCallRspnId")
    protected String mrgnCallRspnId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCollInstrId")
    protected String trptyAgtSvcPrvdrCollInstrId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCollTxId")
    protected String trptyAgtSvcPrvdrCollTxId;

    /**
     * Gets the value of the clntCollInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntCollInstrId() {
        return clntCollInstrId;
    }

    /**
     * Sets the value of the clntCollInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntCollInstrId(String value) {
        this.clntCollInstrId = value;
    }

    /**
     * Gets the value of the clntCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntCollTxId() {
        return clntCollTxId;
    }

    /**
     * Sets the value of the clntCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntCollTxId(String value) {
        this.clntCollTxId = value;
    }

    /**
     * Gets the value of the collPrpslId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollPrpslId() {
        return collPrpslId;
    }

    /**
     * Sets the value of the collPrpslId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollPrpslId(String value) {
        this.collPrpslId = value;
    }

    /**
     * Gets the value of the collPrpslRspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollPrpslRspnId() {
        return collPrpslRspnId;
    }

    /**
     * Sets the value of the collPrpslRspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollPrpslRspnId(String value) {
        this.collPrpslRspnId = value;
    }

    /**
     * Gets the value of the collSbstitnConfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollSbstitnConfId() {
        return collSbstitnConfId;
    }

    /**
     * Sets the value of the collSbstitnConfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollSbstitnConfId(String value) {
        this.collSbstitnConfId = value;
    }

    /**
     * Gets the value of the collSbstitnReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollSbstitnReqId() {
        return collSbstitnReqId;
    }

    /**
     * Sets the value of the collSbstitnReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollSbstitnReqId(String value) {
        this.collSbstitnReqId = value;
    }

    /**
     * Gets the value of the collSbstitnRspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollSbstitnRspnId() {
        return collSbstitnRspnId;
    }

    /**
     * Sets the value of the collSbstitnRspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollSbstitnRspnId(String value) {
        this.collSbstitnRspnId = value;
    }

    /**
     * Gets the value of the cmonTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonTxId() {
        return cmonTxId;
    }

    /**
     * Sets the value of the cmonTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmonTxId(String value) {
        this.cmonTxId = value;
    }

    /**
     * Gets the value of the dsptNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsptNtfctnId() {
        return dsptNtfctnId;
    }

    /**
     * Sets the value of the dsptNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsptNtfctnId(String value) {
        this.dsptNtfctnId = value;
    }

    /**
     * Gets the value of the intrstPmtReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrstPmtReqId() {
        return intrstPmtReqId;
    }

    /**
     * Sets the value of the intrstPmtReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrstPmtReqId(String value) {
        this.intrstPmtReqId = value;
    }

    /**
     * Gets the value of the intrstPmtRspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrstPmtRspnId() {
        return intrstPmtRspnId;
    }

    /**
     * Sets the value of the intrstPmtRspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrstPmtRspnId(String value) {
        this.intrstPmtRspnId = value;
    }

    /**
     * Gets the value of the intrstPmtStmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrstPmtStmtId() {
        return intrstPmtStmtId;
    }

    /**
     * Sets the value of the intrstPmtStmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrstPmtStmtId(String value) {
        this.intrstPmtStmtId = value;
    }

    /**
     * Gets the value of the mrgnCallReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrgnCallReqId() {
        return mrgnCallReqId;
    }

    /**
     * Sets the value of the mrgnCallReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrgnCallReqId(String value) {
        this.mrgnCallReqId = value;
    }

    /**
     * Gets the value of the mrgnCallRspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrgnCallRspnId() {
        return mrgnCallRspnId;
    }

    /**
     * Sets the value of the mrgnCallRspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrgnCallRspnId(String value) {
        this.mrgnCallRspnId = value;
    }

    /**
     * Gets the value of the trptyAgtSvcPrvdrCollInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtSvcPrvdrCollInstrId() {
        return trptyAgtSvcPrvdrCollInstrId;
    }

    /**
     * Sets the value of the trptyAgtSvcPrvdrCollInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrptyAgtSvcPrvdrCollInstrId(String value) {
        this.trptyAgtSvcPrvdrCollInstrId = value;
    }

    /**
     * Gets the value of the trptyAgtSvcPrvdrCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtSvcPrvdrCollTxId() {
        return trptyAgtSvcPrvdrCollTxId;
    }

    /**
     * Sets the value of the trptyAgtSvcPrvdrCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrptyAgtSvcPrvdrCollTxId(String value) {
        this.trptyAgtSvcPrvdrCollTxId = value;
    }

}
