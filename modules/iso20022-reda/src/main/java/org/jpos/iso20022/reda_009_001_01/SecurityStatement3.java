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

package org.jpos.iso20022.reda_009_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityStatement3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityStatement3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SysDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.009.001.01}ISODate"/>
 *         <element name="Chng" type="{urn:iso:std:iso:20022:tech:xsd:reda.009.001.01}SecuritiesReferenceDataChange3" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityStatement3", propOrder = {
    "sysDt",
    "chng"
})
public class SecurityStatement3 {

    @XmlElement(name = "SysDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sysDt;
    @XmlElement(name = "Chng")
    protected List<SecuritiesReferenceDataChange3> chng;

    /**
     * Gets the value of the sysDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSysDt() {
        return sysDt;
    }

    /**
     * Sets the value of the sysDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSysDt(XMLGregorianCalendar value) {
        this.sysDt = value;
    }

    /**
     * Gets the value of the chng property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chng property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChng().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesReferenceDataChange3 }
     * 
     * 
     * @return
     *     The value of the chng property.
     */
    public List<SecuritiesReferenceDataChange3> getChng() {
        if (chng == null) {
            chng = new ArrayList<>();
        }
        return this.chng;
    }

}
