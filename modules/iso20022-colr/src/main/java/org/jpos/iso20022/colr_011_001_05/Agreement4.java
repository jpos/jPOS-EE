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

package org.jpos.iso20022.colr_011_001_05;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Agreement4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Agreement4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AgrmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.011.001.05}Max140Text"/>
 *         <element name="AgrmtId" type="{urn:iso:std:iso:20022:tech:xsd:colr.011.001.05}Max140Text" minOccurs="0"/>
 *         <element name="AgrmtDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.011.001.05}ISODate"/>
 *         <element name="BaseCcy" type="{urn:iso:std:iso:20022:tech:xsd:colr.011.001.05}ActiveCurrencyCode"/>
 *         <element name="AgrmtFrmwk" type="{urn:iso:std:iso:20022:tech:xsd:colr.011.001.05}AgreementFramework1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agreement4", propOrder = {
    "agrmtDtls",
    "agrmtId",
    "agrmtDt",
    "baseCcy",
    "agrmtFrmwk"
})
public class Agreement4 {

    @XmlElement(name = "AgrmtDtls", required = true)
    protected String agrmtDtls;
    @XmlElement(name = "AgrmtId")
    protected String agrmtId;
    @XmlElement(name = "AgrmtDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar agrmtDt;
    @XmlElement(name = "BaseCcy", required = true)
    protected String baseCcy;
    @XmlElement(name = "AgrmtFrmwk")
    protected AgreementFramework1Choice agrmtFrmwk;

    /**
     * Gets the value of the agrmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgrmtDtls() {
        return agrmtDtls;
    }

    /**
     * Sets the value of the agrmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgrmtDtls(String value) {
        this.agrmtDtls = value;
    }

    /**
     * Gets the value of the agrmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgrmtId() {
        return agrmtId;
    }

    /**
     * Sets the value of the agrmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgrmtId(String value) {
        this.agrmtId = value;
    }

    /**
     * Gets the value of the agrmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAgrmtDt() {
        return agrmtDt;
    }

    /**
     * Sets the value of the agrmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAgrmtDt(XMLGregorianCalendar value) {
        this.agrmtDt = value;
    }

    /**
     * Gets the value of the baseCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCcy() {
        return baseCcy;
    }

    /**
     * Sets the value of the baseCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCcy(String value) {
        this.baseCcy = value;
    }

    /**
     * Gets the value of the agrmtFrmwk property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementFramework1Choice }
     *     
     */
    public AgreementFramework1Choice getAgrmtFrmwk() {
        return agrmtFrmwk;
    }

    /**
     * Sets the value of the agrmtFrmwk property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementFramework1Choice }
     *     
     */
    public void setAgrmtFrmwk(AgreementFramework1Choice value) {
        this.agrmtFrmwk = value;
    }

}
