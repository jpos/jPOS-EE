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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTransactionIndicator2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesTransactionIndicator2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WvrInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}ReportingWaiverType1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ShrtSellgInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}Side5Code" minOccurs="0"/>
 *         <element name="OTCPstTradInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}ReportingWaiverType3Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RskRdcgTx" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="SctiesFincgTxInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}TrueFalseIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionIndicator2", propOrder = {
    "wvrInd",
    "shrtSellgInd",
    "otcPstTradInd",
    "rskRdcgTx",
    "sctiesFincgTxInd"
})
public class SecuritiesTransactionIndicator2 {

    @XmlElement(name = "WvrInd")
    @XmlSchemaType(name = "string")
    protected List<ReportingWaiverType1Code> wvrInd;
    @XmlElement(name = "ShrtSellgInd")
    @XmlSchemaType(name = "string")
    protected Side5Code shrtSellgInd;
    @XmlElement(name = "OTCPstTradInd")
    @XmlSchemaType(name = "string")
    protected List<ReportingWaiverType3Code> otcPstTradInd;
    @XmlElement(name = "RskRdcgTx")
    protected Boolean rskRdcgTx;
    @XmlElement(name = "SctiesFincgTxInd")
    protected boolean sctiesFincgTxInd;

    /**
     * Gets the value of the wvrInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the wvrInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWvrInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportingWaiverType1Code }
     * 
     * 
     * @return
     *     The value of the wvrInd property.
     */
    public List<ReportingWaiverType1Code> getWvrInd() {
        if (wvrInd == null) {
            wvrInd = new ArrayList<>();
        }
        return this.wvrInd;
    }

    /**
     * Gets the value of the shrtSellgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Side5Code }
     *     
     */
    public Side5Code getShrtSellgInd() {
        return shrtSellgInd;
    }

    /**
     * Sets the value of the shrtSellgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Side5Code }
     *     
     */
    public void setShrtSellgInd(Side5Code value) {
        this.shrtSellgInd = value;
    }

    /**
     * Gets the value of the otcPstTradInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the otcPstTradInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOTCPstTradInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportingWaiverType3Code }
     * 
     * 
     * @return
     *     The value of the otcPstTradInd property.
     */
    public List<ReportingWaiverType3Code> getOTCPstTradInd() {
        if (otcPstTradInd == null) {
            otcPstTradInd = new ArrayList<>();
        }
        return this.otcPstTradInd;
    }

    /**
     * Gets the value of the rskRdcgTx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRskRdcgTx() {
        return rskRdcgTx;
    }

    /**
     * Sets the value of the rskRdcgTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRskRdcgTx(Boolean value) {
        this.rskRdcgTx = value;
    }

    /**
     * Gets the value of the sctiesFincgTxInd property.
     * 
     */
    public boolean isSctiesFincgTxInd() {
        return sctiesFincgTxInd;
    }

    /**
     * Sets the value of the sctiesFincgTxInd property.
     * 
     */
    public void setSctiesFincgTxInd(boolean value) {
        this.sctiesFincgTxInd = value;
    }

}
