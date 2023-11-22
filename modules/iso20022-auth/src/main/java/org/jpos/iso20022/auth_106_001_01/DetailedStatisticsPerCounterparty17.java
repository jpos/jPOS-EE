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

package org.jpos.iso20022.auth_106_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailedStatisticsPerCounterparty17 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DetailedStatisticsPerCounterparty17">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RefDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}ISODate"/>
 *         <element name="MssngValtn" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}DetailedMissingValuationsStatistics4Choice"/>
 *         <element name="MssngMrgnInf" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}DetailedMissingMarginInformationStatistics4Choice"/>
 *         <element name="AbnrmlVals" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}DetailedAbnormalValuesStatistics4Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedStatisticsPerCounterparty17", propOrder = {
    "refDt",
    "mssngValtn",
    "mssngMrgnInf",
    "abnrmlVals"
})
public class DetailedStatisticsPerCounterparty17 {

    @XmlElement(name = "RefDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar refDt;
    @XmlElement(name = "MssngValtn", required = true)
    protected DetailedMissingValuationsStatistics4Choice mssngValtn;
    @XmlElement(name = "MssngMrgnInf", required = true)
    protected DetailedMissingMarginInformationStatistics4Choice mssngMrgnInf;
    @XmlElement(name = "AbnrmlVals", required = true)
    protected DetailedAbnormalValuesStatistics4Choice abnrmlVals;

    /**
     * Gets the value of the refDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefDt() {
        return refDt;
    }

    /**
     * Sets the value of the refDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefDt(XMLGregorianCalendar value) {
        this.refDt = value;
    }

    /**
     * Gets the value of the mssngValtn property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedMissingValuationsStatistics4Choice }
     *     
     */
    public DetailedMissingValuationsStatistics4Choice getMssngValtn() {
        return mssngValtn;
    }

    /**
     * Sets the value of the mssngValtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedMissingValuationsStatistics4Choice }
     *     
     */
    public void setMssngValtn(DetailedMissingValuationsStatistics4Choice value) {
        this.mssngValtn = value;
    }

    /**
     * Gets the value of the mssngMrgnInf property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedMissingMarginInformationStatistics4Choice }
     *     
     */
    public DetailedMissingMarginInformationStatistics4Choice getMssngMrgnInf() {
        return mssngMrgnInf;
    }

    /**
     * Sets the value of the mssngMrgnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedMissingMarginInformationStatistics4Choice }
     *     
     */
    public void setMssngMrgnInf(DetailedMissingMarginInformationStatistics4Choice value) {
        this.mssngMrgnInf = value;
    }

    /**
     * Gets the value of the abnrmlVals property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAbnormalValuesStatistics4Choice }
     *     
     */
    public DetailedAbnormalValuesStatistics4Choice getAbnrmlVals() {
        return abnrmlVals;
    }

    /**
     * Sets the value of the abnrmlVals property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAbnormalValuesStatistics4Choice }
     *     
     */
    public void setAbnrmlVals(DetailedAbnormalValuesStatistics4Choice value) {
        this.abnrmlVals = value;
    }

}
