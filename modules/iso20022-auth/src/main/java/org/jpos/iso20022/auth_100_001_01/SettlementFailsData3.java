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

package org.jpos.iso20022.auth_100_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementFailsData3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementFailsData3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ttl" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementTotalData1"/>
 *         <element name="PtcptInFail" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementFailsParticipantRange1" minOccurs="0"/>
 *         <element name="FlsPerCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementFailsCurrency2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FlsPerFinInstrmTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementFailsInstrument2" minOccurs="0"/>
 *         <element name="SctiesInFail" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementFailsSecuritiesRange1" minOccurs="0"/>
 *         <element name="FlsPerTxTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementFailsTransactionType2" minOccurs="0"/>
 *         <element name="TtlSttlmPnlties" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementDataVolume2" minOccurs="0"/>
 *         <element name="FailrRsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementFailureReason3"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsData3", propOrder = {
    "ttl",
    "ptcptInFail",
    "flsPerCcy",
    "flsPerFinInstrmTp",
    "sctiesInFail",
    "flsPerTxTp",
    "ttlSttlmPnlties",
    "failrRsn"
})
public class SettlementFailsData3 {

    @XmlElement(name = "Ttl", required = true)
    protected SettlementTotalData1 ttl;
    @XmlElement(name = "PtcptInFail")
    protected SettlementFailsParticipantRange1 ptcptInFail;
    @XmlElement(name = "FlsPerCcy")
    protected List<SettlementFailsCurrency2> flsPerCcy;
    @XmlElement(name = "FlsPerFinInstrmTp")
    protected SettlementFailsInstrument2 flsPerFinInstrmTp;
    @XmlElement(name = "SctiesInFail")
    protected SettlementFailsSecuritiesRange1 sctiesInFail;
    @XmlElement(name = "FlsPerTxTp")
    protected SettlementFailsTransactionType2 flsPerTxTp;
    @XmlElement(name = "TtlSttlmPnlties")
    protected SettlementDataVolume2 ttlSttlmPnlties;
    @XmlElement(name = "FailrRsn", required = true)
    protected SettlementFailureReason3 failrRsn;

    /**
     * Gets the value of the ttl property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1 }
     *     
     */
    public SettlementTotalData1 getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1 }
     *     
     */
    public void setTtl(SettlementTotalData1 value) {
        this.ttl = value;
    }

    /**
     * Gets the value of the ptcptInFail property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsParticipantRange1 }
     *     
     */
    public SettlementFailsParticipantRange1 getPtcptInFail() {
        return ptcptInFail;
    }

    /**
     * Sets the value of the ptcptInFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsParticipantRange1 }
     *     
     */
    public void setPtcptInFail(SettlementFailsParticipantRange1 value) {
        this.ptcptInFail = value;
    }

    /**
     * Gets the value of the flsPerCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the flsPerCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlsPerCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementFailsCurrency2 }
     * 
     * 
     * @return
     *     The value of the flsPerCcy property.
     */
    public List<SettlementFailsCurrency2> getFlsPerCcy() {
        if (flsPerCcy == null) {
            flsPerCcy = new ArrayList<>();
        }
        return this.flsPerCcy;
    }

    /**
     * Gets the value of the flsPerFinInstrmTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsInstrument2 }
     *     
     */
    public SettlementFailsInstrument2 getFlsPerFinInstrmTp() {
        return flsPerFinInstrmTp;
    }

    /**
     * Sets the value of the flsPerFinInstrmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsInstrument2 }
     *     
     */
    public void setFlsPerFinInstrmTp(SettlementFailsInstrument2 value) {
        this.flsPerFinInstrmTp = value;
    }

    /**
     * Gets the value of the sctiesInFail property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsSecuritiesRange1 }
     *     
     */
    public SettlementFailsSecuritiesRange1 getSctiesInFail() {
        return sctiesInFail;
    }

    /**
     * Sets the value of the sctiesInFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsSecuritiesRange1 }
     *     
     */
    public void setSctiesInFail(SettlementFailsSecuritiesRange1 value) {
        this.sctiesInFail = value;
    }

    /**
     * Gets the value of the flsPerTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsTransactionType2 }
     *     
     */
    public SettlementFailsTransactionType2 getFlsPerTxTp() {
        return flsPerTxTp;
    }

    /**
     * Sets the value of the flsPerTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsTransactionType2 }
     *     
     */
    public void setFlsPerTxTp(SettlementFailsTransactionType2 value) {
        this.flsPerTxTp = value;
    }

    /**
     * Gets the value of the ttlSttlmPnlties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDataVolume2 }
     *     
     */
    public SettlementDataVolume2 getTtlSttlmPnlties() {
        return ttlSttlmPnlties;
    }

    /**
     * Sets the value of the ttlSttlmPnlties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDataVolume2 }
     *     
     */
    public void setTtlSttlmPnlties(SettlementDataVolume2 value) {
        this.ttlSttlmPnlties = value;
    }

    /**
     * Gets the value of the failrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailureReason3 }
     *     
     */
    public SettlementFailureReason3 getFailrRsn() {
        return failrRsn;
    }

    /**
     * Sets the value of the failrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailureReason3 }
     *     
     */
    public void setFailrRsn(SettlementFailureReason3 value) {
        this.failrRsn = value;
    }

}
