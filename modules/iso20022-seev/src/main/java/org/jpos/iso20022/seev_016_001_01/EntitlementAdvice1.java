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
 * <p>Java class for EntitlementAdvice1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EntitlementAdvice1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.016.001.01}CorporateActionOption1FormatChoice"/>
 *         <element name="OptnNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.016.001.01}Exact3NumericText"/>
 *         <element name="RcrdDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.016.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="PmtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.016.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="AcctAndDstrbtnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.016.001.01}Entitlement1" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitlementAdvice1", propOrder = {
    "optnTp",
    "optnNb",
    "rcrdDt",
    "pmtDt",
    "acctAndDstrbtnDtls"
})
public class EntitlementAdvice1 {

    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption1FormatChoice optnTp;
    @XmlElement(name = "OptnNb", required = true)
    protected String optnNb;
    @XmlElement(name = "RcrdDt")
    protected DateFormat4Choice rcrdDt;
    @XmlElement(name = "PmtDt")
    protected DateFormat4Choice pmtDt;
    @XmlElement(name = "AcctAndDstrbtnDtls", required = true)
    protected List<Entitlement1> acctAndDstrbtnDtls;

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public CorporateActionOption1FormatChoice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public void setOptnTp(CorporateActionOption1FormatChoice value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptnNb(String value) {
        this.optnNb = value;
    }

    /**
     * Gets the value of the rcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getRcrdDt() {
        return rcrdDt;
    }

    /**
     * Sets the value of the rcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setRcrdDt(DateFormat4Choice value) {
        this.rcrdDt = value;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setPmtDt(DateFormat4Choice value) {
        this.pmtDt = value;
    }

    /**
     * Gets the value of the acctAndDstrbtnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctAndDstrbtnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctAndDstrbtnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Entitlement1 }
     * 
     * 
     * @return
     *     The value of the acctAndDstrbtnDtls property.
     */
    public List<Entitlement1> getAcctAndDstrbtnDtls() {
        if (acctAndDstrbtnDtls == null) {
            acctAndDstrbtnDtls = new ArrayList<>();
        }
        return this.acctAndDstrbtnDtls;
    }

}
