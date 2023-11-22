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

package org.jpos.iso20022.tsmt_013_001_03;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationResult5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ValidationResult5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.013.001.03}Number"/>
 *         <element name="RuleId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.013.001.03}Max35Text"/>
 *         <element name="RuleDesc" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.013.001.03}Max350Text"/>
 *         <element name="MisMtchdElmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.013.001.03}ElementIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationResult5", propOrder = {
    "seqNb",
    "ruleId",
    "ruleDesc",
    "misMtchdElmt"
})
public class ValidationResult5 {

    @XmlElement(name = "SeqNb", required = true)
    protected BigDecimal seqNb;
    @XmlElement(name = "RuleId", required = true)
    protected String ruleId;
    @XmlElement(name = "RuleDesc", required = true)
    protected String ruleDesc;
    @XmlElement(name = "MisMtchdElmt")
    protected List<ElementIdentification1> misMtchdElmt;

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeqNb(BigDecimal value) {
        this.seqNb = value;
    }

    /**
     * Gets the value of the ruleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * Sets the value of the ruleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleId(String value) {
        this.ruleId = value;
    }

    /**
     * Gets the value of the ruleDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleDesc() {
        return ruleDesc;
    }

    /**
     * Sets the value of the ruleDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleDesc(String value) {
        this.ruleDesc = value;
    }

    /**
     * Gets the value of the misMtchdElmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the misMtchdElmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMisMtchdElmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementIdentification1 }
     * 
     * 
     * @return
     *     The value of the misMtchdElmt property.
     */
    public List<ElementIdentification1> getMisMtchdElmt() {
        if (misMtchdElmt == null) {
            misMtchdElmt = new ArrayList<>();
        }
        return this.misMtchdElmt;
    }

}
