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

package org.jpos.iso20022.seev_047_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareholdingBalance1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ShareholdingBalance1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ShrhldgTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}ShareholdingType1Code"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}FinancialInstrumentQuantity18Choice"/>
 *         <element name="InitlDtOfShrhldg" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}DateFormat57Choice" minOccurs="0"/>
 *         <element name="ThrdPty" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}PartyIdentification218" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareholdingBalance1", propOrder = {
    "shrhldgTp",
    "qty",
    "initlDtOfShrhldg",
    "thrdPty",
    "splmtryData"
})
public class ShareholdingBalance1 {

    @XmlElement(name = "ShrhldgTp", required = true)
    @XmlSchemaType(name = "string")
    protected ShareholdingType1Code shrhldgTp;
    @XmlElement(name = "Qty", required = true)
    protected FinancialInstrumentQuantity18Choice qty;
    @XmlElement(name = "InitlDtOfShrhldg")
    protected DateFormat57Choice initlDtOfShrhldg;
    @XmlElement(name = "ThrdPty")
    protected List<PartyIdentification218> thrdPty;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the shrhldgTp property.
     * 
     * @return
     *     possible object is
     *     {@link ShareholdingType1Code }
     *     
     */
    public ShareholdingType1Code getShrhldgTp() {
        return shrhldgTp;
    }

    /**
     * Sets the value of the shrhldgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareholdingType1Code }
     *     
     */
    public void setShrhldgTp(ShareholdingType1Code value) {
        this.shrhldgTp = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setQty(FinancialInstrumentQuantity18Choice value) {
        this.qty = value;
    }

    /**
     * Gets the value of the initlDtOfShrhldg property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat57Choice }
     *     
     */
    public DateFormat57Choice getInitlDtOfShrhldg() {
        return initlDtOfShrhldg;
    }

    /**
     * Sets the value of the initlDtOfShrhldg property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat57Choice }
     *     
     */
    public void setInitlDtOfShrhldg(DateFormat57Choice value) {
        this.initlDtOfShrhldg = value;
    }

    /**
     * Gets the value of the thrdPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the thrdPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThrdPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification218 }
     * 
     * 
     * @return
     *     The value of the thrdPty property.
     */
    public List<PartyIdentification218> getThrdPty() {
        if (thrdPty == null) {
            thrdPty = new ArrayList<>();
        }
        return this.thrdPty;
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
