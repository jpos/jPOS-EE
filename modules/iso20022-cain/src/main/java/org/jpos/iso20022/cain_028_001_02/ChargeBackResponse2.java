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

package org.jpos.iso20022.cain_028_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeBackResponse2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ChargeBackResponse2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Environment29"/>
 *         <element name="Cntxt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Context16"/>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Transaction154"/>
 *         <element name="PrcgRslt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}ProcessingResult15"/>
 *         <element name="PrtctdData" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}ProtectedData1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeBackResponse2", propOrder = {
    "envt",
    "cntxt",
    "tx",
    "prcgRslt",
    "prtctdData",
    "splmtryData"
})
public class ChargeBackResponse2 {

    @XmlElement(name = "Envt", required = true)
    protected Environment29 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected Context16 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected Transaction154 tx;
    @XmlElement(name = "PrcgRslt", required = true)
    protected ProcessingResult15 prcgRslt;
    @XmlElement(name = "PrtctdData")
    protected List<ProtectedData1> prtctdData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link Environment29 }
     *     
     */
    public Environment29 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Environment29 }
     *     
     */
    public void setEnvt(Environment29 value) {
        this.envt = value;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link Context16 }
     *     
     */
    public Context16 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context16 }
     *     
     */
    public void setCntxt(Context16 value) {
        this.cntxt = value;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link Transaction154 }
     *     
     */
    public Transaction154 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction154 }
     *     
     */
    public void setTx(Transaction154 value) {
        this.tx = value;
    }

    /**
     * Gets the value of the prcgRslt property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingResult15 }
     *     
     */
    public ProcessingResult15 getPrcgRslt() {
        return prcgRslt;
    }

    /**
     * Sets the value of the prcgRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingResult15 }
     *     
     */
    public void setPrcgRslt(ProcessingResult15 value) {
        this.prcgRslt = value;
    }

    /**
     * Gets the value of the prtctdData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtctdData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtctdData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProtectedData1 }
     * 
     * 
     * @return
     *     The value of the prtctdData property.
     */
    public List<ProtectedData1> getPrtctdData() {
        if (prtctdData == null) {
            prtctdData = new ArrayList<>();
        }
        return this.prtctdData;
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
