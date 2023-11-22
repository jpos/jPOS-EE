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

package org.jpos.iso20022.catm_003_001_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityParameters15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityParameters15">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActnTp" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}TerminalManagementAction3Code"/>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max256Text"/>
 *         <element name="POIChllng" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max140Binary" minOccurs="0"/>
 *         <element name="TMChllng" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max140Binary" minOccurs="0"/>
 *         <element name="SctyElmt" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}CryptographicKey17" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityParameters15", propOrder = {
    "actnTp",
    "vrsn",
    "poiChllng",
    "tmChllng",
    "sctyElmt"
})
public class SecurityParameters15 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code actnTp;
    @XmlElement(name = "Vrsn", required = true)
    protected String vrsn;
    @XmlElement(name = "POIChllng")
    protected byte[] poiChllng;
    @XmlElement(name = "TMChllng")
    protected byte[] tmChllng;
    @XmlElement(name = "SctyElmt")
    protected List<CryptographicKey17> sctyElmt;

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public TerminalManagementAction3Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public void setActnTp(TerminalManagementAction3Code value) {
        this.actnTp = value;
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
     * Gets the value of the poiChllng property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPOIChllng() {
        return poiChllng;
    }

    /**
     * Sets the value of the poiChllng property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPOIChllng(byte[] value) {
        this.poiChllng = value;
    }

    /**
     * Gets the value of the tmChllng property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTMChllng() {
        return tmChllng;
    }

    /**
     * Sets the value of the tmChllng property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTMChllng(byte[] value) {
        this.tmChllng = value;
    }

    /**
     * Gets the value of the sctyElmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctyElmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctyElmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CryptographicKey17 }
     * 
     * 
     * @return
     *     The value of the sctyElmt property.
     */
    public List<CryptographicKey17> getSctyElmt() {
        if (sctyElmt == null) {
            sctyElmt = new ArrayList<>();
        }
        return this.sctyElmt;
    }

}
