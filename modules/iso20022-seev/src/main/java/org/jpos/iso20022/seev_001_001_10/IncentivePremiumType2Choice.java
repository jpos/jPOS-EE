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

package org.jpos.iso20022.seev_001_001_10;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncentivePremiumType2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IncentivePremiumType2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PerScty" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Number"/>
 *         <element name="PerVote" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}VoteTypeAndQuantity1" maxOccurs="unbounded"/>
 *         <element name="PerAttndee" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}YesNoIndicator"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentivePremiumType2Choice", propOrder = {
    "perScty",
    "perVote",
    "perAttndee"
})
public class IncentivePremiumType2Choice {

    @XmlElement(name = "PerScty")
    protected BigDecimal perScty;
    @XmlElement(name = "PerVote")
    protected List<VoteTypeAndQuantity1> perVote;
    @XmlElement(name = "PerAttndee")
    protected Boolean perAttndee;

    /**
     * Gets the value of the perScty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerScty() {
        return perScty;
    }

    /**
     * Sets the value of the perScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerScty(BigDecimal value) {
        this.perScty = value;
    }

    /**
     * Gets the value of the perVote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the perVote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerVote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoteTypeAndQuantity1 }
     * 
     * 
     * @return
     *     The value of the perVote property.
     */
    public List<VoteTypeAndQuantity1> getPerVote() {
        if (perVote == null) {
            perVote = new ArrayList<>();
        }
        return this.perVote;
    }

    /**
     * Gets the value of the perAttndee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerAttndee() {
        return perAttndee;
    }

    /**
     * Sets the value of the perAttndee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerAttndee(Boolean value) {
        this.perAttndee = value;
    }

}
