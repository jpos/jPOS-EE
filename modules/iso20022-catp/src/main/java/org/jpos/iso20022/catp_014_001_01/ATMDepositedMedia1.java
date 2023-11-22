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

package org.jpos.iso20022.catp_014_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMDepositedMedia1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMDepositedMedia1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}Number" minOccurs="0"/>
 *         <element name="MdiaTp" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}ATMMediaType2Code"/>
 *         <element name="MdiaCtgy" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}ATMMediaType3Code" minOccurs="0"/>
 *         <element name="MdiaItms" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}ATMDepositedMedia2" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMDepositedMedia1", propOrder = {
    "acctSeqNb",
    "mdiaTp",
    "mdiaCtgy",
    "mdiaItms"
})
public class ATMDepositedMedia1 {

    @XmlElement(name = "AcctSeqNb")
    protected BigDecimal acctSeqNb;
    @XmlElement(name = "MdiaTp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMMediaType2Code mdiaTp;
    @XmlElement(name = "MdiaCtgy")
    @XmlSchemaType(name = "string")
    protected ATMMediaType3Code mdiaCtgy;
    @XmlElement(name = "MdiaItms", required = true)
    protected List<ATMDepositedMedia2> mdiaItms;

    /**
     * Gets the value of the acctSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcctSeqNb() {
        return acctSeqNb;
    }

    /**
     * Sets the value of the acctSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcctSeqNb(BigDecimal value) {
        this.acctSeqNb = value;
    }

    /**
     * Gets the value of the mdiaTp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMMediaType2Code }
     *     
     */
    public ATMMediaType2Code getMdiaTp() {
        return mdiaTp;
    }

    /**
     * Sets the value of the mdiaTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMMediaType2Code }
     *     
     */
    public void setMdiaTp(ATMMediaType2Code value) {
        this.mdiaTp = value;
    }

    /**
     * Gets the value of the mdiaCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link ATMMediaType3Code }
     *     
     */
    public ATMMediaType3Code getMdiaCtgy() {
        return mdiaCtgy;
    }

    /**
     * Sets the value of the mdiaCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMMediaType3Code }
     *     
     */
    public void setMdiaCtgy(ATMMediaType3Code value) {
        this.mdiaCtgy = value;
    }

    /**
     * Gets the value of the mdiaItms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mdiaItms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMdiaItms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMDepositedMedia2 }
     * 
     * 
     * @return
     *     The value of the mdiaItms property.
     */
    public List<ATMDepositedMedia2> getMdiaItms() {
        if (mdiaItms == null) {
            mdiaItms = new ArrayList<>();
        }
        return this.mdiaItms;
    }

}
