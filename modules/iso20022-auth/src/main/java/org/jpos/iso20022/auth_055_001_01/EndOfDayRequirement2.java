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

package org.jpos.iso20022.auth_055_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndOfDayRequirement2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EndOfDayRequirement2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InitlMrgnRqrmnts" type="{urn:iso:std:iso:20022:tech:xsd:auth.055.001.01}InitialMarginRequirement1"/>
 *         <element name="VartnMrgnRqrmnts" type="{urn:iso:std:iso:20022:tech:xsd:auth.055.001.01}AmountAndDirection102"/>
 *         <element name="MrgnAcctId" type="{urn:iso:std:iso:20022:tech:xsd:auth.055.001.01}GenericIdentification165"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndOfDayRequirement2", propOrder = {
    "initlMrgnRqrmnts",
    "vartnMrgnRqrmnts",
    "mrgnAcctId"
})
public class EndOfDayRequirement2 {

    @XmlElement(name = "InitlMrgnRqrmnts", required = true)
    protected InitialMarginRequirement1 initlMrgnRqrmnts;
    @XmlElement(name = "VartnMrgnRqrmnts", required = true)
    protected AmountAndDirection102 vartnMrgnRqrmnts;
    @XmlElement(name = "MrgnAcctId", required = true)
    protected GenericIdentification165 mrgnAcctId;

    /**
     * Gets the value of the initlMrgnRqrmnts property.
     * 
     * @return
     *     possible object is
     *     {@link InitialMarginRequirement1 }
     *     
     */
    public InitialMarginRequirement1 getInitlMrgnRqrmnts() {
        return initlMrgnRqrmnts;
    }

    /**
     * Sets the value of the initlMrgnRqrmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialMarginRequirement1 }
     *     
     */
    public void setInitlMrgnRqrmnts(InitialMarginRequirement1 value) {
        this.initlMrgnRqrmnts = value;
    }

    /**
     * Gets the value of the vartnMrgnRqrmnts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getVartnMrgnRqrmnts() {
        return vartnMrgnRqrmnts;
    }

    /**
     * Sets the value of the vartnMrgnRqrmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setVartnMrgnRqrmnts(AmountAndDirection102 value) {
        this.vartnMrgnRqrmnts = value;
    }

    /**
     * Gets the value of the mrgnAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification165 }
     *     
     */
    public GenericIdentification165 getMrgnAcctId() {
        return mrgnAcctId;
    }

    /**
     * Sets the value of the mrgnAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification165 }
     *     
     */
    public void setMrgnAcctId(GenericIdentification165 value) {
        this.mrgnAcctId = value;
    }

}
