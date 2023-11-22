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

package org.jpos.iso20022.cafr_003_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FraudDispositionInitiation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FraudDispositionInitiation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}Environment28"/>
 *         <element name="Cntxt" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}Context17" minOccurs="0"/>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}Transaction128"/>
 *         <element name="FrdDspstnSts" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}FraudDispositionStatus2"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FraudDispositionInitiation2", propOrder = {
    "envt",
    "cntxt",
    "tx",
    "frdDspstnSts",
    "splmtryData"
})
public class FraudDispositionInitiation2 {

    @XmlElement(name = "Envt", required = true)
    protected Environment28 envt;
    @XmlElement(name = "Cntxt")
    protected Context17 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected Transaction128 tx;
    @XmlElement(name = "FrdDspstnSts", required = true)
    protected FraudDispositionStatus2 frdDspstnSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link Environment28 }
     *     
     */
    public Environment28 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Environment28 }
     *     
     */
    public void setEnvt(Environment28 value) {
        this.envt = value;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link Context17 }
     *     
     */
    public Context17 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context17 }
     *     
     */
    public void setCntxt(Context17 value) {
        this.cntxt = value;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link Transaction128 }
     *     
     */
    public Transaction128 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction128 }
     *     
     */
    public void setTx(Transaction128 value) {
        this.tx = value;
    }

    /**
     * Gets the value of the frdDspstnSts property.
     * 
     * @return
     *     possible object is
     *     {@link FraudDispositionStatus2 }
     *     
     */
    public FraudDispositionStatus2 getFrdDspstnSts() {
        return frdDspstnSts;
    }

    /**
     * Sets the value of the frdDspstnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudDispositionStatus2 }
     *     
     */
    public void setFrdDspstnSts(FraudDispositionStatus2 value) {
        this.frdDspstnSts = value;
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
