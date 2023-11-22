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

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementFailsDailyData3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementFailsDailyData3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptgDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}ISODate"/>
 *         <element name="DalyRcrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementFailsDailyInstrument3"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsDailyData3", propOrder = {
    "rptgDt",
    "dalyRcrd"
})
public class SettlementFailsDailyData3 {

    @XmlElement(name = "RptgDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rptgDt;
    @XmlElement(name = "DalyRcrd", required = true)
    protected SettlementFailsDailyInstrument3 dalyRcrd;

    /**
     * Gets the value of the rptgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRptgDt() {
        return rptgDt;
    }

    /**
     * Sets the value of the rptgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRptgDt(XMLGregorianCalendar value) {
        this.rptgDt = value;
    }

    /**
     * Gets the value of the dalyRcrd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDailyInstrument3 }
     *     
     */
    public SettlementFailsDailyInstrument3 getDalyRcrd() {
        return dalyRcrd;
    }

    /**
     * Sets the value of the dalyRcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDailyInstrument3 }
     *     
     */
    public void setDalyRcrd(SettlementFailsDailyInstrument3 value) {
        this.dalyRcrd = value;
    }

}
