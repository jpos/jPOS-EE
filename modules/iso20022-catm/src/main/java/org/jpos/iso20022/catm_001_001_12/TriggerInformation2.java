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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriggerInformation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TriggerInformation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TrggrSrc" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}PartyType5Code"/>
 *         <element name="SrcId" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}Max35Text"/>
 *         <element name="TrggrTp" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}ExchangePolicy2Code"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}Max70Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggerInformation2", propOrder = {
    "trggrSrc",
    "srcId",
    "trggrTp",
    "addtlInf"
})
public class TriggerInformation2 {

    @XmlElement(name = "TrggrSrc", required = true)
    @XmlSchemaType(name = "string")
    protected PartyType5Code trggrSrc;
    @XmlElement(name = "SrcId", required = true)
    protected String srcId;
    @XmlElement(name = "TrggrTp", required = true)
    @XmlSchemaType(name = "string")
    protected ExchangePolicy2Code trggrTp;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the trggrSrc property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType5Code }
     *     
     */
    public PartyType5Code getTrggrSrc() {
        return trggrSrc;
    }

    /**
     * Sets the value of the trggrSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType5Code }
     *     
     */
    public void setTrggrSrc(PartyType5Code value) {
        this.trggrSrc = value;
    }

    /**
     * Gets the value of the srcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcId() {
        return srcId;
    }

    /**
     * Sets the value of the srcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcId(String value) {
        this.srcId = value;
    }

    /**
     * Gets the value of the trggrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangePolicy2Code }
     *     
     */
    public ExchangePolicy2Code getTrggrTp() {
        return trggrTp;
    }

    /**
     * Sets the value of the trggrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangePolicy2Code }
     *     
     */
    public void setTrggrTp(ExchangePolicy2Code value) {
        this.trggrTp = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

}
