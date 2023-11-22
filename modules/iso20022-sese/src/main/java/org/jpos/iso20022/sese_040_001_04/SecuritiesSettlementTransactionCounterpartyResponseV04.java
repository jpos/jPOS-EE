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

package org.jpos.iso20022.sese_040_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesSettlementTransactionCounterpartyResponseV04 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesSettlementTransactionCounterpartyResponseV04">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.040.001.04}TransactionIdentification6"/>
 *         <element name="RspnSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.040.001.04}ResponseStatus6Choice"/>
 *         <element name="TxDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.040.001.04}TransactionDetails149" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:sese.040.001.04}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementTransactionCounterpartyResponseV04", propOrder = {
    "txId",
    "rspnSts",
    "txDtls",
    "splmtryData"
})
public class SecuritiesSettlementTransactionCounterpartyResponseV04 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification6 txId;
    @XmlElement(name = "RspnSts", required = true)
    protected ResponseStatus6Choice rspnSts;
    @XmlElement(name = "TxDtls")
    protected TransactionDetails149 txDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentification6 }
     *     
     */
    public TransactionIdentification6 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification6 }
     *     
     */
    public void setTxId(TransactionIdentification6 value) {
        this.txId = value;
    }

    /**
     * Gets the value of the rspnSts property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatus6Choice }
     *     
     */
    public ResponseStatus6Choice getRspnSts() {
        return rspnSts;
    }

    /**
     * Sets the value of the rspnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatus6Choice }
     *     
     */
    public void setRspnSts(ResponseStatus6Choice value) {
        this.rspnSts = value;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDetails149 }
     *     
     */
    public TransactionDetails149 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetails149 }
     *     
     */
    public void setTxDtls(TransactionDetails149 value) {
        this.txDtls = value;
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
