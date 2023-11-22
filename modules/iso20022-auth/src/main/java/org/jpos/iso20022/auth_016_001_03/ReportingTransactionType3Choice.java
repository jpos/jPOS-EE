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

package org.jpos.iso20022.auth_016_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportingTransactionType3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportingTransactionType3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="New" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}SecuritiesTransactionReport7"/>
 *         <element name="Cxl" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}SecuritiesTransactionReport2"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingTransactionType3Choice", propOrder = {
    "_new",
    "cxl",
    "splmtryData"
})
public class ReportingTransactionType3Choice {

    @XmlElement(name = "New")
    protected SecuritiesTransactionReport7 _new;
    @XmlElement(name = "Cxl")
    protected SecuritiesTransactionReport2 cxl;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionReport7 }
     *     
     */
    public SecuritiesTransactionReport7 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionReport7 }
     *     
     */
    public void setNew(SecuritiesTransactionReport7 value) {
        this._new = value;
    }

    /**
     * Gets the value of the cxl property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionReport2 }
     *     
     */
    public SecuritiesTransactionReport2 getCxl() {
        return cxl;
    }

    /**
     * Sets the value of the cxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionReport2 }
     *     
     */
    public void setCxl(SecuritiesTransactionReport2 value) {
        this.cxl = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
