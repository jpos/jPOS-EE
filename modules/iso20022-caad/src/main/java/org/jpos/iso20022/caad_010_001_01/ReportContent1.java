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

package org.jpos.iso20022.caad_010_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportContent1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportContent1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptLineSeq" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max10NumericText" minOccurs="0"/>
 *         <element name="FrmtdCntt" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}ReportContent1Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportContent1", propOrder = {
    "rptLineSeq",
    "frmtdCntt"
})
public class ReportContent1 {

    @XmlElement(name = "RptLineSeq")
    protected String rptLineSeq;
    @XmlElement(name = "FrmtdCntt", required = true)
    protected ReportContent1Choice frmtdCntt;

    /**
     * Gets the value of the rptLineSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptLineSeq() {
        return rptLineSeq;
    }

    /**
     * Sets the value of the rptLineSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptLineSeq(String value) {
        this.rptLineSeq = value;
    }

    /**
     * Gets the value of the frmtdCntt property.
     * 
     * @return
     *     possible object is
     *     {@link ReportContent1Choice }
     *     
     */
    public ReportContent1Choice getFrmtdCntt() {
        return frmtdCntt;
    }

    /**
     * Sets the value of the frmtdCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportContent1Choice }
     *     
     */
    public void setFrmtdCntt(ReportContent1Choice value) {
        this.frmtdCntt = value;
    }

}
