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

package org.jpos.iso20022.auth_021_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisteredContract13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RegisteredContract13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrctRegnAmdmntId" type="{urn:iso:std:iso:20022:tech:xsd:auth.021.001.03}Max35Text"/>
 *         <element name="RptgPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.021.001.03}TradeParty5"/>
 *         <element name="RegnAgt" type="{urn:iso:std:iso:20022:tech:xsd:auth.021.001.03}BranchAndFinancialInstitutionIdentification6"/>
 *         <element name="RegdCtrctAmdmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.021.001.03}RegisteredContract14" maxOccurs="unbounded"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.021.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisteredContract13", propOrder = {
    "ctrctRegnAmdmntId",
    "rptgPty",
    "regnAgt",
    "regdCtrctAmdmnt",
    "splmtryData"
})
public class RegisteredContract13 {

    @XmlElement(name = "CtrctRegnAmdmntId", required = true)
    protected String ctrctRegnAmdmntId;
    @XmlElement(name = "RptgPty", required = true)
    protected TradeParty5 rptgPty;
    @XmlElement(name = "RegnAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification6 regnAgt;
    @XmlElement(name = "RegdCtrctAmdmnt", required = true)
    protected List<RegisteredContract14> regdCtrctAmdmnt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the ctrctRegnAmdmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrctRegnAmdmntId() {
        return ctrctRegnAmdmntId;
    }

    /**
     * Sets the value of the ctrctRegnAmdmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrctRegnAmdmntId(String value) {
        this.ctrctRegnAmdmntId = value;
    }

    /**
     * Gets the value of the rptgPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty5 }
     *     
     */
    public TradeParty5 getRptgPty() {
        return rptgPty;
    }

    /**
     * Sets the value of the rptgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty5 }
     *     
     */
    public void setRptgPty(TradeParty5 value) {
        this.rptgPty = value;
    }

    /**
     * Gets the value of the regnAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getRegnAgt() {
        return regnAgt;
    }

    /**
     * Sets the value of the regnAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setRegnAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.regnAgt = value;
    }

    /**
     * Gets the value of the regdCtrctAmdmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the regdCtrctAmdmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegdCtrctAmdmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisteredContract14 }
     * 
     * 
     * @return
     *     The value of the regdCtrctAmdmnt property.
     */
    public List<RegisteredContract14> getRegdCtrctAmdmnt() {
        if (regdCtrctAmdmnt == null) {
            regdCtrctAmdmnt = new ArrayList<>();
        }
        return this.regdCtrctAmdmnt;
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
