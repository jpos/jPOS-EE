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

package org.jpos.iso20022.auth_084_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeData29 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeData29">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptSttstcs" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}DetailedReportStatistics5" maxOccurs="unbounded"/>
 *         <element name="TxSttstcs" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}DetailedTransactionStatistics2Choice" maxOccurs="unbounded"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeData29", propOrder = {
    "rptSttstcs",
    "txSttstcs",
    "splmtryData"
})
public class TradeData29 {

    @XmlElement(name = "RptSttstcs", required = true)
    protected List<DetailedReportStatistics5> rptSttstcs;
    @XmlElement(name = "TxSttstcs", required = true)
    protected List<DetailedTransactionStatistics2Choice> txSttstcs;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptSttstcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rptSttstcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptSttstcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedReportStatistics5 }
     * 
     * 
     * @return
     *     The value of the rptSttstcs property.
     */
    public List<DetailedReportStatistics5> getRptSttstcs() {
        if (rptSttstcs == null) {
            rptSttstcs = new ArrayList<>();
        }
        return this.rptSttstcs;
    }

    /**
     * Gets the value of the txSttstcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txSttstcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxSttstcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedTransactionStatistics2Choice }
     * 
     * 
     * @return
     *     The value of the txSttstcs property.
     */
    public List<DetailedTransactionStatistics2Choice> getTxSttstcs() {
        if (txSttstcs == null) {
            txSttstcs = new ArrayList<>();
        }
        return this.txSttstcs;
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
