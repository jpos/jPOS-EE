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

package org.jpos.iso20022.tsmt_054_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GovernanceRules2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GovernanceRules2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}ID"/>
 *         <element name="RuleId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}GovernanceIdentification1Choice"/>
 *         <element name="AplblLaw" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}Location1" minOccurs="0"/>
 *         <element name="Jursdctn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}Location1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GovernanceRules2", propOrder = {
    "id",
    "ruleId",
    "aplblLaw",
    "jursdctn"
})
public class GovernanceRules2 {

    @XmlElement(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlElement(name = "RuleId", required = true)
    protected GovernanceIdentification1Choice ruleId;
    @XmlElement(name = "AplblLaw")
    protected Location1 aplblLaw;
    @XmlElement(name = "Jursdctn")
    protected List<Location1> jursdctn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the ruleId property.
     * 
     * @return
     *     possible object is
     *     {@link GovernanceIdentification1Choice }
     *     
     */
    public GovernanceIdentification1Choice getRuleId() {
        return ruleId;
    }

    /**
     * Sets the value of the ruleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernanceIdentification1Choice }
     *     
     */
    public void setRuleId(GovernanceIdentification1Choice value) {
        this.ruleId = value;
    }

    /**
     * Gets the value of the aplblLaw property.
     * 
     * @return
     *     possible object is
     *     {@link Location1 }
     *     
     */
    public Location1 getAplblLaw() {
        return aplblLaw;
    }

    /**
     * Sets the value of the aplblLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location1 }
     *     
     */
    public void setAplblLaw(Location1 value) {
        this.aplblLaw = value;
    }

    /**
     * Gets the value of the jursdctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the jursdctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJursdctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location1 }
     * 
     * 
     * @return
     *     The value of the jursdctn property.
     */
    public List<Location1> getJursdctn() {
        if (jursdctn == null) {
            jursdctn = new ArrayList<>();
        }
        return this.jursdctn;
    }

}
