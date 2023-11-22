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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialPartyClassification1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialPartyClassification1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Clssfctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}FinancialPartySectorType2Code" maxOccurs="unbounded"/>
 *         <element name="InvstmtFndClssfctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}FundType2Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialPartyClassification1", propOrder = {
    "clssfctn",
    "invstmtFndClssfctn"
})
public class FinancialPartyClassification1 {

    @XmlElement(name = "Clssfctn", required = true)
    @XmlSchemaType(name = "string")
    protected List<FinancialPartySectorType2Code> clssfctn;
    @XmlElement(name = "InvstmtFndClssfctn")
    @XmlSchemaType(name = "string")
    protected FundType2Code invstmtFndClssfctn;

    /**
     * Gets the value of the clssfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clssfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClssfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialPartySectorType2Code }
     * 
     * 
     * @return
     *     The value of the clssfctn property.
     */
    public List<FinancialPartySectorType2Code> getClssfctn() {
        if (clssfctn == null) {
            clssfctn = new ArrayList<>();
        }
        return this.clssfctn;
    }

    /**
     * Gets the value of the invstmtFndClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link FundType2Code }
     *     
     */
    public FundType2Code getInvstmtFndClssfctn() {
        return invstmtFndClssfctn;
    }

    /**
     * Sets the value of the invstmtFndClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundType2Code }
     *     
     */
    public void setInvstmtFndClssfctn(FundType2Code value) {
        this.invstmtFndClssfctn = value;
    }

}
