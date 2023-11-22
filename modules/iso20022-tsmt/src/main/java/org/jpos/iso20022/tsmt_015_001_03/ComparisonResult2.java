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

package org.jpos.iso20022.tsmt_015_001_03;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComparisonResult2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ComparisonResult2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ElmtSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.015.001.03}Number"/>
 *         <element name="ElmtPth" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.015.001.03}Max350Text"/>
 *         <element name="ElmtNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.015.001.03}Max35Text"/>
 *         <choice>
 *           <element name="Rplcmnt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.015.001.03}Replacement2"/>
 *           <element name="Deltn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.015.001.03}Deletion2"/>
 *           <element name="Addtn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.015.001.03}Addition2"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComparisonResult2", propOrder = {
    "elmtSeqNb",
    "elmtPth",
    "elmtNm",
    "rplcmnt",
    "deltn",
    "addtn"
})
public class ComparisonResult2 {

    @XmlElement(name = "ElmtSeqNb", required = true)
    protected BigDecimal elmtSeqNb;
    @XmlElement(name = "ElmtPth", required = true)
    protected String elmtPth;
    @XmlElement(name = "ElmtNm", required = true)
    protected String elmtNm;
    @XmlElement(name = "Rplcmnt")
    protected Replacement2 rplcmnt;
    @XmlElement(name = "Deltn")
    protected Deletion2 deltn;
    @XmlElement(name = "Addtn")
    protected Addition2 addtn;

    /**
     * Gets the value of the elmtSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getElmtSeqNb() {
        return elmtSeqNb;
    }

    /**
     * Sets the value of the elmtSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setElmtSeqNb(BigDecimal value) {
        this.elmtSeqNb = value;
    }

    /**
     * Gets the value of the elmtPth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElmtPth() {
        return elmtPth;
    }

    /**
     * Sets the value of the elmtPth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElmtPth(String value) {
        this.elmtPth = value;
    }

    /**
     * Gets the value of the elmtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElmtNm() {
        return elmtNm;
    }

    /**
     * Sets the value of the elmtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElmtNm(String value) {
        this.elmtNm = value;
    }

    /**
     * Gets the value of the rplcmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Replacement2 }
     *     
     */
    public Replacement2 getRplcmnt() {
        return rplcmnt;
    }

    /**
     * Sets the value of the rplcmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Replacement2 }
     *     
     */
    public void setRplcmnt(Replacement2 value) {
        this.rplcmnt = value;
    }

    /**
     * Gets the value of the deltn property.
     * 
     * @return
     *     possible object is
     *     {@link Deletion2 }
     *     
     */
    public Deletion2 getDeltn() {
        return deltn;
    }

    /**
     * Sets the value of the deltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Deletion2 }
     *     
     */
    public void setDeltn(Deletion2 value) {
        this.deltn = value;
    }

    /**
     * Gets the value of the addtn property.
     * 
     * @return
     *     possible object is
     *     {@link Addition2 }
     *     
     */
    public Addition2 getAddtn() {
        return addtn;
    }

    /**
     * Sets the value of the addtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Addition2 }
     *     
     */
    public void setAddtn(Addition2 value) {
        this.addtn = value;
    }

}
