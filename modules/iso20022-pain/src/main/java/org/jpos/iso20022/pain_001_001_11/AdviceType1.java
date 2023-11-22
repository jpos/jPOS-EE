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

package org.jpos.iso20022.pain_001_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdviceType1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdviceType1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdtAdvc" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}AdviceType1Choice" minOccurs="0"/>
 *         <element name="DbtAdvc" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}AdviceType1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdviceType1", propOrder = {
    "cdtAdvc",
    "dbtAdvc"
})
public class AdviceType1 {

    @XmlElement(name = "CdtAdvc")
    protected AdviceType1Choice cdtAdvc;
    @XmlElement(name = "DbtAdvc")
    protected AdviceType1Choice dbtAdvc;

    /**
     * Gets the value of the cdtAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AdviceType1Choice }
     *     
     */
    public AdviceType1Choice getCdtAdvc() {
        return cdtAdvc;
    }

    /**
     * Sets the value of the cdtAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdviceType1Choice }
     *     
     */
    public void setCdtAdvc(AdviceType1Choice value) {
        this.cdtAdvc = value;
    }

    /**
     * Gets the value of the dbtAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AdviceType1Choice }
     *     
     */
    public AdviceType1Choice getDbtAdvc() {
        return dbtAdvc;
    }

    /**
     * Sets the value of the dbtAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdviceType1Choice }
     *     
     */
    public void setDbtAdvc(AdviceType1Choice value) {
        this.dbtAdvc = value;
    }

}
