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

package org.jpos.iso20022.semt_006_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubAccountIdentification36 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SubAccountIdentification36">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:swift:xsd:semt.006.001.03}AccountIdentificationFormatChoice"/>
 *         <element name="ActvtyInd" type="{urn:swift:xsd:semt.006.001.03}YesNoIndicator"/>
 *         <element name="TxOnSubAcct" type="{urn:swift:xsd:semt.006.001.03}InvestmentFundTransactionsByFund3" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubAccountIdentification36", propOrder = {
    "id",
    "actvtyInd",
    "txOnSubAcct"
})
public class SubAccountIdentification36 {

    @XmlElement(name = "Id", required = true)
    protected AccountIdentificationFormatChoice id;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;
    @XmlElement(name = "TxOnSubAcct")
    protected List<InvestmentFundTransactionsByFund3> txOnSubAcct;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationFormatChoice }
     *     
     */
    public AccountIdentificationFormatChoice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationFormatChoice }
     *     
     */
    public void setId(AccountIdentificationFormatChoice value) {
        this.id = value;
    }

    /**
     * Gets the value of the actvtyInd property.
     * 
     */
    public boolean isActvtyInd() {
        return actvtyInd;
    }

    /**
     * Sets the value of the actvtyInd property.
     * 
     */
    public void setActvtyInd(boolean value) {
        this.actvtyInd = value;
    }

    /**
     * Gets the value of the txOnSubAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txOnSubAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxOnSubAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentFundTransactionsByFund3 }
     * 
     * 
     * @return
     *     The value of the txOnSubAcct property.
     */
    public List<InvestmentFundTransactionsByFund3> getTxOnSubAcct() {
        if (txOnSubAcct == null) {
            txOnSubAcct = new ArrayList<>();
        }
        return this.txOnSubAcct;
    }

}
