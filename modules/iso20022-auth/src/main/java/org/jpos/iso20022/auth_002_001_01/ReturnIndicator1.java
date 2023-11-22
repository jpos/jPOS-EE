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

package org.jpos.iso20022.auth_002_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnIndicator1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReturnIndicator1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RspnPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.002.001.01}DateOrDateTimePeriodChoice" minOccurs="0"/>
 *         <element name="AuthrtyReqTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.002.001.01}AuthorityRequestType1"/>
 *         <element name="InvstgtnRslt" type="{urn:iso:std:iso:20022:tech:xsd:auth.002.001.01}InvestigationResult1Choice"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:auth.002.001.01}Max500Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnIndicator1", propOrder = {
    "rspnPrd",
    "authrtyReqTp",
    "invstgtnRslt",
    "addtlInf"
})
public class ReturnIndicator1 {

    @XmlElement(name = "RspnPrd")
    protected DateOrDateTimePeriodChoice rspnPrd;
    @XmlElement(name = "AuthrtyReqTp", required = true)
    protected AuthorityRequestType1 authrtyReqTp;
    @XmlElement(name = "InvstgtnRslt", required = true)
    protected InvestigationResult1Choice invstgtnRslt;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the rspnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrDateTimePeriodChoice }
     *     
     */
    public DateOrDateTimePeriodChoice getRspnPrd() {
        return rspnPrd;
    }

    /**
     * Sets the value of the rspnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrDateTimePeriodChoice }
     *     
     */
    public void setRspnPrd(DateOrDateTimePeriodChoice value) {
        this.rspnPrd = value;
    }

    /**
     * Gets the value of the authrtyReqTp property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityRequestType1 }
     *     
     */
    public AuthorityRequestType1 getAuthrtyReqTp() {
        return authrtyReqTp;
    }

    /**
     * Sets the value of the authrtyReqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityRequestType1 }
     *     
     */
    public void setAuthrtyReqTp(AuthorityRequestType1 value) {
        this.authrtyReqTp = value;
    }

    /**
     * Gets the value of the invstgtnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationResult1Choice }
     *     
     */
    public InvestigationResult1Choice getInvstgtnRslt() {
        return invstgtnRslt;
    }

    /**
     * Sets the value of the invstgtnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationResult1Choice }
     *     
     */
    public void setInvstgtnRslt(InvestigationResult1Choice value) {
        this.invstgtnRslt = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

}
