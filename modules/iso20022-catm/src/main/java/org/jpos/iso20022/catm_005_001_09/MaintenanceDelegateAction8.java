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

package org.jpos.iso20022.catm_005_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintenanceDelegateAction8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MaintenanceDelegateAction8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrdcActn" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="TMRmotAccs" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}NetworkParameters7" minOccurs="0"/>
 *         <element name="TMSPrtcol" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max35Text" minOccurs="0"/>
 *         <element name="TMSPrtcolVrsn" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max35Text" minOccurs="0"/>
 *         <element name="DataSetId" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}DataSetIdentification10" minOccurs="0"/>
 *         <element name="ReTry" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}ProcessRetry3" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max3000Binary" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Actn" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TMSAction11" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceDelegateAction8", propOrder = {
    "prdcActn",
    "tmRmotAccs",
    "tmsPrtcol",
    "tmsPrtcolVrsn",
    "dataSetId",
    "reTry",
    "addtlInf",
    "actn"
})
public class MaintenanceDelegateAction8 {

    @XmlElement(name = "PrdcActn")
    protected Boolean prdcActn;
    @XmlElement(name = "TMRmotAccs")
    protected NetworkParameters7 tmRmotAccs;
    @XmlElement(name = "TMSPrtcol")
    protected String tmsPrtcol;
    @XmlElement(name = "TMSPrtcolVrsn")
    protected String tmsPrtcolVrsn;
    @XmlElement(name = "DataSetId")
    protected DataSetIdentification10 dataSetId;
    @XmlElement(name = "ReTry")
    protected ProcessRetry3 reTry;
    @XmlElement(name = "AddtlInf")
    protected List<byte[]> addtlInf;
    @XmlElement(name = "Actn")
    protected List<TMSAction11> actn;

    /**
     * Gets the value of the prdcActn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrdcActn() {
        return prdcActn;
    }

    /**
     * Sets the value of the prdcActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrdcActn(Boolean value) {
        this.prdcActn = value;
    }

    /**
     * Gets the value of the tmRmotAccs property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkParameters7 }
     *     
     */
    public NetworkParameters7 getTMRmotAccs() {
        return tmRmotAccs;
    }

    /**
     * Sets the value of the tmRmotAccs property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters7 }
     *     
     */
    public void setTMRmotAccs(NetworkParameters7 value) {
        this.tmRmotAccs = value;
    }

    /**
     * Gets the value of the tmsPrtcol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMSPrtcol() {
        return tmsPrtcol;
    }

    /**
     * Sets the value of the tmsPrtcol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMSPrtcol(String value) {
        this.tmsPrtcol = value;
    }

    /**
     * Gets the value of the tmsPrtcolVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMSPrtcolVrsn() {
        return tmsPrtcolVrsn;
    }

    /**
     * Sets the value of the tmsPrtcolVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMSPrtcolVrsn(String value) {
        this.tmsPrtcolVrsn = value;
    }

    /**
     * Gets the value of the dataSetId property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentification10 }
     *     
     */
    public DataSetIdentification10 getDataSetId() {
        return dataSetId;
    }

    /**
     * Sets the value of the dataSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentification10 }
     *     
     */
    public void setDataSetId(DataSetIdentification10 value) {
        this.dataSetId = value;
    }

    /**
     * Gets the value of the reTry property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessRetry3 }
     *     
     */
    public ProcessRetry3 getReTry() {
        return reTry;
    }

    /**
     * Sets the value of the reTry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessRetry3 }
     *     
     */
    public void setReTry(ProcessRetry3 value) {
        this.reTry = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<byte[]> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

    /**
     * Gets the value of the actn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the actn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMSAction11 }
     * 
     * 
     * @return
     *     The value of the actn property.
     */
    public List<TMSAction11> getActn() {
        if (actn == null) {
            actn = new ArrayList<>();
        }
        return this.actn;
    }

}
