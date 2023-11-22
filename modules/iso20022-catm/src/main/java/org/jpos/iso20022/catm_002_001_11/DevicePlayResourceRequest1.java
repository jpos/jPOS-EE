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

package org.jpos.iso20022.catm_002_001_11;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevicePlayResourceRequest1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DevicePlayResourceRequest1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RspnMd" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}ResponseMode2Code" minOccurs="0"/>
 *         <element name="RsrcActn" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}ResourceAction1Code"/>
 *         <element name="SoundVol" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}PercentageRate" minOccurs="0"/>
 *         <element name="DispRsltn" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}Max35Text" minOccurs="0"/>
 *         <element name="Rsrc" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}ResourceContent1" minOccurs="0"/>
 *         <element name="TmgSlot" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}ProcessingPosition2Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevicePlayResourceRequest1", propOrder = {
    "rspnMd",
    "rsrcActn",
    "soundVol",
    "dispRsltn",
    "rsrc",
    "tmgSlot"
})
public class DevicePlayResourceRequest1 {

    @XmlElement(name = "RspnMd")
    @XmlSchemaType(name = "string")
    protected ResponseMode2Code rspnMd;
    @XmlElement(name = "RsrcActn", required = true)
    @XmlSchemaType(name = "string")
    protected ResourceAction1Code rsrcActn;
    @XmlElement(name = "SoundVol")
    protected BigDecimal soundVol;
    @XmlElement(name = "DispRsltn")
    protected String dispRsltn;
    @XmlElement(name = "Rsrc")
    protected ResourceContent1 rsrc;
    @XmlElement(name = "TmgSlot")
    @XmlSchemaType(name = "string")
    protected ProcessingPosition2Code tmgSlot;

    /**
     * Gets the value of the rspnMd property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMode2Code }
     *     
     */
    public ResponseMode2Code getRspnMd() {
        return rspnMd;
    }

    /**
     * Sets the value of the rspnMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMode2Code }
     *     
     */
    public void setRspnMd(ResponseMode2Code value) {
        this.rspnMd = value;
    }

    /**
     * Gets the value of the rsrcActn property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceAction1Code }
     *     
     */
    public ResourceAction1Code getRsrcActn() {
        return rsrcActn;
    }

    /**
     * Sets the value of the rsrcActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceAction1Code }
     *     
     */
    public void setRsrcActn(ResourceAction1Code value) {
        this.rsrcActn = value;
    }

    /**
     * Gets the value of the soundVol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSoundVol() {
        return soundVol;
    }

    /**
     * Sets the value of the soundVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSoundVol(BigDecimal value) {
        this.soundVol = value;
    }

    /**
     * Gets the value of the dispRsltn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispRsltn() {
        return dispRsltn;
    }

    /**
     * Sets the value of the dispRsltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispRsltn(String value) {
        this.dispRsltn = value;
    }

    /**
     * Gets the value of the rsrc property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceContent1 }
     *     
     */
    public ResourceContent1 getRsrc() {
        return rsrc;
    }

    /**
     * Sets the value of the rsrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceContent1 }
     *     
     */
    public void setRsrc(ResourceContent1 value) {
        this.rsrc = value;
    }

    /**
     * Gets the value of the tmgSlot property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition2Code }
     *     
     */
    public ProcessingPosition2Code getTmgSlot() {
        return tmgSlot;
    }

    /**
     * Sets the value of the tmgSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition2Code }
     *     
     */
    public void setTmgSlot(ProcessingPosition2Code value) {
        this.tmgSlot = value;
    }

}
