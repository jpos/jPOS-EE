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

package org.jpos.iso20022.colr_004_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarginCallResponseV05 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MarginCallResponseV05">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}Max35Text"/>
 *         <element name="Oblgtn" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}Obligation9"/>
 *         <element name="Agrmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}Agreement4" minOccurs="0"/>
 *         <element name="MrgnDtlsDueToA" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}MarginCall1" minOccurs="0"/>
 *         <element name="MrgnDtlsDueToB" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}MarginCall1" minOccurs="0"/>
 *         <element name="AgrdAmtDueToA" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}AgreedAmount1Choice" minOccurs="0"/>
 *         <element name="AgrdAmtDueToB" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}AgreedAmount1Choice" minOccurs="0"/>
 *         <element name="RspnDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}Response1" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginCallResponseV05", propOrder = {
    "txId",
    "oblgtn",
    "agrmt",
    "mrgnDtlsDueToA",
    "mrgnDtlsDueToB",
    "agrdAmtDueToA",
    "agrdAmtDueToB",
    "rspnDtls",
    "splmtryData"
})
public class MarginCallResponseV05 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "Oblgtn", required = true)
    protected Obligation9 oblgtn;
    @XmlElement(name = "Agrmt")
    protected Agreement4 agrmt;
    @XmlElement(name = "MrgnDtlsDueToA")
    protected MarginCall1 mrgnDtlsDueToA;
    @XmlElement(name = "MrgnDtlsDueToB")
    protected MarginCall1 mrgnDtlsDueToB;
    @XmlElement(name = "AgrdAmtDueToA")
    protected AgreedAmount1Choice agrdAmtDueToA;
    @XmlElement(name = "AgrdAmtDueToB")
    protected AgreedAmount1Choice agrdAmtDueToB;
    @XmlElement(name = "RspnDtls")
    protected Response1 rspnDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

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
     * Gets the value of the oblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link Obligation9 }
     *     
     */
    public Obligation9 getOblgtn() {
        return oblgtn;
    }

    /**
     * Sets the value of the oblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Obligation9 }
     *     
     */
    public void setOblgtn(Obligation9 value) {
        this.oblgtn = value;
    }

    /**
     * Gets the value of the agrmt property.
     * 
     * @return
     *     possible object is
     *     {@link Agreement4 }
     *     
     */
    public Agreement4 getAgrmt() {
        return agrmt;
    }

    /**
     * Sets the value of the agrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agreement4 }
     *     
     */
    public void setAgrmt(Agreement4 value) {
        this.agrmt = value;
    }

    /**
     * Gets the value of the mrgnDtlsDueToA property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCall1 }
     *     
     */
    public MarginCall1 getMrgnDtlsDueToA() {
        return mrgnDtlsDueToA;
    }

    /**
     * Sets the value of the mrgnDtlsDueToA property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCall1 }
     *     
     */
    public void setMrgnDtlsDueToA(MarginCall1 value) {
        this.mrgnDtlsDueToA = value;
    }

    /**
     * Gets the value of the mrgnDtlsDueToB property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCall1 }
     *     
     */
    public MarginCall1 getMrgnDtlsDueToB() {
        return mrgnDtlsDueToB;
    }

    /**
     * Sets the value of the mrgnDtlsDueToB property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCall1 }
     *     
     */
    public void setMrgnDtlsDueToB(MarginCall1 value) {
        this.mrgnDtlsDueToB = value;
    }

    /**
     * Gets the value of the agrdAmtDueToA property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedAmount1Choice }
     *     
     */
    public AgreedAmount1Choice getAgrdAmtDueToA() {
        return agrdAmtDueToA;
    }

    /**
     * Sets the value of the agrdAmtDueToA property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedAmount1Choice }
     *     
     */
    public void setAgrdAmtDueToA(AgreedAmount1Choice value) {
        this.agrdAmtDueToA = value;
    }

    /**
     * Gets the value of the agrdAmtDueToB property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedAmount1Choice }
     *     
     */
    public AgreedAmount1Choice getAgrdAmtDueToB() {
        return agrdAmtDueToB;
    }

    /**
     * Sets the value of the agrdAmtDueToB property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedAmount1Choice }
     *     
     */
    public void setAgrdAmtDueToB(AgreedAmount1Choice value) {
        this.agrdAmtDueToB = value;
    }

    /**
     * Gets the value of the rspnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Response1 }
     *     
     */
    public Response1 getRspnDtls() {
        return rspnDtls;
    }

    /**
     * Sets the value of the rspnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response1 }
     *     
     */
    public void setRspnDtls(Response1 value) {
        this.rspnDtls = value;
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
