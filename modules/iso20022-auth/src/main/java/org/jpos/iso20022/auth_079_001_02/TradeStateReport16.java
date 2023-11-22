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

package org.jpos.iso20022.auth_079_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeStateReport16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeStateReport16">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TechRcrdId" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}Max140Text" minOccurs="0"/>
 *         <element name="CtrPtySpcfcData" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}CounterpartyData88"/>
 *         <element name="LnData" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}TransactionLoanData31Choice" minOccurs="0"/>
 *         <element name="CollData" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}TransactionCollateralData18Choice" minOccurs="0"/>
 *         <element name="RcncltnFlg" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}ReconciliationFlag2" minOccurs="0"/>
 *         <element name="CtrctMod" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}ContractModification3"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeStateReport16", propOrder = {
    "techRcrdId",
    "ctrPtySpcfcData",
    "lnData",
    "collData",
    "rcncltnFlg",
    "ctrctMod",
    "splmtryData"
})
public class TradeStateReport16 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "CtrPtySpcfcData", required = true)
    protected CounterpartyData88 ctrPtySpcfcData;
    @XmlElement(name = "LnData")
    protected TransactionLoanData31Choice lnData;
    @XmlElement(name = "CollData")
    protected TransactionCollateralData18Choice collData;
    @XmlElement(name = "RcncltnFlg")
    protected ReconciliationFlag2 rcncltnFlg;
    @XmlElement(name = "CtrctMod", required = true)
    protected ContractModification3 ctrctMod;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechRcrdId(String value) {
        this.techRcrdId = value;
    }

    /**
     * Gets the value of the ctrPtySpcfcData property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyData88 }
     *     
     */
    public CounterpartyData88 getCtrPtySpcfcData() {
        return ctrPtySpcfcData;
    }

    /**
     * Sets the value of the ctrPtySpcfcData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyData88 }
     *     
     */
    public void setCtrPtySpcfcData(CounterpartyData88 value) {
        this.ctrPtySpcfcData = value;
    }

    /**
     * Gets the value of the lnData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionLoanData31Choice }
     *     
     */
    public TransactionLoanData31Choice getLnData() {
        return lnData;
    }

    /**
     * Sets the value of the lnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionLoanData31Choice }
     *     
     */
    public void setLnData(TransactionLoanData31Choice value) {
        this.lnData = value;
    }

    /**
     * Gets the value of the collData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCollateralData18Choice }
     *     
     */
    public TransactionCollateralData18Choice getCollData() {
        return collData;
    }

    /**
     * Sets the value of the collData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCollateralData18Choice }
     *     
     */
    public void setCollData(TransactionCollateralData18Choice value) {
        this.collData = value;
    }

    /**
     * Gets the value of the rcncltnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationFlag2 }
     *     
     */
    public ReconciliationFlag2 getRcncltnFlg() {
        return rcncltnFlg;
    }

    /**
     * Sets the value of the rcncltnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationFlag2 }
     *     
     */
    public void setRcncltnFlg(ReconciliationFlag2 value) {
        this.rcncltnFlg = value;
    }

    /**
     * Gets the value of the ctrctMod property.
     * 
     * @return
     *     possible object is
     *     {@link ContractModification3 }
     *     
     */
    public ContractModification3 getCtrctMod() {
        return ctrctMod;
    }

    /**
     * Sets the value of the ctrctMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractModification3 }
     *     
     */
    public void setCtrctMod(ContractModification3 value) {
        this.ctrctMod = value;
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
