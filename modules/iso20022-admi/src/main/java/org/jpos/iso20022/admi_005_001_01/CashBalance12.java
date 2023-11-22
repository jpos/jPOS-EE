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

package org.jpos.iso20022.admi_005_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashBalance12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashBalance12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:admi.005.001.01}BalanceType11Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CtrPtyTp" type="{urn:iso:std:iso:20022:tech:xsd:admi.005.001.01}BalanceCounterparty1Code"/>
 *         <element name="CtrPtyId" type="{urn:iso:std:iso:20022:tech:xsd:admi.005.001.01}BranchAndFinancialInstitutionIdentification6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:admi.005.001.01}DateAndDateTimeSearch4Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrcgDt" type="{urn:iso:std:iso:20022:tech:xsd:admi.005.001.01}DateAndDateTimeSearch4Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashBalance12", propOrder = {
    "tp",
    "ctrPtyTp",
    "ctrPtyId",
    "valDt",
    "prcgDt"
})
public class CashBalance12 {

    @XmlElement(name = "Tp")
    protected List<BalanceType11Choice> tp;
    @XmlElement(name = "CtrPtyTp", required = true)
    @XmlSchemaType(name = "string")
    protected BalanceCounterparty1Code ctrPtyTp;
    @XmlElement(name = "CtrPtyId")
    protected List<BranchAndFinancialInstitutionIdentification6> ctrPtyId;
    @XmlElement(name = "ValDt")
    protected List<DateAndDateTimeSearch4Choice> valDt;
    @XmlElement(name = "PrcgDt")
    protected DateAndDateTimeSearch4Choice prcgDt;

    /**
     * Gets the value of the tp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceType11Choice }
     * 
     * 
     * @return
     *     The value of the tp property.
     */
    public List<BalanceType11Choice> getTp() {
        if (tp == null) {
            tp = new ArrayList<>();
        }
        return this.tp;
    }

    /**
     * Gets the value of the ctrPtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceCounterparty1Code }
     *     
     */
    public BalanceCounterparty1Code getCtrPtyTp() {
        return ctrPtyTp;
    }

    /**
     * Sets the value of the ctrPtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceCounterparty1Code }
     *     
     */
    public void setCtrPtyTp(BalanceCounterparty1Code value) {
        this.ctrPtyTp = value;
    }

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctrPtyId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrPtyId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BranchAndFinancialInstitutionIdentification6 }
     * 
     * 
     * @return
     *     The value of the ctrPtyId property.
     */
    public List<BranchAndFinancialInstitutionIdentification6> getCtrPtyId() {
        if (ctrPtyId == null) {
            ctrPtyId = new ArrayList<>();
        }
        return this.ctrPtyId;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the valDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateAndDateTimeSearch4Choice }
     * 
     * 
     * @return
     *     The value of the valDt property.
     */
    public List<DateAndDateTimeSearch4Choice> getValDt() {
        if (valDt == null) {
            valDt = new ArrayList<>();
        }
        return this.valDt;
    }

    /**
     * Gets the value of the prcgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch4Choice }
     *     
     */
    public DateAndDateTimeSearch4Choice getPrcgDt() {
        return prcgDt;
    }

    /**
     * Sets the value of the prcgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch4Choice }
     *     
     */
    public void setPrcgDt(DateAndDateTimeSearch4Choice value) {
        this.prcgDt = value;
    }

}
