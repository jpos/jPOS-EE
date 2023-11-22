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

package org.jpos.iso20022.auth_058_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortfolioStressTestResult1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PortfolioStressTestResult1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrtflId" type="{urn:iso:std:iso:20022:tech:xsd:auth.058.001.01}GenericIdentification165"/>
 *         <element name="StrssLoss" type="{urn:iso:std:iso:20022:tech:xsd:auth.058.001.01}AmountAndDirection102"/>
 *         <element name="RawStrssLoss" type="{urn:iso:std:iso:20022:tech:xsd:auth.058.001.01}AmountAndDirection102" minOccurs="0"/>
 *         <element name="Cover1Flg" type="{urn:iso:std:iso:20022:tech:xsd:auth.058.001.01}TrueFalseIndicator"/>
 *         <element name="Cover2Flg" type="{urn:iso:std:iso:20022:tech:xsd:auth.058.001.01}TrueFalseIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioStressTestResult1", propOrder = {
    "prtflId",
    "strssLoss",
    "rawStrssLoss",
    "cover1Flg",
    "cover2Flg"
})
public class PortfolioStressTestResult1 {

    @XmlElement(name = "PrtflId", required = true)
    protected GenericIdentification165 prtflId;
    @XmlElement(name = "StrssLoss", required = true)
    protected AmountAndDirection102 strssLoss;
    @XmlElement(name = "RawStrssLoss")
    protected AmountAndDirection102 rawStrssLoss;
    @XmlElement(name = "Cover1Flg")
    protected boolean cover1Flg;
    @XmlElement(name = "Cover2Flg")
    protected boolean cover2Flg;

    /**
     * Gets the value of the prtflId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification165 }
     *     
     */
    public GenericIdentification165 getPrtflId() {
        return prtflId;
    }

    /**
     * Sets the value of the prtflId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification165 }
     *     
     */
    public void setPrtflId(GenericIdentification165 value) {
        this.prtflId = value;
    }

    /**
     * Gets the value of the strssLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getStrssLoss() {
        return strssLoss;
    }

    /**
     * Sets the value of the strssLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setStrssLoss(AmountAndDirection102 value) {
        this.strssLoss = value;
    }

    /**
     * Gets the value of the rawStrssLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getRawStrssLoss() {
        return rawStrssLoss;
    }

    /**
     * Sets the value of the rawStrssLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setRawStrssLoss(AmountAndDirection102 value) {
        this.rawStrssLoss = value;
    }

    /**
     * Gets the value of the cover1Flg property.
     * 
     */
    public boolean isCover1Flg() {
        return cover1Flg;
    }

    /**
     * Sets the value of the cover1Flg property.
     * 
     */
    public void setCover1Flg(boolean value) {
        this.cover1Flg = value;
    }

    /**
     * Gets the value of the cover2Flg property.
     * 
     */
    public boolean isCover2Flg() {
        return cover2Flg;
    }

    /**
     * Sets the value of the cover2Flg property.
     * 
     */
    public void setCover2Flg(boolean value) {
        this.cover2Flg = value;
    }

}
