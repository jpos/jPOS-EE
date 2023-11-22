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

package org.jpos.iso20022.seev_024_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProceedsDelivery1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProceedsDelivery1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="SctiesAcctId" type="{urn:iso:std:iso:20022:tech:xsd:seev.024.001.01}Max35Text"/>
 *           <element name="CshAcctId" type="{urn:iso:std:iso:20022:tech:xsd:seev.024.001.01}CashAccountIdentification1Choice"/>
 *         </choice>
 *         <element name="AcctOwnrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.024.001.01}PartyIdentification2Choice" minOccurs="0"/>
 *         <element name="AcctSvcrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.024.001.01}PartyIdentification2Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProceedsDelivery1", propOrder = {
    "sctiesAcctId",
    "cshAcctId",
    "acctOwnrId",
    "acctSvcrId"
})
public class ProceedsDelivery1 {

    @XmlElement(name = "SctiesAcctId")
    protected String sctiesAcctId;
    @XmlElement(name = "CshAcctId")
    protected CashAccountIdentification1Choice cshAcctId;
    @XmlElement(name = "AcctOwnrId")
    protected PartyIdentification2Choice acctOwnrId;
    @XmlElement(name = "AcctSvcrId")
    protected PartyIdentification2Choice acctSvcrId;

    /**
     * Gets the value of the sctiesAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesAcctId() {
        return sctiesAcctId;
    }

    /**
     * Sets the value of the sctiesAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctiesAcctId(String value) {
        this.sctiesAcctId = value;
    }

    /**
     * Gets the value of the cshAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification1Choice }
     *     
     */
    public CashAccountIdentification1Choice getCshAcctId() {
        return cshAcctId;
    }

    /**
     * Sets the value of the cshAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification1Choice }
     *     
     */
    public void setCshAcctId(CashAccountIdentification1Choice value) {
        this.cshAcctId = value;
    }

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
     * Gets the value of the acctSvcrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getAcctSvcrId() {
        return acctSvcrId;
    }

    /**
     * Sets the value of the acctSvcrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public void setAcctSvcrId(PartyIdentification2Choice value) {
        this.acctSvcrId = value;
    }

}
