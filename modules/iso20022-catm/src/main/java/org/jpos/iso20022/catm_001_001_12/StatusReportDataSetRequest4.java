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

package org.jpos.iso20022.catm_001_001_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusReportDataSetRequest4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatusReportDataSetRequest4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}DataSetIdentification10"/>
 *         <element name="SeqCntr" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}Max9NumericText" minOccurs="0"/>
 *         <element name="LastSeq" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="Cntt" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}StatusReportContent12"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusReportDataSetRequest4", propOrder = {
    "id",
    "seqCntr",
    "lastSeq",
    "cntt"
})
public class StatusReportDataSetRequest4 {

    @XmlElement(name = "Id", required = true)
    protected DataSetIdentification10 id;
    @XmlElement(name = "SeqCntr")
    protected String seqCntr;
    @XmlElement(name = "LastSeq")
    protected Boolean lastSeq;
    @XmlElement(name = "Cntt", required = true)
    protected StatusReportContent12 cntt;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentification10 }
     *     
     */
    public DataSetIdentification10 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentification10 }
     *     
     */
    public void setId(DataSetIdentification10 value) {
        this.id = value;
    }

    /**
     * Gets the value of the seqCntr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqCntr() {
        return seqCntr;
    }

    /**
     * Sets the value of the seqCntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqCntr(String value) {
        this.seqCntr = value;
    }

    /**
     * Gets the value of the lastSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastSeq() {
        return lastSeq;
    }

    /**
     * Sets the value of the lastSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastSeq(Boolean value) {
        this.lastSeq = value;
    }

    /**
     * Gets the value of the cntt property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReportContent12 }
     *     
     */
    public StatusReportContent12 getCntt() {
        return cntt;
    }

    /**
     * Sets the value of the cntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReportContent12 }
     *     
     */
    public void setCntt(StatusReportContent12 value) {
        this.cntt = value;
    }

}
