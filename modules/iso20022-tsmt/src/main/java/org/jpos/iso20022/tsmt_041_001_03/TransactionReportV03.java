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

package org.jpos.iso20022.tsmt_041_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionReportV03 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionReportV03">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.041.001.03}MessageIdentification1"/>
 *         <element name="RltdMsgRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.041.001.03}MessageIdentification1"/>
 *         <element name="RptdItms" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.041.001.03}TransactionReportItems3" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionReportV03", propOrder = {
    "rptId",
    "rltdMsgRef",
    "rptdItms"
})
public class TransactionReportV03 {

    @XmlElement(name = "RptId", required = true)
    protected MessageIdentification1 rptId;
    @XmlElement(name = "RltdMsgRef", required = true)
    protected MessageIdentification1 rltdMsgRef;
    @XmlElement(name = "RptdItms")
    protected List<TransactionReportItems3> rptdItms;

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setRptId(MessageIdentification1 value) {
        this.rptId = value;
    }

    /**
     * Gets the value of the rltdMsgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRltdMsgRef() {
        return rltdMsgRef;
    }

    /**
     * Sets the value of the rltdMsgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setRltdMsgRef(MessageIdentification1 value) {
        this.rltdMsgRef = value;
    }

    /**
     * Gets the value of the rptdItms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rptdItms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptdItms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionReportItems3 }
     * 
     * 
     * @return
     *     The value of the rptdItms property.
     */
    public List<TransactionReportItems3> getRptdItms() {
        if (rptdItms == null) {
            rptdItms = new ArrayList<>();
        }
        return this.rptdItms;
    }

}
