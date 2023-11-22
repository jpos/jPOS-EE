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

package org.jpos.iso20022.caaa_025_001_03;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportTransactionResponse5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportTransactionResponse5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptFullSz" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}PositiveNumber"/>
 *         <element name="BlckStart" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}PositiveNumber"/>
 *         <element name="BlckStop" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}PositiveNumber"/>
 *         <element name="TxRpt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}ServiceResponse7" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportTransactionResponse5", propOrder = {
    "rptFullSz",
    "blckStart",
    "blckStop",
    "txRpt"
})
public class ReportTransactionResponse5 {

    @XmlElement(name = "RptFullSz", required = true)
    protected BigDecimal rptFullSz;
    @XmlElement(name = "BlckStart", required = true)
    protected BigDecimal blckStart;
    @XmlElement(name = "BlckStop", required = true)
    protected BigDecimal blckStop;
    @XmlElement(name = "TxRpt")
    protected List<ServiceResponse7> txRpt;

    /**
     * Gets the value of the rptFullSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRptFullSz() {
        return rptFullSz;
    }

    /**
     * Sets the value of the rptFullSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRptFullSz(BigDecimal value) {
        this.rptFullSz = value;
    }

    /**
     * Gets the value of the blckStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBlckStart() {
        return blckStart;
    }

    /**
     * Sets the value of the blckStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBlckStart(BigDecimal value) {
        this.blckStart = value;
    }

    /**
     * Gets the value of the blckStop property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBlckStop() {
        return blckStop;
    }

    /**
     * Sets the value of the blckStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBlckStop(BigDecimal value) {
        this.blckStop = value;
    }

    /**
     * Gets the value of the txRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceResponse7 }
     * 
     * 
     * @return
     *     The value of the txRpt property.
     */
    public List<ServiceResponse7> getTxRpt() {
        if (txRpt == null) {
            txRpt = new ArrayList<>();
        }
        return this.txRpt;
    }

}
