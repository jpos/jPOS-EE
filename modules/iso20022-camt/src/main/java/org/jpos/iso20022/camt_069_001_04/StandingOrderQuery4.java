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

package org.jpos.iso20022.camt_069_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandingOrderQuery4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StandingOrderQuery4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="QryTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}QueryType2Code" minOccurs="0"/>
 *         <element name="StgOrdrCrit" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}StandingOrderCriteria4Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrderQuery4", propOrder = {
    "qryTp",
    "stgOrdrCrit"
})
public class StandingOrderQuery4 {

    @XmlElement(name = "QryTp")
    @XmlSchemaType(name = "string")
    protected QueryType2Code qryTp;
    @XmlElement(name = "StgOrdrCrit")
    protected StandingOrderCriteria4Choice stgOrdrCrit;

    /**
     * Gets the value of the qryTp property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType2Code }
     *     
     */
    public QueryType2Code getQryTp() {
        return qryTp;
    }

    /**
     * Sets the value of the qryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType2Code }
     *     
     */
    public void setQryTp(QueryType2Code value) {
        this.qryTp = value;
    }

    /**
     * Gets the value of the stgOrdrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderCriteria4Choice }
     *     
     */
    public StandingOrderCriteria4Choice getStgOrdrCrit() {
        return stgOrdrCrit;
    }

    /**
     * Sets the value of the stgOrdrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderCriteria4Choice }
     *     
     */
    public void setStgOrdrCrit(StandingOrderCriteria4Choice value) {
        this.stgOrdrCrit = value;
    }

}
