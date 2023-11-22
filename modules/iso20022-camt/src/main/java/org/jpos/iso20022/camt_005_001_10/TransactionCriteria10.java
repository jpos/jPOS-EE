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

package org.jpos.iso20022.camt_005_001_10;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionCriteria10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionCriteria10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NewQryNm" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}Max35Text" minOccurs="0"/>
 *         <element name="SchCrit" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}TransactionSearchCriteria10" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="StmtRpt" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}ReportIndicator1Code" minOccurs="0"/>
 *         <element name="RtrCrit" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}TransactionReturnCriteria5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionCriteria10", propOrder = {
    "newQryNm",
    "schCrit",
    "stmtRpt",
    "rtrCrit"
})
public class TransactionCriteria10 {

    @XmlElement(name = "NewQryNm")
    protected String newQryNm;
    @XmlElement(name = "SchCrit")
    protected List<TransactionSearchCriteria10> schCrit;
    @XmlElement(name = "StmtRpt")
    @XmlSchemaType(name = "string")
    protected ReportIndicator1Code stmtRpt;
    @XmlElement(name = "RtrCrit")
    protected TransactionReturnCriteria5 rtrCrit;

    /**
     * Gets the value of the newQryNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewQryNm() {
        return newQryNm;
    }

    /**
     * Sets the value of the newQryNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewQryNm(String value) {
        this.newQryNm = value;
    }

    /**
     * Gets the value of the schCrit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the schCrit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchCrit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionSearchCriteria10 }
     * 
     * 
     * @return
     *     The value of the schCrit property.
     */
    public List<TransactionSearchCriteria10> getSchCrit() {
        if (schCrit == null) {
            schCrit = new ArrayList<>();
        }
        return this.schCrit;
    }

    /**
     * Gets the value of the stmtRpt property.
     * 
     * @return
     *     possible object is
     *     {@link ReportIndicator1Code }
     *     
     */
    public ReportIndicator1Code getStmtRpt() {
        return stmtRpt;
    }

    /**
     * Sets the value of the stmtRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportIndicator1Code }
     *     
     */
    public void setStmtRpt(ReportIndicator1Code value) {
        this.stmtRpt = value;
    }

    /**
     * Gets the value of the rtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReturnCriteria5 }
     *     
     */
    public TransactionReturnCriteria5 getRtrCrit() {
        return rtrCrit;
    }

    /**
     * Sets the value of the rtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReturnCriteria5 }
     *     
     */
    public void setRtrCrit(TransactionReturnCriteria5 value) {
        this.rtrCrit = value;
    }

}
