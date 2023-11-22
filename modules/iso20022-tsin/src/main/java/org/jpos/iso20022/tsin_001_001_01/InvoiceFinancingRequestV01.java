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

package org.jpos.iso20022.tsin_001_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceFinancingRequestV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvoiceFinancingRequestV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ReqGrpInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}RequestGroupInformation1"/>
 *         <element name="InvcReqInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}InvoiceRequestInformation1" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceFinancingRequestV01", propOrder = {
    "reqGrpInf",
    "invcReqInf"
})
public class InvoiceFinancingRequestV01 {

    @XmlElement(name = "ReqGrpInf", required = true)
    protected RequestGroupInformation1 reqGrpInf;
    @XmlElement(name = "InvcReqInf", required = true)
    protected List<InvoiceRequestInformation1> invcReqInf;

    /**
     * Gets the value of the reqGrpInf property.
     * 
     * @return
     *     possible object is
     *     {@link RequestGroupInformation1 }
     *     
     */
    public RequestGroupInformation1 getReqGrpInf() {
        return reqGrpInf;
    }

    /**
     * Sets the value of the reqGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestGroupInformation1 }
     *     
     */
    public void setReqGrpInf(RequestGroupInformation1 value) {
        this.reqGrpInf = value;
    }

    /**
     * Gets the value of the invcReqInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the invcReqInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvcReqInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceRequestInformation1 }
     * 
     * 
     * @return
     *     The value of the invcReqInf property.
     */
    public List<InvoiceRequestInformation1> getInvcReqInf() {
        if (invcReqInf == null) {
            invcReqInf = new ArrayList<>();
        }
        return this.invcReqInf;
    }

}
