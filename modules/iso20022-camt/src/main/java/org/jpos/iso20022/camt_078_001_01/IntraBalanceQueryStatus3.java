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

package org.jpos.iso20022.camt_078_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraBalanceQueryStatus3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntraBalanceQueryStatus3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}IntraBalanceStatusType2"/>
 *         <element name="DtPrd" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}DateAndDateTimeSearch5Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalanceQueryStatus3", propOrder = {
    "tp",
    "dtPrd"
})
public class IntraBalanceQueryStatus3 {

    @XmlElement(name = "Tp", required = true)
    protected IntraBalanceStatusType2 tp;
    @XmlElement(name = "DtPrd")
    protected DateAndDateTimeSearch5Choice dtPrd;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalanceStatusType2 }
     *     
     */
    public IntraBalanceStatusType2 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalanceStatusType2 }
     *     
     */
    public void setTp(IntraBalanceStatusType2 value) {
        this.tp = value;
    }

    /**
     * Gets the value of the dtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public DateAndDateTimeSearch5Choice getDtPrd() {
        return dtPrd;
    }

    /**
     * Sets the value of the dtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public void setDtPrd(DateAndDateTimeSearch5Choice value) {
        this.dtPrd = value;
    }

}
