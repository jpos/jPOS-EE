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

package org.jpos.iso20022.tsrv_017_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndertakingDemandWithdrawal1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UndertakingDemandWithdrawal1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UdrtkgId" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.017.001.01}Undertaking6"/>
 *         <element name="AdvsgPtyRefNb" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.017.001.01}Max35Text" minOccurs="0"/>
 *         <element name="DmndDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.017.001.01}Demand3"/>
 *         <element name="CnfrmrRefNb" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.017.001.01}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingDemandWithdrawal1", propOrder = {
    "udrtkgId",
    "advsgPtyRefNb",
    "dmndDtls",
    "cnfrmrRefNb"
})
public class UndertakingDemandWithdrawal1 {

    @XmlElement(name = "UdrtkgId", required = true)
    protected Undertaking6 udrtkgId;
    @XmlElement(name = "AdvsgPtyRefNb")
    protected String advsgPtyRefNb;
    @XmlElement(name = "DmndDtls", required = true)
    protected Demand3 dmndDtls;
    @XmlElement(name = "CnfrmrRefNb")
    protected String cnfrmrRefNb;

    /**
     * Gets the value of the udrtkgId property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking6 }
     *     
     */
    public Undertaking6 getUdrtkgId() {
        return udrtkgId;
    }

    /**
     * Sets the value of the udrtkgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking6 }
     *     
     */
    public void setUdrtkgId(Undertaking6 value) {
        this.udrtkgId = value;
    }

    /**
     * Gets the value of the advsgPtyRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvsgPtyRefNb() {
        return advsgPtyRefNb;
    }

    /**
     * Sets the value of the advsgPtyRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvsgPtyRefNb(String value) {
        this.advsgPtyRefNb = value;
    }

    /**
     * Gets the value of the dmndDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Demand3 }
     *     
     */
    public Demand3 getDmndDtls() {
        return dmndDtls;
    }

    /**
     * Sets the value of the dmndDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Demand3 }
     *     
     */
    public void setDmndDtls(Demand3 value) {
        this.dmndDtls = value;
    }

    /**
     * Gets the value of the cnfrmrRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnfrmrRefNb() {
        return cnfrmrRefNb;
    }

    /**
     * Sets the value of the cnfrmrRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnfrmrRefNb(String value) {
        this.cnfrmrRefNb = value;
    }

}
