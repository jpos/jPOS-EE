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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisteredContract14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RegisteredContract14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RegdCtrctAmdmntId" type="{urn:iso:std:iso:20022:tech:xsd:auth.021.001.03}Max35Text"/>
 *         <element name="OrgnlRegdCtrctId" type="{urn:iso:std:iso:20022:tech:xsd:auth.021.001.03}Max35Text"/>
 *         <element name="Prty" type="{urn:iso:std:iso:20022:tech:xsd:auth.021.001.03}Priority2Code"/>
 *         <element name="Ctrct" type="{urn:iso:std:iso:20022:tech:xsd:auth.021.001.03}UnderlyingContract3Choice"/>
 *         <element name="CtrctBal" type="{urn:iso:std:iso:20022:tech:xsd:auth.021.001.03}ContractBalance1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PmtSchdlTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.021.001.03}PaymentScheduleType2Choice" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:auth.021.001.03}Max1025Text" minOccurs="0"/>
 *         <element name="Attchmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.021.001.03}DocumentGeneralInformation5" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RegisteredContract14", propOrder = {
    "regdCtrctAmdmntId",
    "orgnlRegdCtrctId",
    "prty",
    "ctrct",
    "ctrctBal",
    "pmtSchdlTp",
    "addtlInf",
    "attchmnt",
    "splmtryData"
})
public class RegisteredContract14 {

    @XmlElement(name = "RegdCtrctAmdmntId", required = true)
    protected String regdCtrctAmdmntId;
    @XmlElement(name = "OrgnlRegdCtrctId", required = true)
    protected String orgnlRegdCtrctId;
    @XmlElement(name = "Prty", required = true)
    @XmlSchemaType(name = "string")
    protected Priority2Code prty;
    @XmlElement(name = "Ctrct", required = true)
    protected UnderlyingContract3Choice ctrct;
    @XmlElement(name = "CtrctBal")
    protected List<ContractBalance1> ctrctBal;
    @XmlElement(name = "PmtSchdlTp")
    protected PaymentScheduleType2Choice pmtSchdlTp;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "Attchmnt")
    protected List<DocumentGeneralInformation5> attchmnt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the regdCtrctAmdmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegdCtrctAmdmntId() {
        return regdCtrctAmdmntId;
    }

    /**
     * Sets the value of the regdCtrctAmdmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegdCtrctAmdmntId(String value) {
        this.regdCtrctAmdmntId = value;
    }

    /**
     * Gets the value of the orgnlRegdCtrctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlRegdCtrctId() {
        return orgnlRegdCtrctId;
    }

    /**
     * Sets the value of the orgnlRegdCtrctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlRegdCtrctId(String value) {
        this.orgnlRegdCtrctId = value;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority2Code }
     *     
     */
    public Priority2Code getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority2Code }
     *     
     */
    public void setPrty(Priority2Code value) {
        this.prty = value;
    }

    /**
     * Gets the value of the ctrct property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingContract3Choice }
     *     
     */
    public UnderlyingContract3Choice getCtrct() {
        return ctrct;
    }

    /**
     * Sets the value of the ctrct property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingContract3Choice }
     *     
     */
    public void setCtrct(UnderlyingContract3Choice value) {
        this.ctrct = value;
    }

    /**
     * Gets the value of the ctrctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctrctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractBalance1 }
     * 
     * 
     * @return
     *     The value of the ctrctBal property.
     */
    public List<ContractBalance1> getCtrctBal() {
        if (ctrctBal == null) {
            ctrctBal = new ArrayList<>();
        }
        return this.ctrctBal;
    }

    /**
     * Gets the value of the pmtSchdlTp property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentScheduleType2Choice }
     *     
     */
    public PaymentScheduleType2Choice getPmtSchdlTp() {
        return pmtSchdlTp;
    }

    /**
     * Sets the value of the pmtSchdlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentScheduleType2Choice }
     *     
     */
    public void setPmtSchdlTp(PaymentScheduleType2Choice value) {
        this.pmtSchdlTp = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

    /**
     * Gets the value of the attchmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the attchmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentGeneralInformation5 }
     * 
     * 
     * @return
     *     The value of the attchmnt property.
     */
    public List<DocumentGeneralInformation5> getAttchmnt() {
        if (attchmnt == null) {
            attchmnt = new ArrayList<>();
        }
        return this.attchmnt;
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
