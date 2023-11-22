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

package org.jpos.iso20022.caaa_025_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Action14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Action14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActnTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}ActionType13Code"/>
 *         <element name="MsgToPres" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}ActionMessage10" minOccurs="0"/>
 *         <element name="RmotAccs" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}NetworkParameters7" minOccurs="0"/>
 *         <element name="Rtry" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}ProcessRetry3" minOccurs="0"/>
 *         <element name="TmCond" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}ProcessTiming6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Action14", propOrder = {
    "actnTp",
    "msgToPres",
    "rmotAccs",
    "rtry",
    "tmCond"
})
public class Action14 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected ActionType13Code actnTp;
    @XmlElement(name = "MsgToPres")
    protected ActionMessage10 msgToPres;
    @XmlElement(name = "RmotAccs")
    protected NetworkParameters7 rmotAccs;
    @XmlElement(name = "Rtry")
    protected ProcessRetry3 rtry;
    @XmlElement(name = "TmCond")
    protected ProcessTiming6 tmCond;

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType13Code }
     *     
     */
    public ActionType13Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType13Code }
     *     
     */
    public void setActnTp(ActionType13Code value) {
        this.actnTp = value;
    }

    /**
     * Gets the value of the msgToPres property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage10 }
     *     
     */
    public ActionMessage10 getMsgToPres() {
        return msgToPres;
    }

    /**
     * Sets the value of the msgToPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage10 }
     *     
     */
    public void setMsgToPres(ActionMessage10 value) {
        this.msgToPres = value;
    }

    /**
     * Gets the value of the rmotAccs property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkParameters7 }
     *     
     */
    public NetworkParameters7 getRmotAccs() {
        return rmotAccs;
    }

    /**
     * Sets the value of the rmotAccs property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters7 }
     *     
     */
    public void setRmotAccs(NetworkParameters7 value) {
        this.rmotAccs = value;
    }

    /**
     * Gets the value of the rtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessRetry3 }
     *     
     */
    public ProcessRetry3 getRtry() {
        return rtry;
    }

    /**
     * Sets the value of the rtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessRetry3 }
     *     
     */
    public void setRtry(ProcessRetry3 value) {
        this.rtry = value;
    }

    /**
     * Gets the value of the tmCond property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessTiming6 }
     *     
     */
    public ProcessTiming6 getTmCond() {
        return tmCond;
    }

    /**
     * Sets the value of the tmCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessTiming6 }
     *     
     */
    public void setTmCond(ProcessTiming6 value) {
        this.tmCond = value;
    }

}
