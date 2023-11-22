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

package org.jpos.iso20022.auth_106_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbnormalValuesData4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AbnormalValuesData4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrPtyId" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}CounterpartyData92"/>
 *         <element name="NbOfDerivsRptd" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}Number"/>
 *         <element name="NbOfDerivsRptdWthOtlrs" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}Number"/>
 *         <element name="TxDtls" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}AbnormalValuesTransactionData2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbnormalValuesData4", propOrder = {
    "ctrPtyId",
    "nbOfDerivsRptd",
    "nbOfDerivsRptdWthOtlrs",
    "txDtls"
})
public class AbnormalValuesData4 {

    @XmlElement(name = "CtrPtyId", required = true)
    protected CounterpartyData92 ctrPtyId;
    @XmlElement(name = "NbOfDerivsRptd", required = true)
    protected BigDecimal nbOfDerivsRptd;
    @XmlElement(name = "NbOfDerivsRptdWthOtlrs", required = true)
    protected BigDecimal nbOfDerivsRptdWthOtlrs;
    @XmlElement(name = "TxDtls")
    protected List<AbnormalValuesTransactionData2> txDtls;

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyData92 }
     *     
     */
    public CounterpartyData92 getCtrPtyId() {
        return ctrPtyId;
    }

    /**
     * Sets the value of the ctrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyData92 }
     *     
     */
    public void setCtrPtyId(CounterpartyData92 value) {
        this.ctrPtyId = value;
    }

    /**
     * Gets the value of the nbOfDerivsRptd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDerivsRptd() {
        return nbOfDerivsRptd;
    }

    /**
     * Sets the value of the nbOfDerivsRptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfDerivsRptd(BigDecimal value) {
        this.nbOfDerivsRptd = value;
    }

    /**
     * Gets the value of the nbOfDerivsRptdWthOtlrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDerivsRptdWthOtlrs() {
        return nbOfDerivsRptdWthOtlrs;
    }

    /**
     * Sets the value of the nbOfDerivsRptdWthOtlrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfDerivsRptdWthOtlrs(BigDecimal value) {
        this.nbOfDerivsRptdWthOtlrs = value;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbnormalValuesTransactionData2 }
     * 
     * 
     * @return
     *     The value of the txDtls property.
     */
    public List<AbnormalValuesTransactionData2> getTxDtls() {
        if (txDtls == null) {
            txDtls = new ArrayList<>();
        }
        return this.txDtls;
    }

}
