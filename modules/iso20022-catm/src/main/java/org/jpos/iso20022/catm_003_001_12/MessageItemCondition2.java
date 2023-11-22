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

package org.jpos.iso20022.catm_003_001_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageItemCondition2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MessageItemCondition2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ItmId" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max140Text"/>
 *         <element name="Cond" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}MessageItemCondition2Code"/>
 *         <element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max140Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageItemCondition2", propOrder = {
    "itmId",
    "cond",
    "val"
})
public class MessageItemCondition2 {

    @XmlElement(name = "ItmId", required = true)
    protected String itmId;
    @XmlElement(name = "Cond", required = true)
    @XmlSchemaType(name = "string")
    protected MessageItemCondition2Code cond;
    @XmlElement(name = "Val")
    protected List<String> val;

    /**
     * Gets the value of the itmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmId() {
        return itmId;
    }

    /**
     * Sets the value of the itmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItmId(String value) {
        this.itmId = value;
    }

    /**
     * Gets the value of the cond property.
     * 
     * @return
     *     possible object is
     *     {@link MessageItemCondition2Code }
     *     
     */
    public MessageItemCondition2Code getCond() {
        return cond;
    }

    /**
     * Sets the value of the cond property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageItemCondition2Code }
     *     
     */
    public void setCond(MessageItemCondition2Code value) {
        this.cond = value;
    }

    /**
     * Gets the value of the val property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the val property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the val property.
     */
    public List<String> getVal() {
        if (val == null) {
            val = new ArrayList<>();
        }
        return this.val;
    }

}
