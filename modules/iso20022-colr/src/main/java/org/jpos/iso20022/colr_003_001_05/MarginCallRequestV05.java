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

package org.jpos.iso20022.colr_003_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarginCallRequestV05 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MarginCallRequestV05">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}Max35Text"/>
 *         <element name="Oblgtn" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}Obligation9"/>
 *         <element name="Agrmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}Agreement4" minOccurs="0"/>
 *         <element name="MrgnCallRslt" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}MarginCallResult3"/>
 *         <element name="MrgnDtlsDueToA" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}MarginCall1" minOccurs="0"/>
 *         <element name="MrgnDtlsDueToB" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}MarginCall1" minOccurs="0"/>
 *         <element name="RqrmntDtlsDueToA" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}MarginRequirement1Choice" minOccurs="0"/>
 *         <element name="RqrmntDtlsDueToB" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}MarginRequirement1Choice" minOccurs="0"/>
 *         <element name="XpctdCollDueToA" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}ExpectedCollateral2Choice" minOccurs="0"/>
 *         <element name="XpctdCollDueToB" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}ExpectedCollateral2Choice" minOccurs="0"/>
 *         <element name="MrgnCallDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}MarginCall3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginCallRequestV05", propOrder = {
    "txId",
    "oblgtn",
    "agrmt",
    "mrgnCallRslt",
    "mrgnDtlsDueToA",
    "mrgnDtlsDueToB",
    "rqrmntDtlsDueToA",
    "rqrmntDtlsDueToB",
    "xpctdCollDueToA",
    "xpctdCollDueToB",
    "mrgnCallDtls",
    "splmtryData"
})
public class MarginCallRequestV05 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "Oblgtn", required = true)
    protected Obligation9 oblgtn;
    @XmlElement(name = "Agrmt")
    protected Agreement4 agrmt;
    @XmlElement(name = "MrgnCallRslt", required = true)
    protected MarginCallResult3 mrgnCallRslt;
    @XmlElement(name = "MrgnDtlsDueToA")
    protected MarginCall1 mrgnDtlsDueToA;
    @XmlElement(name = "MrgnDtlsDueToB")
    protected MarginCall1 mrgnDtlsDueToB;
    @XmlElement(name = "RqrmntDtlsDueToA")
    protected MarginRequirement1Choice rqrmntDtlsDueToA;
    @XmlElement(name = "RqrmntDtlsDueToB")
    protected MarginRequirement1Choice rqrmntDtlsDueToB;
    @XmlElement(name = "XpctdCollDueToA")
    protected ExpectedCollateral2Choice xpctdCollDueToA;
    @XmlElement(name = "XpctdCollDueToB")
    protected ExpectedCollateral2Choice xpctdCollDueToB;
    @XmlElement(name = "MrgnCallDtls")
    protected List<MarginCall3> mrgnCallDtls;
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
     * Gets the value of the mrgnCallRslt property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCallResult3 }
     *     
     */
    public MarginCallResult3 getMrgnCallRslt() {
        return mrgnCallRslt;
    }

    /**
     * Sets the value of the mrgnCallRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCallResult3 }
     *     
     */
    public void setMrgnCallRslt(MarginCallResult3 value) {
        this.mrgnCallRslt = value;
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
     * Gets the value of the rqrmntDtlsDueToA property.
     * 
     * @return
     *     possible object is
     *     {@link MarginRequirement1Choice }
     *     
     */
    public MarginRequirement1Choice getRqrmntDtlsDueToA() {
        return rqrmntDtlsDueToA;
    }

    /**
     * Sets the value of the rqrmntDtlsDueToA property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginRequirement1Choice }
     *     
     */
    public void setRqrmntDtlsDueToA(MarginRequirement1Choice value) {
        this.rqrmntDtlsDueToA = value;
    }

    /**
     * Gets the value of the rqrmntDtlsDueToB property.
     * 
     * @return
     *     possible object is
     *     {@link MarginRequirement1Choice }
     *     
     */
    public MarginRequirement1Choice getRqrmntDtlsDueToB() {
        return rqrmntDtlsDueToB;
    }

    /**
     * Sets the value of the rqrmntDtlsDueToB property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginRequirement1Choice }
     *     
     */
    public void setRqrmntDtlsDueToB(MarginRequirement1Choice value) {
        this.rqrmntDtlsDueToB = value;
    }

    /**
     * Gets the value of the xpctdCollDueToA property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedCollateral2Choice }
     *     
     */
    public ExpectedCollateral2Choice getXpctdCollDueToA() {
        return xpctdCollDueToA;
    }

    /**
     * Sets the value of the xpctdCollDueToA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedCollateral2Choice }
     *     
     */
    public void setXpctdCollDueToA(ExpectedCollateral2Choice value) {
        this.xpctdCollDueToA = value;
    }

    /**
     * Gets the value of the xpctdCollDueToB property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedCollateral2Choice }
     *     
     */
    public ExpectedCollateral2Choice getXpctdCollDueToB() {
        return xpctdCollDueToB;
    }

    /**
     * Sets the value of the xpctdCollDueToB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedCollateral2Choice }
     *     
     */
    public void setXpctdCollDueToB(ExpectedCollateral2Choice value) {
        this.xpctdCollDueToB = value;
    }

    /**
     * Gets the value of the mrgnCallDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mrgnCallDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrgnCallDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarginCall3 }
     * 
     * 
     * @return
     *     The value of the mrgnCallDtls property.
     */
    public List<MarginCall3> getMrgnCallDtls() {
        if (mrgnCallDtls == null) {
            mrgnCallDtls = new ArrayList<>();
        }
        return this.mrgnCallDtls;
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
