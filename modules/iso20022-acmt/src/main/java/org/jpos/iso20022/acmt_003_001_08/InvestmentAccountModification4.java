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

package org.jpos.iso20022.acmt_003_001_08;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentAccountModification4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvestmentAccountModification4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ModRsn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max350Text" minOccurs="0"/>
 *         <element name="AcctApplId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max35Text" minOccurs="0"/>
 *         <element name="ClntRef" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max35Text" minOccurs="0"/>
 *         <element name="CtrPtyRef" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}AdditionalReference13" minOccurs="0"/>
 *         <element name="ExstgAcctId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Account23" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccountModification4", propOrder = {
    "modRsn",
    "acctApplId",
    "clntRef",
    "ctrPtyRef",
    "exstgAcctId"
})
public class InvestmentAccountModification4 {

    @XmlElement(name = "ModRsn")
    protected String modRsn;
    @XmlElement(name = "AcctApplId")
    protected String acctApplId;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "CtrPtyRef")
    protected AdditionalReference13 ctrPtyRef;
    @XmlElement(name = "ExstgAcctId")
    protected List<Account23> exstgAcctId;

    /**
     * Gets the value of the modRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModRsn() {
        return modRsn;
    }

    /**
     * Sets the value of the modRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModRsn(String value) {
        this.modRsn = value;
    }

    /**
     * Gets the value of the acctApplId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctApplId() {
        return acctApplId;
    }

    /**
     * Sets the value of the acctApplId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctApplId(String value) {
        this.acctApplId = value;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntRef(String value) {
        this.clntRef = value;
    }

    /**
     * Gets the value of the ctrPtyRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference13 }
     *     
     */
    public AdditionalReference13 getCtrPtyRef() {
        return ctrPtyRef;
    }

    /**
     * Sets the value of the ctrPtyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference13 }
     *     
     */
    public void setCtrPtyRef(AdditionalReference13 value) {
        this.ctrPtyRef = value;
    }

    /**
     * Gets the value of the exstgAcctId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the exstgAcctId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExstgAcctId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account23 }
     * 
     * 
     * @return
     *     The value of the exstgAcctId property.
     */
    public List<Account23> getExstgAcctId() {
        if (exstgAcctId == null) {
            exstgAcctId = new ArrayList<>();
        }
        return this.exstgAcctId;
    }

}
