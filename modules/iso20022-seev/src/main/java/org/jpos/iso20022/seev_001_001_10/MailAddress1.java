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

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailAddress1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MailAddress1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Crspdc" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}PostalAddress1" maxOccurs="5" minOccurs="0"/>
 *         <element name="EmailAdr" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Max256Text" maxOccurs="5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailAddress1", propOrder = {
    "crspdc",
    "emailAdr"
})
public class MailAddress1 {

    @XmlElement(name = "Crspdc")
    protected List<PostalAddress1> crspdc;
    @XmlElement(name = "EmailAdr")
    protected List<String> emailAdr;

    /**
     * Gets the value of the crspdc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the crspdc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrspdc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddress1 }
     * 
     * 
     * @return
     *     The value of the crspdc property.
     */
    public List<PostalAddress1> getCrspdc() {
        if (crspdc == null) {
            crspdc = new ArrayList<>();
        }
        return this.crspdc;
    }

    /**
     * Gets the value of the emailAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the emailAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the emailAdr property.
     */
    public List<String> getEmailAdr() {
        if (emailAdr == null) {
            emailAdr = new ArrayList<>();
        }
        return this.emailAdr;
    }

}
