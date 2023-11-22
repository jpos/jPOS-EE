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

package org.jpos.iso20022.auth_080_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralMatchingCriteria6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralMatchingCriteria6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UncollsdFlg" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareTrueFalseIndicator3" minOccurs="0"/>
 *         <element name="NetXpsrCollstnInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareTrueFalseIndicator3" minOccurs="0"/>
 *         <element name="CollValDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareDate3" minOccurs="0"/>
 *         <element name="AsstTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}SecurityCommodityCash4" minOccurs="0"/>
 *         <element name="BsktIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareSecurityIdentification4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralMatchingCriteria6", propOrder = {
    "uncollsdFlg",
    "netXpsrCollstnInd",
    "collValDt",
    "asstTp",
    "bsktIdr"
})
public class CollateralMatchingCriteria6 {

    @XmlElement(name = "UncollsdFlg")
    protected CompareTrueFalseIndicator3 uncollsdFlg;
    @XmlElement(name = "NetXpsrCollstnInd")
    protected CompareTrueFalseIndicator3 netXpsrCollstnInd;
    @XmlElement(name = "CollValDt")
    protected CompareDate3 collValDt;
    @XmlElement(name = "AsstTp")
    protected SecurityCommodityCash4 asstTp;
    @XmlElement(name = "BsktIdr")
    protected CompareSecurityIdentification4 bsktIdr;

    /**
     * Gets the value of the uncollsdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public CompareTrueFalseIndicator3 getUncollsdFlg() {
        return uncollsdFlg;
    }

    /**
     * Sets the value of the uncollsdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public void setUncollsdFlg(CompareTrueFalseIndicator3 value) {
        this.uncollsdFlg = value;
    }

    /**
     * Gets the value of the netXpsrCollstnInd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public CompareTrueFalseIndicator3 getNetXpsrCollstnInd() {
        return netXpsrCollstnInd;
    }

    /**
     * Sets the value of the netXpsrCollstnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public void setNetXpsrCollstnInd(CompareTrueFalseIndicator3 value) {
        this.netXpsrCollstnInd = value;
    }

    /**
     * Gets the value of the collValDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getCollValDt() {
        return collValDt;
    }

    /**
     * Sets the value of the collValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public void setCollValDt(CompareDate3 value) {
        this.collValDt = value;
    }

    /**
     * Gets the value of the asstTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCommodityCash4 }
     *     
     */
    public SecurityCommodityCash4 getAsstTp() {
        return asstTp;
    }

    /**
     * Sets the value of the asstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCommodityCash4 }
     *     
     */
    public void setAsstTp(SecurityCommodityCash4 value) {
        this.asstTp = value;
    }

    /**
     * Gets the value of the bsktIdr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareSecurityIdentification4 }
     *     
     */
    public CompareSecurityIdentification4 getBsktIdr() {
        return bsktIdr;
    }

    /**
     * Sets the value of the bsktIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareSecurityIdentification4 }
     *     
     */
    public void setBsktIdr(CompareSecurityIdentification4 value) {
        this.bsktIdr = value;
    }

}
