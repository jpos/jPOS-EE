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

package org.jpos.iso20022.colr_010_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralSubstitutionRequestV05 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralSubstitutionRequestV05">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}Max35Text"/>
 *         <element name="Oblgtn" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}Obligation9"/>
 *         <element name="Agrmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}Agreement4" minOccurs="0"/>
 *         <element name="CollSbstitnRtr" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}CollateralSubstitution7"/>
 *         <element name="CollSbstitnDlvr" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}CollateralSubstitution8" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralSubstitutionRequestV05", propOrder = {
    "txId",
    "oblgtn",
    "agrmt",
    "collSbstitnRtr",
    "collSbstitnDlvr",
    "splmtryData"
})
public class CollateralSubstitutionRequestV05 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "Oblgtn", required = true)
    protected Obligation9 oblgtn;
    @XmlElement(name = "Agrmt")
    protected Agreement4 agrmt;
    @XmlElement(name = "CollSbstitnRtr", required = true)
    protected CollateralSubstitution7 collSbstitnRtr;
    @XmlElement(name = "CollSbstitnDlvr")
    protected CollateralSubstitution8 collSbstitnDlvr;
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
     * Gets the value of the collSbstitnRtr property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralSubstitution7 }
     *     
     */
    public CollateralSubstitution7 getCollSbstitnRtr() {
        return collSbstitnRtr;
    }

    /**
     * Sets the value of the collSbstitnRtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralSubstitution7 }
     *     
     */
    public void setCollSbstitnRtr(CollateralSubstitution7 value) {
        this.collSbstitnRtr = value;
    }

    /**
     * Gets the value of the collSbstitnDlvr property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralSubstitution8 }
     *     
     */
    public CollateralSubstitution8 getCollSbstitnDlvr() {
        return collSbstitnDlvr;
    }

    /**
     * Sets the value of the collSbstitnDlvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralSubstitution8 }
     *     
     */
    public void setCollSbstitnDlvr(CollateralSubstitution8 value) {
        this.collSbstitnDlvr = value;
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
