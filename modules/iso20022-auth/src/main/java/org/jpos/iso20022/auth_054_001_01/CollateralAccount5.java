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

package org.jpos.iso20022.auth_054_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralAccount5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralAccount5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.054.001.01}PartyIdentification118Choice"/>
 *         <element name="RltdMrgnAcct" type="{urn:iso:std:iso:20022:tech:xsd:auth.054.001.01}MarginAccount1" maxOccurs="unbounded"/>
 *         <element name="TitlTrfCollArrgmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.054.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="CollSgrtnByVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.054.001.01}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralAccount5", propOrder = {
    "id",
    "rltdMrgnAcct",
    "titlTrfCollArrgmnt",
    "collSgrtnByVal"
})
public class CollateralAccount5 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification118Choice id;
    @XmlElement(name = "RltdMrgnAcct", required = true)
    protected List<MarginAccount1> rltdMrgnAcct;
    @XmlElement(name = "TitlTrfCollArrgmnt")
    protected Boolean titlTrfCollArrgmnt;
    @XmlElement(name = "CollSgrtnByVal")
    protected Boolean collSgrtnByVal;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification118Choice }
     *     
     */
    public PartyIdentification118Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification118Choice }
     *     
     */
    public void setId(PartyIdentification118Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the rltdMrgnAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdMrgnAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdMrgnAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarginAccount1 }
     * 
     * 
     * @return
     *     The value of the rltdMrgnAcct property.
     */
    public List<MarginAccount1> getRltdMrgnAcct() {
        if (rltdMrgnAcct == null) {
            rltdMrgnAcct = new ArrayList<>();
        }
        return this.rltdMrgnAcct;
    }

    /**
     * Gets the value of the titlTrfCollArrgmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTitlTrfCollArrgmnt() {
        return titlTrfCollArrgmnt;
    }

    /**
     * Sets the value of the titlTrfCollArrgmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTitlTrfCollArrgmnt(Boolean value) {
        this.titlTrfCollArrgmnt = value;
    }

    /**
     * Gets the value of the collSgrtnByVal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollSgrtnByVal() {
        return collSgrtnByVal;
    }

    /**
     * Sets the value of the collSgrtnByVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollSgrtnByVal(Boolean value) {
        this.collSgrtnByVal = value;
    }

}
