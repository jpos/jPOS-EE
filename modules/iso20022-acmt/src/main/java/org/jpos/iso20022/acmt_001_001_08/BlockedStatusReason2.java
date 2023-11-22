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

package org.jpos.iso20022.acmt_001_001_08;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BlockedStatusReason2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BlockedStatusReason2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}TransactionType5Choice"/>
 *         <element name="Blckd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}YesNoIndicator"/>
 *         <element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}BlockedReason2Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max350Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockedStatusReason2", propOrder = {
    "txTp",
    "blckd",
    "rsn",
    "addtlInf"
})
public class BlockedStatusReason2 {

    @XmlElement(name = "TxTp", required = true)
    protected TransactionType5Choice txTp;
    @XmlElement(name = "Blckd")
    protected boolean blckd;
    @XmlElement(name = "Rsn")
    protected List<BlockedReason2Choice> rsn;
    @XmlElement(name = "AddtlInf", required = true)
    protected String addtlInf;

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType5Choice }
     *     
     */
    public TransactionType5Choice getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType5Choice }
     *     
     */
    public void setTxTp(TransactionType5Choice value) {
        this.txTp = value;
    }

    /**
     * Gets the value of the blckd property.
     * 
     */
    public boolean isBlckd() {
        return blckd;
    }

    /**
     * Sets the value of the blckd property.
     * 
     */
    public void setBlckd(boolean value) {
        this.blckd = value;
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
     * {@link BlockedReason2Choice }
     * 
     * 
     * @return
     *     The value of the rsn property.
     */
    public List<BlockedReason2Choice> getRsn() {
        if (rsn == null) {
            rsn = new ArrayList<>();
        }
        return this.rsn;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

}
