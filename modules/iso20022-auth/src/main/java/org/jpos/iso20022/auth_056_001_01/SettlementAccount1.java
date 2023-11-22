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

package org.jpos.iso20022.auth_056_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementAccount1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementAccount1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.056.001.01}GenericIdentification165"/>
 *         <element name="EndOfDayInitlMrgnClld" type="{urn:iso:std:iso:20022:tech:xsd:auth.056.001.01}AmountAndDirection102"/>
 *         <element name="EndOfDayVartnMrgnClld" type="{urn:iso:std:iso:20022:tech:xsd:auth.056.001.01}AmountAndDirection102"/>
 *         <element name="EndOfDayDfltFndClld" type="{urn:iso:std:iso:20022:tech:xsd:auth.056.001.01}AmountAndDirection102"/>
 *         <element name="EndOfDaySttlmClld" type="{urn:iso:std:iso:20022:tech:xsd:auth.056.001.01}AmountAndDirection102"/>
 *         <element name="EndOfDayOthrClld" type="{urn:iso:std:iso:20022:tech:xsd:auth.056.001.01}AmountAndDirection102"/>
 *         <element name="EndOfDayLqdtyClld" type="{urn:iso:std:iso:20022:tech:xsd:auth.056.001.01}AmountAndDirection102"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementAccount1", propOrder = {
    "id",
    "endOfDayInitlMrgnClld",
    "endOfDayVartnMrgnClld",
    "endOfDayDfltFndClld",
    "endOfDaySttlmClld",
    "endOfDayOthrClld",
    "endOfDayLqdtyClld"
})
public class SettlementAccount1 {

    @XmlElement(name = "Id", required = true)
    protected GenericIdentification165 id;
    @XmlElement(name = "EndOfDayInitlMrgnClld", required = true)
    protected AmountAndDirection102 endOfDayInitlMrgnClld;
    @XmlElement(name = "EndOfDayVartnMrgnClld", required = true)
    protected AmountAndDirection102 endOfDayVartnMrgnClld;
    @XmlElement(name = "EndOfDayDfltFndClld", required = true)
    protected AmountAndDirection102 endOfDayDfltFndClld;
    @XmlElement(name = "EndOfDaySttlmClld", required = true)
    protected AmountAndDirection102 endOfDaySttlmClld;
    @XmlElement(name = "EndOfDayOthrClld", required = true)
    protected AmountAndDirection102 endOfDayOthrClld;
    @XmlElement(name = "EndOfDayLqdtyClld", required = true)
    protected AmountAndDirection102 endOfDayLqdtyClld;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification165 }
     *     
     */
    public GenericIdentification165 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification165 }
     *     
     */
    public void setId(GenericIdentification165 value) {
        this.id = value;
    }

    /**
     * Gets the value of the endOfDayInitlMrgnClld property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getEndOfDayInitlMrgnClld() {
        return endOfDayInitlMrgnClld;
    }

    /**
     * Sets the value of the endOfDayInitlMrgnClld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setEndOfDayInitlMrgnClld(AmountAndDirection102 value) {
        this.endOfDayInitlMrgnClld = value;
    }

    /**
     * Gets the value of the endOfDayVartnMrgnClld property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getEndOfDayVartnMrgnClld() {
        return endOfDayVartnMrgnClld;
    }

    /**
     * Sets the value of the endOfDayVartnMrgnClld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setEndOfDayVartnMrgnClld(AmountAndDirection102 value) {
        this.endOfDayVartnMrgnClld = value;
    }

    /**
     * Gets the value of the endOfDayDfltFndClld property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getEndOfDayDfltFndClld() {
        return endOfDayDfltFndClld;
    }

    /**
     * Sets the value of the endOfDayDfltFndClld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setEndOfDayDfltFndClld(AmountAndDirection102 value) {
        this.endOfDayDfltFndClld = value;
    }

    /**
     * Gets the value of the endOfDaySttlmClld property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getEndOfDaySttlmClld() {
        return endOfDaySttlmClld;
    }

    /**
     * Sets the value of the endOfDaySttlmClld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setEndOfDaySttlmClld(AmountAndDirection102 value) {
        this.endOfDaySttlmClld = value;
    }

    /**
     * Gets the value of the endOfDayOthrClld property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getEndOfDayOthrClld() {
        return endOfDayOthrClld;
    }

    /**
     * Sets the value of the endOfDayOthrClld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setEndOfDayOthrClld(AmountAndDirection102 value) {
        this.endOfDayOthrClld = value;
    }

    /**
     * Gets the value of the endOfDayLqdtyClld property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getEndOfDayLqdtyClld() {
        return endOfDayLqdtyClld;
    }

    /**
     * Sets the value of the endOfDayLqdtyClld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setEndOfDayLqdtyClld(AmountAndDirection102 value) {
        this.endOfDayLqdtyClld = value;
    }

}
