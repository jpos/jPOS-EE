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

package org.jpos.iso20022.reda_074_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TripartyCollateralUnilateralRemovalRequestV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TripartyCollateralUnilateralRemovalRequestV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}Pagination1"/>
 *         <element name="RmvlReqId" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}Max35Text"/>
 *         <element name="PtyA" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}PartyIdentification232"/>
 *         <element name="ClntPtyA" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}PartyIdentification232" minOccurs="0"/>
 *         <element name="CollSd" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}CollateralRole1Code"/>
 *         <element name="ReqDtls" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}RequestDetails28"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}SupplementaryData1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripartyCollateralUnilateralRemovalRequestV01", propOrder = {
    "pgntn",
    "rmvlReqId",
    "ptyA",
    "clntPtyA",
    "collSd",
    "reqDtls",
    "splmtryData"
})
public class TripartyCollateralUnilateralRemovalRequestV01 {

    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "RmvlReqId", required = true)
    protected String rmvlReqId;
    @XmlElement(name = "PtyA", required = true)
    protected PartyIdentification232 ptyA;
    @XmlElement(name = "ClntPtyA")
    protected PartyIdentification232 clntPtyA;
    @XmlElement(name = "CollSd", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralRole1Code collSd;
    @XmlElement(name = "ReqDtls", required = true)
    protected RequestDetails28 reqDtls;
    @XmlElement(name = "SplmtryData")
    protected SupplementaryData1 splmtryData;

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public void setPgntn(Pagination1 value) {
        this.pgntn = value;
    }

    /**
     * Gets the value of the rmvlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmvlReqId() {
        return rmvlReqId;
    }

    /**
     * Sets the value of the rmvlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmvlReqId(String value) {
        this.rmvlReqId = value;
    }

    /**
     * Gets the value of the ptyA property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232 }
     *     
     */
    public PartyIdentification232 getPtyA() {
        return ptyA;
    }

    /**
     * Sets the value of the ptyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232 }
     *     
     */
    public void setPtyA(PartyIdentification232 value) {
        this.ptyA = value;
    }

    /**
     * Gets the value of the clntPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232 }
     *     
     */
    public PartyIdentification232 getClntPtyA() {
        return clntPtyA;
    }

    /**
     * Sets the value of the clntPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232 }
     *     
     */
    public void setClntPtyA(PartyIdentification232 value) {
        this.clntPtyA = value;
    }

    /**
     * Gets the value of the collSd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralRole1Code }
     *     
     */
    public CollateralRole1Code getCollSd() {
        return collSd;
    }

    /**
     * Sets the value of the collSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralRole1Code }
     *     
     */
    public void setCollSd(CollateralRole1Code value) {
        this.collSd = value;
    }

    /**
     * Gets the value of the reqDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RequestDetails28 }
     *     
     */
    public RequestDetails28 getReqDtls() {
        return reqDtls;
    }

    /**
     * Sets the value of the reqDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestDetails28 }
     *     
     */
    public void setReqDtls(RequestDetails28 value) {
        this.reqDtls = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryData1 }
     *     
     */
    public SupplementaryData1 getSplmtryData() {
        return splmtryData;
    }

    /**
     * Sets the value of the splmtryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryData1 }
     *     
     */
    public void setSplmtryData(SupplementaryData1 value) {
        this.splmtryData = value;
    }

}
