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

package org.jpos.iso20022.sese_027_001_07;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for References44Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="References44Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="OthrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.027.001.07}GenericDocumentIdentification4"/>
 *         <element name="SctiesFincgTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.027.001.07}SettlementTypeAndIdentification18"/>
 *         <element name="SctiesSttlmTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.027.001.07}SettlementTypeAndIdentification18"/>
 *         <element name="IntraPosMvmntId" type="{urn:iso:std:iso:20022:tech:xsd:sese.027.001.07}Max35Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "References44Choice", propOrder = {
    "othrTxId",
    "sctiesFincgTxId",
    "sctiesSttlmTxId",
    "intraPosMvmntId"
})
public class References44Choice {

    @XmlElement(name = "OthrTxId")
    protected GenericDocumentIdentification4 othrTxId;
    @XmlElement(name = "SctiesFincgTxId")
    protected SettlementTypeAndIdentification18 sctiesFincgTxId;
    @XmlElement(name = "SctiesSttlmTxId")
    protected SettlementTypeAndIdentification18 sctiesSttlmTxId;
    @XmlElement(name = "IntraPosMvmntId")
    protected String intraPosMvmntId;

    /**
     * Gets the value of the othrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericDocumentIdentification4 }
     *     
     */
    public GenericDocumentIdentification4 getOthrTxId() {
        return othrTxId;
    }

    /**
     * Sets the value of the othrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericDocumentIdentification4 }
     *     
     */
    public void setOthrTxId(GenericDocumentIdentification4 value) {
        this.othrTxId = value;
    }

    /**
     * Gets the value of the sctiesFincgTxId property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification18 }
     *     
     */
    public SettlementTypeAndIdentification18 getSctiesFincgTxId() {
        return sctiesFincgTxId;
    }

    /**
     * Sets the value of the sctiesFincgTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification18 }
     *     
     */
    public void setSctiesFincgTxId(SettlementTypeAndIdentification18 value) {
        this.sctiesFincgTxId = value;
    }

    /**
     * Gets the value of the sctiesSttlmTxId property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification18 }
     *     
     */
    public SettlementTypeAndIdentification18 getSctiesSttlmTxId() {
        return sctiesSttlmTxId;
    }

    /**
     * Sets the value of the sctiesSttlmTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification18 }
     *     
     */
    public void setSctiesSttlmTxId(SettlementTypeAndIdentification18 value) {
        this.sctiesSttlmTxId = value;
    }

    /**
     * Gets the value of the intraPosMvmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraPosMvmntId() {
        return intraPosMvmntId;
    }

    /**
     * Sets the value of the intraPosMvmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntraPosMvmntId(String value) {
        this.intraPosMvmntId = value;
    }

}
