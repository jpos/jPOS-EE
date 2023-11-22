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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityIdentification46 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityIdentification46">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ISIN" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ISINOct2015Identifier" minOccurs="0"/>
 *         <element name="UnqPdctIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}UniqueProductIdentifier2Choice" minOccurs="0"/>
 *         <element name="AltrntvInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}Max105Text" minOccurs="0"/>
 *         <element name="PdctDesc" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}Max1000Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentification46", propOrder = {
    "isin",
    "unqPdctIdr",
    "altrntvInstrmId",
    "pdctDesc"
})
public class SecurityIdentification46 {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "UnqPdctIdr")
    protected UniqueProductIdentifier2Choice unqPdctIdr;
    @XmlElement(name = "AltrntvInstrmId")
    protected String altrntvInstrmId;
    @XmlElement(name = "PdctDesc")
    protected String pdctDesc;

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
     * Gets the value of the pdctDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctDesc() {
        return pdctDesc;
    }

    /**
     * Sets the value of the pdctDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdctDesc(String value) {
        this.pdctDesc = value;
    }

}
