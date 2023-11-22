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

package org.jpos.iso20022.seev_010_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionNotificationAdvice1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionNotificationAdvice1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CorpActnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateAction2"/>
 *         <element name="CorpActnOptnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionOption1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNotificationAdvice1", propOrder = {
    "corpActnDtls",
    "corpActnOptnDtls"
})
public class CorporateActionNotificationAdvice1 {

    @XmlElement(name = "CorpActnDtls", required = true)
    protected CorporateAction2 corpActnDtls;
    @XmlElement(name = "CorpActnOptnDtls")
    protected List<CorporateActionOption1> corpActnOptnDtls;

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction2 }
     *     
     */
    public CorporateAction2 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction2 }
     *     
     */
    public void setCorpActnDtls(CorporateAction2 value) {
        this.corpActnDtls = value;
    }

    /**
     * Gets the value of the corpActnOptnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the corpActnOptnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorpActnOptnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionOption1 }
     * 
     * 
     * @return
     *     The value of the corpActnOptnDtls property.
     */
    public List<CorporateActionOption1> getCorpActnOptnDtls() {
        if (corpActnOptnDtls == null) {
            corpActnOptnDtls = new ArrayList<>();
        }
        return this.corpActnOptnDtls;
    }

}
