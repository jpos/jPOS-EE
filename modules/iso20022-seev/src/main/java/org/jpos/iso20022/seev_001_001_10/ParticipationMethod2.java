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

package org.jpos.iso20022.seev_001_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParticipationMethod2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ParticipationMethod2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrtcptnMtd" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}ParticipationMethod3Choice"/>
 *         <element name="IssrDdlnForVtng" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}DateFormat58Choice"/>
 *         <element name="SpprtdByAcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}YesNoIndicator" minOccurs="0"/>
 *         <element name="RspnDdlnForVtng" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}DateFormat58Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipationMethod2", propOrder = {
    "prtcptnMtd",
    "issrDdlnForVtng",
    "spprtdByAcctSvcr",
    "rspnDdlnForVtng"
})
public class ParticipationMethod2 {

    @XmlElement(name = "PrtcptnMtd", required = true)
    protected ParticipationMethod3Choice prtcptnMtd;
    @XmlElement(name = "IssrDdlnForVtng", required = true)
    protected DateFormat58Choice issrDdlnForVtng;
    @XmlElement(name = "SpprtdByAcctSvcr")
    protected Boolean spprtdByAcctSvcr;
    @XmlElement(name = "RspnDdlnForVtng")
    protected DateFormat58Choice rspnDdlnForVtng;

    /**
     * Gets the value of the prtcptnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipationMethod3Choice }
     *     
     */
    public ParticipationMethod3Choice getPrtcptnMtd() {
        return prtcptnMtd;
    }

    /**
     * Sets the value of the prtcptnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationMethod3Choice }
     *     
     */
    public void setPrtcptnMtd(ParticipationMethod3Choice value) {
        this.prtcptnMtd = value;
    }

    /**
     * Gets the value of the issrDdlnForVtng property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getIssrDdlnForVtng() {
        return issrDdlnForVtng;
    }

    /**
     * Sets the value of the issrDdlnForVtng property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public void setIssrDdlnForVtng(DateFormat58Choice value) {
        this.issrDdlnForVtng = value;
    }

    /**
     * Gets the value of the spprtdByAcctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpprtdByAcctSvcr() {
        return spprtdByAcctSvcr;
    }

    /**
     * Sets the value of the spprtdByAcctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpprtdByAcctSvcr(Boolean value) {
        this.spprtdByAcctSvcr = value;
    }

    /**
     * Gets the value of the rspnDdlnForVtng property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getRspnDdlnForVtng() {
        return rspnDdlnForVtng;
    }

    /**
     * Sets the value of the rspnDdlnForVtng property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public void setRspnDdlnForVtng(DateFormat58Choice value) {
        this.rspnDdlnForVtng = value;
    }

}
