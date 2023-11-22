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

package org.jpos.iso20022.seev_022_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionMovementFailedStatus1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionMovementFailedStatus1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AgtAcctId" type="{urn:iso:std:iso:20022:tech:xsd:seev.022.001.01}Max35Text"/>
 *         <element name="ClntAcctId" type="{urn:iso:std:iso:20022:tech:xsd:seev.022.001.01}Max35Text" minOccurs="0"/>
 *         <element name="AcctOwnrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.022.001.01}PartyIdentification2Choice" minOccurs="0"/>
 *         <element name="RsrcDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.022.001.01}FailedMovement1" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionMovementFailedStatus1", propOrder = {
    "agtAcctId",
    "clntAcctId",
    "acctOwnrId",
    "rsrcDtls"
})
public class CorporateActionMovementFailedStatus1 {

    @XmlElement(name = "AgtAcctId", required = true)
    protected String agtAcctId;
    @XmlElement(name = "ClntAcctId")
    protected String clntAcctId;
    @XmlElement(name = "AcctOwnrId")
    protected PartyIdentification2Choice acctOwnrId;
    @XmlElement(name = "RsrcDtls", required = true)
    protected List<FailedMovement1> rsrcDtls;

    /**
     * Gets the value of the agtAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgtAcctId() {
        return agtAcctId;
    }

    /**
     * Sets the value of the agtAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgtAcctId(String value) {
        this.agtAcctId = value;
    }

    /**
     * Gets the value of the clntAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntAcctId() {
        return clntAcctId;
    }

    /**
     * Sets the value of the clntAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntAcctId(String value) {
        this.clntAcctId = value;
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
     * Gets the value of the rsrcDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rsrcDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsrcDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FailedMovement1 }
     * 
     * 
     * @return
     *     The value of the rsrcDtls property.
     */
    public List<FailedMovement1> getRsrcDtls() {
        if (rsrcDtls == null) {
            rsrcDtls = new ArrayList<>();
        }
        return this.rsrcDtls;
    }

}
