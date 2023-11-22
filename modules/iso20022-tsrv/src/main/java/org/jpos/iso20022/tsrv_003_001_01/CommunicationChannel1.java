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

package org.jpos.iso20022.tsrv_003_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationChannel1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CommunicationChannel1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mtd" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}ExternalChannel1Code"/>
 *         <element name="DlvrToPtyTp" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}PartyType1Choice"/>
 *         <element name="DlvrToNm" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}Max140Text" minOccurs="0"/>
 *         <element name="DlvrToAdr" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}PostalAddress6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationChannel1", propOrder = {
    "mtd",
    "dlvrToPtyTp",
    "dlvrToNm",
    "dlvrToAdr"
})
public class CommunicationChannel1 {

    @XmlElement(name = "Mtd", required = true)
    protected String mtd;
    @XmlElement(name = "DlvrToPtyTp", required = true)
    protected PartyType1Choice dlvrToPtyTp;
    @XmlElement(name = "DlvrToNm")
    protected String dlvrToNm;
    @XmlElement(name = "DlvrToAdr")
    protected PostalAddress6 dlvrToAdr;

    /**
     * Gets the value of the mtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtd() {
        return mtd;
    }

    /**
     * Sets the value of the mtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtd(String value) {
        this.mtd = value;
    }

    /**
     * Gets the value of the dlvrToPtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType1Choice }
     *     
     */
    public PartyType1Choice getDlvrToPtyTp() {
        return dlvrToPtyTp;
    }

    /**
     * Sets the value of the dlvrToPtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType1Choice }
     *     
     */
    public void setDlvrToPtyTp(PartyType1Choice value) {
        this.dlvrToPtyTp = value;
    }

    /**
     * Gets the value of the dlvrToNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvrToNm() {
        return dlvrToNm;
    }

    /**
     * Sets the value of the dlvrToNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvrToNm(String value) {
        this.dlvrToNm = value;
    }

    /**
     * Gets the value of the dlvrToAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress6 }
     *     
     */
    public PostalAddress6 getDlvrToAdr() {
        return dlvrToAdr;
    }

    /**
     * Sets the value of the dlvrToAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress6 }
     *     
     */
    public void setDlvrToAdr(PostalAddress6 value) {
        this.dlvrToAdr = value;
    }

}
