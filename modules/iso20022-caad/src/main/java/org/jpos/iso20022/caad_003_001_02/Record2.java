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

package org.jpos.iso20022.caad_003_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Record2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Record2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SeqCntr" type="{urn:iso:std:iso:20022:tech:xsd:caad.003.001.02}Number"/>
 *         <element name="RcrdChcksmInptVal" type="{urn:iso:std:iso:20022:tech:xsd:caad.003.001.02}Max140Binary" minOccurs="0"/>
 *         <element name="ClrRcrdData" type="{urn:iso:std:iso:20022:tech:xsd:caad.003.001.02}ClearingRecordData2" minOccurs="0"/>
 *         <element name="RcrdMsg" type="{urn:iso:std:iso:20022:tech:xsd:caad.003.001.02}RecordMessage1Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Record2", propOrder = {
    "seqCntr",
    "rcrdChcksmInptVal",
    "clrRcrdData",
    "rcrdMsg"
})
public class Record2 {

    @XmlElement(name = "SeqCntr", required = true)
    protected BigDecimal seqCntr;
    @XmlElement(name = "RcrdChcksmInptVal")
    protected byte[] rcrdChcksmInptVal;
    @XmlElement(name = "ClrRcrdData")
    protected ClearingRecordData2 clrRcrdData;
    @XmlElement(name = "RcrdMsg", required = true)
    protected RecordMessage1Choice rcrdMsg;

    /**
     * Gets the value of the seqCntr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqCntr() {
        return seqCntr;
    }

    /**
     * Sets the value of the seqCntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeqCntr(BigDecimal value) {
        this.seqCntr = value;
    }

    /**
     * Gets the value of the rcrdChcksmInptVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRcrdChcksmInptVal() {
        return rcrdChcksmInptVal;
    }

    /**
     * Sets the value of the rcrdChcksmInptVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRcrdChcksmInptVal(byte[] value) {
        this.rcrdChcksmInptVal = value;
    }

    /**
     * Gets the value of the clrRcrdData property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingRecordData2 }
     *     
     */
    public ClearingRecordData2 getClrRcrdData() {
        return clrRcrdData;
    }

    /**
     * Sets the value of the clrRcrdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingRecordData2 }
     *     
     */
    public void setClrRcrdData(ClearingRecordData2 value) {
        this.clrRcrdData = value;
    }

    /**
     * Gets the value of the rcrdMsg property.
     * 
     * @return
     *     possible object is
     *     {@link RecordMessage1Choice }
     *     
     */
    public RecordMessage1Choice getRcrdMsg() {
        return rcrdMsg;
    }

    /**
     * Sets the value of the rcrdMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordMessage1Choice }
     *     
     */
    public void setRcrdMsg(RecordMessage1Choice value) {
        this.rcrdMsg = value;
    }

}
