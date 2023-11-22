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

package org.jpos.iso20022.canm_002_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkManagementResponse2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NetworkManagementResponse2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Cntxt" type="{urn:iso:std:iso:20022:tech:xsd:canm.002.001.03}Context17" minOccurs="0"/>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:canm.002.001.03}Transaction134"/>
 *         <element name="PrcgRslt" type="{urn:iso:std:iso:20022:tech:xsd:canm.002.001.03}ProcessingResult9"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:canm.002.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkManagementResponse2", propOrder = {
    "cntxt",
    "tx",
    "prcgRslt",
    "splmtryData"
})
public class NetworkManagementResponse2 {

    @XmlElement(name = "Cntxt")
    protected Context17 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected Transaction134 tx;
    @XmlElement(name = "PrcgRslt", required = true)
    protected ProcessingResult9 prcgRslt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

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
     *     {@link Transaction134 }
     *     
     */
    public Transaction134 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction134 }
     *     
     */
    public void setTx(Transaction134 value) {
        this.tx = value;
    }

    /**
     * Gets the value of the prcgRslt property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingResult9 }
     *     
     */
    public ProcessingResult9 getPrcgRslt() {
        return prcgRslt;
    }

    /**
     * Sets the value of the prcgRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingResult9 }
     *     
     */
    public void setPrcgRslt(ProcessingResult9 value) {
        this.prcgRslt = value;
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
