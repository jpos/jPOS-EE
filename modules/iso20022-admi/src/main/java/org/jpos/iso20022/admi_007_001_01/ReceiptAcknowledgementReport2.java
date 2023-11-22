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

package org.jpos.iso20022.admi_007_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiptAcknowledgementReport2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReceiptAcknowledgementReport2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RltdRef" type="{urn:iso:std:iso:20022:tech:xsd:admi.007.001.01}MessageReference1"/>
 *         <element name="ReqHdlg" type="{urn:iso:std:iso:20022:tech:xsd:admi.007.001.01}RequestHandling2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiptAcknowledgementReport2", propOrder = {
    "rltdRef",
    "reqHdlg"
})
public class ReceiptAcknowledgementReport2 {

    @XmlElement(name = "RltdRef", required = true)
    protected MessageReference1 rltdRef;
    @XmlElement(name = "ReqHdlg", required = true)
    protected RequestHandling2 reqHdlg;

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReference1 }
     *     
     */
    public MessageReference1 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReference1 }
     *     
     */
    public void setRltdRef(MessageReference1 value) {
        this.rltdRef = value;
    }

    /**
     * Gets the value of the reqHdlg property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHandling2 }
     *     
     */
    public RequestHandling2 getReqHdlg() {
        return reqHdlg;
    }

    /**
     * Sets the value of the reqHdlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHandling2 }
     *     
     */
    public void setReqHdlg(RequestHandling2 value) {
        this.reqHdlg = value;
    }

}
