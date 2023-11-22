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

package org.jpos.iso20022.camt_037_001_09;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebitAuthorisation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DebitAuthorisation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CxlRsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.037.001.09}CancellationReason33Choice"/>
 *         <element name="AmtToDbt" type="{urn:iso:std:iso:20022:tech:xsd:camt.037.001.09}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ValDtToDbt" type="{urn:iso:std:iso:20022:tech:xsd:camt.037.001.09}ISODate" minOccurs="0"/>
 *         <element name="AddtlCxlRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.037.001.09}Max105Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitAuthorisation2", propOrder = {
    "cxlRsn",
    "amtToDbt",
    "valDtToDbt",
    "addtlCxlRsnInf"
})
public class DebitAuthorisation2 {

    @XmlElement(name = "CxlRsn", required = true)
    protected CancellationReason33Choice cxlRsn;
    @XmlElement(name = "AmtToDbt")
    protected ActiveOrHistoricCurrencyAndAmount amtToDbt;
    @XmlElement(name = "ValDtToDbt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDtToDbt;
    @XmlElement(name = "AddtlCxlRsnInf")
    protected List<String> addtlCxlRsnInf;

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReason33Choice }
     *     
     */
    public CancellationReason33Choice getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReason33Choice }
     *     
     */
    public void setCxlRsn(CancellationReason33Choice value) {
        this.cxlRsn = value;
    }

    /**
     * Gets the value of the amtToDbt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmtToDbt() {
        return amtToDbt;
    }

    /**
     * Sets the value of the amtToDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setAmtToDbt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amtToDbt = value;
    }

    /**
     * Gets the value of the valDtToDbt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValDtToDbt() {
        return valDtToDbt;
    }

    /**
     * Sets the value of the valDtToDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValDtToDbt(XMLGregorianCalendar value) {
        this.valDtToDbt = value;
    }

    /**
     * Gets the value of the addtlCxlRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlCxlRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlCxlRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlCxlRsnInf property.
     */
    public List<String> getAddtlCxlRsnInf() {
        if (addtlCxlRsnInf == null) {
            addtlCxlRsnInf = new ArrayList<>();
        }
        return this.addtlCxlRsnInf;
    }

}
