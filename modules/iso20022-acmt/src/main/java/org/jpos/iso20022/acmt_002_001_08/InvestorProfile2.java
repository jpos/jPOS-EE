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

package org.jpos.iso20022.acmt_002_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestorProfile2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvestorProfile2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}ProfileType1Choice" minOccurs="0"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}InvestorProfileStatus1Choice" minOccurs="0"/>
 *         <element name="Trsr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}TreasuryProfile1" minOccurs="0"/>
 *         <element name="HghFrqcyTradg" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}HighFrequencyTradingProfile1" minOccurs="0"/>
 *         <element name="MktMakr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}MarketMakerProfile2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestorProfile2", propOrder = {
    "tp",
    "sts",
    "trsr",
    "hghFrqcyTradg",
    "mktMakr"
})
public class InvestorProfile2 {

    @XmlElement(name = "Tp")
    protected ProfileType1Choice tp;
    @XmlElement(name = "Sts")
    protected InvestorProfileStatus1Choice sts;
    @XmlElement(name = "Trsr")
    protected TreasuryProfile1 trsr;
    @XmlElement(name = "HghFrqcyTradg")
    protected HighFrequencyTradingProfile1 hghFrqcyTradg;
    @XmlElement(name = "MktMakr")
    protected MarketMakerProfile2 mktMakr;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileType1Choice }
     *     
     */
    public ProfileType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileType1Choice }
     *     
     */
    public void setTp(ProfileType1Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorProfileStatus1Choice }
     *     
     */
    public InvestorProfileStatus1Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorProfileStatus1Choice }
     *     
     */
    public void setSts(InvestorProfileStatus1Choice value) {
        this.sts = value;
    }

    /**
     * Gets the value of the trsr property.
     * 
     * @return
     *     possible object is
     *     {@link TreasuryProfile1 }
     *     
     */
    public TreasuryProfile1 getTrsr() {
        return trsr;
    }

    /**
     * Sets the value of the trsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreasuryProfile1 }
     *     
     */
    public void setTrsr(TreasuryProfile1 value) {
        this.trsr = value;
    }

    /**
     * Gets the value of the hghFrqcyTradg property.
     * 
     * @return
     *     possible object is
     *     {@link HighFrequencyTradingProfile1 }
     *     
     */
    public HighFrequencyTradingProfile1 getHghFrqcyTradg() {
        return hghFrqcyTradg;
    }

    /**
     * Sets the value of the hghFrqcyTradg property.
     * 
     * @param value
     *     allowed object is
     *     {@link HighFrequencyTradingProfile1 }
     *     
     */
    public void setHghFrqcyTradg(HighFrequencyTradingProfile1 value) {
        this.hghFrqcyTradg = value;
    }

    /**
     * Gets the value of the mktMakr property.
     * 
     * @return
     *     possible object is
     *     {@link MarketMakerProfile2 }
     *     
     */
    public MarketMakerProfile2 getMktMakr() {
        return mktMakr;
    }

    /**
     * Sets the value of the mktMakr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketMakerProfile2 }
     *     
     */
    public void setMktMakr(MarketMakerProfile2 value) {
        this.mktMakr = value;
    }

}
