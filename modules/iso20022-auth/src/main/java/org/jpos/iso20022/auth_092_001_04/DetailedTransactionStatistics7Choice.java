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

package org.jpos.iso20022.auth_092_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailedTransactionStatistics7Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DetailedTransactionStatistics7Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="DataSetActn" type="{urn:iso:std:iso:20022:tech:xsd:auth.092.001.04}ReportPeriodActivity1Code"/>
 *         <element name="DtldSttstcs" type="{urn:iso:std:iso:20022:tech:xsd:auth.092.001.04}DetailedTransactionStatistics30"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedTransactionStatistics7Choice", propOrder = {
    "dataSetActn",
    "dtldSttstcs"
})
public class DetailedTransactionStatistics7Choice {

    @XmlElement(name = "DataSetActn")
    @XmlSchemaType(name = "string")
    protected ReportPeriodActivity1Code dataSetActn;
    @XmlElement(name = "DtldSttstcs")
    protected DetailedTransactionStatistics30 dtldSttstcs;

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
     * Gets the value of the dtldSttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedTransactionStatistics30 }
     *     
     */
    public DetailedTransactionStatistics30 getDtldSttstcs() {
        return dtldSttstcs;
    }

    /**
     * Sets the value of the dtldSttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedTransactionStatistics30 }
     *     
     */
    public void setDtldSttstcs(DetailedTransactionStatistics30 value) {
        this.dtldSttstcs = value;
    }

}
