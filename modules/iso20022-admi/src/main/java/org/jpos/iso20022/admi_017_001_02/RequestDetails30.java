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

package org.jpos.iso20022.admi_017_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestDetails30 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequestDetails30">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:admi.017.001.02}Max35Text"/>
 *         <element name="RqstrId" type="{urn:iso:std:iso:20022:tech:xsd:admi.017.001.02}PartyIdentification242Choice" minOccurs="0"/>
 *         <element name="AddtlReqInf" type="{urn:iso:std:iso:20022:tech:xsd:admi.017.001.02}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDetails30", propOrder = {
    "tp",
    "rqstrId",
    "addtlReqInf"
})
public class RequestDetails30 {

    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "RqstrId")
    protected PartyIdentification242Choice rqstrId;
    @XmlElement(name = "AddtlReqInf")
    protected List<String> addtlReqInf;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * Gets the value of the rqstrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getRqstrId() {
        return rqstrId;
    }

    /**
     * Sets the value of the rqstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setRqstrId(PartyIdentification242Choice value) {
        this.rqstrId = value;
    }

    /**
     * Gets the value of the addtlReqInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlReqInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlReqInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlReqInf property.
     */
    public List<String> getAddtlReqInf() {
        if (addtlReqInf == null) {
            addtlReqInf = new ArrayList<>();
        }
        return this.addtlReqInf;
    }

}
