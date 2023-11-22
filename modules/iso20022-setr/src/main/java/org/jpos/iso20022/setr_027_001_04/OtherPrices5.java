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

package org.jpos.iso20022.setr_027_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherPrices5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OtherPrices5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Max" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14" minOccurs="0"/>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14" minOccurs="0"/>
 *         <element name="MktBrkrComssn" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14" minOccurs="0"/>
 *         <element name="MrkdUp" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14" minOccurs="0"/>
 *         <element name="MrkdDwn" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14" minOccurs="0"/>
 *         <element name="NetDscld" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14" minOccurs="0"/>
 *         <element name="NetUdscld" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14" minOccurs="0"/>
 *         <element name="NtnlGrss" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14" minOccurs="0"/>
 *         <element name="BchmkWghtdAvrg" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14" minOccurs="0"/>
 *         <element name="AllMktsWghtdAvrg" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14" minOccurs="0"/>
 *         <element name="Bchmk" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14" minOccurs="0"/>
 *         <element name="OthrPric" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14" minOccurs="0"/>
 *         <element name="IndxPric" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14" minOccurs="0"/>
 *         <element name="RptdPric" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14" minOccurs="0"/>
 *         <element name="RefPric" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}PriceInformation28" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherPrices5", propOrder = {
    "max",
    "tx",
    "mktBrkrComssn",
    "mrkdUp",
    "mrkdDwn",
    "netDscld",
    "netUdscld",
    "ntnlGrss",
    "bchmkWghtdAvrg",
    "allMktsWghtdAvrg",
    "bchmk",
    "othrPric",
    "indxPric",
    "rptdPric",
    "refPric"
})
public class OtherPrices5 {

    @XmlElement(name = "Max")
    protected Price14 max;
    @XmlElement(name = "Tx")
    protected Price14 tx;
    @XmlElement(name = "MktBrkrComssn")
    protected Price14 mktBrkrComssn;
    @XmlElement(name = "MrkdUp")
    protected Price14 mrkdUp;
    @XmlElement(name = "MrkdDwn")
    protected Price14 mrkdDwn;
    @XmlElement(name = "NetDscld")
    protected Price14 netDscld;
    @XmlElement(name = "NetUdscld")
    protected Price14 netUdscld;
    @XmlElement(name = "NtnlGrss")
    protected Price14 ntnlGrss;
    @XmlElement(name = "BchmkWghtdAvrg")
    protected Price14 bchmkWghtdAvrg;
    @XmlElement(name = "AllMktsWghtdAvrg")
    protected Price14 allMktsWghtdAvrg;
    @XmlElement(name = "Bchmk")
    protected Price14 bchmk;
    @XmlElement(name = "OthrPric")
    protected Price14 othrPric;
    @XmlElement(name = "IndxPric")
    protected Price14 indxPric;
    @XmlElement(name = "RptdPric")
    protected Price14 rptdPric;
    @XmlElement(name = "RefPric")
    protected PriceInformation28 refPric;

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setMax(Price14 value) {
        this.max = value;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setTx(Price14 value) {
        this.tx = value;
    }

    /**
     * Gets the value of the mktBrkrComssn property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getMktBrkrComssn() {
        return mktBrkrComssn;
    }

    /**
     * Sets the value of the mktBrkrComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setMktBrkrComssn(Price14 value) {
        this.mktBrkrComssn = value;
    }

    /**
     * Gets the value of the mrkdUp property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getMrkdUp() {
        return mrkdUp;
    }

    /**
     * Sets the value of the mrkdUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setMrkdUp(Price14 value) {
        this.mrkdUp = value;
    }

    /**
     * Gets the value of the mrkdDwn property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getMrkdDwn() {
        return mrkdDwn;
    }

    /**
     * Sets the value of the mrkdDwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setMrkdDwn(Price14 value) {
        this.mrkdDwn = value;
    }

    /**
     * Gets the value of the netDscld property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getNetDscld() {
        return netDscld;
    }

    /**
     * Sets the value of the netDscld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setNetDscld(Price14 value) {
        this.netDscld = value;
    }

    /**
     * Gets the value of the netUdscld property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getNetUdscld() {
        return netUdscld;
    }

    /**
     * Sets the value of the netUdscld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setNetUdscld(Price14 value) {
        this.netUdscld = value;
    }

    /**
     * Gets the value of the ntnlGrss property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getNtnlGrss() {
        return ntnlGrss;
    }

    /**
     * Sets the value of the ntnlGrss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setNtnlGrss(Price14 value) {
        this.ntnlGrss = value;
    }

    /**
     * Gets the value of the bchmkWghtdAvrg property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getBchmkWghtdAvrg() {
        return bchmkWghtdAvrg;
    }

    /**
     * Sets the value of the bchmkWghtdAvrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setBchmkWghtdAvrg(Price14 value) {
        this.bchmkWghtdAvrg = value;
    }

    /**
     * Gets the value of the allMktsWghtdAvrg property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getAllMktsWghtdAvrg() {
        return allMktsWghtdAvrg;
    }

    /**
     * Sets the value of the allMktsWghtdAvrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setAllMktsWghtdAvrg(Price14 value) {
        this.allMktsWghtdAvrg = value;
    }

    /**
     * Gets the value of the bchmk property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getBchmk() {
        return bchmk;
    }

    /**
     * Sets the value of the bchmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setBchmk(Price14 value) {
        this.bchmk = value;
    }

    /**
     * Gets the value of the othrPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getOthrPric() {
        return othrPric;
    }

    /**
     * Sets the value of the othrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setOthrPric(Price14 value) {
        this.othrPric = value;
    }

    /**
     * Gets the value of the indxPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getIndxPric() {
        return indxPric;
    }

    /**
     * Sets the value of the indxPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setIndxPric(Price14 value) {
        this.indxPric = value;
    }

    /**
     * Gets the value of the rptdPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getRptdPric() {
        return rptdPric;
    }

    /**
     * Sets the value of the rptdPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setRptdPric(Price14 value) {
        this.rptdPric = value;
    }

    /**
     * Gets the value of the refPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceInformation28 }
     *     
     */
    public PriceInformation28 getRefPric() {
        return refPric;
    }

    /**
     * Sets the value of the refPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInformation28 }
     *     
     */
    public void setRefPric(PriceInformation28 value) {
        this.refPric = value;
    }

}
