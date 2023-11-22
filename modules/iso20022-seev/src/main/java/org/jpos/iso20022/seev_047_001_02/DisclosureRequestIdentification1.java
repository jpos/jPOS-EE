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

package org.jpos.iso20022.seev_047_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisclosureRequestIdentification1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DisclosureRequestIdentification1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IssrDsclsrReqId" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}Max35Text"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}SecurityIdentification19"/>
 *         <element name="ShrhldrsDsclsrRcrdDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}DateFormat46Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisclosureRequestIdentification1", propOrder = {
    "issrDsclsrReqId",
    "finInstrmId",
    "shrhldrsDsclsrRcrdDt"
})
public class DisclosureRequestIdentification1 {

    @XmlElement(name = "IssrDsclsrReqId", required = true)
    protected String issrDsclsrReqId;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "ShrhldrsDsclsrRcrdDt", required = true)
    protected DateFormat46Choice shrhldrsDsclsrRcrdDt;

    /**
     * Gets the value of the issrDsclsrReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrDsclsrReqId() {
        return issrDsclsrReqId;
    }

    /**
     * Sets the value of the issrDsclsrReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssrDsclsrReqId(String value) {
        this.issrDsclsrReqId = value;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the shrhldrsDsclsrRcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat46Choice }
     *     
     */
    public DateFormat46Choice getShrhldrsDsclsrRcrdDt() {
        return shrhldrsDsclsrRcrdDt;
    }

    /**
     * Sets the value of the shrhldrsDsclsrRcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat46Choice }
     *     
     */
    public void setShrhldrsDsclsrRcrdDt(DateFormat46Choice value) {
        this.shrhldrsDsclsrRcrdDt = value;
    }

}
