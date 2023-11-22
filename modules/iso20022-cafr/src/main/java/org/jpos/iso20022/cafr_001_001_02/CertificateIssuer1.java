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

package org.jpos.iso20022.cafr_001_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificateIssuer1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CertificateIssuer1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RltvDstngshdNm" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}RelativeDistinguishedName1" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateIssuer1", propOrder = {
    "rltvDstngshdNm"
})
public class CertificateIssuer1 {

    @XmlElement(name = "RltvDstngshdNm", required = true)
    protected List<RelativeDistinguishedName1> rltvDstngshdNm;

    /**
     * Gets the value of the rltvDstngshdNm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltvDstngshdNm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltvDstngshdNm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelativeDistinguishedName1 }
     * 
     * 
     * @return
     *     The value of the rltvDstngshdNm property.
     */
    public List<RelativeDistinguishedName1> getRltvDstngshdNm() {
        if (rltvDstngshdNm == null) {
            rltvDstngshdNm = new ArrayList<>();
        }
        return this.rltvDstngshdNm;
    }

}
