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

package org.jpos.iso20022.seev_033_002_12;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionRate73 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionRate73">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PropsdRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}PercentageRate" minOccurs="0"/>
 *         <element name="OvrsbcptRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}RateAndAmountFormat43Choice" minOccurs="0"/>
 *         <element name="ReqdWhldgTaxRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}RateAndAmountFormat45Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ReqdScndLvlTaxRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}RateAndAmountFormat45Choice" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate73", propOrder = {
    "propsdRate",
    "ovrsbcptRate",
    "reqdWhldgTaxRate",
    "reqdScndLvlTaxRate"
})
public class CorporateActionRate73 {

    @XmlElement(name = "PropsdRate")
    protected BigDecimal propsdRate;
    @XmlElement(name = "OvrsbcptRate")
    protected RateAndAmountFormat43Choice ovrsbcptRate;
    @XmlElement(name = "ReqdWhldgTaxRate")
    protected List<RateAndAmountFormat45Choice> reqdWhldgTaxRate;
    @XmlElement(name = "ReqdScndLvlTaxRate")
    protected List<RateAndAmountFormat45Choice> reqdScndLvlTaxRate;

    /**
     * Gets the value of the propsdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPropsdRate() {
        return propsdRate;
    }

    /**
     * Sets the value of the propsdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPropsdRate(BigDecimal value) {
        this.propsdRate = value;
    }

    /**
     * Gets the value of the ovrsbcptRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public RateAndAmountFormat43Choice getOvrsbcptRate() {
        return ovrsbcptRate;
    }

    /**
     * Sets the value of the ovrsbcptRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public void setOvrsbcptRate(RateAndAmountFormat43Choice value) {
        this.ovrsbcptRate = value;
    }

    /**
     * Gets the value of the reqdWhldgTaxRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reqdWhldgTaxRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqdWhldgTaxRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateAndAmountFormat45Choice }
     * 
     * 
     * @return
     *     The value of the reqdWhldgTaxRate property.
     */
    public List<RateAndAmountFormat45Choice> getReqdWhldgTaxRate() {
        if (reqdWhldgTaxRate == null) {
            reqdWhldgTaxRate = new ArrayList<>();
        }
        return this.reqdWhldgTaxRate;
    }

    /**
     * Gets the value of the reqdScndLvlTaxRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reqdScndLvlTaxRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqdScndLvlTaxRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateAndAmountFormat45Choice }
     * 
     * 
     * @return
     *     The value of the reqdScndLvlTaxRate property.
     */
    public List<RateAndAmountFormat45Choice> getReqdScndLvlTaxRate() {
        if (reqdScndLvlTaxRate == null) {
            reqdScndLvlTaxRate = new ArrayList<>();
        }
        return this.reqdScndLvlTaxRate;
    }

}
