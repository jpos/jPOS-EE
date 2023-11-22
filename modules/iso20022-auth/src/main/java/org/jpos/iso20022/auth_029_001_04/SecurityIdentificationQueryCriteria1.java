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

package org.jpos.iso20022.auth_029_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityIdentificationQueryCriteria1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityIdentificationQueryCriteria1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ISIN" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}ISINOct2015Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AltrntvInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}Max52Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentificationQueryCriteria1", propOrder = {
    "isin",
    "altrntvInstrmId"
})
public class SecurityIdentificationQueryCriteria1 {

    @XmlElement(name = "ISIN")
    protected List<String> isin;
    @XmlElement(name = "AltrntvInstrmId")
    protected List<String> altrntvInstrmId;

    /**
     * Gets the value of the isin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the isin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getISIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the isin property.
     */
    public List<String> getISIN() {
        if (isin == null) {
            isin = new ArrayList<>();
        }
        return this.isin;
    }

    /**
     * Gets the value of the altrntvInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the altrntvInstrmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltrntvInstrmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the altrntvInstrmId property.
     */
    public List<String> getAltrntvInstrmId() {
        if (altrntvInstrmId == null) {
            altrntvInstrmId = new ArrayList<>();
        }
        return this.altrntvInstrmId;
    }

}
