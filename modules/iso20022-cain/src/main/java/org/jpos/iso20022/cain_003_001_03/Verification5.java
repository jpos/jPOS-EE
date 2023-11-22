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

package org.jpos.iso20022.cain_003_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Verification5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Verification5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}ExternalAuthenticationMethod1Code" minOccurs="0"/>
 *         <element name="OthrTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="SubTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="VrfctnInf" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}VerificationInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="VrfctnRslt" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}VerificationResult2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Verification5", propOrder = {
    "tp",
    "othrTp",
    "subTp",
    "vrfctnInf",
    "vrfctnRslt"
})
public class Verification5 {

    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "SubTp")
    protected String subTp;
    @XmlElement(name = "VrfctnInf")
    protected List<VerificationInformation1> vrfctnInf;
    @XmlElement(name = "VrfctnRslt")
    protected List<VerificationResult2> vrfctnRslt;

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
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrTp(String value) {
        this.othrTp = value;
    }

    /**
     * Gets the value of the subTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTp() {
        return subTp;
    }

    /**
     * Sets the value of the subTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTp(String value) {
        this.subTp = value;
    }

    /**
     * Gets the value of the vrfctnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the vrfctnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVrfctnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerificationInformation1 }
     * 
     * 
     * @return
     *     The value of the vrfctnInf property.
     */
    public List<VerificationInformation1> getVrfctnInf() {
        if (vrfctnInf == null) {
            vrfctnInf = new ArrayList<>();
        }
        return this.vrfctnInf;
    }

    /**
     * Gets the value of the vrfctnRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the vrfctnRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVrfctnRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerificationResult2 }
     * 
     * 
     * @return
     *     The value of the vrfctnRslt property.
     */
    public List<VerificationResult2> getVrfctnRslt() {
        if (vrfctnRslt == null) {
            vrfctnRslt = new ArrayList<>();
        }
        return this.vrfctnRslt;
    }

}
