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

package org.jpos.iso20022.semt_004_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustodyStatementOfHoldingsCancellationV02 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CustodyStatementOfHoldingsCancellationV02">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:swift:xsd:semt.004.001.02}MessageIdentification1"/>
 *         <element name="PrvsRef" type="{urn:swift:xsd:semt.004.001.02}AdditionalReference2" minOccurs="0"/>
 *         <element name="RltdRef" type="{urn:swift:xsd:semt.004.001.02}AdditionalReference2" minOccurs="0"/>
 *         <element name="MsgPgntn" type="{urn:swift:xsd:semt.004.001.02}Pagination"/>
 *         <element name="StmtToBeCanc" type="{urn:swift:xsd:semt.004.001.02}CustodyStatementOfHoldings2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustodyStatementOfHoldingsCancellationV02", propOrder = {
    "msgId",
    "prvsRef",
    "rltdRef",
    "msgPgntn",
    "stmtToBeCanc"
})
public class CustodyStatementOfHoldingsCancellationV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference2 prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference2 rltdRef;
    @XmlElement(name = "MsgPgntn", required = true)
    protected Pagination msgPgntn;
    @XmlElement(name = "StmtToBeCanc")
    protected CustodyStatementOfHoldings2 stmtToBeCanc;

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
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference2 }
     *     
     */
    public AdditionalReference2 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference2 }
     *     
     */
    public void setPrvsRef(AdditionalReference2 value) {
        this.prvsRef = value;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference2 }
     *     
     */
    public AdditionalReference2 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference2 }
     *     
     */
    public void setRltdRef(AdditionalReference2 value) {
        this.rltdRef = value;
    }

    /**
     * Gets the value of the msgPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getMsgPgntn() {
        return msgPgntn;
    }

    /**
     * Sets the value of the msgPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public void setMsgPgntn(Pagination value) {
        this.msgPgntn = value;
    }

    /**
     * Gets the value of the stmtToBeCanc property.
     * 
     * @return
     *     possible object is
     *     {@link CustodyStatementOfHoldings2 }
     *     
     */
    public CustodyStatementOfHoldings2 getStmtToBeCanc() {
        return stmtToBeCanc;
    }

    /**
     * Sets the value of the stmtToBeCanc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustodyStatementOfHoldings2 }
     *     
     */
    public void setStmtToBeCanc(CustodyStatementOfHoldings2 value) {
        this.stmtToBeCanc = value;
    }

}
