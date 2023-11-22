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

package org.jpos.iso20022.tsmt_014_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSetSubmissionReferences3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DataSetSubmissionReferences3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Max35Text"/>
 *         <element name="PurchsOrdrRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}DocumentIdentification7"/>
 *         <element name="SubmitrTxRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Max35Text" minOccurs="0"/>
 *         <element name="ForcdMtch" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}YesNoIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSetSubmissionReferences3", propOrder = {
    "txId",
    "purchsOrdrRef",
    "submitrTxRef",
    "forcdMtch"
})
public class DataSetSubmissionReferences3 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "PurchsOrdrRef", required = true)
    protected DocumentIdentification7 purchsOrdrRef;
    @XmlElement(name = "SubmitrTxRef")
    protected String submitrTxRef;
    @XmlElement(name = "ForcdMtch")
    protected boolean forcdMtch;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
    }

    /**
     * Gets the value of the purchsOrdrRef property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public DocumentIdentification7 getPurchsOrdrRef() {
        return purchsOrdrRef;
    }

    /**
     * Sets the value of the purchsOrdrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public void setPurchsOrdrRef(DocumentIdentification7 value) {
        this.purchsOrdrRef = value;
    }

    /**
     * Gets the value of the submitrTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitrTxRef() {
        return submitrTxRef;
    }

    /**
     * Sets the value of the submitrTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitrTxRef(String value) {
        this.submitrTxRef = value;
    }

    /**
     * Gets the value of the forcdMtch property.
     * 
     */
    public boolean isForcdMtch() {
        return forcdMtch;
    }

    /**
     * Sets the value of the forcdMtch property.
     * 
     */
    public void setForcdMtch(boolean value) {
        this.forcdMtch = value;
    }

}
