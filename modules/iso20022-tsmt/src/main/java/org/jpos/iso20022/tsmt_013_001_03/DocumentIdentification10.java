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

package org.jpos.iso20022.tsmt_013_001_03;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentIdentification10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DocumentIdentification10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.013.001.03}Max35Text"/>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.013.001.03}Number"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.013.001.03}DataSetType2Code"/>
 *         <element name="Submitr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.013.001.03}BICIdentification1"/>
 *         <element name="DocIndx" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.013.001.03}Max3NumericText"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentIdentification10", propOrder = {
    "id",
    "vrsn",
    "tp",
    "submitr",
    "docIndx"
})
public class DocumentIdentification10 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Vrsn", required = true)
    protected BigDecimal vrsn;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected DataSetType2Code tp;
    @XmlElement(name = "Submitr", required = true)
    protected BICIdentification1 submitr;
    @XmlElement(name = "DocIndx", required = true)
    protected String docIndx;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVrsn(BigDecimal value) {
        this.vrsn = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetType2Code }
     *     
     */
    public DataSetType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetType2Code }
     *     
     */
    public void setTp(DataSetType2Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the submitr property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getSubmitr() {
        return submitr;
    }

    /**
     * Sets the value of the submitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public void setSubmitr(BICIdentification1 value) {
        this.submitr = value;
    }

    /**
     * Gets the value of the docIndx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocIndx() {
        return docIndx;
    }

    /**
     * Sets the value of the docIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocIndx(String value) {
        this.docIndx = value;
    }

}
