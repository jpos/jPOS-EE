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

package org.jpos.iso20022.sese_012_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundPortfolio8Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FundPortfolio8Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="TaxEffcntPdct" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}TaxEfficientProduct6"/>
 *         <element name="GnlInvstmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}GeneralInvestment2"/>
 *         <element name="Pnsn" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}Pension6"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundPortfolio8Choice", propOrder = {
    "taxEffcntPdct",
    "gnlInvstmt",
    "pnsn"
})
public class FundPortfolio8Choice {

    @XmlElement(name = "TaxEffcntPdct")
    protected TaxEfficientProduct6 taxEffcntPdct;
    @XmlElement(name = "GnlInvstmt")
    protected GeneralInvestment2 gnlInvstmt;
    @XmlElement(name = "Pnsn")
    protected Pension6 pnsn;

    /**
     * Gets the value of the taxEffcntPdct property.
     * 
     * @return
     *     possible object is
     *     {@link TaxEfficientProduct6 }
     *     
     */
    public TaxEfficientProduct6 getTaxEffcntPdct() {
        return taxEffcntPdct;
    }

    /**
     * Sets the value of the taxEffcntPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEfficientProduct6 }
     *     
     */
    public void setTaxEffcntPdct(TaxEfficientProduct6 value) {
        this.taxEffcntPdct = value;
    }

    /**
     * Gets the value of the gnlInvstmt property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralInvestment2 }
     *     
     */
    public GeneralInvestment2 getGnlInvstmt() {
        return gnlInvstmt;
    }

    /**
     * Sets the value of the gnlInvstmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralInvestment2 }
     *     
     */
    public void setGnlInvstmt(GeneralInvestment2 value) {
        this.gnlInvstmt = value;
    }

    /**
     * Gets the value of the pnsn property.
     * 
     * @return
     *     possible object is
     *     {@link Pension6 }
     *     
     */
    public Pension6 getPnsn() {
        return pnsn;
    }

    /**
     * Sets the value of the pnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pension6 }
     *     
     */
    public void setPnsn(Pension6 value) {
        this.pnsn = value;
    }

}
