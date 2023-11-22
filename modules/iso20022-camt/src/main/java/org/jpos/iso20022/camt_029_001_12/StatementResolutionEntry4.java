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

package org.jpos.iso20022.camt_029_001_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementResolutionEntry4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatementResolutionEntry4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrgnlGrpInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}OriginalGroupInformation29" minOccurs="0"/>
 *         <element name="OrgnlStmtId" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}Max35Text" minOccurs="0"/>
 *         <element name="UETR" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}UUIDv4Identifier" minOccurs="0"/>
 *         <element name="AcctSvcrRef" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}Max35Text" minOccurs="0"/>
 *         <element name="CrrctdAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Chrgs" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}Charges6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Purp" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}Purpose2Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementResolutionEntry4", propOrder = {
    "orgnlGrpInf",
    "orgnlStmtId",
    "uetr",
    "acctSvcrRef",
    "crrctdAmt",
    "chrgs",
    "purp"
})
public class StatementResolutionEntry4 {

    @XmlElement(name = "OrgnlGrpInf")
    protected OriginalGroupInformation29 orgnlGrpInf;
    @XmlElement(name = "OrgnlStmtId")
    protected String orgnlStmtId;
    @XmlElement(name = "UETR")
    protected String uetr;
    @XmlElement(name = "AcctSvcrRef")
    protected String acctSvcrRef;
    @XmlElement(name = "CrrctdAmt")
    protected ActiveOrHistoricCurrencyAndAmount crrctdAmt;
    @XmlElement(name = "Chrgs")
    protected List<Charges6> chrgs;
    @XmlElement(name = "Purp")
    protected Purpose2Choice purp;

    /**
     * Gets the value of the orgnlGrpInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public OriginalGroupInformation29 getOrgnlGrpInf() {
        return orgnlGrpInf;
    }

    /**
     * Sets the value of the orgnlGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public void setOrgnlGrpInf(OriginalGroupInformation29 value) {
        this.orgnlGrpInf = value;
    }

    /**
     * Gets the value of the orgnlStmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlStmtId() {
        return orgnlStmtId;
    }

    /**
     * Sets the value of the orgnlStmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlStmtId(String value) {
        this.orgnlStmtId = value;
    }

    /**
     * Gets the value of the uetr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUETR() {
        return uetr;
    }

    /**
     * Sets the value of the uetr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUETR(String value) {
        this.uetr = value;
    }

    /**
     * Gets the value of the acctSvcrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSvcrRef() {
        return acctSvcrRef;
    }

    /**
     * Sets the value of the acctSvcrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSvcrRef(String value) {
        this.acctSvcrRef = value;
    }

    /**
     * Gets the value of the crrctdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getCrrctdAmt() {
        return crrctdAmt;
    }

    /**
     * Sets the value of the crrctdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setCrrctdAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.crrctdAmt = value;
    }

    /**
     * Gets the value of the chrgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chrgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charges6 }
     * 
     * 
     * @return
     *     The value of the chrgs property.
     */
    public List<Charges6> getChrgs() {
        if (chrgs == null) {
            chrgs = new ArrayList<>();
        }
        return this.chrgs;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link Purpose2Choice }
     *     
     */
    public Purpose2Choice getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Purpose2Choice }
     *     
     */
    public void setPurp(Purpose2Choice value) {
        this.purp = value;
    }

}
