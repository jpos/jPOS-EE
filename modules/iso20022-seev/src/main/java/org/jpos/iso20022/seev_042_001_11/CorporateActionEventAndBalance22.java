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

package org.jpos.iso20022.seev_042_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventAndBalance22 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionEventAndBalance22">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}EventInformation15"/>
 *         <element name="UndrlygScty" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SecurityIdentification19"/>
 *         <element name="Bal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}CorporateActionBalance46" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionEventAndBalance22", propOrder = {
    "gnlInf",
    "undrlygScty",
    "bal",
    "splmtryData"
})
public class CorporateActionEventAndBalance22 {

    @XmlElement(name = "GnlInf", required = true)
    protected EventInformation15 gnlInf;
    @XmlElement(name = "UndrlygScty", required = true)
    protected SecurityIdentification19 undrlygScty;
    @XmlElement(name = "Bal")
    protected CorporateActionBalance46 bal;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the gnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link EventInformation15 }
     *     
     */
    public EventInformation15 getGnlInf() {
        return gnlInf;
    }

    /**
     * Sets the value of the gnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventInformation15 }
     *     
     */
    public void setGnlInf(EventInformation15 value) {
        this.gnlInf = value;
    }

    /**
     * Gets the value of the undrlygScty property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getUndrlygScty() {
        return undrlygScty;
    }

    /**
     * Sets the value of the undrlygScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setUndrlygScty(SecurityIdentification19 value) {
        this.undrlygScty = value;
    }

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionBalance46 }
     *     
     */
    public CorporateActionBalance46 getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionBalance46 }
     *     
     */
    public void setBal(CorporateActionBalance46 value) {
        this.bal = value;
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
