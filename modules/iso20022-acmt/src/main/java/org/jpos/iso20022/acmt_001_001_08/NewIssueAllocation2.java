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

package org.jpos.iso20022.acmt_001_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewIssueAllocation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NewIssueAllocation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Rstrctd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}YesNoIndicator"/>
 *         <element name="XmptPrsnRsn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max350Text" minOccurs="0"/>
 *         <element name="DeMnms" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}DeMinimus1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewIssueAllocation2", propOrder = {
    "rstrctd",
    "xmptPrsnRsn",
    "deMnms"
})
public class NewIssueAllocation2 {

    @XmlElement(name = "Rstrctd")
    protected boolean rstrctd;
    @XmlElement(name = "XmptPrsnRsn")
    protected String xmptPrsnRsn;
    @XmlElement(name = "DeMnms")
    protected DeMinimus1Choice deMnms;

    /**
     * Gets the value of the rstrctd property.
     * 
     */
    public boolean isRstrctd() {
        return rstrctd;
    }

    /**
     * Sets the value of the rstrctd property.
     * 
     */
    public void setRstrctd(boolean value) {
        this.rstrctd = value;
    }

    /**
     * Gets the value of the xmptPrsnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmptPrsnRsn() {
        return xmptPrsnRsn;
    }

    /**
     * Sets the value of the xmptPrsnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmptPrsnRsn(String value) {
        this.xmptPrsnRsn = value;
    }

    /**
     * Gets the value of the deMnms property.
     * 
     * @return
     *     possible object is
     *     {@link DeMinimus1Choice }
     *     
     */
    public DeMinimus1Choice getDeMnms() {
        return deMnms;
    }

    /**
     * Sets the value of the deMnms property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeMinimus1Choice }
     *     
     */
    public void setDeMnms(DeMinimus1Choice value) {
        this.deMnms = value;
    }

}
