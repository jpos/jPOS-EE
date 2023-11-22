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

package org.jpos.iso20022.seev_008_001_08;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Participation5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Participation5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlNbOfVtngRghts" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}Number" minOccurs="0"/>
 *         <element name="PctgOfVtngRghts" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}PercentageRate" minOccurs="0"/>
 *         <element name="TtlNbOfSctiesOutsdng" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}FinancialInstrumentQuantity18Choice" minOccurs="0"/>
 *         <element name="ClctnDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.008.001.08}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Participation5", propOrder = {
    "ttlNbOfVtngRghts",
    "pctgOfVtngRghts",
    "ttlNbOfSctiesOutsdng",
    "clctnDt"
})
public class Participation5 {

    @XmlElement(name = "TtlNbOfVtngRghts")
    protected BigDecimal ttlNbOfVtngRghts;
    @XmlElement(name = "PctgOfVtngRghts")
    protected BigDecimal pctgOfVtngRghts;
    @XmlElement(name = "TtlNbOfSctiesOutsdng")
    protected FinancialInstrumentQuantity18Choice ttlNbOfSctiesOutsdng;
    @XmlElement(name = "ClctnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar clctnDt;

    /**
     * Gets the value of the ttlNbOfVtngRghts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfVtngRghts() {
        return ttlNbOfVtngRghts;
    }

    /**
     * Sets the value of the ttlNbOfVtngRghts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNbOfVtngRghts(BigDecimal value) {
        this.ttlNbOfVtngRghts = value;
    }

    /**
     * Gets the value of the pctgOfVtngRghts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgOfVtngRghts() {
        return pctgOfVtngRghts;
    }

    /**
     * Sets the value of the pctgOfVtngRghts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctgOfVtngRghts(BigDecimal value) {
        this.pctgOfVtngRghts = value;
    }

    /**
     * Gets the value of the ttlNbOfSctiesOutsdng property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getTtlNbOfSctiesOutsdng() {
        return ttlNbOfSctiesOutsdng;
    }

    /**
     * Sets the value of the ttlNbOfSctiesOutsdng property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setTtlNbOfSctiesOutsdng(FinancialInstrumentQuantity18Choice value) {
        this.ttlNbOfSctiesOutsdng = value;
    }

    /**
     * Gets the value of the clctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClctnDt() {
        return clctnDt;
    }

    /**
     * Sets the value of the clctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClctnDt(XMLGregorianCalendar value) {
        this.clctnDt = value;
    }

}
