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

package org.jpos.iso20022.auth_090_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Counterparty46 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Counterparty46">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IdTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}PartyIdentification248Choice" minOccurs="0"/>
 *         <element name="Ntr" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}CounterpartyTradeNature15Choice" minOccurs="0"/>
 *         <element name="RptgOblgtn" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Counterparty46", propOrder = {
    "idTp",
    "ntr",
    "rptgOblgtn"
})
public class Counterparty46 {

    @XmlElement(name = "IdTp")
    protected PartyIdentification248Choice idTp;
    @XmlElement(name = "Ntr")
    protected CounterpartyTradeNature15Choice ntr;
    @XmlElement(name = "RptgOblgtn")
    protected Boolean rptgOblgtn;

    /**
     * Gets the value of the idTp property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification248Choice }
     *     
     */
    public PartyIdentification248Choice getIdTp() {
        return idTp;
    }

    /**
     * Sets the value of the idTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification248Choice }
     *     
     */
    public void setIdTp(PartyIdentification248Choice value) {
        this.idTp = value;
    }

    /**
     * Gets the value of the ntr property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyTradeNature15Choice }
     *     
     */
    public CounterpartyTradeNature15Choice getNtr() {
        return ntr;
    }

    /**
     * Sets the value of the ntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyTradeNature15Choice }
     *     
     */
    public void setNtr(CounterpartyTradeNature15Choice value) {
        this.ntr = value;
    }

    /**
     * Gets the value of the rptgOblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRptgOblgtn() {
        return rptgOblgtn;
    }

    /**
     * Sets the value of the rptgOblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRptgOblgtn(Boolean value) {
        this.rptgOblgtn = value;
    }

}
