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

package org.jpos.iso20022.setr_027_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TwoLegTransactionType4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TwoLegTransactionType4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="FutrOrOptnDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}FutureOrOptionDetails3"/>
 *         <element name="SctiesFincgDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}SecuritiesFinancing12"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TwoLegTransactionType4Choice", propOrder = {
    "futrOrOptnDtls",
    "sctiesFincgDtls"
})
public class TwoLegTransactionType4Choice {

    @XmlElement(name = "FutrOrOptnDtls")
    protected FutureOrOptionDetails3 futrOrOptnDtls;
    @XmlElement(name = "SctiesFincgDtls")
    protected SecuritiesFinancing12 sctiesFincgDtls;

    /**
     * Gets the value of the futrOrOptnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FutureOrOptionDetails3 }
     *     
     */
    public FutureOrOptionDetails3 getFutrOrOptnDtls() {
        return futrOrOptnDtls;
    }

    /**
     * Sets the value of the futrOrOptnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutureOrOptionDetails3 }
     *     
     */
    public void setFutrOrOptnDtls(FutureOrOptionDetails3 value) {
        this.futrOrOptnDtls = value;
    }

    /**
     * Gets the value of the sctiesFincgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancing12 }
     *     
     */
    public SecuritiesFinancing12 getSctiesFincgDtls() {
        return sctiesFincgDtls;
    }

    /**
     * Sets the value of the sctiesFincgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancing12 }
     *     
     */
    public void setSctiesFincgDtls(SecuritiesFinancing12 value) {
        this.sctiesFincgDtls = value;
    }

}
