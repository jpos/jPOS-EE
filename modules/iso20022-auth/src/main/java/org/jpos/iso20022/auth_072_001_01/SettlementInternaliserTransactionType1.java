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

package org.jpos.iso20022.auth_072_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementInternaliserTransactionType1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementInternaliserTransactionType1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctiesBuyOrSell" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationData1"/>
 *         <element name="CollMgmtOpr" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationData1"/>
 *         <element name="SctiesLndgOrBrrwg" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationData1"/>
 *         <element name="RpAgrmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationData1"/>
 *         <element name="OthrTxs" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationData1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInternaliserTransactionType1", propOrder = {
    "sctiesBuyOrSell",
    "collMgmtOpr",
    "sctiesLndgOrBrrwg",
    "rpAgrmt",
    "othrTxs"
})
public class SettlementInternaliserTransactionType1 {

    @XmlElement(name = "SctiesBuyOrSell", required = true)
    protected InternalisationData1 sctiesBuyOrSell;
    @XmlElement(name = "CollMgmtOpr", required = true)
    protected InternalisationData1 collMgmtOpr;
    @XmlElement(name = "SctiesLndgOrBrrwg", required = true)
    protected InternalisationData1 sctiesLndgOrBrrwg;
    @XmlElement(name = "RpAgrmt", required = true)
    protected InternalisationData1 rpAgrmt;
    @XmlElement(name = "OthrTxs", required = true)
    protected InternalisationData1 othrTxs;

    /**
     * Gets the value of the sctiesBuyOrSell property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getSctiesBuyOrSell() {
        return sctiesBuyOrSell;
    }

    /**
     * Sets the value of the sctiesBuyOrSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public void setSctiesBuyOrSell(InternalisationData1 value) {
        this.sctiesBuyOrSell = value;
    }

    /**
     * Gets the value of the collMgmtOpr property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getCollMgmtOpr() {
        return collMgmtOpr;
    }

    /**
     * Sets the value of the collMgmtOpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public void setCollMgmtOpr(InternalisationData1 value) {
        this.collMgmtOpr = value;
    }

    /**
     * Gets the value of the sctiesLndgOrBrrwg property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getSctiesLndgOrBrrwg() {
        return sctiesLndgOrBrrwg;
    }

    /**
     * Sets the value of the sctiesLndgOrBrrwg property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public void setSctiesLndgOrBrrwg(InternalisationData1 value) {
        this.sctiesLndgOrBrrwg = value;
    }

    /**
     * Gets the value of the rpAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getRpAgrmt() {
        return rpAgrmt;
    }

    /**
     * Sets the value of the rpAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public void setRpAgrmt(InternalisationData1 value) {
        this.rpAgrmt = value;
    }

    /**
     * Gets the value of the othrTxs property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getOthrTxs() {
        return othrTxs;
    }

    /**
     * Sets the value of the othrTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public void setOthrTxs(InternalisationData1 value) {
        this.othrTxs = value;
    }

}
