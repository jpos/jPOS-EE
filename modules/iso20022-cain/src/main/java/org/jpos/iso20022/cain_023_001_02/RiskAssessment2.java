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

package org.jpos.iso20022.cain_023_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskAssessment2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RiskAssessment2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RskAssmntNtty" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}PartyIdentification200" minOccurs="0"/>
 *         <element name="RskAssmntTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Max35Text" minOccurs="0"/>
 *         <element name="HghRskTx" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Rslt" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Max35Text" minOccurs="0"/>
 *         <element name="RskCond" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlRskData" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}AdditionalRiskData1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RcmmnddActn" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}ActionType8Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OthrRcmmnddActn" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Max35Text" minOccurs="0"/>
 *         <element name="RcmmnddActnDtls" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Max256Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskAssessment2", propOrder = {
    "rskAssmntNtty",
    "rskAssmntTp",
    "hghRskTx",
    "rsn",
    "rslt",
    "rskCond",
    "addtlRskData",
    "rcmmnddActn",
    "othrRcmmnddActn",
    "rcmmnddActnDtls"
})
public class RiskAssessment2 {

    @XmlElement(name = "RskAssmntNtty")
    protected PartyIdentification200 rskAssmntNtty;
    @XmlElement(name = "RskAssmntTp")
    protected String rskAssmntTp;
    @XmlElement(name = "HghRskTx")
    protected Boolean hghRskTx;
    @XmlElement(name = "Rsn")
    protected List<String> rsn;
    @XmlElement(name = "Rslt")
    protected String rslt;
    @XmlElement(name = "RskCond")
    protected List<AdditionalData1> rskCond;
    @XmlElement(name = "AddtlRskData")
    protected List<AdditionalRiskData1> addtlRskData;
    @XmlElement(name = "RcmmnddActn")
    @XmlSchemaType(name = "string")
    protected List<ActionType8Code> rcmmnddActn;
    @XmlElement(name = "OthrRcmmnddActn")
    protected String othrRcmmnddActn;
    @XmlElement(name = "RcmmnddActnDtls")
    protected String rcmmnddActnDtls;

    /**
     * Gets the value of the rskAssmntNtty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification200 }
     *     
     */
    public PartyIdentification200 getRskAssmntNtty() {
        return rskAssmntNtty;
    }

    /**
     * Sets the value of the rskAssmntNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification200 }
     *     
     */
    public void setRskAssmntNtty(PartyIdentification200 value) {
        this.rskAssmntNtty = value;
    }

    /**
     * Gets the value of the rskAssmntTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRskAssmntTp() {
        return rskAssmntTp;
    }

    /**
     * Sets the value of the rskAssmntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRskAssmntTp(String value) {
        this.rskAssmntTp = value;
    }

    /**
     * Gets the value of the hghRskTx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHghRskTx() {
        return hghRskTx;
    }

    /**
     * Sets the value of the hghRskTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHghRskTx(Boolean value) {
        this.hghRskTx = value;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the rsn property.
     */
    public List<String> getRsn() {
        if (rsn == null) {
            rsn = new ArrayList<>();
        }
        return this.rsn;
    }

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRslt(String value) {
        this.rslt = value;
    }

    /**
     * Gets the value of the rskCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rskCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRskCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the rskCond property.
     */
    public List<AdditionalData1> getRskCond() {
        if (rskCond == null) {
            rskCond = new ArrayList<>();
        }
        return this.rskCond;
    }

    /**
     * Gets the value of the addtlRskData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlRskData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlRskData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalRiskData1 }
     * 
     * 
     * @return
     *     The value of the addtlRskData property.
     */
    public List<AdditionalRiskData1> getAddtlRskData() {
        if (addtlRskData == null) {
            addtlRskData = new ArrayList<>();
        }
        return this.addtlRskData;
    }

    /**
     * Gets the value of the rcmmnddActn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rcmmnddActn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcmmnddActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionType8Code }
     * 
     * 
     * @return
     *     The value of the rcmmnddActn property.
     */
    public List<ActionType8Code> getRcmmnddActn() {
        if (rcmmnddActn == null) {
            rcmmnddActn = new ArrayList<>();
        }
        return this.rcmmnddActn;
    }

    /**
     * Gets the value of the othrRcmmnddActn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRcmmnddActn() {
        return othrRcmmnddActn;
    }

    /**
     * Sets the value of the othrRcmmnddActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrRcmmnddActn(String value) {
        this.othrRcmmnddActn = value;
    }

    /**
     * Gets the value of the rcmmnddActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcmmnddActnDtls() {
        return rcmmnddActnDtls;
    }

    /**
     * Sets the value of the rcmmnddActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcmmnddActnDtls(String value) {
        this.rcmmnddActnDtls = value;
    }

}
