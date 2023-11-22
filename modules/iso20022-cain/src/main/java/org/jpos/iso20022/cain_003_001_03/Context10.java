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

package org.jpos.iso20022.cain_003_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Context10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Context10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PtOfSvcCntxt" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}PointOfServiceContext3"/>
 *         <element name="TxCntxt" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TransactionContext7"/>
 *         <element name="Vrfctn" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Verification5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RskCntxt" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}RiskContext2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SaleCntxt" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}SaleContext8" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Context10", propOrder = {
    "ptOfSvcCntxt",
    "txCntxt",
    "vrfctn",
    "rskCntxt",
    "saleCntxt"
})
public class Context10 {

    @XmlElement(name = "PtOfSvcCntxt", required = true)
    protected PointOfServiceContext3 ptOfSvcCntxt;
    @XmlElement(name = "TxCntxt", required = true)
    protected TransactionContext7 txCntxt;
    @XmlElement(name = "Vrfctn")
    protected List<Verification5> vrfctn;
    @XmlElement(name = "RskCntxt")
    protected List<RiskContext2> rskCntxt;
    @XmlElement(name = "SaleCntxt")
    protected SaleContext8 saleCntxt;

    /**
     * Gets the value of the ptOfSvcCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfServiceContext3 }
     *     
     */
    public PointOfServiceContext3 getPtOfSvcCntxt() {
        return ptOfSvcCntxt;
    }

    /**
     * Sets the value of the ptOfSvcCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfServiceContext3 }
     *     
     */
    public void setPtOfSvcCntxt(PointOfServiceContext3 value) {
        this.ptOfSvcCntxt = value;
    }

    /**
     * Gets the value of the txCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionContext7 }
     *     
     */
    public TransactionContext7 getTxCntxt() {
        return txCntxt;
    }

    /**
     * Sets the value of the txCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionContext7 }
     *     
     */
    public void setTxCntxt(TransactionContext7 value) {
        this.txCntxt = value;
    }

    /**
     * Gets the value of the vrfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the vrfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVrfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Verification5 }
     * 
     * 
     * @return
     *     The value of the vrfctn property.
     */
    public List<Verification5> getVrfctn() {
        if (vrfctn == null) {
            vrfctn = new ArrayList<>();
        }
        return this.vrfctn;
    }

    /**
     * Gets the value of the rskCntxt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rskCntxt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRskCntxt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskContext2 }
     * 
     * 
     * @return
     *     The value of the rskCntxt property.
     */
    public List<RiskContext2> getRskCntxt() {
        if (rskCntxt == null) {
            rskCntxt = new ArrayList<>();
        }
        return this.rskCntxt;
    }

    /**
     * Gets the value of the saleCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link SaleContext8 }
     *     
     */
    public SaleContext8 getSaleCntxt() {
        return saleCntxt;
    }

    /**
     * Sets the value of the saleCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleContext8 }
     *     
     */
    public void setSaleCntxt(SaleContext8 value) {
        this.saleCntxt = value;
    }

}
