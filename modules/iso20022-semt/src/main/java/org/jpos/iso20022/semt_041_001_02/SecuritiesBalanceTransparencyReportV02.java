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

package org.jpos.iso20022.semt_041_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalanceTransparencyReportV02 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesBalanceTransparencyReportV02">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}MessageIdentification1"/>
 *         <element name="SndrId" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}PartyIdentification100"/>
 *         <element name="RcvrId" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}PartyIdentification100" minOccurs="0"/>
 *         <element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}Pagination"/>
 *         <element name="StmtGnlDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}Statement59"/>
 *         <element name="SfkpgAcctAndHldgs" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}SafekeepingAccount7" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesBalanceTransparencyReportV02", propOrder = {
    "msgId",
    "sndrId",
    "rcvrId",
    "pgntn",
    "stmtGnlDtls",
    "sfkpgAcctAndHldgs",
    "splmtryData"
})
public class SecuritiesBalanceTransparencyReportV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "SndrId", required = true)
    protected PartyIdentification100 sndrId;
    @XmlElement(name = "RcvrId")
    protected PartyIdentification100 rcvrId;
    @XmlElement(name = "Pgntn", required = true)
    protected Pagination pgntn;
    @XmlElement(name = "StmtGnlDtls", required = true)
    protected Statement59 stmtGnlDtls;
    @XmlElement(name = "SfkpgAcctAndHldgs")
    protected List<SafekeepingAccount7> sfkpgAcctAndHldgs;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setMsgId(MessageIdentification1 value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the sndrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getSndrId() {
        return sndrId;
    }

    /**
     * Sets the value of the sndrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public void setSndrId(PartyIdentification100 value) {
        this.sndrId = value;
    }

    /**
     * Gets the value of the rcvrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getRcvrId() {
        return rcvrId;
    }

    /**
     * Sets the value of the rcvrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public void setRcvrId(PartyIdentification100 value) {
        this.rcvrId = value;
    }

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public void setPgntn(Pagination value) {
        this.pgntn = value;
    }

    /**
     * Gets the value of the stmtGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Statement59 }
     *     
     */
    public Statement59 getStmtGnlDtls() {
        return stmtGnlDtls;
    }

    /**
     * Sets the value of the stmtGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement59 }
     *     
     */
    public void setStmtGnlDtls(Statement59 value) {
        this.stmtGnlDtls = value;
    }

    /**
     * Gets the value of the sfkpgAcctAndHldgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sfkpgAcctAndHldgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSfkpgAcctAndHldgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SafekeepingAccount7 }
     * 
     * 
     * @return
     *     The value of the sfkpgAcctAndHldgs property.
     */
    public List<SafekeepingAccount7> getSfkpgAcctAndHldgs() {
        if (sfkpgAcctAndHldgs == null) {
            sfkpgAcctAndHldgs = new ArrayList<>();
        }
        return this.sfkpgAcctAndHldgs;
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
