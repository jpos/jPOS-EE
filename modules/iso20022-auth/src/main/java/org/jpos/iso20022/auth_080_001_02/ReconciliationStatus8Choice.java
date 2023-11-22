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

package org.jpos.iso20022.auth_080_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationStatus8Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReconciliationStatus8Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="NoRcncltnReqrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}NoReasonCode"/>
 *         <element name="RptgData" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}ReconciliationMatchedStatus9Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationStatus8Choice", propOrder = {
    "noRcncltnReqrd",
    "rptgData"
})
public class ReconciliationStatus8Choice {

    @XmlElement(name = "NoRcncltnReqrd")
    @XmlSchemaType(name = "string")
    protected NoReasonCode noRcncltnReqrd;
    @XmlElement(name = "RptgData")
    protected ReconciliationMatchedStatus9Choice rptgData;

    /**
     * Gets the value of the noRcncltnReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getNoRcncltnReqrd() {
        return noRcncltnReqrd;
    }

    /**
     * Sets the value of the noRcncltnReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public void setNoRcncltnReqrd(NoReasonCode value) {
        this.noRcncltnReqrd = value;
    }

    /**
     * Gets the value of the rptgData property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationMatchedStatus9Choice }
     *     
     */
    public ReconciliationMatchedStatus9Choice getRptgData() {
        return rptgData;
    }

    /**
     * Sets the value of the rptgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationMatchedStatus9Choice }
     *     
     */
    public void setRptgData(ReconciliationMatchedStatus9Choice value) {
        this.rptgData = value;
    }

}
