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

package org.jpos.iso20022.semt_017_001_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementOrCorporateActionEvent31Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementOrCorporateActionEvent31Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="SctiesTxTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.001.12}SecuritiesTransactionType48Choice"/>
 *         <element name="CorpActnEvtTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.001.12}CorporateActionEventType88Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementOrCorporateActionEvent31Choice", propOrder = {
    "sctiesTxTp",
    "corpActnEvtTp"
})
public class SettlementOrCorporateActionEvent31Choice {

    @XmlElement(name = "SctiesTxTp")
    protected SecuritiesTransactionType48Choice sctiesTxTp;
    @XmlElement(name = "CorpActnEvtTp")
    protected CorporateActionEventType88Choice corpActnEvtTp;

    /**
     * Gets the value of the sctiesTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionType48Choice }
     *     
     */
    public SecuritiesTransactionType48Choice getSctiesTxTp() {
        return sctiesTxTp;
    }

    /**
     * Sets the value of the sctiesTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionType48Choice }
     *     
     */
    public void setSctiesTxTp(SecuritiesTransactionType48Choice value) {
        this.sctiesTxTp = value;
    }

    /**
     * Gets the value of the corpActnEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventType88Choice }
     *     
     */
    public CorporateActionEventType88Choice getCorpActnEvtTp() {
        return corpActnEvtTp;
    }

    /**
     * Sets the value of the corpActnEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventType88Choice }
     *     
     */
    public void setCorpActnEvtTp(CorporateActionEventType88Choice value) {
        this.corpActnEvtTp = value;
    }

}
