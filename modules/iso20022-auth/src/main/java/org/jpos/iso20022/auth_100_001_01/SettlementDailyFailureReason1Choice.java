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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementDailyFailureReason1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementDailyFailureReason1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="DataSetActn" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}ReportPeriodActivity1Code"/>
 *         <element name="Data" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementDailyFailureReason3"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDailyFailureReason1Choice", propOrder = {
    "dataSetActn",
    "data"
})
public class SettlementDailyFailureReason1Choice {

    @XmlElement(name = "DataSetActn")
    @XmlSchemaType(name = "string")
    protected ReportPeriodActivity1Code dataSetActn;
    @XmlElement(name = "Data")
    protected SettlementDailyFailureReason3 data;

    /**
     * Gets the value of the dataSetActn property.
     * 
     * @return
     *     possible object is
     *     {@link ReportPeriodActivity1Code }
     *     
     */
    public ReportPeriodActivity1Code getDataSetActn() {
        return dataSetActn;
    }

    /**
     * Sets the value of the dataSetActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportPeriodActivity1Code }
     *     
     */
    public void setDataSetActn(ReportPeriodActivity1Code value) {
        this.dataSetActn = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDailyFailureReason3 }
     *     
     */
    public SettlementDailyFailureReason3 getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDailyFailureReason3 }
     *     
     */
    public void setData(SettlementDailyFailureReason3 value) {
        this.data = value;
    }

}
