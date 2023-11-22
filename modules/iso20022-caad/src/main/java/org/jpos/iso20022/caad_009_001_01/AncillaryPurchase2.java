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

package org.jpos.iso20022.caad_009_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AncillaryPurchase2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AncillaryPurchase2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AncllryDocNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max15Text" minOccurs="0"/>
 *         <element name="RltdDocNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max15Text" minOccurs="0"/>
 *         <element name="SvcCtgyCd" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max4Text" minOccurs="0"/>
 *         <element name="SvcSubCtgyCd" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max4Text" minOccurs="0"/>
 *         <element name="SvcPrvdrSvcTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="CdtRsnCd" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="SummryCmmdtyId" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Amount16" minOccurs="0"/>
 *         <element name="Fee" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Tax39" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryPurchase2", propOrder = {
    "ancllryDocNb",
    "rltdDocNb",
    "svcCtgyCd",
    "svcSubCtgyCd",
    "svcPrvdrSvcTp",
    "cdtRsnCd",
    "summryCmmdtyId",
    "amt",
    "fee",
    "tax",
    "addtlData"
})
public class AncillaryPurchase2 {

    @XmlElement(name = "AncllryDocNb")
    protected String ancllryDocNb;
    @XmlElement(name = "RltdDocNb")
    protected String rltdDocNb;
    @XmlElement(name = "SvcCtgyCd")
    protected String svcCtgyCd;
    @XmlElement(name = "SvcSubCtgyCd")
    protected String svcSubCtgyCd;
    @XmlElement(name = "SvcPrvdrSvcTp")
    protected String svcPrvdrSvcTp;
    @XmlElement(name = "CdtRsnCd")
    protected String cdtRsnCd;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "Amt")
    protected Amount16 amt;
    @XmlElement(name = "Fee")
    protected BigDecimal fee;
    @XmlElement(name = "Tax")
    protected List<Tax39> tax;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the ancllryDocNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncllryDocNb() {
        return ancllryDocNb;
    }

    /**
     * Sets the value of the ancllryDocNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncllryDocNb(String value) {
        this.ancllryDocNb = value;
    }

    /**
     * Gets the value of the rltdDocNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdDocNb() {
        return rltdDocNb;
    }

    /**
     * Sets the value of the rltdDocNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRltdDocNb(String value) {
        this.rltdDocNb = value;
    }

    /**
     * Gets the value of the svcCtgyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcCtgyCd() {
        return svcCtgyCd;
    }

    /**
     * Sets the value of the svcCtgyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcCtgyCd(String value) {
        this.svcCtgyCd = value;
    }

    /**
     * Gets the value of the svcSubCtgyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcSubCtgyCd() {
        return svcSubCtgyCd;
    }

    /**
     * Sets the value of the svcSubCtgyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcSubCtgyCd(String value) {
        this.svcSubCtgyCd = value;
    }

    /**
     * Gets the value of the svcPrvdrSvcTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcPrvdrSvcTp() {
        return svcPrvdrSvcTp;
    }

    /**
     * Sets the value of the svcPrvdrSvcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcPrvdrSvcTp(String value) {
        this.svcPrvdrSvcTp = value;
    }

    /**
     * Gets the value of the cdtRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtRsnCd() {
        return cdtRsnCd;
    }

    /**
     * Sets the value of the cdtRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtRsnCd(String value) {
        this.cdtRsnCd = value;
    }

    /**
     * Gets the value of the summryCmmdtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummryCmmdtyId() {
        return summryCmmdtyId;
    }

    /**
     * Sets the value of the summryCmmdtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount16 }
     *     
     */
    public Amount16 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount16 }
     *     
     */
    public void setAmt(Amount16 value) {
        this.amt = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFee(BigDecimal value) {
        this.fee = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax39 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax39> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlData(String value) {
        this.addtlData = value;
    }

}
