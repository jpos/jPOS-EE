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

package org.jpos.iso20022.cafr_003_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FraudDispositionStatus2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FraudDispositionStatus2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActnTaken" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}ActionTaken1Code"/>
 *         <element name="OthrActnTaken" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}Max35Text" minOccurs="0"/>
 *         <element name="ErrData" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}Max256Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="WrngData" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}Max256Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}AdditionalInformation30" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FraudDispositionStatus2", propOrder = {
    "actnTaken",
    "othrActnTaken",
    "errData",
    "wrngData",
    "addtlInf"
})
public class FraudDispositionStatus2 {

    @XmlElement(name = "ActnTaken", required = true)
    @XmlSchemaType(name = "string")
    protected ActionTaken1Code actnTaken;
    @XmlElement(name = "OthrActnTaken")
    protected String othrActnTaken;
    @XmlElement(name = "ErrData")
    protected List<String> errData;
    @XmlElement(name = "WrngData")
    protected List<String> wrngData;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation30> addtlInf;

    /**
     * Gets the value of the actnTaken property.
     * 
     * @return
     *     possible object is
     *     {@link ActionTaken1Code }
     *     
     */
    public ActionTaken1Code getActnTaken() {
        return actnTaken;
    }

    /**
     * Sets the value of the actnTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionTaken1Code }
     *     
     */
    public void setActnTaken(ActionTaken1Code value) {
        this.actnTaken = value;
    }

    /**
     * Gets the value of the othrActnTaken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrActnTaken() {
        return othrActnTaken;
    }

    /**
     * Sets the value of the othrActnTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrActnTaken(String value) {
        this.othrActnTaken = value;
    }

    /**
     * Gets the value of the errData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the errData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the errData property.
     */
    public List<String> getErrData() {
        if (errData == null) {
            errData = new ArrayList<>();
        }
        return this.errData;
    }

    /**
     * Gets the value of the wrngData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the wrngData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWrngData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the wrngData property.
     */
    public List<String> getWrngData() {
        if (wrngData == null) {
            wrngData = new ArrayList<>();
        }
        return this.wrngData;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation30 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation30> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
