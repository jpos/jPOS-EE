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

package org.jpos.iso20022.tsrv_002_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndertakingIssuanceAdviceV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UndertakingIssuanceAdviceV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdvsgPty" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}PartyIdentification43"/>
 *         <element name="ScndAdvsgPty" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}PartyIdentification43" minOccurs="0"/>
 *         <element name="DtOfAdvc" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}DateAndDateTimeChoice"/>
 *         <element name="UdrtkgIssncAdvcDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}UndertakingAdvice1"/>
 *         <element name="BkToBkInf" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}Max2000Text" maxOccurs="5" minOccurs="0"/>
 *         <element name="DgtlSgntr" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}PartyAndSignature2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingIssuanceAdviceV01", propOrder = {
    "advsgPty",
    "scndAdvsgPty",
    "dtOfAdvc",
    "udrtkgIssncAdvcDtls",
    "bkToBkInf",
    "dgtlSgntr"
})
public class UndertakingIssuanceAdviceV01 {

    @XmlElement(name = "AdvsgPty", required = true)
    protected PartyIdentification43 advsgPty;
    @XmlElement(name = "ScndAdvsgPty")
    protected PartyIdentification43 scndAdvsgPty;
    @XmlElement(name = "DtOfAdvc", required = true)
    protected DateAndDateTimeChoice dtOfAdvc;
    @XmlElement(name = "UdrtkgIssncAdvcDtls", required = true)
    protected UndertakingAdvice1 udrtkgIssncAdvcDtls;
    @XmlElement(name = "BkToBkInf")
    protected List<String> bkToBkInf;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Gets the value of the advsgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getAdvsgPty() {
        return advsgPty;
    }

    /**
     * Sets the value of the advsgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setAdvsgPty(PartyIdentification43 value) {
        this.advsgPty = value;
    }

    /**
     * Gets the value of the scndAdvsgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getScndAdvsgPty() {
        return scndAdvsgPty;
    }

    /**
     * Sets the value of the scndAdvsgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setScndAdvsgPty(PartyIdentification43 value) {
        this.scndAdvsgPty = value;
    }

    /**
     * Gets the value of the dtOfAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getDtOfAdvc() {
        return dtOfAdvc;
    }

    /**
     * Sets the value of the dtOfAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setDtOfAdvc(DateAndDateTimeChoice value) {
        this.dtOfAdvc = value;
    }

    /**
     * Gets the value of the udrtkgIssncAdvcDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAdvice1 }
     *     
     */
    public UndertakingAdvice1 getUdrtkgIssncAdvcDtls() {
        return udrtkgIssncAdvcDtls;
    }

    /**
     * Sets the value of the udrtkgIssncAdvcDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAdvice1 }
     *     
     */
    public void setUdrtkgIssncAdvcDtls(UndertakingAdvice1 value) {
        this.udrtkgIssncAdvcDtls = value;
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
     * @return
     *     possible object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public PartyAndSignature2 getDgtlSgntr() {
        return dgtlSgntr;
    }

    /**
     * Sets the value of the dgtlSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public void setDgtlSgntr(PartyAndSignature2 value) {
        this.dgtlSgntr = value;
    }

}
