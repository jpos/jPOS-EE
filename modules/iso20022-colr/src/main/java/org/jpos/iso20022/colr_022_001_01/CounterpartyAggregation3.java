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

package org.jpos.iso20022.colr_022_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterpartyAggregation3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CounterpartyAggregation3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}OptionType6Choice" minOccurs="0"/>
 *         <element name="TermntnOptn" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}RepoTerminationOption1Code" minOccurs="0"/>
 *         <element name="BsktIdAndElgbltySetPrfl" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}BasketIdentificationAndEligibilitySetProfile1" minOccurs="0"/>
 *         <element name="CollPties" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}CollateralParties11"/>
 *         <element name="ValtnAmts" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}CollateralAmount16" maxOccurs="unbounded"/>
 *         <element name="MrgnRate" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="GblCtrPtySts" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}CollateralStatus1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyAggregation3", propOrder = {
    "optnTp",
    "termntnOptn",
    "bsktIdAndElgbltySetPrfl",
    "collPties",
    "valtnAmts",
    "mrgnRate",
    "gblCtrPtySts"
})
public class CounterpartyAggregation3 {

    @XmlElement(name = "OptnTp")
    protected OptionType6Choice optnTp;
    @XmlElement(name = "TermntnOptn")
    @XmlSchemaType(name = "string")
    protected RepoTerminationOption1Code termntnOptn;
    @XmlElement(name = "BsktIdAndElgbltySetPrfl")
    protected BasketIdentificationAndEligibilitySetProfile1 bsktIdAndElgbltySetPrfl;
    @XmlElement(name = "CollPties", required = true)
    protected CollateralParties11 collPties;
    @XmlElement(name = "ValtnAmts", required = true)
    protected List<CollateralAmount16> valtnAmts;
    @XmlElement(name = "MrgnRate")
    protected BigDecimal mrgnRate;
    @XmlElement(name = "GblCtrPtySts")
    @XmlSchemaType(name = "string")
    protected CollateralStatus1Code gblCtrPtySts;

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType6Choice }
     *     
     */
    public OptionType6Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType6Choice }
     *     
     */
    public void setOptnTp(OptionType6Choice value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the termntnOptn property.
     * 
     * @return
     *     possible object is
     *     {@link RepoTerminationOption1Code }
     *     
     */
    public RepoTerminationOption1Code getTermntnOptn() {
        return termntnOptn;
    }

    /**
     * Sets the value of the termntnOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepoTerminationOption1Code }
     *     
     */
    public void setTermntnOptn(RepoTerminationOption1Code value) {
        this.termntnOptn = value;
    }

    /**
     * Gets the value of the bsktIdAndElgbltySetPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link BasketIdentificationAndEligibilitySetProfile1 }
     *     
     */
    public BasketIdentificationAndEligibilitySetProfile1 getBsktIdAndElgbltySetPrfl() {
        return bsktIdAndElgbltySetPrfl;
    }

    /**
     * Sets the value of the bsktIdAndElgbltySetPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasketIdentificationAndEligibilitySetProfile1 }
     *     
     */
    public void setBsktIdAndElgbltySetPrfl(BasketIdentificationAndEligibilitySetProfile1 value) {
        this.bsktIdAndElgbltySetPrfl = value;
    }

    /**
     * Gets the value of the collPties property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralParties11 }
     *     
     */
    public CollateralParties11 getCollPties() {
        return collPties;
    }

    /**
     * Sets the value of the collPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralParties11 }
     *     
     */
    public void setCollPties(CollateralParties11 value) {
        this.collPties = value;
    }

    /**
     * Gets the value of the valtnAmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the valtnAmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValtnAmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralAmount16 }
     * 
     * 
     * @return
     *     The value of the valtnAmts property.
     */
    public List<CollateralAmount16> getValtnAmts() {
        if (valtnAmts == null) {
            valtnAmts = new ArrayList<>();
        }
        return this.valtnAmts;
    }

    /**
     * Gets the value of the mrgnRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMrgnRate() {
        return mrgnRate;
    }

    /**
     * Sets the value of the mrgnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMrgnRate(BigDecimal value) {
        this.mrgnRate = value;
    }

    /**
     * Gets the value of the gblCtrPtySts property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralStatus1Code }
     *     
     */
    public CollateralStatus1Code getGblCtrPtySts() {
        return gblCtrPtySts;
    }

    /**
     * Sets the value of the gblCtrPtySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralStatus1Code }
     *     
     */
    public void setGblCtrPtySts(CollateralStatus1Code value) {
        this.gblCtrPtySts = value;
    }

}
