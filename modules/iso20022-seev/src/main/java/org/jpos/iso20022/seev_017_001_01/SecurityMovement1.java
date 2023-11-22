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

package org.jpos.iso20022.seev_017_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityMovement1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityMovement1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MvmntId" type="{urn:iso:std:iso:20022:tech:xsd:seev.017.001.01}Max35Text" minOccurs="0"/>
 *         <element name="SctyId" type="{urn:iso:std:iso:20022:tech:xsd:seev.017.001.01}SecurityIdentification7"/>
 *         <element name="SctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.017.001.01}UnitOrFaceAmount1Choice"/>
 *         <element name="AcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.017.001.01}SecuritiesAccount12" maxOccurs="2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityMovement1", propOrder = {
    "mvmntId",
    "sctyId",
    "sctiesQty",
    "acctDtls"
})
public class SecurityMovement1 {

    @XmlElement(name = "MvmntId")
    protected String mvmntId;
    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification7 sctyId;
    @XmlElement(name = "SctiesQty", required = true)
    protected UnitOrFaceAmount1Choice sctiesQty;
    @XmlElement(name = "AcctDtls", required = true)
    protected List<SecuritiesAccount12> acctDtls;

    /**
     * Gets the value of the mvmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvmntId() {
        return mvmntId;
    }

    /**
     * Sets the value of the mvmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvmntId(String value) {
        this.mvmntId = value;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public void setSctyId(SecurityIdentification7 value) {
        this.sctyId = value;
    }

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setSctiesQty(UnitOrFaceAmount1Choice value) {
        this.sctiesQty = value;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesAccount12 }
     * 
     * 
     * @return
     *     The value of the acctDtls property.
     */
    public List<SecuritiesAccount12> getAcctDtls() {
        if (acctDtls == null) {
            acctDtls = new ArrayList<>();
        }
        return this.acctDtls;
    }

}
