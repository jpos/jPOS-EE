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

package org.jpos.iso20022.semt_007_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountIdentificationFormatChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountIdentificationFormatChoice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="SmplId" type="{urn:swift:xsd:semt.007.001.03}AccountIdentification1"/>
 *           <element name="IdAndPurp" type="{urn:swift:xsd:semt.007.001.03}AccountIdentificationAndPurpose"/>
 *           <element name="IdAsDSS" type="{urn:swift:xsd:semt.007.001.03}AccountIdentification3"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountIdentificationFormatChoice", propOrder = {
    "smplId",
    "idAndPurp",
    "idAsDSS"
})
public class AccountIdentificationFormatChoice {

    @XmlElement(name = "SmplId")
    protected AccountIdentification1 smplId;
    @XmlElement(name = "IdAndPurp")
    protected AccountIdentificationAndPurpose idAndPurp;
    @XmlElement(name = "IdAsDSS")
    protected AccountIdentification3 idAsDSS;

    /**
     * Gets the value of the smplId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification1 }
     *     
     */
    public AccountIdentification1 getSmplId() {
        return smplId;
    }

    /**
     * Sets the value of the smplId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification1 }
     *     
     */
    public void setSmplId(AccountIdentification1 value) {
        this.smplId = value;
    }

    /**
     * Gets the value of the idAndPurp property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndPurpose }
     *     
     */
    public AccountIdentificationAndPurpose getIdAndPurp() {
        return idAndPurp;
    }

    /**
     * Sets the value of the idAndPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndPurpose }
     *     
     */
    public void setIdAndPurp(AccountIdentificationAndPurpose value) {
        this.idAndPurp = value;
    }

    /**
     * Gets the value of the idAsDSS property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification3 }
     *     
     */
    public AccountIdentification3 getIdAsDSS() {
        return idAsDSS;
    }

    /**
     * Sets the value of the idAsDSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification3 }
     *     
     */
    public void setIdAsDSS(AccountIdentification3 value) {
        this.idAsDSS = value;
    }

}
