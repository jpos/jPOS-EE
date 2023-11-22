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

package org.jpos.iso20022.camt_082_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraBalanceQueryDefinition7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntraBalanceQueryDefinition7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="QryTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.082.001.01}MovementResponseType1Code"/>
 *         <element name="SchCrit" type="{urn:iso:std:iso:20022:tech:xsd:camt.082.001.01}IntraBalanceQueryCriteria7"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalanceQueryDefinition7", propOrder = {
    "qryTp",
    "schCrit"
})
public class IntraBalanceQueryDefinition7 {

    @XmlElement(name = "QryTp", required = true)
    @XmlSchemaType(name = "string")
    protected MovementResponseType1Code qryTp;
    @XmlElement(name = "SchCrit", required = true)
    protected IntraBalanceQueryCriteria7 schCrit;

    /**
     * Gets the value of the qryTp property.
     * 
     * @return
     *     possible object is
     *     {@link MovementResponseType1Code }
     *     
     */
    public MovementResponseType1Code getQryTp() {
        return qryTp;
    }

    /**
     * Sets the value of the qryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementResponseType1Code }
     *     
     */
    public void setQryTp(MovementResponseType1Code value) {
        this.qryTp = value;
    }

    /**
     * Gets the value of the schCrit property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalanceQueryCriteria7 }
     *     
     */
    public IntraBalanceQueryCriteria7 getSchCrit() {
        return schCrit;
    }

    /**
     * Sets the value of the schCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalanceQueryCriteria7 }
     *     
     */
    public void setSchCrit(IntraBalanceQueryCriteria7 value) {
        this.schCrit = value;
    }

}
