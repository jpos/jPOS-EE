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

package org.jpos.iso20022.auth_107_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityIdentification41Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityIdentification41Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ISIN" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ISINOct2015Identifier"/>
 *         <element name="AltrntvInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}Max52Text"/>
 *         <element name="UnqPdctIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}UniqueProductIdentifier2Choice"/>
 *         <element name="Bskt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}CustomBasket4"/>
 *         <element name="Indx" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}IndexIdentification1"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}GenericIdentification184"/>
 *         <element name="IdNotAvlbl" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}UnderlyingIdentification1Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentification41Choice", propOrder = {
    "isin",
    "altrntvInstrmId",
    "unqPdctIdr",
    "bskt",
    "indx",
    "othr",
    "idNotAvlbl"
})
public class SecurityIdentification41Choice {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "AltrntvInstrmId")
    protected String altrntvInstrmId;
    @XmlElement(name = "UnqPdctIdr")
    protected UniqueProductIdentifier2Choice unqPdctIdr;
    @XmlElement(name = "Bskt")
    protected CustomBasket4 bskt;
    @XmlElement(name = "Indx")
    protected IndexIdentification1 indx;
    @XmlElement(name = "Othr")
    protected GenericIdentification184 othr;
    @XmlElement(name = "IdNotAvlbl")
    @XmlSchemaType(name = "string")
    protected UnderlyingIdentification1Code idNotAvlbl;

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISIN(String value) {
        this.isin = value;
    }

    /**
     * Gets the value of the altrntvInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltrntvInstrmId() {
        return altrntvInstrmId;
    }

    /**
     * Sets the value of the altrntvInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltrntvInstrmId(String value) {
        this.altrntvInstrmId = value;
    }

    /**
     * Gets the value of the unqPdctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueProductIdentifier2Choice }
     *     
     */
    public UniqueProductIdentifier2Choice getUnqPdctIdr() {
        return unqPdctIdr;
    }

    /**
     * Sets the value of the unqPdctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueProductIdentifier2Choice }
     *     
     */
    public void setUnqPdctIdr(UniqueProductIdentifier2Choice value) {
        this.unqPdctIdr = value;
    }

    /**
     * Gets the value of the bskt property.
     * 
     * @return
     *     possible object is
     *     {@link CustomBasket4 }
     *     
     */
    public CustomBasket4 getBskt() {
        return bskt;
    }

    /**
     * Sets the value of the bskt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomBasket4 }
     *     
     */
    public void setBskt(CustomBasket4 value) {
        this.bskt = value;
    }

    /**
     * Gets the value of the indx property.
     * 
     * @return
     *     possible object is
     *     {@link IndexIdentification1 }
     *     
     */
    public IndexIdentification1 getIndx() {
        return indx;
    }

    /**
     * Sets the value of the indx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexIdentification1 }
     *     
     */
    public void setIndx(IndexIdentification1 value) {
        this.indx = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification184 }
     *     
     */
    public GenericIdentification184 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification184 }
     *     
     */
    public void setOthr(GenericIdentification184 value) {
        this.othr = value;
    }

    /**
     * Gets the value of the idNotAvlbl property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingIdentification1Code }
     *     
     */
    public UnderlyingIdentification1Code getIdNotAvlbl() {
        return idNotAvlbl;
    }

    /**
     * Sets the value of the idNotAvlbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingIdentification1Code }
     *     
     */
    public void setIdNotAvlbl(UnderlyingIdentification1Code value) {
        this.idNotAvlbl = value;
    }

}
