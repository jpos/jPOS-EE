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

package org.jpos.iso20022.auth_091_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportingRequirement2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportingRequirement2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="RptgRqrmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}ReconciliationCategory3"/>
 *         <element name="NoRptgRqrmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}ReconciliationCategory2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingRequirement2Choice", propOrder = {
    "rptgRqrmnt",
    "noRptgRqrmnt"
})
public class ReportingRequirement2Choice {

    @XmlElement(name = "RptgRqrmnt")
    protected ReconciliationCategory3 rptgRqrmnt;
    @XmlElement(name = "NoRptgRqrmnt")
    protected ReconciliationCategory2 noRptgRqrmnt;

    /**
     * Gets the value of the rptgRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationCategory3 }
     *     
     */
    public ReconciliationCategory3 getRptgRqrmnt() {
        return rptgRqrmnt;
    }

    /**
     * Sets the value of the rptgRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationCategory3 }
     *     
     */
    public void setRptgRqrmnt(ReconciliationCategory3 value) {
        this.rptgRqrmnt = value;
    }

    /**
     * Gets the value of the noRptgRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationCategory2 }
     *     
     */
    public ReconciliationCategory2 getNoRptgRqrmnt() {
        return noRptgRqrmnt;
    }

    /**
     * Sets the value of the noRptgRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationCategory2 }
     *     
     */
    public void setNoRptgRqrmnt(ReconciliationCategory2 value) {
        this.noRptgRqrmnt = value;
    }

}
