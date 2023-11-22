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

package org.jpos.iso20022.sese_018_001_09;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoneyPurchaseAnnualAllowance1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MoneyPurchaseAnnualAllowance1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Trggrd" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}YesNoIndicator"/>
 *         <element name="TrggrdDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyPurchaseAnnualAllowance1", propOrder = {
    "trggrd",
    "trggrdDt"
})
public class MoneyPurchaseAnnualAllowance1 {

    @XmlElement(name = "Trggrd")
    protected boolean trggrd;
    @XmlElement(name = "TrggrdDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar trggrdDt;

    /**
     * Gets the value of the trggrd property.
     * 
     */
    public boolean isTrggrd() {
        return trggrd;
    }

    /**
     * Sets the value of the trggrd property.
     * 
     */
    public void setTrggrd(boolean value) {
        this.trggrd = value;
    }

    /**
     * Gets the value of the trggrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrggrdDt() {
        return trggrdDt;
    }

    /**
     * Sets the value of the trggrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrggrdDt(XMLGregorianCalendar value) {
        this.trggrdDt = value;
    }

}
