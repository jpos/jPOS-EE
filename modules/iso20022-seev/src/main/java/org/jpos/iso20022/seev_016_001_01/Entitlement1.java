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

package org.jpos.iso20022.seev_016_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Entitlement1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Entitlement1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctOwnrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.016.001.01}PartyIdentification2Choice" minOccurs="0"/>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:seev.016.001.01}Max35Text"/>
 *         <element name="SctiesDstrbtnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.016.001.01}SecuritiesEntitlement1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CshDstrbtnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.016.001.01}CashEntitlement1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entitlement1", propOrder = {
    "acctOwnrId",
    "acctId",
    "sctiesDstrbtnDtls",
    "cshDstrbtnDtls"
})
public class Entitlement1 {

    @XmlElement(name = "AcctOwnrId")
    protected PartyIdentification2Choice acctOwnrId;
    @XmlElement(name = "AcctId", required = true)
    protected String acctId;
    @XmlElement(name = "SctiesDstrbtnDtls")
    protected List<SecuritiesEntitlement1> sctiesDstrbtnDtls;
    @XmlElement(name = "CshDstrbtnDtls")
    protected List<CashEntitlement1> cshDstrbtnDtls;

    /**
     * Gets the value of the acctOwnrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getAcctOwnrId() {
        return acctOwnrId;
    }

    /**
     * Sets the value of the acctOwnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public void setAcctOwnrId(PartyIdentification2Choice value) {
        this.acctOwnrId = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the sctiesDstrbtnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesDstrbtnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesDstrbtnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesEntitlement1 }
     * 
     * 
     * @return
     *     The value of the sctiesDstrbtnDtls property.
     */
    public List<SecuritiesEntitlement1> getSctiesDstrbtnDtls() {
        if (sctiesDstrbtnDtls == null) {
            sctiesDstrbtnDtls = new ArrayList<>();
        }
        return this.sctiesDstrbtnDtls;
    }

    /**
     * Gets the value of the cshDstrbtnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshDstrbtnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshDstrbtnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashEntitlement1 }
     * 
     * 
     * @return
     *     The value of the cshDstrbtnDtls property.
     */
    public List<CashEntitlement1> getCshDstrbtnDtls() {
        if (cshDstrbtnDtls == null) {
            cshDstrbtnDtls = new ArrayList<>();
        }
        return this.cshDstrbtnDtls;
    }

}
