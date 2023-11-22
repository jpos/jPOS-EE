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

package org.jpos.iso20022.auth_034_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxReportHeader1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TaxReportHeader1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}MessageIdentification1"/>
 *         <element name="NbOfTaxRpts" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}Number" minOccurs="0"/>
 *         <element name="TaxAuthrty" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}TaxOrganisationIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxReportHeader1", propOrder = {
    "msgId",
    "nbOfTaxRpts",
    "taxAuthrty"
})
public class TaxReportHeader1 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "NbOfTaxRpts")
    protected BigDecimal nbOfTaxRpts;
    @XmlElement(name = "TaxAuthrty")
    protected List<TaxOrganisationIdentification1> taxAuthrty;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setMsgId(MessageIdentification1 value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the nbOfTaxRpts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfTaxRpts() {
        return nbOfTaxRpts;
    }

    /**
     * Sets the value of the nbOfTaxRpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfTaxRpts(BigDecimal value) {
        this.nbOfTaxRpts = value;
    }

    /**
     * Gets the value of the taxAuthrty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxAuthrty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxAuthrty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxOrganisationIdentification1 }
     * 
     * 
     * @return
     *     The value of the taxAuthrty property.
     */
    public List<TaxOrganisationIdentification1> getTaxAuthrty() {
        if (taxAuthrty == null) {
            taxAuthrty = new ArrayList<>();
        }
        return this.taxAuthrty;
    }

}
