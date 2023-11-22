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

package org.jpos.iso20022.caad_008_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemporaryServices2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TemporaryServices2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrctgCpny" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}TemporaryServicesCompany2" minOccurs="0"/>
 *         <element name="TempMplyee" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}PartyIdentification210" minOccurs="0"/>
 *         <element name="Job" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}TemporaryServicesJob1" minOccurs="0"/>
 *         <element name="FlatRateInd" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="DscntAmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="SummryCmmdtyId" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Labr" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}TemporaryServicesLabor1" minOccurs="0"/>
 *         <element name="MiscExpnss" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Amount13" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SbttlAmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Tax39" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporaryServices2", propOrder = {
    "ctrctgCpny",
    "tempMplyee",
    "job",
    "flatRateInd",
    "dscntAmt",
    "summryCmmdtyId",
    "labr",
    "miscExpnss",
    "sbttlAmt",
    "tax",
    "addtlData"
})
public class TemporaryServices2 {

    @XmlElement(name = "CtrctgCpny")
    protected TemporaryServicesCompany2 ctrctgCpny;
    @XmlElement(name = "TempMplyee")
    protected PartyIdentification210 tempMplyee;
    @XmlElement(name = "Job")
    protected TemporaryServicesJob1 job;
    @XmlElement(name = "FlatRateInd")
    protected Boolean flatRateInd;
    @XmlElement(name = "DscntAmt")
    protected BigDecimal dscntAmt;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "Labr")
    protected TemporaryServicesLabor1 labr;
    @XmlElement(name = "MiscExpnss")
    protected List<Amount13> miscExpnss;
    @XmlElement(name = "SbttlAmt")
    protected BigDecimal sbttlAmt;
    @XmlElement(name = "Tax")
    protected List<Tax39> tax;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the ctrctgCpny property.
     * 
     * @return
     *     possible object is
     *     {@link TemporaryServicesCompany2 }
     *     
     */
    public TemporaryServicesCompany2 getCtrctgCpny() {
        return ctrctgCpny;
    }

    /**
     * Sets the value of the ctrctgCpny property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporaryServicesCompany2 }
     *     
     */
    public void setCtrctgCpny(TemporaryServicesCompany2 value) {
        this.ctrctgCpny = value;
    }

    /**
     * Gets the value of the tempMplyee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification210 }
     *     
     */
    public PartyIdentification210 getTempMplyee() {
        return tempMplyee;
    }

    /**
     * Sets the value of the tempMplyee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification210 }
     *     
     */
    public void setTempMplyee(PartyIdentification210 value) {
        this.tempMplyee = value;
    }

    /**
     * Gets the value of the job property.
     * 
     * @return
     *     possible object is
     *     {@link TemporaryServicesJob1 }
     *     
     */
    public TemporaryServicesJob1 getJob() {
        return job;
    }

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporaryServicesJob1 }
     *     
     */
    public void setJob(TemporaryServicesJob1 value) {
        this.job = value;
    }

    /**
     * Gets the value of the flatRateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlatRateInd() {
        return flatRateInd;
    }

    /**
     * Sets the value of the flatRateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlatRateInd(Boolean value) {
        this.flatRateInd = value;
    }

    /**
     * Gets the value of the dscntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDscntAmt() {
        return dscntAmt;
    }

    /**
     * Sets the value of the dscntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDscntAmt(BigDecimal value) {
        this.dscntAmt = value;
    }

    /**
     * Gets the value of the summryCmmdtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummryCmmdtyId() {
        return summryCmmdtyId;
    }

    /**
     * Sets the value of the summryCmmdtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
    }

    /**
     * Gets the value of the labr property.
     * 
     * @return
     *     possible object is
     *     {@link TemporaryServicesLabor1 }
     *     
     */
    public TemporaryServicesLabor1 getLabr() {
        return labr;
    }

    /**
     * Sets the value of the labr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporaryServicesLabor1 }
     *     
     */
    public void setLabr(TemporaryServicesLabor1 value) {
        this.labr = value;
    }

    /**
     * Gets the value of the miscExpnss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the miscExpnss property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiscExpnss().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amount13 }
     * 
     * 
     * @return
     *     The value of the miscExpnss property.
     */
    public List<Amount13> getMiscExpnss() {
        if (miscExpnss == null) {
            miscExpnss = new ArrayList<>();
        }
        return this.miscExpnss;
    }

    /**
     * Gets the value of the sbttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSbttlAmt() {
        return sbttlAmt;
    }

    /**
     * Sets the value of the sbttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSbttlAmt(BigDecimal value) {
        this.sbttlAmt = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax39 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax39> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlData(String value) {
        this.addtlData = value;
    }

}
