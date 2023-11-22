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

package org.jpos.iso20022.canm_002_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Action13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Action13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Dstn" type="{urn:iso:std:iso:20022:tech:xsd:canm.002.001.03}PartyType20Code" minOccurs="0"/>
 *         <element name="ActnTp" type="{urn:iso:std:iso:20022:tech:xsd:canm.002.001.03}ActionType11Code" minOccurs="0"/>
 *         <element name="OthrActnTp" type="{urn:iso:std:iso:20022:tech:xsd:canm.002.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Ctct" type="{urn:iso:std:iso:20022:tech:xsd:canm.002.001.03}Contact6" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:canm.002.001.03}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Action13", propOrder = {
    "dstn",
    "actnTp",
    "othrActnTp",
    "ctct",
    "addtlData"
})
public class Action13 {

    @XmlElement(name = "Dstn")
    @XmlSchemaType(name = "string")
    protected PartyType20Code dstn;
    @XmlElement(name = "ActnTp")
    @XmlSchemaType(name = "string")
    protected ActionType11Code actnTp;
    @XmlElement(name = "OthrActnTp")
    protected String othrActnTp;
    @XmlElement(name = "Ctct")
    protected Contact6 ctct;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType20Code }
     *     
     */
    public PartyType20Code getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType20Code }
     *     
     */
    public void setDstn(PartyType20Code value) {
        this.dstn = value;
    }

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType11Code }
     *     
     */
    public ActionType11Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType11Code }
     *     
     */
    public void setActnTp(ActionType11Code value) {
        this.actnTp = value;
    }

    /**
     * Gets the value of the othrActnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrActnTp() {
        return othrActnTp;
    }

    /**
     * Sets the value of the othrActnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrActnTp(String value) {
        this.othrActnTp = value;
    }

    /**
     * Gets the value of the ctct property.
     * 
     * @return
     *     possible object is
     *     {@link Contact6 }
     *     
     */
    public Contact6 getCtct() {
        return ctct;
    }

    /**
     * Sets the value of the ctct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact6 }
     *     
     */
    public void setCtct(Contact6 value) {
        this.ctct = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
    }

}
