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

package org.jpos.iso20022.auth_091_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationStatisticsPerCounterparty3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReconciliationStatisticsPerCounterparty3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RefDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}ISODate"/>
 *         <element name="RcncltnCtgrs" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}ReportingRequirement2Choice"/>
 *         <element name="TtlNbOfTxs" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}Number" minOccurs="0"/>
 *         <element name="TxDtls" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}ReconciliationCounterpartyPairStatistics6" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationStatisticsPerCounterparty3", propOrder = {
    "refDt",
    "rcncltnCtgrs",
    "ttlNbOfTxs",
    "txDtls"
})
public class ReconciliationStatisticsPerCounterparty3 {

    @XmlElement(name = "RefDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar refDt;
    @XmlElement(name = "RcncltnCtgrs", required = true)
    protected ReportingRequirement2Choice rcncltnCtgrs;
    @XmlElement(name = "TtlNbOfTxs")
    protected BigDecimal ttlNbOfTxs;
    @XmlElement(name = "TxDtls")
    protected List<ReconciliationCounterpartyPairStatistics6> txDtls;

    /**
     * Gets the value of the refDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefDt() {
        return refDt;
    }

    /**
     * Sets the value of the refDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefDt(XMLGregorianCalendar value) {
        this.refDt = value;
    }

    /**
     * Gets the value of the rcncltnCtgrs property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingRequirement2Choice }
     *     
     */
    public ReportingRequirement2Choice getRcncltnCtgrs() {
        return rcncltnCtgrs;
    }

    /**
     * Sets the value of the rcncltnCtgrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingRequirement2Choice }
     *     
     */
    public void setRcncltnCtgrs(ReportingRequirement2Choice value) {
        this.rcncltnCtgrs = value;
    }

    /**
     * Gets the value of the ttlNbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfTxs() {
        return ttlNbOfTxs;
    }

    /**
     * Sets the value of the ttlNbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNbOfTxs(BigDecimal value) {
        this.ttlNbOfTxs = value;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReconciliationCounterpartyPairStatistics6 }
     * 
     * 
     * @return
     *     The value of the txDtls property.
     */
    public List<ReconciliationCounterpartyPairStatistics6> getTxDtls() {
        if (txDtls == null) {
            txDtls = new ArrayList<>();
        }
        return this.txDtls;
    }

}
