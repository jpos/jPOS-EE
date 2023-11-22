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

package org.jpos.iso20022.auth_029_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DerivativesTradeReportQueryV04 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DerivativesTradeReportQueryV04">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RqstngAuthrty" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}PartyIdentification121Choice"/>
 *         <element name="TradQryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}TradeReportQuery17Choice"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativesTradeReportQueryV04", propOrder = {
    "rqstngAuthrty",
    "tradQryData",
    "splmtryData"
})
public class DerivativesTradeReportQueryV04 {

    @XmlElement(name = "RqstngAuthrty", required = true)
    protected PartyIdentification121Choice rqstngAuthrty;
    @XmlElement(name = "TradQryData", required = true)
    protected TradeReportQuery17Choice tradQryData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rqstngAuthrty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification121Choice }
     *     
     */
    public PartyIdentification121Choice getRqstngAuthrty() {
        return rqstngAuthrty;
    }

    /**
     * Sets the value of the rqstngAuthrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification121Choice }
     *     
     */
    public void setRqstngAuthrty(PartyIdentification121Choice value) {
        this.rqstngAuthrty = value;
    }

    /**
     * Gets the value of the tradQryData property.
     * 
     * @return
     *     possible object is
     *     {@link TradeReportQuery17Choice }
     *     
     */
    public TradeReportQuery17Choice getTradQryData() {
        return tradQryData;
    }

    /**
     * Sets the value of the tradQryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeReportQuery17Choice }
     *     
     */
    public void setTradQryData(TradeReportQuery17Choice value) {
        this.tradQryData = value;
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
