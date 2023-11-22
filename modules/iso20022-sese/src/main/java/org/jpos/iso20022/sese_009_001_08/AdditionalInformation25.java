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

package org.jpos.iso20022.sese_009_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalInformation25 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdditionalInformation25">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="QryTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}GenericIdentification36" minOccurs="0"/>
 *         <element name="Qry" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}Max350Text"/>
 *         <element name="QryRsn" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}Max350Text" minOccurs="0"/>
 *         <element name="RjctnRsn" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}RejectedReason33Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalInformation25", propOrder = {
    "qryTp",
    "qry",
    "qryRsn",
    "rjctnRsn"
})
public class AdditionalInformation25 {

    @XmlElement(name = "QryTp")
    protected GenericIdentification36 qryTp;
    @XmlElement(name = "Qry", required = true)
    protected String qry;
    @XmlElement(name = "QryRsn")
    protected String qryRsn;
    @XmlElement(name = "RjctnRsn")
    protected RejectedReason33Choice rjctnRsn;

    /**
     * Gets the value of the qryTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification36 }
     *     
     */
    public GenericIdentification36 getQryTp() {
        return qryTp;
    }

    /**
     * Sets the value of the qryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification36 }
     *     
     */
    public void setQryTp(GenericIdentification36 value) {
        this.qryTp = value;
    }

    /**
     * Gets the value of the qry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQry() {
        return qry;
    }

    /**
     * Sets the value of the qry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQry(String value) {
        this.qry = value;
    }

    /**
     * Gets the value of the qryRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryRsn() {
        return qryRsn;
    }

    /**
     * Sets the value of the qryRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryRsn(String value) {
        this.qryRsn = value;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedReason33Choice }
     *     
     */
    public RejectedReason33Choice getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedReason33Choice }
     *     
     */
    public void setRjctnRsn(RejectedReason33Choice value) {
        this.rjctnRsn = value;
    }

}
