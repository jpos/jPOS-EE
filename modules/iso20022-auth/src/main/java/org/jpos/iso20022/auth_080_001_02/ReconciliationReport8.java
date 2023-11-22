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

package org.jpos.iso20022.auth_080_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationReport8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReconciliationReport8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TechRcrdId" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}Max140Text" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}TradeTransactionIdentification19"/>
 *         <element name="Modfd" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}TrueFalseIndicator"/>
 *         <element name="RcncltnSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}ReconciliationStatus8Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationReport8", propOrder = {
    "techRcrdId",
    "txId",
    "modfd",
    "rcncltnSts"
})
public class ReconciliationReport8 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "TxId", required = true)
    protected TradeTransactionIdentification19 txId;
    @XmlElement(name = "Modfd")
    protected boolean modfd;
    @XmlElement(name = "RcncltnSts", required = true)
    protected ReconciliationStatus8Choice rcncltnSts;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechRcrdId(String value) {
        this.techRcrdId = value;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionIdentification19 }
     *     
     */
    public TradeTransactionIdentification19 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionIdentification19 }
     *     
     */
    public void setTxId(TradeTransactionIdentification19 value) {
        this.txId = value;
    }

    /**
     * Gets the value of the modfd property.
     * 
     */
    public boolean isModfd() {
        return modfd;
    }

    /**
     * Sets the value of the modfd property.
     * 
     */
    public void setModfd(boolean value) {
        this.modfd = value;
    }

    /**
     * Gets the value of the rcncltnSts property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationStatus8Choice }
     *     
     */
    public ReconciliationStatus8Choice getRcncltnSts() {
        return rcncltnSts;
    }

    /**
     * Sets the value of the rcncltnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationStatus8Choice }
     *     
     */
    public void setRcncltnSts(ReconciliationStatus8Choice value) {
        this.rcncltnSts = value;
    }

}
