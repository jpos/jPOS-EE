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

package org.jpos.iso20022.setr_029_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentificationReference8Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IdentificationReference8Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="InstgPtyTxId" type="{urn:iso:std:iso:20022:tech:xsd:setr.029.001.02}Max35Text"/>
 *         <element name="ExctgPtyTxId" type="{urn:iso:std:iso:20022:tech:xsd:setr.029.001.02}Max35Text"/>
 *         <element name="MktInfrstrctrTxId" type="{urn:iso:std:iso:20022:tech:xsd:setr.029.001.02}Max35Text"/>
 *         <element name="ClntOrdrLkId" type="{urn:iso:std:iso:20022:tech:xsd:setr.029.001.02}Max35Text"/>
 *         <element name="PoolId" type="{urn:iso:std:iso:20022:tech:xsd:setr.029.001.02}Max35Text"/>
 *         <element name="BlckId" type="{urn:iso:std:iso:20022:tech:xsd:setr.029.001.02}Max35Text"/>
 *         <element name="AllcnId" type="{urn:iso:std:iso:20022:tech:xsd:setr.029.001.02}Max35Text"/>
 *         <element name="IndvAllcnId" type="{urn:iso:std:iso:20022:tech:xsd:setr.029.001.02}Max35Text"/>
 *         <element name="ScndryAllcnId" type="{urn:iso:std:iso:20022:tech:xsd:setr.029.001.02}Max35Text"/>
 *         <element name="IndxId" type="{urn:iso:std:iso:20022:tech:xsd:setr.029.001.02}Max35Text"/>
 *         <element name="CmonId" type="{urn:iso:std:iso:20022:tech:xsd:setr.029.001.02}Max35Text"/>
 *         <element name="CmplcId" type="{urn:iso:std:iso:20022:tech:xsd:setr.029.001.02}Max35Text"/>
 *         <element name="CollTxId" type="{urn:iso:std:iso:20022:tech:xsd:setr.029.001.02}Max35Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationReference8Choice", propOrder = {
    "instgPtyTxId",
    "exctgPtyTxId",
    "mktInfrstrctrTxId",
    "clntOrdrLkId",
    "poolId",
    "blckId",
    "allcnId",
    "indvAllcnId",
    "scndryAllcnId",
    "indxId",
    "cmonId",
    "cmplcId",
    "collTxId"
})
public class IdentificationReference8Choice {

    @XmlElement(name = "InstgPtyTxId")
    protected String instgPtyTxId;
    @XmlElement(name = "ExctgPtyTxId")
    protected String exctgPtyTxId;
    @XmlElement(name = "MktInfrstrctrTxId")
    protected String mktInfrstrctrTxId;
    @XmlElement(name = "ClntOrdrLkId")
    protected String clntOrdrLkId;
    @XmlElement(name = "PoolId")
    protected String poolId;
    @XmlElement(name = "BlckId")
    protected String blckId;
    @XmlElement(name = "AllcnId")
    protected String allcnId;
    @XmlElement(name = "IndvAllcnId")
    protected String indvAllcnId;
    @XmlElement(name = "ScndryAllcnId")
    protected String scndryAllcnId;
    @XmlElement(name = "IndxId")
    protected String indxId;
    @XmlElement(name = "CmonId")
    protected String cmonId;
    @XmlElement(name = "CmplcId")
    protected String cmplcId;
    @XmlElement(name = "CollTxId")
    protected String collTxId;

    /**
     * Gets the value of the instgPtyTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstgPtyTxId() {
        return instgPtyTxId;
    }

    /**
     * Sets the value of the instgPtyTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstgPtyTxId(String value) {
        this.instgPtyTxId = value;
    }

    /**
     * Gets the value of the exctgPtyTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExctgPtyTxId() {
        return exctgPtyTxId;
    }

    /**
     * Sets the value of the exctgPtyTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExctgPtyTxId(String value) {
        this.exctgPtyTxId = value;
    }

    /**
     * Gets the value of the mktInfrstrctrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktInfrstrctrTxId() {
        return mktInfrstrctrTxId;
    }

    /**
     * Sets the value of the mktInfrstrctrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktInfrstrctrTxId(String value) {
        this.mktInfrstrctrTxId = value;
    }

    /**
     * Gets the value of the clntOrdrLkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntOrdrLkId() {
        return clntOrdrLkId;
    }

    /**
     * Sets the value of the clntOrdrLkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntOrdrLkId(String value) {
        this.clntOrdrLkId = value;
    }

    /**
     * Gets the value of the poolId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolId() {
        return poolId;
    }

    /**
     * Sets the value of the poolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolId(String value) {
        this.poolId = value;
    }

    /**
     * Gets the value of the blckId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlckId() {
        return blckId;
    }

    /**
     * Sets the value of the blckId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlckId(String value) {
        this.blckId = value;
    }

    /**
     * Gets the value of the allcnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllcnId() {
        return allcnId;
    }

    /**
     * Sets the value of the allcnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllcnId(String value) {
        this.allcnId = value;
    }

    /**
     * Gets the value of the indvAllcnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndvAllcnId() {
        return indvAllcnId;
    }

    /**
     * Sets the value of the indvAllcnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndvAllcnId(String value) {
        this.indvAllcnId = value;
    }

    /**
     * Gets the value of the scndryAllcnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndryAllcnId() {
        return scndryAllcnId;
    }

    /**
     * Sets the value of the scndryAllcnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScndryAllcnId(String value) {
        this.scndryAllcnId = value;
    }

    /**
     * Gets the value of the indxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndxId() {
        return indxId;
    }

    /**
     * Sets the value of the indxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndxId(String value) {
        this.indxId = value;
    }

    /**
     * Gets the value of the cmonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonId() {
        return cmonId;
    }

    /**
     * Sets the value of the cmonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmonId(String value) {
        this.cmonId = value;
    }

    /**
     * Gets the value of the cmplcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmplcId() {
        return cmplcId;
    }

    /**
     * Sets the value of the cmplcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmplcId(String value) {
        this.cmplcId = value;
    }

    /**
     * Gets the value of the collTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollTxId() {
        return collTxId;
    }

    /**
     * Sets the value of the collTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollTxId(String value) {
        this.collTxId = value;
    }

}
