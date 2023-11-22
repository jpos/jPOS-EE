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

package org.jpos.iso20022.secl_003_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeLegStatement3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeLegStatement3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClrAcct" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}SecuritiesAccount18" minOccurs="0"/>
 *         <element name="ClrSgmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}PartyIdentification35Choice" minOccurs="0"/>
 *         <element name="NonClrMmb" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}PartyIdentificationAndAccount31" minOccurs="0"/>
 *         <element name="TradLegsDtls" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}TradeLeg9" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeLegStatement3", propOrder = {
    "clrAcct",
    "clrSgmt",
    "nonClrMmb",
    "tradLegsDtls"
})
public class TradeLegStatement3 {

    @XmlElement(name = "ClrAcct")
    protected SecuritiesAccount18 clrAcct;
    @XmlElement(name = "ClrSgmt")
    protected PartyIdentification35Choice clrSgmt;
    @XmlElement(name = "NonClrMmb")
    protected PartyIdentificationAndAccount31 nonClrMmb;
    @XmlElement(name = "TradLegsDtls", required = true)
    protected List<TradeLeg9> tradLegsDtls;

    /**
     * Gets the value of the clrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public SecuritiesAccount18 getClrAcct() {
        return clrAcct;
    }

    /**
     * Sets the value of the clrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public void setClrAcct(SecuritiesAccount18 value) {
        this.clrAcct = value;
    }

    /**
     * Gets the value of the clrSgmt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getClrSgmt() {
        return clrSgmt;
    }

    /**
     * Sets the value of the clrSgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public void setClrSgmt(PartyIdentification35Choice value) {
        this.clrSgmt = value;
    }

    /**
     * Gets the value of the nonClrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount31 }
     *     
     */
    public PartyIdentificationAndAccount31 getNonClrMmb() {
        return nonClrMmb;
    }

    /**
     * Sets the value of the nonClrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount31 }
     *     
     */
    public void setNonClrMmb(PartyIdentificationAndAccount31 value) {
        this.nonClrMmb = value;
    }

    /**
     * Gets the value of the tradLegsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradLegsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradLegsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeLeg9 }
     * 
     * 
     * @return
     *     The value of the tradLegsDtls property.
     */
    public List<TradeLeg9> getTradLegsDtls() {
        if (tradLegsDtls == null) {
            tradLegsDtls = new ArrayList<>();
        }
        return this.tradLegsDtls;
    }

}
