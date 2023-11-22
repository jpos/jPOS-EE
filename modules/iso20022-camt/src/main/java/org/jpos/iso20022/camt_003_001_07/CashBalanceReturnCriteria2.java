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

package org.jpos.iso20022.camt_003_001_07;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashBalanceReturnCriteria2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashBalanceReturnCriteria2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TpInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.003.001.07}RequestedIndicator"/>
 *         <element name="StsInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.003.001.07}RequestedIndicator"/>
 *         <element name="ValDtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.003.001.07}RequestedIndicator"/>
 *         <element name="PrcgDtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.003.001.07}RequestedIndicator"/>
 *         <element name="NbOfPmtsInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.003.001.07}RequestedIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashBalanceReturnCriteria2", propOrder = {
    "tpInd",
    "stsInd",
    "valDtInd",
    "prcgDtInd",
    "nbOfPmtsInd"
})
public class CashBalanceReturnCriteria2 {

    @XmlElement(name = "TpInd")
    protected boolean tpInd;
    @XmlElement(name = "StsInd")
    protected boolean stsInd;
    @XmlElement(name = "ValDtInd")
    protected boolean valDtInd;
    @XmlElement(name = "PrcgDtInd")
    protected boolean prcgDtInd;
    @XmlElement(name = "NbOfPmtsInd")
    protected boolean nbOfPmtsInd;

    /**
     * Gets the value of the tpInd property.
     * 
     */
    public boolean isTpInd() {
        return tpInd;
    }

    /**
     * Sets the value of the tpInd property.
     * 
     */
    public void setTpInd(boolean value) {
        this.tpInd = value;
    }

    /**
     * Gets the value of the stsInd property.
     * 
     */
    public boolean isStsInd() {
        return stsInd;
    }

    /**
     * Sets the value of the stsInd property.
     * 
     */
    public void setStsInd(boolean value) {
        this.stsInd = value;
    }

    /**
     * Gets the value of the valDtInd property.
     * 
     */
    public boolean isValDtInd() {
        return valDtInd;
    }

    /**
     * Sets the value of the valDtInd property.
     * 
     */
    public void setValDtInd(boolean value) {
        this.valDtInd = value;
    }

    /**
     * Gets the value of the prcgDtInd property.
     * 
     */
    public boolean isPrcgDtInd() {
        return prcgDtInd;
    }

    /**
     * Sets the value of the prcgDtInd property.
     * 
     */
    public void setPrcgDtInd(boolean value) {
        this.prcgDtInd = value;
    }

    /**
     * Gets the value of the nbOfPmtsInd property.
     * 
     */
    public boolean isNbOfPmtsInd() {
        return nbOfPmtsInd;
    }

    /**
     * Sets the value of the nbOfPmtsInd property.
     * 
     */
    public void setNbOfPmtsInd(boolean value) {
        this.nbOfPmtsInd = value;
    }

}
