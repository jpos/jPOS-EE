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

package org.jpos.iso20022.tsmt_033_001_03;

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
 *         <element name="StsXtnsnReqRjctn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.033.001.03}StatusExtensionRequestRejectionV03"/>
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
    "stsXtnsnReqRjctn"
})
public class Document {

    @XmlElement(name = "StsXtnsnReqRjctn", required = true)
    protected StatusExtensionRequestRejectionV03 stsXtnsnReqRjctn;

    /**
     * Gets the value of the stsXtnsnReqRjctn property.
     * 
     * @return
     *     possible object is
     *     {@link StatusExtensionRequestRejectionV03 }
     *     
     */
    public StatusExtensionRequestRejectionV03 getStsXtnsnReqRjctn() {
        return stsXtnsnReqRjctn;
    }

    /**
     * Sets the value of the stsXtnsnReqRjctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusExtensionRequestRejectionV03 }
     *     
     */
    public void setStsXtnsnReqRjctn(StatusExtensionRequestRejectionV03 value) {
        this.stsXtnsnReqRjctn = value;
    }

}
