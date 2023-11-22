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

package org.jpos.iso20022.camt_013_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemberCriteriaDefinition2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MemberCriteriaDefinition2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="QryNm" type="{urn:iso:std:iso:20022:tech:xsd:camt.013.001.04}Max35Text"/>
 *         <element name="NewCrit" type="{urn:iso:std:iso:20022:tech:xsd:camt.013.001.04}MemberCriteria4"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberCriteriaDefinition2Choice", propOrder = {
    "qryNm",
    "newCrit"
})
public class MemberCriteriaDefinition2Choice {

    @XmlElement(name = "QryNm")
    protected String qryNm;
    @XmlElement(name = "NewCrit")
    protected MemberCriteria4 newCrit;

    /**
     * Gets the value of the qryNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryNm() {
        return qryNm;
    }

    /**
     * Sets the value of the qryNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryNm(String value) {
        this.qryNm = value;
    }

    /**
     * Gets the value of the newCrit property.
     * 
     * @return
     *     possible object is
     *     {@link MemberCriteria4 }
     *     
     */
    public MemberCriteria4 getNewCrit() {
        return newCrit;
    }

    /**
     * Sets the value of the newCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberCriteria4 }
     *     
     */
    public void setNewCrit(MemberCriteria4 value) {
        this.newCrit = value;
    }

}
