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

package org.jpos.iso20022.caaa_021_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionAdviceResponseV04 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionAdviceResponseV04">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.021.001.04}Header70"/>
 *         <element name="TxAdvcRspn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.021.001.04}AcceptorCompletionAdviceResponse11"/>
 *         <element name="SctyTrlr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.021.001.04}ContentInformationType36" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionAdviceResponseV04", propOrder = {
    "hdr",
    "txAdvcRspn",
    "sctyTrlr"
})
public class TransactionAdviceResponseV04 {

    @XmlElement(name = "Hdr", required = true)
    protected Header70 hdr;
    @XmlElement(name = "TxAdvcRspn", required = true)
    protected AcceptorCompletionAdviceResponse11 txAdvcRspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType36 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header70 }
     *     
     */
    public Header70 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header70 }
     *     
     */
    public void setHdr(Header70 value) {
        this.hdr = value;
    }

    /**
     * Gets the value of the txAdvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCompletionAdviceResponse11 }
     *     
     */
    public AcceptorCompletionAdviceResponse11 getTxAdvcRspn() {
        return txAdvcRspn;
    }

    /**
     * Sets the value of the txAdvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCompletionAdviceResponse11 }
     *     
     */
    public void setTxAdvcRspn(AcceptorCompletionAdviceResponse11 value) {
        this.txAdvcRspn = value;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType36 }
     *     
     */
    public ContentInformationType36 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType36 }
     *     
     */
    public void setSctyTrlr(ContentInformationType36 value) {
        this.sctyTrlr = value;
    }

}
