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

package org.jpos.iso20022.setr_016_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwitchLegReferences2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SwitchLegReferences2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LegId" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}LegIdentification1Choice"/>
 *         <element name="LegRjctnRsn" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}Max350Text" minOccurs="0"/>
 *         <element name="RprdFee" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}Fee3" maxOccurs="10" minOccurs="0"/>
 *         <element name="InvstmtAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}InvestmentAccount58" minOccurs="0"/>
 *         <element name="FinInstrmDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}FinancialInstrument57" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchLegReferences2", propOrder = {
    "legId",
    "legRjctnRsn",
    "rprdFee",
    "invstmtAcctDtls",
    "finInstrmDtls"
})
public class SwitchLegReferences2 {

    @XmlElement(name = "LegId", required = true)
    protected LegIdentification1Choice legId;
    @XmlElement(name = "LegRjctnRsn")
    protected String legRjctnRsn;
    @XmlElement(name = "RprdFee")
    protected List<Fee3> rprdFee;
    @XmlElement(name = "InvstmtAcctDtls")
    protected InvestmentAccount58 invstmtAcctDtls;
    @XmlElement(name = "FinInstrmDtls")
    protected FinancialInstrument57 finInstrmDtls;

    /**
     * Gets the value of the legId property.
     * 
     * @return
     *     possible object is
     *     {@link LegIdentification1Choice }
     *     
     */
    public LegIdentification1Choice getLegId() {
        return legId;
    }

    /**
     * Sets the value of the legId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegIdentification1Choice }
     *     
     */
    public void setLegId(LegIdentification1Choice value) {
        this.legId = value;
    }

    /**
     * Gets the value of the legRjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegRjctnRsn() {
        return legRjctnRsn;
    }

    /**
     * Sets the value of the legRjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegRjctnRsn(String value) {
        this.legRjctnRsn = value;
    }

    /**
     * Gets the value of the rprdFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rprdFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRprdFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fee3 }
     * 
     * 
     * @return
     *     The value of the rprdFee property.
     */
    public List<Fee3> getRprdFee() {
        if (rprdFee == null) {
            rprdFee = new ArrayList<>();
        }
        return this.rprdFee;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount58 }
     *     
     */
    public InvestmentAccount58 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount58 }
     *     
     */
    public void setInvstmtAcctDtls(InvestmentAccount58 value) {
        this.invstmtAcctDtls = value;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument57 }
     *     
     */
    public FinancialInstrument57 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument57 }
     *     
     */
    public void setFinInstrmDtls(FinancialInstrument57 value) {
        this.finInstrmDtls = value;
    }

}
