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

package org.jpos.iso20022.seev_047_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountSubLevel23 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountSubLevel23">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}Max35Text" minOccurs="0"/>
 *         <element name="AcctHldr" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}PartyIdentification243"/>
 *         <element name="ShrhldgBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}ShareholdingBalance1" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSubLevel23", propOrder = {
    "sfkpgAcct",
    "acctHldr",
    "shrhldgBal"
})
public class AccountSubLevel23 {

    @XmlElement(name = "SfkpgAcct")
    protected String sfkpgAcct;
    @XmlElement(name = "AcctHldr", required = true)
    protected PartyIdentification243 acctHldr;
    @XmlElement(name = "ShrhldgBal", required = true)
    protected List<ShareholdingBalance1> shrhldgBal;

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfkpgAcct(String value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the acctHldr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification243 }
     *     
     */
    public PartyIdentification243 getAcctHldr() {
        return acctHldr;
    }

    /**
     * Sets the value of the acctHldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification243 }
     *     
     */
    public void setAcctHldr(PartyIdentification243 value) {
        this.acctHldr = value;
    }

    /**
     * Gets the value of the shrhldgBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the shrhldgBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShrhldgBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShareholdingBalance1 }
     * 
     * 
     * @return
     *     The value of the shrhldgBal property.
     */
    public List<ShareholdingBalance1> getShrhldgBal() {
        if (shrhldgBal == null) {
            shrhldgBal = new ArrayList<>();
        }
        return this.shrhldgBal;
    }

}
