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

package org.jpos.iso20022.seev_012_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionSecuritiesMovement2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionSecuritiesMovement2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctyId" type="{urn:iso:std:iso:20022:tech:xsd:seev.012.001.01}SecurityIdentification7"/>
 *         <element name="PstngDtTm" type="{urn:iso:std:iso:20022:tech:xsd:seev.012.001.01}DateAndDateTimeChoice" minOccurs="0"/>
 *         <element name="PstngId" type="{urn:iso:std:iso:20022:tech:xsd:seev.012.001.01}Max35Text" minOccurs="0"/>
 *         <element name="PstngQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.012.001.01}UnitOrFaceAmount1Choice"/>
 *         <element name="AcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.012.001.01}SecuritiesAccount9" maxOccurs="2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionSecuritiesMovement2", propOrder = {
    "sctyId",
    "pstngDtTm",
    "pstngId",
    "pstngQty",
    "acctDtls"
})
public class CorporateActionSecuritiesMovement2 {

    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification7 sctyId;
    @XmlElement(name = "PstngDtTm")
    protected DateAndDateTimeChoice pstngDtTm;
    @XmlElement(name = "PstngId")
    protected String pstngId;
    @XmlElement(name = "PstngQty", required = true)
    protected UnitOrFaceAmount1Choice pstngQty;
    @XmlElement(name = "AcctDtls", required = true)
    protected List<SecuritiesAccount9> acctDtls;

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
     * Gets the value of the pstngDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getPstngDtTm() {
        return pstngDtTm;
    }

    /**
     * Sets the value of the pstngDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setPstngDtTm(DateAndDateTimeChoice value) {
        this.pstngDtTm = value;
    }

    /**
     * Gets the value of the pstngId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstngId() {
        return pstngId;
    }

    /**
     * Sets the value of the pstngId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstngId(String value) {
        this.pstngId = value;
    }

    /**
     * Gets the value of the pstngQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getPstngQty() {
        return pstngQty;
    }

    /**
     * Sets the value of the pstngQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setPstngQty(UnitOrFaceAmount1Choice value) {
        this.pstngQty = value;
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
     * {@link SecuritiesAccount9 }
     * 
     * 
     * @return
     *     The value of the acctDtls property.
     */
    public List<SecuritiesAccount9> getAcctDtls() {
        if (acctDtls == null) {
            acctDtls = new ArrayList<>();
        }
        return this.acctDtls;
    }

}
