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

package org.jpos.iso20022.acmt_003_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountSelection3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountSelection3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max35Text"/>
 *         <element name="OthrAcctSelctnData" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}InvestmentAccount76"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSelection3Choice", propOrder = {
    "acctId",
    "othrAcctSelctnData"
})
public class AccountSelection3Choice {

    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "OthrAcctSelctnData")
    protected InvestmentAccount76 othrAcctSelctnData;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the othrAcctSelctnData property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount76 }
     *     
     */
    public InvestmentAccount76 getOthrAcctSelctnData() {
        return othrAcctSelctnData;
    }

    /**
     * Sets the value of the othrAcctSelctnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount76 }
     *     
     */
    public void setOthrAcctSelctnData(InvestmentAccount76 value) {
        this.othrAcctSelctnData = value;
    }

}
