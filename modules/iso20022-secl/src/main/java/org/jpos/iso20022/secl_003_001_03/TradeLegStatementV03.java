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

package org.jpos.iso20022.secl_003_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeLegStatementV03 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeLegStatementV03">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StmtParams" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}Statement31"/>
 *         <element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}Pagination"/>
 *         <element name="ClrMmb" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}PartyIdentification35Choice"/>
 *         <element name="ClrAcct" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}SecuritiesAccount18" minOccurs="0"/>
 *         <element name="StmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}TradeLegStatement3" maxOccurs="unbounded"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeLegStatementV03", propOrder = {
    "stmtParams",
    "pgntn",
    "clrMmb",
    "clrAcct",
    "stmtDtls",
    "splmtryData"
})
public class TradeLegStatementV03 {

    @XmlElement(name = "StmtParams", required = true)
    protected Statement31 stmtParams;
    @XmlElement(name = "Pgntn", required = true)
    protected Pagination pgntn;
    @XmlElement(name = "ClrMmb", required = true)
    protected PartyIdentification35Choice clrMmb;
    @XmlElement(name = "ClrAcct")
    protected SecuritiesAccount18 clrAcct;
    @XmlElement(name = "StmtDtls", required = true)
    protected List<TradeLegStatement3> stmtDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the stmtParams property.
     * 
     * @return
     *     possible object is
     *     {@link Statement31 }
     *     
     */
    public Statement31 getStmtParams() {
        return stmtParams;
    }

    /**
     * Sets the value of the stmtParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement31 }
     *     
     */
    public void setStmtParams(Statement31 value) {
        this.stmtParams = value;
    }

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public void setPgntn(Pagination value) {
        this.pgntn = value;
    }

    /**
     * Gets the value of the clrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getClrMmb() {
        return clrMmb;
    }

    /**
     * Sets the value of the clrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public void setClrMmb(PartyIdentification35Choice value) {
        this.clrMmb = value;
    }

    /**
     * Gets the value of the clrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public SecuritiesAccount18 getClrAcct() {
        return clrAcct;
    }

    /**
     * Sets the value of the clrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public void setClrAcct(SecuritiesAccount18 value) {
        this.clrAcct = value;
    }

    /**
     * Gets the value of the stmtDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stmtDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStmtDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeLegStatement3 }
     * 
     * 
     * @return
     *     The value of the stmtDtls property.
     */
    public List<TradeLegStatement3> getStmtDtls() {
        if (stmtDtls == null) {
            stmtDtls = new ArrayList<>();
        }
        return this.stmtDtls;
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
