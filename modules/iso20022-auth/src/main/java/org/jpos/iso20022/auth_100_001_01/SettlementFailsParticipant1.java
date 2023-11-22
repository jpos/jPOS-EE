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

package org.jpos.iso20022.auth_100_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementFailsParticipant1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementFailsParticipant1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}LEIIdentifier"/>
 *         <element name="Rank" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}Max2NumericText"/>
 *         <element name="Aggt" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementTotalData1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsParticipant1", propOrder = {
    "lei",
    "rank",
    "aggt"
})
public class SettlementFailsParticipant1 {

    @XmlElement(name = "LEI", required = true)
    protected String lei;
    @XmlElement(name = "Rank", required = true)
    protected String rank;
    @XmlElement(name = "Aggt", required = true)
    protected SettlementTotalData1 aggt;

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEI(String value) {
        this.lei = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRank(String value) {
        this.rank = value;
    }

    /**
     * Gets the value of the aggt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1 }
     *     
     */
    public SettlementTotalData1 getAggt() {
        return aggt;
    }

    /**
     * Sets the value of the aggt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1 }
     *     
     */
    public void setAggt(SettlementTotalData1 value) {
        this.aggt = value;
    }

}
