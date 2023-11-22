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

package org.jpos.iso20022.tsmt_016_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Document">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ErrRpt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.016.001.03}ErrorReportV03"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "errRpt"
})
public class Document {

    @XmlElement(name = "ErrRpt", required = true)
    protected ErrorReportV03 errRpt;

    /**
     * Gets the value of the errRpt property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorReportV03 }
     *     
     */
    public ErrorReportV03 getErrRpt() {
        return errRpt;
    }

    /**
     * Sets the value of the errRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorReportV03 }
     *     
     */
    public void setErrRpt(ErrorReportV03 value) {
        this.errRpt = value;
    }

}
