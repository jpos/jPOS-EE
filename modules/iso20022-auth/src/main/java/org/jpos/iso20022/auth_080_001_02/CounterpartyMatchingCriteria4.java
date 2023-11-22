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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterpartyMatchingCriteria4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CounterpartyMatchingCriteria4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptgCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareOrganisationIdentification6" minOccurs="0"/>
 *         <element name="OthrCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareOrganisationIdentification7" minOccurs="0"/>
 *         <element name="CtrPtySd" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareCounterpartySide2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyMatchingCriteria4", propOrder = {
    "rptgCtrPty",
    "othrCtrPty",
    "ctrPtySd"
})
public class CounterpartyMatchingCriteria4 {

    @XmlElement(name = "RptgCtrPty")
    protected CompareOrganisationIdentification6 rptgCtrPty;
    @XmlElement(name = "OthrCtrPty")
    protected CompareOrganisationIdentification7 othrCtrPty;
    @XmlElement(name = "CtrPtySd")
    protected CompareCounterpartySide2 ctrPtySd;

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareOrganisationIdentification6 }
     *     
     */
    public CompareOrganisationIdentification6 getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareOrganisationIdentification6 }
     *     
     */
    public void setRptgCtrPty(CompareOrganisationIdentification6 value) {
        this.rptgCtrPty = value;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareOrganisationIdentification7 }
     *     
     */
    public CompareOrganisationIdentification7 getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareOrganisationIdentification7 }
     *     
     */
    public void setOthrCtrPty(CompareOrganisationIdentification7 value) {
        this.othrCtrPty = value;
    }

    /**
     * Gets the value of the ctrPtySd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCounterpartySide2 }
     *     
     */
    public CompareCounterpartySide2 getCtrPtySd() {
        return ctrPtySd;
    }

    /**
     * Sets the value of the ctrPtySd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCounterpartySide2 }
     *     
     */
    public void setCtrPtySd(CompareCounterpartySide2 value) {
        this.ctrPtySd = value;
    }

}
