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
 * <p>Java class for AcquirerHostConfiguration9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AcquirerHostConfiguration9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HstId" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max35Text"/>
 *         <element name="MsgToSnd" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}MessageFunction43Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrtcolVrsn" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max8Text" minOccurs="0"/>
 *         <element name="XtrnlyTpSpprtd" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max1025Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerHostConfiguration9", propOrder = {
    "hstId",
    "msgToSnd",
    "prtcolVrsn",
    "xtrnlyTpSpprtd"
})
public class AcquirerHostConfiguration9 {

    @XmlElement(name = "HstId", required = true)
    protected String hstId;
    @XmlElement(name = "MsgToSnd")
    @XmlSchemaType(name = "string")
    protected List<MessageFunction43Code> msgToSnd;
    @XmlElement(name = "PrtcolVrsn")
    protected String prtcolVrsn;
    @XmlElement(name = "XtrnlyTpSpprtd")
    protected List<String> xtrnlyTpSpprtd;

    /**
     * Gets the value of the hstId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHstId() {
        return hstId;
    }

    /**
     * Sets the value of the hstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHstId(String value) {
        this.hstId = value;
    }

    /**
     * Gets the value of the msgToSnd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgToSnd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgToSnd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageFunction43Code }
     * 
     * 
     * @return
     *     The value of the msgToSnd property.
     */
    public List<MessageFunction43Code> getMsgToSnd() {
        if (msgToSnd == null) {
            msgToSnd = new ArrayList<>();
        }
        return this.msgToSnd;
    }

    /**
     * Gets the value of the prtcolVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtcolVrsn() {
        return prtcolVrsn;
    }

    /**
     * Sets the value of the prtcolVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtcolVrsn(String value) {
        this.prtcolVrsn = value;
    }

    /**
     * Gets the value of the xtrnlyTpSpprtd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtrnlyTpSpprtd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtrnlyTpSpprtd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the xtrnlyTpSpprtd property.
     */
    public List<String> getXtrnlyTpSpprtd() {
        if (xtrnlyTpSpprtd == null) {
            xtrnlyTpSpprtd = new ArrayList<>();
        }
        return this.xtrnlyTpSpprtd;
    }

}
