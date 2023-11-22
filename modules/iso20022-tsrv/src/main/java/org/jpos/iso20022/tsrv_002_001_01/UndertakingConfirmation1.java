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

package org.jpos.iso20022.tsrv_002_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndertakingConfirmation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UndertakingConfirmation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Cnfrmr" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}PartyIdentification43"/>
 *         <element name="RefNb" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}Max35Text"/>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}DateAndDateTimeChoice"/>
 *         <element name="Conf" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}Max2000Text" maxOccurs="5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingConfirmation1", propOrder = {
    "cnfrmr",
    "refNb",
    "dt",
    "conf"
})
public class UndertakingConfirmation1 {

    @XmlElement(name = "Cnfrmr", required = true)
    protected PartyIdentification43 cnfrmr;
    @XmlElement(name = "RefNb", required = true)
    protected String refNb;
    @XmlElement(name = "Dt", required = true)
    protected DateAndDateTimeChoice dt;
    @XmlElement(name = "Conf")
    protected List<String> conf;

    /**
     * Gets the value of the cnfrmr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getCnfrmr() {
        return cnfrmr;
    }

    /**
     * Sets the value of the cnfrmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setCnfrmr(PartyIdentification43 value) {
        this.cnfrmr = value;
    }

    /**
     * Gets the value of the refNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNb() {
        return refNb;
    }

    /**
     * Sets the value of the refNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNb(String value) {
        this.refNb = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setDt(DateAndDateTimeChoice value) {
        this.dt = value;
    }

    /**
     * Gets the value of the conf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the conf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the conf property.
     */
    public List<String> getConf() {
        if (conf == null) {
            conf = new ArrayList<>();
        }
        return this.conf;
    }

}
