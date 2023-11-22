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

package org.jpos.iso20022.camt_019_001_07;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessDay8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BusinessDay8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SysId" type="{urn:iso:std:iso:20022:tech:xsd:camt.019.001.07}SystemIdentification2Choice" maxOccurs="unbounded"/>
 *         <element name="BizDayOrErr" type="{urn:iso:std:iso:20022:tech:xsd:camt.019.001.07}BusinessDayReportOrError10Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDay8", propOrder = {
    "sysId",
    "bizDayOrErr"
})
public class BusinessDay8 {

    @XmlElement(name = "SysId", required = true)
    protected List<SystemIdentification2Choice> sysId;
    @XmlElement(name = "BizDayOrErr", required = true)
    protected BusinessDayReportOrError10Choice bizDayOrErr;

    /**
     * Gets the value of the sysId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sysId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSysId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemIdentification2Choice }
     * 
     * 
     * @return
     *     The value of the sysId property.
     */
    public List<SystemIdentification2Choice> getSysId() {
        if (sysId == null) {
            sysId = new ArrayList<>();
        }
        return this.sysId;
    }

    /**
     * Gets the value of the bizDayOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayReportOrError10Choice }
     *     
     */
    public BusinessDayReportOrError10Choice getBizDayOrErr() {
        return bizDayOrErr;
    }

    /**
     * Sets the value of the bizDayOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayReportOrError10Choice }
     *     
     */
    public void setBizDayOrErr(BusinessDayReportOrError10Choice value) {
        this.bizDayOrErr = value;
    }

}
