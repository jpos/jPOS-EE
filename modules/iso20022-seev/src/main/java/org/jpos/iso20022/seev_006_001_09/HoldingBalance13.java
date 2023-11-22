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

package org.jpos.iso20022.seev_006_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoldingBalance13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HoldingBalance13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Bal" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}SignedQuantityFormat14"/>
 *         <element name="BalTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}SecuritiesEntryType3Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldingBalance13", propOrder = {
    "bal",
    "balTp"
})
public class HoldingBalance13 {

    @XmlElement(name = "Bal", required = true)
    protected SignedQuantityFormat14 bal;
    @XmlElement(name = "BalTp", required = true)
    @XmlSchemaType(name = "string")
    protected SecuritiesEntryType3Code balTp;

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat14 }
     *     
     */
    public SignedQuantityFormat14 getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat14 }
     *     
     */
    public void setBal(SignedQuantityFormat14 value) {
        this.bal = value;
    }

    /**
     * Gets the value of the balTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesEntryType3Code }
     *     
     */
    public SecuritiesEntryType3Code getBalTp() {
        return balTp;
    }

    /**
     * Sets the value of the balTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesEntryType3Code }
     *     
     */
    public void setBalTp(SecuritiesEntryType3Code value) {
        this.balTp = value;
    }

}
