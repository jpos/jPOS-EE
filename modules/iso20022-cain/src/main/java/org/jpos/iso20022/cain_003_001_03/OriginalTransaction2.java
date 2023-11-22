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

package org.jpos.iso20022.cain_003_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginalTransaction2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OriginalTransaction2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Environment20" minOccurs="0"/>
 *         <element name="Cntxt" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Context12" minOccurs="0"/>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Transaction147" minOccurs="0"/>
 *         <element name="PrcgRslt" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}ProcessingResult10" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalTransaction2", propOrder = {
    "envt",
    "cntxt",
    "tx",
    "prcgRslt"
})
public class OriginalTransaction2 {

    @XmlElement(name = "Envt")
    protected Environment20 envt;
    @XmlElement(name = "Cntxt")
    protected Context12 cntxt;
    @XmlElement(name = "Tx")
    protected Transaction147 tx;
    @XmlElement(name = "PrcgRslt")
    protected ProcessingResult10 prcgRslt;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link Environment20 }
     *     
     */
    public Environment20 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Environment20 }
     *     
     */
    public void setEnvt(Environment20 value) {
        this.envt = value;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link Context12 }
     *     
     */
    public Context12 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context12 }
     *     
     */
    public void setCntxt(Context12 value) {
        this.cntxt = value;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link Transaction147 }
     *     
     */
    public Transaction147 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction147 }
     *     
     */
    public void setTx(Transaction147 value) {
        this.tx = value;
    }

    /**
     * Gets the value of the prcgRslt property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingResult10 }
     *     
     */
    public ProcessingResult10 getPrcgRslt() {
        return prcgRslt;
    }

    /**
     * Sets the value of the prcgRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingResult10 }
     *     
     */
    public void setPrcgRslt(ProcessingResult10 value) {
        this.prcgRslt = value;
    }

}
