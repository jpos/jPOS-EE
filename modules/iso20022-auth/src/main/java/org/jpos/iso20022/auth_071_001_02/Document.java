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

package org.jpos.iso20022.auth_071_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Document">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctiesFincgRptgTxReusdCollDataRpt" type="{urn:iso:std:iso:20022:tech:xsd:auth.071.001.02}SecuritiesFinancingReportingTransactionReusedCollateralDataReportV02"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgRptgTxReusdCollDataRpt"
})
public class Document {

    @XmlElement(name = "SctiesFincgRptgTxReusdCollDataRpt", required = true)
    protected SecuritiesFinancingReportingTransactionReusedCollateralDataReportV02 sctiesFincgRptgTxReusdCollDataRpt;

    /**
     * Gets the value of the sctiesFincgRptgTxReusdCollDataRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingReportingTransactionReusedCollateralDataReportV02 }
     *     
     */
    public SecuritiesFinancingReportingTransactionReusedCollateralDataReportV02 getSctiesFincgRptgTxReusdCollDataRpt() {
        return sctiesFincgRptgTxReusdCollDataRpt;
    }

    /**
     * Sets the value of the sctiesFincgRptgTxReusdCollDataRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingReportingTransactionReusedCollateralDataReportV02 }
     *     
     */
    public void setSctiesFincgRptgTxReusdCollDataRpt(SecuritiesFinancingReportingTransactionReusedCollateralDataReportV02 value) {
        this.sctiesFincgRptgTxReusdCollDataRpt = value;
    }

}
