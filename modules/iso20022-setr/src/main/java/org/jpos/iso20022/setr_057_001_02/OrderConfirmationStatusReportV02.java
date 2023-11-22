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

package org.jpos.iso20022.setr_057_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderConfirmationStatusReportV02 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OrderConfirmationStatusReportV02">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:setr.057.001.02}MessageIdentification1"/>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:setr.057.001.02}References61Choice" minOccurs="0"/>
 *         <element name="IndvOrdrConfDtlsRpt" type="{urn:iso:std:iso:20022:tech:xsd:setr.057.001.02}IndividualOrderConfirmationStatusAndReason2" maxOccurs="unbounded"/>
 *         <element name="Xtnsn" type="{urn:iso:std:iso:20022:tech:xsd:setr.057.001.02}Extension1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderConfirmationStatusReportV02", propOrder = {
    "msgId",
    "ref",
    "indvOrdrConfDtlsRpt",
    "xtnsn"
})
public class OrderConfirmationStatusReportV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "Ref")
    protected References61Choice ref;
    @XmlElement(name = "IndvOrdrConfDtlsRpt", required = true)
    protected List<IndividualOrderConfirmationStatusAndReason2> indvOrdrConfDtlsRpt;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setMsgId(MessageIdentification1 value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References61Choice }
     *     
     */
    public References61Choice getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References61Choice }
     *     
     */
    public void setRef(References61Choice value) {
        this.ref = value;
    }

    /**
     * Gets the value of the indvOrdrConfDtlsRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indvOrdrConfDtlsRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvOrdrConfDtlsRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualOrderConfirmationStatusAndReason2 }
     * 
     * 
     * @return
     *     The value of the indvOrdrConfDtlsRpt property.
     */
    public List<IndividualOrderConfirmationStatusAndReason2> getIndvOrdrConfDtlsRpt() {
        if (indvOrdrConfDtlsRpt == null) {
            indvOrdrConfDtlsRpt = new ArrayList<>();
        }
        return this.indvOrdrConfDtlsRpt;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<>();
        }
        return this.xtnsn;
    }

}
