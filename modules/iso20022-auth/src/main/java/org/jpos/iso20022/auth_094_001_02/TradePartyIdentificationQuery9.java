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

package org.jpos.iso20022.auth_094_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradePartyIdentificationQuery9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradePartyIdentificationQuery9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}LEIIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CtryCd" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AnyBIC" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}AnyBICDec2014Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ClntId" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}Max50Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NotRptd" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}NotReported1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradePartyIdentificationQuery9", propOrder = {
    "lei",
    "ctryCd",
    "anyBIC",
    "clntId",
    "notRptd"
})
public class TradePartyIdentificationQuery9 {

    @XmlElement(name = "LEI")
    protected List<String> lei;
    @XmlElement(name = "CtryCd")
    protected List<String> ctryCd;
    @XmlElement(name = "AnyBIC")
    protected List<String> anyBIC;
    @XmlElement(name = "ClntId")
    protected List<String> clntId;
    @XmlElement(name = "NotRptd")
    @XmlSchemaType(name = "string")
    protected NotReported1Code notRptd;

    /**
     * Gets the value of the lei property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lei property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLEI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the lei property.
     */
    public List<String> getLEI() {
        if (lei == null) {
            lei = new ArrayList<>();
        }
        return this.lei;
    }

    /**
     * Gets the value of the ctryCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctryCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtryCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the ctryCd property.
     */
    public List<String> getCtryCd() {
        if (ctryCd == null) {
            ctryCd = new ArrayList<>();
        }
        return this.ctryCd;
    }

    /**
     * Gets the value of the anyBIC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the anyBIC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnyBIC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the anyBIC property.
     */
    public List<String> getAnyBIC() {
        if (anyBIC == null) {
            anyBIC = new ArrayList<>();
        }
        return this.anyBIC;
    }

    /**
     * Gets the value of the clntId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clntId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClntId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the clntId property.
     */
    public List<String> getClntId() {
        if (clntId == null) {
            clntId = new ArrayList<>();
        }
        return this.clntId;
    }

    /**
     * Gets the value of the notRptd property.
     * 
     * @return
     *     possible object is
     *     {@link NotReported1Code }
     *     
     */
    public NotReported1Code getNotRptd() {
        return notRptd;
    }

    /**
     * Sets the value of the notRptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotReported1Code }
     *     
     */
    public void setNotRptd(NotReported1Code value) {
        this.notRptd = value;
    }

}
