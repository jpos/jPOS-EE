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

package org.jpos.iso20022.seev_036_001_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionGeneralInformation162 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionGeneralInformation162">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CorpActnEvtId" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}Max35Text"/>
 *         <element name="OffclCorpActnEvtId" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}Max35Text" minOccurs="0"/>
 *         <element name="ClssActnNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}Max35Text" minOccurs="0"/>
 *         <element name="EvtTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}CorporateActionEventType87Choice"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}SecurityIdentification19"/>
 *         <element name="FrctnlQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}FinancialInstrumentQuantity33Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionGeneralInformation162", propOrder = {
    "corpActnEvtId",
    "offclCorpActnEvtId",
    "clssActnNb",
    "evtTp",
    "finInstrmId",
    "frctnlQty"
})
public class CorporateActionGeneralInformation162 {

    @XmlElement(name = "CorpActnEvtId", required = true)
    protected String corpActnEvtId;
    @XmlElement(name = "OffclCorpActnEvtId")
    protected String offclCorpActnEvtId;
    @XmlElement(name = "ClssActnNb")
    protected String clssActnNb;
    @XmlElement(name = "EvtTp", required = true)
    protected CorporateActionEventType87Choice evtTp;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "FrctnlQty")
    protected FinancialInstrumentQuantity33Choice frctnlQty;

    /**
     * Gets the value of the corpActnEvtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpActnEvtId() {
        return corpActnEvtId;
    }

    /**
     * Sets the value of the corpActnEvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpActnEvtId(String value) {
        this.corpActnEvtId = value;
    }

    /**
     * Gets the value of the offclCorpActnEvtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffclCorpActnEvtId() {
        return offclCorpActnEvtId;
    }

    /**
     * Sets the value of the offclCorpActnEvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffclCorpActnEvtId(String value) {
        this.offclCorpActnEvtId = value;
    }

    /**
     * Gets the value of the clssActnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssActnNb() {
        return clssActnNb;
    }

    /**
     * Sets the value of the clssActnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClssActnNb(String value) {
        this.clssActnNb = value;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventType87Choice }
     *     
     */
    public CorporateActionEventType87Choice getEvtTp() {
        return evtTp;
    }

    /**
     * Sets the value of the evtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventType87Choice }
     *     
     */
    public void setEvtTp(CorporateActionEventType87Choice value) {
        this.evtTp = value;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the frctnlQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public FinancialInstrumentQuantity33Choice getFrctnlQty() {
        return frctnlQty;
    }

    /**
     * Sets the value of the frctnlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public void setFrctnlQty(FinancialInstrumentQuantity33Choice value) {
        this.frctnlQty = value;
    }

}
