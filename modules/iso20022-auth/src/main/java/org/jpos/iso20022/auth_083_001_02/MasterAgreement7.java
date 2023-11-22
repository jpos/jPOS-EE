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

package org.jpos.iso20022.auth_083_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MasterAgreement7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MasterAgreement7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:auth.083.001.02}AgreementType2Choice"/>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.083.001.02}Max50Text" minOccurs="0"/>
 *         <element name="OthrMstrAgrmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:auth.083.001.02}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterAgreement7", propOrder = {
    "tp",
    "vrsn",
    "othrMstrAgrmtDtls"
})
public class MasterAgreement7 {

    @XmlElement(name = "Tp", required = true)
    protected AgreementType2Choice tp;
    @XmlElement(name = "Vrsn")
    protected String vrsn;
    @XmlElement(name = "OthrMstrAgrmtDtls")
    protected String othrMstrAgrmtDtls;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementType2Choice }
     *     
     */
    public AgreementType2Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementType2Choice }
     *     
     */
    public void setTp(AgreementType2Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrsn(String value) {
        this.vrsn = value;
    }

    /**
     * Gets the value of the othrMstrAgrmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrMstrAgrmtDtls() {
        return othrMstrAgrmtDtls;
    }

    /**
     * Sets the value of the othrMstrAgrmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrMstrAgrmtDtls(String value) {
        this.othrMstrAgrmtDtls = value;
    }

}
