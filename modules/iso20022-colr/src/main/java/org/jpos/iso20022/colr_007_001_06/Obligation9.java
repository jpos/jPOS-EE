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

package org.jpos.iso20022.colr_007_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Obligation9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Obligation9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PtyA" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}PartyIdentification178Choice"/>
 *         <element name="SvcgPtyA" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}PartyIdentification178Choice" minOccurs="0"/>
 *         <element name="PtyB" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}PartyIdentification178Choice"/>
 *         <element name="SvcgPtyB" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}PartyIdentification178Choice" minOccurs="0"/>
 *         <element name="CollAcctId" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}CollateralAccount3" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}BlockChainAddressWallet5" minOccurs="0"/>
 *         <element name="XpsrTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}ExposureType11Code" minOccurs="0"/>
 *         <element name="ValtnDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}DateAndDateTime2Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Obligation9", propOrder = {
    "ptyA",
    "svcgPtyA",
    "ptyB",
    "svcgPtyB",
    "collAcctId",
    "blckChainAdrOrWllt",
    "xpsrTp",
    "valtnDt"
})
public class Obligation9 {

    @XmlElement(name = "PtyA", required = true)
    protected PartyIdentification178Choice ptyA;
    @XmlElement(name = "SvcgPtyA")
    protected PartyIdentification178Choice svcgPtyA;
    @XmlElement(name = "PtyB", required = true)
    protected PartyIdentification178Choice ptyB;
    @XmlElement(name = "SvcgPtyB")
    protected PartyIdentification178Choice svcgPtyB;
    @XmlElement(name = "CollAcctId")
    protected CollateralAccount3 collAcctId;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet5 blckChainAdrOrWllt;
    @XmlElement(name = "XpsrTp")
    @XmlSchemaType(name = "string")
    protected ExposureType11Code xpsrTp;
    @XmlElement(name = "ValtnDt", required = true)
    protected DateAndDateTime2Choice valtnDt;

    /**
     * Gets the value of the ptyA property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public PartyIdentification178Choice getPtyA() {
        return ptyA;
    }

    /**
     * Sets the value of the ptyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public void setPtyA(PartyIdentification178Choice value) {
        this.ptyA = value;
    }

    /**
     * Gets the value of the svcgPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public PartyIdentification178Choice getSvcgPtyA() {
        return svcgPtyA;
    }

    /**
     * Sets the value of the svcgPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public void setSvcgPtyA(PartyIdentification178Choice value) {
        this.svcgPtyA = value;
    }

    /**
     * Gets the value of the ptyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public PartyIdentification178Choice getPtyB() {
        return ptyB;
    }

    /**
     * Sets the value of the ptyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public void setPtyB(PartyIdentification178Choice value) {
        this.ptyB = value;
    }

    /**
     * Gets the value of the svcgPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public PartyIdentification178Choice getSvcgPtyB() {
        return svcgPtyB;
    }

    /**
     * Sets the value of the svcgPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public void setSvcgPtyB(PartyIdentification178Choice value) {
        this.svcgPtyB = value;
    }

    /**
     * Gets the value of the collAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAccount3 }
     *     
     */
    public CollateralAccount3 getCollAcctId() {
        return collAcctId;
    }

    /**
     * Sets the value of the collAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAccount3 }
     *     
     */
    public void setCollAcctId(CollateralAccount3 value) {
        this.collAcctId = value;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet5 }
     *     
     */
    public BlockChainAddressWallet5 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet5 }
     *     
     */
    public void setBlckChainAdrOrWllt(BlockChainAddressWallet5 value) {
        this.blckChainAdrOrWllt = value;
    }

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType11Code }
     *     
     */
    public ExposureType11Code getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType11Code }
     *     
     */
    public void setXpsrTp(ExposureType11Code value) {
        this.xpsrTp = value;
    }

    /**
     * Gets the value of the valtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getValtnDt() {
        return valtnDt;
    }

    /**
     * Sets the value of the valtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setValtnDt(DateAndDateTime2Choice value) {
        this.valtnDt = value;
    }

}
