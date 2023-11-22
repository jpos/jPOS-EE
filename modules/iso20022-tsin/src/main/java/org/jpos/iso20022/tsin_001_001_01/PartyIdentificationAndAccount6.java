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

package org.jpos.iso20022.tsin_001_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentificationAndAccount6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentificationAndAccount6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PtyId" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}PartyIdentification25"/>
 *         <element name="CdtAcct" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}CashAccount7" minOccurs="0"/>
 *         <element name="FincgAcct" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}CashAccount7" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationAndAccount6", propOrder = {
    "ptyId",
    "cdtAcct",
    "fincgAcct"
})
public class PartyIdentificationAndAccount6 {

    @XmlElement(name = "PtyId", required = true)
    protected PartyIdentification25 ptyId;
    @XmlElement(name = "CdtAcct")
    protected CashAccount7 cdtAcct;
    @XmlElement(name = "FincgAcct")
    protected CashAccount7 fincgAcct;

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification25 }
     *     
     */
    public PartyIdentification25 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification25 }
     *     
     */
    public void setPtyId(PartyIdentification25 value) {
        this.ptyId = value;
    }

    /**
     * Gets the value of the cdtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getCdtAcct() {
        return cdtAcct;
    }

    /**
     * Sets the value of the cdtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public void setCdtAcct(CashAccount7 value) {
        this.cdtAcct = value;
    }

    /**
     * Gets the value of the fincgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getFincgAcct() {
        return fincgAcct;
    }

    /**
     * Sets the value of the fincgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public void setFincgAcct(CashAccount7 value) {
        this.fincgAcct = value;
    }

}
