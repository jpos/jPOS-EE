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

package org.jpos.iso20022.tsrv_001_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndertakingIssuanceV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UndertakingIssuanceV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UdrtkgIssncDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.001.001.01}Undertaking3"/>
 *         <element name="BkToBnfcryInf" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.001.001.01}Max2000Text" maxOccurs="5" minOccurs="0"/>
 *         <element name="BkToBkInf" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.001.001.01}Max2000Text" maxOccurs="5" minOccurs="0"/>
 *         <element name="DgtlSgntr" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.001.001.01}PartyAndSignature2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingIssuanceV01", propOrder = {
    "udrtkgIssncDtls",
    "bkToBnfcryInf",
    "bkToBkInf",
    "dgtlSgntr"
})
public class UndertakingIssuanceV01 {

    @XmlElement(name = "UdrtkgIssncDtls", required = true)
    protected Undertaking3 udrtkgIssncDtls;
    @XmlElement(name = "BkToBnfcryInf")
    protected List<String> bkToBnfcryInf;
    @XmlElement(name = "BkToBkInf")
    protected List<String> bkToBkInf;
    @XmlElement(name = "DgtlSgntr")
    protected List<PartyAndSignature2> dgtlSgntr;

    /**
     * Gets the value of the udrtkgIssncDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking3 }
     *     
     */
    public Undertaking3 getUdrtkgIssncDtls() {
        return udrtkgIssncDtls;
    }

    /**
     * Sets the value of the udrtkgIssncDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking3 }
     *     
     */
    public void setUdrtkgIssncDtls(Undertaking3 value) {
        this.udrtkgIssncDtls = value;
    }

    /**
     * Gets the value of the bkToBnfcryInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bkToBnfcryInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBkToBnfcryInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the bkToBnfcryInf property.
     */
    public List<String> getBkToBnfcryInf() {
        if (bkToBnfcryInf == null) {
            bkToBnfcryInf = new ArrayList<>();
        }
        return this.bkToBnfcryInf;
    }

    /**
     * Gets the value of the bkToBkInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bkToBkInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBkToBkInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the bkToBkInf property.
     */
    public List<String> getBkToBkInf() {
        if (bkToBkInf == null) {
            bkToBkInf = new ArrayList<>();
        }
        return this.bkToBkInf;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dgtlSgntr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgtlSgntr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAndSignature2 }
     * 
     * 
     * @return
     *     The value of the dgtlSgntr property.
     */
    public List<PartyAndSignature2> getDgtlSgntr() {
        if (dgtlSgntr == null) {
            dgtlSgntr = new ArrayList<>();
        }
        return this.dgtlSgntr;
    }

}
