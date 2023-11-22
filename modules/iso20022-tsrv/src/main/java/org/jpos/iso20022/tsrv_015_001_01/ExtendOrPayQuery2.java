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

package org.jpos.iso20022.tsrv_015_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendOrPayQuery2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ExtendOrPayQuery2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UdrtkgId" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.015.001.01}Undertaking9"/>
 *         <element name="DmndDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.015.001.01}Demand4"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.015.001.01}DemandStatus1Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendOrPayQuery2", propOrder = {
    "udrtkgId",
    "dmndDtls",
    "sts"
})
public class ExtendOrPayQuery2 {

    @XmlElement(name = "UdrtkgId", required = true)
    protected Undertaking9 udrtkgId;
    @XmlElement(name = "DmndDtls", required = true)
    protected Demand4 dmndDtls;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected DemandStatus1Code sts;

    /**
     * Gets the value of the udrtkgId property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking9 }
     *     
     */
    public Undertaking9 getUdrtkgId() {
        return udrtkgId;
    }

    /**
     * Sets the value of the udrtkgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking9 }
     *     
     */
    public void setUdrtkgId(Undertaking9 value) {
        this.udrtkgId = value;
    }

    /**
     * Gets the value of the dmndDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Demand4 }
     *     
     */
    public Demand4 getDmndDtls() {
        return dmndDtls;
    }

    /**
     * Sets the value of the dmndDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Demand4 }
     *     
     */
    public void setDmndDtls(Demand4 value) {
        this.dmndDtls = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link DemandStatus1Code }
     *     
     */
    public DemandStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandStatus1Code }
     *     
     */
    public void setSts(DemandStatus1Code value) {
        this.sts = value;
    }

}
