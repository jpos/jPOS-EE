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

package org.jpos.iso20022.setr_044_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingStatus98Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProcessingStatus98Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AckdAccptd" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="AlrdyMtchdAndAffrmd" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="DfltActn" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="Done" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="ForcdRjctn" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="FullyExctdConfSnt" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="Futr" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="Gnrtd" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="InRpr" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}InstructionProcessingReason4Choice"/>
 *         <element name="NoInstr" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="OpnOrdr" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="PdgPrcg" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}PendingProcessing2Choice"/>
 *         <element name="RcvdAtIntrmy" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}InstructionProcessingReason3Choice"/>
 *         <element name="SttlmInstrSnt" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="StgInstr" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="TradgSspdByStockXchg" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="Trtd" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="PrtrySts" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryStatusAndReason6" minOccurs="0"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingStatus98Choice", propOrder = {
    "ackdAccptd",
    "alrdyMtchdAndAffrmd",
    "dfltActn",
    "done",
    "forcdRjctn",
    "fullyExctdConfSnt",
    "futr",
    "gnrtd",
    "inRpr",
    "noInstr",
    "opnOrdr",
    "pdgPrcg",
    "rcvdAtIntrmy",
    "rjctd",
    "sttlmInstrSnt",
    "stgInstr",
    "tradgSspdByStockXchg",
    "trtd",
    "prtrySts"
})
public class ProcessingStatus98Choice {

    @XmlElement(name = "AckdAccptd")
    protected ProprietaryReason4 ackdAccptd;
    @XmlElement(name = "AlrdyMtchdAndAffrmd")
    protected ProprietaryReason4 alrdyMtchdAndAffrmd;
    @XmlElement(name = "DfltActn")
    protected ProprietaryReason4 dfltActn;
    @XmlElement(name = "Done")
    protected ProprietaryReason4 done;
    @XmlElement(name = "ForcdRjctn")
    protected ProprietaryReason4 forcdRjctn;
    @XmlElement(name = "FullyExctdConfSnt")
    protected ProprietaryReason4 fullyExctdConfSnt;
    @XmlElement(name = "Futr")
    protected ProprietaryReason4 futr;
    @XmlElement(name = "Gnrtd")
    protected ProprietaryReason4 gnrtd;
    @XmlElement(name = "InRpr")
    protected InstructionProcessingReason4Choice inRpr;
    @XmlElement(name = "NoInstr")
    protected ProprietaryReason4 noInstr;
    @XmlElement(name = "OpnOrdr")
    protected ProprietaryReason4 opnOrdr;
    @XmlElement(name = "PdgPrcg")
    protected PendingProcessing2Choice pdgPrcg;
    @XmlElement(name = "RcvdAtIntrmy")
    protected ProprietaryReason4 rcvdAtIntrmy;
    @XmlElement(name = "Rjctd")
    protected InstructionProcessingReason3Choice rjctd;
    @XmlElement(name = "SttlmInstrSnt")
    protected ProprietaryReason4 sttlmInstrSnt;
    @XmlElement(name = "StgInstr")
    protected ProprietaryReason4 stgInstr;
    @XmlElement(name = "TradgSspdByStockXchg")
    protected ProprietaryReason4 tradgSspdByStockXchg;
    @XmlElement(name = "Trtd")
    protected ProprietaryReason4 trtd;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason6 prtrySts;

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setAckdAccptd(ProprietaryReason4 value) {
        this.ackdAccptd = value;
    }

    /**
     * Gets the value of the alrdyMtchdAndAffrmd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getAlrdyMtchdAndAffrmd() {
        return alrdyMtchdAndAffrmd;
    }

    /**
     * Sets the value of the alrdyMtchdAndAffrmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setAlrdyMtchdAndAffrmd(ProprietaryReason4 value) {
        this.alrdyMtchdAndAffrmd = value;
    }

    /**
     * Gets the value of the dfltActn property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getDfltActn() {
        return dfltActn;
    }

    /**
     * Sets the value of the dfltActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setDfltActn(ProprietaryReason4 value) {
        this.dfltActn = value;
    }

    /**
     * Gets the value of the done property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getDone() {
        return done;
    }

    /**
     * Sets the value of the done property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setDone(ProprietaryReason4 value) {
        this.done = value;
    }

    /**
     * Gets the value of the forcdRjctn property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getForcdRjctn() {
        return forcdRjctn;
    }

    /**
     * Sets the value of the forcdRjctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setForcdRjctn(ProprietaryReason4 value) {
        this.forcdRjctn = value;
    }

    /**
     * Gets the value of the fullyExctdConfSnt property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getFullyExctdConfSnt() {
        return fullyExctdConfSnt;
    }

    /**
     * Sets the value of the fullyExctdConfSnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setFullyExctdConfSnt(ProprietaryReason4 value) {
        this.fullyExctdConfSnt = value;
    }

    /**
     * Gets the value of the futr property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getFutr() {
        return futr;
    }

    /**
     * Sets the value of the futr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setFutr(ProprietaryReason4 value) {
        this.futr = value;
    }

    /**
     * Gets the value of the gnrtd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getGnrtd() {
        return gnrtd;
    }

    /**
     * Sets the value of the gnrtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setGnrtd(ProprietaryReason4 value) {
        this.gnrtd = value;
    }

    /**
     * Gets the value of the inRpr property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingReason4Choice }
     *     
     */
    public InstructionProcessingReason4Choice getInRpr() {
        return inRpr;
    }

    /**
     * Sets the value of the inRpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingReason4Choice }
     *     
     */
    public void setInRpr(InstructionProcessingReason4Choice value) {
        this.inRpr = value;
    }

    /**
     * Gets the value of the noInstr property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getNoInstr() {
        return noInstr;
    }

    /**
     * Sets the value of the noInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setNoInstr(ProprietaryReason4 value) {
        this.noInstr = value;
    }

    /**
     * Gets the value of the opnOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getOpnOrdr() {
        return opnOrdr;
    }

    /**
     * Sets the value of the opnOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setOpnOrdr(ProprietaryReason4 value) {
        this.opnOrdr = value;
    }

    /**
     * Gets the value of the pdgPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessing2Choice }
     *     
     */
    public PendingProcessing2Choice getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Sets the value of the pdgPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessing2Choice }
     *     
     */
    public void setPdgPrcg(PendingProcessing2Choice value) {
        this.pdgPrcg = value;
    }

    /**
     * Gets the value of the rcvdAtIntrmy property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getRcvdAtIntrmy() {
        return rcvdAtIntrmy;
    }

    /**
     * Sets the value of the rcvdAtIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setRcvdAtIntrmy(ProprietaryReason4 value) {
        this.rcvdAtIntrmy = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingReason3Choice }
     *     
     */
    public InstructionProcessingReason3Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingReason3Choice }
     *     
     */
    public void setRjctd(InstructionProcessingReason3Choice value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the sttlmInstrSnt property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getSttlmInstrSnt() {
        return sttlmInstrSnt;
    }

    /**
     * Sets the value of the sttlmInstrSnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setSttlmInstrSnt(ProprietaryReason4 value) {
        this.sttlmInstrSnt = value;
    }

    /**
     * Gets the value of the stgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getStgInstr() {
        return stgInstr;
    }

    /**
     * Sets the value of the stgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setStgInstr(ProprietaryReason4 value) {
        this.stgInstr = value;
    }

    /**
     * Gets the value of the tradgSspdByStockXchg property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getTradgSspdByStockXchg() {
        return tradgSspdByStockXchg;
    }

    /**
     * Sets the value of the tradgSspdByStockXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setTradgSspdByStockXchg(ProprietaryReason4 value) {
        this.tradgSspdByStockXchg = value;
    }

    /**
     * Gets the value of the trtd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getTrtd() {
        return trtd;
    }

    /**
     * Sets the value of the trtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setTrtd(ProprietaryReason4 value) {
        this.trtd = value;
    }

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public void setPrtrySts(ProprietaryStatusAndReason6 value) {
        this.prtrySts = value;
    }

}
