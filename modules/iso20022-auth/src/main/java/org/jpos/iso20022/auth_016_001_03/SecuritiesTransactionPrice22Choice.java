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

package org.jpos.iso20022.auth_016_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTransactionPrice22Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesTransactionPrice22Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Pric" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}SecuritiesTransactionPrice2Choice"/>
 *         <element name="DgtlTknPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}SecuritiesTransactionPrice7"/>
 *         <element name="NoPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}SecuritiesTransactionPrice6"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPrice22Choice", propOrder = {
    "pric",
    "dgtlTknPric",
    "noPric"
})
public class SecuritiesTransactionPrice22Choice {

    @XmlElement(name = "Pric")
    protected SecuritiesTransactionPrice2Choice pric;
    @XmlElement(name = "DgtlTknPric")
    protected SecuritiesTransactionPrice7 dgtlTknPric;
    @XmlElement(name = "NoPric")
    protected SecuritiesTransactionPrice6 noPric;

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public SecuritiesTransactionPrice2Choice getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public void setPric(SecuritiesTransactionPrice2Choice value) {
        this.pric = value;
    }

    /**
     * Gets the value of the dgtlTknPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice7 }
     *     
     */
    public SecuritiesTransactionPrice7 getDgtlTknPric() {
        return dgtlTknPric;
    }

    /**
     * Sets the value of the dgtlTknPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice7 }
     *     
     */
    public void setDgtlTknPric(SecuritiesTransactionPrice7 value) {
        this.dgtlTknPric = value;
    }

    /**
     * Gets the value of the noPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice6 }
     *     
     */
    public SecuritiesTransactionPrice6 getNoPric() {
        return noPric;
    }

    /**
     * Sets the value of the noPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice6 }
     *     
     */
    public void setNoPric(SecuritiesTransactionPrice6 value) {
        this.noPric = value;
    }

}
