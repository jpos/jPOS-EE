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

package org.jpos.iso20022.pain_014_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCondition1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentCondition1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AmtModAllwd" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.10}TrueFalseIndicator"/>
 *         <element name="EarlyPmtAllwd" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.10}TrueFalseIndicator"/>
 *         <element name="DelyPnlty" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.10}Max140Text" minOccurs="0"/>
 *         <element name="ImdtPmtRbt" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.10}AmountOrRate1Choice" minOccurs="0"/>
 *         <element name="GrntedPmtReqd" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.10}TrueFalseIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCondition1", propOrder = {
    "amtModAllwd",
    "earlyPmtAllwd",
    "delyPnlty",
    "imdtPmtRbt",
    "grntedPmtReqd"
})
public class PaymentCondition1 {

    @XmlElement(name = "AmtModAllwd")
    protected boolean amtModAllwd;
    @XmlElement(name = "EarlyPmtAllwd")
    protected boolean earlyPmtAllwd;
    @XmlElement(name = "DelyPnlty")
    protected String delyPnlty;
    @XmlElement(name = "ImdtPmtRbt")
    protected AmountOrRate1Choice imdtPmtRbt;
    @XmlElement(name = "GrntedPmtReqd")
    protected boolean grntedPmtReqd;

    /**
     * Gets the value of the amtModAllwd property.
     * 
     */
    public boolean isAmtModAllwd() {
        return amtModAllwd;
    }

    /**
     * Sets the value of the amtModAllwd property.
     * 
     */
    public void setAmtModAllwd(boolean value) {
        this.amtModAllwd = value;
    }

    /**
     * Gets the value of the earlyPmtAllwd property.
     * 
     */
    public boolean isEarlyPmtAllwd() {
        return earlyPmtAllwd;
    }

    /**
     * Sets the value of the earlyPmtAllwd property.
     * 
     */
    public void setEarlyPmtAllwd(boolean value) {
        this.earlyPmtAllwd = value;
    }

    /**
     * Gets the value of the delyPnlty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelyPnlty() {
        return delyPnlty;
    }

    /**
     * Sets the value of the delyPnlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelyPnlty(String value) {
        this.delyPnlty = value;
    }

    /**
     * Gets the value of the imdtPmtRbt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrRate1Choice }
     *     
     */
    public AmountOrRate1Choice getImdtPmtRbt() {
        return imdtPmtRbt;
    }

    /**
     * Sets the value of the imdtPmtRbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrRate1Choice }
     *     
     */
    public void setImdtPmtRbt(AmountOrRate1Choice value) {
        this.imdtPmtRbt = value;
    }

    /**
     * Gets the value of the grntedPmtReqd property.
     * 
     */
    public boolean isGrntedPmtReqd() {
        return grntedPmtReqd;
    }

    /**
     * Sets the value of the grntedPmtReqd property.
     * 
     */
    public void setGrntedPmtReqd(boolean value) {
        this.grntedPmtReqd = value;
    }

}
