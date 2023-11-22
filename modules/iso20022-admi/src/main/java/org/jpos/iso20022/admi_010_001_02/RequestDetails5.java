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

package org.jpos.iso20022.admi_010_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestDetails5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequestDetails5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:admi.010.001.02}Max35Text"/>
 *         <element name="ReqRef" type="{urn:iso:std:iso:20022:tech:xsd:admi.010.001.02}Max35Text"/>
 *         <element name="RptKey" type="{urn:iso:std:iso:20022:tech:xsd:admi.010.001.02}RequestDetails4" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDetails5", propOrder = {
    "tp",
    "reqRef",
    "rptKey"
})
public class RequestDetails5 {

    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "ReqRef", required = true)
    protected String reqRef;
    @XmlElement(name = "RptKey", required = true)
    protected List<RequestDetails4> rptKey;

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
     * Gets the value of the reqRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqRef() {
        return reqRef;
    }

    /**
     * Sets the value of the reqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqRef(String value) {
        this.reqRef = value;
    }

    /**
     * Gets the value of the rptKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rptKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestDetails4 }
     * 
     * 
     * @return
     *     The value of the rptKey property.
     */
    public List<RequestDetails4> getRptKey() {
        if (rptKey == null) {
            rptKey = new ArrayList<>();
        }
        return this.rptKey;
    }

}
