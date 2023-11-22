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

package org.jpos.iso20022.sese_011_001_09;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Conversion2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Conversion2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SrcScty" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}FinancialInstrumentIdentification1"/>
 *         <element name="TtlUnitsNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}DecimalNumber" minOccurs="0"/>
 *         <element name="UnitsDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}Unit13" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}AdditionalInformation15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conversion2", propOrder = {
    "srcScty",
    "ttlUnitsNb",
    "unitsDtls",
    "addtlInf"
})
public class Conversion2 {

    @XmlElement(name = "SrcScty", required = true)
    protected FinancialInstrumentIdentification1 srcScty;
    @XmlElement(name = "TtlUnitsNb")
    protected BigDecimal ttlUnitsNb;
    @XmlElement(name = "UnitsDtls")
    protected List<Unit13> unitsDtls;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the srcScty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentIdentification1 }
     *     
     */
    public FinancialInstrumentIdentification1 getSrcScty() {
        return srcScty;
    }

    /**
     * Sets the value of the srcScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentIdentification1 }
     *     
     */
    public void setSrcScty(FinancialInstrumentIdentification1 value) {
        this.srcScty = value;
    }

    /**
     * Gets the value of the ttlUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlUnitsNb() {
        return ttlUnitsNb;
    }

    /**
     * Sets the value of the ttlUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlUnitsNb(BigDecimal value) {
        this.ttlUnitsNb = value;
    }

    /**
     * Gets the value of the unitsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the unitsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Unit13 }
     * 
     * 
     * @return
     *     The value of the unitsDtls property.
     */
    public List<Unit13> getUnitsDtls() {
        if (unitsDtls == null) {
            unitsDtls = new ArrayList<>();
        }
        return this.unitsDtls;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
