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

package org.jpos.iso20022.caam_005_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMDiagnosticRequest2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMDiagnosticRequest2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:caam.005.001.02}ATMEnvironment9"/>
 *         <element name="ATMGblSts" type="{urn:iso:std:iso:20022:tech:xsd:caam.005.001.02}ATMStatus1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMDiagnosticRequest2", propOrder = {
    "envt",
    "atmGblSts"
})
public class ATMDiagnosticRequest2 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment9 envt;
    @XmlElement(name = "ATMGblSts", required = true)
    protected ATMStatus1 atmGblSts;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEnvironment9 }
     *     
     */
    public ATMEnvironment9 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEnvironment9 }
     *     
     */
    public void setEnvt(ATMEnvironment9 value) {
        this.envt = value;
    }

    /**
     * Gets the value of the atmGblSts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMStatus1 }
     *     
     */
    public ATMStatus1 getATMGblSts() {
        return atmGblSts;
    }

    /**
     * Sets the value of the atmGblSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMStatus1 }
     *     
     */
    public void setATMGblSts(ATMStatus1 value) {
        this.atmGblSts = value;
    }

}
