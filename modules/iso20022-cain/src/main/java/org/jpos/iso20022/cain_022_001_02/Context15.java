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

package org.jpos.iso20022.cain_022_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Context15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Context15">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PtOfSvcCntxt" type="{urn:iso:std:iso:20022:tech:xsd:cain.022.001.02}PointOfServiceContext5" minOccurs="0"/>
 *         <element name="TxCntxt" type="{urn:iso:std:iso:20022:tech:xsd:cain.022.001.02}TransactionContext8"/>
 *         <element name="SaleCntxt" type="{urn:iso:std:iso:20022:tech:xsd:cain.022.001.02}SaleContext8" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Context15", propOrder = {
    "ptOfSvcCntxt",
    "txCntxt",
    "saleCntxt"
})
public class Context15 {

    @XmlElement(name = "PtOfSvcCntxt")
    protected PointOfServiceContext5 ptOfSvcCntxt;
    @XmlElement(name = "TxCntxt", required = true)
    protected TransactionContext8 txCntxt;
    @XmlElement(name = "SaleCntxt")
    protected SaleContext8 saleCntxt;

    /**
     * Gets the value of the ptOfSvcCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfServiceContext5 }
     *     
     */
    public PointOfServiceContext5 getPtOfSvcCntxt() {
        return ptOfSvcCntxt;
    }

    /**
     * Sets the value of the ptOfSvcCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfServiceContext5 }
     *     
     */
    public void setPtOfSvcCntxt(PointOfServiceContext5 value) {
        this.ptOfSvcCntxt = value;
    }

    /**
     * Gets the value of the txCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionContext8 }
     *     
     */
    public TransactionContext8 getTxCntxt() {
        return txCntxt;
    }

    /**
     * Sets the value of the txCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionContext8 }
     *     
     */
    public void setTxCntxt(TransactionContext8 value) {
        this.txCntxt = value;
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
