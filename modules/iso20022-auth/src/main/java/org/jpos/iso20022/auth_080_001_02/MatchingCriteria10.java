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
 * <p>Java class for MatchingCriteria10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MatchingCriteria10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrPtyMtchgCrit" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CounterpartyMatchingCriteria4" minOccurs="0"/>
 *         <element name="LnMtchgCrit" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}LoanMatchingCriteria9" minOccurs="0"/>
 *         <element name="CollMtchgCrit" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CollateralMatchingCriteria6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchingCriteria10", propOrder = {
    "ctrPtyMtchgCrit",
    "lnMtchgCrit",
    "collMtchgCrit"
})
public class MatchingCriteria10 {

    @XmlElement(name = "CtrPtyMtchgCrit")
    protected CounterpartyMatchingCriteria4 ctrPtyMtchgCrit;
    @XmlElement(name = "LnMtchgCrit")
    protected LoanMatchingCriteria9 lnMtchgCrit;
    @XmlElement(name = "CollMtchgCrit")
    protected CollateralMatchingCriteria6 collMtchgCrit;

    /**
     * Gets the value of the ctrPtyMtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyMatchingCriteria4 }
     *     
     */
    public CounterpartyMatchingCriteria4 getCtrPtyMtchgCrit() {
        return ctrPtyMtchgCrit;
    }

    /**
     * Sets the value of the ctrPtyMtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyMatchingCriteria4 }
     *     
     */
    public void setCtrPtyMtchgCrit(CounterpartyMatchingCriteria4 value) {
        this.ctrPtyMtchgCrit = value;
    }

    /**
     * Gets the value of the lnMtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link LoanMatchingCriteria9 }
     *     
     */
    public LoanMatchingCriteria9 getLnMtchgCrit() {
        return lnMtchgCrit;
    }

    /**
     * Sets the value of the lnMtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanMatchingCriteria9 }
     *     
     */
    public void setLnMtchgCrit(LoanMatchingCriteria9 value) {
        this.lnMtchgCrit = value;
    }

    /**
     * Gets the value of the collMtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMatchingCriteria6 }
     *     
     */
    public CollateralMatchingCriteria6 getCollMtchgCrit() {
        return collMtchgCrit;
    }

    /**
     * Sets the value of the collMtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMatchingCriteria6 }
     *     
     */
    public void setCollMtchgCrit(CollateralMatchingCriteria6 value) {
        this.collMtchgCrit = value;
    }

}
