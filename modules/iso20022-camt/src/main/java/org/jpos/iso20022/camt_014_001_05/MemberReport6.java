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

package org.jpos.iso20022.camt_014_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemberReport6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MemberReport6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MmbId" type="{urn:iso:std:iso:20022:tech:xsd:camt.014.001.05}MemberIdentification3Choice"/>
 *         <element name="MmbOrErr" type="{urn:iso:std:iso:20022:tech:xsd:camt.014.001.05}MemberReportOrError8Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberReport6", propOrder = {
    "mmbId",
    "mmbOrErr"
})
public class MemberReport6 {

    @XmlElement(name = "MmbId", required = true)
    protected MemberIdentification3Choice mmbId;
    @XmlElement(name = "MmbOrErr", required = true)
    protected MemberReportOrError8Choice mmbOrErr;

    /**
     * Gets the value of the mmbId property.
     * 
     * @return
     *     possible object is
     *     {@link MemberIdentification3Choice }
     *     
     */
    public MemberIdentification3Choice getMmbId() {
        return mmbId;
    }

    /**
     * Sets the value of the mmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberIdentification3Choice }
     *     
     */
    public void setMmbId(MemberIdentification3Choice value) {
        this.mmbId = value;
    }

    /**
     * Gets the value of the mmbOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link MemberReportOrError8Choice }
     *     
     */
    public MemberReportOrError8Choice getMmbOrErr() {
        return mmbOrErr;
    }

    /**
     * Sets the value of the mmbOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberReportOrError8Choice }
     *     
     */
    public void setMmbOrErr(MemberReportOrError8Choice value) {
        this.mmbOrErr = value;
    }

}
